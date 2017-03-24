package com.pinger.mvp.presenter.contract;

import com.pinger.mvp.base.BasePresenter;
import com.pinger.mvp.base.BaseView;
import com.pinger.mvp.model.bean.BannerBean;

import java.util.List;

/**
 * @author Pinger
 * @since 2017/3/19 0019 下午 1:07
 */
public interface MainContract {

    interface View extends BaseView{
        void showToast(String msg);

        void showContent(List<BannerBean> beanList);
    }

    interface Presenter extends BasePresenter {

        void loadData();
    }
}
