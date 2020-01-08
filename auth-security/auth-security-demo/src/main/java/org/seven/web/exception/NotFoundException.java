package org.seven.web.exception;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 捕获 404 异常
 *
 * @author Seven.Lin
 * @date 2020/1/8 21:37
 */
@RestController
public class NotFoundException extends BasicErrorController {

    public NotFoundException(ServerProperties serverProperties) {
        super(new DefaultErrorAttributes(), serverProperties.getError());
    }

    @Override
    public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "error");
        map.put("errors", new String[]{"404 Not Found"});
        map.put("content", new HashMap<String, Object>());
        return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
    }
}
