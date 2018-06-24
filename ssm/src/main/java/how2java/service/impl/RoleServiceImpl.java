package how2java.service.impl;

import how2java.mapper.RoleMapper;
import how2java.pojo.Role;
import how2java.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public Role get(int id){
        Role role = roleMapper.get(id);
        return role;
    }
}
