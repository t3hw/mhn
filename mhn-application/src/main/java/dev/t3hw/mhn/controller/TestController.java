package dev.t3hw.mhn.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    
    private static final Logger logger = LogManager.getLogger(TestController.class);
    
    @GetMapping("/mdc")
    public String testMdc() {
        // Add values to MDC
        ThreadContext.put("connector.context", "test-connector-123");
        ThreadContext.put("userId", "user-456");
        ThreadContext.put("requestId", "req-789");
        
        try {
            logger.info("Testing MDC logging with context information");
            logger.warn("This is a warning with MDC context");
            logger.error("This is an error with MDC context");
            
            return "Check your logs for MDC context!";
        } finally {
            // Always clear MDC to prevent memory leaks
            ThreadContext.clearAll();
        }
    }
}