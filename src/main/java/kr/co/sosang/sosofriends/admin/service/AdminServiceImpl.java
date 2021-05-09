package kr.co.sosang.sosofriends.admin.service;

import kr.co.sosang.sosofriends.admin.dao.AdminDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("adminservice")
public class AdminServiceImpl implements AdminService{

    @Resource(name="admindao")
    private AdminDAO adminDAO;
    }
