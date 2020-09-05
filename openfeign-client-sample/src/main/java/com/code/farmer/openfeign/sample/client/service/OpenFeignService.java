package com.code.farmer.openfeign.sample.client.service;

import com.code.farmer.openfeign.sample.interfaces.service.IFeignService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

/**
 * 走xcloud服务调用 or 通过url直连
 */
//@FeignClient(value = "openfeign-service-sample")
@FeignClient(value = "openfeign-service-sample", url = "http://127.0.0.1:8002")
@Service
public interface OpenFeignService extends IFeignService {

}
