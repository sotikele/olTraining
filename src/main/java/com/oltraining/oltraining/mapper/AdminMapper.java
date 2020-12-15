package com.oltraining.oltraining.mapper;

import com.oltraining.oltraining.dto.AdminDTO;
import com.oltraining.oltraining.model.Admin;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AdminMapper {

    Admin adminDTOToAdmin(AdminDTO adminDTO);
    AdminDTO adminToAdminDTO(Admin admin);
}
