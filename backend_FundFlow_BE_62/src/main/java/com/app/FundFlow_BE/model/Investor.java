package com.app.FundFlow_BE.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.FundFlow_BE.model.Stage;
import com.app.FundFlow_BE.model.Startup;
import com.app.FundFlow_BE.model.FundingRound;
import com.app.FundFlow_BE.model.Founder;
import com.app.FundFlow_BE.model.Document;
import com.app.FundFlow_BE.model.Investor;
import com.app.FundFlow_BE.enums.RoundStatus;
import com.app.FundFlow_BE.enums.StageName;
import com.app.FundFlow_BE.converter.StageNameConverter;
import com.app.FundFlow_BE.converter.RoundStatusConverter;
import com.app.FundFlow_BE.converter.DurationConverter;
import com.app.FundFlow_BE.converter.UUIDToByteConverter;
import com.app.FundFlow_BE.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Investor")
@Table(name = "\"Investor\"", schema =  "\"fundflow_be\"")
@Data
                        
public class Investor {
	public Investor () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"InvestorId\"", nullable = true )
  private Integer investorId;
	  
  @Column(name = "\"Name\"", nullable = true )
  private String name;
  
	  
  @Column(name = "\"ContactNumber\"", nullable = true )
  private String contactNumber;
  
	  
  @Column(name = "\"PortfolioSize\"", nullable = true )
  private String portfolioSize;
  
	  
	
@Column(name = "\"InvestmentPreferences\"")
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(schema = "\"fundflow_be\"", name = "\"InvestorInvestmentPreferences\"",joinColumns = @JoinColumn(name = "\"InvestorId\""))
    private List<String> investmentPreferences = new ArrayList<>();
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Investor [" 
  + "InvestorId= " + investorId  + ", " 
  + "Name= " + name  + ", " 
  + "ContactNumber= " + contactNumber  + ", " 
  + "PortfolioSize= " + portfolioSize  + ", " 
  + "InvestmentPreferences= " + investmentPreferences 
 + "]";
	}
	
}