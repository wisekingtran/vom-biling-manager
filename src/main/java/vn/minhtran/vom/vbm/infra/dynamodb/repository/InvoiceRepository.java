/*
 * Class: InvoiceRepository
 *
 * Created on Nov 13, 2020
 *
 * (c) Copyright Swiss Post Solutions Ltd, unpublished work
 * All use, disclosure, and/or reproduction of this material is prohibited
 * unless authorized in writing.  All Rights Reserved.
 * Rights in this program belong to:
 * Swiss Post Solution.
 * Floor 4-5-8, ICT Tower, Quang Trung Software City
 */
package vn.minhtran.vom.vbm.infra.dynamodb.repository;

import org.socialsignin.spring.data.dynamodb.repository.DynamoDBCrudRepository;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.stereotype.Repository;

import vn.minhtran.vom.vbm.infra.dynamodb.entity.InvoiceEntity;

@EnableScan
@Repository("dynamoDBInvoiceRepository")
public interface InvoiceRepository
        extends DynamoDBCrudRepository<InvoiceEntity, String> {
    
    InvoiceEntity findOneByName(String name);
    
}
