package shanyao.simpleapp.fragment.main;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import shanyao.simpleapp.R;
import shanyao.simpleapp.fragment.BaseFragment;
import shanyao.simpleapp.utils.ConstantUtils;
import shanyao.simpleapp.utils.StartUtils;

/**
 * Created by zs on 2016/5/9.
 */
public class MainFragment extends BaseFragment {

    @Bind(R.id.home_oc_image)
    ImageView homeOcImage;
    @Bind(R.id.home_operation_center)
    RelativeLayout homeOperationCenter;
    @Bind(R.id.home_cc_image)
    ImageView homeCcImage;
    @Bind(R.id.home_consume_center)
    RelativeLayout homeConsumeCenter;
    @Bind(R.id.home_mc_image)
    ImageView homeMcImage;
    @Bind(R.id.home_manager_center)
    RelativeLayout homeManagerCenter;
    @Bind(R.id.home_dc_image)
    ImageView homeDcImage;
    @Bind(R.id.home_data_center)
    RelativeLayout homeDataCenter;

    @Override
    protected View getSuccessView() {
        View view = View.inflate(getActivity(), R.layout.fragment_home, null);
        ButterKnife.bind(this, view);
        setListener();
        return view;
    }

    private void setListener() {
        homeOperationCenter.setOnClickListener(this);
        homeConsumeCenter.setOnClickListener(this);
        homeManagerCenter.setOnClickListener(this);
        homeDataCenter.setOnClickListener(this);
    }

    @Override
    protected Object requestData() {
        return ConstantUtils.STATE_SUCCESSED;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void onClick(View v) {
        Log.e("ybf2019","[onClice] view  id = "+v.getId());
        StartUtils.startActivityById(getActivity(),v.getId());
    }
}
