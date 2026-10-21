import{L as e,z as t,ar as i,a8 as a,a9 as s,b0 as r,au as n,bd as o,ab as c,aa as l,ap as d,as as p,at as h,aJ as u,a as m,an as b,bx as g,ak as v,h as y,V as f,av as S,i as k,aw as _,b6 as $,S as x,ag as I,af as C,j as E,r as A,o as T,f as q,g as L,bf as w,ac as O,ad as D,aI as P,bk as M,cC as N,bU as R,A as V,cD as B,E as F}from"./952f98a9.js";import"./7f3d7ca9.js";import{C as U}from"./216055dc.js";import"./a2b15c7c.js";import"./62eefc6e.js";import"./25ca3c7f.js";import{B as j}from"./a83e7741.js";class G extends e{static get is(){return"bbva-manager-oc-metasegura"}static get properties(){return{customerInfo:{type:Object},customerId:{type:String},email:{type:String},address:{type:String},unmasked:{type:Boolean},addressUnobfuscated:{type:String},offerId:{type:String},financialOverview:{type:Object},deviceId:{type:Object},tsec:{type:Object},paymentOptions:{type:Array},paymentSelected:{type:{}},productId:{type:String},planId:{type:String},tradeId:{type:String},coverageTerms:{type:Object},coverageAmounts:{type:Object},deathCoverageId:{type:String},survivorCoverageId:{type:String},exchangeRate:{type:Object},questionnaireAnswers:{type:Array},savingsGoal:{type:Number},term:{type:Number},amountLimits:{type:Array},termLimits:{type:Array},multipleOf:{type:Number},configInsuredAmounts:{type:Object},paymentFrequency:{type:String},quotationId:{type:String},quotation:{type:Object},lastRequest:{type:Object},lastPayload:{type:Object},executiveCode:{type:String},catalogId:{type:String},allianceId:{type:String},reviewId:{type:String},beneficiaryList:{type:Array},country:{type:String},contributions:{type:Object},bdProductId:{type:String},bdSubproductId:{type:String},documentList:{type:Array},document:{type:String},retries:{type:Number},birthDay:{type:String},today:{type:String},age:{type:Number},number:{type:String},openScreens:{type:Array},enableTDCPayment:{type:Boolean},enabledOTPAnalytic:{type:Boolean}}}constructor(){super(),this.customerInfo={},this.customerId="",this.deviceId={},this.tsec={},this.offerId="",this.email="",this.unmasked=!0,this.address="",this.addressUnobfuscated="",this.financialOverview={},this.paymentOptions=[],this.paymentSelected={},this.productId="",this.planId="",this.tradeId="",this.deathCoverageId="",this.survivorCoverageId="",this.coverageAmounts={},this.coverageTerms={},this.exchangeRate={id:"USD",description:"American dollar",value:0},this.questionnaireAnswers=[],this.savingsGoal=0,this.term=0,this.amountLimits=[],this.termLimits=[],this.multipleOf=0,this.configInsuredAmounts={},this.paymentFrequency="MONTHLY",this.quotationId="",this.quotation={},this.lastRequest={id:"",event:"",payload:!0},this.lastPayload={},this.executiveCode="",this.catalogId="10001",this.allianceId="",this.reviewId="",this.beneficiaryList=[],this.country="México",this.contributions={},this.bdProductId="SEGUROS",this.bdSubproductId="PBMETSEG01",this.documentList=[],this.document="",this.retries=0,this.birthDay="",this.today="",this.age=0,this.number="",this.openScreens=["main"],this.enableTDCPayment=!0,this.enabledOTPAnalytic=!1}resetValues(){this._fireEvent(this,"show-spinner"),this._resetCustomerData(),this._resetOffer(),this._resetQuotation(),this._fireEvent(this,"hide-spinner"),this._fireEvent(this,"exit-offer")}getOffer(e){this._fireEvent(this,"show-spinner"),this.offerId=e.offerId,this._generateRequest("offerDetail","get-offer-detail",{"offer-id":this.offerId})}getOfferDetail(e){this.productId=e.product.id,this.planId=e.product.plans[0].id,this.allianceId=e.product.plans[0].alliance.id,this.reviewId=e.product.plans[0].review.id,this._fireEvent(this,"set-minimum-amount",e.detail.minimumAmount.amount),this.getCustomerInfo(this.customerInfo)}getTodaysDate(e){this.today=moment(e).local().format("YYYY-MM-DD"),this._fireEvent(this,"set-today-date",this.today)}getCustomerInfo(e){this.customerId=Array.isArray(e)?e[0].customerId:e.customer.customerId,this.birthDay=Array.isArray(e)?e[0].birthData.birthDate:e.customer.birthData.birthDate,this._fireEvent(this,"set-customer-id",this.customerId),this._generateRequest("email","get-customer-email")}getEmailCustomer(e){const t=e.find((e=>"EMAIL"===e.contact.contactDetailType));this.email=t.contact.address,this.email=`•${this.email.replaceAll("*","")}`,this._generateRequest("address","get-customer-address"),this._fireEvent(this,"set-email-address",this.email)}getCustomerAddress(e){if(e){let t=e.find((e=>Object.prototype.hasOwnProperty.call(e,"addressType")&&"HOME"===e.addressType.id));if(void 0===t){const[i]=e;t=i}if(this.unmasked){const e=this._getAddressElement(t.location.addressComponents,"ADMINISTRATIVE_AREA_LEVEL_1","code");this.address=`•${e}, ${this.country}`,this._fireEvent(this,"set-customer-address",this.address),0===Object.entries(this.financialOverview).length?this._generateRequest("financialOverview","request-financial-overview"):this.getPaymentOptionsData(this.financialOverview)}else this.addressUnobfuscated=this._getAddress(t),this._fireEvent(this,"set-customer-address",this.addressUnobfuscated),this._fireEvent(this,"success-sign"),this.unmasked=!0}else this._fireEvent(this,"hide-spinner"),this._fireEvent(this,"show-alert","communicationInt")}_getAddress(e){const{addressComponents:t}=e.location,i=this._toCapitalize(this._getAddressElement(t,"STREET")),a=this._getAddressElement(t,"EXTERIOR_NUMBER"),s=this._toCapitalize(this._getAddressElement(t,"COLONY")),r=this._toCapitalize(this._getAddressElement(t,"ADMINISTRATIVE_AREA_LEVEL_1"));return`${i} #${a}, Col. ${s}, CP: ${this._getAddressElement(t,"POSTAL_CODE","code")}, ${r}, ${this.country}.`}_getAddressElement(e,t,i="name"){const a=e.find((e=>e.componentTypes[0]===t));return Object.prototype.hasOwnProperty.call(a,i)?a[i]:""}requestFullCustomerAddress(){""===this.addressUnobfuscated?(this._generateRequest("fullAddress","get-customer-address",{unmasked:!0}),this.unmasked=!1):(this._fireEvent(this,"set-customer-address",this.unmasked?this.address:this.addressUnobfuscated),this.unmasked=!this.unmasked)}_checkStatusPaymentOptions(e){let t={id:"",text:"",type:"",hasStatus:!1};if("CARD"===e.productType){const i=e.detail.activations.find((e=>"ON_OFF"===e.id));i&&!i.isActive&&(t={id:"off",text:"Apagada",type:"neutral",hasStatus:!0})}return"INOPERATIVE"===e.status.id?t={id:"blocked",text:"Vencida",type:"error",hasStatus:!0}:"BLOCKED"===e.status.id?t={id:"blocked",text:"Bloqueada",type:"error",hasStatus:!0}:e.status.id.includes("PENDING")&&(t={id:"pending",text:"Pendiente",type:"",hasStatus:!0}),t}getPaymentOptionsData(e){this.financialOverview=e,this.paymentOptions.length<=0&&(this.financialOverview.data.contracts.forEach((e=>{if((this.enableTDCPayment&&"CARD"===e.productType||"ACCOUNT"===e.productType)&&e.status&&e.detail&&e.detail.specificAmounts){const t={id:e.id,alias:e.alias||e.product.name,number:`•${e.number.slice(-5)}`,status:this._checkStatusPaymentOptions(e)};"ACCOUNT"===e.productType&&this.paymentOptions.push(Object.assign(t,this._getBalance(!0,e.detail))),this.enableTDCPayment&&"CARD"===e.productType&&"DEBIT_CARD"!==e.subProductType.id&&"NORMAL_PLASTIC"===e.detail.physicalSupport.id&&this.paymentOptions.push(Object.assign(t,this._getBalance(!1,e.detail)))}})),this._fireEvent(this,"set-payment-options",this.paymentOptions)),this._fireEvent(this,"hide-spinner")}_getBalance(e,t){const i=e?"CURRENT_BALANCE":"AVAILABLE_BALANCE";let a={amount:t.specificAmounts.find((e=>e.id===i)).amounts[0],isCard:!e};return e||(a=Object.assign(a,{imageCard:t.images[0].url})),a}_resetCustomerData(){this.customerId="",this.email="",this.unmasked=!0,this.address="",this.addressUnobfuscated="",this.financialOverview={},this.paymentOptions=[],this.paymentSelected={},this.beneficiaryList=[],this.lastRequest={id:"",event:"",payload:!0},this.executiveCode="",this.retries=0,this.birthDay="",this.today="",this.age=0}_resetOffer(){this.offerId="",this.productId="",this.planId="",this.tradeId="",this.allianceId="",this.reviewId="",this.deathCoverageId="",this.survivorCoverageId="",this.exchangeRate.value=0,this.coverageAmounts={},this.coverageTerms={},this.enabledOTPAnalytic=!1}requestInsuranceProductSettings(){this._fireEvent(this,"show-spinner");const e=`${this.productId}${this.planId}`;this._generateRequest("insuranceProductSettings","request-insurance-product-settings",e)}responseInsuranceProductSettingsSuccess(e){const t=e.contractingCriteria.find((e=>"TASA_CAMBIO"===e.id));this.exchangeRate.value=parseFloat(t.criterials.find((e=>"TASA_CAMBIO"===e.description)).value),this.tradeId=e.trades[0].id;const i=e.trades[0].coverages.find((e=>"FALLECIMIENTO"===e.description));this.deathCoverageId=i.id,this.coverageTerms=i.coverageTypes[0].details.find((e=>"PLAZO"===e.id)),this.coverageAmounts=i.coverageTypes[0].details.find((e=>"SUMA_ASEG"===e.id));const a=e.trades[0].coverages.find((e=>"SUPERVIVENCIA"===e.description));this.survivorCoverageId=a.id;const s=[],{questions:r}=e.trades[0];r.forEach((e=>{s.push({id:e.id,text:e.description})})),this._generateRequest("records","request-catalogs-records",{"catalog-id":this.catalogId,"alliance.id":this.allianceId}),this._fireEvent(this,"set-diseases-checklist",s)}_getLocalCurrencyValue(e){return parseFloat((e*this.exchangeRate.value).toFixed(2))}healthQuestionnaireAnswers(e){this._fireEvent(this,"show-spinner"),this.questionnaireAnswers=e;const t=[],i=[];this.questionnaireAnswers.forEach((e=>{"Q1_DIABETES"!==e.id&&"Q6_SINENFER"!==e.id||"002"!==e.answers[0].id?"002"===e.answers[0].id&&t.push(e):i.push(e)})),this.requestInsuranceSimulate([t.length>0?t[0]:i[0]])}requestInsuranceSimulate(e){const t={product:{id:this.productId,plan:{id:this.planId}},currency:"USD",questions:e};this._generateRequest("suggestAmounts","get-suggest-amounts",t)}_getTermRange(){const e=this.amountLimits.findIndex((e=>this.savingsGoal>=e.min&&this.savingsGoal<=e.max));return this.termLimits[e]}responseInsuranceSimulateSuccess(e){if(e){const{coverages:t,insuredAmountMultiple:i}=e,a=t[0].coverageTypes[0].insuredAmounts;let s={min:0,max:0},r=0,n=0;this.multipleOf=i.amount,a.sort(((e,t)=>e.amount>t.amount?1:e.amount<t.amount?-1:0)),a.forEach((e=>{const{amountType:t,amount:i}=e;if("MINIMUM"===t){const t={min:0,max:0};e.terms.forEach((e=>{const{termType:i,number:a}=e;"MINIMUM"===i?t.min=a:t.max=a})),this.termLimits.push(t),s.min=i,r=0===r||i<r?i:r}"MAXIMUM"===t&&(s.max=i,this.amountLimits.push(s),n=i>n?i:n,s={min:0,max:0}),"SUGGESTED"===t&&(this.savingsGoal=i,this.term=e.terms.find((e=>"SUGGESTED"===e.termType)).number)})),this.configInsuredAmounts={amounts:{min:r,max:n,suggested:{amount:this.savingsGoal,localCurrency:this._getLocalCurrencyValue(this.savingsGoal)}},terms:{...this._getTermRange(),suggested:this.term},exchangeRate:this.exchangeRate,multipleOf:this.multipleOf};const o=this._generatePayloadRequestFirstQuotation();this._generateRequest("quotation","post-insurance-quotation-request",o)}else{const e={messages:[{code:"bodyEmpty"}]};this.errorAlertHandler(e)}}responseInsuranceSimulateError(e){switch(this._fireEvent(this,"hide-spinner"),e.messages[0].code){case"offerNotProvided":this._fireEvent(this,"show-alert","healthRequirements");break;case"notHaveUpdatedData":this._fireEvent(this,"show-alert","accountLevel");break;case"noInsurable":this._fireEvent(this,"show-alert","cumulus");break;default:this._fireEvent(this,"show-alert","communicationInt")}}_getCoveragesOptionsStructure(e,t,i){return{id:e,code:t,unit:{unitType:"TEXT",value:i}}}_getCoverageConfig(e,t){const i=[],a=this.coverageAmounts.options.find((t=>t.value===e.toString())),s=this.coverageTerms.options.find((e=>e.value===t.toString()));return i.push(this._getCoveragesOptionsStructure(this.coverageAmounts.id,a.id,a.value)),i.push(this._getCoveragesOptionsStructure(this.coverageTerms.id,s.id,s.value)),[{id:this.deathCoverageId,indicators:[{id:"ASSISTANCE",isActive:!1}],coveragesOptions:i},{id:this.survivorCoverageId,indicators:[{id:"ASSISTANCE",isActive:!1}],coveragesOptions:[]}]}_calculateAge(){return this.age=moment(this.today).diff(this.birthDay,"years"),this.age}_generatePayloadRequestFirstQuotation(){return{participants:[{participantType:"HOLDER",age:this._calculateAge()}],questionnaire:{filledQuestions:this.questionnaireAnswers},product:{id:this.productId,plans:[{id:this.planId,duration:{id:"MULTIANUAL"},paymentMethods:[{period:{frequency:this.paymentFrequency}}],coverages:this._getCoverageConfig(this.savingsGoal,this.term),review:{id:this.reviewId},trade:{id:this.tradeId}}]}}}_getContributions(){const e=this.quotation.product.plans[0].paymentMethods.find((e=>"MONTHLY"===e.period.frequency)),t=this.quotation.product.plans[0].paymentMethods.find((e=>"ANNUAL"===e.period.frequency));this.contributions={monthly:{amount:e.installmentPlan.specificAmounts.find((e=>"BASE"===e.id&&"USD"===e.currency)).amount,localCurrency:e.installmentPlan.specificAmounts.find((e=>"BASE"===e.id&&"MXN"===e.currency)).amount},annual:{amount:t.installmentPlan.specificAmounts.find((e=>"TOTAL"===e.id&&"USD"===e.currency)).amount,localCurrency:t.installmentPlan.specificAmounts.find((e=>"TOTAL"===e.id&&"MXN"===e.currency)).amount}},this.configInsuredAmounts.amounts.suggested={amount:this.savingsGoal,localCurrency:this._getLocalCurrencyValue(this.savingsGoal)},Object.assign(this.contributions.monthly,this._isOptionAvailble(this.contributions.monthly)),Object.assign(this.contributions.annual,this._isOptionAvailble(this.contributions.annual)),Object.assign(this.configInsuredAmounts.amounts,{contribution:this.contributions})}_isOptionAvailble(e){const{amount:t,localCurrency:i}=e;return{isAvailable:this.paymentOptions.some((e=>"MXN"===e.amount.currency?e.amount.amount>=i:e.amount.amount>=t))}}responseFirstInsuranceQuotationSuccess(e){this.quotation=e,this.quotationId=this.quotation.id,this.number=this.quotation.number,this._getContributions(),this._fireEvent(this,"set-insured-amounts-config",this.configInsuredAmounts),this._fireEvent(this,"hide-spinner")}requestRequotationContibution(e){const{id:t,value:i}=e;if("time"===t&&(this.term=i),"amount"===t&&(this.savingsGoal=i),"both"===t){const{time:e,amount:t}=i;this.term=e,this.savingsGoal=t}const a=this._getTermRange();this.term>(null==a?void 0:a.max)&&(this.term=null==a?void 0:a.max);const s=this.savingsGoal===this.configInsuredAmounts.amounts.suggested.amount,r=this.term===this.configInsuredAmounts.terms.suggested;if((!s||!r)&&a){this.configInsuredAmounts.terms={...a,suggested:this.term},this._fireEvent(this,"show-spinner");const e=this._generatePayloadUpdateRequestQuotation();this._generateRequest("contribution","patch-insurance-quotation-request",{quotationId:this.quotationId,requestBody:e})}}_generatePayloadUpdateRequestQuotation(){const{participants:e}=this.quotation,t={filledQuestions:this.questionnaireAnswers},i=Object.assign(this.quotation.product.plans[0].duration,{number:this.term}),a=[{period:{frequency:this.paymentFrequency}}],s=this._getCoverageConfig(this.savingsGoal,this.term),r=[{id:this.planId,duration:i,paymentMethods:a,coverages:s,review:{id:this.reviewId},trade:{id:this.tradeId}}];return{participants:e,questionnaire:t,product:{id:this.productId,plans:r},...this.executiveCode?{coupon:{id:this.executiveCode}}:{}}}selectedPaymentFrequency(e){if(this.paymentFrequency===e)this._fireEvent(this,"payment-frequency-step-completed");else{this._fireEvent(this,"show-spinner"),this.paymentFrequency=e;const t=this._generatePayloadUpdateRequestQuotation();this._generateRequest("paymentFrequency","patch-insurance-quotation-request",{quotationId:this.quotationId,requestBody:t})}}registerAssistanceCode(e){this._fireEvent(this,"show-spinner"),this.executiveCode=e;const t=this._generatePayloadUpdateRequestQuotation();this._generateRequest("coupon","patch-insurance-quotation-request",{requestBody:t,quotationId:this.quotationId})}_validateAssistanceCode(){return this.quotation.product.plans[0].paymentMethods.find((e=>e.period.frequency===this.paymentFrequency)).additionalBenefits.some((e=>"DCTOCUPON"===e.id&&.01===e.unit.percentage))}removeExecutiveCode(){this._fireEvent(this,"show-spinner");const e=this._generatePayloadUpdateRequestQuotation(),{participants:t,questionnaire:i,product:a}=e;this._generateRequest("couponRemove","patch-insurance-quotation-request",{quotationId:this.quotationId,requestBody:{participants:t,questionnaire:i,product:a}})}registerBeneficiariesQuotation(){if(this._fireEvent(this,"show-spinner"),"contractingInsurance"!==this.lastRequest.id){const e={participants:this.quotation.participants};this.beneficiaryList.forEach((t=>{e.participants.push(this._mapBeneficiaryStructure(t))})),this._generateRequest("beneficiaries","patch-insurance-quotation-request",{quotationId:this.quotationId,requestBody:e})}else this.requestInsuranceHiring()}responseRequotationSuccess(e){switch(this.quotation=e,this.lastRequest.id){case"contribution":this._getContributions(),this._fireEvent(this,"update-insured-amounts-config",this.configInsuredAmounts);break;case"coupon":this._fireEvent(this,"hide-spinner"),this._validateAssistanceCode()?this._fireEvent(this,"set-executive-code-coupon",this.executiveCode):(this.executiveCode="",this._fireEvent(this,"show-alert","invalidCode"));break;case"couponRemove":this.executiveCode="",this._fireEvent(this,"remove-executive-code-coupon",this.executiveCode),this._fireEvent(this,"hide-spinner");break;case"beneficiaries":this.requestInsuranceHiring();break;case"paymentFrequency":this._getContributions(),this._fireEvent(this,"update-insured-amounts-config",this.configInsuredAmounts),this._fireEvent(this,"hide-spinner"),this._fireEvent(this,"payment-frequency-step-completed");break;default:this._fireEvent(this,"hide-spinner"),this._fireEvent(this,"show-alert","communicationInt")}}_resetQuotation(){this.questionnaireAnswers=[],this.multipleOf=0,this.amountLimits=[],this.termLimits=[],this.savingsGoal=0,this.term=0,this.configInsuredAmounts={},this.contributions={},this.quotation={},this.quotationId="",this.enabledOTPAnalytic=!1}openDatePicker(){const e={dateFormat:"yyyy-MM-dd",defaultDate:this.today,maxDate:this.today};this._fireEvent(this,"launch-date-picker",e)}addBeneficiary(e){let t;if(0===this.beneficiaryList.length)t=Object.assign(e,{percentage:100});else{let i,a=0;this.beneficiaryList.forEach(((e,t)=>{e.percentage>=a&&(a=e.percentage,i=t)})),a%2==1?(a+=1,this.beneficiaryList[i].percentage=a/2,t=Object.assign(e,{percentage:a/2-1})):(t=Object.assign(e,{percentage:a/2}),this.beneficiaryList[i].percentage=a/2)}this.beneficiaryList.push(t),this._fireEvent(this,"saved-beneficiary",this.beneficiaryList)}editBeneficiary(e){const{id:t,info:i}=e;this.beneficiaryList[t]=Object.assign(this.beneficiaryList[t],i),this._fireEvent(this,"saved-beneficiary",this.beneficiaryList)}removeBeneficiary(e){const{id:t}=e,{percentage:i}=this.beneficiaryList[t];if(this.beneficiaryList.splice(t,1),this.beneficiaryList.length>0){let e=i%this.beneficiaryList.length;const t=(i-e)/this.beneficiaryList.length;this.beneficiaryList.forEach(((i,a)=>{let s=i.percentage;s+=t,0!==e&&(s+=1,e-=1),this.beneficiaryList[a].percentage=s}))}this._fireEvent(this,"saved-beneficiary",this.beneficiaryList)}_mapBeneficiaryStructure(e){const{name:t,lastName:i,secondLastName:a,birthDay:s,relationship:r,direction:n,percentage:o}=e,c="same"===n,l="same"===n?{}:{addresses:this._mapBeneficiaryAddress(e.address)};return{participantType:"BENEFICIARY",person:{personType:"NATURAL"},beneficiaryType:{id:"PRIMARY"},firstName:t,lastName:i,secondLastName:a,benefitPercentage:o,birthData:{birthDate:s},relationship:{id:r.value},isSameHolderAddresses:c,...l}}_mapBeneficiaryAddress(e){const{street:t,outerN:i,innerN:a,zipCode:s,colony:r,municipality:n,state:o,country:c}=e;return[{addressType:{id:"HOME"},location:{addressComponent:[{code:s,name:s,componentTypes:["ZIP_CODE"]},{code:t,name:t,componentTypes:["STREET"]},{code:`${i} ${a}`,name:`${i} ${a}`,componentTypes:["EXTERIOR_NUMBER"]},{code:`${r.text}`,name:`${r.text}`,componentTypes:["NEIGHBORHOOD"]},{code:n,name:n,componentTypes:["MUNICIPALITY"]},{code:o,name:o,componentTypes:["STATE"]},{code:c,name:c,componentTypes:["COUNTRY"]}]}}]}responseCatalogRecordsSuccess(e){const t=[];e.forEach((e=>{t.push({selected:!1,value:e.id,text:this._toCapitalize("CONYUGE"===e.description?"CÓNYUGE":e.description)})})),this._fireEvent(this,"set-relationship-records-list",t),this._fireEvent(this,"hide-spinner")}registerGeographicRequest(e){this._generateRequest("geographicPlaces","get-list-places",e)}responseGeographicPlacesSuccess(e){const t=[];let i,a,s;e.forEach((e=>{const{id:r,name:n}=e;i=e.zipCode,a=this._toCapitalize(e.state.name),s=this._toCapitalize(e.geographicPlaceTypes[0].value),t.push({selected:!1,value:r,text:this._toCapitalize(n)})}));const r={zipCode:i,country:this._toCapitalize(this.country),state:a,municipality:s,colonies:t};this._fireEvent(this,"set-location-info",r),this._fireEvent(this,"hide-spinner")}_toCapitalize(e){return e.toLowerCase().split(" ").map((e=>e.charAt(0).toUpperCase()+e.slice(1))).join(" ")}requestInsuranceHiring(){const e=this.financialOverview.data.contracts.find((e=>this.paymentSelected.id===e.id)),t=[];if(this.paymentSelected.isCard){const i={number:e.number,product:{id:"CARD"}};t.push(i)}else{const i={contractId:e.number,product:{id:"ACCOUNT"}};t.push(i)}const i={offerId:this.offerId,quotationId:this.number,paymentMethod:{paymentType:"DIRECT_DEBIT",installmentFrequency:this.paymentFrequency,relatedContracts:t}};this._generateRequest("contractingInsurance","request-insurance-hiring",{body:i}),this._fireEvent(this,"hide-spinner")}responseInsuranceSuccess(e){const t=this.beneficiaryList.map((e=>{const{name:t,lastName:i,secondLastName:a,percentage:s}=e;return{name:`${t} ${i} ${a}`,percentage:s}})),i={saving:{amountTotal:{value:this.savingsGoal,currency:"USD"},contribution:{value:"MONTHLY"===this.paymentFrequency?this.configInsuredAmounts.amounts.contribution.monthly.amount:this.configInsuredAmounts.amounts.contribution.annual.amount,currency:"USD"},time:this.term},paymentMethod:{installmentFrequency:this.paymentFrequency,name:this.paymentSelected.alias,number:this.paymentSelected.number},validityPeriod:e.validityPeriod,operationDate:e.operationDate,operationNumber:e.operationNumber,policyNumber:e.policyNumber,beneficiaries:t,contactDetails:[{contact:{contactDetailType:"EMAIL",address:this.email}}]};this._fireEvent(this,"hide-spinner"),this._fireEvent(this,"successful-insurance-hiring-receipt",this._generateReceipt(i)),this._fireEvent(this,"successful-insurance-hiring",i),this._fireEvent(this,"completed-hiring-data",{event:"hiring-success",data:{operationNumber:e.operationNumber,state:"contratado"}}),this._resetCustomerData(),this._resetOffer(),this._resetQuotation()}_generateReceipt(e){return{templateSelected:"metaSeguraInsurance",operationDate:e.operationDate,goalAmount:`${this.getAmountStringFormat(e.saving.amountTotal.value)} ${e.saving.amountTotal.currency}`,term:`${e.saving.time} años`,frequency:"MONTHLY"===this.paymentFrequency?"Mensual":"Anual",contribution:"MONTHLY"===this.paymentFrequency?{monthly:`${this.getAmountStringFormat(e.saving.contribution.value)} ${e.saving.contribution.currency}`}:{annual:`${this.getAmountStringFormat(e.saving.contribution.value)} ${e.saving.contribution.currency}`},policyNumber:e.policyNumber,beneficiaries:e.beneficiaries.map((e=>`${e.name} - ${e.percentage}%`)),paymentMethod:`${e.paymentMethod.name} ${e.paymentMethod.number}`,validityPeriod:e.validityPeriod,operationNumber:e.operationNumber,email:this.email}}requestBusinessDocumetsList(){const e={tsec:this.tsec.token,deviceId:this.deviceId.value},t={"product.id":this.bdProductId,"subproduct.id":this.bdSubproductId};this._fireEvent(this,"set-business-properties",e),this._generateRequest("listDocuments","request-business-documets-list",t)}responseBusinessDocumetsListSuccess(e){e?(this.documentList=e,this.showFile(this.document)):this._fireEvent(this,"show-alert","pdfError")}showFile(e){if(this._fireEvent(this,"show-spinner"),this.document=e,this.documentList.length){const e=this.documentList.find((e=>e.documentTemplate.id===this.document)),t={tsec:this.tsec.token,deviceId:this.deviceId.value},i={documentTemplate:{id:e.id,templateType:{id:"PDF"}}};this._fireEvent(this,"set-business-properties",t),this._generateRequest("document","request-post-document",i)}else this.requestBusinessDocumetsList()}_validateBasePdf(e){const t=e;try{let e;return t!==window.atob(t)&&(e=window.atob(t)),e}catch(e){return t}}_getBase64File(e){const t=this._validateBasePdf(e);let i;const a=t.indexOf(">")+3;let s=t.indexOf("=")+3;if(s<=2){const e=t.substring(a);s=e.indexOf("-"),i=e.substring(0,s)}else i=t.substring(a,s);return i.replace(/(\r\n|\n|\r)/gm,"")}sendContentDocumentToPdfModal(e){this._fireEvent(this,"set-doct-title",this.document),this._fireEvent(this,"set-base-src",this._getBase64File(e)),this._fireEvent(this,"hide-spinner"),this._fireEvent(this,"show-document")}sendContentDocumentToPlugin(e){const t={value:this._getBase64File(e),mimeType:"application/pdf",title:this.document};this._fireEvent(this,"hide-spinner"),this._fireEvent(this,"show-document",t)}shareReceipt(e){this._fireEvent(this,"share-receipt",{value:e.receipt,mimetype:"image/jpeg"})}_generateRequest(e,t,i=!0){this.retries=0,this.lastRequest.id=e,this.lastRequest.event=t,this.lastRequest.payload=i,this._fireEvent(this,t,i)}removeScreen(e){const t=this.openScreens.filter((t=>t!==e));this.openScreens=t}containerOpened(e){this.openScreens.push(e)}containerClosed(e){return this.removeScreen(e),e}isPDFModalOpened(e){e.value?this.openScreens.push("pdfModal"):1!==this.openScreens.length&&this.removeScreen("pdfModal")}statusModalChanged(e){"open"===e?this.openScreens.push("heightModal"):this.removeScreen("heightModal")}otpOpened(){const{length:e}=this.openScreens;"tokenModal"!==this.openScreens[e-1]&&this.openScreens.push("tokenModal")}otpClosed(){this.removeScreen("tokenModal");const{length:e}=this.openScreens;"beneficiaryFormContainer"===this.openScreens[e-1]&&this._fireEvent(this,"show-add-beneficiary-form-modal")}backButtonHandler(){const{length:e}=this.openScreens;switch(this.openScreens[e-1]){case"main":this.exitOffer();break;case"pdfModal":this._fireEvent(this,"close-pdf-modal");break;case"heightModal":this._fireEvent(this,"close-height-modal");break;case"tokenModal":this._fireEvent(this,"close-token-modal");break;default:this._fireEvent(this,"close-container-modal",this.openScreens[e-1])}}exitOffer(){this.quotationId?this._fireEvent(this,"show-alert","abandonProcess"):this.resetValues()}retryLastRequest(){this._fireEvent(this,"show-spinner"),this.retries+=1;const{event:e,payload:t}=this.lastRequest;this._fireEvent(this,e,t)}errorAlertHandler(e){if(this._fireEvent(this,"hide-spinner"),this.retries<2)switch(this.lastRequest.id){case"listDocuments":case"document":this._fireEvent(this,"show-alert","pdfError");break;case"suggestAmounts":this.responseInsuranceSimulateError(e);break;case"beneficiaries":this._fireEvent(this,"show-alert","beneficiariesInfo");break;case"contractingInsurance":this._fireEvent(this,"show-alert","contracting");break;default:this._fireEvent(this,"show-alert","communicationInt")}else switch(this.lastRequest.id){case"listDocuments":case"document":this._fireEvent(this,"show-alert","threeRetriesPdf");break;default:this._fireEvent(this,"show-alert","operationNotPerformed")}}getAmountStringFormat(e){return e.toLocaleString("en-US")}activateOTPAnalytic(){this.enabledOTPAnalytic=!0}generateAnalyticOTP(){this.enabledOTPAnalytic&&"fullAddress"!==this.lastRequest.id&&this._fireEvent(this,"send-data-step",{event:"ten",data:{typeToken:"firma:token"}})}closeSpinner(){this._fireEvent(this,"hide-spinner")}_fireEvent(e,t,i){e.dispatchEvent(new CustomEvent(`metasegura-${t}`,{detail:i,bubbles:!0,composed:!0}))}}customElements.define(G.is,G);var z=t`[ambient^=light] {
  --bbva-list-simple-label-color: initial;
  --bbva-list-simple-mask-color: initial;
  --bbva-list-simple-description-color: initial;
  --bbva-list-simple-icon-color: initial;
  --bbva-list-simple-active-bg-color: initial;
  --bbva-list-simple-active-link-color: initial;
  --bbva-list-simple-link-color: initial;
  --bbva-list-simple-link-active-color: initial;
  --bbva-list-simple-skeleton-color: initial;
  --bbva-list-simple-skeleton-bg: initial;
  --bbva-list-simple-stacked-label-color: initial;
}
${(new i).mediaRules()}`;const H=new i;var Y=t`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${a(s.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${a(s.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${a(s.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${a(s.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${a(s.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${a(s.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${a(s.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${a(s.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${a(s.primaryCoreLightened)});
}
${H.mediaRules()}`;const Q={dark:t`
    ${r.dark}
    ${n.dark}
    ${o.dark}
    ${Y}
  `,light:t`
    ${r.light}
    ${n.light}
    ${o.light}
    ${z}
  `},X=new i;var W=t`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${a(s.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${a(s.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${a(s.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${a(s.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${a(s.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${a(s.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${a(s.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${a(s.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${a(s.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${a(s.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${a(s.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem));
  color: var(--_list-simple-text-color);
  user-select: none;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.sr-only {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.wrapper-description,
.wrapper-description [data-tag-name=bbva-text] {
  text-align: right;
}

dl,
dd {
  margin: 0;
}

dl {
  display: flex;
  justify-content: space-between;
}

dt,
dd {
  display: flex;
}

dt {
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-link] {
  text-align: left;
  color: var(--_list-simple-link-color);
}
[data-tag-name=bbva-link]:active {
  --_list-simple-link-color: var(--_list-simple-link-active-color);
}

.action-icons {
  display: flex;
}

button {
  height: 1.5rem;
  width: 1.5rem;
  border: none;
  padding: 0;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
  background-color: transparent;
  color: var(--_list-simple-icon-color);
}
button:active {
  --_list-simple-icon-color: var(--_list-simple-icon-active-color);
}

.wrapper-mask {
  color: var(--_list-simple-mask-color);
}
:host(:not([variant=stacked])) .wrapper-mask {
  align-self: center;
}

.label {
  color: var(--_list-simple-label-color);
}

.description {
  color: var(--_list-simple-description-color);
}

.wrapper-amount {
  overflow: initial;
}

:host([label-medium]) [data-tag-name=bbva-text].label,
:host([description-medium]) [data-tag-name=bbva-text].description,
:host([description-medium]) [data-tag-name=bbva-amount],
:host([description-medium]) .wrapper-mask {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(c.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${a(c.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${a(c.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${a(c.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${a(c.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${a(c.mediumItalic.fontStyle)});
}

:host([disabled]) [data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

.skeleton {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  pointer-events: none;
  transition: opacity 0.4s ease-in-out;
  background-repeat: no-repeat;
  opacity: 0;
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 305% 12px;
}
:host([variant=stacked]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 24px 12px, 24px 36px;
}
:host([variant=stacked-center]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_list-simple-skeleton-quote-color) 50%);
  background-color: var(--_list-simple-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((40% * 2) + (16px/ 2)) 16px;
  background-position: 90% 12px, 160% 36px;
}

:host([variant=stacked]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: space-between;
}
:host([variant=stacked]) dl {
  flex-direction: column;
}
:host([variant=stacked]) .wrapper-description,
:host([variant=stacked]) .wrapper-description [data-tag-name=bbva-text] {
  text-align: left;
}

[data-tag-name=bbva-link]:not([href])[active]:not([disabled]) {
  background-color: transparent;
}

:host([action-link]:active),
:host([description-link]:active),
:host([label-link]:active) {
  background-color: var(--_list-simple-active-bg-color);
}

:host([hide-padding-top]) {
  padding-top: 0;
}

:host([hide-padding-bottom]) {
  padding-bottom: 0;
}

:host([variant=stacked-center]) .wrapper {
  display: flex;
  align-items: center;
  justify-content: center;
}
:host([variant=stacked-center]) .wrapper [data-tag-name=bbva-link], :host([variant=stacked-center]) [data-tag-name=bbva-text],
:host([variant=stacked-center]) .wrapper-description {
  text-align: center;
}
:host([variant=stacked-center]) dl {
  flex-direction: column;
  margin: auto;
}
:host([variant=stacked-center]) dt,
:host([variant=stacked-center]) dd {
  padding: 0;
  margin: auto;
}
:host([variant=stacked-center]) .action-icons {
  position: absolute;
  right: 1rem;
}

:host([loading]) {
  pointer-events: none;
}
:host([loading]) * {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}

:host([variant^=stacked]) .label {
  color: var(--_list-simple-stacked-label-color);
}

:host([variant=stacked-center][action-icon]) dl,
:host([variant=stacked-center][action-secondary-icon]) dl {
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
}
${X.mediaRules()}`;class Z extends(d(p(h(u(m(b(e))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const e=[_,$,x,I,C];return Z.scopedElementsFromClasses(e)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,W,Q.light,Q.dark,g("button:focus"),v("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return y`
      <bbva-amount
        disabled-tabindex
        ?decimals-hidden="${this.decimalsHidden}"
        variant="m"
        .amount="${this.amount}"
        .localCurrency="${this.localCurrency}"
        .currencyCode="${this.currencyCode}"
        .language="${this.language}"
        ?symbol-right="${this.symbolRight}"
        ?show-currency-code="${this.showCurrencyCode}"
      >
      </bbva-amount>
    `}get _icon(){return y`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return y`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return y`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const e="nochange"===this.status?"no-change":this.status;return y`
      <bbva-badge-variability
        disabled-tabindex
        .status=${e}
        .color=${this.color}
      ></bbva-badge-variability>
    `}get _mask(){const e=f(this.mask,this.maskChars,!0,this.visibleChars);return y`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${e.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let e=null;return this.actionIcon||this.actionSecondaryIcon?e=this._actionIcons:this.actionLink&&(e=this._tplLink("actionLink")),e}get _definitionDescriptionTpl(){let e=null,t="";return this.description?(e=this._tplText("description"),t="description"):this.mask?(e=this._mask,t="mask"):this._isValidAmount&&(e=this._amount,t="amount"),y`
      <dd class=${S({[`wrapper-${t}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${e}
      </dd>
    `}_tplLink(e){const t="actionLink"===e?`${e}AccessibilityText`:`${e}LinkAccessibilityText`;return y`
      <bbva-link
        class=${S({ellipsis:this[`${e}Ellipsis`]})}
        aria-label="${k(this.t(this[t]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(e)}"
      >
        <span role=${k(this.roleLink)} aria-live=${k(this.arialiveLink)}>
          ${this[e]}
        </span>
      </bbva-link>
    `}_tplNoLink(e){const t=`${e}AccessibilityText`,i=`${e}TagText`,a=`${e}RoleText`,s=`${e}AriaLiveText`;return y`
      <bbva-text
        aria-label="${this.t(this[t])}"
        role="${k(this[a])}"
        aria-live="${k(this[s])}"
        class="${e}"
        unset
        size="S"
        text="${this[e]}"
        tag="${k(this[i])}"
      >
      </bbva-text>
    `}_tplText(e){return y` ${this[`${e}Link`]?this._tplLink(e):this._tplNoLink(e)} `}_iconClick(e){this.dispatchEvent(new CustomEvent(`list-simple-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(e){const t=e.replace(/[A-Z]/g,(e=>`-${e.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return y`
      <dl>
        <dt class=${S({ellipsis:this.labelEllipsis})}>
          ${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}
        </dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return y`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?y`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let e=null;const t=["stacked","stacked-center"].includes(this.variant);return e=this.label?this.description||this._isValidAmount||this.mask||t?t?this.renderStacked():this.renderDefault():this._tplText("label"):y` <div class="wrapper-description">${this._tplText("description")}</div> `,y`
      ${e}
      <div class="skeleton"></div>
    `}}L("colors.primaryCoreLightened"),L("colors.primaryCoreLightened"),L("colors.primaryCoreLightened"),L("colors.primaryCoreLightened"),L("colors.cool60"),L("colors.primaryCoreLightened"),L("colors.primarySubdued"),L("colors.primaryMediumLight"),L("colors.primarySubdued"),L("colors.primaryMediumLight"),L("colors.cool50");var J=t`
:host {
  display: block;
  box-sizing: border-box;
  --bbva-header-main-z-index: 5;
  --bbva-transition-container-padding: 0;
  --bbva-data-visualization-donut-padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  --bbva-data-visualization-donut-chart-padding: 0;
  --bbva-help-tooltip-dark-mode-invoker-background-color: var(--ambientsDark, ${a(P.dark)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

#headerOffer {
  --bbva-header-main-dark-mode-bg-color: var(--ambientsDark, ${a(P.dark)});
}

.hide-top-paddding-modal {
  --bbva-help-modal-padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}

.panel-dark {
  background-color: var(--ambientsDark, ${a(P.dark)});
  --bbva-panel-offer-microillustration-width: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}

.panel-info {
  background-color: var(--ambientsLight100, ${a(P.light100)});
  padding: 1rem;
}
.panel-info [data-tag-name=bbva-panel-offer] {
  background-color: var(--ambientsLight, ${a(P.light)});
  -webkit-box-shadow: var(--boxShadowType1, ${a(w.type1)});
  -moz-box-shadow: var(--boxShadowType1, ${a(w.type1)});
  --bbva-panel-offer-content-text-padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  box-shadow: var(--boxShadowType1, ${a(w.type1)});
}

.title-bullet {
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) 0;
}

.bullet-list {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}

.privacy-notice {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  text-align: center;
  font-size: var(--typographyType3XSmall, ${a(O.type3XSmall)});
  --bbva-text-color: var(--colorsSecondary500, ${a(s.secondary500)});
}
.privacy-notice bbva-link {
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) 0;
}

.action-buttons {
  box-sizing: border-box;
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) 0;
}
.action-buttons bbva-button-default[variant=secondary] {
  border: 0;
  margin: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) 0;
}

.footer {
  display: flex;
  justify-content: center;
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em);
  padding-left: 0;
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em);
  padding-right: 0;
}
.footer.hide-padding-top {
  padding-top: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em);
}
.footer.hide-padding-bottom {
  padding-top: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1em);
}

.section-questions {
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
.section-questions .section-title {
  --bbva-header-category-heading-color: var(--colorsSecondary500, ${a(s.secondary500)});
}
.section-questions .answer {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  --bbva-text-color: var(--colorsSecondary500, ${a(s.secondary500)});
  --bbva-text-highlight-color: var(--colorsSecondary500, ${a(s.secondary500)});
}

bbva-transition-container {
  --bbva-transition-container-text-align: start;
}
bbva-transition-container .description-text,
bbva-transition-container .checkbox-list,
bbva-transition-container bbva-list-info {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-transition-container .previous-questions,
bbva-transition-container #timeRange {
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-transition-container .input-currency-amount {
  display: flex;
  align-items: flex-start;
  margin: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-transition-container .input-currency-amount .flag {
  flex: none;
  display: flex;
  align-items: center;
  margin-right: calc(((3.75 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 16) * 1rem);
}
bbva-transition-container bbva-list-currency {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  --_icon-color: var(--ambientsLight, ${a(P.light)});
}
bbva-transition-container .input-field,
bbva-transition-container bbva-form-date,
bbva-transition-container bbva-form-search,
bbva-transition-container bbva-form-select {
  padding-bottom: 1rem;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-transition-container #addsameDirection, bbva-transition-container #addnewDirection {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-transition-container .link-direction-button {
  display: block;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) 0;
}
bbva-transition-container #directionForm {
  --bbva-list-simple-label-color: var(--colorsSecondary500, ${a(s.secondary500)});
}
bbva-transition-container #directionForm .address-data-hide {
  opacity: 0;
}
bbva-transition-container bbva-data-visualization-donut {
  display: block;
}
bbva-transition-container bbva-data-visualization-donut.amount-alert {
  --bbva-amount-color: var(--statusColorsError, ${a(M.error)});
}
bbva-transition-container .percentage-alert {
  justify-content: center;
}
bbva-transition-container .beneficiaries-percentages .percentage-input {
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}

bbva-list-info {
  --bbva-list-info-min-height: none;
  --typographyTypeSmall: var(--typographyType3XSmall, ${a(O.type3XSmall)});
  --lineHeightTypeSmall: var(--lineHeightType3XSmall, ${a(D.type3XSmall)});
}

.notification-message {
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}

.first-step {
  display: none;
}

.display-other {
  display: initial;
  width: 100%;
}

.contracting-process {
  position: absolute;
}

.margin-animation {
  --margin-animation: calc(((-5.875 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  margin-bottom: calc(var(--margin-animation) - var(--safe-area-inset-top));
}

bbva-expandable-step .internal-title {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-expandable-step .description {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-expandable-step .summary-amount,
bbva-expandable-step #savingGoalAmount {
  padding-top: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  padding-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-expandable-step .local-currency-conversion-label {
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) 0;
  font-size: 0.9375rem;
  line-height: 1.5rem;
  color: var(--colorsSecondary500, ${a(s.secondary500)});
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-expandable-step .savings-frequency-options {
  overflow-x: scroll;
}
bbva-expandable-step .savings-frequency-options,
bbva-expandable-step .beneficiary {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-expandable-step bbva-notification-help {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-expandable-step bbva-list-link-icon {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-expandable-step #beneficiaryList {
  --bbva-list-select-heading-color: var(--colorsPrimaryMedium, ${a(s.primaryMedium)});
  --bbva-list-select-icon-color: var(--colorsPrimaryMedium, ${a(s.primaryMedium)});
  --bbva-list-select-checked-icon-color: var(--colorsPrimaryMedium, ${a(s.primaryMedium)});
  --bbva-list-default-padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-expandable-step .beneficiaries-actions {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) 0;
}
bbva-expandable-step .beneficiaries-actions #addBeneficiaryButton,
bbva-expandable-step .beneficiaries-actions #editPercentageButton {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-expandable-step bbva-list-card[aria-disabled=true] {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}
bbva-expandable-step .list-files {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) 0;
}
bbva-expandable-step .list-files #contractTermsandConditions,
bbva-expandable-step .list-files #termsofPayment,
bbva-expandable-step .list-files #privacyNotices {
  padding: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-expandable-step #termsAndConditionsList .term-help {
  padding: 0;
  margin-bottom: 0;
}
bbva-expandable-step #termsAndConditionsList .terms-checks {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}

bbva-help-modal .grey-text {
  --bbva-text-color: var(--colorsSecondary500, ${a(s.secondary500)});
}
bbva-help-modal .spacing {
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-help-modal .inner-header {
  margin-top: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
bbva-help-modal bbva-list-bullet {
  text-align: initial;
  padding-right: 0;
}

#contributionSuccess {
  background-color: var(--colorsTertiaryType6Dark, ${a(s.tertiaryType6Dark)});
  padding-bottom: calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}

bbva-panel-operation {
  --bbva-clip-box-bg-dark-mode-color: var(--colorsSecondary100, ${a(s.secondary100)});
}

.contracting-information bbva-list-simple {
  text-align: center;
}

.contact-numbers .notification-message {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}

.contact-address {
  margin-top: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(l.spacer)}))) / 15) * 1em);
}
`;class K extends(m(U(e))){static get is(){return"bbva-metasegura-successful-hiring"}static get scopedElements(){const e=[R,V,Z,B,j,F,I];return K.scopedElementsFromClasses(e)}static get properties(){return{operationDate:{type:String},contribution:{type:Number},currencyCode:{type:String},localCurrency:{type:String},policyNumber:{type:String},savingGoal:{type:Number},term:{type:Number},paymentMethod:{type:Array},paymentMethodNumber:{type:String},startDate:{type:String},endDate:{type:String},operationNumber:{type:String},frequency:{type:String},beneficiaries:{type:Array},email:{type:String},phoneNumberSac:{type:String},phoneNumberClaims:{type:String},clipImage:{type:String}}}constructor(){super(),this.operationDate="",this.contribution=0,this.currencyCode="",this.localCurrency="MXN",this.policyNumber="",this.savingGoal=0,this.term=0,this.paymentMethod="",this.paymentMethodNumber="",this.startDate="",this.endDate="",this.operationNumber="",this.frequency="",this.beneficiaries=[],this.email="",this.phoneNumberSac="",this.phoneNumberClaims="",this.clipImage=""}static get styles(){return[J,N.dark,v("bbva-multistep-oc-metasegura-shared-styles")]}insuranceResponse(e){this.operationDate=e.operationDate,this.contribution=e.saving.contribution.value,this.currencyCode=e.saving.contribution.currency,this.policyNumber=e.policyNumber,this.savingGoal=e.saving.amountTotal.value,this.term=e.saving.time,this.paymentMethod=e.paymentMethod.name,this.paymentMethodNumber=e.paymentMethod.number,this.startDate=this._getLocalDateFormat(e.validityPeriod.startDate),this.endDate=this._getLocalDateFormat(e.validityPeriod.endDate),this.operationNumber=e.operationNumber,this.frequency=e.paymentMethod.installmentFrequency,this.beneficiaries=e.beneficiaries,this.email=e.contactDetails[0].contact.address}_getLocalDateFormat(e){const t=new Date(`${e}T00:00:00`),i=new Intl.DateTimeFormat("es-MX",{month:"long"}).format(t);return`${t.getDate()} ${i} ${t.getFullYear()}`}getAmountStringFormat(e){return e.toLocaleString("en-US")}_setPhoneNumberFormat(e){return"55"===e.substring(0,2)?e.replace(/(\d{2})(\d{4})(\d{4})/,"$1 $2 $3"):"800"===e.substring(0,3)?e.replace(/(\d{3})(\d{4})(\d{3})/,"$1 $2 $3"):e}_exitSuccessfulPage(e){this._fireEvent(e.target,"successful-page-exit")}render(){const e=[{icon:"coronita:share",label:this.t("metasegura-successful-share-icon-test"),id:"button-1"}],t=JSON.stringify({day:"2-digit",month:"long",year:"numeric",hour:"2-digit",minute:"2-digit"});return y`
      <bbva-panel-process
        ambient="dark" language="es-MX"
        heading="${this.t("metasegura-successful-panel-process-heading")}"
        id="contributionSuccess"
        amount="${this.contribution}"
        date="${this.operationDate}" date-format="${t}"
        text="${"MONTHLY"===this.frequency?this.t("metasegura-successful-panel-process-monthly"):this.t("metasegura-successful-panel-process-annual")}"
        currency-code="${this.currencyCode}" local-currency="${this.currencyCode}"
        description="${this.t("metasegura-panel-message")}"
        unit="${this.currencyCode}"  symbol-right
      ></bbva-panel-process>

      <bbva-panel-operation
        variant-clip-product=""
        clip-user-image="${this.clipImage}"
        label-left="Meta Segura"
      >
        <span slot="left">${this.t("metasegura-successful-police-number")} ${this.policyNumber}</span>
      </bbva-panel-operation>

      <div class="contracting-information">
        <bbva-list-simple
          id="savingGoal"
          variant="stacked-center"
          label="${this.t("metasegura-successful-goal-label")}"
          description="${this.getAmountStringFormat(this.savingGoal)} ${this.currencyCode}"
          description-medium
        ></bbva-list-simple>

        <bbva-list-simple
          id="term"
          variant="stacked-center"
          label="${this.t("metasegura-successful-goal-time-label")}"
          description="${this.term} años"
          description-medium
        ></bbva-list-simple>
        <bbva-list-simple
          id="frecuency"
          variant="stacked-center"
          label="${this.t("metasegura-successful-goal-frequency-label")}"
          description="${"MONTHLY"===this.frequency?"Mensual":"Anual"}"
          description-medium
        ></bbva-list-simple>

        ${this.beneficiaries.map((e=>y`
          <bbva-list-simple
            id="beneficiaryList"
            variant="stacked-center"
            label="${this.t("metasegura-successful-beneficiary-label")}"
            description="${e.name} - ${e.percentage}%"
            description-medium
            ></bbva-list-simple>
        `))}

        <bbva-list-simple
          id="paymentMethod"
          variant="stacked-center"
          label="${this.t("metasegura-successful-payment-option-label")}"
          description="${this.paymentMethod} ${this.paymentMethodNumber}"
          description-medium
        ></bbva-list-simple>
        <bbva-list-simple
          id="startDate"
          variant="stacked-center"
          label="${this.t("metasegura-successful-start-effect-label")}"
          description="${this.startDate}"
          description-medium
        ></bbva-list-simple>
        <bbva-list-simple
          id="endDate"
          variant="stacked-center"
          label="${this.t("metasegura-successful-end-effect-label")}"
          description="${this.endDate}"
          description-medium
        ></bbva-list-simple>
        <bbva-list-simple
          id="operationNumber"
          variant="stacked-center"
          label="${this.t("metasegura-successful-folio-operation-label")}"
          description="${this.operationNumber}"
          description-medium
          hide-padding-bottom
        ></bbva-list-simple>
        <bbva-text
          text="${this.t("metasegura-successful-bbva-label")}"
          size="S"
          tag="span"
          font-weight="500"
          alignment="center"
        ></bbva-text>
      </div>

      <div class="contact-numbers">
        <bbva-notification-message
          class="notification-message"
          icon="coronita:info"
        >
          ${this.t("metasegura-noti-message")}<br><b>${this._setPhoneNumberFormat(this.phoneNumberSac)}</b>
        </bbva-notification-message>
        <bbva-notification-message
          class="notification-message"
          icon="coronita:info"
        >
          ${this.t("metasegura-notif-message")}<br><b>${this._setPhoneNumberFormat(this.phoneNumberClaims)}</b>
        </bbva-notification-message>
      </div>

      <div class="contact-address">
        <bbva-text text="${this.t("metasegura-notification-voucher")}" size="S" alignment="center"></bbva-text>
        <bbva-text text="${this.email}" size="S" alignment="center"></bbva-text>
      </div>

      <bbva-button-row .options="${e}" aria-label="Available sections" @button-row-item-click="${e=>this._fireEvent(e.target,"generate-receipt",{operative:"metaSeguraInsurance"})}"></bbva-button-row>

      <div class="action-buttons">
        <bbva-button-default
          id="exitBtn"
          text="${this.t("metasegura-exit-label")}"
          variant="primary"
          @click="${e=>this._exitSuccessfulPage(e)}"
        ></bbva-button-default>
      </div>
    `}_fireEvent(e,t,i){e.dispatchEvent(new CustomEvent(`metasegura-${t}`,{detail:i,bubbles:!0,composed:!0}))}}export{K as B,Z as a,Q as b,J as s};
