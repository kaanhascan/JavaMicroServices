package com.project.Java.Order.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class OrderRequest {

    private List<OrderLineItemsDto> orderLineItemsDtoList = new ArrayList<>();


}
