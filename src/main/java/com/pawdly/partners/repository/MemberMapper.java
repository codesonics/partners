package com.pawdly.partners.repository;

import com.pawdly.partners.model.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    Member selectMemberById(String id);
}
