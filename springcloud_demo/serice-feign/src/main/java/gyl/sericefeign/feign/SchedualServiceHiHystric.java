package gyl.sericefeign.feign;

import org.springframework.stereotype.Component;

/**
 * @program: springcloud_demo
 * @description: SchedualServiceHi接口实现类
 * @author: gyl
 * @create: 2020-04-13 22:18
 **/
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{
    /**
     * 调用服务接口方法
     *
     * @param name
     * @return
     */
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name+",服务已关闭";
    }
}
