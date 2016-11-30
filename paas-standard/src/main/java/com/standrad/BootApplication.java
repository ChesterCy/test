package com.standrad;

import java.util.concurrent.CountDownLatch;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({ "classpath*:/META-INF/spring/*" })
@MapperScan("com.standrad.mapper")
public class BootApplication {
	private static Log logger = LogFactory.getLog(BootApplication.class);

	public static void main(String[] args) {
		try {
			logger.info("项目开始启动");
			ApplicationContext boot = new SpringApplicationBuilder()
					.sources(BootApplication.class).web(false).run(args);
			logger.info("项目启动完毕");
			CountDownLatch closeLatch = boot.getBean(CountDownLatch.class);
			closeLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/***
	 * 由于使用了非常纯粹的starter，而且Dubbo的网络框架也是非阻塞的，所以我们还需使用一些方法，保持主线程的阻塞状态。
	 * 比如我使用CountDownLatch来做这件事
	 * 
	 * @return
	 */
	@Bean
	public CountDownLatch closeLatch() {
		return new CountDownLatch(1);
	}
}
