package cn.bjhcg.gmall.service;


import cn.bjhcg.gmall.bean.UmsMember;
import cn.bjhcg.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
