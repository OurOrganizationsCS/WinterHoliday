package com.spore.winterholiday.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.spore.winterholiday.R;
import com.spore.winterholiday.fragment.FindFragment;
import com.spore.winterholiday.fragment.MeFragment;
import com.spore.winterholiday.fragment.NewsFragment;
import com.spore.winterholiday.fragment.ViodeFragment;

public class MainActivity extends AppCompatActivity {

	private FragmentTabHost mFragmentTabHost;

	private int[] imgs = {
			R.drawable.main_tab_news,R.drawable.main_tab_media,
			R.drawable.main_tab_discover,R.drawable.main_tab_mine
	};
	private String[] titles = {
			"新闻","视听","发现","我的"
	};

	private Class[] clazzs = {
			NewsFragment.class, ViodeFragment.class,
			FindFragment.class, MeFragment.class
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		mFragmentTabHost = (FragmentTabHost) findViewById(R.id.fragmentTabHost);
		//需要替换布局
		mFragmentTabHost.setup(this,getSupportFragmentManager(),R.id.frameLayout);

		for (int i = 0; i < imgs.length; i++) {
			TabHost.TabSpec spec = mFragmentTabHost.newTabSpec(titles[i]).setIndicator(getView(i));
			mFragmentTabHost.addTab(spec,clazzs[i],null);
		}
		//去掉FragmentTabHost分割线
		mFragmentTabHost.getTabWidget().setDividerDrawable(R.color.transparent);
	}

	private View getView(int i) {
		View view = View.inflate(this,R.layout.tab_host_indicator,null);
		TextView tv_title = (TextView) view.findViewById(R.id.tabhost_title);
		ImageView img = (ImageView) view.findViewById(R.id.img);
		tv_title.setText(titles[i]);
		img.setImageResource(imgs[i]);
		return view;
	}

}
