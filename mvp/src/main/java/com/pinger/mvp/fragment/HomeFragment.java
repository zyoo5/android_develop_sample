package com.pinger.mvp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.pinger.mvp.MVPApplication;
import com.pinger.mvp.base.BaseFragment;
import com.pinger.mvp.dagger.component.DaggerHomeComponent;
import com.pinger.mvp.dagger.module.HomeModule;
import com.pinger.mvp.model.bean.BannerBean;
import com.pinger.mvp.presenter.MainPresenter;
import com.pinger.mvp.presenter.contract.MainContract;

import java.util.List;

import javax.inject.Inject;

/**
 * @author Pinger
 * @since 2017/3/19 0019 下午 1:12
 */
public class HomeFragment extends BaseFragment implements MainContract.View {

    @Inject
    public MainPresenter mPresenter;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DaggerHomeComponent
                .builder()
                .appComponent(((MVPApplication) getActivity().getApplication()).getAppComponent())
                .homeModule(new HomeModule(this))
                .build()
                .inject(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public boolean isActive() {
        return isAdded();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showContent(List<BannerBean> beanList) {
        Toast.makeText(getActivity(), beanList.get(0).title, Toast.LENGTH_SHORT).show();
    }
}
