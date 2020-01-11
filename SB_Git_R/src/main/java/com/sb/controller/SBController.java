package com.sb.controller;

import java.util.ArrayList;
import java.util.List;

import org.mapstruct.factory.Mappers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.dto.SBPayment;
import com.sb.dto.SBPrice;
import com.sb.dto.SBTransaction;
import com.sb.entity.SBPaymentEntity;
import com.sb.mapper.SBDataMapper;

@RestController
public class SBController {
	
	private  SBDataMapper SBDataMapper = Mappers.getMapper(SBDataMapper.class);
	
	@GetMapping("/myStatus")
	public ResponseEntity<SBPaymentEntity> myStatus(){
		SBPayment dto = new SBPayment();
		dto.setSbPaymentName("sbPaymentName");
		dto.setSbPaymentId("sbPaymentId");
		
		SBPrice sbPrice = new SBPrice();
		sbPrice.setSbPriceName("sbPriceName");
		sbPrice.setSbPriceId("sbPriceId");
		
		SBTransaction sbTransaction = new SBTransaction();
		sbTransaction.setSbTransactionName("sbTransactionName");
		List<SBTransaction> sbTransactionList = new ArrayList<>();
		sbTransactionList.add(sbTransaction);
		sbPrice.setSbTransactionList(sbTransactionList);
		
		List<SBPrice> sbPriceList = new ArrayList<>();
		sbPriceList.add(sbPrice);
		dto.setSbPriceList(sbPriceList);
		
		SBPaymentEntity sbPaymentEntity = SBDataMapper.dtoToEntity(dto);
		
		return new ResponseEntity<>(sbPaymentEntity,HttpStatus.OK);
	}

}
