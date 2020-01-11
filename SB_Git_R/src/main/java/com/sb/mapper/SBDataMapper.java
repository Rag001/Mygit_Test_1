package com.sb.mapper;

import org.mapstruct.Mapper;

import com.sb.dto.SBPayment;
import com.sb.entity.SBPaymentEntity;

@Mapper
public interface SBDataMapper {
	
	
	SBPaymentEntity dtoToEntity(SBPayment dto);

}
