package com.lubo.demo.user;

import com.lubo.demo.VO.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author wangyifan
 * @Create 2019/10/22 10:14 AM
 */
@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/user/{id}")
    public UserVO findUserById(@PathVariable Integer id) {
        logger.info("id: {}", id);

        if (id != null && id < 1) {
            throw new IllegalArgumentException("id < 1");
        } else {
            return new UserVO(id, "name" + id);
        }
    }

}
