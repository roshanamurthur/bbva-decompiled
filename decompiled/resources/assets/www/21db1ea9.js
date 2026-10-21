import{J as t,L as e,a7 as i,eI as a,eJ as r,eK as n,eL as s,eM as o,K as c,eN as d,eO as l,eP as p,eQ as h,eR as m,z as u,ar as g,a as y,y as v,ah as _,aN as f,ai as b,ak as T,h as C,i as x,a8 as P,ac as A,a9 as E,ap as S,an as w,ag as D,F as N,b$ as k,bx as I,b1 as O,c0 as L,f as $,g as F,H as B,aX as M,v as R,u as V,cI as z,cJ as G,aD as U,b3 as j,cH as H,ab as q,aa as W,bh as Y,cF as Q,b4 as K,b5 as J,b6 as X,cD as Z,bc as tt,a_ as et,a$ as it,b0 as at,bF as rt}from"./952f98a9.js";import{c0 as nt,c1 as st,bm as ot,c2 as ct}from"./7f3d7ca9.js";import{B as dt,b as lt}from"./4d740237.js";import{B as pt,a as ht,b as mt}from"./45933d48.js";import{B as ut}from"./b3b59ab1.js";import"./216055dc.js";import"./51384888.js";class gt extends pt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`hub-payments/v${this.version}/tokens/third-party-wallets/push`)}toString(){return super.toString("BGADPHubPaymentsTokensThirdPartyWalletsPushPostV0")}}class yt extends ht{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`hub-payments/v${this.version}/tokens/third-party-wallets/google/push`)}toString(){return super.toString("BGADPHubPaymentsTokensThirdPartyWalletsGooglePushPostV1")}}class vt extends ht{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`hub-payments/v${this.version}/tokens/third-party-wallets/push`)}toString(){return super.toString("BGADPHubPaymentsTokensThirdPartyWalletsPushPostV1")}}class _t extends mt{static get is(){return"bbva-global-tokens-third-party-wallets-push-api-dm"}constructor(){super()}postTokensThirdPartyWalletsPush(t){this._generateGetService(this._getService("post",t),{customEvent:"tokens-third-party-wallets-push-api-dm-create",errorFireEventHandler:"tokens-third-party-wallets-push-api-dm-create-error"},this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}TokensThirdPartyWalletsPush`,this._getBgadp(a))}_getBgadp(t){return{postTokensThirdPartyWalletsPushV0:()=>new gt(t),postTokensThirdPartyWalletsPushV1:()=>new vt(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}class ft extends mt{static get is(){return"bbva-global-tokens-third-party-wallets-google-push-api-dm"}constructor(){super()}postTokensThirdPartyWalletsGooglePush(t){this._generateGetService(this._getService("post",t),{customEvent:"tokens-third-party-wallets-google-push-api-dm-create",errorFireEventHandler:"tokens-third-party-wallets-google-push-api-dm-create-error"},this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}TokensThirdPartyWalletsGooglePush`,this._getBgadp(a))}_getBgadp(t){return{postTokensThirdPartyWalletsGooglePushV1:()=>new yt(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}let bt=class extends(t(e)){_mappingActivationId(t){this._renameProperty(t,"activationId","id")}_mappingBrandAssociation(t){this._renameProperty(t,"brandAssociation.name","description")}_mappingCardsParams(t){this._renameProperty(t,"contractId","cardAgreement")}_mappingCardAgreement(t){this._renameProperty(t,"contractId","cardAgreement")}_mappingCardType(t){this._renameProperty(t,"cardType.name","description")}_mappingCompanyEmbossing(t){this._renameProperty(t,"companyEmbossingNameType","companyEmbossing"),this._renameProperty(t,"companyEmbossing.name","description"),t.customCompanyEmbossingName&&(t.companyEmbossing.customName=t.customCompanyEmbossingName,delete t.customCompanyEmbossingName)}_mappingDescription(t){this._renameProperty(t,"name","description")}_mappingDeliveriesManagementToV2(t){for(let e=0;e<t.length;e+=1)t[e].contactDetail&&(t[e].contactDetail.deliveryContactType="STORED"),this._renameProperty(t[e],"contactDetail","contactDetails"),t[e].serviceType&&this._renameProperty(t[e].serviceType,"name","description"),t[e].destination={id:"HOME"},t[e].address&&(t[e].address.deliveryAddressType="STORED",this._removeFields(["addressName"],t[e].address));return t}_mappingFinancingType(t){this._renameProperty(t,"financingType.name","description")}_mappingCardTransaction(t){return this._renameProperty(t,"contract.product.productType.name","description"),t}_mappingCardTransactions(t){if(t)if(Array.isArray(t))for(let e=0;e<t.length;e+=1)this._mappingCardTransaction(t[e]),this._removeFields(["classification"],t[e]);else this._mappingCardTransaction(t);return t}_mappingIndicators(t){if(t&&"0"==this.version&&Array.isArray(t))for(let e=0;e<t.length;e+=1)this._renameProperty(t[e],"indicatorId","id"),this._renameProperty(t[e],"name","description");return t}_mappingParticipants(t){if(t&&Array.isArray(t))for(let e=0;e<t.length;e+=1)this._renameProperty(t[e],"participantId","id"),this._renameProperty(t[e].participantType,"name","description");return t}_customerIdRemover(t){return"0"!=this.version&&"1"!=this.version||this._removeFields(["customerId"],t),t}_mappingPaymentMethodsV1(t){if(t&&Array.isArray(t))for(let e=0;e<t.length;e+=1)this._renameProperty(t[e],"endDate","nextPaymentDate"),this._renameProperty(t[e],"name","description"),this._renameProperty(t[e].period,"name","description"),this._renameProperty(t[e],"period","frecuency"),this._removeFields(["paymentAmounts","endDay"],t[e]);return t}_mappingPaymentMethodsV2(t){if(t&&Array.isArray(t))for(let e=0;e<t.length;e+=1)"0"==this.version&&(this._renameProperty(t[e],"endDate","nextPaymentDate"),this._renameProperty(t[e],"name","description"),this._renameProperty(t[e].period,"name","description"),this._renameProperty(t[e],"period","frequency"),this._removeFields(["paymentAmounts","endDay"],t[e])),"1"==this.version&&(this._removeFields(["contracts"],t[e]),this._renameProperty(t[e],"frecuency","frequency"));return t}_mappingOperation(t){t.operationDate&&(t.operation||(t.operation={}),t.operation.operationDate=t.operationDate,delete t.operationDate)}_mappingId(t){this._renameProperty(t,"cardId","id")}_mappingLimits(t){if(t.limits)for(let e=0;e<t.limits.length;e+=1){if(this._renameProperty(t.limits[e],"name","description"),t.limits[e].amountLimit&&(t.limits[e].amountLimits=[],t.limits[e].amountLimits[0]=t.limits[e].amountLimit,t.limits[e].amountLimits[0].isMajor=!0,delete t.limits[e].amountLimit),t.limits[e].itemizeAmountLimits){for(let i=0;i<t.limits.length;i++)t.limits[e].amountLimits[i+1]=t.limits[e].itemizeAmountLimits[i],t.limits[e].amountLimits[i+1].isMajor=!1;delete t.limits[e].itemizeAmountLimits}delete t.limits[e].percentage}}_mappingRequestLimits(t){if(t&&t.limits)for(let e=0;e<t.limits.length;e+=1){if(t.limits[e].amountLimits){if(t.limits[e].amountLimit=t.limits[e].amountLimits[0],delete t.limits[e].amountLimit.isMajor,t.limits[e].amountLimits.length>1){t.limits[e].itemizeAmountLimits=[];for(let i=1;i<t.limits[e].amountLimits.length;i++)t.limits[e].itemizeAmountLimits[i-1]=t.limits[e].amountLimits[i],delete t.limits[e].amountLimits[i].isMajor}delete t.limits[e].amountLimits}t.limits[e].description&&delete t.limits[e].description}}_mappingNumberType(t){this._renameProperty(t,"numberType.name","description")}_mappingPhysicalSupport(t){this._renameProperty(t,"physicalSupport.name","description")}_mappingItemizeRatesUnit(t){return"PERCENTAGE"===t.id||t.percentage?{unitRateType:"PERCENTAGE",percentage:t.percentage}:{unitRateType:"AMOUNT",amount:t.amount,currency:t.currency}}_mappingItemizeRates(t){const e=[];for(const i of t)e.push({rateType:i.rateType.id,description:i.rateType.name,calculationDate:"",itemizeRatesUnit:this._mappingItemizeRatesUnit(i.unit)});return e}_mappingRates(t){t.rates&&!t.rates.itemizeRates&&(t.rates={totalRates:t.rates.totalRates||{},itemizeRates:t.rates.itemizeRates||this._mappingItemizeRates(t.rates)})}_mappingStatus(t){this._renameProperty(t,"status.name","description")}_mappingTitleToProduct(t){this._renameProperty(t,"title","product")}_mappingFormat(t,e){let i={};if(i="FEE_AMOUNT"===t.outcomeType.id?{formatType:"AMOUNT",amount:{amount:t.feeAmount.amount,currency:t.feeAmount.currency}}:{formatType:"RATE",rateUnit:"PER_CENT",value:t.feePercentage},e)for(const t of e)t.factType&&"VALUE_LESSER_THAN"===t.factType.id?i.maximumAmount={amount:t.conditionAmount.amount,currency:t.conditionAmount.currency}:t.factType&&"VALUE_GREATER_THAN"===t.factType.id&&(i.minimumAmount={amount:t.conditionAmount.amount,currency:t.conditionAmount.currency});return i}_mappingConditionDate(t){const e=this._mappingConditionIdName(`${t.conditionId}_DATE`,t.name);return e.composedCondition=this._mappingComposedCondition(e.id,1),e.format={formatType:"DATE",minimumDate:t.period.startDate,maximumDate:t.period.checkDate},e}_mappingComposedCondition(t,e){return{id:`${t}_${e}`,name:t,isMultipleChoices:!0,row:e}}_mappingConditionIdName(t,e){return{id:t,description:e}}_mappingConditionsV1(t){if(t&&t.length&&t[0].outcomes){const e=[];for(const i of t){i.period&&e.push(this._mappingConditionDate(i));for(const t of i.outcomes){const a=this._mappingConditionIdName(i.conditionId,i.name);a.format=this._mappingFormat(t,i.facts),(i.outcomes.length>1||i.period)&&(a.id=`${a.id}_${a.format.formatType}`,a.composedCondition=this._mappingComposedCondition(a.id,1)),t.dueDate&&(a.dueDate=t.dueDate),e.push(a)}}t.length=0,Array.prototype.push.apply(t,e)}return t}_mappingActivationsV1(t){for(const e of t)this._mappingActivation(e);return t}_mappingActivation(t){this._mappingLimits(t),this._mappingActivationId(t),this._mappingDescription(t)}_mappingActivationsV2(t){return"1"==this.version&&Object.keys(t).length?t.forEach((t=>{this._removeFields(["limits","details"],t)})):"0"==this.version&&Object.keys(t).length&&t.forEach((t=>{this._renameProperty(t,"activationId","id"),this._renameProperty(t,"name","description"),this._removeFields(["limits","details"],t)})),t}_mappingFeesItemizeFees(t){const e=[];for(const i of t)e.push({feeType:i.type.id,description:i.type.name,itemizeFeeUnit:this._mappingFeesItemizeFeesUnit(i)});return e}_mappingFeesItemizeFeesUnit(t){return"PERCENTAGE"===t.mode.id?{unitType:"PERCENTAGE",percentage:t.unit.percentage}:{unitType:"AMOUNT",amount:t.unit.amount,currency:t.unit.currency}}_mappingFees(t){t.fees&&!t.fees.itemizeFees&&(t.fees={totalFees:t.fees.totalFees||{},itemizeFees:t.fees.itemizeFees||this._mappingFeesItemizeFees(t.fees)})}_mappingSpecificAmounts(t){const e=[];t.total&&e.push({amount:{amount:t.total.amount,currency:t.total.currency},id:"TOTAL"}),t.capital&&e.push({amount:{amount:t.capital.amount,currency:t.capital.currency},id:"CAPITAL"}),t.interest&&e.push({amount:{amount:t.interest.amount,currency:t.interest.currency},id:"INTEREST"}),t.outstandingBalance&&e.push({amount:{amount:t.outstandingBalance.amount,currency:t.outstandingBalance.currency},id:"OUTSTANDING_BALANCE"}),t.amortizedAmount&&e.push({amount:{amount:t.amortizedAmount.amount,currency:t.amortizedAmount.currency},id:"AMORTIZED_AMOUNT"}),t.downPayment&&e.push({amount:{amount:t.downPayment.amount,currency:t.downPayment.currency},id:"DOWN_PAYMENT"}),t.previousPayments&&e.push({amount:{amount:t.previousPayments.amount,currency:t.previousPayments.currency},id:"PREVIOUS_PAYMENT"}),t.downPaymentPending&&e.push({amount:{amount:t.downPaymentPending.amount,currency:t.downPaymentPending.currency},id:"DOWN_PAYMENT_PENDING"}),t.balanceDueAtCutOff&&e.push({amount:{amount:t.balanceDueAtCutOff.amount,currency:t.balanceDueAtCutOff.currency},id:"BALANCE_DUE_AT_CUT_OFF"}),t.overdueAtCutOff&&e.push({amount:{amount:t.overdueAtCutOff.amount,currency:t.overdueAtCutOff.currency},id:"OVER_DUE_AT_CUT_OFF"}),t.totalBalanceDueAtCutOff&&e.push({amount:{amount:t.totalBalanceDueAtCutOff.amount,currency:t.totalBalanceDueAtCutOff.currency},id:"TOTAL_BALANCE_AT_CUT_OFF"}),t.firstInstallment&&e.push({amount:{amount:t.firstInstallment.amount,currency:t.firstInstallment.currency},id:"FIRST_INSTALLMENT"}),t.graceAmount&&e.push({amount:{amount:t.graceAmount.amount,currency:t.graceAmount.currency},id:"GRACE_AMOUNT"}),t.paymentAmount&&e.push({amount:{amount:t.paymentAmount.amount,currency:t.paymentAmount.currency},id:"PAYMENT_AMOUNT"}),t.specificAmounts=e}_mappingSpecificAmountScheduledPayments(t){const e=[];return t.capital&&e.push({amount:{amount:t.capital.amount,currency:t.capital.currency},id:"CAPITAL"}),t.downPayment&&e.push({amount:{amount:t.downPayment.amount,currency:t.downPayment.currency},id:"DOWN_PAYMENT"}),t.installmentAmount&&e.push({amount:{amount:t.installmentAmount.amount,currency:t.installmentAmount.currency},id:"PAYMENT_AMOUNT"}),t.interest&&e.push({amount:{amount:t.interest.amount,currency:t.interest.currency},id:"INTEREST"}),t.total&&e.push({amount:{amount:t.total.amount,currency:t.total.currency},id:"TOTAL"}),e}_mappingFeesScheduledPayments(t){return{totalFees:t.totalFees||{amount:t.amount,currency:t.currency},itemizeFees:[{itemizeFeeUnit:{unitType:"AMOUNT",amount:t.amount,currency:t.currency}}]}}_mappingInstallments(t){if(t.installments||(t.installments=[]),t.scheduledPayments){t.installments=[];for(let e=0;e<t.scheduledPayments.length;e+=1)t.installments.push({id:t.scheduledPayments[e].installmentNumber||e,number:t.scheduledPayments[e].installmentNumber||e,maturityDate:t.scheduledPayments[e].maturityDate,specificAmounts:this._mappingSpecificAmountScheduledPayments(t.scheduledPayments[e]),fees:this._mappingFeesScheduledPayments(t.scheduledPayments[e].fee)});delete t.scheduledPayments}return t.installments}_mappingRelatedContractsV1(t){const e=Array.isArray(t)?t:[t];if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++)this._renameProperty(e[t],"relatedContractId","id"),this._renameProperty(e[t],"numberType.name","description"),this._renameProperty(e[t],"relationType.name","description"),e[t].product&&!e[t].product.productType&&(e[t].product.productType={id:e[t].product.id,description:e[t].product.name},e[t].product.id="",e[t].product.name="");return e}_mappingRelatedContractsV2(t){const e=Array.isArray(t)?t:[t];if("0"==this.version)this._mappingRelatedContractsV1(e),this._commonChanges(e);else if("1"==this.version){this._commonChanges(e);for(let t=0;t<e.length;t++)this._removeFields(["relatedCardId","relatedCardNumber","status","physicalSupport","subProductType"],e[t])}return e}_commonChanges(t){if(Object.keys(t).length)for(let e=0;e<t.length;e++)t[e]={...t[e],contractDetails:{contractType:"INTERNAL_CONTRACT"}},t[e].contractId&&(t[e].contractDetails={...t[e].contractDetails,contractId:t[e].contractId},this._removeFields(["contractId"],t[e])),t[e].number&&(t[e].contractDetails={...t[e].contractDetails,number:t[e].number},this._removeFields(["number"],t[e])),t[e].numberType&&(t[e].contractDetails={...t[e].contractDetails,numberType:t[e].numberType},this._removeFields(["numberType"],t[e])),t[e].product&&(t[e].contractDetails={...t[e].contractDetails,product:t[e].product},this._removeFields(["product"],t[e]));return t}_renameQueryParam(t,e,i){e in t&&(t[i]=t[e],delete t[e])}};class Tt extends bt{static get is(){return"bbva-global-card-activation-api-dm"}static get properties(){return{cardActivation:{type:Object,attribute:!1}}}constructor(){super(),this.cardActivation={}}resetCardActivation(){this.cardActivation={}}getCardActivation(t,e,i={}){if(Object.keys(this.cardActivation).length)return;this._generateGetService(this._getService("get",t,i,e),{customEvent:"card-activation-api-dm-fetch",errorFireEventHandler:"card-activation-api-dm-fetch-error"},this._responseMapping,i.fields)}patchCardActivation(t,e,i){this._requestMapping(i);this._generateGetService(this._getService("patch",t,{},e,i),{customEvent:"card-activation-api-dm-update",errorFireEventHandler:"card-activation-api-dm-update-error"},this._responseMapping),this.resetCardActivation()}_responseMapping(t={}){return this._mappingActivation(t),t}_requestMapping(t={}){"0"==this.version&&this._mappingRequestLimits(t)}_getService(t,e,i,a,r){const n=this._getServiceParams(i,r);return n.params={"card-id":e,"activation-id":a,...i},this._getServicePath(`${t}CardIdActivation`,this._getBgadp(n))}_getBgadp(t){return{getCardIdActivationV0:()=>new nt(t),getCardIdActivationV1:()=>new st(t),patchCardIdActivationV0:()=>new ot(t),patchCardIdActivationV1:()=>new ct(t),default:()=>"BGADP called not exist"}}}let Ct=class extends bt{static get is(){return"bbva-global-card-base-api-dm"}resetCard(){this.card={}}getCard(t,e){e=Object.assign({"card-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}Card`,this._getBgadp(a))}_getBgadp(t){return{getCardV0:()=>new a(t),getCardV1:()=>new r(t),getCardV2:()=>new n(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t.activations&&(t.activations=this._mappingActivationsV2(t.activations)),t.indicators&&(t.indicators=this._mappingIndicators(t.indicators)),t.paymentMethods&&(t.paymentMethods=this._mappingPaymentMethodsV2(t.paymentMethods)),t.relatedContracts&&(t.relatedContracts=this._mappingRelatedContractsV2(t.relatedContracts)),"0"==this.version&&(this._cannonizerV0(t),this._cannonizerCommon(t)),"1"==this.version&&(this._cannonizerCommon(t),this._cannonizerV1(t)),t}_cannonizerV0(t){this._mappingBrandAssociation(t),this._mappingCardType(t),this._mappingId(t),this._mappingNumberType(t),this._mappingPhysicalSupport(t),this._mappingTitleToProduct(t),t.rates&&(t.rates={itemizeRates:this._mappingItemizeRates(t.rates)}),this._mappingStatus(t),t.formats&&t.formats.forEach((t=>{this._renameProperty(t.numberType,"name","description")})),this._removeFields(["deliveriesManagement","delivery","membership","contractId","companyEmbossingNameType","customCompanyEmbossingName"],t)}_cannonizerCommon(t){if(t.availableBalance&&this._canonBalances(t.availableBalance),t.disposedBalance&&this._canonBalances(t.disposedBalance),t.cardType){switch(t.cardType.id){case"DEBIT_CARD":this._physicalSupportCanon(t),this._holderNameCanon(t),this._availableBalanceCanon(t);break;case"CREDIT_CARD":this._physicalSupportCanon(t),this._holderNameCanon(t),this._availableBalanceCanon(t),t.disposedBalance&&(t.cardType.disposedBalance=t.disposedBalance),"1"==this.version&&t.paymentType&&(t.cardType.paymentType=t.paymentType),"1"==this.version&&t.operationNumber&&(t.cardType.operationNumber=t.operationNumber),t.grantedCredits&&(t.cardType.grantedCredits=t.grantedCredits);break;case"PREPAID_CARD":this._physicalSupportCanon(t),this._holderNameCanon(t),this._removeFields(["pendingBalances","postedBalances"],t.availableBalance)}}t.product.subproduct&&(this._renameProperty(t.product,"subproduct","subProduct"),this._removeFields(["description"],t.product.subProduct)),t.status.lastUpdatedDate&&this._renameProperty(t.status,"lastUpdatedDate","lastUpdateDate"),this._renameProperty(t.status.reason,"name","description"),this._removeFields(["disposedBalance","commercialPackage","contractingBranch","grantedCredits","supportContractType","contractingBusinessAgent","dependencyValue","managementBranch","marketBusinessAgent","holderName","physicalSupport"],t)}_cannonizerV1(t){t.fees&&t.fees.itemizeFees.length&&t.fees.itemizeFees.forEach((e=>{this._renameProperty(e,"itemizeFeeUnit","itemizeFeesUnit"),e.itemizeFeesUnit.percentage&&(e.itemizeFeesUnit={...e.itemizeFeesUnit,unitFeeType:"PERCENTAGE"}),e.itemizeFeesUnit.amount&&(e.itemizeFeesUnit={...e.itemizeFeesUnit,unitFeeType:"AMOUNT"}),this._removeFields(["totalFees"],t.fees)})),t.image&&(t.image.link={href:t.image.url},this._removeFields(["url"],t.image)),this._removeFields(["hasPendingDelivery"],t.cardType.physicalSupport),this._removeFields(["chargeAccounts","paymentMethod"],t.nextFinancialStatement),this._removeFields(["totalRates"],t.rates),this._removeFields(["classification"],t.product),this._removeFields(["paymentType","bankIdentificationNumber","companyEmbossing","contractingCart","coupons","hiringOrigin","operationDate","operationNumber","offerId","technologyPayments","initialExpirationDate","offerRecalculationType","staticFeatures"],t)}_paramsMapping(t){if(("0"==this.version||"1"==this.version)&&(this._customerIdRemover(t),t.expand))switch(t.expand){case"activations":this._removeFields(["activations.customerId"],t);break;case"indicators":this._removeFields(["indicators.customerId"],t),t["indicators.id"]&&(t["indicators.id"]=t["indicators.id"].toString());break;case"payment-methods":this._removeFields(["payment-methods.customerId"],t);break;case"related-contracts":this._removeFields(["related-contracts.customerId"],t)}return t}_physicalSupportCanon(t){if(t.hasOwnProperty("physicalSupport"))return t.cardType.physicalSupport=t.physicalSupport,this._removeFields(["physicalSupport"],t),t}_holderNameCanon(t){if(t.hasOwnProperty("holderName"))return t.cardType.holderName=t.holderName,this._removeFields(["holderName"],t),t}_availableBalanceCanon(t){t.hasOwnProperty("availableBalance")&&(t.cardType.availableBalance={postedBalances:t.availableBalance.postedBalances,pendingBalances:t.availableBalance.pendingBalances}),this._removeFields(["postedBalances","pendingBalances"],t.availableBalance)}_canonBalances(t){return t.currentBalances&&t.currentBalances.forEach((t=>{t.amount={amount:t.amount,currency:t.currency},this._removeFields(["currency"],t),t.breakDown&&(t.localCurrencyEquivalent=t.breakDown.localCurrencyEquivalent,this._removeFields(["breakDown"],t))})),t}};i(Ct,"GET_EVENTS",{customEvent:"card-api-dm-fetch",errorFireEventHandler:"card-api-dm-fetch-error"}),customElements.define(Ct.is,Ct);let xt=class extends bt{static get is(){return"bbva-global-cards-base-api-dm"}resetCards(){this.cards=[]}getCards(t){this._mappingCardsParams(t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}Cards`,this._getBgadp(a))}_getBgadp(t){return{getCardsV1:()=>new s(t),getCardsV0:()=>new o(t),default:()=>"BGADP does not exist."}}_responseMapping(t={}){for(let e=0;e<t.length;e+=1)this._mappingCannonical(t[e]);return t}_paginationMapping(t){return t}_mappingCannonical(t){return this._mappingBrandAssociation(t),this._mappingCardAgreement(t),this._mappingCardType(t),this._mappingCompanyEmbossing(t),this._mappingId(t),this._mappingNumberType(t),this._mappingPhysicalSupport(t),this._mappingStatus(t),this._mappingTitleToProduct(t),t.conditions&&(t.conditions=this._mappingConditionsV1(t.conditions)),t.activations&&(t.activations=this._mappingActivationsV1(t.activations)),t.relatedContracts&&(t.relatedContracts=this._mappingRelatedContractsV1(t.relatedContracts)),t.transactions&&(t.transactions=this._mappingCardTransactions(t.transactions)),t.indicators&&(t.indicators=this._mappingIndicators(t.indicators)),t.participants&&(t.participants=this._mappingParticipants(t.participants)),t.paymentMethods&&(t.paymentMethods=this._mappingPaymentMethodsV1(t.paymentMethods)),t}};i(xt,"GET_EVENTS",{customEvent:"cards-api-dm-fetch",paginationEvent:"cards-api-dm-pagination",errorFireEventHandler:"cards-api-dm-fetch-error"}),customElements.define(xt.is,xt);let Pt=class extends bt{static get is(){return"bbva-global-card-transactions-base-api-dm"}resetCardTransactions(){this.cardTransactions=[]}getCardTransactions(t,e){this._paramsMapping(e),e=Object.assign({"card-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}CardTransactions`,this._getBgadp(a))}_getBgadp(t){return{getCardTransactionsV0:()=>new c(t),getCardTransactionsV1:()=>new d(t),getCardTransactionsV2:()=>new l(t),default:()=>"BGADP does not exist."}}_paramsMapping(t){return this._paramsMappingCanonical(t),t}_responseMapping(t){return this._responseMappingCanonical(t),t}_responseMappingCanonical(t){return"1"==this.version&&Array.isArray(t)?t.forEach((t=>{this._removeFields(["fundsOrigin","transactionOrigin"],t),this._removeFields(["postedBalance","reportingBalance","authorizedBalance","hold"],t.additionalInformation),t.contract.bank&&t.contract.bank.branch&&(t.branch=t.contract.bank.branch),this._responseCommonFields(t)})):"0"==this.version&&Array.isArray(t)&&t.forEach((t=>{this._responseCommonFields(t),t.classification&&(this._removeFields(["pfmId","customName"],t.classification),this._removeFields(["customName"],t.classification.category),this._removeFields(["customName"],t.classification.category.subcategory)),this._renameProperty(t,"originChannel","paymentChannel"),this._removeFields(["transactionMode"],t.transactionType)})),t}_responseCommonFields(t){return this._renameProperty(t,"valuationDate","valueDate"),this._renameProperty(t,"contract.numberType.name","description"),t.localAmount&&(t.operationAmounts=[{id:"LOCAL_AMOUNT",...t.localAmount}],delete t.localAmount),t.originAmount&&(t.operationAmounts=[t.operationAmounts[0],{id:"ORIGIN_AMOUNT",...t.originAmount}],delete t.originAmount),t.additionalInformation&&t.additionalInformation.updatedBalance&&(t.additionalInformation.updatedBalance=[{id:"UPDATED_BALANCE",...t.additionalInformation.updatedBalance}],this._renameProperty(t,"additionalInformation.updatedBalance","balances")),this._removeFields(["product","bank"],t.contract),this._removeFields(["updateDate"],t.status),this._removeFields(["category","exchangeRate"],t),t}_paramsMappingCanonical(t){return"1"==this.version?this._paramsCommonFields(t):"0"==this.version&&(this._paramsCommonFields(t),this._removeFields(["moneyFlow.id","financingType.id"],t)),t}_paramsCommonFields(t){return this._removeFields(["customerId"],t),t["transactionType.id"]&&(t["transactionType.id"]=t["transactionType.id"].toString()),t["status.id"]&&(t["status.id"]=t["status.id"].toString()),t["operationAmount.id"]&&"LOCAL_AMOUNT"===t["operationAmount.id"]?(t["operationAmount.fromAmount"]&&this._renameQueryParam(t,"operationAmount.fromAmount","fromLocalAmount.amount"),t["operationAmount.toAmount"]&&this._renameQueryParam(t,"operationAmount.toAmount","toLocalAmount.amount"),t["operationAmount.currency"]&&this._renameQueryParam(t,"operationAmount.currency","localAmount.currency"),this._removeFields(["operationAmount.id"],t)):this._removeFields(["operationAmount.id","operationAmount.fromAmount","operationAmount.toAmount","operationAmount.currency"],t),t}};i(Pt,"GET_EVENTS",{customEvent:"card-transactions-api-dm-fetch",paginationEvent:"card-transactions-api-dm-pagination",errorFireEventHandler:"card-transactions-api-dm-fetch-error"}),customElements.define(Pt.is,Pt);let At=class extends bt{static get is(){return"bbva-global-card-offer-options-base-api-dm"}resetCardOfferOptions(){this.cardOfferOptions=[]}getCardOfferOptions(t,e,i){i=Object.assign({"card-id":t,"offer-id":e},i),this._generateGetService(this._getService("get",{},i),this.constructor.GET_EVENTS,this._responseMapping,i.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}CardOfferOptions`,this._getBgadp(a))}_getBgadp(t){return{getCardOfferOptionsV1:()=>new p(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}};i(At,"GET_EVENTS",{customEvent:"card-offer-options-api-dm-fetch",errorFireEventHandler:"card-offer-options-api-dm-fetch-error"}),customElements.define(At.is,At);let Et=class extends bt{static get is(){return"bbva-global-card-offer-option-base-api-dm"}resetCardOfferOption(){this.cardOfferOption={}}getCardOfferOption(t,e,i,a){a=Object.assign({"card-id":t,"offer-id":e,"option-id":i},a),this._generateGetService(this._getService("get",{},a),this.constructor.GET_EVENTS,this._responseMapping,a.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}CardOfferOption`,this._getBgadp(a))}_getBgadp(t){return{getCardOfferOptionV1:()=>new h(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}};i(Et,"GET_EVENTS",{customEvent:"card-offer-option-api-dm-fetch",errorFireEventHandler:"card-offer-option-api-dm-fetch-error"}),customElements.define(Et.is,Et);let St=class extends bt{static get is(){return"bbva-global-card-offer-option-redeems-base-api-dm"}postCardOfferOptionRedeems(t,e,i,a){const r={"card-id":t,"offer-id":e,"option-id":i};this._generateGetService(this._getService("post",a,r),this.constructor.POST_EVENTS,this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}CardOfferOptionRedeems`,this._getBgadp(a))}_getBgadp(t){return{postCardOfferOptionRedeemsV1:()=>new m(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}};i(St,"POST_EVENTS",{customEvent:"card-offer-option-redeems-api-dm-create",errorFireEventHandler:"card-offer-option-redeems-api-dm-create-error"}),customElements.define(St.is,St);var wt=u`:host {
  display: block;
  box-sizing: border-box;
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: auto;
  z-index: var(--bbva-notification-container-z-index, 8);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}
${(new g).mediaRules()}`;let Dt=class extends(y(e)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":v}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:_(),warning:_(),error:f(),success:b()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(t=!1){t&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(t){return this.notificationIcons[t]||this.notificationIcons[this.defaultType]}_onNotificationClosed(t){t.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:t}=this._currentNotification;t>0&&(this._currentTime=setTimeout(this.clear.bind(this),t))}_hideOnEvent(t){this.clear(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNotification(t){this.add(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:t="",simpleLinkText:e,type:i=this.defaultType,duration:a=this.duration}={}){const r=i;this._stack.push({type:r,description:t,simpleLinkText:e,duration:a}),this._showNextInStack()}static get styles(){return[wt,T("bbva-notification-container-shared-styles")]}render(){return C`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${x(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${x(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}};var Nt=u`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${P(E.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${P(E.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${P(E.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${P(E.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${P(E.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${P(E.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${P(E.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${P(E.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${P(E.primarySubduedLight)}));
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([position=fixed]) {
  --bbva-header-main-position: fixed;
  width: 100%;
  left: 0;
  right: 0;
}

.header-main {
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
  padding-top: var(--bbva-header-main-padding-top, 0);
  margin: 0 auto;
  min-height: var(--bbva-header-main-min-height, 3rem);
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .icon {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  border: none;
  background: none;
  width: var(--bbva-header-main-width, 3rem);
  min-height: var(--bbva-header-main-min-height, 3rem);
  padding: 0;
  color: inherit;
  margin: 0;
  cursor: pointer;
}
.header-main .header-icons {
  display: flex;
  flex: none;
}
.header-main .header-icons.half-space {
  min-width: 2.875rem;
}
.header-main .header-icons.full-space {
  min-width: 5.75rem;
}
.header-main .header-icons.right-group .icon.primary, .header-main .header-icons.right-group .icon.secondary {
  margin-left: auto;
}
.header-main .header-icons.right-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.right-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons.left-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.left-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: 0.125rem;
}
.header-main .heading-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  top: var(--bbva-header-main-text-top, var(--bbva-header-main-padding-top, 0));
  left: 0;
  width: 100%;
  height: var(--bbva-header-main-min-height, 3rem);
  margin: 0;
  overflow: hidden;
  text-align: center;
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${P(A.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper.image #image {
  max-height: -webkit-fill-available;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 0.3125rem;
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: 0.3125rem;
}

:host([variant*=modal]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal, var(--_bg-color-modal));
}

:host([variant*=modal-three-level]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal-three-level, var(--_bg-color-modal-three-level));
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .heading-wrapper .text-wrapper {
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .header-icons .text-icon {
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-process, var(--_bg-color-process));
}

:host([variant*=sign]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-sign, var(--_bg-color-sign));
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

:host([show-text-icon]) .header-main {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .icon {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .heading-wrapper {
  height: var(--bbva-header-main-min-height, 3.5rem);
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
`;let kt=class t extends(y(S(w(e)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":D,"bbva-icon":N,"bbva-badge-notification":k}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(e,i);return a in t?t[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[Nt,T("bbva-header-main-shared-styles"),I("button:focus"),O.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return C`<bbva-icon icon="${x(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return C`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(e,i,a,r){const n=t.toCamelCase(e),s=`icon${n}`,o=`accessibilityTextIcon${n}`;return C`<button
      class="${i}"
      id="btn-${e}"
      aria-label="${x(this.t(this[o]))}"
      aria-expanded=${x(r)}
      ?hidden="${!this[s]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(s):this._icon(s)}
      ${this.showTextIcon?this._textIcon(a):""}
    </button>`}_textIcon(t){return C` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${x(this.t(t))}"
    >
    </bbva-text>`}_tplHeading(t){return C`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(t)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:i,image:a,_hasMicroillustration:r}=this;return C`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${e}"
          id="heading"
          aria-label=${(r||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${x(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span
            class="${r}"
            ?hidden="${!r}"
            aria-hidden="true"
          >
            ${this.microillustration}
          </span>
        </h1>

        <div class="header-icons ${t} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}};F("colors.primaryCoreLightened"),F("colors.cool80"),F("colors.cool70"),F("colors.primaryCoreLightened"),F("colors.cool100"),F("colors.tertiaryType6Darkened"),F("colors.tertiaryType4Darkened"),F("colors.secondary300");const It=B((t=>class extends(M(t)){static configurationScopedElements(){return[Dt,R,kt,V]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(t,e){const i=`_${t}`;return this[i]||(this[i]=document.createElement(t)),"object"==typeof e&&Object.keys(e).forEach((t=>{"@"===t[0]?this[i].addEventListener(t.substring(1),e[t]):this[i][t]=e[t]})),this._setPrimaryLeftIcon(t,i),this._setSecondaryRightIcon(t,i),C`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(t,e){if(this.config.header&&t===this.getScopedTagName("bbva-header-main")&&this.config.back){this[e].iconLeftPrimary=this.config.header.iconLeftPrimary||z();const t="@header-main-icon-left-primary-click",i=this.config.header[t]?this.config.header[t]:this._boundBackHandler;this[e].removeEventListener("header-main-icon-left-primary-click",i),this[e].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(t,e){this.config.header&&t===this.getScopedTagName("bbva-header-main")&&(this[e].iconRightSecondary=this[e].iconRightSecondary||this.config.smartAssistant&&G()||this.config.faqs&&U())}_dispatchCustomEvent(t,e=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:i,composed:a,detail:e,cancelable:!0}))}showLoader(t="full",e=!1,i=!1){const a={variant:t,showSpinnerMessageLabel:e,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(t,e,i,a){const r={description:t,simpleLinkText:e,type:i,duration:a};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:t="",status:e=""}={}){this.config.notifyTop={...this.config.notifyTop,text:t,status:e},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var t,e,i;return C`
          ${null!==(t=this.config)&&void 0!==t&&t.notify||null!==(e=this.config)&&void 0!==e&&e.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var t,e,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(t=this.config)||void 0===t?void 0:t.notifyTop)||(null===(e=this.config)||void 0===e?void 0:e.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const t=this._getElements();return C`
          <section style="${this._headerStyles}">
            ${Object.keys(t).map((e=>t[e].condition?this._tpl(e,t[e].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));class Ot extends(M(w(j(It(e))))){static get is(){return"bbva-manager-third-party-wallets-mx"}static get scopedElements(){const t=[Tt,...Ot.configurationScopedElements()];return Ot.scopedElementsFromClasses(t)}static get properties(){return{financialOverview:{type:Object,attribute:"financial-overview"},cardData:{type:Object,attribute:"card-data"},digitalCardDetails:{type:Object,attribute:"digital-card-details"},isNativeIos:{type:Boolean,attribute:"is-native-ios"},devices:{type:Array},isNotAdded:{type:Boolean,attribute:"is-not-added"},cardDigitalFinancialOverview:{type:Object,attribute:"card-digital-financial-overview"},_flagDevice:{type:Boolean,state:!0},_flagIsVirtualCard:{type:Boolean,state:!0},digitalProductId:{type:String,attribute:"digital-product-id"},cardsApiVersion:{type:String,attribute:"cards-api-version"},host:{type:String}}}constructor(){super(),this.cardData={},this.digitalCardDetails={},this.isNativeIos=!1,this.devices=[],this.isNotAdded=!1,this.cardDigitalFinancialOverview={},this._flagDevice=!1,this._flagIsVirtualCard=!1,this.digitalProductId="",this.cardsApiVersion="",this.host="",this.requiredToken="",this.native=!1}updated(t){if(t.has("cardData")&&Object.keys(this.cardData).length>0&&(this.openSpinner(),this.checkIfCardIsVirtual()),t.has("cardDigitalFinancialOverview")&&this._flagIsVirtualCard&&(this.cardDigitalFinancialOverview&&Object.keys(this.cardDigitalFinancialOverview).length>0?this.requestDeviceList(this.cardDigitalFinancialOverview):(this.setLabelSettingsModalDigitalCardOIsNotGenerated(),this.closeSpinner(),this._dispatchCustomEvent("payment-third-party-wallet-digital-card-is-not-generated"))),t.has("devices")&&!this._flagDevice&&this._flagIsVirtualCard){t.get("devices")!==this.devices&&(Array.isArray(this.devices)&&this.devices.length>0||"object"==typeof this.devices&&Object.keys(this.devices).length>0)&&(this._flagDevice=!0,this.setDigitalCardDetails(this.cardDigitalFinancialOverview))}super.updated(t)}checkIfCardIsVirtual(){var t,e;if(this._dispatchCustomEvent("payment-third-party-wallet-show-loader-widget"),this.setLabelSettingsModalDefault(),"VIRTUAL"===(null===(t=this.cardData)||void 0===t||null===(e=t.physicalSupport)||void 0===e?void 0:e.id)){var i,a,r,n,s;this._flagIsVirtualCard=!0;const t=null===(i=this.cardData)||void 0===i?void 0:i.id,e=null===(a=this.financialOverview)||void 0===a||null===(r=a.data)||void 0===r||null===(n=r.contracts)||void 0===n?void 0:n.find((e=>(null==e?void 0:e.id)===t)),o=null==e||null===(s=e.detail)||void 0===s?void 0:s.agreementContract;this.cardDigitalFinancialOverview=this.getDataCardDigital(t,o)}else this._flagIsVirtualCard=!1,this.closeSpinner(),this.cardData&&!this.cardData.alias&&(this.cardData.alias=this.cardData.product.name),this._dispatchCustomEvent("payment-third-party-wallet-set-card-data",this.cardData),this._dispatchCustomEvent("payment-third-party-wallet-clear-loader-widget")}getDataCardDigital(t,e){var i,a,r;return null===(i=this.financialOverview)||void 0===i||null===(a=i.data)||void 0===a||null===(r=a.contracts)||void 0===r?void 0:r.find((i=>{var a,r,n;return(null==i?void 0:i.id)!==t&&(null==i||null===(a=i.detail)||void 0===a?void 0:a.agreementContract)===e&&"VIRTUAL"===(null==i||null===(r=i.detail)||void 0===r||null===(n=r.physicalSupport)||void 0===n?void 0:n.id)}))}setDigitalCardDetails(t){var e;const{holderName:i,brandAssociation:a,cardType:r}=this.cardData;this.digitalCardDetails={...t,...t.detail,holderName:i,brandAssociation:a,cardType:r},null===(e=this.digitalCardDetails)||void 0===e||delete e.detail,this.digitalCardDetails&&!this.digitalCardDetails.alias&&(this.digitalCardDetails.alias=this.digitalCardDetails.product.name),this.handleOnOffCard()}handleOnOffCard(){var t,e,i;var a;(null===(t=this.digitalCardDetails)||void 0===t||null===(e=t.activations)||void 0===e||null===(i=e.find((t=>"ON_OFF"===(null==t?void 0:t.id))))||void 0===i?void 0:i.isActive)?(this.isDigitalCardNotAdded(),this.isNotAdded?(this.closeSpinner(),this._dispatchCustomEvent("payment-third-party-wallet-is-virtual-card")):(this.closeSpinner(),this.setCardDataDigital())):(this.setLabelSettingsModalDigitalCardOff(),this.digitalProductId=null===(a=this.digitalCardDetails)||void 0===a?void 0:a.id,this.closeSpinner(),this._dispatchCustomEvent("payment-third-party-wallet-digital-card-is-off"))}isDigitalCardNotAdded(){var t;this.isNativeIos?this.isNotAdded=!this.devices.find((t=>"NOT_ADDED"!==(null==t?void 0:t.status))):this.isNotAdded="NOT_ADDED"===(null===(t=this.devices)||void 0===t?void 0:t.status)}requestDeviceList(t){const{number:e=""}=t;this._dispatchCustomEvent("payments-third-party-wallet-provisioning-request-devices",this.isNativeIos?{pan:e}:e)}handleErrors(){this.closeSpinner(),this._dispatchCustomEvent("handle-manager-error")}setCardDataDigital(){this.closeSpinner(),this._dispatchCustomEvent("payment-third-party-wallet-set-card-data",this.digitalCardDetails),this._dispatchCustomEvent("payment-third-party-wallet-clear-loader-widget")}reset(){this.cardData={},this.digitalCardDetails={},this.devices=[],this.isNotAdded=!1,this.cardDigitalFinancialOverview={},this._flagDevice=!1,this._flagIsVirtualCard=!1,this.closeSpinner()}openSpinner(){this._dispatchCustomEvent("open-control-veil")}closeSpinner(){this._dispatchCustomEvent("close-control-veil")}setLabelSettingsModalDefault(){const t=this.isNativeIos?"apple":"google";this._dispatchCustomEvent("set-label-body",this.t(`payments-third-party-wallet-provisioning-virtual-card-modal-body-${t}`)),this._dispatchCustomEvent("set-label-button",this.t("payments-third-party-wallet-provisioning-virtual-card-modal-button")),this._dispatchCustomEvent("set-label-header",this.t(`payments-third-party-wallet-provisioning-virtual-card-modal-header-${t}`)),this._dispatchCustomEvent("set-label-title",this.t("payments-third-party-wallet-provisioning-virtual-card-modal-title"))}setLabelSettingsModalDigitalCardOff(){this._dispatchCustomEvent("set-label-body-card-off",this.t("payments-third-party-wallet-provisioning-digital-card-modal-body-off")),this._dispatchCustomEvent("set-label-title-card-off",this.t("payments-third-party-wallet-provisioning-digital-card-modal-title-off")),this._dispatchCustomEvent("set-label-button-card-off",this.t("payments-third-party-wallet-provisioning-digital-card-modal-button-off")),this._dispatchCustomEvent("set-label-link-card-off",this.t("payments-third-party-wallet-provisioning-digital-card-modal-link-off"))}setLabelSettingsModalDigitalCardOIsNotGenerated(){const t=this.isNativeIos?"apple":"google";this._dispatchCustomEvent("set-label-body-card-is-not-generated",this.t(`payments-third-party-wallet-provisioning-digital-card-modal-body-${t}`)),this._dispatchCustomEvent("set-label-title-card-is-not-generated",this.t("payments-third-party-wallet-provisioning-digital-card-modal-title"))}digitalCardPatchOnActivation(){const t="ON_OFF",e={activationId:t,isActive:!0};this.shadowRoot.querySelector("#cardActivationApiDm").patchCardActivation(this.digitalProductId,t,e)}_handleActivationSuccess(){this.closeSpinner(),this._dispatchCustomEvent("payment-third-party-wallet-digital-card-is-on"),this.isDigitalCardNotAdded(),this.isNotAdded?this._dispatchCustomEvent("payment-third-party-wallet-is-virtual-card"):this.setCardDataDigital()}get _onOffDigitalCard(){return C`
      <bbva-global-card-activation-api-dm
      id="cardActivationApiDm"
      version="${this.cardsApiVersion}"
      ?native="${this.native}"
      host="${this.host}"
      .requiredToken="${this.requiredToken}"
      @card-activation-api-dm-update="${this._handleActivationSuccess}"
      @card-activation-api-dm-update-error="${this.handleErrors}"
      @api-dm-error="${this.handleErrors}"
      ></bbva-global-card-activation-api-dm>
    `}render(){return C`
      ${this._onOffDigitalCard}
    `}}customElements.define("bbva-manager-third-party-wallets-mx",Ot);var Lt=u`:host {
  display: block;
  box-sizing: border-box;
  position: fixed;
  top: 0;
  left: 0;
  width: 100vw;
  height: auto;
  z-index: var(--bbva-notification-container-z-index, 8);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}
${(new g).mediaRules()}`;class $t extends(y(e)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":v}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:_(),warning:_(),error:f(),success:b()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const t=this.getRootNode();return 11===t.nodeType?t.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(t=!1){t&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(t){return this.notificationIcons[t]||this.notificationIcons[this.defaultType]}_onNotificationClosed(t){t.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:t}=this._currentNotification;t>0&&(this._currentTime=setTimeout(this.clear.bind(this),t))}_hideOnEvent(t){this.clear(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNotification(t){this.add(t.detail),t.stopPropagation(),t.stopImmediatePropagation(),t.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:t="",simpleLinkText:e,type:i=this.defaultType,duration:a=this.duration}={}){const r=i;this._stack.push({type:r,description:t,simpleLinkText:e,duration:a}),this._showNextInStack()}static get styles(){return[Lt,T("bbva-notification-container-shared-styles")]}render(){return C`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${x(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${x(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}}var Ft=u`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${P(E.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${P(E.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${P(E.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${P(E.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${P(E.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${P(E.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${P(E.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${P(E.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${P(E.primarySubduedLight)}));
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

:host([position=fixed]) {
  --bbva-header-main-position: fixed;
  width: 100%;
  left: 0;
  right: 0;
}

.header-main {
  display: flex;
  justify-content: space-between;
  align-items: center;
  position: relative;
  padding-top: var(--bbva-header-main-padding-top, 0);
  margin: 0 auto;
  min-height: var(--bbva-header-main-min-height, 3rem);
  max-width: var(--bbva-header-main-max-width, 100%);
}
.header-main .icon {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  border: none;
  background: none;
  width: var(--bbva-header-main-width, 3rem);
  min-height: var(--bbva-header-main-min-height, 3rem);
  padding: 0;
  color: inherit;
  margin: 0;
  cursor: pointer;
}
.header-main .header-icons {
  display: flex;
  flex: none;
}
.header-main .header-icons.half-space {
  min-width: 2.875rem;
}
.header-main .header-icons.full-space {
  min-width: 5.75rem;
}
.header-main .header-icons.right-group .icon.primary, .header-main .header-icons.right-group .icon.secondary {
  margin-left: auto;
}
.header-main .header-icons.right-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.right-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons.left-group .icon.primary:active [data-tag-name=bbva-icon], .header-main .header-icons.left-group .icon.secondary:active [data-tag-name=bbva-icon] {
  --bbva-icon-color: var(--_header-main-active-icon-color);
}
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: 0.125rem;
}
.header-main .heading-wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  top: var(--bbva-header-main-text-top, var(--bbva-header-main-padding-top, 0));
  left: 0;
  width: 100%;
  height: var(--bbva-header-main-min-height, 3rem);
  margin: 0;
  overflow: hidden;
  text-align: center;
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${P(A.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper.image #image {
  max-height: -webkit-fill-available;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 0.3125rem;
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: 0.3125rem;
}

:host([variant*=modal]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal, var(--_bg-color-modal));
}

:host([variant*=modal-three-level]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-modal-three-level, var(--_bg-color-modal-three-level));
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .heading-wrapper .text-wrapper {
  color: var(--_color-modal-three-level);
}
:host([variant*=modal-three-level]) .header-main .header-icons .text-icon {
  color: var(--_color-modal-three-level);
}

:host([variant*=process]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-process, var(--_bg-color-process));
}

:host([variant*=sign]) {
  background-color: var(--bbva-header-main-dark-mode-bg-color-sign, var(--_bg-color-sign));
}

:host([variant*=transparent]) {
  background-color: var(--_bg-color-transparent);
}

:host([show-text-icon]) .header-main {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .icon {
  min-height: var(--bbva-header-main-min-height, 3.5rem);
}
:host([show-text-icon]) .header-main .heading-wrapper {
  height: var(--bbva-header-main-min-height, 3.5rem);
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
`;class Bt extends(y(S(w(e)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":D,"bbva-icon":N,"bbva-badge-notification":k}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const t={1:"half-space",2:"full-space"},e=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(e,i);return a in t?t[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[Ft,T("bbva-header-main-shared-styles"),I("button:focus"),O.dark]}static toCamelCase(t){return(t.charAt(0).toUpperCase()+t.slice(1)).replace(/([-_][a-z])/gi,(t=>t.toUpperCase().replace("-","").replace("_","")))}_icon(t){return C`<bbva-icon icon="${x(this[t])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(t){return C`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(t)}
    </bbva-badge-notification>`}_tplButton(t,e,i,a){const r=Bt.toCamelCase(t),n=`icon${r}`,s=`accessibilityTextIcon${r}`;return C`<button
      class="${e}"
      id="btn-${t}"
      aria-label="${x(this.t(this[s]))}"
      aria-expanded=${x(a)}
      ?hidden="${!this[n]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(n):this._icon(n)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(t){return C` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${x(this.t(t))}"
    >
    </bbva-text>`}_tplHeading(t){return C`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(t)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:t,_hasImage:e,text:i,image:a,_hasMicroillustration:r}=this;return C`
      <header class="header-main">
        <div class="header-icons ${t} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${e}"
          id="heading"
          aria-label=${(r||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${x(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span
            class="${r}"
            ?hidden="${!r}"
            aria-hidden="true"
          >
            ${this.microillustration}
          </span>
        </h1>

        <div class="header-icons ${t} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(t){this.dispatchEvent(new CustomEvent(`header-main-icon-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}}F("colors.primaryCoreLightened"),F("colors.cool80"),F("colors.cool70"),F("colors.primaryCoreLightened"),F("colors.cool100"),F("colors.tertiaryType6Darkened"),F("colors.tertiaryType4Darkened"),F("colors.secondary300");const Mt=B((t=>class extends(M(t)){static configurationScopedElements(){return[$t,R,Bt,V]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(t,e){const i=`_${t}`;return this[i]||(this[i]=document.createElement(t)),"object"==typeof e&&Object.keys(e).forEach((t=>{"@"===t[0]?this[i].addEventListener(t.substring(1),e[t]):this[i][t]=e[t]})),this._setPrimaryLeftIcon(t,i),this._setSecondaryRightIcon(t,i),C`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(t,e){if(this.config.header&&t===this.getScopedTagName("bbva-header-main")&&this.config.back){this[e].iconLeftPrimary=this.config.header.iconLeftPrimary||z();const t="@header-main-icon-left-primary-click",i=this.config.header[t]?this.config.header[t]:this._boundBackHandler;this[e].removeEventListener("header-main-icon-left-primary-click",i),this[e].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(t,e){this.config.header&&t===this.getScopedTagName("bbva-header-main")&&(this[e].iconRightSecondary=this[e].iconRightSecondary||this.config.smartAssistant&&G()||this.config.faqs&&U())}_dispatchCustomEvent(t,e=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:i,composed:a,detail:e,cancelable:!0}))}showLoader(t="full",e=!1,i=!1){const a={variant:t,showSpinnerMessageLabel:e,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(t,e,i,a){const r={description:t,simpleLinkText:e,type:i,duration:a};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:t="",status:e=""}={}){this.config.notifyTop={...this.config.notifyTop,text:t,status:e},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var t,e,i;return C`
          ${null!==(t=this.config)&&void 0!==t&&t.notify||null!==(e=this.config)&&void 0!==e&&e.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var t,e,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(t=this.config)||void 0===t?void 0:t.notifyTop)||(null===(e=this.config)||void 0===e?void 0:e.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const t=this._getElements();return C`
          <section style="${this._headerStyles}">
            ${Object.keys(t).map((e=>t[e].condition?this._tpl(e,t[e].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}}));class Rt extends(t(e)){_mappingActivationId(t){this._renameProperty(t,"activationId","id")}_mappingBrandAssociation(t){this._renameProperty(t,"brandAssociation.name","description")}_mappingCardsParams(t){this._renameProperty(t,"contractId","cardAgreement")}_mappingCardAgreement(t){this._renameProperty(t,"contractId","cardAgreement")}_mappingCardType(t){this._renameProperty(t,"cardType.name","description")}_mappingCompanyEmbossing(t){this._renameProperty(t,"companyEmbossingNameType","companyEmbossing"),this._renameProperty(t,"companyEmbossing.name","description"),t.customCompanyEmbossingName&&(t.companyEmbossing.customName=t.customCompanyEmbossingName,delete t.customCompanyEmbossingName)}_mappingDescription(t){this._renameProperty(t,"name","description")}_mappingDeliveriesManagementToV2(t){for(let e=0;e<t.length;e+=1)t[e].contactDetail&&(t[e].contactDetail.deliveryContactType="STORED"),this._renameProperty(t[e],"contactDetail","contactDetails"),t[e].serviceType&&this._renameProperty(t[e].serviceType,"name","description"),t[e].destination={id:"HOME"},t[e].address&&(t[e].address.deliveryAddressType="STORED",this._removeFields(["addressName"],t[e].address));return t}_mappingFinancingType(t){this._renameProperty(t,"financingType.name","description")}_mappingCardTransaction(t){return this._renameProperty(t,"contract.product.productType.name","description"),t}_mappingCardTransactions(t){if(t)if(Array.isArray(t))for(let e=0;e<t.length;e+=1)this._mappingCardTransaction(t[e]),this._removeFields(["classification"],t[e]);else this._mappingCardTransaction(t);return t}_mappingIndicators(t){if(t&&"0"==this.version&&Array.isArray(t))for(let e=0;e<t.length;e+=1)this._renameProperty(t[e],"indicatorId","id"),this._renameProperty(t[e],"name","description");return t}_mappingParticipants(t){if(t&&Array.isArray(t))for(let e=0;e<t.length;e+=1)this._renameProperty(t[e],"participantId","id"),this._renameProperty(t[e].participantType,"name","description");return t}_customerIdRemover(t){return"0"!=this.version&&"1"!=this.version||this._removeFields(["customerId"],t),t}_mappingPaymentMethodsV1(t){if(t&&Array.isArray(t))for(let e=0;e<t.length;e+=1)this._renameProperty(t[e],"endDate","nextPaymentDate"),this._renameProperty(t[e],"name","description"),this._renameProperty(t[e].period,"name","description"),this._renameProperty(t[e],"period","frecuency"),this._removeFields(["paymentAmounts","endDay"],t[e]);return t}_mappingPaymentMethodsV2(t){if(t&&Array.isArray(t))for(let e=0;e<t.length;e+=1)"0"==this.version&&(this._renameProperty(t[e],"endDate","nextPaymentDate"),this._renameProperty(t[e],"name","description"),this._renameProperty(t[e].period,"name","description"),this._renameProperty(t[e],"period","frequency"),this._removeFields(["paymentAmounts","endDay"],t[e])),"1"==this.version&&(this._removeFields(["contracts"],t[e]),this._renameProperty(t[e],"frecuency","frequency"));return t}_mappingOperation(t){t.operationDate&&(t.operation||(t.operation={}),t.operation.operationDate=t.operationDate,delete t.operationDate)}_mappingId(t){this._renameProperty(t,"cardId","id")}_mappingLimits(t){if(t.limits)for(let e=0;e<t.limits.length;e+=1){if(this._renameProperty(t.limits[e],"name","description"),t.limits[e].amountLimit&&(t.limits[e].amountLimits=[],t.limits[e].amountLimits[0]=t.limits[e].amountLimit,t.limits[e].amountLimits[0].isMajor=!0,delete t.limits[e].amountLimit),t.limits[e].itemizeAmountLimits){for(let i=0;i<t.limits.length;i++)t.limits[e].amountLimits[i+1]=t.limits[e].itemizeAmountLimits[i],t.limits[e].amountLimits[i+1].isMajor=!1;delete t.limits[e].itemizeAmountLimits}delete t.limits[e].percentage}}_mappingRequestLimits(t){if(t&&t.limits)for(let e=0;e<t.limits.length;e+=1){if(t.limits[e].amountLimits){if(t.limits[e].amountLimit=t.limits[e].amountLimits[0],delete t.limits[e].amountLimit.isMajor,t.limits[e].amountLimits.length>1){t.limits[e].itemizeAmountLimits=[];for(let i=1;i<t.limits[e].amountLimits.length;i++)t.limits[e].itemizeAmountLimits[i-1]=t.limits[e].amountLimits[i],delete t.limits[e].amountLimits[i].isMajor}delete t.limits[e].amountLimits}t.limits[e].description&&delete t.limits[e].description}}_mappingNumberType(t){this._renameProperty(t,"numberType.name","description")}_mappingPhysicalSupport(t){this._renameProperty(t,"physicalSupport.name","description")}_mappingItemizeRatesUnit(t){return"PERCENTAGE"===t.id||t.percentage?{unitRateType:"PERCENTAGE",percentage:t.percentage}:{unitRateType:"AMOUNT",amount:t.amount,currency:t.currency}}_mappingItemizeRates(t){const e=[];for(const i of t)e.push({rateType:i.rateType.id,description:i.rateType.name,calculationDate:"",itemizeRatesUnit:this._mappingItemizeRatesUnit(i.unit)});return e}_mappingRates(t){t.rates&&!t.rates.itemizeRates&&(t.rates={totalRates:t.rates.totalRates||{},itemizeRates:t.rates.itemizeRates||this._mappingItemizeRates(t.rates)})}_mappingStatus(t){this._renameProperty(t,"status.name","description")}_mappingTitleToProduct(t){this._renameProperty(t,"title","product")}_mappingFormat(t,e){let i={};if(i="FEE_AMOUNT"===t.outcomeType.id?{formatType:"AMOUNT",amount:{amount:t.feeAmount.amount,currency:t.feeAmount.currency}}:{formatType:"RATE",rateUnit:"PER_CENT",value:t.feePercentage},e)for(const t of e)t.factType&&"VALUE_LESSER_THAN"===t.factType.id?i.maximumAmount={amount:t.conditionAmount.amount,currency:t.conditionAmount.currency}:t.factType&&"VALUE_GREATER_THAN"===t.factType.id&&(i.minimumAmount={amount:t.conditionAmount.amount,currency:t.conditionAmount.currency});return i}_mappingConditionDate(t){const e=this._mappingConditionIdName(`${t.conditionId}_DATE`,t.name);return e.composedCondition=this._mappingComposedCondition(e.id,1),e.format={formatType:"DATE",minimumDate:t.period.startDate,maximumDate:t.period.checkDate},e}_mappingComposedCondition(t,e){return{id:`${t}_${e}`,name:t,isMultipleChoices:!0,row:e}}_mappingConditionIdName(t,e){return{id:t,description:e}}_mappingConditionsV1(t){if(t&&t.length&&t[0].outcomes){const e=[];for(const i of t){i.period&&e.push(this._mappingConditionDate(i));for(const t of i.outcomes){const a=this._mappingConditionIdName(i.conditionId,i.name);a.format=this._mappingFormat(t,i.facts),(i.outcomes.length>1||i.period)&&(a.id=`${a.id}_${a.format.formatType}`,a.composedCondition=this._mappingComposedCondition(a.id,1)),t.dueDate&&(a.dueDate=t.dueDate),e.push(a)}}t.length=0,Array.prototype.push.apply(t,e)}return t}_mappingActivationsV1(t){for(const e of t)this._mappingActivation(e);return t}_mappingActivation(t){this._mappingLimits(t),this._mappingActivationId(t),this._mappingDescription(t)}_mappingActivationsV2(t){return"1"==this.version&&Object.keys(t).length?t.forEach((t=>{this._removeFields(["limits","details"],t)})):"0"==this.version&&Object.keys(t).length&&t.forEach((t=>{this._renameProperty(t,"activationId","id"),this._renameProperty(t,"name","description"),this._removeFields(["limits","details"],t)})),t}_mappingFeesItemizeFees(t){const e=[];for(const i of t)e.push({feeType:i.type.id,description:i.type.name,itemizeFeeUnit:this._mappingFeesItemizeFeesUnit(i)});return e}_mappingFeesItemizeFeesUnit(t){return"PERCENTAGE"===t.mode.id?{unitType:"PERCENTAGE",percentage:t.unit.percentage}:{unitType:"AMOUNT",amount:t.unit.amount,currency:t.unit.currency}}_mappingFees(t){t.fees&&!t.fees.itemizeFees&&(t.fees={totalFees:t.fees.totalFees||{},itemizeFees:t.fees.itemizeFees||this._mappingFeesItemizeFees(t.fees)})}_mappingSpecificAmounts(t){const e=[];t.total&&e.push({amount:{amount:t.total.amount,currency:t.total.currency},id:"TOTAL"}),t.capital&&e.push({amount:{amount:t.capital.amount,currency:t.capital.currency},id:"CAPITAL"}),t.interest&&e.push({amount:{amount:t.interest.amount,currency:t.interest.currency},id:"INTEREST"}),t.outstandingBalance&&e.push({amount:{amount:t.outstandingBalance.amount,currency:t.outstandingBalance.currency},id:"OUTSTANDING_BALANCE"}),t.amortizedAmount&&e.push({amount:{amount:t.amortizedAmount.amount,currency:t.amortizedAmount.currency},id:"AMORTIZED_AMOUNT"}),t.downPayment&&e.push({amount:{amount:t.downPayment.amount,currency:t.downPayment.currency},id:"DOWN_PAYMENT"}),t.previousPayments&&e.push({amount:{amount:t.previousPayments.amount,currency:t.previousPayments.currency},id:"PREVIOUS_PAYMENT"}),t.downPaymentPending&&e.push({amount:{amount:t.downPaymentPending.amount,currency:t.downPaymentPending.currency},id:"DOWN_PAYMENT_PENDING"}),t.balanceDueAtCutOff&&e.push({amount:{amount:t.balanceDueAtCutOff.amount,currency:t.balanceDueAtCutOff.currency},id:"BALANCE_DUE_AT_CUT_OFF"}),t.overdueAtCutOff&&e.push({amount:{amount:t.overdueAtCutOff.amount,currency:t.overdueAtCutOff.currency},id:"OVER_DUE_AT_CUT_OFF"}),t.totalBalanceDueAtCutOff&&e.push({amount:{amount:t.totalBalanceDueAtCutOff.amount,currency:t.totalBalanceDueAtCutOff.currency},id:"TOTAL_BALANCE_AT_CUT_OFF"}),t.firstInstallment&&e.push({amount:{amount:t.firstInstallment.amount,currency:t.firstInstallment.currency},id:"FIRST_INSTALLMENT"}),t.graceAmount&&e.push({amount:{amount:t.graceAmount.amount,currency:t.graceAmount.currency},id:"GRACE_AMOUNT"}),t.paymentAmount&&e.push({amount:{amount:t.paymentAmount.amount,currency:t.paymentAmount.currency},id:"PAYMENT_AMOUNT"}),t.specificAmounts=e}_mappingSpecificAmountScheduledPayments(t){const e=[];return t.capital&&e.push({amount:{amount:t.capital.amount,currency:t.capital.currency},id:"CAPITAL"}),t.downPayment&&e.push({amount:{amount:t.downPayment.amount,currency:t.downPayment.currency},id:"DOWN_PAYMENT"}),t.installmentAmount&&e.push({amount:{amount:t.installmentAmount.amount,currency:t.installmentAmount.currency},id:"PAYMENT_AMOUNT"}),t.interest&&e.push({amount:{amount:t.interest.amount,currency:t.interest.currency},id:"INTEREST"}),t.total&&e.push({amount:{amount:t.total.amount,currency:t.total.currency},id:"TOTAL"}),e}_mappingFeesScheduledPayments(t){return{totalFees:t.totalFees||{amount:t.amount,currency:t.currency},itemizeFees:[{itemizeFeeUnit:{unitType:"AMOUNT",amount:t.amount,currency:t.currency}}]}}_mappingInstallments(t){if(t.installments||(t.installments=[]),t.scheduledPayments){t.installments=[];for(let e=0;e<t.scheduledPayments.length;e+=1)t.installments.push({id:t.scheduledPayments[e].installmentNumber||e,number:t.scheduledPayments[e].installmentNumber||e,maturityDate:t.scheduledPayments[e].maturityDate,specificAmounts:this._mappingSpecificAmountScheduledPayments(t.scheduledPayments[e]),fees:this._mappingFeesScheduledPayments(t.scheduledPayments[e].fee)});delete t.scheduledPayments}return t.installments}_mappingRelatedContractsV1(t){const e=Array.isArray(t)?t:[t];if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++)this._renameProperty(e[t],"relatedContractId","id"),this._renameProperty(e[t],"numberType.name","description"),this._renameProperty(e[t],"relationType.name","description"),e[t].product&&!e[t].product.productType&&(e[t].product.productType={id:e[t].product.id,description:e[t].product.name},e[t].product.id="",e[t].product.name="");return e}_mappingRelatedContractsV2(t){const e=Array.isArray(t)?t:[t];if("0"==this.version)this._mappingRelatedContractsV1(e),this._commonChanges(e);else if("1"==this.version){this._commonChanges(e);for(let t=0;t<e.length;t++)this._removeFields(["relatedCardId","relatedCardNumber","status","physicalSupport","subProductType"],e[t])}return e}_commonChanges(t){if(Object.keys(t).length)for(let e=0;e<t.length;e++)t[e]={...t[e],contractDetails:{contractType:"INTERNAL_CONTRACT"}},t[e].contractId&&(t[e].contractDetails={...t[e].contractDetails,contractId:t[e].contractId},this._removeFields(["contractId"],t[e])),t[e].number&&(t[e].contractDetails={...t[e].contractDetails,number:t[e].number},this._removeFields(["number"],t[e])),t[e].numberType&&(t[e].contractDetails={...t[e].contractDetails,numberType:t[e].numberType},this._removeFields(["numberType"],t[e])),t[e].product&&(t[e].contractDetails={...t[e].contractDetails,product:t[e].product},this._removeFields(["product"],t[e]));return t}_renameQueryParam(t,e,i){e in t&&(t[i]=t[e],delete t[e])}}class Vt extends Rt{static get is(){return"bbva-global-card-base-api-dm"}resetCard(){this.card={}}getCard(t,e){e=Object.assign({"card-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}Card`,this._getBgadp(a))}_getBgadp(t){return{getCardV0:()=>new a(t),getCardV1:()=>new r(t),getCardV2:()=>new n(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t.activations&&(t.activations=this._mappingActivationsV2(t.activations)),t.indicators&&(t.indicators=this._mappingIndicators(t.indicators)),t.paymentMethods&&(t.paymentMethods=this._mappingPaymentMethodsV2(t.paymentMethods)),t.relatedContracts&&(t.relatedContracts=this._mappingRelatedContractsV2(t.relatedContracts)),"0"==this.version&&(this._cannonizerV0(t),this._cannonizerCommon(t)),"1"==this.version&&(this._cannonizerCommon(t),this._cannonizerV1(t)),t}_cannonizerV0(t){this._mappingBrandAssociation(t),this._mappingCardType(t),this._mappingId(t),this._mappingNumberType(t),this._mappingPhysicalSupport(t),this._mappingTitleToProduct(t),t.rates&&(t.rates={itemizeRates:this._mappingItemizeRates(t.rates)}),this._mappingStatus(t),t.formats&&t.formats.forEach((t=>{this._renameProperty(t.numberType,"name","description")})),this._removeFields(["deliveriesManagement","delivery","membership","contractId","companyEmbossingNameType","customCompanyEmbossingName"],t)}_cannonizerCommon(t){if(t.availableBalance&&this._canonBalances(t.availableBalance),t.disposedBalance&&this._canonBalances(t.disposedBalance),t.cardType){switch(t.cardType.id){case"DEBIT_CARD":this._physicalSupportCanon(t),this._holderNameCanon(t),this._availableBalanceCanon(t);break;case"CREDIT_CARD":this._physicalSupportCanon(t),this._holderNameCanon(t),this._availableBalanceCanon(t),t.disposedBalance&&(t.cardType.disposedBalance=t.disposedBalance),"1"==this.version&&t.paymentType&&(t.cardType.paymentType=t.paymentType),"1"==this.version&&t.operationNumber&&(t.cardType.operationNumber=t.operationNumber),t.grantedCredits&&(t.cardType.grantedCredits=t.grantedCredits);break;case"PREPAID_CARD":this._physicalSupportCanon(t),this._holderNameCanon(t),this._removeFields(["pendingBalances","postedBalances"],t.availableBalance)}}t.product.subproduct&&(this._renameProperty(t.product,"subproduct","subProduct"),this._removeFields(["description"],t.product.subProduct)),t.status.lastUpdatedDate&&this._renameProperty(t.status,"lastUpdatedDate","lastUpdateDate"),this._renameProperty(t.status.reason,"name","description"),this._removeFields(["disposedBalance","commercialPackage","contractingBranch","grantedCredits","supportContractType","contractingBusinessAgent","dependencyValue","managementBranch","marketBusinessAgent","holderName","physicalSupport"],t)}_cannonizerV1(t){t.fees&&t.fees.itemizeFees.length&&t.fees.itemizeFees.forEach((e=>{this._renameProperty(e,"itemizeFeeUnit","itemizeFeesUnit"),e.itemizeFeesUnit.percentage&&(e.itemizeFeesUnit={...e.itemizeFeesUnit,unitFeeType:"PERCENTAGE"}),e.itemizeFeesUnit.amount&&(e.itemizeFeesUnit={...e.itemizeFeesUnit,unitFeeType:"AMOUNT"}),this._removeFields(["totalFees"],t.fees)})),t.image&&(t.image.link={href:t.image.url},this._removeFields(["url"],t.image)),this._removeFields(["hasPendingDelivery"],t.cardType.physicalSupport),this._removeFields(["chargeAccounts","paymentMethod"],t.nextFinancialStatement),this._removeFields(["totalRates"],t.rates),this._removeFields(["classification"],t.product),this._removeFields(["paymentType","bankIdentificationNumber","companyEmbossing","contractingCart","coupons","hiringOrigin","operationDate","operationNumber","offerId","technologyPayments","initialExpirationDate","offerRecalculationType","staticFeatures"],t)}_paramsMapping(t){if(("0"==this.version||"1"==this.version)&&(this._customerIdRemover(t),t.expand))switch(t.expand){case"activations":this._removeFields(["activations.customerId"],t);break;case"indicators":this._removeFields(["indicators.customerId"],t),t["indicators.id"]&&(t["indicators.id"]=t["indicators.id"].toString());break;case"payment-methods":this._removeFields(["payment-methods.customerId"],t);break;case"related-contracts":this._removeFields(["related-contracts.customerId"],t)}return t}_physicalSupportCanon(t){if(t.hasOwnProperty("physicalSupport"))return t.cardType.physicalSupport=t.physicalSupport,this._removeFields(["physicalSupport"],t),t}_holderNameCanon(t){if(t.hasOwnProperty("holderName"))return t.cardType.holderName=t.holderName,this._removeFields(["holderName"],t),t}_availableBalanceCanon(t){t.hasOwnProperty("availableBalance")&&(t.cardType.availableBalance={postedBalances:t.availableBalance.postedBalances,pendingBalances:t.availableBalance.pendingBalances}),this._removeFields(["postedBalances","pendingBalances"],t.availableBalance)}_canonBalances(t){return t.currentBalances&&t.currentBalances.forEach((t=>{t.amount={amount:t.amount,currency:t.currency},this._removeFields(["currency"],t),t.breakDown&&(t.localCurrencyEquivalent=t.breakDown.localCurrencyEquivalent,this._removeFields(["breakDown"],t))})),t}}i(Vt,"GET_EVENTS",{customEvent:"card-api-dm-fetch",errorFireEventHandler:"card-api-dm-fetch-error"}),customElements.define(Vt.is,Vt);class zt extends Rt{static get is(){return"bbva-global-card-api-dm"}static get properties(){return{card:{type:Object,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object}}}constructor(){super(),this.card={},this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages"],this._modules={Mx:()=>import("./eaf51774.js")}}update(t){super.update(t),t.forEach(((t,e)=>{"country"===e&&this.country&&this.country!==t?this._loadModule():"_module"!==e&&this._module&&this[e]!==t&&(this._module[e]=this[e])}))}async _loadModule(){const t=this._capitalize(this.country);if(this._countries.includes(t)&&this._modules[t]){const e=`BbvaCard${t}ApiDm`;(0,this._modules[t])().then((async t=>{const i=t[e].is;this._module=this._createModuleElement(i),await this.updateComplete,this._dispatchEvent("bbva-global-card-api-dm-module-load")})).catch((async t=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-card-api-dm-module-error",t)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(t){return t.charAt(0).toUpperCase()+t.slice(1).toLowerCase()}_createModuleElement(t=Vt.is){const e=document.createElement(t);return this._bindConfig(e),e}async _bindConfig(t){this._configProperties.forEach((e=>{t[e]=this[e]})),await this.updateComplete}_dispatchEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{detail:e,bubbles:!0,composed:!0}))}async resetCard(){await this.module.updateComplete,this.module.resetCard()}async getCard(t,e={}){await this.module.updateComplete,Object.keys(this.card).length||this.module.getCard(t,e)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return C` ${this._module?this._module:""}`}}class Gt extends Rt{static get is(){return"bbva-global-cards-base-api-dm"}resetCards(){this.cards=[]}getCards(t){this._mappingCardsParams(t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}Cards`,this._getBgadp(a))}_getBgadp(t){return{getCardsV1:()=>new s(t),getCardsV0:()=>new o(t),default:()=>"BGADP does not exist."}}_responseMapping(t={}){for(let e=0;e<t.length;e+=1)this._mappingCannonical(t[e]);return t}_paginationMapping(t){return t}_mappingCannonical(t){return this._mappingBrandAssociation(t),this._mappingCardAgreement(t),this._mappingCardType(t),this._mappingCompanyEmbossing(t),this._mappingId(t),this._mappingNumberType(t),this._mappingPhysicalSupport(t),this._mappingStatus(t),this._mappingTitleToProduct(t),t.conditions&&(t.conditions=this._mappingConditionsV1(t.conditions)),t.activations&&(t.activations=this._mappingActivationsV1(t.activations)),t.relatedContracts&&(t.relatedContracts=this._mappingRelatedContractsV1(t.relatedContracts)),t.transactions&&(t.transactions=this._mappingCardTransactions(t.transactions)),t.indicators&&(t.indicators=this._mappingIndicators(t.indicators)),t.participants&&(t.participants=this._mappingParticipants(t.participants)),t.paymentMethods&&(t.paymentMethods=this._mappingPaymentMethodsV1(t.paymentMethods)),t}}i(Gt,"GET_EVENTS",{customEvent:"cards-api-dm-fetch",paginationEvent:"cards-api-dm-pagination",errorFireEventHandler:"cards-api-dm-fetch-error"}),customElements.define(Gt.is,Gt);class Ut extends Rt{static get is(){return"bbva-global-card-transactions-base-api-dm"}resetCardTransactions(){this.cardTransactions=[]}getCardTransactions(t,e){this._paramsMapping(e),e=Object.assign({"card-id":t},e),this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}CardTransactions`,this._getBgadp(a))}_getBgadp(t){return{getCardTransactionsV0:()=>new c(t),getCardTransactionsV1:()=>new d(t),getCardTransactionsV2:()=>new l(t),default:()=>"BGADP does not exist."}}_paramsMapping(t){return this._paramsMappingCanonical(t),t}_responseMapping(t){return this._responseMappingCanonical(t),t}_responseMappingCanonical(t){return"1"==this.version&&Array.isArray(t)?t.forEach((t=>{this._removeFields(["fundsOrigin","transactionOrigin"],t),this._removeFields(["postedBalance","reportingBalance","authorizedBalance","hold"],t.additionalInformation),t.contract.bank&&t.contract.bank.branch&&(t.branch=t.contract.bank.branch),this._responseCommonFields(t)})):"0"==this.version&&Array.isArray(t)&&t.forEach((t=>{this._responseCommonFields(t),t.classification&&(this._removeFields(["pfmId","customName"],t.classification),this._removeFields(["customName"],t.classification.category),this._removeFields(["customName"],t.classification.category.subcategory)),this._renameProperty(t,"originChannel","paymentChannel"),this._removeFields(["transactionMode"],t.transactionType)})),t}_responseCommonFields(t){return this._renameProperty(t,"valuationDate","valueDate"),this._renameProperty(t,"contract.numberType.name","description"),t.localAmount&&(t.operationAmounts=[{id:"LOCAL_AMOUNT",...t.localAmount}],delete t.localAmount),t.originAmount&&(t.operationAmounts=[t.operationAmounts[0],{id:"ORIGIN_AMOUNT",...t.originAmount}],delete t.originAmount),t.additionalInformation&&t.additionalInformation.updatedBalance&&(t.additionalInformation.updatedBalance=[{id:"UPDATED_BALANCE",...t.additionalInformation.updatedBalance}],this._renameProperty(t,"additionalInformation.updatedBalance","balances")),this._removeFields(["product","bank"],t.contract),this._removeFields(["updateDate"],t.status),this._removeFields(["category","exchangeRate"],t),t}_paramsMappingCanonical(t){return"1"==this.version?this._paramsCommonFields(t):"0"==this.version&&(this._paramsCommonFields(t),this._removeFields(["moneyFlow.id","financingType.id"],t)),t}_paramsCommonFields(t){return this._removeFields(["customerId"],t),t["transactionType.id"]&&(t["transactionType.id"]=t["transactionType.id"].toString()),t["status.id"]&&(t["status.id"]=t["status.id"].toString()),t["operationAmount.id"]&&"LOCAL_AMOUNT"===t["operationAmount.id"]?(t["operationAmount.fromAmount"]&&this._renameQueryParam(t,"operationAmount.fromAmount","fromLocalAmount.amount"),t["operationAmount.toAmount"]&&this._renameQueryParam(t,"operationAmount.toAmount","toLocalAmount.amount"),t["operationAmount.currency"]&&this._renameQueryParam(t,"operationAmount.currency","localAmount.currency"),this._removeFields(["operationAmount.id"],t)):this._removeFields(["operationAmount.id","operationAmount.fromAmount","operationAmount.toAmount","operationAmount.currency"],t),t}}i(Ut,"GET_EVENTS",{customEvent:"card-transactions-api-dm-fetch",paginationEvent:"card-transactions-api-dm-pagination",errorFireEventHandler:"card-transactions-api-dm-fetch-error"}),customElements.define(Ut.is,Ut);class jt extends Rt{static get is(){return"bbva-global-card-offer-options-base-api-dm"}resetCardOfferOptions(){this.cardOfferOptions=[]}getCardOfferOptions(t,e,i){i=Object.assign({"card-id":t,"offer-id":e},i),this._generateGetService(this._getService("get",{},i),this.constructor.GET_EVENTS,this._responseMapping,i.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}CardOfferOptions`,this._getBgadp(a))}_getBgadp(t){return{getCardOfferOptionsV1:()=>new p(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}i(jt,"GET_EVENTS",{customEvent:"card-offer-options-api-dm-fetch",errorFireEventHandler:"card-offer-options-api-dm-fetch-error"}),customElements.define(jt.is,jt);class Ht extends Rt{static get is(){return"bbva-global-card-offer-option-base-api-dm"}resetCardOfferOption(){this.cardOfferOption={}}getCardOfferOption(t,e,i,a){a=Object.assign({"card-id":t,"offer-id":e,"option-id":i},a),this._generateGetService(this._getService("get",{},a),this.constructor.GET_EVENTS,this._responseMapping,a.fields)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}CardOfferOption`,this._getBgadp(a))}_getBgadp(t){return{getCardOfferOptionV1:()=>new h(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}i(Ht,"GET_EVENTS",{customEvent:"card-offer-option-api-dm-fetch",errorFireEventHandler:"card-offer-option-api-dm-fetch-error"}),customElements.define(Ht.is,Ht);class qt extends Rt{static get is(){return"bbva-global-card-offer-option-redeems-base-api-dm"}postCardOfferOptionRedeems(t,e,i,a){const r={"card-id":t,"offer-id":e,"option-id":i};this._generateGetService(this._getService("post",a,r),this.constructor.POST_EVENTS,this._responseMapping)}_getService(t,e={},i={}){const a=this._getServiceParams(i,e);return this._getServicePath(`${t}CardOfferOptionRedeems`,this._getBgadp(a))}_getBgadp(t){return{postCardOfferOptionRedeemsV1:()=>new m(t),default:()=>"BGADP does not exist."}}_responseMapping(t){return t}}i(qt,"POST_EVENTS",{customEvent:"card-offer-option-redeems-api-dm-create",errorFireEventHandler:"card-offer-option-redeems-api-dm-create-error"}),customElements.define(qt.is,qt);class Wt{static get defaultProperties(){return{bodyText:"",buttonText:"",fullHeight:!1,headerText:"",headerType:"",hideContentPaddingTop:!1,linkText:"",modalType:"info",titleIcon:"",titleText:""}}constructor(t,e={}){this.controller=t,this.properties=e}get modalName(){var t;return null===(t=this.controller)||void 0===t?void 0:t.mode}get properties(){return{...Wt.defaultProperties,...this._properties}}set properties(t){return this._properties={...t},this._properties}cancelModal(){var t;null===(t=this.controller)||void 0===t||t.cancelModal()}retryOperative(){this.dispatchCustomEvent("payments-third-party-wallet-provisioning-modal-retry",this.modalName)}phoneCall(){this.dispatchCustomEvent("payments-third-party-wallet-provisioning-modal-phone-call")}phoneCallOrExit(){var t;null!==(t=this.controller)&&void 0!==t&&t.hasPhoneNumber?this.phoneCall():this.exitOperative()}exitOperative(){this.dispatchCustomEvent("payments-third-party-wallet-provisioning-modal-call-exit",this.modalName)}dispatchCustomEvent(t,e=!0){var i;null===(i=this.controller)||void 0===i||i.dispatchCustomEvent(t,e)}}class Yt extends Wt{constructor(t,e){super(t,{modalType:"warning",titleIcon:f(),titleText:`payments-third-party-wallet-provisioning-modal-${null==t?void 0:t.mode}-title`,bodyText:`payments-third-party-wallet-provisioning-modal-${null==t?void 0:t.mode}-body`,buttonText:"payments-third-party-wallet-provisioning-modal-retry",linkText:"payments-third-party-wallet-provisioning-modal-exit",...e})}footerButtonClick(){this.retryOperative()}footerLinkClick(){this.cancelModal()}veilClick(){this.cancelModal()}}class Qt extends Yt{constructor(t){super(t,{titleText:"payments-third-party-wallet-provisioning-modal-fail-title",bodyText:"payments-third-party-wallet-provisioning-modal-fail-body"})}}class Kt extends Wt{constructor(t,e,i=!1){const{buttonText:a="payments-third-party-wallet-provisioning-modal-phone-call",linkText:r="payments-third-party-wallet-provisioning-modal-exit",...n}=e;super(t,{modalType:"warning",titleIcon:f(),fullHeight:!0,headerType:"modal-three-level",headerText:`payments-third-party-wallet-provisioning-feature-header-main-title-${null==t?void 0:t.wallet}`,...!i&&t.hasPhoneNumber?{buttonText:a,linkText:r}:{buttonText:r},...n}),this.disableCallToBank=i}footerButtonClick(){this.phoneCallOrExit()}footerLinkClick(){this.cancelModal()}closeButtonClick(){this.footerLinkClick()}}class Jt extends Kt{constructor(t){super(t,{titleText:"payments-third-party-wallet-provisioning-modal-fail-title",bodyText:"payments-third-party-wallet-provisioning-modal-fail-last-body"})}}class Xt extends Wt{constructor(t){super(t,{modalType:"info",titleIcon:_(),titleText:"payments-third-party-wallet-provisioning-modal-logout-title",bodyText:null!=t&&t.isGoogleWallet?"payments-third-party-wallet-provisioning-modal-logout-body-google":"payments-third-party-wallet-provisioning-modal-logout-body-apple",buttonText:"payments-third-party-wallet-provisioning-modal-continue",linkText:"payments-third-party-wallet-provisioning-modal-cancel"})}footerButtonClick(){this.dispatchCustomEvent("payments-third-party-wallet-provisioning-modal-logout")}}class Zt extends Yt{constructor(t){super(t,{titleText:"payments-third-party-wallet-provisioning-modal-fail-plugin-title",bodyText:"payments-third-party-wallet-provisioning-modal-fail-plugin-body"})}footerLinkClick(){this.exitOperative()}veilClick(){this.exitOperative()}}class te extends Yt{constructor(t){super(t,{titleText:"payments-third-party-wallet-provisioning-modal-fail-plugin-title",bodyText:"payments-third-party-wallet-provisioning-modal-fail-plugin-last-body",buttonText:"payments-third-party-wallet-provisioning-accessibility-text-icon-back",linkText:""})}footerButtonClick(){this.exitOperative()}veilClick(){this.exitOperative()}}class ee extends Kt{constructor(t){super(t,{titleText:"payments-third-party-wallet-provisioning-modal-fail-title",bodyText:"payments-third-party-wallet-provisioning-modal-fail-last-body"})}footerButtonClick(){var t;null!==(t=this.controller)&&void 0!==t&&t.hasPhoneNumber?this.phoneCall():this.cancelModal()}footerLinkClick(){this.cancelModal()}}class ie extends Yt{constructor(t){super(t,{titleText:"payments-third-party-wallet-provisioning-modal-app-missing-title",bodyText:"payments-third-party-wallet-provisioning-modal-app-missing-body",buttonText:"payments-third-party-wallet-provisioning-modal-app-missing-button",linkText:""})}footerButtonClick(){this.dispatchCustomEvent("payments-third-party-wallet-provisioning-modal-app-missing")}}var ae=u`
  :host {
    background-color: var(
      --payments-third-party-wallet-provisioning-dark-mode-bg-color,
      var(--colorsPrimaryCoreLightened, ${P(E.primaryCoreLightened)})
    );
  }

  :host([visible]),
  [visible] {
    display: block;
    box-sizing: border-box;
    min-height: 100vh;
  }
`;class re extends(M(j(w(e)))){static get scopedElements(){const t=[H,Qt,Jt,Xt,Zt,te,ee,ie];return re.scopedElementsFromClasses(t)}static get MODES(){return{fail:"fail",failLast:"fail-last",logout:"logout",failPlugin:"fail-plugin",failPluginLast:"fail-plugin-last",failLastNoExit:"fail-last-no-exit",appMissing:"app-missing"}}static get is(){return"payments-third-party-wallet-provisioning-modal"}static get properties(){return{visible:{type:Boolean,reflect:!0},mode:{type:String,attribute:"mode",reflect:!0},wallet:{type:String,attribute:"wallet"},hasPhoneNumber:{type:Boolean,attribute:"has-phone-number"}}}static get styles(){return[ae,T("payments-third-party-wallet-provisioning-modal-shared-styles")]}constructor(){super(),this.visible=!1,this.mode="",this.wallet="google",this.hasPhoneNumber=!1,this._computedParts={},this._regenerateProperties=["hasPhoneNumber","wallet"],this._resetConfig(),this._listeners(),this._generateParts()}update(t){this._regenerateProperties.some((e=>t.has(e)))&&this._generateParts(),t.has("mode")&&this._configs(),super.update(t)}get _part(){return this.mode in this._computedParts?this._computedParts[this.mode]:null}_generateParts(){const t=re.MODES;this._computedParts={[t.fail]:new Qt(this),[t.failLast]:new Jt(this),[t.logout]:new Xt(this),[t.failPlugin]:new Zt(this),[t.failPluginLast]:new te(this),[t.failLastNoExit]:new ee(this),[t.appMissing]:new ie(this)}}_configs(){this._part&&Object.assign(this,this._part.properties)}_listeners(){this.addEventListener("header-main-icon-left-primary-click",(t=>{t.stopPropagation()})),this.addEventListener("header-main-icon-right-primary-click",(t=>{t.stopPropagation()}))}_resetConfig(){Object.assign(this,Wt.defaultProperties)}_changeVisible(t){const e=t.detail;this.visible=e,this.dispatchCustomEvent("payments-third-party-wallet-provisioning-modal-status",{visible:e,mode:this.mode}),this.dispatchCustomEvent(`payments-third-party-wallet-provisioning-modal-${this.mode}-${e?"open":"close"}`)}_footerButtonClick(t){var e,i;null===(e=this._part)||void 0===e||null===(i=e.footerButtonClick)||void 0===i||i.call(e,t)}_footerLinkClick(t){var e,i;(t.stopPropagation(),null!==(e=this._part)&&void 0!==e&&e.footerLinkClick)?null===(i=this._part)||void 0===i||i.footerLinkClick(t):this.cancelModal()}_closeButtonClick(t){var e,i,a;(null==t||null===(e=t.stopPropagation)||void 0===e||e.call(t),null!==(i=this._part)&&void 0!==i&&i.closeButtonClick)?null===(a=this._part)||void 0===a||a.closeButtonClick(t):this.cancelModal()}_veilClick(t){var e,i,a;(null==t||null===(e=t.stopPropagation)||void 0===e||e.call(t),null!==(i=this._part)&&void 0!==i&&i.veilClick)?null===(a=this._part)||void 0===a||a.veilClick(t):this.cancelModal()}cancelModal(){this.dispatchCustomEvent("payments-third-party-wallet-provisioning-modal-cancel",{mode:this.mode}),this.closeModal()}nativeButtonClick(){this._closeButtonClick()}closeModal(){this.visible=!1}get isGoogleWallet(){return"google"===this.wallet}dispatchCustomEvent(t,e=!0){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_renderModal(){return C`
      <bbva-help-modal
        header-type="${this.headerType}"
        title-icon="${this.titleIcon}"
        modal-type=${this.modalType}
        title-text="${this.t(this.titleText)}"
        header-text="${this.t(this.headerText)}"
        body-text="${this.t(this.bodyText)}"
        button-text="${this.t(this.buttonText)}"
        link-text="${this.t(this.linkText)}"
        ?full-height="${this.fullHeight}"
        ?hide-content-padding-top="${this.hideContentPaddingTop}"
        ?visible="${this.visible}"
        @visible-changed="${this._changeVisible}"
        fixed-footer
        accessibility-text-icon-left-primary="${this.t("payments-third-party-wallet-provisioning-accessibility-text-icon-close")}"
        accessibility-text-icon-right-primary="${this.t("payments-third-party-wallet-provisioning-accessibility-text-icon-close")}"
        @help-modal-footer-button-click="${this._footerButtonClick}"
        @help-modal-footer-link-click="${this._footerLinkClick}"
        @help-modal-header-right-primary-click="${this._closeButtonClick}"
        @help-modal-veil-click="${this._veilClick}"
      >
      </bbva-help-modal>
    `}render(){return this._renderModal()}}const ne={default:{retry:re.MODES.fail,last:re.MODES.failLast},plugin:{retry:re.MODES.failPlugin,last:re.MODES.failPluginLast},noExit:{retry:re.MODES.fail,last:re.MODES.failLastNoExit}};var se=u`
  :host {
    display: block;
    box-sizing: border-box;
    background-color: var(
      --payments-third-party-wallet-provisioning-dark-mode-bg-color,
      var(--colorsPrimaryCoreLightened, ${P(E.primaryCoreLightened)})
    );
    min-height: 100vh;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  .devices-container {
    text-align: left;
    margin: calc(
      (
          (2 * var(--gridSpacerVariant, var(--gridSpacer, ${P(W.spacer)}))) /
            16
        ) * 1rem
    );
  }
  .devices-container [data-tag-name='bbva-link'] {
    padding-top: calc(
      (
          (2 * var(--gridSpacerVariant, var(--gridSpacer, ${P(W.spacer)}))) /
            16
        ) * 1em
    );
  }

  .devices-container-nodevices {
    margin-top: 0;
  }

  .badge-heading {
    font-weight: var(
      --fontFacePrimaryMediumFontWeight,
      ${P(q.medium.fontWeight)}
    );
    font-style: var(
      --fontFacePrimaryMediumFontStyle,
      ${P(q.medium.fontStyle)}
    );
  }

  .footer {
    bottom: 0;
    left: 0;
    width: 100%;
    margin-bottom: calc(
      (
          (3 * var(--gridSpacerVariant, var(--gridSpacer, ${P(W.spacer)}))) /
            16
        ) * 1rem
    );
    display: flex;
    justify-content: center;
  }
  .footer [data-tag-name='bbva-core-image'] {
    position: absolute;
    bottom: 1.5rem;
  }

  .footer-image-and-message {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    text-align: center;
  }
  .footer-image-and-message [data-tag-name='bbva-core-image'] {
    position: relative;
    bottom: 0;
  }

  [data-tag-name='bbva-divider'] {
    display: block;
    margin: calc(
        (
            (2 * var(--gridSpacerVariant, var(--gridSpacer, ${P(W.spacer)}))) /
              16
          ) * 1rem
      )
      0;
  }

  [data-tag-name='bbva-clip-card-data'] {
    text-align: left;
    margin: calc(
        (
            (3 * var(--gridSpacerVariant, var(--gridSpacer, ${P(W.spacer)}))) /
              16
          ) * 1rem
      )
      auto
      calc(
        (
            (2 * var(--gridSpacerVariant, var(--gridSpacer, ${P(W.spacer)}))) /
              16
          ) * 1rem
      );
  }

  [data-tag-name='bbva-notification-message'] {
    margin: calc(
        (
            (4 * var(--gridSpacerVariant, var(--gridSpacer, ${P(W.spacer)}))) /
              16
          ) * 1rem
      )
      calc(
        (
            (2 * var(--gridSpacerVariant, var(--gridSpacer, ${P(W.spacer)}))) /
              16
          ) * 1rem
      )
      0;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }
`;class oe extends(M(Mt(j(w(e))))){static get is(){return"payments-third-party-wallet-provisioning"}static get deviceStatus(){return{added:"ADDED",notAdded:"NOT_ADDED",pending:"PENDING_VERIFICATION"}}static get scopedElements(){const t=[Y,dt,Q,K,J,X,D,Z,zt,_t,ut,ft,re,...oe.configurationScopedElements()];return oe.scopedElementsFromClasses(t)}static get properties(){return{walletImg:{type:String,attribute:"wallet-img"},cardApiVersion:{type:String,attribute:"card-api-version"},cardData:{type:Object,attribute:"card-data"},cardId:{type:String,attribute:"card-id"},devices:{type:Array},hubPaymentsApiVersion:{type:String,attribute:"hub-payments-api-version"},maxTries:{type:Number,attribute:"max-tries"},nonce:{type:String},nonceSignature:{type:String,attribute:"nonce-signature"},phoneNumber:{type:String,attribute:"phone-number"},cardImageId:{type:String,attribute:"card-image-id"},publicCertificateId:{type:String,attribute:"public-certificate-id"},_lastServiceCalled:{type:Object,noAccessor:!0},_modalVisible:{type:Boolean},_modalMode:{type:String},_retries:{type:Number},_verifiedDevices:{type:Array},wallet:{type:String},dataBodyApiGoogle:{type:Object},handleLogout:{type:Boolean},dataHubGoogle:{type:Object},country:{type:String},errorData:{type:Object,attribute:"error-data"}}}static get styles(){return[se,tt.light,et.light,it.light,at.light,O.light,lt.light,T("payments-third-party-wallet-provisioning-shared-styles")]}constructor(){super(),this.devices=[],this._verifiedDevices=[],this.maxTries=3,this.nonce="",this.nonceSignature="",this.publicCertificateId="",this.requiredToken="tsec",this.cardApiVersion="0",this.hubPaymentsApiVersion="1",this.walletImg="",this.cardData={},this.cardId="",this.phoneNumber="",this.cardImageId="FRONT_CARD",this._modalVisible=!1,this._modalMode="",this._retries=0,this._lastServiceCalled={},this.dataBodyApiGoogle={},this.handleLogout=!1,this.dataHubGoogle={},this.wallet="",this.country="",this.errorData={},this._configHeader(),this.addEventListener("header-main-icon-right-primary-click",(()=>this.navigateBack()))}_configHeader(){this.config={header:{fixed:!0,accessibilityTextIconRightPrimary:this.t("payments-third-party-wallet-provisioning-accessibility-text-icon-close"),accessibilityTextIconLeftPrimary:this.t("payments-third-party-wallet-provisioning-accessibility-text-icon-close"),iconRightPrimary:rt(),text:this.isGoogleWallet?this.t("payments-third-party-wallet-provisioning-feature-header-main-title-google"):this.t("payments-third-party-wallet-provisioning-feature-header-main-title-apple")},notify:{fixedBottom:!0},loader:{spinnerMessageLabel:"payments-third-party-wallet-provisioning-loader-label"}}}updated(t){var e;const i=t.get("cardId");t.has("cardId")&&this.cardId!==i&&!Object.keys(this.cardData).length&&this.cardId&&(this._getCardData(this.cardId),this._configHeader()),t.has("cardData")&&null!==(e=this.cardData)&&void 0!==e&&e.number&&(this._retries=0,this.requestDeviceList(),this._configHeader()),super.updated(t)}get cardDm(){return this._cardDm||(this._cardDm=this.renderRoot.querySelector("#cardDm")),this._cardDm}get cardType(){var t,e;return{DEBIT_CARD:"debit",CREDIT_CARD:"credit",PREPAID_CARD:"prepay"}[null===(t=this.cardData)||void 0===t||null===(e=t.cardType)||void 0===e?void 0:e.id]||"default"}get devicesComputed(){var t;return((this.isGoogleWallet&&0!==this.devices.length?[{name:"",status:null===(t=this.devices)||void 0===t?void 0:t.status}]:this.devices)||[]).map((({name:t,status:e})=>({name:t,status:this._verifiedDevices.includes(t)?oe.deviceStatus.added:e})))}get expirationDateFormatted(){var t;return moment(null===(t=this.cardData)||void 0===t?void 0:t.expirationDate).format("YYYY-MM")}get hasSomeDeviceNotAdded(){return this.devicesComputed.some((({status:t})=>t===oe.deviceStatus.notAdded))}get hasSomeDeviceAdded(){return this.devicesComputed.some((({status:t})=>t===oe.deviceStatus.added))}get hasUrlImage(){var t,e;return null===(t=this.cardData)||void 0===t||null===(e=t.images)||void 0===e?void 0:e.some((t=>t.id===this.cardImageId))}get isGoogleWallet(){return"google"===this.wallet}get isLastTry(){return this._retries<this.maxTries||this._dispatch("payments-third-party-wallet-provisioning-last-try"),!(this._retries<this.maxTries)}get pushDm(){return this._pushDm||(this._pushDm=this.renderRoot.querySelector("#pushDm")),this._pushDm}get verifyDm(){return this._verifyDm||(this._verifyDm=this.renderRoot.querySelector("#verifyDm")),this._verifyDm}addToPayWallet(){if(this._setLastServiceCall("addToPayWallet"),this.isGoogleWallet)this.pushDm.postTokensThirdPartyWalletsGooglePush(this.dataBodyApiGoogle);else{this._dispatch("payments-third-party-wallet-provisioning-add-to-wallet-click");const{number:t="",numberType:e=""}=this.cardData;this.pushDm.postTokensThirdPartyWalletsPush({number:t,numberType:{id:e.id},expirationDate:this.expirationDateFormatted,publicCertificates:[{id:this.publicCertificateId}],nonce:this.nonce,nonceSignature:this.nonceSignature})}}_callConnectGoogle(){this._setLastServiceCall("_callConnectGoogle"),this._dispatch("payments-third-party-wallet-provisioning-add-to-wallet-click"),this.showLoader("full",!0,!1);const{holderName:t=""}=this.cardData,{number:e="",numberType:i="",expirationDate:a=""}=this.cardData;this.dataBodyApiGoogle={number:e,numberType:{id:i.id},expirationDate:moment(a).format("YYYY-MM"),country:{id:this.country},...t.length?{numberHolderName:t}:{},...this.dataBodyApiGoogle};const r=e.replace(/ /g,"").slice(-4);this._dispatch("payments-third-party-wallet-get-push-data",r)}getDataConnectorGoogleSuccess(t){const{deviceId:e="",walletId:i=""}=t;this.dataBodyApiGoogle={clientWalletAccount:{id:i},device:{id:e},...this.dataBodyApiGoogle},this.addToPayWallet()}navigateBack(){this._dispatch("payments-third-party-wallet-provisioning-back-step")}navigateExit(){this._dispatch("payments-third-party-wallet-provisioning-navigate-exit")}requestDeviceList(){this._setLastServiceCall("requestDeviceList",{},ne.plugin);const{number:t=""}=this.cardData;this._dispatch("payments-third-party-wallet-provisioning-request-devices",this.isGoogleWallet?t:{pan:t})}reset(){this.cardData={},this.cardId="",this.devices=[],this._lastServiceCalled={},this._modalVisible=!1,this._modalMode="",this._retries=0,this.errorData={}}successCardPush(){this._retries=0,this.requestDeviceList(),this.showNotify(this.t("payments-third-party-wallet-provisioning-success-push"),null,"success",3e3)}verifyDevice(t){this._setLastServiceCall("verifyDevice",t),this._dispatch("payments-third-party-wallet-provisioning-verify-click"),this.showLoader();const{number:e="",numberType:i=""}=this.cardData;this.verifyDm.postTokensThirdPartyWalletsVerify({number:e,numberType:{id:i.id},expirationDate:this.expirationDateFormatted})}_changeModalStatus({detail:t}){const e=null==t?void 0:t.visible;this._modalVisible=e}_handleCardFetch(t){this._retries=0;const{detail:e}=t;this.cardData=e,this.clearLoader()}_handleDeviceVerify(){var t;this._verifiedDevices.push(null===(t=this._getLastServiceCallParams())||void 0===t?void 0:t.name),this.clearLoader(),this._retries=0,this._dispatch("payments-third-party-wallet-provisioning-verify-success"),this.requestDeviceList(),this.showNotify(this.t("payments-third-party-wallet-provisioning-success-verify"),null,"success",3e3)}_handlePush(){var t;this._setLastServiceCall("_handlePush",{},ne.noExit);const{number:e="",numberType:i="",cardType:a="",id:r=""}=this.cardData,n=e.replace(/ /g,""),s=n.slice(-4);this._dispatch("payments-third-party-wallet-provisioning-push-success",{holderName:a.holderName,pan:n,panTruncated:s,numberTypeId:i.id,expirationDate:this.expirationDateFormatted,cardId:r,requiredToken:this.requiredToken,token:null===(t=this.token)||void 0===t?void 0:t.token})}_handlePushGoogle(t){var e;this._setLastServiceCall("_handlePushGoogle",t,ne.noExit);const{number:i="",brandAssociation:a="",alias:r="",product:n={}}=this.cardData,{activationData:s=""}=this.handleLogout?null===(e=this.dataHubGoogle)||void 0===e?void 0:e.detail:t.detail,o={pan:i,activationData:s,alias:r??n.name,brand:a.id};this._dispatch("payments-third-party-wallet-provisioning-push-success",o)}handleError(){const{last:t,retry:e}=ne.default,i=this._getLastServiceCallFlow();this.clearLoader(),this._openModal(this.isLastTry?(null==i?void 0:i.last)||t:(null==i?void 0:i.retry)||e)}handlerErrorAppMissing(t){var e;if(this.errorData={...t}||{},this.isGoogleWallet&&"WALLET_ERROR"===(null===(e=this.errorData)||void 0===e?void 0:e.resultCode)){const t=re.MODES.appMissing;this.clearLoader(),this._openModal(t)}else this.handleError()}_openModal(t){this._modalMode=t,this._modalVisible=!0}_getCardData(t){this.cardDm&&(this._setLastServiceCall("_getCardData",t),this.showLoader(),this.cardDm.getCard(t))}get cardImg(){var t,e;let i;return null===(t=this.cardData)||void 0===t||null===(e=t.images)||void 0===e||e.forEach((t=>{t.id===this.cardImageId&&(i=t.url)})),i}_getDeviceBadge(t){const e={[oe.deviceStatus.added]:{text:"added",type:"success"},[oe.deviceStatus.notAdded]:{text:"not-added",type:"neutral"},[oe.deviceStatus.pending]:{text:"pending",type:"default"}}[t.status],i=t.status===oe.deviceStatus.pending;return C`
      <bbva-text
        class="badge-heading"
        unset
        text=${"iWatch"===(null==t?void 0:t.name)?this.t("payments-third-party-wallet-provisioning-device-name-apple-watch"):null==t?void 0:t.name}
      ></bbva-text>
      <bbva-badge-default
        type=${e.type}
        text=${this.t(`payments-third-party-wallet-provisioning-device-${e.text}`)}
      ></bbva-badge-default>
      <bbva-link
        ?hidden=${!i}
        @click=${()=>{this._retries=0,this.verifyDevice(t)}}
        >${this.t("payments-third-party-wallet-provisioning-verify-device")}</bbva-link
      >
    `}retryLastService(){this._retryServiceCall()}_retryServiceCall(){var t;const{method:e,params:i}=this._lastServiceCalled;null===(t=this[e])||void 0===t||t.call(this,i)}_getLastServiceCallParams(){var t;return null===(t=this._lastServiceCalled)||void 0===t?void 0:t.params}_getLastServiceCallFlow(){var t;return(null===(t=this._lastServiceCalled)||void 0===t?void 0:t.retryFlow)??ne.default}_setLastServiceCall(t,e,i){var a;(null===(a=this._lastServiceCalled)||void 0===a?void 0:a.method)===t?this._retries+=1:(this._retries=0,this._lastServiceCalled={method:t,params:e,retryFlow:i})}handlePhoneCall(){this._dispatchCustomEvent("payments-third-party-wallet-provisioning-phone-call",{value:this.phoneNumber})}_dispatch(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e||!0}))}_renderCard(){var t,e,i,a;const r=(null===(t=this.cardData)||void 0===t||null===(e=t.brandAssociation)||void 0===e?void 0:e.id.toLowerCase())||"",n=this.t(`payments-third-party-wallet-provisioning-${this.cardType}-card-kind-payment-text`);return this.hasUrlImage?C`
          <bbva-clip-card-data
            variant=${this.cardType}
            image-src=${this.cardImg}
            card-number=${null===(i=this.cardData)||void 0===i?void 0:i.number}
            expiration-date-text=""
            pan-safe
            shadow
            kind-payment=${n}
          ></bbva-clip-card-data>
        `:C`
          <bbva-clip-card-data
            variant=${this.cardType}
            kind=${n}
            kind-payment=${n}
            card-number=${(null===(a=this.cardData)||void 0===a?void 0:a.number)||"0000"}
            card-net=${r}
            expiration-date-text=""
            pan-safe
            shadow
          ></bbva-clip-card-data>
        `}_renderDeviceList(){return C`
      <div class="devices-container ${this.isGoogleWallet?"devices-container-nodevices":""}">
        ${this.devicesComputed.map(((t,e)=>C`
            <div class="device-item">
              <bbva-divider ?hidden=${0===e}></bbva-divider>
              ${this._getDeviceBadge(t)}
            </div>
          `))}
      </div>
    `}_renderWalletDm(){return this.isGoogleWallet?C`
          <bbva-global-tokens-third-party-wallets-google-push-api-dm
            id="pushDm"
            .host=${this.host}
            .version=${this.hubPaymentsApiVersion}
            .requiredToken=${this.requiredToken}
            ?native=${this.native}
            requiredotp
            @tokens-third-party-wallets-google-push-api-dm-create=${this.handleLogout?this._handleLogout:this._handlePushGoogle}
            @tokens-third-party-wallets-google-push-api-dm-create-error=${this.handleError}
          ></bbva-global-tokens-third-party-wallets-google-push-api-dm>
        `:C`
          <bbva-global-tokens-third-party-wallets-push-api-dm
            id="pushDm"
            .host=${this.host}
            .version=${this.hubPaymentsApiVersion}
            .requiredToken=${this.requiredToken}
            ?native=${this.native}
            requiredotp
            @tokens-third-party-wallets-push-api-dm-create=${this.handleLogout?this._handleLogout:this._handlePush}
            @tokens-third-party-wallets-push-api-dm-create-error=${this.handleError}
          ></bbva-global-tokens-third-party-wallets-push-api-dm>
        `}_handleLogout(t){this.dataHubGoogle=t,this.clearLoader(),this._openModal(re.MODES.logout)}logoutApp(){this._dispatch("payments-third-party-wallet-provisioning-logout-app")}_renderDms(){return C`
      <bbva-global-card-api-dm
        id="cardDm"
        .host=${this.host}
        .version=${this.cardApiVersion}
        .requiredToken=${this.requiredToken}
        ?native=${this.native}
        @card-api-dm-fetch=${this._handleCardFetch}
        @card-api-dm-fetch-error=${this.handleError}
      ></bbva-global-card-api-dm>
      ${this._renderWalletDm()}
      <bbva-global-tokens-third-party-wallets-verify-api-dm
        id="verifyDm"
        .host=${this.host}
        .version=${this.hubPaymentsApiVersion}
        .requiredToken=${this.requiredToken}
        ?native=${this.native}
        requiredotp
        @tokens-third-party-wallets-verify-api-dm-fetch=${this._handleDeviceVerify}
        @tokens-third-party-wallets-verify-api-dm-fetch-error=${this.handleError}
      ></bbva-global-tokens-third-party-wallets-verify-api-dm>
    `}_renderFooter(){const t=C`
      <bbva-core-image
        @click=${this.isGoogleWallet?this._callConnectGoogle:this.addToPayWallet}
        preload
        sizing="contain"
        height="46"
        width="182"
        src="${this.walletImg}"
      ></bbva-core-image>
    `,e=C`
      <bbva-notification-message>
        ${this.isGoogleWallet?this.t("payments-third-party-wallet-provisioning-notification-message-google"):this.t("payments-third-party-wallet-provisioning-notification-message-apple")}
      </bbva-notification-message>
    `;return this.hasSomeDeviceNotAdded&&!this.isGoogleWallet&&this.hasSomeDeviceAdded?C`
        <div class="footer-image-and-message">
          ${t} ${e}
        </div>
      `:C`
      ${this.hasSomeDeviceNotAdded?t:""}
      ${this.hasSomeDeviceAdded?e:""}
    `}_renderModal(){return C`
      <payments-third-party-wallet-provisioning-modal
        ?visible=${this._modalVisible}
        mode=${this._modalMode}
        wallet=${this.wallet}
        ?has-phone-number=${!!this.phoneNumber}
        @payments-third-party-wallet-provisioning-modal-app-missing="${this.navigateBack}"
        @payments-third-party-wallet-provisioning-modal-logout=${this.isGoogleWallet?this._handlePushGoogle:this._handlePush}
        @payments-third-party-wallet-provisioning-modal-call-exit=${this.navigateBack}
        @payments-third-party-wallet-provisioning-modal-retry=${this.retryLastService}
        @payments-third-party-wallet-provisioning-modal-status=${this._changeModalStatus}
        @payments-third-party-wallet-provisioning-modal-phone-call=${this.handlePhoneCall}
      ></payments-third-party-wallet-provisioning-modal>
    `}render(){return C`
      <div class="main-container" ambient="light">
        ${super.render()} ${this._renderCard()}
        <bbva-header-category
          text=${this.isGoogleWallet?this.t("payments-third-party-wallet-provisioning-header-category-title-google"):this.t("payments-third-party-wallet-provisioning-header-category-title-apple")}
        ></bbva-header-category>
        ${this._renderDeviceList()}
        <div class="footer">${this._renderFooter()}</div>
      </div>
      ${this._renderDms()} ${this._renderModal()}
    `}}customElements.define(oe.is,oe);var ce=Object.freeze({__proto__:null});export{Vt as B,ce as p};
