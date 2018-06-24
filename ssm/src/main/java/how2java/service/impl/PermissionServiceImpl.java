package how2java.service.impl;


import how2java.mapper.PermissionMapper;
import how2java.pojo.Permission;
import how2java.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public Permission get(int per_id){
        Permission permission=permissionMapper.get(per_id);
        return permission;
    }
}
