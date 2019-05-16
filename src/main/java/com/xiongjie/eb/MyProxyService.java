package com.xiongjie.eb;

import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;

/**
 * 服务代理接口
 */
@ProxyGen
public interface MyProxyService {

    void sayHello(Handler<AsyncResult<String>> resultHandler);
}
