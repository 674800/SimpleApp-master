package shanyao.simpleapp.http;

import java.util.List;
import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.QueryMap;
import rx.Observable;
import shanyao.simpleapp.http.httplibrary.BaseBean;

/**
 * Created by zs on 2016/8/5.
 * 接口类的服务
 */
public class IService {
    public interface IParking{
        /**
         * 共享车位列表
         *
         * @return
         */
        @GET(URLUtils.SHARE_CARPORT1)
        Observable<BaseBean<List<ParkBean>>> getBean(@QueryMap Map<String,String> map);
    }
}
