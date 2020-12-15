package com.oltraining.oltraining.mapper;

import com.oltraining.oltraining.dto.CompanyDTO;
import com.oltraining.oltraining.model.Company;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CompanyMapper {

    Company companyDTOToCompany(CompanyDTO companyDTO);
    CompanyDTO companyToCompanyDTO(Company company);
}
