package com.xxl.job.executor.service.jobhandler;
import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create By xzz on 2019/1/12
 */
@Component
@JobHandler(value = "xxl-job-demo")
public class XxlJobDemoHandler extends IJobHandler {
    private static Logger logger = LoggerFactory.getLogger(XxlJobDemoHandler.class);
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    public ReturnT<String> execute(String param) throws Exception {
        logger.info("demo被执行了：{}",format.format(new Date()));
        return ReturnT.SUCCESS;
    }
}
