package com.yadong.takeout.presenter.contract;

/**
 * Created by Administrator on 2017/3/13.
 */

public interface HomeContract {

    interface  View{
        void  show();
    }

    interface  Presenter{

        void getData();
    }

}
