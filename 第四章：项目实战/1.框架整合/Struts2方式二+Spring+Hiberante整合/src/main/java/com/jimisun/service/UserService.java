package com.jimisun.service;

import com.jimisun.domain.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 14:53 2018-11-19
 * @Modified By:
 */
@Transactional
public interface UserService {
    public void save(User user);

    public User get(Integer id);
}
