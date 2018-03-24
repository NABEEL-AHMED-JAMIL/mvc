package com.admaxim.mvc.mydevgeek.assemblers;

import com.admaxim.mvc.mydevgeek.domain.User;
import com.admaxim.mvc.mydevgeek.util.UserUtil;
import com.admaxim.mvc.mydevgeek.vo.CreateUserVO;
import com.admaxim.mvc.mydevgeek.vo.UpdateUserVO;
import com.admaxim.mvc.mydevgeek.vo.UserVO;
import org.springframework.stereotype.Component;

/**
 * Created by DAM on 3/1/17.
 */
@Component
public class UserAssembler {

    /**
     * CreateUserVO convert to User.
     *
     * @param createUserVO
     * @return
     */
    public User toUser(CreateUserVO createUserVO) {
        User user = new User();
        user.setFirstName(createUserVO.getFirstName());
        user.setLastName(createUserVO.getLastName());
        user.setUsername(createUserVO.getUsername());
        user.setPassword("password".toCharArray()); //ignore
        return user;
    }


    /**
     * User to UserVO.
     *
     * @param user
     * @return
     */
    public UserVO toUserVO(User user) {
        UserVO userVO = new UserVO();
        userVO.setUserId(user.getId());
        userVO.setFullName(UserUtil.convertToFullName(user.getFirstName(), user.getLastName()));
        userVO.setUsername(user.getUsername());
        return userVO;

    }

    /**
     * UpdateUserVO to user.
     *
     * @param updateUserVO
     * @return
     */
    public User toUser(UpdateUserVO updateUserVO) {
        User user = new User();
        user.setId(updateUserVO.getUserId());
        user.setFirstName(updateUserVO.getFirstName());
        user.setLastName(updateUserVO.getLastName());
        user.setUsername(updateUserVO.getUsername());
        user.setPassword("password".toCharArray()); //ignore
        return user;
    }
}
