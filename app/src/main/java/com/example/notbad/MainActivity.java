package com.example.notbad;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import java.io.OutputStreamWriter;
public class MainActivity extends AppCompatActivity {

    SectionsPageAdapter mSectionsPageAdapter;
    ViewPager mViewPager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try { OutputStreamWriter out = new OutputStreamWriter(openFileOutput("History.txt", MODE_PRIVATE));out.close(); } catch (Throwable t) { }

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Calculator(), "Calculator");
        adapter.addFragment(new StopWatch(), "Stop Watch");
        adapter.addFragment(new Converter(),"Converter");
        viewPager.setAdapter(adapter);
        viewPager.setBackgroundColor(960000);
    }
}
