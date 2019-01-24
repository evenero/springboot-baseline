package com.ucmed.api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ucmed.model.bean.User;
import com.ucmed.model.service.UserService;
import com.ucmed.model.utils.Constants;

import net.sf.json.JSONObject;

@Component
public class UserRegistApi {
	@Autowired
	private UserService userService;
	
	public JSONObject execute(JSONObject params) {
		JSONObject res = new JSONObject();
		String resultCode = Constants.ERROR_CODE_FAIL; //成功代码
		String resultInfo = "";
		String userName = params.optString("phone");
		String realName = params.optString("real_name");
		String password = params.optString("password");
		User user = new User();
		user.setLoginName(userName);
		user.setRealName(realName);
		user.setLoginPassword(password);
		int r = userService.insertSelective(user);
		if(r>0) {
			resultCode = Constants.ERROR_CODE_SUCCESS;
			resultInfo = Constants.SUCCESS_INFO_USER_REGIST;
		}
		res.put(Constants.EXEC_RESULT_CODE, resultCode);
		res.put(Constants.EXEC_RESULT_INFO, resultInfo);
		return res;
	}
}
