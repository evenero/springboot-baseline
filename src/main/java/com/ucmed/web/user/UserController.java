package com.ucmed.web.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ucmed.api.user.UserRegistApi;
import com.ucmed.model.utils.JsonUtils;

import net.sf.json.JSONObject;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserRegistApi userRegistApi;
	
	/**
	 * 跳转至用户注册页面
	 * @param request
	 * @param response
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/regist",method=RequestMethod.GET)
	public String userRegist(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		return "user/regist";
	}
	
	@ResponseBody
	@RequestMapping(value="/regist",method=RequestMethod.POST)
	public String userRegistPost(HttpServletRequest request, HttpServletResponse response, ModelMap map) {
		JSONObject params = JsonUtils.parseRequestToJsonobject(request);
		JSONObject res = userRegistApi.execute(params);
		return res.toString();
	}
}
