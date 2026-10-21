import{h as e,cT as t,fp as s,z as i,an as a,L as r,ak as o,aV as n,a8 as l,a9 as d,bb as c,aD as u,bF as p,aN as h,cU as m,aS as g,aZ as v,J as b,a7 as y}from"./952f98a9.js";import{M as _,L as f,D as C,a1 as S,O as k,a3 as P,G as T,a2 as E,P as $,a4 as x,V as D,A as O,f as A,F as R,x as I,Q as M,H as L,aq as w,T as B,z as q,aC as N,e as j,v as V,N as H,K as F,ao as z,h as G,an as U,t as K}from"./216055dc.js";import{bg as Y,bf as W,a2 as Q,a3 as X,a4 as J,a5 as Z,by as ee}from"./7f3d7ca9.js";import{b as te,B as se}from"./d335c75d.js";import{b as ie,B as ae}from"./972f570a.js";import{B as re,d as oe,e as ne,b as le}from"./30ef6f1f.js";import{B as de,b as ce}from"./b7cb1dda.js";import{l as ue,e as pe,d as he,i as me,h as ge,g as ve,j as be,k as ye,f as _e,m as fe}from"./5bbe840b.js";import{a as Ce,c as Se,b as ke,B as Pe}from"./2a0abc39.js";import"./815eb855.js";import{B as Te,a as Ee,b as $e,c as xe,d as De,e as Oe}from"./1aa01966.js";import{B as Ae}from"./7d773f57.js";import{B as Re}from"./32b24593.js";import{B as Ie,a as Me,b as Le}from"./d2484b66.js";import{a as we}from"./4656db6d.js";import"./ff2cdeea.js";let Be=class extends Ce{constructor(e=null){super(Object.assign(e||{},{method:"PATCH"}))}toString(e=""){return super.toString(e||"BGADPRequestPATCH")}};class qe extends Se{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`private-banking-portfolios/v${this.version}/private-banking-portfolios/{private-banking-portfolio-id}`)}toString(){return super.toString("BGADPPrivateBankingPortfoliosPrivateBankingPortfolioGetV0")}}class Ne extends Be{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`private-banking-portfolios/v${this.version}/private-banking-portfolios/{private-banking-portfolio-id}`)}toString(){return super.toString("BGADPPrivateBankingPortfoliosPrivateBankingPortfolioPatchV0")}}class je extends Se{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`private-banking-portfolios/v${this.version}/private-banking-portfolios/{private-banking-portfolio-id}/indicators`)}toString(){return super.toString("BGADPPrivateBankingPortfoliosPrivateBankingPortfolioIndicatorsGetV0")}}class Ve extends ke{static get is(){return"bbva-global-private-banking-portfolio-api-dm"}static get properties(){return{privateBankingPortfolio:{type:Object,attribute:!1}}}constructor(){super(),this.privateBankingPortfolio={}}resetPrivateBankingPortfolio(){this.privateBankingPortfolio={}}getPrivateBankingPortfolio(e,t={}){if(Object.keys(this.privateBankingPortfolio).length)return;t=Object.assign({"private-banking-portfolio-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"private-banking-portfolio-api-dm-fetch",errorFireEventHandler:"private-banking-portfolio-api-dm-fetch-error"},this._responseMapping,t.fields)}patchPrivateBankingPortfolio(e,t){const s={"private-banking-portfolio-id":e};this._generateGetService(this._getService("patch",t,s),{customEvent:"private-banking-portfolio-api-dm-update",errorFireEventHandler:"private-banking-portfolio-api-dm-update-error"},this._responseMapping),this.resetPrivateBankingPortfolio()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}PrivateBankingPortfolio`,this._getBgadp(i))}_getBgadp(e){return{getPrivateBankingPortfolioV0:()=>new qe(e),patchPrivateBankingPortfolioV0:()=>new Ne(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class He extends ke{static get is(){return"bbva-global-private-banking-portfolio-indicators-api-dm"}static get properties(){return{privateBankingPortfolioIndicators:{type:Array,attribute:!1}}}constructor(){super(),this.privateBankingPortfolioIndicators=[]}resetPrivateBankingPortfolioIndicators(){this.privateBankingPortfolioIndicators=[]}getPrivateBankingPortfolioIndicators(e,t={}){if(Object.keys(this.privateBankingPortfolioIndicators).length)return;t=Object.assign({"private-banking-portfolio-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"private-banking-portfolio-indicators-api-dm-fetch",errorFireEventHandler:"private-banking-portfolio-indicators-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}PrivateBankingPortfolioIndicators`,this._getBgadp(i))}_getBgadp(e){return{getPrivateBankingPortfolioIndicatorsV0:()=>new je(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class Fe extends ue{static get is(){return"bbva-global-order-cancelation-api-dm"}static get properties(){return{country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./2682680c.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}OrderCancelation`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaOrderCancelation${e}ApiDm`;(0,this._modules[e])().then((async e=>{const s=e[t].is;this._module=this._createModuleElement(s),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-order-cancelation-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-order-cancelation-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=pe.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async postOrderCancelation(e,t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({orderId:e,body:t}):this._requestParams={post:[{orderId:e,body:t}]}}async _postOrderCancelation(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postOrderCancelation(e.orderId,e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return e` ${this._module?this._module:""}`}}class ze extends ue{static get is(){return"bbva-global-orders-simulation-api-dm"}static get properties(){return{ordersSimulation:{type:Object,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.ordersSimulation={},this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","ordersSimulation"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./3587646f.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}OrdersSimulation`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaOrdersSimulation${e}ApiDm`;(0,this._modules[e])().then((async e=>{const s=e[t].is;this._module=this._createModuleElement(s),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-orders-simulation-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-orders-simulation-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=he.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetOrdersSimulation(){await this.module.updateComplete,this.module.resetOrdersSimulation()}async postOrdersSimulation(e){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:e}):this._requestParams={post:[{body:e}]}}async _postOrdersSimulation(){await this.module.updateComplete,Object.keys(this.ordersSimulation).length||(this._requestParams.post.forEach((e=>{this.module.postOrdersSimulation(e.body)})),delete this._requestParams.post)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return e` ${this._module?this._module:""}`}}const Ge={headerVariant:{initial:"modal-initial",secondary:"modal-initial-secondary",closeIcon:"trading-stocks-purchase-and-sale-header-close"},purchaseHeader:"trading-stocks-purchase-and-sale-header",saleHeader:"trading-stocks-purchase-and-sale-sale-header",purchaseAndSaleHeader:"trading-stocks-purchase-and-sale-stocks-header",currentStepLabel:"trading-stocks-purchase-and-sale-step-label",steps:{"issuer-and-account":{id:"issuer-and-account",completed:!1},orderType:{id:"order-type",completed:!1,editLabel:"trading-stocks-purchase-and-sale-link-step",stepHeaderPurchase:"trading-stocks-purchase-and-sale-purchase-stocks-type-order",stepHeaderSale:"trading-stocks-purchase-and-sale-sale-stocks-type-order",summaryOrderTypeLabel:"trading-stocks-purchase-and-sale-type-order"},orderDetail:{id:"order-detail",completed:!1,editLabel:"trading-stocks-purchase-and-sale-link-step",stepHeader:"trading-stocks-purchase-and-sale-order-detail-header"}},tradingSummary:{panelButtonLabel:"trading-stocks-purchase-and-sale-order-detail-import-approximate",panelButtonLabelSale:"trading-stocks-purchase-and-sale-receipt-sale-label",panelButtonLabelWithIcon:"trading-stocks-purchase-and-sale-order-detail-costs-and-commissions-text",panelButtonBtnLabel:"trading-stocks-purchase-and-sale-stocks-continue",panelButtonConfirmLabel:"trading-stocks-purchase-and-sale-stocks-confirm",panelButtonIconLabel:"trading-stocks-purchase-and-sale-icon-label"}},Ue={issuerNameLabel:"trading-stocks-purchase-and-sale-stocks-name",issuerLastPriceLabel:"trading-stocks-purchase-and-sale-stocks-last-price",issuerLastUpdateLabel:"trading-stocks-purchase-and-sale-stocks-last-update",issuerPerformanceLabel:"trading-stocks-purchase-and-sale-stocks-daily-preformance",positionInPortfolioLabel:"trading-stocks-purchase-and-sale-sale-position-porfolio-header",accountAvailableTitlesToSell:"trading-stocks-purchase-and-sale-sale-available-title",accountAvailableTitles:"trading-stocks-purchase-and-sale-order-detail-market-titles",sellAveragePriceLabel:"trading-stocks-purchase-and-sale-sale-average-price-title",investmentContractLabel:"trading-stocks-purchase-and-sale-invesment-contract",accountAvailableBalanceLabel:"trading-stocks-purchase-and-sale-available-balance"},Ke={sellDescriptionLabel:"trading-stocks-purchase-and-sale-sale-header-description",purchaseOrderTypeLabel:"trading-stocks-purchase-and-sale-type-oder-description",purchaseOrderTypeButtonLabel:"trading-stocks-purchase-and-sale-stocks-continue",fontWeight:"500"},Ye={orderDetailLastPrice:"trading-stocks-purchase-and-sale-order-detail-title-last-price",lastUpdate:"trading-stocks-purchase-and-sale-stocks-last-update-order-detail",orderCharacteristics:"trading-stocks-purchase-and-sale-order-detail-market-sub-header",marketBestPostures:"trading-stocks-purchase-and-sale-order-detail-best-postures",panelComparativePurchaseLabel:"trading-stocks-purchase-and-sale-order-detail-market-purchase",panelComparativeSaleLabel:"trading-stocks-purchase-and-sale-order-detail-market-sale",orderDetailAvailableTitles:"trading-stocks-purchase-and-sale-order-detail-market-titles",orderDetailButtonLabel:"trading-stocks-purchase-and-sale-stocks-continue",inputClear:"trading-stocks-purchase-and-sale-order-detail-input-clear",orderDetailBookTemplate:{numberOfTitlesInputLabel:"trading-stocks-purchase-and-sale-order-detail-number-qualitication",numberOfTitlesToPurchaseLabel:"trading-stocks-purchase-and-sale-order-detail-number-qualitication-info",numberOfTitlesToSaleLabel:"trading-stocks-purchase-and-sale-sale-order-detail-number-qualitication-info",numberOfTitlesInfoPurchaseLabel:"trading-stocks-purchase-and-sale-order-detail-number-qualitication-info",numberOfTitlesInfoSaleLabel:"trading-stocks-purchase-and-sale-sale-order-detail-number-qualitication-info",numberOfTitlesErrorPurchaseLabel:"trading-stocks-purchase-and-sale-purchase-order-detail-titles-quantity-error",numberOfTitlesErrorSaleLabel:"trading-stocks-purchase-and-sale-sale-order-detail-titles-quantity-error",minimumTitlesPriceLabel:"trading-stocks-purchase-and-sale-order-detail-price-minimum-qualitication",calendarInputLabel:"trading-stocks-purchase-and-sale-order-detail-validity",calendarInfoLabel:"trading-stocks-purchase-and-sale-order-detail-validity-info"},orderDetailConditionedOrder:{conditionedPurchaseLabel:"trading-stocks-purchase-and-sale-order-detail-market-purchase",conditionedSaleLabel:"trading-stocks-purchase-and-sale-order-detail-market-sale",conditionedPlaceHolderSaleLabel:"trading-stocks-purchase-and-sale-order-detail-market-sale-target-price",conditionedPricePlaceHolderLabel:"trading-stocks-purchase-and-sale-order-detail-market-sale-target-price-info",conditionedPricePlaceHolderAmountLabel:"trading-stocks-purchase-and-sale-order-detail-market-sale-target-price-info-amount",conditionedPricePlaceHolderStopLoss:"trading-stocks-purchase-and-sale-order-detail-market-sale-stop-loss",conditionedPricePlaceHolderStopLossLabel:"trading-stocks-purchase-and-sale-order-detail-market-sale-stop-loss-info",conditionedPricePlaceHolderStopLossAmountLabel:"trading-stocks-purchase-and-sale-order-detail-market-sale-stop-loss-info-amount",conditionedPricePlaceHolderStopLossErrorLabel:"trading-stocks-purchase-and-sale-order-detail-market-sale-stop-loss-error-amount",conditionedPricePlaceHolderMonitoringValidityLabel:"trading-stocks-purchase-and-sale-order-detail-market-sale-monitoring-validity",conditionedPricePlaceHolderMonitoringValidityInfoLabel:"trading-stocks-purchase-and-sale-order-detail-market-info"},orderDetailCostsAndCommissions:{costsAndCommissionsLabel:"trading-stocks-purchase-and-sale-order-detail-costs-and-commissions",costsAndCommissionsInfoLabel:"trading-stocks-purchase-and-sale-order-detail-costs-and-commissions-info",costsAndCommissionsEstimatedTotalLabel:"trading-stocks-purchase-and-sale-order-detail-total-estimated",costsAndCommissionsPercentageLabel:"trading-stocks-purchase-and-sale-order-detail-commission-percentage",costsAndCommissionsCommissionLabel:"trading-stocks-purchase-and-sale-order-detail-commission",costsAndCommissionsIVALabel:"trading-stocks-purchase-and-sale-order-detail-iva-commission",costsAndCommissionsApproximateAmountLabel:"trading-stocks-purchase-and-sale-order-detail-import-approximate",costsAndCommissionsApproximateAmountLabelSale:"trading-stocks-purchase-and-sale-receipt-sale-label",costsAndCommissionsWarningLabel:"trading-stocks-purchase-and-sale-order-detail-costs-and-commissions-text"}},We={titlesQuantityLabel:"trading-stocks-purchase-and-sale-order-detail-number-qualitication",titlePriceLabel:"trading-stocks-purchase-and-sale-receipt-text-price-title",settlementDateLabel:"trading-stocks-purchase-and-sale-order-detail-validity",objectivePriceLabel:"trading-stocks-purchase-and-sale-order-detail-market-sale-target-price",stopLoss:"trading-stocks-purchase-and-sale-order-detail-market-sale-stop-loss",monitoringDate:"trading-stocks-purchase-and-sale-order-detail-market-sale-monitoring-validity",conditionedPurchaseLabel:"trading-stocks-purchase-and-sale-order-detail-market-purchase",conditionedSaleLabel:"trading-stocks-purchase-and-sale-order-detail-market-sale",totalEstimatedLabel:"trading-stocks-purchase-and-sale-order-detail-total-estimated",commissionPercentage:"trading-stocks-purchase-and-sale-order-detail-commission-percentage",commissionAmount:"trading-stocks-purchase-and-sale-order-detail-commission",ivaCommission:"trading-stocks-purchase-and-sale-order-detail-iva-commission",costsAndCommissionsLabel:"trading-stocks-purchase-and-sale-order-detail-costs-and-commissions"},Qe={scheduleNotAllowed:"OUT_OF_SCHEDULE",operationBelowAllowedAmount:"MINIMUM_AMOUNT_TO_INVEST",insufficientFunds:"INSUFFICIENT_BALANCE",amountIntervalOutOfRange:"OUT_OF_RANGE",invalidContractParameter:"CONTRACT_WITHOUT_ISSUER"},Xe={fullHeight:!1,fixedFooter:!1,modalType:"warning",titleIcon:"warning",description:"error",titleInfoText:"trading-stocks-purchase-and-sale-error-title-header",buttonText:"trading-stocks-purchase-and-sale-error-button"},Je={fullHeight:!1,fixedFooter:!1,modalType:"caution",titleIcon:"caution",description:"outOfSchedule",titleInfoText:"trading-stocks-purchase-and-sale-error-simulation-schedule-title-header",buttonText:"trading-stocks-purchase-and-sale-error-simulation-modal-button"},Ze={fullHeight:!1,fixedFooter:!1,modalType:"caution",titleIcon:"caution",description:"minimumAmountToInvest",titleInfoText:"trading-stocks-purchase-and-sale-error-simulation-instruction-not-sent",buttonText:"trading-stocks-purchase-and-sale-error-simulation-modal-button"},et={fullHeight:!1,fixedFooter:!1,modalType:"caution",titleIcon:"caution",description:"outOfRange",titleInfoText:"trading-stocks-purchase-and-sale-error-simulation-instruction-not-sent",buttonText:"trading-stocks-purchase-and-sale-error-simulation-modal-button"},tt={fullHeight:!1,fixedFooter:!1,modalType:"caution",titleIcon:"caution",description:"insufficientBalance",titleInfoText:"trading-stocks-purchase-and-sale-error-simulation-insufficient-balance-title",buttonText:"trading-stocks-purchase-and-sale-error-simulation-modal-button"},st={fullHeight:!1,fixedFooter:!1,modalType:"warning",titleIcon:"warning",description:"noServiceAvailable",titleInfoText:"trading-stocks-purchase-and-sale-error-simulation-no-service-available-title",buttonText:"trading-stocks-purchase-and-sale-error-simulation-no-service-available-button"},it={fullHeight:!1,fixedFooter:!1,modalType:"caution",titleIcon:"caution",description:"contractWithoutIssuer",titleInfoText:"trading-stocks-purchase-and-sale-error-simulation-instruction-not-sent",buttonText:"trading-stocks-purchase-and-sale-error-simulation-modal-button"},at={fullHeight:!1,fixedFooter:!1,modalType:"caution",titleIcon:"caution",description:"exitOperative",titleInfoText:"trading-stocks-purchase-and-sale-exit-operative-modal-header",buttonText:"trading-stocks-purchase-and-sale-exit-operative-modal-button",linkText:"trading-stocks-purchase-and-sale-exit-operative-modal-link"},rt={modalTitle:"trading-stocks-purchase-and-sale-order-detail-commission",ivaModalTitle:"trading-stocks-purchase-and-sale-order-detail-iva-commission",costAndComissionModalText:"trading-stocks-purchase-and-sale-order-detail-costs-and-commissions-modal-text"},ot={receiptPanelHeader:"trading-stocks-purchase-and-sale-receipt-order-sent",receiptPanelLabel:"trading-stocks-purchase-and-sale-order-detail-import-approximate",receiptPanelLabelSale:"trading-stocks-purchase-and-sale-receipt-sale-label",receiptPanelSubLabel:"trading-stocks-purchase-and-sale-receipt-includes-costs-commissions",receiptPanelInfoMessage:"trading-stocks-purchase-and-sale-receipt-message-import-titles",receiptOrderDetailHeader:"trading-stocks-purchase-and-sale-order-detail-header",costAndCommissionsReceipt:{costsAndCommissionsLabel:"trading-stocks-purchase-and-sale-order-detail-costs-and-commissions",totalEstimatedLabel:"trading-stocks-purchase-and-sale-order-detail-total-estimated",commissionPercentage:"trading-stocks-purchase-and-sale-order-detail-commission-percentage",commissionAmount:"trading-stocks-purchase-and-sale-order-detail-commission",ivaCommission:"trading-stocks-purchase-and-sale-order-detail-iva-commission"},receiptNotificationMessages:{orderMessage:"trading-stocks-purchase-and-sale-receipt-message-order",emailMessage:"trading-stocks-purchase-and-sale-receipt-message-email"},buttonRowOptions:[{icon:t(),label:"trading-stocks-purchase-and-sale-receipt-button-share-receipt",id:"button-1"},{icon:s(),label:"trading-stocks-purchase-and-sale-receipt-button-orders-list",id:"button-2"}],bookReceiptLabels:{dateAndHour:"trading-stocks-purchase-and-sale-receipt-date-and-time",nameLabel:"trading-stocks-purchase-and-sale-receipt-issuer-name-and-description",orderTypeLabel:"trading-stocks-purchase-and-sale-type-order",numberOfTitlesLabel:"trading-stocks-purchase-and-sale-order-detail-number-qualitication",priceLabel:"trading-stocks-purchase-and-sale-receipt-text-price-title",orderDueDateLabel:"trading-stocks-purchase-and-sale-order-detail-validity",monitoredDueDateLabel:"trading-stocks-purchase-and-sale-order-detail-market-sale-monitoring-validity",orderFolioLabel:"trading-stocks-purchase-and-sale-receipt-text-number-order",orderOperationNumberLabel:"trading-stocks-purchase-and-sale-receipt-text-folio-operation"},conditioned:"trading-stocks-purchase-and-sale-type-operation-conditioned",conditionedReceiptLabels:{titlePurchaseLabel:"trading-stocks-purchase-and-sale-order-detail-market-purchase",titleSaleLabel:"trading-stocks-purchase-and-sale-sale-title",objectivePrice:"trading-stocks-purchase-and-sale-order-detail-market-sale-target-price",stopLossPrice:"trading-stocks-purchase-and-sale-order-detail-market-sale-stop-loss"},footerMessages:{footerMessage:"trading-stocks-purchase-and-sale-receipt-message-info",footerMessage2:"trading-stocks-purchase-and-sale-receipt-message-bbva-info"},limited:"trading-stocks-purchase-and-sale-type-operation-limited"},nt={modalConfig:{fullHeight:!1,fixedFooter:!0,modalType:"caution",titleIcon:"caution",buttonText:"trading-stocks-purchase-and-sale-error-simulation-modal-button",linkText:"trading-stocks-purchase-and-sale-receipt-button-exit",headerText:"trading-stocks-purchase-and-sale-cancel-order-title",titleInfoText:"trading-stocks-purchase-and-sale-cancel-order-title-text",purchaseTitleInfoText:"trading-stocks-purchase-and-sale-cancel-order-title-purchase-text",modalBody:"trading-stocks-purchase-and-sale-cancel-order-description"},cancelIssuerLabel:"trading-stocks-purchase-and-sale-cancel-order-issuer-label",orderTitlesLabel:"trading-stocks-purchase-and-sale-cancel-order-titles-label",orderTitlesToCancel:"trading-stocks-purchase-and-sale-cancel-order-titles-to-cancel"},lt={fullHeight:!0,fixedFooter:!0,headerText:"trading-stocks-purchase-and-sale-cancel-order-receipt-header",panel:{receiptPanelHeader:"trading-stocks-purchase-and-sale-cancel-order-receipt-panel-title",microillustration:"pending",microillustrationSize:"M"},dateAndHour:"trading-stocks-purchase-and-sale-receipt-date-and-time",nameLabel:"trading-stocks-purchase-and-sale-receipt-issuer-name-and-description",orderTypeLabel:"trading-stocks-purchase-and-sale-type-order",numberOfTitlesLabel:"trading-stocks-purchase-and-sale-cancel-order-receipt-order-titles-label",numberOfAssignedTitlesLabel:"trading-stocks-purchase-and-sale-cancel-order-receipt-order-assigned-titles-label",numberOfTitlesToCancel:"trading-stocks-purchase-and-sale-cancel-order-receipt-order-titles-to-cancel-label",priceLabel:"trading-stocks-purchase-and-sale-receipt-text-price-title",orderOperationType:"trading-stocks-purchase-and-sale-cancel-order-operation-label",orderFolioLabel:"trading-stocks-purchase-and-sale-receipt-text-number-order",orderOperationNumberLabel:"trading-stocks-purchase-and-sale-receipt-text-folio-operation",notificationMessage:"trading-stocks-purchase-and-sale-cancel-order-receipt-notification-message",buttonRowOptions:[{icon:t(),label:"trading-stocks-purchase-and-sale-receipt-button-share-receipt",id:"button-1"}],footerMessages:{footerMessage:"trading-stocks-purchase-and-sale-cancel-receipt-message-info",footerMessage2:"trading-stocks-purchase-and-sale-receipt-message-bbva-info"},conditioned:"trading-stocks-purchase-and-sale-type-operation-conditioned",limited:"trading-stocks-purchase-and-sale-type-operation-limited",purchaseTitle:"trading-stocks-purchase-and-sale-purchase-title",saleTitle:"trading-stocks-purchase-and-sale-sale-title"},{moment:dt}=window,ct="YYYY-MM-DD";function ut(e,t="DD MMM YYYY"){var s,i;return(null===(s=dt(e))||void 0===s||null===(i=s.format(t))||void 0===i?void 0:i.replace(".","")).replace(/\b\w/g,(e=>e.toUpperCase()))}function pt(e,t="DD MM YY"){var s;let i=dt(e,"YYYYMMDD").add(29,"days");return 6===i.day()?i=i.subtract(1,"days"):0===i.day()&&(i=i.subtract(2,"days")),null===(s=i.format(t))||void 0===s?void 0:s.replace(" ","/").replace(" ","/")}function ht(e,t="DD/MM/YYYY"){var s;return null===(s=dt(e,"YYYY-MM-DD").format(t))||void 0===s?void 0:s.replace(" ","/").replace(" ","/")}function mt(e=ct){const t=new Date;return dt(t).format(e)}function gt(e=ct){const t=new Date,s=dt(t).add(29,"days");return dt(s).format(e)}function vt(e){switch(e){case"1":return"increase";case"2":return"decrease";default:return"no-change"}}function bt(e){switch(e){case"1":return"success";case"2":return"error";default:return"pending"}}function yt(e,t){var s;const{specificAmounts:i}=t??{},a=null==i?void 0:i.find((t=>t.id===e));return a?null===(s=a.amounts)||void 0===s?void 0:s[0]:null}function _t(e,t,s){return dt(e,t).format(s)}var ft=i`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.list-container {
  display: flex;
  justify-content: space-between;
  padding: 0.5rem 0;
}

.list-data {
  display: flex;
  align-items: center;
  justify-content: space-between;
  flex-direction: row;
}

.list-data-last-update {
  display: flex;
  flex-direction: column;
}

.account-container {
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-between;
  margin-top: 0.5rem;
}

[data-tag-name=bbva-header-category] {
  padding: 0.5rem 0;
  --bbva-header-category--_ambient--heading-color: var(--issuer-and-account-step-list-text);
}
`;class Ct extends(_(f(a(r)))){static get is(){return"issuer-and-account-step"}static get scopedElements(){const e=[T,E,$,x];return Ct.scopedElementsFromClasses(e)}static get properties(){return{isPurchase:{type:Boolean,attribute:"is-purchase"},calculateSharesProductDetailResponse:{type:Object,attribute:"calculate-shares-product-detail-response"},issuerDataResponse:{type:Object,attribute:"issuer-data-response"},aliasContract:{type:String,attribute:"alias-contract"},contractNumber:{type:String,attribute:"contract-number"},availableBalance:{type:Object,attribute:"available-balance"},specificAmountsId:{type:Object,attribute:"specific-amounts-id"},gmtTime:{type:Number,attribute:"gmt-time"}}}static get styles(){return[C.secondary,S.secondary,S.secondary,k.secondary,P.secondary,o("trading-stocks-purchase-and-sale-shared-styles"),ft]}constructor(){super(),this.ambient="secondary",this.isPurchase=!1,this.aliasContract="",this.contractNumber="",this.availableBalance={},this.calculateSharesProductDetailResponse={},this.specificAmountsId={},this.issuerDataResponse={},this.gmtTime=0}updated(e){super.updated(e),e.has("issuerDataResponse")&&this.requestUpdate()}get _getPerformanceData(){var e;const{performance:t}=this.issuerDataResponse;return{performance:t,dayPerformancePercent:yt(this.specificAmountsId.dayPerformancePercent,this.issuerDataResponse),tendency:null===(e=yt(this.specificAmountsId.tendency,this.issuerDataResponse))||void 0===e?void 0:e.amount}}get _renderStockInformation(){return e`
      ${this._renderStockName} ${this._renderStockLastPrice} ${this._renderStockLastUpdate}
      ${this._renderPerformanceDay} ${this.isPurchase?n:this._renderPositionPortfolio}
    `}get _renderStockName(){const{businessName:t,composedBlackboard:s}=this.issuerDataResponse??{};return e`
      <div class="list-container">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${null==Ue?void 0:Ue.issuerNameLabel}
        >
        </bbva-type-text>
        <div class="list-data">
          <bbva-type-text
            class="list-text"
            tag="span"
            size="S"
            font-weight="500"
            alignment="right"
            text=${`${t??""} ${s??""}`}
            ?loading=${void 0===t||void 0===s}
          >
          </bbva-type-text>
        </div>
      </div>
    `}get _renderStockLastPrice(){const t=yt(this.specificAmountsId.lastPrice,this.issuerDataResponse);return e`
      <div class="list-container">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${null==Ue?void 0:Ue.issuerLastPriceLabel}
        >
        </bbva-type-text>
        <div class="list-data">
          <bbva-type-amount
            class="list-text"
            language="${this.language}"
            currency-code="${(null==t?void 0:t.currency)??""}"
            local-currency="${(null==t?void 0:t.currency)??""}"
            variant="s"
            type="bold"
            amount="${(null==t?void 0:t.amount)??""}"
            ?loading=${null===this._getLastPrice}
          >
          </bbva-type-amount>
        </div>
      </div>
    `}get _renderStockLastUpdate(){const{lastUpdateDate:t,lastUpdateTime:s}=this.issuerDataResponse??{};return e`
      <div class="list-container">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${null==Ue?void 0:Ue.issuerLastUpdateLabel}
        >
        </bbva-type-text>
        <div class="list-data">
          <div class="list-data-last-update">
            <bbva-type-text
              class="list-text"
              tag="span"
              size="S"
              font-style="italic"
              font-weight="500"
              alignment="right"
              text="${ut(`${t}`)},"
              ?loading=${void 0===t}
            >
            </bbva-type-text>
            <bbva-type-text
              class="list-text"
              tag="span"
              size="S"
              font-style="italic"
              font-weight="500"
              alignment="right"
              text="${((e,t)=>{const s=dt(e,"HHmmss").subtract(t,"hours"),i=dt().utcOffset()/60;return s.add(i,"hours").format("HH:mm")})(`${s}`,this.gmtTime)} h"
              ?loading=${void 0===s}
            >
            </bbva-type-text>
          </div>
        </div>
      </div>
    `}get _renderPerformanceDay(){const{performance:t,dayPerformancePercent:s,tendency:i}=this._getPerformanceData;return e`
      <div class="list-container">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${null==Ue?void 0:Ue.issuerPerformanceLabel}
        >
        </bbva-type-text>
        <div class="list-data">
          <bbva-type-amount
            class="list-text"
            currency-code="${(null==s?void 0:s.currency)??""}"
            local-currency="${(null==s?void 0:s.currency)??""}"
            language="${this.language}"
            variant="s"
            amount=${t??""}
            text="/"
            type="bold"
            ?loading=${null===this._getPerformanceData}
          >
          </bbva-type-amount>
          <bbva-type-amount
            id="tendency"
            class="list-text"
            symbol="%"
            language="${this.language}"
            variant="s"
            type="bold"
            amount=${(null==s?void 0:s.amount)??""}
            status="${vt(i)}"
            color="${bt(i)}"
            ?loading=${null===this._getPerformanceData}
          >
          </bbva-type-amount>
        </div>
      </div>
    `}get _renderPositionPortfolio(){const{titles:t,averagePrice:s}=this.issuerDataResponse??{};return e`
      <bbva-header-category
        text=${(null==Ue?void 0:Ue.positionInPortfolioLabel)??""}
      ></bbva-header-category>
      <div class="list-container">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${(null==Ue?void 0:Ue.accountAvailableTitlesToSell)??""}
        >
        </bbva-type-text>
        <div class="list-data">
          <bbva-type-text
            class="list-text"
            tag="span"
            size="S"
            font-weight="500"
            text=${t&&this.t(null==Ue?void 0:Ue.accountAvailableTitles,{titles:(null==t?void 0:t.quantity)??""})}
          >
          </bbva-type-text>
        </div>
      </div>
      <div class="list-container">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${(null==Ue?void 0:Ue.sellAveragePriceLabel)??""}
        >
        </bbva-type-text>
        <div class="list-data">
          <bbva-type-amount
            class="list-text"
            variant="s"
            type="bold"
            currency-code="${(null==s?void 0:s.currency)??""}"
            local-currency="${(null==s?void 0:s.currency)??""}"
            language="${this.language}"
            amount=${(null==s?void 0:s.amount)??""}
          >
          </bbva-type-amount>
        </div>
      </div>
    `}get _renderInvesmentContract(){var t,s,i;return e`
      <bbva-header-category
        text=${null==Ue?void 0:Ue.investmentContractLabel}
      ></bbva-header-category>
      <div class="account-container">
        <bbva-type-text
          class="list-text"
          text=${this.aliasContract??""}
          tag="span"
          size="S"
        ></bbva-type-text>
        <bbva-type-text
          class="list-text"
          font-weight="500"
          text="•${this.contractNumber??""}"
          tag="span"
          size="S"
          ?loading=${this.contractNumber.length<=0}
        ></bbva-type-text>
      </div>
      <div class="account-container">
        <bbva-type-text
          size="S"
          text-color="white"
          alignment="left"
          text=${(null==Ue?void 0:Ue.accountAvailableBalanceLabel)??""}
          tag="span"
        ></bbva-type-text>
        <bbva-type-amount
          class="list-text"
          variant="m"
          type="bold"
          currency-code="${(null===(t=this.availableBalance)||void 0===t?void 0:t.currency)??""}"
          local-currency="${(null===(s=this.availableBalance)||void 0===s?void 0:s.currency)??""}"
          language="${this.language}"
          amount=${(null===(i=this.availableBalance)||void 0===i?void 0:i.amount)??""}
        ></bbva-type-amount>
      </div>
    `}render(){return e` ${this._renderStockInformation} ${this._renderInvesmentContract}`}}customElements.define(Ct.is,Ct);var St=i`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.order-type-container {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  height: 100%;
  margin-bottom: 2rem;
}

.sale-container {
  padding-left: 1rem;
  padding-right: 1rem;
}

.button {
  margin-top: 1rem;
  margin-left: 1rem;
  margin-right: 1rem;
}

.radio-buttons-container {
  display: flex;
  flex-direction: column;
  margin-bottom: 2rem;
}

.label-out-text {
  --bbva-form-radio-group-label-out-color: token("foundations.colors.secondary600");
}

.purchase-label-out {
  margin: 0 1rem;
}
`;class kt extends(_(f(a(r)))){static get is(){return"select-order-type"}static get scopedElements(){const e=[T,se,ae,A,R];return kt.scopedElementsFromClasses(e)}static get properties(){return{isPurchase:{type:Boolean,attibute:"is-purchase"},orderTypeList:{type:Array,attribute:"order-type-list"},_isButtonActive:{type:Boolean},_completed:{type:Boolean},_optionSelected:{type:Object},_orderType:{type:Array},_sellOption:{type:Object}}}static get styles(){return[St,C.primary,te.primary,ie.primary,D.primary,O.primary,o("trading-stocks-purchase-and-sale-shared-styles")]}constructor(){super(),this.isPurchase=!1,this.orderTypeList=[],this._completed=!1,this._isButtonActive=!1,this._orderType=[],this._optionSelected={},this._sellOption={}}resetStep(){this._isButtonActive=!1}get _renderTypeOrder(){return e`
      <div class="order-type-container" ambient="primary">
        ${this.isPurchase?e`${this.purchaseTypeOfOrders}`:e`${this.sellTypeOfOrders}`}
      </div>
    `}get purchaseTypeOfOrders(){var t,s;return this._orderType=(null===(t=this.orderTypeList)||void 0===t?void 0:t.find((e=>"buy"===e.id)))||{},e`
      <div class="radio-buttons-container">
        <div class="purchase-label-out">
          <bbva-type-text
            tag="p"
            size="S"
            font-weight="500"
            text=${null==Ke?void 0:Ke.purchaseOrderTypeLabel}
          ></bbva-type-text>
        </div>
        <bbva-form-radio-group
          required
          id="trader-order-type"
          ambient="primary-alt"
          .items=${null===(s=this._orderType)||void 0===s?void 0:s.options}
          @form-radio-group-item-change=${this._onOptionSelected}
        >
        </bbva-form-radio-group>
      </div>
      <bbva-button-default
        ambient="primary"
        class="button"
        text="${(null==Ke?void 0:Ke.purchaseOrderTypeButtonLabel)||""}"
        ?disabled=${!this._isButtonActive}
        @click=${this._onStepContinue}
      ></bbva-button-default>
    `}get sellTypeOfOrders(){var t,s,i,a,r;return this._orderType=(null===(t=this.orderTypeList)||void 0===t?void 0:t.find((e=>"sell"===e.id)))||{},(null===(s=this._orderType)||void 0===s||null===(i=s.options)||void 0===i?void 0:i.length)>1?e`
        <div class="radio-buttons-container">
          <bbva-form-radio-group
            required
            id="trader-order-type"
            ambient="primary-alt"
            label-out=${(null==Ke?void 0:Ke.purchaseOrderTypeLabel)||""}
            .items=${(null===(r=this._orderType)||void 0===r?void 0:r.options)||[]}
            @form-radio-group-item-change=${this._onOptionSelected}
          >
          </bbva-form-radio-group>
        </div>
        <bbva-button-default
          ambient="primary"
          class="button"
          text="${(null==Ke?void 0:Ke.purchaseOrderTypeButtonLabel)||""}"
          ?disabled=${!this._isButtonActive}
          @click=${this._onStepContinue}
        ></bbva-button-default>
      `:(null!==(a=this._orderType)&&void 0!==a&&a.options&&([this._sellOption]=this._orderType.options,this._optionSelected=this._sellOption.value),e`${this._renderOrderTypeSingleSellOption}`)}get _renderOrderTypeSingleSellOption(){var t,s;return e`
      <div ambient="primary" class="sale-container">
        <bbva-type-text text="${null==Ke?void 0:Ke.sellDescriptionLabel}" size="S" tag="span">
        </bbva-type-text>
        <bbva-type-text
          tag="p"
          text="${null===(t=this._sellOption)||void 0===t?void 0:t.label}"
          font-weight="${null==Ke?void 0:Ke.fontWeight}"
        >
        </bbva-type-text>
        <bbva-notification-help
          variant="info"
          text="${null===(s=this._sellOption)||void 0===s?void 0:s.infoMessage}"
        ></bbva-notification-help>
      </div>
      <bbva-button-default
        ambient="primary"
        class="button"
        text="${null==Ke?void 0:Ke.purchaseOrderTypeButtonLabel}"
        @click=${this._onStepContinue}
      ></bbva-button-default>
    `}_onOptionSelected(e){this._isButtonActive=!0,this._optionSelected=e.detail.value,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-option-select",this._optionSelected)}_onStepContinue(){var e,t;this._completed=!0,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-expandible-step-continue",{orderSelected:{value:this._optionSelected,label:null===(e=this._orderType)||void 0===e||null===(t=e.options)||void 0===t?void 0:t.find((e=>e.value===this._optionSelected)).label},step:{id:"orderType",completed:this._completed,purchase:this.isPurchase}})}render(){return e`${this._renderTypeOrder}`}}customElements.define(kt.is,kt);var Pt=i`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.list-text {
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-between;
}

.list-text-tendency {
  display: flex;
  flex-direction: row;
  align-items: center;
  gap: 0.5rem;
}

.list-icon {
  display: flex;
  flex-direction: row;
  align-items: baseline;
}

[data-tag-name=bbva-type-icon] {
  margin-left: 0.25rem;
  margin-right: 0.5rem;
  --bbva-type-icon--_ambient--color: var(--colorsPrimaryCoreLight, ${l(d.primaryCoreLight)});
}

.list-data {
  display: flex;
  align-items: center;
  justify-content: space-between;
  flex-direction: row;
}

.list-container {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding-bottom: 0.5rem;
}

.notification-container {
  padding-top: 1rem;
  padding-bottom: 1rem;
}

.list-item {
  display: flex;
  flex-direction: row;
  justify-content: space-evenly;
  align-items: center;
}

.market-card-amount {
  display: flex;
  flex-direction: row;
  align-items: center;
  padding-bottom: 1rem;
}

.order-input-text {
  margin-top: 1rem;
}
`;class Tt extends(_(f(a(r)))){static get is(){return"order-detail"}static get scopedElements(){const e=[T,E,A,re,I,M,L,R,w,x,de,oe,...Tt.configurationScopedElements()];return Tt.scopedElementsFromClasses(e)}static get properties(){return{orderType:{type:String,attribute:"order-type"},isPurchase:{type:Boolean,attribute:"is-purchase"},disabledBtn:{type:Boolean,attribute:"disabled-btn"},completed:{type:Boolean},simulateResponseData:{type:Object,attribute:"simulate-response-data"},issuerName:{type:String,attribute:"issuer-name"},issuerDescription:{type:String,attribute:"issuer-description"},privateBankingPortfolioId:{type:String,attribute:"private-banking-portfolio-id"},issuerDataResponse:{type:Object,attribute:"issuer-data-response"},calculateSharesResponse:{type:Object,attribute:"calculate-shares-response"},selectedDate:{attribute:"selected-date",type:String},operationType:{type:String,attribute:"operation-type"},specificAmountsId:{type:Object,attribute:"specific-amounts-id"},fixNativeCalendar:{type:Boolean,attribute:"fix-native-calendar"},_orderSimulation:{type:Object},gmtTime:{type:Number,attribute:"gmt-time"}}}static get styles(){return[Pt,C.primary,S.primary,ne.primaryAlt,le.primaryAlt,B.primary,D.primary,q.primary,O.primary,N.primary,P.primary,ce.primary,o("trading-stocks-purchase-and-sale-shared-styles")]}constructor(){super(),this.ambient="primary",this.config={loader:!0},this.isPurchase=!1,this.disabledBtn=!1,this.completed=!1,this.privateBankingPortfolioId="",this.issuerName="",this.issuerDescription="",this.selectedDate=mt(),this.operationType="",this.simulateResponseData={},this.issuerDataResponse={},this.calculateSharesResponse={},this.specificAmountsId={},this.isNumberOfTitlesInvalid=!1,this.isTitlePriceInvalid=!1,this.isStopLossPriceInvalid=!1,this.orderType="",this.fixNativeCalendar=!1,this._orderSimulation={},this.gmtTime=0}updated(e){super.updated(e);var t;(["orderType","operationType","privateBankingPortfolioId","issuerName","issuerDescription"].forEach((t=>{e.has(t)&&(this._orderSimulation[t]=this[t])})),e.has("issuerDataResponse"))&&(this._orderSimulation.currency=null===(t=this._getLastPrice)||void 0===t?void 0:t.currency)}get _getLastPrice(){return yt(this.specificAmountsId.lastPrice,this.issuerDataResponse)}get _getTendency(){var e;return{tendency:null===(e=yt(this.specificAmountsId.tendency,this.issuerDataResponse))||void 0===e?void 0:e.amount}}get _getMarketData(){const{saleVolume:e}=this.issuerDataResponse??{};return{purchasePrice:yt(this.specificAmountsId.purchasePrice,this.issuerDataResponse),volumePrice:yt(this.specificAmountsId.volumePrice,this.issuerDataResponse),saleVolume:e,salesPrice:yt(this.specificAmountsId.salePrice,this.issuerDataResponse)}}get _getCommissions(){var e;const{fee:t}=this.simulateResponseData??{},s=null==t?void 0:t.itemizeFees.find((e=>"COMISSIONPERCENTAGE"===e.feeType)),i=null==t?void 0:t.itemizeFees.find((e=>"COMISSION"===e.feeType)),a=null==i?void 0:i.itemizeFeeUnits.find((e=>"AMOUNT"===e.unitType));return{percentage:null==s||null===(e=s.itemizeFeeUnits.find((e=>"PERCENTAGE"===e.unitType)))||void 0===e?void 0:e.percentage,commission:a}}get _getTax(){const{tax:e}=this.simulateResponseData??{},t=null==e?void 0:e.itemizeTaxes.find((e=>"IVA"===e.taxType));return{iva:null==t?void 0:t.itemizeTaxUnits.find((e=>"AMOUNT"===e.unitType))}}get _renderOrderDetail(){const{tendency:t}=this._getTendency,s=this._getLastPrice,{lastUpdateDate:i,lastUpdateTime:a}=this.issuerDataResponse??{};return e`
      <div class="list-text">
        <bbva-type-text
          tag="p"
          size="S"
          font-weight="350"
          text="${null==Ye?void 0:Ye.orderDetailLastPrice}"
        ></bbva-type-text>
        <div class="list-text-tendency">
          <bbva-type-amount
            id="order-detail-last-price"
            language="${this.language}"
            currency-code="${(null==s?void 0:s.currency)??""}"
            local-currency="${(null==s?void 0:s.currency)??""}"
            variant="S"
            type="bold"
            amount="${(null==s?void 0:s.amount)??""}"
            status="${vt(t)}"
            color="${bt(t)}"
            ?loading=${null===this._getLastPrice||null===this._getTendency}
          >
          </bbva-type-amount>
        </div>
      </div>
      <bbva-notification-help
        variant="info"
        text=${`${this.t(null==Ye?void 0:Ye.lastUpdate)} ${function(e,t=0){var s;const i=dt(e,!0).subtract(t,"hours"),a=dt().utcOffset()/60;return null===(s=i.add(a,"hours").format("DD MMMM YYYY, HH:mm"))||void 0===s?void 0:s.replace("  ",",")}(`${i}T${a}`,this.gmtTime)} h`}
      ></bbva-notification-help>
      ${this._renderMarketPositions}
      <bbva-type-text
        tag="p"
        font-weight="500"
        alignment="left"
        size="S"
        text=${null==Ye?void 0:Ye.orderCharacteristics}
      ></bbva-type-text>
      ${this._renderOrderDetailInputs} ${this._renderCostandCommissions}
      ${this._renderImportApproximate}
      <bbva-button-default
        fullwidth
        text=${null==Ye?void 0:Ye.orderDetailButtonLabel}
        ?disabled=${!this.disabledBtn}
        @click=${this._onStepContinue}
      ></bbva-button-default>
    `}get _renderMarketPositions(){const{purchasePrice:t,volumePrice:s,salesPrice:i,saleVolume:a}=this._getMarketData;return e`
      <bbva-header-category
        class="notification-container"
        text=${this.t(null==Ye?void 0:Ye.marketBestPostures)}
      ></bbva-header-category>
      <bbva-panel-comparative
        first-title=${this.t(null==Ye?void 0:Ye.panelComparativePurchaseLabel)}
        second-title=${this.t(null==Ye?void 0:Ye.panelComparativeSaleLabel)}
        first-amount="${null==t?void 0:t.amount}"
        second-amount="${null==i?void 0:i.amount}"
        first-description="${this.t(null==Ye?void 0:Ye.orderDetailAvailableTitles,{titles:null==s?void 0:s.amount})}"
        second-description="${this.t(null==Ye?void 0:Ye.orderDetailAvailableTitles,{titles:a})}"
        local-currency="${(null==i?void 0:i.currency)??""}"
        currency-code="${(null==i?void 0:i.currency)??""}"
        show-decimals
        language="${this.language}"
      ></bbva-panel-comparative>
    `}get _renderOrderDetailInputs(){return"BOOK"===this.orderType?this._renderOrderDetailBookTemplate:"CONDITIONED"===this.orderType?this._renderOrderDetailConditionedTemplate:n}resetStep(){const e=this.shadowRoot.querySelectorAll('[data-tag-name="bbva-form-input"]');Array.from(e).forEach((e=>{"settlementDateCalendar"!==e.id?e.resetValue=!0:e.value=mt()})),this.selectedDate=mt(),this.disabledBtn=!1}get _renderOrderDetailBookTemplate(){var t,s,i,a;const r=this._getLastPrice;let o;return o=this.selectedDate.length>0?this.fixNativeCalendar?_t(this.selectedDate,"YYYY-MM-DD","DD-MM-YYYY"):this.selectedDate:this.fixNativeCalendar?_t(mt(),"YYYY-MM-DD","DD-MM-YYYY"):mt(),e`
      <bbva-form-input
        id="numberTitles"
        ambient="primary-alt"
        type="number"
        mode-input="numeric"
        autoValidate
        allowed-pattern="[0-9]"
        label="${this.t(null==Ye||null===(t=Ye.orderDetailBookTemplate)||void 0===t?void 0:t.numberOfTitlesInputLabel)}"
        ?invalid=${this.isNumberOfTitlesInvalid}
        info-message=${this._infoMessageForNumberOfTitles}
        error-message=${this._errorMessagesForNumberOfTitles}
        clear-accessible-text=${this.t(null==Ye?void 0:Ye.inputClear)}
        @form-input-value-change="${e=>this._getInputNumberTitles(e.detail)}"
        @form-field-input-blur="${this._validateInputTypeOrder}"
      ></bbva-form-input>
      <div class="order-input-text">
        <bbva-form-input
          id="minimumPrice"
          ambient="primary-alt"
          type="amount"
          mode-input="decimal"
          label=${this.t(null==Ye||null===(s=Ye.orderDetailBookTemplate)||void 0===s?void 0:s.minimumTitlesPriceLabel)}
          language="${this.language}"
          currency-code="${(null==r?void 0:r.currency)??""}"
          local-currency="${(null==r?void 0:r.currency)??""}"
          clear-accessible-text=${this.t(null==Ye?void 0:Ye.inputClear)}
          @form-amount-input-change="${e=>this._getInputMinimumPrice(e.detail)}"
          @form-field-input-blur="${this._validateInputTypeOrder}"
        ></bbva-form-input>
      </div>
      <div class="order-input-text">
        <bbva-form-input
          id="settlementDateCalendar"
          type="${this.fixNativeCalendar?"text":"date"}"
          label=${this.t(null==Ye||null===(i=Ye.orderDetailBookTemplate)||void 0===i?void 0:i.calendarInputLabel)}
          info-message=${this.t(null==Ye||null===(a=Ye.orderDetailBookTemplate)||void 0===a?void 0:a.calendarInfoLabel)}
          ambient="primary-alt"
          min=${mt()}
          max=${gt()}
          value=${o}
          @click="${this._launchCalendar}"
          @form-input-value-change="${this._getInputDateValidity}"
          ?readonly=${this.native}
          ?action-into-form=${this.fixNativeCalendar}
          action-variant="${this.fixNativeCalendar?"no-background":""}"
          action-icon="${this.fixNativeCalendar?c():""}"
        ></bbva-form-input>
      </div>
    `}get _renderOrderDetailConditionedTemplate(){var t,s,i,a,r,o,n,l,d,c;const u=this._getLastPrice;return e`
      <bbva-type-text
        tag="p"
        font-weight="500"
        alignment="left"
        text=${this.t(null==Ye||null===(t=Ye.orderDetailConditionedOrder)||void 0===t?void 0:t.conditionedPurchaseLabel)}
      ></bbva-type-text>
      ${this._renderOrderDetailBookTemplate}
      <bbva-type-text
        tag="p"
        font-weight="500"
        alignment="left"
        text=${this.t(null==Ye||null===(s=Ye.orderDetailConditionedOrder)||void 0===s?void 0:s.conditionedSaleLabel)}
      ></bbva-type-text>
      <bbva-form-input
        id="targetPrice"
        autoValidate
        ambient="primary-alt"
        type="amount"
        mode-input="decimal"
        local-currency="${(null==u?void 0:u.currency)??""}"
        currency-code="${(null==u?void 0:u.currency)??""}"
        label=${this.t(null==Ye||null===(i=Ye.orderDetailConditionedOrder)||void 0===i?void 0:i.conditionedPlaceHolderSaleLabel)}
        language="${this.language}"
        ?invalid=${this.isTitlePriceInvalid}
        info-message=${this._infoMessageForMinimumTitlesPrice}
        error-message=${this.t(null==Ye||null===(a=Ye.orderDetailConditionedOrder)||void 0===a?void 0:a.conditionedPricePlaceHolderAmountLabel,{titlePrice:null===(r=this._orderSimulation)||void 0===r?void 0:r.titlePriceAmount})}
        @form-amount-input-change="${e=>this._getInputTargetPrice(e.detail)}"
        @form-field-input-blur="${this._validateInputTypeOrder}"
      ></bbva-form-input>
      <div class="order-input-text">
        <bbva-form-input
          id="stopLoss"
          autoValidate
          ambient="primary-alt"
          type="amount"
          mode-input="decimal"
          currency-code="${(null==u?void 0:u.currency)??""}"
          local-currency="${(null==u?void 0:u.currency)??""}"
          label=${this.t(null==Ye||null===(o=Ye.orderDetailConditionedOrder)||void 0===o?void 0:o.conditionedPricePlaceHolderStopLoss)}
          language="${this.language}"
          ?invalid=${this.isStopLossPriceInvalid}
          info-message=${this._infoMessageForStopLossTitlesPrice}
          error-message=${this.t(null==Ye||null===(n=Ye.orderDetailConditionedOrder)||void 0===n?void 0:n.conditionedPricePlaceHolderStopLossErrorLabel,{titlePrice:null===(l=this._orderSimulation)||void 0===l?void 0:l.titlePriceAmount})}
          @form-amount-input-change="${e=>this._getInputStopLoss(e.detail)}"
          @form-field-input-blur="${this._validateInputTypeOrder}"
        ></bbva-form-input>
      </div>
      <div class="list-text">
        <bbva-type-text
          tag="p"
          size="S"
          text=${this.t(null==Ye||null===(d=Ye.orderDetailConditionedOrder)||void 0===d?void 0:d.conditionedPricePlaceHolderMonitoringValidityLabel)}
        ></bbva-type-text>
        <bbva-type-text
          tag="span"
          size="S"
          font-style="italic"
          font-weight="700"
          text="${pt(mt())}"
        >
        </bbva-type-text>
      </div>
      <bbva-notification-help
        variant="info"
        text=${this.t(null==Ye||null===(c=Ye.orderDetailConditionedOrder)||void 0===c?void 0:c.conditionedPricePlaceHolderMonitoringValidityInfoLabel)}
      ></bbva-notification-help>
    `}get _renderCostandCommissions(){var t,s;return e`
      <bbva-header-category
        class="notification-container"
        text=${this.t(null==Ye||null===(t=Ye.orderDetailCostsAndCommissions)||void 0===t?void 0:t.costsAndCommissionsLabel)}
      ></bbva-header-category>
      ${this._renderTotalEstimated} ${this._renderCommissionPercentage} ${this._renderCommission}
      ${this._renderIvaCommission}
      <div class="notification-container">
        <bbva-notification-message variant="caution">
          ${this.t(null==Ye||null===(s=Ye.orderDetailCostsAndCommissions)||void 0===s?void 0:s.costsAndCommissionsInfoLabel)}
        </bbva-notification-message>
      </div>
    `}get _renderTotalEstimated(){var t,s,i,a,r,o;return e`
      <div class="list-container">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${this.t(null==Ye||null===(t=Ye.orderDetailCostsAndCommissions)||void 0===t?void 0:t.costsAndCommissionsEstimatedTotalLabel)}
        >
        </bbva-type-text>
        <div class="list-data">
          <bbva-type-amount
            type="bold"
            class="list-text"
            currency-code="${(null===(s=this.simulateResponseData)||void 0===s||null===(i=s.otherAmountsTotal)||void 0===i?void 0:i.currency)??""}"
            local-currency="${(null===(a=this.simulateResponseData)||void 0===a||null===(r=a.otherAmountsTotal)||void 0===r?void 0:r.currency)??""}"
            variant="S"
            amount=${Object.keys(this.simulateResponseData).length>0?null===(o=this.simulateResponseData.otherAmountsTotal)||void 0===o?void 0:o.amount:0}
            language="${this.language}"
          >
          </bbva-type-amount>
        </div>
      </div>
    `}get _renderCommissionPercentage(){var t;const{percentage:s}=this._getCommissions;return e`
      <div class="list-container">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${this.t(null==Ye||null===(t=Ye.orderDetailCostsAndCommissions)||void 0===t?void 0:t.costsAndCommissionsPercentageLabel)}
        >
        </bbva-type-text>
        <div class="list-data">
          <bbva-type-amount
            class="list-text"
            type="bold"
            symbol-right
            variant="S"
            language="${this.language}"
            symbol="%"
            amount=${s??0}
          >
          </bbva-type-amount>
        </div>
      </div>
    `}get _renderCommission(){var t,s;const{commission:i}=this._getCommissions;return e`
      <div class="list-container">
        <div class="list-item">
          <bbva-type-text
            class="list-text"
            tag="span"
            size="S"
            text=${this.t(null==Ye||null===(t=Ye.orderDetailCostsAndCommissions)||void 0===t?void 0:t.costsAndCommissionsCommissionLabel)}
          >
          </bbva-type-text>
          <bbva-type-link
            @click="${()=>this._dispatchCustomEvent("trading-stocks-purchase-and-sale-order-detail-comission-info-show",{purchase:this.isPurchase})}"
            aria-label=${this.t(null==Ye||null===(s=Ye.orderDetailCostsAndCommissions)||void 0===s?void 0:s.costsAndCommissionsCommissionLabel)}
          >
            <bbva-type-icon icon="${u()}" size="16" icon-color="#004481"></bbva-type-icon>
          </bbva-type-link>
        </div>

        <bbva-type-amount
          class="list-text"
          type="bold"
          currency-code="${(null==i?void 0:i.currency)??""}"
          local-currency="${(null==i?void 0:i.currency)??""}"
          variant="S"
          amount=${(null==i?void 0:i.amount)??0}
          language="${this.language}"
        >
        </bbva-type-amount>
      </div>
    `}get _renderIvaCommission(){var t,s;const{iva:i}=this._getTax;return e`
      <div class="list-container">
        <div class="list-item">
          <bbva-type-text
            class="list-text"
            tag="span"
            size="S"
            text=${this.t(null==Ye||null===(t=Ye.orderDetailCostsAndCommissions)||void 0===t?void 0:t.costsAndCommissionsIVALabel)}
          >
          </bbva-type-text>
          <div class="list-icon">
            <bbva-type-link
              @click="${()=>this._dispatchCustomEvent("trading-stocks-purchase-and-sale-order-detail-iva-info-show")}"
              aria-label=${this.t(null==Ye||null===(s=Ye.orderDetailCostsAndCommissions)||void 0===s?void 0:s.costsAndCommissionsIVALabel)}
            >
              <bbva-type-icon icon="${u()}" size="16" icon-color="#004481"></bbva-type-icon>
            </bbva-type-link>
          </div>
        </div>

        <bbva-type-amount
          class="list-text"
          type="bold"
          currency-code="${(null==i?void 0:i.currency)??""}"
          local-currency="${(null==i?void 0:i.currency)??""}"
          variant="S"
          amount="${(null==i?void 0:i.amount)??0}"
          language="${this.language}"
        >
        </bbva-type-amount>
      </div>
    `}get _renderImportApproximate(){var t,s,i,a,r,o,n,l,d,c;const p=this.isPurchase?null==Ye||null===(s=Ye.orderDetailCostsAndCommissions)||void 0===s?void 0:s.costsAndCommissionsApproximateAmountLabel:null==Ye||null===(t=Ye.orderDetailCostsAndCommissions)||void 0===t?void 0:t.costsAndCommissionsApproximateAmountLabelSale;return e`
      <bbva-type-text tag="span" size="S" text=${this.t(p)}></bbva-type-text>
      <bbva-type-amount
        class="list-text"
        language="${this.language}"
        variant="3xl"
        type="bold"
        currency-code="${(null===(i=this.simulateResponseData)||void 0===i||null===(a=i.totalPrice)||void 0===a?void 0:a.currency)??""}"
        local-currency="${(null===(r=this.simulateResponseData)||void 0===r||null===(o=r.totalPrice)||void 0===o?void 0:o.currency)??""}"
        amount=${Object.keys(this.simulateResponseData).length>0?null===(n=this.simulateResponseData)||void 0===n||null===(l=n.totalPrice)||void 0===l?void 0:l.amount:0}
      >
      </bbva-type-amount>
      <div class="market-card-amount">
        <bbva-type-text
          tag="span"
          size="S"
          text=${this.t(null==Ye||null===(d=Ye.orderDetailCostsAndCommissions)||void 0===d?void 0:d.costsAndCommissionsWarningLabel)}
        ></bbva-type-text>
        <bbva-type-link
          @click="${()=>this._dispatchCustomEvent("trading-stocks-purchase-and-sale-order-detail-cost-and-commission-info-show")}"
          aria-label=${this.t(null==Ye||null===(c=Ye.orderDetailCostsAndCommissions)||void 0===c?void 0:c.costsAndCommissionsWarningLabel)}
        >
          <bbva-type-icon icon="${u()}" size="16" icon-color="#004481"></bbva-type-icon>
        </bbva-type-link>
      </div>
    `}get _infoMessageForNumberOfTitles(){var e,t,s,i,a;return this.isNumberOfTitlesInvalid?"":this.isPurchase?this.t(null==Ye||null===(i=Ye.orderDetailBookTemplate)||void 0===i?void 0:i.numberOfTitlesInfoPurchaseLabel,{titles:null===(a=this.calculateSharesResponse.positionSize)||void 0===a?void 0:a.quantity}):this.t(null==Ye||null===(e=Ye.orderDetailBookTemplate)||void 0===e?void 0:e.numberOfTitlesInfoSaleLabel,{titles:null===(t=this.calculateSharesResponse)||void 0===t||null===(s=t.positionSize)||void 0===s?void 0:s.quantity})}get _errorMessagesForNumberOfTitles(){var e,t,s,i,a;return this.isPurchase?this.t(null==Ye||null===(i=Ye.orderDetailBookTemplate)||void 0===i?void 0:i.numberOfTitlesErrorPurchaseLabel,{titles:null===(a=this.calculateSharesResponse.positionSize)||void 0===a?void 0:a.quantity}):this.t(null==Ye||null===(e=Ye.orderDetailBookTemplate)||void 0===e?void 0:e.numberOfTitlesErrorSaleLabel,{titles:null===(t=this.calculateSharesResponse)||void 0===t||null===(s=t.positionSize)||void 0===s?void 0:s.quantity})}get _infoMessageForMinimumTitlesPrice(){var e,t;const s=null===(e=this._orderSimulation)||void 0===e?void 0:e.titlePriceAmount;var i,a;return s>0&&!this.isTitlePriceInvalid?this.t(null==Ye||null===(i=Ye.orderDetailConditionedOrder)||void 0===i?void 0:i.conditionedPricePlaceHolderAmountLabel,{titlePrice:null===(a=this._orderSimulation)||void 0===a?void 0:a.titlePriceAmount}):s>0&&this.isTitlePriceInvalid?"":this.t(null==Ye||null===(t=Ye.orderDetailConditionedOrder)||void 0===t?void 0:t.conditionedPricePlaceHolderLabel)}get _infoMessageForStopLossTitlesPrice(){var e,t;const s=null===(e=this._orderSimulation)||void 0===e?void 0:e.titlePriceAmount;var i,a;return s>0&&!this.isStopLossPriceInvalid?this.t(null==Ye||null===(i=Ye.orderDetailConditionedOrder)||void 0===i?void 0:i.conditionedPricePlaceHolderStopLossAmountLabel,{titlePrice:null===(a=this._orderSimulation)||void 0===a?void 0:a.titlePriceAmount}):s>0&&this.isStopLossPriceInvalid?"":this.t(null==Ye||null===(t=Ye.orderDetailConditionedOrder)||void 0===t?void 0:t.conditionedPricePlaceHolderStopLossLabel)}_validateQuantities(e){var t,s;const i=null===(t=this.calculateSharesResponse)||void 0===t||null===(s=t.positionSize)||void 0===s?void 0:s.quantity;void 0!==i&&void 0!==e&&(this.isNumberOfTitlesInvalid=e>i)}_validatePrice(e){var t;const s=null===(t=this._orderSimulation)||void 0===t?void 0:t.titlePriceAmount;void 0!==s&&void 0!==e&&(this.isTitlePriceInvalid=e<s)}_validateStopLossPrice(e){var t;const s=null===(t=this._orderSimulation)||void 0===t?void 0:t.titlePriceAmount;void 0!==s&&void 0!==e&&(this.isStopLossPriceInvalid=e>s)}_getInputNumberTitles(e){const t=Number(e.value);this._validateQuantities(t),this._orderSimulation.titleQuantity=t,this.requestUpdate()}_getInputMinimumPrice(e){const t=Number(e.amount);this._orderSimulation.titlePriceAmount=t,this.requestUpdate()}_getInputDateValidity({detail:e}){const t=e.value;this.selectedDate=t,this._orderSimulation={...this._orderSimulation,selectedDate:t},this._validateInputTypeOrder()}_validateDataInputBook(){const{titlePriceAmount:e,titleQuantity:t}=this._orderSimulation;if(Boolean(e&&t&&this.selectedDate&&!this.isNumberOfTitlesInvalid)){const e={...this._orderSimulation,selectedDate:this.selectedDate};this._dispatchCustomEvent("trading-stocks-purchase-and-sale-sale-dm-get-order-simulation-body-book-respond",e)}}_validateInputTypeOrder(){"BOOK"===this.orderType?this._validateDataInputBook():this._validateDataInputConditioned(),this._dispatchCustomEvent("trading-stocks-purchase-and-sale-form-fill")}_getInputTargetPrice(e){const t=Number(e.amount);this._validatePrice(t),this._orderSimulation.titleObjectivePriceAmount=t,this.requestUpdate()}_getInputStopLoss(e){const t=Number(e.amount);this._validateStopLossPrice(t),this._orderSimulation.titleMinimumPriceAmount=t,this.requestUpdate()}_validateDataInputConditioned(){const{titlePriceAmount:e,titleQuantity:t,titleObjectivePriceAmount:s,titleMinimumPriceAmount:i}=this._orderSimulation;if(Boolean(e&&t&&this.selectedDate&&s&&i&&!this.isNumberOfTitlesInvalid&&!this.isTitlePriceInvalid&&!this.isStopLossPriceInvalid)){const e={...this._orderSimulation,selectedDate:this.selectedDate};this._dispatchCustomEvent("trading-stocks-purchase-and-sale-sale-dm-get-order-simulation-body-conditioned-respond",e)}}_onStepContinue(){this.completed=!0,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-expandible-step-continue",{step:{id:"orderDetail",completed:this.completed,purchase:this.isPurchase}})}_launchCalendar(){this._dispatchCustomEvent("trading-stocks-purchase-and-sale-calendar-open",{purchase:this.isPurchase}),this.native&&this._dispatchCustomEvent("trading-stocks-purchase-and-sale-calendar-show",{dateFormat:"yyyy-MM-dd",defaultDate:mt(),minDate:mt(),maxDate:gt(),disableWeekends:!0})}render(){return e`${super.render()} ${this._renderOrderDetail}`}}customElements.define(Tt.is,Tt);var Et=i`
[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}

[data-tag-name=bbva-type-icon] {
  --bbva-type-icon--_ambient--color: token("foundations.colors.primaryCore");
}

.modal-container {
  display: flex;
  flex-direction: column;
  gap: 1rem;
  padding-bottom: 1rem;
}

.modal-container-warning {
  display: flex;
  flex-direction: column;
  gap: 1rem;
}
`;class $t extends(_(a(f(r)))){static get is(){return"short-info-modals"}static get scopedElements(){const e=[j,I,T];return $t.scopedElementsFromClasses(e)}static get properties(){return{modalConfig:{type:Object,attribute:"modal-config"},visible:{type:Boolean},appSettingResponse:{type:Object,attribute:"app-setting-response"}}}constructor(){super(),this.visible=!1,this.modalConfig={},this.appSettingResponse={},this.headerButtons=[{id:"btn-close",name:`${this.t("trading-stocks-purchase-and-sale-header-close")}`,icon:p(),accessibilityText:`${this.t("trading-stocks-purchase-and-sale-header-close")}`}]}static get styles(){return[Et,B.primary,C.primary,o("short-info-modals-shared-styles")]}get _renderModal(){var t,s,i,a,r,o,n,l;return e`
      <bbva-help-modal
        modal-type=${null===(t=this.modalConfig)||void 0===t?void 0:t.modalType}
        ?visible=${this.visible}
        ?full-height=${null===(s=this.modalConfig)||void 0===s?void 0:s.fullHeight}
        ?fixed-footer=${null===(i=this.modalConfig)||void 0===i?void 0:i.fixedFooter}
        header-text=${null===(a=this.modalConfig)||void 0===a?void 0:a.headerText}
        button-text=${null===(r=this.modalConfig)||void 0===r?void 0:r.buttonText}
        link-text=${null!==(o=this.modalConfig)&&void 0!==o&&o.linkText?this.t(this.modalConfig.linkText):""}
        .headerButtons=${this.headerButtons}
        .titleIcon=${null===(n=this.modalConfig)||void 0===n?void 0:n.titleIcon}
        @header-main-close-icon-click=${e=>e.stopPropagation()}
        @help-modal-footer-button-click=${()=>{var e;this._dispatchCustomEvent("trading-stocks-purchase-and-sale-short-info-modal-button-click",null===(e=this.modalConfig)||void 0===e?void 0:e.id)}}
        @help-modal-close=${()=>this._dispatchCustomEvent("trading-stocks-purchase-and-sale-short-info-modal-close")}
      >
        <div class="content" slot="slot-content">
          ${this._getModalBody(null===(l=this.modalConfig)||void 0===l?void 0:l.modalBody)}
        </div>
      </bbva-help-modal>
    `}_getModalBody(t){const s={comissionInfo:this._renderModalCommision,ivaInfo:this._renderModalIva,costAndCommissionInfo:this._renderModalCostAndComission,outOfSchedule:this._renderOutOfSchedule,outOfRange:this._renderOutOfRange,minimumAmountToInvest:this._renderMinimumAmountToInvest,insufficientBalance:this._renderInsufficientBalance,noServiceAvailable:this._renderNoServiceAvailable,contractWithoutIssuer:this._renderModalContractWithoutIssuer,exitOperative:this._exitOperativeModal};return s[t]?e`${s[t]}`:n}get _renderModalCommision(){return e`
      <div class="modal-container" ambient="primary">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${this.t("trading-stocks-purchase-and-sale-order-detail-commision-modal")}
        >
        </bbva-type-text>
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${this.t("trading-stocks-purchase-and-sale-order-detail-commision-modal-2")}
        >
        </bbva-type-text>
      </div>
    `}get _renderModalIva(){return e`
      <div class="modal-container" ambient="primary">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${this.t("trading-stocks-purchase-and-sale-order-detail-iva-commision-modal")}
        >
        </bbva-type-text>
      </div>
    `}get _renderModalCostAndComission(){return e`
      <div class="modal-container" ambient="primary">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${this.t("trading-stocks-purchase-and-sale-order-detail-import-question-modal")}
        >
        </bbva-type-text>
      </div>
    `}get _renderOutOfSchedule(){var t,s;return e`
      <div class="modal-container-warning" ambient="primary">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${this.t("trading-stocks-purchase-and-sale-error-simulation-schedule-description")}
        >
        </bbva-type-text>
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${this.t("trading-stocks-purchase-and-sale-error-simulation-schedule-hours",{openingHours:null===(t=this.appSettingResponse)||void 0===t?void 0:t.openingHours,closingHours:null===(s=this.appSettingResponse)||void 0===s?void 0:s.closingHours})}
        >
        </bbva-type-text>
      </div>
    `}get _renderOutOfRange(){var t,s;return e`
      <div class="modal-container-warning" ambient="primary">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${this.t("trading-stocks-purchase-and-sale-error-simulation-market-range-description")}
        >
        </bbva-type-text>
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${this.t("trading-stocks-purchase-and-sale-error-simulation-market-range",{percentageActions:null===(t=this.appSettingResponse)||void 0===t?void 0:t.percentageActions,percentageEmisors:null===(s=this.appSettingResponse)||void 0===s?void 0:s.percentageEmisors})}
        >
        </bbva-type-text>
      </div>
    `}get _renderMinimumAmountToInvest(){var t,s;return e`<bbva-type-text
      class="list-text"
      ambient="primary"
      tag="span"
      size="S"
      text=${(null===(t=this.appSettingResponse)||void 0===t?void 0:t.minimumAmountToInvest)&&this.t("trading-stocks-purchase-and-sale-error-simulation-minimum-amount",{minimumAmountToInvest:null===(s=this.appSettingResponse)||void 0===s?void 0:s.minimumAmountToInvest})}
    >
    </bbva-type-text>`}get _renderInsufficientBalance(){return e`
      <bbva-type-text
        class="list-text"
        ambient="primary"
        tag="span"
        size="S"
        text=${this.t("trading-stocks-purchase-and-sale-error-simulation-insufficient-balance-description")}
      >
      </bbva-type-text>
    `}get _renderNoServiceAvailable(){return e`
      <bbva-type-text
        class="list-text"
        ambient="primary"
        tag="span"
        size="S"
        text=${this.t("trading-stocks-purchase-and-sale-error-simulation-no-service-available")}
      >
      </bbva-type-text>
    `}get _renderModalContractWithoutIssuer(){return e`
      <div class="modal-container-warning" ambient="primary">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${this.t("trading-stocks-purchase-and-sale-error-simulation-contract-without-issuer")}
        >
        </bbva-type-text>
      </div>
    `}get _exitOperativeModal(){return e` <div class="modal-container-warning" ambient="primary">
      <bbva-type-text
        class="list-text"
        tag="span"
        size="S"
        text=${this.t("trading-stocks-purchase-and-sale-exit-operative-description")}
      >
      </bbva-type-text>
    </div>`}render(){return e` ${this._renderModal} `}}function xt(e){switch(e){case"caution":return m();case"warning":return h();default:return u()}}customElements.define($t.is,$t);const Dt=e=>({id:null==e?void 0:e.id,fullHeight:null==e?void 0:e.fullHeight,headerText:null==e?void 0:e.titleInfoText,modalType:e.modalType??"info",titleIcon:xt(null==e?void 0:e.titleIcon),modalBody:null==e?void 0:e.description,buttonText:(null==e?void 0:e.buttonText)??"",linkText:(null==e?void 0:e.linkText)??"",fixedFooter:null==e?void 0:e.fixedFooter}),Ot=e=>({fullHeight:!0,fixedFooter:!0,headerType:"modal-initial",headerText:e.headerReceiptText,panel:{microillustration:e.panel.microillustration,microillustrationSize:e.panel.microillustrationSize},modalBody:e.modalBody}),At=e=>({fullHeight:null==e?void 0:e.fullHeight,modalType:e.modalType??"info",titleIcon:xt(null==e?void 0:e.titleIcon),headerText:null==e?void 0:e.headerText,titleText:null==e?void 0:e.titleInfoText,purchaseTitleText:null==e?void 0:e.purchaseTitleInfoText,buttonText:(null==e?void 0:e.buttonText)??"",linkText:(null==e?void 0:e.linkText)??"",descriptionText:null==e?void 0:e.modalBody,fixedFooter:null==e?void 0:e.fixedFooter}),Rt=e=>{var t;return{fullHeight:null==e?void 0:e.fullHeight,headerText:null==e?void 0:e.headerText,fixedFooter:null==e?void 0:e.fixedFooter,panel:{receiptPanelHeader:null==e||null===(t=e.panel)||void 0===t?void 0:t.receiptPanelHeader,microillustration:e.panel.microillustration,microillustrationSize:e.panel.microillustrationSize}}},It=e=>({id:null==e?void 0:e.id,fullHeight:null==e?void 0:e.fullHeight,headerText:null==e?void 0:e.titleInfoText,modalType:e.modalType??"info",titleIcon:xt(null==e?void 0:e.titleIcon),modalBody:null==e?void 0:e.description,buttonText:(null==e?void 0:e.buttonText)??"",fixedFooter:null==e?void 0:e.fixedFooter});var Mt=i`
:host {
  box-sizing: border-box;
  position: relative;
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

[data-tag-name=bbva-type-icon] {
  flex: none;
  margin-left: 0.5rem;
}

.flex {
  display: flex;
  justify-content: space-between;
  padding-bottom: 0.5rem;
}

.list-container {
  display: flex;
  align-items: center;
  justify-content: space-between;
  flex-direction: row;
  padding-bottom: 0.5rem;
}

.list-text {
  color: var(--colorsPrimary, ${l(d.primary)});
}
`;class Lt extends(V(g(a(r)))){static get is(){return"trading-stocks-purchase-and-sale-list-amount"}static get scopedElements(){const e=[E,T,I,L,$t];return Lt.scopedElementsFromClasses(e)}static get properties(){return{label:{type:String},value:{type:String},isAmount:{type:Boolean,attribute:"is-amount"},isItalic:{type:Boolean,attribute:"is-italic"},withIcon:{type:Boolean,attribute:"with-icon"},shortInfoModalConfigId:{type:String,attribute:"short-info-modal-config-id"},currency:{type:String},_infoModalVisible:{type:Boolean},_comissionInfoModalConfig:{type:Object}}}constructor(){super(),this.label="",this.value="",this.isAmount=!1,this.isItalic=!1,this.withIcon=!1,this.shortInfoModalConfigId="",this.currency="",this.infoModalConfig={},this._infoModalVisible=!1}static get styles(){return[Mt,B.primary,q.primary,S.primaryAlt,C.primaryAlt,o("trading-stocks-purchase-and-sale-list-amount")]}_shortInfoModalConfig(e){"order-detail-comission-info-modal"===e&&(this._comissionInfoModalConfig={id:e,fullHeight:!1,fixedFooter:!1,description:"comissionInfo",titleInfoText:this.t(null==rt?void 0:rt.modalTitle)}),"order-detail-iva-info-modal"===e&&(this._comissionInfoModalConfig={id:e,fullHeight:!1,fixedFooter:!1,description:"ivaInfo",titleInfoText:this.t(null==rt?void 0:rt.ivaModalTitle)}),this.infoModalConfig=Dt(this._comissionInfoModalConfig),this._infoModalVisible=!0}get _renderShortInfoModal(){return e`
      <short-info-modals
        ?visible=${this._infoModalVisible}
        .modalConfig=${this.infoModalConfig}
        @trading-stocks-purchase-and-sale-short-info-modal-close=${()=>{this._infoModalVisible=!1}}
      >
      </short-info-modals>
    `}get _renderSimplelistTpl(){return e` <div class="list-container" ambient="primary">
      <bbva-type-text
        class="list-text"
        tag="span"
        size="S"
        text=${this.label??""}
      ></bbva-type-text>
      ${this.withIcon?e`<bbva-type-link
            @click="${()=>this._shortInfoModalConfig(this.shortInfoModalConfigId)}"
          >
            <bbva-type-icon icon="${u()}" size="16" icon-color="#1464A5"></bbva-type-icon>
          </bbva-type-link>`:n}
      ${this.isAmount?e`<bbva-type-amount
            class="list-text"
            language="${this.language}"
            currency-code="${this.currency??""}"
            local-currency="${this.currency??""}"
            variant="S"
            type="bold"
            amount=${this.value??""}
          ></bbva-type-amount>`:e`<bbva-type-text
            class="list-text"
            tag="span"
            size="S"
            font-weight="500"
            alignment="right"
            font-style="${this.isItalic?"italic":"normal"}"
            text=${this.value??""}
          >
          </bbva-type-text>`}
    </div>`}render(){return e`${this._renderSimplelistTpl} ${this._renderShortInfoModal}`}}customElements.define(Lt.is,Lt);var wt=i`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.list-text {
  color: var(--colorsPrimary, ${l(d.primary)});
}

.list-container {
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding-top: 0.5rem;
  padding-bottom: 0.5rem;
}

.fit {
  margin-bottom: 1rem;
}

[data-tag-name=bbva-header-category] {
  padding: 0.5rem 0;
}
`;class Bt extends(_(f(a(r)))){static get is(){return"order-detail-summary"}static get scopedElements(){const e=[E,x,Lt];return Bt.scopedElementsFromClasses(e)}static get properties(){return{orderType:{type:String,attribute:"order-type"},simulateResponseData:{type:Object,attribute:"simulate-response-data"},orderDetailData:{type:Object,attribute:"order-detail-data"}}}static get styles(){return[wt,S.primary,P.primary,o("order-detail-summary-shared-styles")]}constructor(){super(),this.orderType="",this.simulateResponseData={},this.orderDetailData={}}get _getCommissions(){var e;const{fee:t}=this.simulateResponseData??{},s=null==t?void 0:t.itemizeFees.find((e=>"COMISSIONPERCENTAGE"===e.feeType)),i=null==t?void 0:t.itemizeFees.find((e=>"COMISSION"===e.feeType)),a=null==i?void 0:i.itemizeFeeUnits.find((e=>"AMOUNT"===e.unitType));return{percentage:null==s||null===(e=s.itemizeFeeUnits.find((e=>"PERCENTAGE"===e.unitType)))||void 0===e?void 0:e.percentage,commission:a}}get _getTax(){const{tax:e}=this.simulateResponseData??{},t=null==e?void 0:e.itemizeTaxes.find((e=>"IVA"===e.taxType));return{iva:null==t?void 0:t.itemizeTaxUnits.find((e=>"AMOUNT"===e.unitType))}}_renderListAmount(t,s,i=!1,a,r=!1){return e`
      <trading-stocks-purchase-and-sale-list-amount
        ?is-amount=${i}
        ?is-italic=${r}
        label=${t}
        language=${this.language}
        currency=${a}
        value=${s}
      ></trading-stocks-purchase-and-sale-list-amount>
    `}get _renderOrderDetailSummaryBookTpl(){var t,s;const{title:i}=this.simulateResponseData,{selectedDate:a}=this.orderDetailData??{},r=this.t(null==We?void 0:We.titlesQuantityLabel),o=this.t(null==We?void 0:We.titlePriceLabel),n=this.t(null==We?void 0:We.settlementDateLabel);return e`
      ${this._renderListAmount(r,(null==i?void 0:i.quantity)??"")}
      ${this._renderListAmount(o,(null==i||null===(t=i.price)||void 0===t?void 0:t.amount)??"",!0,(null==i||null===(s=i.price)||void 0===s?void 0:s.currency)??"")}
      ${this._renderListAmount(n,ut(null==a?void 0:a.replace(/-/g,""),"DD/MM/YYYY")??"",!1,!0)}
    `}get _renderOrderDetailConditionedTpl(){var t,s,i,a;const{title:r}=this.simulateResponseData,o=this.t(null==We?void 0:We.objectivePriceLabel),n=this.t(null==We?void 0:We.stopLoss),l=this.t(null==We?void 0:We.monitoringDate);return e`
      <bbva-header-category
        variant="default"
        ambient="secondary"
        text=${this.t(null==We?void 0:We.conditionedPurchaseLabel)}
      ></bbva-header-category>
      ${this._renderOrderDetailSummaryBookTpl}
      <bbva-header-category
        variant="default"
        ambient="secondary"
        text=${this.t(null==We?void 0:We.conditionedSaleLabel)}
      ></bbva-header-category>
      ${this._renderListAmount(o,(null==r||null===(t=r.objectivePrice)||void 0===t?void 0:t.amount)??"",!0,(null==r||null===(s=r.objectivePrice)||void 0===s?void 0:s.currency)??"")}
      ${this._renderListAmount(n,(null==r||null===(i=r.minimumPrice)||void 0===i?void 0:i.amount)??"",!0,(null==r||null===(a=r.minimumPrice)||void 0===a?void 0:a.currency)??"")}
      ${this._renderListAmount(l,pt(mt(),"DD/MM/YYYY")??"",!1,!0)}
    `}get _renderDetailOrderCostAndcommissions(){const{otherAmountsTotal:t}=this.simulateResponseData,{percentage:s,commission:i}=this._getCommissions,{iva:a}=this._getTax,r=this.t(null==We?void 0:We.totalEstimatedLabel),o=this.t(null==We?void 0:We.commissionPercentage),n=this.t(null==We?void 0:We.commissionAmount),l=this.t(null==We?void 0:We.ivaCommission);return e`
      <bbva-header-category
        variant="default"
        ambient="secondary"
        text=${this.t(null==We?void 0:We.costsAndCommissionsLabel)}
      ></bbva-header-category>
      ${this._renderListAmount(r,(null==t?void 0:t.amount)??"",!0,(null==t?void 0:t.currency)??"")}
      ${this._renderListAmount(o,`${s??""} %`??"")}
      ${this._renderListAmount(n,(null==i?void 0:i.amount)??"",!0,(null==i?void 0:i.currency)??"")}
      ${this._renderListAmount(l,(null==a?void 0:a.amount)??"",!0,(null==a?void 0:a.currency)??"")}
    `}_renderOrderDetailSummayTpl(e){return"BOOK"===e?this._renderOrderDetailSummaryBookTpl:"CONDITIONED"===e?this._renderOrderDetailConditionedTpl:n}render(){return e`
      ${this._renderOrderDetailSummayTpl(this.orderType)}
      ${this._renderDetailOrderCostAndcommissions}
    `}}var qt=i`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.panel-process-container {
  display: flex;
  flex-direction: column;
  gap: 0.5rem;
}

.panel-process-text {
  margin-bottom: 0.5rem;
}
`;class Nt extends(V(g(a(r)))){static get is(){return"trading-stocks-purchase-and-sale-panel-process"}static get scopedElements(){const e=[E,T,F];return Nt.scopedElementsFromClasses(e)}static get properties(){return{title:{type:String},label:{type:String},amount:{type:String},subLabel:{type:String,attribute:"sub-label"},microillustration:{type:String},microillustrationSize:{type:String,attribute:"microillustration-size"},titleSize:{type:String,attribute:"title-size"},currency:{type:String}}}constructor(){super(),this.microillustration="",this.microillustrationSize="",this.title="",this.label="",this.amount="",this.subLabel="",this.titleSize="",this.currency=""}static get styles(){return[qt,H.primary,S.primary,C.primary,o("trading-stocks-purchase-and-sale-panel-process")]}render(){return e` <div class="panel-process-container" ambient="primary">
      <bbva-clip-microillustration
        microillustration="${this.microillustration}"
        size=${this.microillustrationSize}
      ></bbva-clip-microillustration>
      <bbva-type-text
        id="trading-stocks-purchase-and-sale-panel-process-title"
        class="panel-process-text"
        tag="span"
        size="${this.titleSize?this.titleSize:"XL"}"
        font-weight="700"
        text=${this.title??""}
      ></bbva-type-text>
      <bbva-type-text
        id="trading-stocks-purchase-and-sale-panel-process-label"
        class="panel-process-text"
        tag="span"
        size="S"
        font-weight="350"
        text=${this.label??""}
      ></bbva-type-text>
      ${this.amount&&e`<bbva-type-amount
          id="trading-stocks-purchase-and-sale-panel-process-amount"
          type="bold"
          variant="3xl"
          language="${this.language}"
          currency-code="${this.currency}"
          local-currency="${this.currency}"
          amount="${this.amount??0}"
        ></bbva-type-amount>`}
      </bbva-type-amount>
      <bbva-type-text
        id="trading-stocks-purchase-and-sale-panel-process-sub-label"
        class="panel-process-text"
        tag="span"
        size="S"
        font-weight="350"
        text=${this.subLabel??""}
      ></bbva-type-text>
    </div>`}}customElements.define(Nt.is,Nt);const jt="cells-share-operative-receipt-btrader-limited-purchase-amount-to-receive",Vt="cells-share-operative-receipt-btrader-limited-purchase-amount-to-invest",Ht="cells-share-operative-receipt-btrader-limited-purchase-commission-percentage",Ft="cells-share-operative-receipt-btrader-limited-purchase-cost-and-commissions-title",zt="cells-share-operative-receipt-btrader-conditioned-purchase",Gt="cells-share-operative-receipt-btrader-limited-purchase-date-and-hour",Ut="cells-share-operative-receipt-btrader-limited-purchase-estimated-total",Kt="cells-share-operative-receipt-btrader-limited-purchase-final-info",Yt="cells-share-operative-receipt-btrader-limited-purchase-order-shipped",Wt="cells-share-operative-receipt-btrader-conditioned-purchase-infobox",Qt="cells-share-operative-receipt-btrader-limited-purchase-name",Xt="cells-share-operative-receipt-btrader-conditioned-purchase-stop-loss-price",Jt="cells-share-operative-receipt-btrader-conditioned-purchase-monitoring-validity",Zt="cells-share-operative-receipt-btrader-conditioned-purchase-number-of-titles",es="cells-share-operative-receipt-btrader-limited-purchase-includes-costs-and-commissions",ts="cells-share-operative-receipt-btrader-limited-purchase-includes-costs-and-commissions-subtitle",ss="cells-share-operative-receipt-btrader-conditioned-purchase-operation-folio",is="cells-share-operative-receipt-btrader-limited-purchase-order-detail",as="cells-share-operative-receipt-btrader-conditioned-purchase-order-folio",rs="cells-share-operative-receipt-btrader-limited-purchase-order-type",os="cells-share-operative-receipt-btrader-conditioned-purchase-price-per-titles",ns="cells-share-operative-receipt-btrader-limited-purchase-commisssion",ls="cells-share-operative-receipt-btrader-limited-purchase-number-of-titles",ds="cells-share-operative-receipt-btrader-conditioned-purchase-target-price",cs="cells-share-operative-receipt-btrader-limited-purchase-price-per-titles",us="cells-share-operative-receipt-btrader-limited-purchase-validity-of-the-order",ps="cells-share-operative-receipt-btrader-limited-purchase-second-final-info",hs="cells-share-operative-receipt-btrader-limited-purchase-second-infobox",ms="cells-share-operative-receipt-btrader-limited-purchase-title",gs="cells-share-operative-receipt-btrader-conditioned-purchase-validity-of-the-order",vs="cells-share-operative-receipt-btrader-limited-purchase-VAT-on-commission";var bs=i`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-header-category] {
  margin-top: 1rem;
  margin-bottom: 1rem;
}

.notification-message-container {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  margin: 1rem 0 1rem 0;
  gap: 1rem;
}

.receipt-footer {
  display: flex;
  flex-direction: column;
  gap: 1rem;
  margin-top: 1rem;
  padding-bottom: 1rem;
}
`;const{moment:ys}=window;class _s extends(_(a(f(r)))){static get is(){return"receipt-modal"}static get scopedElements(){const e=[j,I,T,F,G,E,M,U,x,R,Nt,Lt];return _s.scopedElementsFromClasses(e)}static get properties(){return{modalConfig:{type:Object},visible:{type:Boolean},createOrderResponse:{type:Object,attribute:"create-order-response"},customerEmail:{type:String,attribute:"customer-email"},isPurchase:{type:Boolean,attribute:"is-purchase"}}}constructor(){super(),this.buttonRowConfing=null==ot?void 0:ot.buttonRowOptions,this.visible=!1,this.createOrderResponse={},this.customerEmail="",this.modalConfig={}}static get styles(){return[bs,B.primary,C.primary,S.primary,H.primary,z.primary,P.primary,O.primary,o("receipt-modal-shared-styles")]}_renderListAmount(t,s,i=!1,a,r=!1){return e`
      <trading-stocks-purchase-and-sale-list-amount
        ?is-amount=${i}
        ?is-italic=${r}
        label=${t}
        language=${this.language}
        currency=${a}
        value=${s}
      ></trading-stocks-purchase-and-sale-list-amount>
    `}get _getCommissions(){var e;const{fee:t}=this.createOrderResponse??{},s=null==t?void 0:t.itemizeFees.find((e=>"COMISSIONPERCENTAGE"===e.feeType)),i=null==t?void 0:t.itemizeFees.find((e=>"COMISSION"===e.feeType)),a=null==i?void 0:i.itemizeFeeUnits.find((e=>"AMOUNT"===e.unitType));return{percentage:null==s||null===(e=s.itemizeFeeUnits.find((e=>"PERCENTAGE"===e.unitType)))||void 0===e?void 0:e.percentage,commission:a}}get _getTax(){const{tax:e}=this.createOrderResponse??{},t=null==e?void 0:e.itemizeTaxes.find((e=>"IVA"===e.taxType));return{iva:null==t?void 0:t.itemizeTaxUnits.find((e=>"AMOUNT"===e.unitType))}}get _renderModal(){var t,s,i,a,r,o,n,l,d,c,u,p,h,m,g,v;return e`
      <bbva-help-modal
        ?visible=${this.visible}
        ?full-height=${null===(t=this.modalConfig)||void 0===t?void 0:t.fullHeight}
        ?fixed-footer=${null===(s=this.modalConfig)||void 0===s?void 0:s.fixedFooter}
        header-text=${null===(i=this.modalConfig)||void 0===i?void 0:i.headerText}
        @header-main-icon-click=${()=>{this.visible=!1,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-receipt-close")}}
      >
        <div class="custom-header" slot="slot-header">
          <bbva-header-main
            variant=${null===(a=this.modalConfig)||void 0===a?void 0:a.headerType}
            text=${null===(r=this.modalConfig)||void 0===r?void 0:r.headerText}
          ></bbva-header-main>
        </div>
        <div class="content" slot="slot-content" ambient="primary">
          <trading-stocks-purchase-and-sale-panel-process
            language="${this.language}"
            currency="${(null===(o=this.createOrderResponse)||void 0===o||null===(n=o.totalPrice)||void 0===n?void 0:n.currency)??""}"
            title=${this.t(null==ot?void 0:ot.receiptPanelHeader)}
            label=${"SALE"===(null===(l=this.createOrderResponse)||void 0===l||null===(d=l.operationType)||void 0===d?void 0:d.id)?this.t(null==ot?void 0:ot.receiptPanelLabelSale):this.t(null==ot?void 0:ot.receiptPanelLabel)}
            amount=${(null===(c=this.createOrderResponse)||void 0===c||null===(u=c.totalPrice)||void 0===u?void 0:u.amount)??""}
            .subLabel=${this.t(null==ot?void 0:ot.receiptPanelSubLabel)}
            .microillustration=${null===(p=this.modalConfig)||void 0===p||null===(h=p.panel)||void 0===h?void 0:h.microillustration}
            .microillustrationSize=${null===(m=this.modalConfig)||void 0===m||null===(g=m.panel)||void 0===g?void 0:g.microillustrationSize}
          ></trading-stocks-purchase-and-sale-panel-process>
          <bbva-notification-help
            variant="warning"
            accessibility-label-icon="Success"
            text="${this.t(null==ot?void 0:ot.receiptPanelInfoMessage)}"
          ></bbva-notification-help>
          <bbva-header-category
            text=${this.t(null==ot?void 0:ot.receiptOrderDetailHeader)}
          ></bbva-header-category>
          ${this._getModalBody(null===(v=this.modalConfig)||void 0===v?void 0:v.modalBody)}
          ${this._renderDetailOrderCostAndcommissions} ${this._renderNotificationMessages}
          ${this._renderButtonsRow} ${this._renderFooterInfo}
        </div>
      </bbva-help-modal>
    `}get _renderModalBookReceipt(){var t,s,i,a,r,o,n,l,d,c,u,p;const{id:h,title:m,issuer:g,operationFolio:v,settlementDate:b,operationType:y}=this.createOrderResponse,_=this.t(null==ot||null===(t=ot.bookReceiptLabels)||void 0===t?void 0:t.dateAndHour),f=this.t(null==ot||null===(s=ot.bookReceiptLabels)||void 0===s?void 0:s.nameLabel),C=this.t(null==ot||null===(i=ot.bookReceiptLabels)||void 0===i?void 0:i.orderTypeLabel),S=this.t(null==ot||null===(a=ot.bookReceiptLabels)||void 0===a?void 0:a.numberOfTitlesLabel),k=this.t(null==ot||null===(r=ot.bookReceiptLabels)||void 0===r?void 0:r.priceLabel),P=this.t(null==ot||null===(o=ot.bookReceiptLabels)||void 0===o?void 0:o.orderDueDateLabel),T=this.t(null==ot||null===(n=ot.bookReceiptLabels)||void 0===n?void 0:n.orderFolioLabel),E=this.t(null==ot||null===(l=ot.bookReceiptLabels)||void 0===l?void 0:l.orderOperationNumberLabel);return e`
      ${this._renderListAmount(_,`${mt("DD MMMM YYYY, HH:mm")} h`,!1,!0)}
      ${this._renderListAmount(f,`${(null==g?void 0:g.businessName)??""} ${(null==g?void 0:g.name)??""} ${(null==g?void 0:g.id)??""}`)}
      ${this._renderListAmount(C,`${this._classificationId??""}`)}
      ${this._renderListAmount(S,(null==m?void 0:m.quantity)??"")}
      ${"PURCHASE"===(null==y?void 0:y.id)?this._renderListAmount(k,(null==m||null===(d=m.price)||void 0===d?void 0:d.amount)??"",!0,(null==m||null===(c=m.price)||void 0===c?void 0:c.currency)??""):this._renderListAmount(P,ht(b)||"",!1,!0)}
      ${"PURCHASE"===(null==y?void 0:y.id)?this._renderListAmount(P,ht(b),!1,!0):this._renderListAmount(k,null==m||null===(u=m.price)||void 0===u?void 0:u.amount,!0,null==m||null===(p=m.price)||void 0===p?void 0:p.currency)}
      ${this._renderListAmount(T,h??"")}
      ${this._renderListAmount(E,v??"")}
    `}get _renderModalConditionedReceipt(){var t,s,i,a,r,o,n,l,d,c,u,p,h,m,g,v,b,y,_;const{id:f,title:C,issuer:S,operationFolio:k,settlementDate:P}=this.createOrderResponse,T=this.t(null==ot||null===(t=ot.bookReceiptLabels)||void 0===t?void 0:t.dateAndHour),E=this.t(null==ot||null===(s=ot.bookReceiptLabels)||void 0===s?void 0:s.nameLabel),$=this.t(null==ot||null===(i=ot.bookReceiptLabels)||void 0===i?void 0:i.orderTypeLabel),x=this.t(null==ot||null===(a=ot.bookReceiptLabels)||void 0===a?void 0:a.numberOfTitlesLabel),D=this.t(null==ot||null===(r=ot.bookReceiptLabels)||void 0===r?void 0:r.priceLabel),O=this.t(null==ot||null===(o=ot.conditionedReceiptLabels)||void 0===o?void 0:o.objectivePrice),A=this.t(null==ot||null===(n=ot.conditionedReceiptLabels)||void 0===n?void 0:n.stopLossPrice),R=this.t(null==ot||null===(l=ot.bookReceiptLabels)||void 0===l?void 0:l.orderDueDateLabel),I=this.t(null==ot||null===(d=ot.bookReceiptLabels)||void 0===d?void 0:d.monitoredDueDateLabel),M=this.t(null==ot||null===(c=ot.bookReceiptLabels)||void 0===c?void 0:c.orderFolioLabel),L=this.t(null==ot||null===(u=ot.bookReceiptLabels)||void 0===u?void 0:u.orderOperationNumberLabel);return e`
      ${this._renderListAmount(T,`${mt("DD MMMM YYYY, HH:mm")} h`,!1,!0)}
      ${this._renderListAmount(E,`${(null==S?void 0:S.businessName)??""} ${(null==S?void 0:S.name)??""} ${(null==S?void 0:S.id)??""}`)}
      ${this._renderListAmount($,`${this._classificationId??""}`)}
      ${this._renderListAmount(M,f??"")}
      ${this._renderListAmount(L,k??"")}
      <bbva-type-text
        tag="p"
        font-weight="500"
        alignment="left"
        size="S"
        text=${this.t(null==ot||null===(p=ot.conditionedReceiptLabels)||void 0===p?void 0:p.titlePurchaseLabel)}
      ></bbva-type-text>
      ${this._renderListAmount(x,(null==C?void 0:C.quantity)??"")}
      ${this._renderListAmount(D,(null==C||null===(h=C.price)||void 0===h?void 0:h.amount)??"",!0,(null==C||null===(m=C.price)||void 0===m?void 0:m.currency)??"")}
      ${this._renderListAmount(R,ht(P),!1,!0)}
      <bbva-type-text
        tag="p"
        font-weight="500"
        alignment="left"
        size="S"
        text=${this.t(null==ot||null===(g=ot.conditionedReceiptLabels)||void 0===g?void 0:g.titleSaleLabel)}
      ></bbva-type-text>
      ${this._renderListAmount(O,(null==C||null===(v=C.objectivePrice)||void 0===v?void 0:v.amount)??"",!0,(null==C||null===(b=C.objectivePrice)||void 0===b?void 0:b.currency)??"")}
      ${this._renderListAmount(A,(null==C||null===(y=C.minimumPrice)||void 0===y?void 0:y.amount)??"",!0,(null==C||null===(_=C.minimumPrice)||void 0===_?void 0:_.currency)??"")}
      ${this._renderListAmount(I,pt(mt(),"DD/MM/YYYY"),!1,!0)}
    `}get _renderDetailOrderCostAndcommissions(){var t,s,i,a,r;const{otherAmountsTotal:o}=this.createOrderResponse,{percentage:n,commission:l}=this._getCommissions,{iva:d}=this._getTax,c=this.t(null==ot||null===(t=ot.costAndCommissionsReceipt)||void 0===t?void 0:t.totalEstimatedLabel),u=this.t(null==ot||null===(s=ot.costAndCommissionsReceipt)||void 0===s?void 0:s.commissionPercentage),p=this.t(null==ot||null===(i=ot.costAndCommissionsReceipt)||void 0===i?void 0:i.commissionAmount),h=this.t(null==ot||null===(a=ot.costAndCommissionsReceipt)||void 0===a?void 0:a.ivaCommission);return e`
      <bbva-header-category
        variant="default"
        ambient="primary"
        text=${this.t(null==ot||null===(r=ot.costAndCommissionsReceipt)||void 0===r?void 0:r.costsAndCommissionsLabel)}
      ></bbva-header-category>
      ${this._renderListAmount(c,(null==o?void 0:o.amount)??"",!0,(null==o?void 0:o.currency)??"")}
      ${this._renderListAmount(u,`${n??""} %`)}
      ${this._renderListAmount(p,(null==l?void 0:l.amount)??"",!0,(null==l?void 0:l.currency)??"",!1)}
      ${this._renderListAmount(h,(null==d?void 0:d.amount)??"",!0,(null==d?void 0:d.currency)??"",!1)}
    `}get _classificationId(){var e,t;return{BOOK:this.t(null==ot?void 0:ot.limited),CONDITIONED:this.t(null==ot?void 0:ot.conditioned)}[null===(e=this.createOrderResponse)||void 0===e||null===(t=e.classification)||void 0===t?void 0:t.id]||""}get _renderNotificationMessages(){var t,s,i;return e`
      <div class="notification-message-container" ambient="primary">
        <bbva-notification-message variant="default">
          ${this.t(null==ot||null===(t=ot.receiptNotificationMessages)||void 0===t?void 0:t.orderMessage)}
        </bbva-notification-message>
        <bbva-notification-message variant="default">
          ${this.t(null==ot||null===(s=ot.receiptNotificationMessages)||void 0===s?void 0:s.emailMessage)}
          <bbva-type-text
            tag="p"
            size="S"
            font-weight="500"
            alignment="left"
            text=${null===(i=this.customerEmail.toLowerCase())||void 0===i?void 0:i.replace(/\*+/g,"•")}
          ></bbva-type-text>
        </bbva-notification-message>
      </div>
    `}get _renderButtonsRow(){return e` <bbva-button-row
      ambient="primary-alt"
      .options=${null==ot?void 0:ot.buttonRowOptions}
      @button-row-item-click=${e=>this._onRowButtonClicked(e.detail)}
    ></bbva-button-row>`}get _renderFooterInfo(){var t,s;return e`
      <div ambient="primary" class="receipt-footer">
        <bbva-type-text
          size="2XS"
          font-weight="350"
          tag="span"
          text=${this.t(null==ot||null===(t=ot.footerMessages)||void 0===t?void 0:t.footerMessage)}
        ></bbva-type-text>
        <bbva-type-text
          size="2XS"
          font-weight="350"
          tag="span"
          text=${this.t(null==ot||null===(s=ot.footerMessages)||void 0===s?void 0:s.footerMessage2)}
        ></bbva-type-text>
      </div>
    `}_onRowButtonClicked(e){if(0===e){const e=this.isPurchase?"bTraderPurchaseReceipt":"bTraderSalesReceipt";this._buildInfoReceipt(),this._dispatchCustomEvent("trading-stocks-purchase-and-sale-receipt-share",{operative:e})}1===e&&(this.visible=!1,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-order-list-navigate"),this._dispatchCustomEvent("trading-stocks-purchase-and-sale-receipt-close"))}_buildInfoReceipt(){var e,t,s,i,a,r;let o;const n=ys(mt("DD MMMM YYYY, HH:mm"),"DD MMMM YYYY, HH:mm h").toISOString(),{totalPrice:l,issuer:d,id:c,operationFolio:u,title:p,fee:h,otherAmountsTotal:m,tax:g,targetPrice:v,stopLossPrice:b,settlementDate:y}=this.createOrderResponse,_=pt(mt(),"DD/MM/YYYY"),{amount:f,currency:C}=l||{},{businessName:S,name:k,id:P}=d||{},{quantity:T,price:E}=p||{},{amount:$,currency:x}=E||{},{itemizeFees:D}=h||{},{amount:O,currency:A}=(null==D||null===(e=D[0])||void 0===e||null===(t=e.itemizeFeeUnits)||void 0===t?void 0:t[0])||{},{percentage:R}=(null==D||null===(s=D[1])||void 0===s||null===(i=s.itemizeFeeUnits)||void 0===i?void 0:i[0])||{},{amount:I,currency:M}=m||{},{itemizeTaxes:L}=g||{},{amount:w,currency:B}=(null==L||null===(a=L[0])||void 0===a||null===(r=a.itemizeTaxUnits)||void 0===r?void 0:r[0])||{},q={policies:this.t("cells-share-operative-receipt-btrader-limited-purchase-success-policy"),exit:this.t("cells-share-operative-receipt-btrader-limited-purchase-exit"),seeOrders:this.t("cells-share-operative-receipt-btrader-limited-purchase-see-orders"),totalAmount:f,totalCurrency:C,operationDate:n,issuer:`${S} ${k} ${P}`,book:`${this._classificationId}`,orderFolio:c,operationFolio:u,numberTitles:T,priceTitles:$,currency:x,settlementDate:y,totalFee:O,currencyFee:A,percentageFee:R,commissionTotal:I,commissionCurrency:M,iva:w,ivaCurrency:B,email:this.customerEmail,targetPrice:v,stopLossPrice:b,monitoringValidity:_};o=q.book===this.t(ot.conditioned)?(({policies:e,exit:t,seeOrders:s,totalAmount:i,totalCurrency:a,operationDate:r,issuer:o,book:n,orderFolio:l,operationFolio:d,numberTitles:c,priceTitles:u,currency:p,settlementDate:h,totalFee:m,currencyFee:g,percentageFee:v,commissionTotal:b,commissionCurrency:y,iva:_,ivaCurrency:f,targetPrice:C,stopLossPrice:S,monitoringValidity:k,email:P})=>({templateSelected:"bTraderReceipt",title:ms,destination:{avatar:{src:"./images/official-document.svg"}},btraderHeaderInfo:[{key:" ",value:Yt,class:"spacing light-key"},{key:Vt,amount:{amount:i,currency:a},class:"spacing light-key bold-value"},{key:" ",value:es,class:"spacing light-key"},{key:" ",value:ts,class:"spacing light-key"},{key:" ",value:is,class:"spacing light-key"},{key:Gt,value:r,class:"spacing light-key bold-value"},{key:Qt,value:o,class:"spacing light-key bold-value"},{key:rs,value:n,class:"spacing light-key bold-value"},{key:as,value:l,class:"spacing light-key bold-value"},{key:ss,value:d,class:"spacing light-key bold-value"},{key:" ",value:zt,class:"spacing light-key"},{key:Zt,value:c,class:"spacing light-key bold-value"},{key:os,amount:{amount:u,currency:p},class:"spacing light-key bold-value"},{key:gs,value:k,class:"spacing light-key bold-value"},{key:" ",value:Ft,class:"spacing light-key"},{key:Ut,amount:{amount:m,currency:g},class:"spacing light-key bold-value"},{key:Ht,value:v,class:"spacing light-key bold-value"},{key:ns,amount:{amount:b,currency:y},class:"spacing light-key bold-value"},{key:vs,amount:{amount:_,currency:f},class:"spacing light-key bold-value"},{key:" ",value:Kt,class:"spacing light-key"},{key:" ",value:ps,class:"spacing light-key"},{key:" ",value:"cells-share-operative-receipt-btrader-conditioned-purchase-sale",class:"spacing light-key"},{key:ds,amount:{amount:C,currency:p},class:"spacing light-key bold-value"},{key:Xt,amount:{amount:S,currency:p},class:"spacing light-key bold-value"},{key:Jt,value:h,class:"spacing light-key bold-value"},{key:ls,value:c,class:"spacing light-key bold-value"},{key:cs,amount:{amount:u,currency:p},class:"spacing light-key bold-value"},{key:us,value:h,class:"spacing light-key bold-value"},{key:"cells-share-operative-receipt-btrader-limited-purchase-order-folio",value:l,class:"spacing light-key bold-value"},{key:"cells-share-operative-receipt-btrader-limited-purchase-operation-folio",value:d,class:"spacing light-key bold-value"}],message:[{text:Wt}],mailMessage:[{key:hs,value:P}],operations:[{label:e,id:"download",icon:"coronita:pdf"}],buttons:[{class:"noshadow",primary:{text:t,action:"go-to-next",class:"btn--primary btn--l"},secondary:{hidden:!0}},{class:"noshadow",primary:{text:s,action:"go-to-next",class:"btn--primary btn--l"},secondary:{hidden:!0}}]}))(q):this.isPurchase?(({policies:e,exit:t,seeOrders:s,totalAmount:i,totalCurrency:a,operationDate:r,issuer:o,book:n,orderFolio:l,operationFolio:d,numberTitles:c,priceTitles:u,currency:p,settlementDate:h,totalFee:m,currencyFee:g,percentageFee:v,commissionTotal:b,commissionCurrency:y,iva:_,ivaCurrency:f,email:C})=>({templateSelected:"bTraderPurchaseReceipt",title:ms,destination:{avatar:{src:"./images/official-document.svg"}},purchaseHeaderInfo:[{key:" ",value:Yt,class:"spacing light-key"},{key:Vt,amount:{amount:i,currency:a},class:"spacing light-key bold-value"},{key:" ",value:es,class:"spacing light-key"},{key:" ",value:ts,class:"spacing light-key"},{key:" ",value:is,class:"spacing light-key"},{key:Gt,value:r,class:"spacing light-key bold-value"},{key:Qt,value:o,class:"spacing light-key bold-value"},{key:rs,value:n,class:"spacing light-key bold-value"},{key:as,value:l,class:"spacing light-key bold-value"},{key:ss,value:d,class:"spacing light-key bold-value"},{key:" ",value:zt,class:"spacing light-key"},{key:Zt,value:c,class:"spacing light-key bold-value"},{key:os,amount:{amount:u,currency:p},class:"spacing light-key bold-value"},{key:gs,value:h,class:"spacing light-key bold-value"},{key:" ",value:Ft,class:"spacing light-key"},{key:Ut,amount:{amount:m,currency:g},class:"spacing light-key bold-value"},{key:Ht,value:v,class:"spacing light-key bold-value"},{key:ns,amount:{amount:b,currency:y},class:"spacing light-key bold-value"},{key:vs,amount:{amount:_,currency:f},class:"spacing light-key bold-value"},{key:" ",value:Kt,class:"spacing light-key"},{key:" ",value:ps,class:"spacing light-key"}],message:[{text:Wt}],mailMessage:[{key:hs,value:C}],operations:[{label:e,id:"download",icon:"coronita:pdf"}],buttons:[{class:"noshadow",primary:{text:t,action:"go-to-next",class:"btn--primary btn--l"},secondary:{hidden:!0}},{class:"noshadow",primary:{text:s,action:"go-to-next",class:"btn--primary btn--l"},secondary:{hidden:!0}}]}))(q):(({policies:e,exit:t,seeOrders:s,totalAmount:i,totalCurrency:a,operationDate:r,issuer:o,book:n,orderFolio:l,operationFolio:d,numberTitles:c,priceTitles:u,currency:p,settlementDate:h,targetPrice:m,stopLossPrice:g,email:v})=>({templateSelected:"bTraderSalesReceipt",title:"cells-share-operative-receipt-btrader-sale-title",destination:{avatar:{src:"./images/official-document.svg"}},saleHeaderInfo:[{key:" ",value:Yt,class:"spacing light-key"},{key:jt,amount:{amount:i,currency:a},class:"spacing light-key bold-value"},{key:" ",value:es,class:"spacing light-key"},{key:" ",value:ts,class:"spacing light-key"},{key:" ",value:is,class:"spacing light-key"},{key:Gt,value:r,class:"spacing light-key bold-value"},{key:Qt,value:o,class:"spacing light-key bold-value"},{key:rs,value:n,class:"spacing light-key bold-value"},{key:" ",value:"cells-share-operative-receipt-btrader-conditioned-sale",class:"spacing light-key"},{key:ds,amount:{amount:m,currency:p},class:"spacing light-key bold-value"},{key:Xt,amount:{amount:g,currency:p},class:"spacing light-key bold-value"},{key:Jt,value:h,class:"spacing light-key bold-value"},{key:ls,value:c,class:"spacing light-key bold-value"},{key:cs,amount:{amount:u,currency:p},class:"spacing light-key bold-value"},{key:us,value:h,class:"spacing light-key bold-value"},{key:as,value:l,class:"spacing light-key bold-value"},{key:ss,value:d,class:"spacing light-key bold-value"},{key:" ",value:Kt,class:"spacing light-key"},{key:" ",value:ps,class:"spacing light-key"}],message:[{text:Wt}],mailMessage:[{key:hs,value:v}],operations:[{label:e,id:"download",icon:"coronita:pdf"}],buttons:[{class:"noshadow",primary:{text:t,action:"go-to-next",class:"btn--primary btn--l"},secondary:{hidden:!0}},{class:"noshadow",primary:{text:s,action:"go-to-next",class:"btn--primary btn--l"},secondary:{hidden:!0}}]}))(q),this._dispatchCustomEvent("trading-stocks-purchase-and-sale-receipt-info-capture",o)}_getModalBody(t){return"BOOK"===t?e`${this._renderModalBookReceipt}`:"CONDITIONED"===t?e`${this._renderModalConditionedReceipt}`:n}render(){return e`${this._renderModal}`}}customElements.define(_s.is,_s);var fs=i`
:host {
  box-sizing: border-box;
  position: relative;
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

[data-tag-name=bbva-type-icon] {
  flex: none;
  margin-left: 0.5rem;
}

[data-tag-name=bbva-type-text] {
  flex: none;
}

.panel-container {
  display: flex;
  justify-content: space-between;
  flex-direction: column;
}

.panel-container_icon-label {
  display: flex;
  align-items: center;
  flex-direction: row;
  padding-bottom: 1rem;
}
`;class Cs extends(V(g(a(r)))){static get is(){return"trading-stocks-purchase-and-sale-panel-button"}static get scopedElements(){const e=[E,T,L,I,A,j,$t];return Cs.scopedElementsFromClasses(e)}static get properties(){return{label:{type:String},value:{type:String},labelWithIcon:{type:String,attribute:"label-with-icon"},buttonConfirmLabel:{type:Boolean,attribute:"button-confirm-label"},currency:{type:String},disabled:{type:Boolean},_infoModalConfig:{type:Object},_infoModalVisible:{type:Boolean}}}constructor(){super(),this.label="",this.value="",this.labelWithIcon="",this.buttonConfirmLabel=!1,this.disabled=!1,this.currency="",this._infoModalConfig={},this._infoModalVisible=!1}static get styles(){return[fs,q.primary,B.primary,D.primary,S.primary,C.primaryAlt,o("trading-stocks-purchase-and-sale-panel-button")]}_dispatchCustomEvent(e,t=!0,s=!0,i=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:s,composed:i,detail:t,cancelable:!0}))}get _panelBtnTpl(){var t,s,i;const a=this.buttonConfirmLabel?this.t(null==Ge||null===(t=Ge.tradingSummary)||void 0===t?void 0:t.panelButtonConfirmLabel):this.t(null==Ge||null===(s=Ge.tradingSummary)||void 0===s?void 0:s.panelButtonBtnLabel);return e`<div class="panel-container" ambient="primary">
      <bbva-type-text tag="span" size="S" text=${this.label}></bbva-type-text>
      <bbva-type-amount
        variant="3xl"
        type="bold"
        language="${this.language}"
        currency-code="${this.currency}"
        local-currency="${this.currency}"
        amount=${this.value??0}
      >
      </bbva-type-amount>
      <div class="panel-container_icon-label">
        <bbva-type-text tag="span" size="S" text=${this.labelWithIcon}></bbva-type-text>
        <bbva-type-link
          aria-label="${this.t(null==Ge||null===(i=Ge.tradingSummary)||void 0===i?void 0:i.panelButtonIconLabel)}"
          @click="${()=>this._dispatchCustomEvent("trading-stocks-purchase-and-sale-panel-icon-click","trading-stocks-purchase-and-sale-order-detail-cost-and-commission-info-show")}"
        >
          <bbva-type-icon icon="${u()}" size="16" icon-color="#1464A5"></bbva-type-icon>
        </bbva-type-link>
      </div>
      <bbva-button-default
        ?disabled="${!this.disabled}"
        variant="positive"
        aria-label="${a}"
        text="${a}"
        @click="${()=>this._dispatchCustomEvent("trading-stocks-purchase-and-sale-panel-button-click")}"
      ></bbva-button-default>
    </div>`}render(){return e`${this._panelBtnTpl}`}}customElements.define(Cs.is,Cs);var Ss=i`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
  --bbva-help-modal-padding-bottom: 0;
  overflow: unset;
}

.confirm-step {
  background-color: var(--_trading-stocks-purchase-and-sale-bg-color);
  width: 100vw;
  padding-right: 1rem;
}

.select-order-type-summary-container {
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-between;
  padding-left: 1rem;
  padding-right: 1rem;
}

[data-tag-name=bbva-expandable-step] {
  --bbva-expandable-step-default-content-max-height: auto;
  padding-bottom: 0;
}

.confirmation-area {
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: center;
  padding-top: 1.5rem;
  padding-bottom: 1.5rem;
  padding-left: 1rem;
  padding-right: 1rem;
  background-color: var(--colorsPrimaryCoreLightened, ${l(d.primaryCoreLightened)});
}

[data-tag-name=bbva-expandable-step] [data-tag-name=issuer-and-account-step] {
  --issuer-and-account-step-list-text: var(--_trading-stocks-purchase-and-sale-multistep-item-completed-color) ;
}
`;class ks extends(_(f(a(r)))){static get is(){return"trading-multi-step"}static get scopedElements(){const e=[T,G,Y,W,E,I,L,Ct,kt,Tt,j,Bt,Cs,_s,$t,...ks.configurationScopedElements()];return ks.scopedElementsFromClasses(e)}static get properties(){return{country:{type:String},token:{type:String},issuingEntity:{type:Object,attribute:"issuing-entity"},headerVariant:{type:Object,attribute:"header-variant"},orderTypeList:{type:Array,attribute:"order-type-list"},privateBankingPortfolioId:{type:String,attribute:"private-banking-portfolio-id"},issuerDataResponse:{type:Object,attribute:"issuer-data-response"},calculateSharesData:{type:Object,attribute:"calculate-shares-data"},simulateResponseData:{type:Object,attribute:"simulate-response-data"},createOrderResponse:{type:Object,attribute:"create-order-response"},appSettingResponse:{type:Object,attribute:"app-setting-response"},steps:{type:Object},visibleModal:{type:Boolean,attribute:"visible-modal"},simulationErrorResponse:{type:String,attribute:"simulation-error-response"},orderDetailBtn:{type:Boolean,attribute:"order-detail-btn"},errorKey:{type:String,attribute:"error-key"},selectedDate:{type:String,attribute:"selected-date"},operationType:{type:String,attribute:"operation-type"},contractNumber:{type:String,attribute:"contract-number"},specificAmountsId:{type:Object,attribute:"specific-amounts-id"},fixNativeCalendar:{type:Boolean,attribute:"fix-native-calendar"},_orderComplete:{type:Boolean},_infoModalVisible:{type:Boolean},_receiptModalConfig:{type:Object},_exitModal:{type:Boolean},gmtTime:{type:Number,attribute:"gmt-time"}}}static get styles(){return[Ss,C.primary,S.primary,B.primary,q.primary,o("trading-stocks-purchase-and-sale-shared-styles")]}constructor(){super(),this.config={loader:!0},this.visibleModal=!1,this.headerVariant=null==Ge?void 0:Ge.headerVariant,this.aliasContract="",this.contractNumber="",this.availableBalance={},this.privateBankingPortfolioId="",this.customerEmail="",this.selectedDate=mt(),this.operationType="",this.orderTypeList=[],this.issuingEntity={},this.steps=null==Ge?void 0:Ge.steps,this.step=1,this.maxStep=2,this.isPurchase=!1,this.orderDetailBtn=!1,this.fixNativeCalendar=!1,this._orderComplete=!1,this._infoModalVisible=!1,this._exitModal=!1,this._infoModalConfig={},this._modalConfig={},this._receiptModalConfig={},this.issuerDataResponse={},this.calculateSharesData={},this.simulateResponseData={},this.createOrderResponse={},this.appSettingResponse={},this.errorKey="",this.simulationErrorResponse="",this.specificAmountsId={},this.tradingErrors={SIMULATION_ERROR:e=>{this._handleSimulationError(e)}},this.gmtTime=0}updated(e){var t,s;(super.updated(e),e.has("createOrderResponse")&&Object.keys(this.createOrderResponse).length>0&&this._renderReceipt(),e.has("issuingEntity"))&&(Object.keys(this.issuingEntity).length>0&&(this.issuerName=null===(t=this.issuingEntity)||void 0===t?void 0:t.name,this.issuerDescription=null===(s=this.issuingEntity)||void 0===s?void 0:s.description));e.has("errorKey")&&this.errorKey.length>0&&this._manageErrorModals(this.errorKey),e.has("visibleModal")&&this.visibleModal&&this.reset()}updateDataCalendar(e){this.shadowRoot.querySelector("#order-detail")._getInputDateValidity(e)}get _renderHeader(){return e`
      <bbva-header-main
        id="header-main"
        variant=${this.headerVariant.secondary}
        text=${this.isPurchase?null==Ge?void 0:Ge.purchaseHeader:null==Ge?void 0:Ge.saleHeader}
        .closeIconAriaLabel=${null==Ge?void 0:Ge.headerVariant.closeIcon}
      ></bbva-header-main>
    `}_onSpecificStepScroll({detail:e}){this.shadowRoot.querySelector("#header-main").variant=this.headerVariant[e.completed?"secondary":"initial"]}get _renderIssuerAndAccountStep(){return e`<bbva-expandable-step
      prefilled
      header=${this.t(null==Ge?void 0:Ge.purchaseAndSaleHeader)}
    >
      <div class="summary" slot="summary">
        <issuer-and-account-step
          language="${this.language}"
          .isPurchase=${this.isPurchase}
          .specificAmountsId=${this.specificAmountsId}
          .issuerDataResponse=${this.issuerDataResponse}
          .aliasContract=${this.aliasContract}
          .contractNumber=${this.contractNumber}
          .availableBalance=${this.availableBalance}
          .gmtTime=${this.gmtTime}
        ></issuer-and-account-step>
      </div>
    </bbva-expandable-step>`}get _renderSelectOrderTypeStep(){var t,s,i,a,r,o,n,l,d,c;return e`
      <bbva-expandable-step
        show-link
        ambient="primary"
        hide-padding-left
        hide-padding-right
        current-step-label=${this.t(null==Ge?void 0:Ge.currentStepLabel,{step:this.step,maxStep:this.maxStep})}
        edit-label=${this.t(null==Ge||null===(t=Ge.steps)||void 0===t||null===(s=t.orderType)||void 0===s?void 0:s.editLabel)}
        ?completed=${null===(i=this.steps)||void 0===i||null===(a=i.orderType)||void 0===a?void 0:a.completed}
        @expandable-step-edit-step="${e=>this._onEditStep("orderType",e)}"
        header=${this.isPurchase?this.t(null==Ge||null===(r=Ge.steps)||void 0===r||null===(o=r.orderType)||void 0===o?void 0:o.stepHeaderPurchase):this.t(null==Ge||null===(n=Ge.steps)||void 0===n||null===(l=n.orderType)||void 0===l?void 0:l.stepHeaderSale)}
      >
        <div class="content">
          <select-order-type
            id="select-order-type"
            .isPurchase=${this.isPurchase}
            .orderTypeList=${this.orderTypeList}
            @trading-stocks-purchase-and-sale-expandible-step-continue=${this._manageStepCompleted}
          ></select-order-type>
        </div>
        <div class="summary" slot="summary">
          <div class="select-order-type-summary-container">
            <bbva-type-text
              size="S"
              text-color="white"
              font-weight="350"
              alignment="left"
              tag="span"
              text=${this.t(null==Ge||null===(d=Ge.steps)||void 0===d||null===(c=d.orderType)||void 0===c?void 0:c.summaryOrderTypeLabel)}
            ></bbva-type-text>
            <bbva-type-text
              size="S"
              text-color="white"
              font-weight="500"
              alignment="left"
              tag="span"
              text=${this.orderLabel}
            ></bbva-type-text>
          </div>
        </div>
      </bbva-expandable-step>
    `}get _renderOrderDetailStep(){var t,s,i,a,r,o;return e`
      <bbva-expandable-step
        show-link
        current-step-label=${this.t(null==Ge?void 0:Ge.currentStepLabel,{step:this.step,maxStep:this.maxStep})}
        edit-label=${this.t(null==Ge||null===(t=Ge.steps)||void 0===t||null===(s=t.orderDetail)||void 0===s?void 0:s.editLabel)}
        ?completed=${null===(i=this.steps)||void 0===i||null===(a=i.orderDetail)||void 0===a?void 0:a.completed}
        @expandable-step-edit-step="${()=>this._onEditStep("orderDetail")}"
        header=${this.t(null==Ge||null===(r=Ge.steps)||void 0===r||null===(o=r.orderDetail)||void 0===o?void 0:o.stepHeader)}
      >
        <div class="content">
          <order-detail
            id="order-detail"
            ?native="${this.native}"
            language="${this.language}"
            .isPurchase=${this.isPurchase}
            .operationType=${this.operationType}
            .orderType=${this.orderValue}
            .specificAmountsId=${this.specificAmountsId}
            .issuerDataResponse=${this.issuerDataResponse}
            .simulateResponseData=${this.simulateResponseData}
            .calculateSharesResponse=${this.calculateSharesData}
            .privateBankingPortfolioId=${this.privateBankingPortfolioId}
            .issuerName=${this.issuerName}
            .issuerDescription=${this.issuerDescription}
            .disabledBtn=${this.orderDetailBtn}
            .selectedDate=${this.selectedDate}
            .fixNativeCalendar=${this.fixNativeCalendar}
            .gmtTime=${this.gmtTime}
            @trading-stocks-purchase-and-sale-expandible-step-continue=${this._manageStepCompleted}
            @trading-stocks-purchase-and-sale-order-detail-comission-info-show=${e=>this._shortInfoModalConfig(e.type)}
            @trading-stocks-purchase-and-sale-order-detail-iva-info-show=${e=>this._shortInfoModalConfig(e.type)}
            @trading-stocks-purchase-and-sale-order-detail-cost-and-commission-info-show=${e=>this._shortInfoModalConfig(e.type)}
            @trading-stocks-purchase-and-sale-sale-dm-get-order-simulation-body-book-respond=${e=>{this.orderDetailSummaryData=null==e?void 0:e.detail,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-get-order-simulation-body-book-respond",this.orderDetailSummaryData)}}
            @trading-stocks-purchase-and-sale-sale-dm-get-order-simulation-body-conditioned-respond=${e=>{this.orderDetailSummaryData=null==e?void 0:e.detail,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-get-order-simulation-body-conditioned-respond",this.orderDetailSummaryData)}}
            @trading-stocks-purchase-and-sale-form-fill=${()=>{this._exitModal=!0}}
          ></order-detail>
        </div>
        <div class="summary" slot="summary">
          <order-detail-summary
            language="${this.language}"
            .orderType=${this.orderValue}
            .simulateResponseData=${this.simulateResponseData}
            .orderDetailData=${this.orderDetailSummaryData}
          ></order-detail-summary>
        </div>
      </bbva-expandable-step>
    `}_renderReceipt(){const e={headerReceiptText:`${this.isPurchase?this.t("trading-stocks-purchase-and-sale-header"):this.t("trading-stocks-purchase-and-sale-sale-header")}`,panel:{microillustration:"pending",microillustrationSize:"M"},modalBody:`${this.orderValue}`};this._receiptModalConfig=Ot(e),this._orderComplete=!0}get _renderReceiptModal(){return e`
      <receipt-modal
        language="${this.language}"
        .createOrderResponse=${this.createOrderResponse}
        .orderDetailData=${this.orderDetailSummaryData}
        .modalConfig=${this._receiptModalConfig}
        .customerEmail=${this.customerEmail}
        .isPurchase=${this.isPurchase}
        ?visible=${this._orderComplete}
        @trading-stocks-purchase-and-sale-receipt-close=${()=>{this._orderComplete=!1,this.reset()}}
      >
      </receipt-modal>
    `}_manageErrorModals(e){this.tradingErrors[e]&&this.tradingErrors[e](e)}_handleSimulationError(){const e=this.simulationErrorResponse,t=Qe[e];t&&this._shortInfoModalConfig(t),this.orderDetailBtn=!1}_shortInfoModalConfig(e){const t={"trading-stocks-purchase-and-sale-order-detail-comission-info-show":{id:e,fullHeight:!1,fixedFooter:!1,description:"comissionInfo",titleInfoText:this.t(null==rt?void 0:rt.modalTitle)},"trading-stocks-purchase-and-sale-order-detail-iva-info-show":{id:e,fullHeight:!1,fixedFooter:!1,description:"ivaInfo",titleInfoText:this.t(null==rt?void 0:rt.ivaModalTitle)},"trading-stocks-purchase-and-sale-order-detail-cost-and-commission-info-show":{id:e,fullHeight:!1,fixedFooter:!1,description:"costAndCommissionInfo",titleInfoText:this.t(null==rt?void 0:rt.costAndComissionModalText)},"trading-stocks-purchase-and-sale-exit-operative-modal":{...at,id:e},OUT_OF_SCHEDULE:{...Je},MINIMUM_AMOUNT_TO_INVEST:{...Ze},OUT_OF_RANGE:{...et},INSUFFICIENT_BALANCE:{...tt},NO_SERVICE_AVAILABLE:{...st},CONTRACT_WITHOUT_ISSUER:{...it}};this._modalConfig=t[e]||{},this._infoModalConfig=Dt(this._modalConfig),this._infoModalVisible=!0}get _renderShortInfoModal(){return e`
      <short-info-modals
        ?visible=${this._infoModalVisible}
        .modalConfig=${this._infoModalConfig}
        .appSettingResponse=${this.appSettingResponse}
        @trading-stocks-purchase-and-sale-short-info-modal-button-click=${e=>this._handleExitOperativeConfirmation(e)}
        @trading-stocks-purchase-and-sale-short-info-modal-close=${()=>{this.errorKey="",this._infoModalVisible=!1}}
      >
      </short-info-modals>
    `}reset(){const e=this.shadowRoot.querySelector("#expandable-multistep"),t=this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-multistep"]'),s=this.shadowRoot.querySelector("#order-detail"),i=this.shadowRoot.querySelector("#select-order-type");e.stepsToReset=Object.values({orderType:1,orderDetail:2}),Object.values(this.steps).forEach((e=>{e.completed=!1})),e.updateComplete.then((()=>{e.firstUpdated()})),t.forEach((e=>{e.removeAttribute("edition-enabled")})),this.simulateResponseData={},this.step=1,this.maxStep=2,this._exitModal=!1,this.selectedDate=mt(),s.resetStep(),i.resetStep()}_manageStepCompleted(e){const t=e.detail.step.id,s={orderType:()=>{this.orderLabel=e.detail.orderSelected.label,this.orderValue=e.detail.orderSelected.value,this.steps[`${t}`].completed=!0,this.steps={...this.steps},this.step=2},orderDetail:()=>{var e,s,i,a,r,o,n,l,d,c;this.steps[`${t}`].completed=!0,this.steps={...this.steps},this.step=3,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-order-data-simulate",{purchase:this.isPurchase,orderAmount:null===(e=this.simulateResponseData)||void 0===e||null===(s=e.totalPrice)||void 0===s?void 0:s.amount,currency:null===(i=this.simulateResponseData)||void 0===i||null===(a=i.totalPrice)||void 0===a?void 0:a.currency,titleQuantity:null===(r=this.simulateResponseData)||void 0===r||null===(o=r.title)||void 0===o?void 0:o.quantity,commission:null===(n=this.simulateResponseData)||void 0===n||null===(l=n.fee)||void 0===l||null===(d=l.itemizeFees[0])||void 0===d||null===(c=d.itemizeFeeUnits[0])||void 0===c?void 0:c.amount})}};s[t]&&s[t]()}get _steps(){return this.shadowRoot.querySelectorAll("[data-tag-name=bbva-expandable-step]:not([prefilled])")}async _onEditStep(e){const t=this.shadowRoot.querySelector("#expandable-multistep");if(await this.updateComplete,"orderType"===e){this.orderLabel="",this.orderValue="",this.step=1,this.simulateResponseData={},this._exitModal=!1,this.steps.orderDetail.completed=!1,this._steps.forEach(((e,t)=>{this._steps[t].active=0===(null==e?void 0:e.step),this._steps[t].completed=!1}));this.shadowRoot.querySelector("#order-detail").resetStep(),t.removeAttribute("edition-enabled")}"orderDetail"===e&&(this.simulateResponseData={},this.requestUpdate("simulateResponseData"),this.step=2),this.steps[e].completed=!1,this.steps={...this.steps},this._dispatchCustomEvent("trading-stocks-purchase-and-sale-edit-step-request",e)}_handleExitOperative(){this._shortInfoModalConfig("trading-stocks-purchase-and-sale-exit-operative-modal")}_handleExitOperativeConfirmation({detail:e}){"trading-stocks-purchase-and-sale-exit-operative-modal"===e&&(this._dispatchCustomEvent("trading-stocks-purchase-and-sale-navigation-purchase-and-sale-go-back"),this.reset())}get _renderMultiStep(){var t,s,i,a,r,o,n;const l=this.isPurchase?null==Ge||null===(s=Ge.tradingSummary)||void 0===s?void 0:s.panelButtonLabel:null==Ge||null===(t=Ge.tradingSummary)||void 0===t?void 0:t.panelButtonLabelSale;return e`
      <bbva-expandable-multistep
        id="expandable-multistep"
        scrolling-delay=600
        scroll-animation=900
        startAnimationStep=400
        @expandable-multistep-specific-step-scroll=${e=>this._onSpecificStepScroll(e)}
      >
        <div slot="content">
          ${this._renderIssuerAndAccountStep} ${this._renderSelectOrderTypeStep}
          ${this._renderOrderDetailStep}
        </div>
        <div class="confirmation-area" slot="confirmation" ambient="primary-alt">
          <trading-stocks-purchase-and-sale-panel-button
            button-confirm-label
            ?disabled=${this.orderDetailBtn}
            label=${this.t(l)}
            value=${(null===(i=this.simulateResponseData)||void 0===i||null===(a=i.totalPrice)||void 0===a?void 0:a.amount)??""}
            label-with-icon=${this.t(null==Ge||null===(r=Ge.tradingSummary)||void 0===r?void 0:r.panelButtonLabelWithIcon)}
            language=${this.language}
            currency=${(null===(o=this.simulateResponseData)||void 0===o||null===(n=o.totalPrice)||void 0===n?void 0:n.currency)??""}
            @trading-stocks-purchase-and-sale-panel-icon-click=${e=>{this._shortInfoModalConfig(e.detail)}}
            @trading-stocks-purchase-and-sale-panel-button-click=${()=>this._dispatchCustomEvent("trading-stocks-purchase-and-sale-create-order-respond",this.orderDetailSummaryData)}
          ></trading-stocks-purchase-and-sale-panel-button>
        </div>
      </bbva-expandable-multistep>
    `}get _renderModalTpl(){return e`
      <bbva-help-modal
        full-height
        fixed-footer
        hide-content-padding-top
        ?visible=${this.visibleModal}
        @header-main-close-icon-click=${()=>{this.step>=2&&this._exitModal?this._handleExitOperative():(this.reset(),this._dispatchCustomEvent("trading-stocks-purchase-and-sale-navigation-purchase-and-sale-go-back"))}}
      >
        <div class="custom-header" slot="slot-title">${this._renderHeader}</div>
        <div slot="slot-content">${this._renderMultiStep}</div>
      </bbva-help-modal>
    `}render(){return e`${super.render()} ${this._renderModalTpl} ${this._renderReceiptModal}
    ${this._renderShortInfoModal}`}}customElements.define(ks.is,ks);var Ps=i`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Ts extends(_(a(f(r)))){static get is(){return"cancel-modal"}static get scopedElements(){const e=[j,T,Lt];return Ts.scopedElementsFromClasses(e)}static get properties(){return{modalConfig:{type:Object,attribute:"modal-config"},visible:{type:Boolean},orderDetailData:{type:Object,attribute:"order-detail-data"},_cancelConfirm:{type:Boolean}}}constructor(){super(),this.config={loader:!0},this.visible=!1,this.modalConfig={},this.orderDetailData={},this._cancelConfirm=!1}static get styles(){return[Ps,C.primary,o("cancel-modal-shared-styles")]}_resetModal(){this.visible=!1,this._cancelConfirm=!1}get _renderModal(){var t,s,i,a,r,o,n,l,d,c;return e`
      <bbva-help-modal
        modal-type=${null===(t=this.modalConfig)||void 0===t?void 0:t.modalType}
        ?visible=${this.visible}
        ?full-height=${null===(s=this.modalConfig)||void 0===s?void 0:s.fullHeight}
        header-text=${(null===(i=this.modalConfig)||void 0===i?void 0:i.headerText)??""}
        button-text=${(null===(a=this.modalConfig)||void 0===a?void 0:a.buttonText)??""}
        .titleIcon=${null===(r=this.modalConfig)||void 0===r?void 0:r.titleIcon}
        title-text=${"PURCHASE"===(null===(o=this.orderDetailData)||void 0===o||null===(n=o.operationType)||void 0===n?void 0:n.id)?this.t(null===(l=this.modalConfig)||void 0===l?void 0:l.purchaseTitleText):this.t(null===(d=this.modalConfig)||void 0===d?void 0:d.titleText)}
        link-text=${this.t(null===(c=this.modalConfig)||void 0===c?void 0:c.linkText)??""}
        @help-modal-close=${e=>{this._cancelConfirm?this._resetModal():(e.stopPropagation(),this._dispatchCustomEvent("trading-stocks-purchase-and-sale-cancel-order-modal-close-no-confirm"))}}
        @help-modal-footer-button-click=${()=>{var e;this._cancelConfirm=!0,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-cancel-order-confirm",null===(e=this.orderDetailData)||void 0===e?void 0:e.id)}}
        @help-modal-footer-link-click=${()=>this._dispatchCustomEvent("trading-stocks-purchase-and-sale-cancel-order-link-click")}
        @header-main-close-icon-click=${()=>this._dispatchCustomEvent("trading-stocks-purchase-and-sale-cancel-order-close-icon-click")}
      >
        <div class="content" slot="slot-content">${this._renderCancelModalBody}</div>
      </bbva-help-modal>
    `}get _renderCancelModalBody(){var t;const{issuer:s,title:i}=this.orderDetailData??{},a=this.t(null==nt?void 0:nt.cancelIssuerLabel),r=this.t(null==nt?void 0:nt.orderTitlesLabel),o=this.t(null==nt?void 0:nt.orderTitlesToCancel),n=(t,s,i=!1,a=!1)=>e`
      <trading-stocks-purchase-and-sale-list-amount
        language=${this.language}
        ?is-amount=${i}
        ?is-italic=${a}
        label=${t}
        value=${s}
      ></trading-stocks-purchase-and-sale-list-amount>
    `;return e` <bbva-type-text
        ambient="primary"
        data-tag-name="bbva-type-text"
        tag="p"
        size="S"
        text=${null===(t=this.modalConfig)||void 0===t?void 0:t.descriptionText}
      ></bbva-type-text>
      ${n(a,`${null==s?void 0:s.businessName}\n        ${null==s?void 0:s.name}\n        ${null==s?void 0:s.id}`)}
      ${n(r,null==i?void 0:i.quantity)}
      ${n(o,null==i?void 0:i.pendingQuantity)}`}render(){return e` ${super.render()} ${this._renderModal} `}}customElements.define(Ts.is,Ts);var Es=i`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-header-category] {
  margin-top: 1rem;
  margin-bottom: 1rem;
}

.notification-message-container {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  margin: 1rem 0 1rem 0;
  gap: 1rem;
}

.cancel-receipt-footer {
  display: flex;
  flex-direction: column;
  gap: 1rem;
  margin-top: 1rem;
  padding-bottom: 1rem;
}
`;class $s extends(_(a(f(r)))){static get is(){return"cancel-receipt-modal"}static get scopedElements(){const e=[j,I,T,F,G,E,M,U,x,R,Nt,Lt];return $s.scopedElementsFromClasses(e)}static get properties(){return{modalConfig:{type:Object,attribute:"modal-config"},visible:{type:Boolean},cancelOrderResponse:{type:Object,attribute:"cancel-order-response"},orderDetailData:{type:Object,attribute:"order-detail-data"}}}constructor(){super(),this.buttonRowConfig=null==lt?void 0:lt.buttonRowOptions,this.visible=!1,this.cancelOrderResponse={},this.orderDetailData={},this.modalConfig={}}static get styles(){return[Es,B.primary,C.primary,S.primary,z.primary,P.primary,O.primary,H.primary,o("receipt-modal-shared-styles")]}get _renderModal(){var t,s,i,a,r,o,n,l,d;return e`
      <bbva-help-modal
        ?visible=${this.visible}
        ?full-height=${null===(t=this.modalConfig)||void 0===t?void 0:t.fullHeight}
        ?fixed-footer=${null===(s=this.modalConfig)||void 0===s?void 0:s.fixedFooter}
        header-text=${null===(i=this.modalConfig)||void 0===i?void 0:i.headerText}
        @header-main-icon-click=${()=>{var e;this.visible=!1,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-cancel-receipt-modal-close",{orderId:null===(e=this.orderDetailData)||void 0===e?void 0:e.id})}}
      >
        <div class="content" slot="slot-content">
          <trading-stocks-purchase-and-sale-panel-process
            language="${this.language}"
            titleSize="3XL"
            title=${null===(a=this.modalConfig)||void 0===a||null===(r=a.panel)||void 0===r?void 0:r.receiptPanelHeader}
            microillustration=${null===(o=this.modalConfig)||void 0===o||null===(n=o.panel)||void 0===n?void 0:n.microillustration}
            .microillustrationSize=${null===(l=this.modalConfig)||void 0===l||null===(d=l.panel)||void 0===d?void 0:d.microillustrationSize}
          ></trading-stocks-purchase-and-sale-panel-process>
          ${this._renderModalBookReceipt} ${this._renderNotificationMessages}
          ${this._renderButtonsRow} ${this._renderFooterInfo}
        </div>
      </bbva-help-modal>
    `}get _renderModalBookReceipt(){var t,s,i,a,r,o,l,d,c,u,p,h,m,g,v,b,y;const{title:_,issuer:f,classification:C,operationFolio:S,operationType:k}=this.cancelOrderResponse,P=this.t(null==lt?void 0:lt.dateAndHour),T=this.t(null==lt?void 0:lt.nameLabel),E=this.t(null==lt?void 0:lt.orderTypeLabel),$=this.t(null==lt?void 0:lt.numberOfTitlesLabel),x=this.t(null==lt?void 0:lt.numberOfAssignedTitlesLabel),D=this.t(null==lt?void 0:lt.numberOfTitlesToCancel),O=this.t(null==lt?void 0:lt.priceLabel),A=this.t(null==lt?void 0:lt.orderOperationType),R=this.t(null==lt?void 0:lt.orderFolioLabel),I=this.t(null==lt?void 0:lt.orderOperationNumberLabel),M=(t,s,i=!1,a=!1,r)=>e`
      <trading-stocks-purchase-and-sale-list-amount
        language=${this.language}
        currency=${r}
        ?is-amount=${i}
        ?is-italic=${a}
        label=${t}
        value=${s}
      ></trading-stocks-purchase-and-sale-list-amount>
    `;return e`
      ${M(P,`${mt("DD MMMM YYYY, HH:mm")} h`,!1,!0)}
      ${M(T,`${null==f?void 0:f.businessName} ${null==f?void 0:f.name} ${null==f?void 0:f.id}`)}
      ${M($,null===(t=this.orderDetailData)||void 0===t||null===(s=t.title)||void 0===s?void 0:s.quantity)}
      ${(null===(i=this.orderDetailData)||void 0===i||null===(a=i.title)||void 0===a?void 0:a.quantityInCustody)>0?M(x,null===(r=this.orderDetailData)||void 0===r||null===(o=r.title)||void 0===o?void 0:o.quantityInCustody):n}
      ${(null===(l=this.orderDetailData)||void 0===l||null===(d=l.title)||void 0===d?void 0:d.pendingQuantity)>0?M(D,null===(c=this.orderDetailData)||void 0===c||null===(u=c.title)||void 0===u?void 0:u.pendingQuantity):M(D,null==_?void 0:_.quantity)}
      ${M(O,null===(p=this.orderDetailData)||void 0===p||null===(h=p.title)||void 0===h||null===(m=h.price)||void 0===m?void 0:m.amount,!0,!1,null===(g=this.orderDetailData)||void 0===g||null===(v=g.title)||void 0===v||null===(b=v.price)||void 0===b?void 0:b.currency)}
      ${M(A,"PURCHASE"===(null==k?void 0:k.id)?this.t("trading-stocks-purchase-and-sale-order-detail-market-purchase"):this.t("trading-stocks-purchase-and-sale-sale-title"))}
      ${M(E,`${"BOOK"===(null==C?void 0:C.id)?this.t("trading-stocks-purchase-and-sale-type-operation-limited"):this.t("trading-stocks-purchase-and-sale-type-operation-conditioned")}`)}
      ${M(R,null===(y=this.orderDetailData)||void 0===y?void 0:y.id)}
      ${M(I,S)}
    `}get _renderNotificationMessages(){return e`
      <div class="notification-message-container" ambient="primary">
        <bbva-notification-message variant="default">
          ${this.t(null==lt?void 0:lt.notificationMessage)}
        </bbva-notification-message>
      </div>
    `}get _renderButtonsRow(){return e`<bbva-button-row
      ambient="primary-alt"
      .options=${this.buttonRowConfig}
      @button-row-item-click=${e=>this._onRowButtonClicked(e.detail)}
    ></bbva-button-row>`}get _renderFooterInfo(){var t,s;return e`
      <div ambient="primary" class="cancel-receipt-footer">
        <bbva-type-text
          size="2XS"
          font-weight="350"
          tag="span"
          text=${this.t(null==lt||null===(t=lt.footerMessages)||void 0===t?void 0:t.footerMessage)}
        ></bbva-type-text>
        <bbva-type-text
          size="2XS"
          font-weight="350"
          tag="span"
          text=${this.t(null==lt||null===(s=lt.footerMessages)||void 0===s?void 0:s.footerMessage2)}
        ></bbva-type-text>
      </div>
    `}cancelOrderReceiptBtrader(){const{cancelOrderResponse:e,modalConfig:t}=this,{classification:s,operationDate:i,issuer:a,operationType:r,operationFolio:o,price:l}=e||{},{titlesData:d,orderFolio:c}=t||{},{currency:u,amount:p}=(null==d?void 0:d.price)||{},{businessName:h,name:m,id:g}=a||{},v={classification:"BOOK"===(null==s?void 0:s.id)?this.t(null==lt?void 0:lt.limited):this.t(null==lt?void 0:lt.conditioned),currencyPerTitle:u,date:i,issuerName:`${h} ${m} ${g}`,opType:"PURCHASE"===(null==r?void 0:r.id)?this.t(null==lt?void 0:lt.purchaseTitle):this.t(null==lt?void 0:lt.saleTitle),operationFolio:o,orderFolio:c,pendingTitles:null==d?void 0:d.pendingQuantity,pricePerTitle:p,titleCurrency:l?l.currency:n,titlePrice:l?l.amount:n,titlesAssigned:null==d?void 0:d.quantityInCustody,titlesNumber:null==d?void 0:d.quantity};this._dispatchCustomEvent("trading-stocks-purchase-and-sale-receipt-cancel-order-respond",(({date:e,issuerName:t,titlesNumber:s,titlesAssigned:i,pendingTitles:a,titlePrice:r,titleCurrency:o,pricePerTitle:n,currencyPerTitle:l,opType:d,classification:c,orderFolio:u,operationFolio:p})=>({templateSelected:"bTraderCancelOrderReceipt",title:"cells-share-operative-receipt-btrader-cancel-order-purchase-title",destination:{avatar:{src:"./images/official-document.svg"}},cancelOrderReceipt:[{key:" ",value:"cells-share-operative-receipt-btrader-cancel-order-purchase-request-sent",class:"bold spacing"},{key:" ",value:"cells-share-operative-receipt-btrader-cancel-order-purchase-order-detail",class:"bold spacing"},{key:"cells-share-operative-receipt-btrader-cancel-order-purchase-hour-date",value:e,class:"spacing light-key bold-value"},{key:"cells-share-operative-receipt-btrader-cancel-order-purchase-name",value:t,class:"spacing light-key"},{key:"cells-share-operative-receipt-btrader-cancel-order-purchase-order-titles",value:s,class:"spacing light-key"},{key:"cells-share-operative-receipt-btrader-cancel-order-purchase-assigned-titles",value:i,class:"spacing light-key"},{key:"cells-share-operative-receipt-btrader-cancel-order-purchase-titles-to-cancel",value:a,class:"spacing light-key"},{key:"cells-share-operative-receipt-btrader-cancel-order-purchase-last-price-per-title",amount:{amount:r,currency:o},class:"bold spacing"},{key:"cells-share-operative-receipt-btrader-cancel-order-purchase-price-per-title",amount:{amount:n,currency:l},class:"bold spacing"},{key:"cells-share-operative-receipt-btrader-cancel-order-purchase-type-of-operation",value:d,class:"spacing light-key"},{key:"cells-share-operative-receipt-btrader-cancel-order-purchase-order-type",value:c,class:"spacing light-key"},{key:"cells-share-operative-receipt-btrader-cancel-order-purchase-order-folio",value:u,class:"spacing light-key"},{key:"cells-share-operative-receipt-btrader-cancel-order-purchase-operation-folio",value:p,class:"spacing light-key"},{key:" ",value:"cells-share-operative-receipt-btrader-cancel-order-purchase-first-test-info",class:"spacing light-key"},{key:" ",value:"cells-share-operative-receipt-btrader-cancel-order-purchase-second-text-info",class:"spacing light-key"}],message:[{text:"cells-share-operative-receipt-btrader-cancel-order-purchase-final-infobox"}],operations:[{label:"Compartir comprobante",id:"share",icon:"coronita:share",disabled:!1}]}))(v))}_onRowButtonClicked(e){0===e&&this.cancelOrderReceiptBtrader()}render(){return e`${this._renderModal}`}}customElements.define($s.is,$s);class xs extends(_(a(f(r)))){static get is(){return"created-order-error-modal"}static get scopedElements(){const e=[j,I,T,G];return xs.scopedElementsFromClasses(e)}static get properties(){return{errorModalConfig:{type:Object,attribute:"error-modal-config"},visible:{type:Boolean}}}constructor(){super(),this.visible=!1,this.errorModalConfig={}}static get styles(){return[B.primary,C.primary,o("created-order-error-modal-shared-styles")]}get _renderModal(){var t,s,i,a,r,o,n;return e`
      <bbva-help-modal
        modal-type=${null===(t=this.errorModalConfig)||void 0===t?void 0:t.modalType}
        ?visible=${this.visible}
        ?full-height=${null===(s=this.errorModalConfig)||void 0===s?void 0:s.fullHeight}
        ?fixed-footer=${null===(i=this.errorModalConfig)||void 0===i?void 0:i.fixedFooter}
        header-text=${null===(a=this.errorModalConfig)||void 0===a?void 0:a.headerText}
        button-text=${null===(r=this.errorModalConfig)||void 0===r?void 0:r.buttonText}
        .titleIcon=${null===(o=this.errorModalConfig)||void 0===o?void 0:o.titleIcon}
        @help-modal-close=${e=>{e.stopPropagation(),this._dispatchCustomEvent("trading-stocks-purchase-and-sale-navigation-purchase-and-sale-go-back")}}
        @help-modal-footer-button-click=${()=>{var e;return this._dispatchCustomEvent("trading-stocks-purchase-and-sale-create-order-error-modal-close",null===(e=this.errorModalConfig)||void 0===e?void 0:e.id)}}
      >
        <div class="content" slot="slot-content">
          ${this._getModalBody(null===(n=this.errorModalConfig)||void 0===n?void 0:n.modalBody)}
        </div>
      </bbva-help-modal>
    `}_getModalBody(t){return"error"===t?e`${this._renderModalError}`:n}get _renderModalError(){return e`
      <div class="modal-container" ambient="primary">
        <bbva-type-text
          class="list-text"
          tag="span"
          size="S"
          text=${this.t("trading-stocks-purchase-and-sale-error-description")}
        >
        </bbva-type-text>
      </div>
    `}render(){return e`${this._renderModal}`}}customElements.define(xs.is,xs);var Ds=i`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`,Os=i`
:host {
  --_trading-stocks-purchase-and-sale-bg-color: var(--trading-stocks-purchase-and-sale--_ambient--default-bg,var(--colorsPrimaryCoreLightened, ${l(d.primaryCoreLightened)}));
  --_trading-stocks-purchase-and-sale-multistep-item-completed-color: var(--_trading-stocks-purchase-and-sale-multistep--_ambient--completed-color, var(--colorsPrimaryCoreLightened, ${l(d.primaryCoreLightened)}));
}
`;customElements.define(me.is,me),customElements.define(Pe.is,Pe),customElements.define(Ve.is,Ve),customElements.define(He.is,He),customElements.define(ge.is,ge),customElements.define(ve.is,ve),customElements.define(Fe.is,Fe),customElements.define(ze.is,ze),customElements.define(be.is,be),customElements.define(ye.is,ye),customElements.define(_e.is,_e),customElements.define(fe.is,fe);class As{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let a=0|t,r=Math.max(a>=0?a:i-Math.abs(a),0);for(;r<i;){if((o=s[r])===(n=e)||"number"==typeof o&&"number"==typeof n&&isNaN(o)&&isNaN(n))return!0;r++}var o,n;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var s=[],i=0,a="",r=0,o=arguments.length;r!==o;++r){var n=+arguments[r];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?i=s.push(n):(n-=65536,i=s.push(55296+(n>>10),n%1024+56320)),i>=16383&&(a+=e.apply(null,s),s.length=0)}return a+e.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",s=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${s&&s.message}`)}}class Rs extends As{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const Is=0,Ms=1,Ls="jwt",ws="tsec",Bs="none";class qs extends As{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Is,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Rs,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=ws:this.requiredToken=Bs,this.requiresJWT=!1):this.requiredToken===ws?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Ls?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===Bs?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(ws)}_setJwtHandler(){this._setTokenHandler(Ls)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((s,i)=>{t=Object.assign(t,{resolve:s,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let s=this._getRequestHeaders();Object.keys(s).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,s[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=v),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let s=e.replace(/[\{\}]+/g,""),i=t[s];return i?delete t[s]:this._error(9,`Missing ${s} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(t);s.length&&(e=[e,s.map((e=>{let s=t[e];return Array.isArray(s)&&this.paramArrayMode===Ms?this._arrayToQueryParam(e,s):`${e}=${s}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(ws,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(Ls,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=t.getItem(s);i&&"null"!==i&&(e[s]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const s=window.sessionStorage;t=Object.keys(s).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=s.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const s=`${e}Handler`,i=e===Ls?"JWT ":"",a=e===Ls?"Authorization":ws;if(void 0===this[s]||null===this[s])this._error(11,`${e} handler is undefined`);else{const r=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let o=this[s].getItem(r);o?t[a]=t[a]||i+o:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((s=>{t.push(`${s}=${e[s]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let s;const i=new Promise(((e,t)=>{s=(s,i)=>{s?t(s):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?s(i.error):s(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let s=0;for(;s<e.length;){let i=e[s],a=0,r=0;if(i<=127?(a=0,r=255&i):i<=223?(a=1,r=31&i):i<=239?(a=2,r=15&i):i<=244&&(a=3,r=7&i),e.length-s-a>0){let t=0;for(;t<a;)i=e[s+t+1],r=r<<6|63&i,t+=1}else r=65533,a=e.length-s;t+=String.fromCodePoint(r),s+=a+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},s=e.trim().split(/[\r\n]+/);for(const e in s)if(s.hasOwnProperty(e)&&""!==s[e]){let i=": ",a=s[e].split(i);t[a.shift().toLowerCase()]=a.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,s,i){let a=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(a=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(a=JSON.parse(t.headers)[i])}if(a){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;e.getItem(t)!==a&&(e.setItem(t,a),this._emitTokenUpdate(s,a))}}_emitTokenUpdate(e,t){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,s,i,a,r;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),s=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),a=e.getResponseHeader("AuthenticationChallenge"),r=e.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(e.headers);t=o.authenticationtype,s=o.authenticationdata||null,i=o.authenticationstate,a=o.authenticationchallenge,r=o.authenticationresponse}return{type:t,data:s,state:i,challenge:a,response:r}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",s=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",s="",i=""){let a;if("object"==typeof e&&e){const r=this._getSignatureData(e.signatureType,t,s);a=this._makeKeyValuePairFromObject(r,e.signatureValue),e.challenge&&(a+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(a,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(a=`password=${e}`,this._buildSignatureHeaders(a,"2",i)):(a=`${s}=${e}`,this._buildSignatureHeaders(a,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let s,i=e.split(",");if(i.length>1){s=i.map((e=>`${e}=${t[e]}`)).join(",")}else s=`${e}=${t}`;return s}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:r,data:o,state:n,challenge:l,response:d}=this._extractSignatureResponseHeaders(e),c=this._getRequestMetadata(e);if(a)this._notifySignatureInvalid(c),s=!0;else if(r)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,c,r,o,n,l,d),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,r,o,n,l,d),s=!0}return s}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),a=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),r=this._getRequestMetadata(e);a&&(this._notifyWaitingForProcessResponse(r),s=!0)}return s}_notifySignatureRequiredFirstStep(e,t,s,i){this._defineSignatureType(t,s),this._defineSignatureValue(t,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:s,metadata:e}}))}_notifySignatureRequired(e,t,s,i,a,r){this._defineSignatureValue(t,s,i);const o={type:t,data:s,challenge:a,metadata:e};r&&(o.response=r),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:s}=e;return{path:this._path,method:this.method,url:t,status:s}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",s=""){const i=t.split(";").findIndex((t=>t===e));return s?s.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,s,i,a,r){i?this._notifySignatureRequired(e,t,s,i,a,r):this._notifySignatureRequiredFirstStep(e,t,s,i)}_notifySignatureTypeUsingErrorCode(e,t,s,i,a,r,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,s,i,a):this._notifySignatureRequired(t,s,i,a,r,o)}}class Ns extends qs{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class js extends qs{constructor(e=null){super(Object.assign(e||{},{method:"HEAD"}))}toString(e=""){return super.toString(e||"BGADPRequestHEAD")}}class Vs extends qs{constructor(e=null){super(Object.assign(e||{},{method:"PATCH"}))}toString(e=""){return super.toString(e||"BGADPRequestPATCH")}}class Hs extends qs{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class Fs extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersGetV0")}}class zs extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}`)}toString(){return super.toString("BGADPCustomersCustomerGetV0")}}class Gs extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/addresses`)}toString(){return super.toString("BGADPCustomersCustomerAddressesGetV0")}}class Us extends Hs{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/behavioral-events`)}toString(){return super.toString("BGADPCustomersCustomerBehavioralEventsPostV0")}}class Ks extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/classifications`)}toString(){return super.toString("BGADPCustomersCustomerClassificationsGetV0")}}class Ys extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV0")}}class Ws extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/economic-data`)}toString(){return super.toString("BGADPCustomersCustomerEconomicDataGetV0")}}class Qs extends Vs{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/indicators/{indicator-id}`)}toString(){return super.toString("BGADPCustomersCustomerIndicatorsIndicatorPatchV0")}}class Xs extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries`)}toString(){return super.toString("BGADPCustomersCivilRegistriesGetV1")}}class Js extends Hs{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/civil-registries/search`)}toString(){return super.toString("BGADPCustomersCivilRegistriesSearchPostV1")}}class Zs extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersGetV1")}}class ei extends Hs{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersPostV1")}}class ti extends js{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers`)}toString(){return super.toString("BGADPCustomersHeadV1")}}class si extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}`)}toString(){return super.toString("BGADPCustomersCustomerGetV1")}}class ii extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/addresses`)}toString(){return super.toString("BGADPCustomersCustomerAddressesGetV1")}}class ai extends Hs{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/behavioral-events`)}toString(){return super.toString("BGADPCustomersCustomerBehavioralEventsPostV1")}}class ri extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/business-agents`)}toString(){return super.toString("BGADPCustomersCustomerBusinessAgentsGetV1")}}class oi extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/classifications`)}toString(){return super.toString("BGADPCustomersCustomerClassificationsGetV1")}}class ni extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/contact-details`)}toString(){return super.toString("BGADPCustomersCustomerContactDetailsGetV1")}}class li extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsGetV1")}}class di extends Hs{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/identification-process/documents`)}toString(){return super.toString("BGADPCustomersCustomerIdentificationProcessDocumentsPostV1")}}class ci extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/indicators`)}toString(){return super.toString("BGADPCustomersCustomerIndicatorsGetV1")}}class ui extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsGetV1")}}class pi extends Hs{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms`)}toString(){return super.toString("BGADPCustomersCustomerTermsPostV1")}}class hi extends Ns{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms/{term-id}`)}toString(){return super.toString("BGADPCustomersCustomerTermsTermGetV1")}}class mi extends Vs{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`customers/v${this.version}/customers/{customer-id}/terms/{term-id}`)}toString(){return super.toString("BGADPCustomersCustomerTermsTermPatchV1")}}class gi extends(b(r)){_mappingBank(e){this._renameProperty(e,"bank.bankId","id"),this._renameProperty(e,"bank.branch.branchId","id"),e.bank&&e.bank.branch&&e.bank.branch.costCenter&&(e.bank.branch.costCenter={id:e.bank.branch.costCenter})}_mappingGender(e){this._renameProperty(e,"gender.name","description")}_mappingIdentityDocuments(e){for(let t=0;t<e.identityDocuments.length;t++)this._renameProperty(e.identityDocuments[t],"documentType.name","description"),this._renameProperty(e.identityDocuments[t],"status.name","description")}_mappingMaritalStatus(e){this._renameProperty(e,"maritalStatus.name","description")}_mappingNationalities(e){for(let t=0;t<e.nationalities.length;t++)this._renameProperty(e.nationalities[t],"name","description")}_mappingPersonalTitle(e){this._renameProperty(e,"personalTitle.name","description")}_mappingResidence(e){this._renameProperty(e,"residence","taxResidence"),this._renameProperty(e,"taxResidence.residenceType.name","description")}_mappingVerification(e){this._renameProperty(e,"enrollmentModality","verification"),this._renameProperty(e,"verification.enrollmentMethod","identificationMethod")}_mappingSegments(e){for(let t=0;t<e.segments.length;t++)this._renameProperty(e.segments[t],"name","description")}_changeNameToDescription(e){e.map((e=>{this._renameProperty(e,"name","description")}))}}class vi extends gi{static get is(){return"bbva-global-customer-api-dm"}static get properties(){return{customer:{type:Object,attribute:!1}}}constructor(){super(),this.customer={}}resetCustomer(){this.customer={}}getCustomer(e,t={}){if(Object.keys(this.customer).length)return;this._paramsMapping(t);t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"customer-api-dm-fetch",errorFireEventHandler:"customer-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}Customer`,this._getBgadp(i))}_getBgadp(e){return{getCustomerV0:()=>new zs(e),getCustomerV1:()=>new si(e),getCustomerV2:()=>new Te(e),getCustomerV3:()=>new Ee(e),default:()=>"BGADP called not exist"}}_paramsMapping(e){return"2"==this.version&&this._removeFields(["expand"],e),e}_responseMapping(e){return"2"==this.version&&Object.keys(e).length?(e.identityDocuments.forEach((e=>{"NIE"===e.documentType.id&&(e.documentType.id="FOREIGNERS"),e.status&&"INVALID"===e.status.id&&this._removeFields(["status"],e),this._removeFields(["isPrincipal","verificationStatus"],e)})),e.taxpayerIdentification&&(e.taxResidence={nonPresentialResidences:[{taxPayer:{identityDocument:e.taxpayerIdentification}}]}),this._removeFields(["highValueCustomer","taxpayerIdentification"],e)):"1"==this.version&&Object.keys(e).length?(e.gender&&"OTHER"===e.gender.id&&this._removeFields(["gender"],e),e.language&&(this._removeFields(["internalCode"],e.language),this._removeFields(["internalCode"],e.language.correspondance)),e.nationalities.forEach((e=>{this._removeFields(["internalCode"],e)})),e.identityDocuments.forEach((e=>{e.status&&"ONLY_VALID_ORIGIN_COUNTRY"===e.status.id&&this._removeFields(["status"],e)})),this._mappingSocialSecurity(e),this._renameProperty(e.lastModification,"updateHour","lastModificationDate"),this._removeFields(["internalCode"],e.birthData.country),this._removeFields(["legalRepresentatives","isSignatureRequired","survivalSignedDate"],e)):"0"==this.version&&Object.keys(e).length&&(this._renameProperty(e,"customerId","id"),this._renameProperty(e.personalTitle,"name","description"),this._renameProperty(e.maritalStatus,"name","description"),this._renameProperty(e.gender,"name","description"),this._renameProperty(e.lastModification,"updateHour","lastModificationDate"),this._removeFields(["membershipDate","arrivalReference"],e),this._mappingNationalities(e),this._mappingIdentityDocuments(e),this._mappingBank(e),this._mappingResidence(e),this._mappingSocialSecurity(e),e.enrollmentModality&&"POST_MAIL"===e.enrollmentModality.enrollmentMethod&&(e.enrollmentModality.enrollmentMethod="UNBANKED"),this._mappingVerification(e)),e}_mappingSocialSecurity(e){e.socialSecurityNumber&&(e.identityDocuments=[...e.identityDocuments,{documentType:{id:"SOCIAL_SECURITY_NUMBER",description:e.socialSecurityNumber}}],this._removeFields(["socialSecurityNumber"],e))}}class bi extends gi{static get is(){return"bbva-global-customer-behavioral-events-api-dm"}constructor(){super()}postCustomerBehavioralEvents(e,t){const s={"customer-id":e};this._generateGetService(this._getService("post",t,s),{customEvent:"customer-behavioral-events-api-dm-create",errorFireEventHandler:"customer-behavioral-events-api-dm-create-error"},this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerBehavioralEvents`,this._getBgadp(i))}_getBgadp(e){return{postCustomerBehavioralEventsV0:()=>new Us(e),postCustomerBehavioralEventsV1:()=>new ai(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return this._renameProperty(e.behavioralType,"name","description"),e}}class yi extends gi{static get is(){return"bbva-global-customers-api-dm"}static get properties(){return{customers:{type:Array,attribute:!1}}}constructor(){super(),this.customers=[]}resetCustomers(){this.customers=[]}getCustomers(e={}){if(Object.keys(this.customers).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"customers-api-dm-fetch",errorFireEventHandler:"customers-api-dm-fetch-error"},this._responseMapping,e.fields)}postCustomers(e){this._generateGetService(this._getService("post",e),{customEvent:"customers-api-dm-create",errorFireEventHandler:"customers-api-dm-create-error"},this._responseMapping),this.resetCustomers()}headCustomers(){this._generateGetService(this._getService("head",{},{}),{customEvent:"customers-api-dm-head-fetch",errorFireEventHandler:"customers-api-dm-head-fetch-error"},this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}Customers`,this._getBgadp(i))}_getBgadp(e){return{getCustomersV0:()=>new Fs(e),getCustomersV1:()=>new Zs(e),postCustomersV1:()=>new ei(e),headCustomersV1:()=>new ti(e),getCustomersV3:()=>new Ae(e),default:()=>"BGADP called not exist"}}_responseMapping(e){if("0"===this.version&&e.length){const t=["membershipDate","arrivalReference"];for(let s=0;s<e.length;s++)this._renameProperty(e[s],"customerId","id"),this._mappingBank(e[s]),this._mappingGender(e[s]),this._mappingIdentityDocuments(e[s]),this._mappingMaritalStatus(e[s]),e[s].nationalities&&this._mappingNationalities(e[s]),this._mappingPersonalTitle(e[s]),this._mappingResidence(e[s]),this._removeFields(t,e[s])}return e}}class _i extends gi{static get is(){return"bbva-global-customer-term-api-dm"}static get properties(){return{customerTerm:{type:Object,attribute:!1}}}constructor(){super(),this.customerTerm={}}resetCustomerTerm(){this.customerTerm={}}getCustomerTerm(e,t,s={}){if(Object.keys(this.customerTerm).length)return;s=Object.assign({"customer-id":e,"term-id":t},s),this._generateGetService(this._getService("get",{},s),{customEvent:"customer-term-api-dm-fetch",errorFireEventHandler:"customer-term-api-dm-fetch-error"},this._responseMapping,s.fields)}patchCustomerTerm(e,t,s){const i={"customer-id":e,"term-id":t};this._generateGetService(this._getService("patch",s,i),{customEvent:"customer-term-api-dm-update",errorFireEventHandler:"customer-term-api-dm-update-error"},this._responseMapping),this.resetCustomerTerm()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerTerm`,this._getBgadp(i))}_getBgadp(e){return{getCustomerTermV1:()=>new hi(e),patchCustomerTermV1:()=>new mi(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class fi extends gi{static get is(){return"bbva-global-customer-terms-base-api-dm"}resetCustomerTerms(){this.customerTerms=[]}getCustomerTerms(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields,this._paginationMapping)}postCustomerTerms(e,t){this._requestMapping(t);const s={"customer-id":e};this._generateGetService(this._getService("post",t,s),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerTerms()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerTerms`,this._getBgadp(i))}_getBgadp(e){return{getCustomerTermsV1:()=>new ui(e),postCustomerTermsV1:()=>new pi(e),default:()=>"BGADP does not exist."}}_requestMapping(e){return e}_responseMapping(e){return e}_paginationMapping(e){return e}}y(fi,"GET_EVENTS",{customEvent:"customer-terms-api-dm-fetch",paginationEvent:"customer-terms-api-dm-pagination",errorFireEventHandler:"customer-terms-api-dm-fetch-error"}),y(fi,"POST_EVENTS",{customEvent:"customer-terms-api-dm-create",errorFireEventHandler:"customer-terms-api-dm-create-error"}),customElements.define(fi.is,fi);class Ci extends gi{static get is(){return"bbva-global-customer-terms-api-dm"}static get properties(){return{customerTerms:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.customerTerms=[],this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","customerTerms"],this._loaded=!1,this._requestParams={}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CustomerTerms`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCustomerTerms${e}ApiDm`;(0,this._modules[e])().then((async e=>{const s=e[t].is;this._module=this._createModuleElement(s),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customer-terms-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customer-terms-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=fi.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetCustomerTerms(){await this.module.updateComplete,this.module.resetCustomerTerms()}async getCustomerTerms(e,t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({customerId:e,params:t}):this._requestParams={get:[{customerId:e,params:t}]}}async _getCustomerTerms(){await this.module.updateComplete,Object.keys(this.customerTerms).length||(this._requestParams.get.forEach((e=>{this.module.getCustomerTerms(e.customerId,e.params)})),delete this._requestParams.get)}async postCustomerTerms(e,t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({customerId:e,body:t}):this._requestParams={post:[{customerId:e,body:t}]}}async _postCustomerTerms(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postCustomerTerms(e.customerId,e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return e` ${this._module?this._module:""}`}}class Si extends gi{static get is(){return"bbva-global-customer-classifications-api-dm"}static get properties(){return{customerClassifications:{type:Array,attribute:!1}}}constructor(){super(),this.customerClassifications=[]}resetCustomerClassifications(){this.customerClassifications=[]}getCustomerClassifications(e,t={}){if(Object.keys(this.customerClassifications).length)return;this._paramsMapping(t);t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"customer-classifications-api-dm-fetch",errorFireEventHandler:"customer-classifications-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerClassifications`,this._getBgadp(i))}_getBgadp(e){return{getCustomerClassificationsV0:()=>new Ks(e),getCustomerClassificationsV1:()=>new oi(e),getCustomerClassificationsV3:()=>new Re(e),default:()=>"BGADP called not exist"}}_paramsMapping(e){"0"==this.version&&this._removeFields(["estimatedClassificationDate"],e)}_responseMapping(e){if("0"==this.version&&Object.keys(e).length)for(let t=0;t<e.length;t++)this._renameProperty(e[t],"classificationId","id"),this._renameProperty(e[t],"name","description"),this._renameProperty(e[t].sector,"name","description"),this._mappingSegments(e[t]);return e}}class ki extends gi{static get is(){return"bbva-global-customer-contact-details-api-dm"}static get properties(){return{customerContactDetails:{type:Array,attribute:!1},_contactType:{type:Object,attribute:!1},_socialNetwork:{type:Object,attribute:!1},_emailType:{type:Object,attribute:!1},_phoneType:{type:Object,attribute:!1}}}constructor(){super(),this.customerContactDetails=[],this._contactType={WORK_EMAIL:"EMAIL",FACEBOOK_EMAIL:"EMAIL",EMAIL:"EMAIL",PHONE_NUMBER:"LANDLINE",MOBILE_NUMBER:"MOBILE",OFFICE_NUMBER:"LANDLINE",FACEBOOK_ACCOUNT:"SOCIALMEDIA",TWITTER_ACCOUNT:"SOCIALMEDIA"},this._socialNetwork={FACEBOOK_ACCOUNT:"FACEBOOK",TWITTER_ACCOUNT:"TWITTER"},this._emailType={EMAIL:"PERSONAL",WORK_EMAIL:"WORK",FACEBOOK_EMAIL:"SOCIALMEDIA"},this._phoneType={PHONE_NUMBER:"HOME",OFFICE_NUMBER:"WORK"}}resetCustomerContactDetails(){this.customerContactDetails=[]}getCustomerContactDetails(e,t={}){if(Object.keys(this.customerContactDetails).length)return;this._paramsMapping(t);t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"customer-contact-details-api-dm-fetch",paginationEvent:"customer-contact-details-api-dm-pagination",errorFireEventHandler:"customer-contact-details-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerContactDetails`,this._getBgadp(i))}_getBgadp(e){return{getCustomerContactDetailsV0:()=>new Ys(e),getCustomerContactDetailsV1:()=>new ni(e),getCustomerContactDetailsV2:()=>new Q(e),getCustomerContactDetailsV3:()=>new X(e),default:()=>"BGADP called not exist"}}_paramsMapping(e){"0"==this.version&&(this._removeFields(["contact.isMultichannel"],e),this._removeFields(["contact.contactDetailType"],e)),"2"==this.version&&this._removeFields(["contact.contactDetailType"],e)}_responseMapping(e){if("0"==this.version&&Object.keys(e).length){let t;for(let s=0;s<e.length;s++)if(this._renameProperty(e[s],"contactDetailId","id"),e[s].contactType){switch(t=e[s].contact,e[s].contact={contactDetailType:this._contactType[e[s].contactType.id]},e[s].contact.contactDetailType){case"EMAIL":e[s].contact.address=t,e[s].hasOwnProperty("isVerified")&&(e[s].contact.isVerified=e[s].isVerified),e[s].contact.receivesNotifications=e[s].isChecked,e[s].contact.emailType=this._emailType[e[s].contactType.id];break;case"LANDLINE":e[s].contact.number=t,e[s].contact.phoneType=this._phoneType[e[s].contactType.id],e[s].country&&(e[s].contact.country=e[s].country),e[s].regionalCode&&(e[s].contact.regionalCode=e[s].regionalCode),e[s].extension&&(e[s].contact.extension=e[s].extension),e[s].hasOwnProperty("isVerified")&&(e[s].contact.isVerified=e[s].isVerified);break;case"MOBILE":e[s].contact.number=t,e[s].phoneCompany&&(e[s].contact.phoneCompany=e[s].phoneCompany),e[s].hasOwnProperty("isVerified")&&(e[s].contact.isVerified=e[s].isVerified),e[s].contact.receivesNotifications=e[s].isChecked,e[s].contact.phoneType="HOME";break;case"SOCIALMEDIA":e[s].contact.userName=t,e[s].contact.socialNetwork=this._socialNetwork[e[s].contactType.id]}this._removeFields(["country","regionalCode","extension","isChecked","isVerified","contactType","phoneCompany"],e[s])}}if("1"==this.version&&Object.keys(e).length){const t=["isSafe","isVerifiedByCustomer"];for(let s=0;s<e.length;s++)e[s].contact&&"MOBILE"===e[s].contact.contactDetailType&&this._removeFields(["isMobileToken"],e[s].contact),this._removeFields(t,e[s])}return e}}class Pi extends gi{static get is(){return"bbva-global-customer-addresses-api-dm"}static get properties(){return{customerAddresses:{type:Array,attribute:!1}}}constructor(){super(),this.customerAddresses=[]}resetCustomerAddresses(){this.customerAddresses=[]}getCustomerAddresses(e,t={}){if(Object.keys(this.customerAddresses).length)return;this._paramsMapping(t);t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"customer-addresses-api-dm-fetch",paginationEvent:"customer-addresses-api-dm-pagination",errorFireEventHandler:"customer-addresses-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerAddresses`,this._getBgadp(i))}_getBgadp(e){return{getCustomerAddressesV3:()=>new J(e),getCustomerAddressesV2:()=>new Z(e),getCustomerAddressesV1:()=>new ii(e),getCustomerAddressesV0:()=>new Gs(e),default:()=>"BGADP called not exist"}}_paramsMapping(e){"0"!=this.version&&"2"!=this.version||this._removeFields(["addressType.id"],e)}_responseMapping(e){if(Object.keys(e).length&&"1"==this.version)for(let t=0;t<e.length;t++)this._removeFields(["order","creationDate","isVerifiedByCustomer"],e[t]),this._geolocationToString(e[t].location.geolocation);else if(Object.keys(e).length&&"0"==this.version)for(let t=0;t<e.length;t++)if(!e[t].location.addressComponents){let s=[];this._renameProperty(e[t].location,"addressName","formattedAddress"),this._renameProperty(e[t],"addressId","id"),this._renameProperty(e[t].addressType,"name","description"),this._renameProperty(e[t].ownershipType,"name","description"),e[t].ownershipType&&this._renameProperty(e[t].ownershipType.propertyType,"name","description"),s.push({componentTypes:["COUNTRY"],code:e[t].location.country.id,name:e[t].location.country.name}),e[t].location.city&&s.push({componentTypes:["CITY"],name:e[t].location.city}),e[t].location.zipCode&&s.push({componentTypes:["POSTAL_CODE"],code:e[t].location.zipCode}),e[t].location.state&&s.push({componentTypes:["ADMINISTRATIVE_AREA_LEVEL_1"],code:e[t].location.state.id,name:e[t].location.state.name}),e[t].location.geographicGroups&&(s=[...e[t].location.geographicGroups,...s],delete e[t].location.geographicGroups),this._geolocationToString(e[t].location.geolocation);for(let e=0;e<s.length;e++)s[e].geographicGroupType&&(s[e].componentTypes=[s[e].geographicGroupType.id],this._removeFields(["geographicGroupType"],s[e]));e[t].location.addressComponents=s,this._removeFields(["city","state","country","zipCode"],e[t].location)}return e}_geolocationToString(e){e&&Object.keys(e).length>0&&(e.latitude=e.latitude.toString(),e.longitude=e.longitude.toString())}}class Ti extends gi{static get is(){return"bbva-global-customer-lopd-documents-base-api-dm"}resetCustomerLopdDocuments(){this.customerLopdDocuments={}}getCustomerLopdDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerLopdDocuments`,this._getBgadp(i))}_getBgadp(e){return{getCustomerLopdDocumentsV3:()=>new ee(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}y(Ti,"GET_EVENTS",{customEvent:"customer-lopd-documents-api-dm-fetch",errorFireEventHandler:"customer-lopd-documents-api-dm-fetch-error"}),customElements.define(Ti.is,Ti);class Ei extends gi{static get is(){return"bbva-global-customer-lopd-documents-api-dm"}static get properties(){return{customerLopdDocuments:{type:Object,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.customerLopdDocuments={},this.country="",this.localCustomProperties={},this._countries=["Es"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","customerLopdDocuments"],this._loaded=!1,this._requestParams={},this._modules={Es:()=>import("./7cd6e00f.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CustomerLopdDocuments`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCustomerLopdDocuments${e}ApiDm`;(0,this._modules[e])().then((async e=>{const s=e[t].is;this._module=this._createModuleElement(s),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customer-lopd-documents-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customer-lopd-documents-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=Ti.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetCustomerLopdDocuments(){await this.module.updateComplete,this.module.resetCustomerLopdDocuments()}async getCustomerLopdDocuments(e,t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({customerId:e,params:t}):this._requestParams={get:[{customerId:e,params:t}]}}async _getCustomerLopdDocuments(){await this.module.updateComplete,Object.keys(this.customerLopdDocuments).length||(this._requestParams.get.forEach((e=>{this.module.getCustomerLopdDocuments(e.customerId,e.params)})),delete this._requestParams.get)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return e` ${this._module?this._module:""}`}}class $i extends gi{static get is(){return"bbva-global-customer-business-agents-api-dm"}static get properties(){return{customerBusinessAgents:{type:Array,attribute:!1}}}constructor(){super(),this.customerBusinessAgents=[]}resetCustomerBusinessAgents(){this.customerBusinessAgents=[]}getCustomerBusinessAgents(e,t={}){if(Object.keys(this.customerBusinessAgents).length)return;t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),{customEvent:"customer-business-agents-api-dm-fetch",paginationEvent:"customer-business-agents-api-dm-pagination",errorFireEventHandler:"customer-business-agents-api-dm-fetch-error"},this._responseMapping,t.fields,this._paginationMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerBusinessAgents`,this._getBgadp(i))}_getBgadp(e){return{getCustomerBusinessAgentsV1:()=>new ri(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}_paginationMapping(e){return e}}class xi extends gi{static get is(){return"bbva-global-customer-indicator-api-dm"}constructor(){super()}patchCustomerIndicator(e,t,s){this._requestMapping(s);const i={"customer-id":e,"indicator-id":t};this._generateGetService(this._getService("patch",s,i),{customEvent:"customer-indicator-api-dm-update",errorFireEventHandler:"customer-indicator-api-dm-update-error"})}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerIndicator`,this._getBgadp(i))}_getBgadp(e){return{patchCustomerIndicatorV3:()=>new $e(e),patchCustomerIndicatorV0:()=>new Qs(e),default:()=>"BGADP called not exist"}}_requestMapping(e){return"0"==this.version&&e.reasons&&this._removeFields(["reasons"],e),e}}class Di extends gi{static get is(){return"bbva-global-customer-economic-data-base-api-dm"}resetCustomerEconomicData(){this.customerEconomicData={}}getCustomerEconomicData(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerEconomicData`,this._getBgadp(i))}_getBgadp(e){return{getCustomerEconomicDataV0:()=>new Ws(e),getCustomerEconomicDataV2:()=>new Ie(e),getCustomerEconomicDataV3:()=>new Me(e),default:()=>"BGADP does not exist."}}_incomesMapping(e){e.map((e=>{e.incomeValue={},e.incomeValue={valueType:"EXACT",amount:{amount:e.incomeValues[0].amount,currency:e.incomeValues[0].currency}},e.incomeValues[0].concept&&(e.incomeValue.concept=e.incomeValues[0].concept),e.incomeValues[0].frecuency&&(e.incomeValue.frequency=e.incomeValues[0].frecuency),"BIWEEKLY"==e.incomeValue.frequency&&(e.incomeValue.frequency="BI_WEEKLY"),this._removeFields(["incomeValues"],e),this._changeNameToDescription([e.incomeType])}))}_expensesMapping(e){e.map((e=>{e.expenseValue={currency:e.expenseValues[0].currency,amount:e.expenseValues[0].amount},e.expenseValues[0].frecuency&&(e.expenseValue.frequency=e.expenseValues[0].frecuency),e.expenseValue.frequency&&"BIWEEKLY"==e.expenseValue.frequency&&(e.expenseValue.frequency="BI_WEEKLY"),this._removeFields(["expenseValues"],e),this._changeNameToDescription([e.expenseType])}))}_workPlaceMapping(e){e.address&&(e.address.addressType&&"WORK"!==e.address.addressType.id&&this._removeFields(["id"],e.address.addressType),e.address.ownershipType&&(["MOVED","REJECTED","NOT_LOCATED"].includes(e.address.ownershipType.id)&&this._removeFields(["id"],e.address.ownershipType),this._changeNameToDescription([e.address.ownershipType,e.address.ownershipType.propertyType])),this._renameProperty(e.address.location,"addressName","formatedAddress"),this._removeFields(["residenceStartDate"],e.address),this._removeFields(["city","state","country","zipCode","geolocation","geographicGroups","meta"],e.address.location)),this._changeNameToDescription([e.address.addressType,e.economicActivity,e.profesionPosition]),this._renameProperty(e,"profesionPosition","professionPosition"),this._removeFields(["taxpayerIdentification"],e)}_assetsMapping(e){e.map((e=>{this._changeNameToDescription([e.assetType]),e.assetValues.map((e=>{this._removeFields(["concept"],e)}))}))}_liabilitiesMapping(e){e.map((e=>{this._changeNameToDescription([e.liabilityType]),e.liabilityValues.map((e=>{this._removeFields(["concept","frecuency"],e)}))}))}_responseMapping(e){return"0"==this.version&&Object.keys(e).length?(this._changeNameToDescription([e.economicActivity,e.occupationType,e.employmentSituation,e.education]),e.incomes&&this._incomesMapping(e.incomes),e.expenses&&this._expensesMapping(e.expenses),e.workPlace&&this._workPlaceMapping(e.workPlace),e.assets&&this._assetsMapping(e.assets),e.liabilities&&this._liabilitiesMapping(e.liabilities),e.balances&&e.balances.map((e=>{this._changeNameToDescription([e])})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialGroup","financialSubGroup","indicators","incomeSources"],e)):"2"==this.version&&Object.keys(e).length&&(e.workPlace&&e.workPlace.economicActivities&&(e.workPlace.economicActivity=e.workPlace.economicActivities[0],this._removeFields(["economicActivities"],e.workPlace)),e.balances&&e.balances.forEach((e=>{e.id=e.balanceType.id,e.description=e.balanceType.description,e.amount=e.balanceValue.amount,e.currency=e.balanceValue.currency,this._removeFields(["balanceType","balanceValue"],e)})),e.expenses&&e.expenses.forEach((e=>{["OTHER_LOAN","REVOLVING_CARD","FIXED_PAYMENT"].includes(e.expenseType.id)&&this._removeFields(["expenseType"],e)})),e.assets&&e.assets.forEach((e=>{["BANK_DEPOSIT"].includes(e.assetType.id)&&this._removeFields(["assetType"],e)})),e.liabilities&&e.liabilities.forEach((e=>{["MORTGAGE","PERSONAL_LOANS","OTHER_LOANS"].includes(e.liabilityType.id)&&this._removeFields(["liabilityType"],e)})),this._renameProperty(e,"workPlace","workplace"),this._removeFields(["financialSummaries"],e)),e}}y(Di,"GET_EVENTS",{customEvent:"customer-economic-data-api-dm-fetch",errorFireEventHandler:"customer-economic-data-api-dm-fetch-error"}),customElements.define(Di.is,Di);class Oi extends gi{static get is(){return"bbva-global-customer-economic-data-api-dm"}static get properties(){return{customerEconomicData:{type:Object,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.customerEconomicData={},this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","customerEconomicData"],this._loaded=!1,this._requestParams={}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CustomerEconomicData`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCustomerEconomicData${e}ApiDm`;(0,this._modules[e])().then((async e=>{const s=e[t].is;this._module=this._createModuleElement(s),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customer-economic-data-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customer-economic-data-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=Di.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetCustomerEconomicData(){await this.module.updateComplete,this.module.resetCustomerEconomicData()}async getCustomerEconomicData(e,t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({customerId:e,params:t}):this._requestParams={get:[{customerId:e,params:t}]}}async _getCustomerEconomicData(){await this.module.updateComplete,Object.keys(this.customerEconomicData).length||(this._requestParams.get.forEach((e=>{this.module.getCustomerEconomicData(e.customerId,e.params)})),delete this._requestParams.get)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return e` ${this._module?this._module:""}`}}class Ai extends gi{static get is(){return"bbva-global-persons-search-api-dm"}static get properties(){return{personsSearch:{type:Array,attribute:!1}}}constructor(){super(),this.personsSearch=[]}resetPersonsSearch(){this.personsSearch={}}postPersonsSearch(e){if(Object.keys(this.personsSearch).length)return;this._generateGetService(this._getService("post",e),{customEvent:"persons-search-api-dm-fetch",errorFireEventHandler:"persons-search-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}PersonsSearch`,this._getBgadp(i))}_getBgadp(e){return{postPersonsSearchV2:()=>new xe(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}class Ri extends gi{static get is(){return"bbva-global-civil-registries-search-base-api-dm"}resetCivilRegistriesSearch(){this.civilRegistriesSearch=[]}postCivilRegistriesSearch(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CivilRegistriesSearch`,this._getBgadp(i))}_getBgadp(e){return{postCivilRegistriesSearchV1:()=>new Js(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}y(Ri,"POST_EVENTS",{customEvent:"civil-registries-search-api-dm-fetch",errorFireEventHandler:"civil-registries-search-api-dm-fetch-error"}),customElements.define(Ri.is,Ri);class Ii extends gi{static get is(){return"bbva-global-civil-registries-search-api-dm"}static get properties(){return{civilRegistriesSearch:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}async resetCivilRegistriesSearch(){await this.module.updateComplete,this.module.resetCivilRegistriesSearch()}constructor(){super(),this.civilRegistriesSearch=[],this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./6dace358.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CivilRegistriesSearch`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCivilRegistriesSearch${e}ApiDm`;(0,this._modules[e])().then((async e=>{const s=e[t].is;this._module=this._createModuleElement(s),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-civil-registries-search-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-civil-registries-search-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=Ri.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async postCivilRegistriesSearch(e){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:e}):this._requestParams={post:[{body:e}]}}async _postCivilRegistriesSearch(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postCivilRegistriesSearch(e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return e` ${this._module?this._module:""}`}}class Mi extends gi{static get is(){return"bbva-global-customers-search-api-dm"}static get properties(){return{customersSearch:{type:Array,attribute:!1}}}constructor(){super(),this.customersSearch=[]}resetCustomersSearch(){this.customersSearch=[]}postCustomersSearch(e){if(Object.keys(this.customersSearch).length)return;this._requestMapping(e);this._generateGetService(this._getService("post",e),{customEvent:"customers-search-api-dm-fetch",errorFireEventHandler:"customers-search-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomersSearch`,this._getBgadp(i))}_getBgadp(e){return{postCustomersSearchV3:()=>new De(e),postCustomersSearchV2:()=>new Oe(e),default:()=>"BGADP called not exist"}}_requestMapping(e){return"2"==this.version&&(e.identityDocuments&&(e.identityDocument={documentNumber:e.identityDocuments[0].documentNumber}),this._removeFields(["customerId","firstName","lastName","secondLastName","birthData","personType","products","gender","identityDocuments"],e)),e}_responseMapping(e){return"2"==this.version&&Object.keys(e).length&&e.forEach((e=>{this._renameProperty(e,"id","customerId"),this._renameProperty(e,"name","firstName"),e.identityDocuments=[{documentNumber:e.identityDocument.documentNumber}],"CURP"===e.identityDocument.documentType.id&&(e.identityDocuments[0].documentType={id:e.identityDocument.documentType.id}),this._removeFields(["middleName","identityDocument"],e)})),e}}class Li extends gi{static get is(){return"bbva-global-civil-registries-base-api-dm"}resetCivilRegistries(){this.civilRegistries=[]}getCivilRegistries(e){this._generateGetService(this._getService("get",{},e),this.constructor.GET_EVENTS,this._responseMapping,e.fields,this._paginationMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CivilRegistries`,this._getBgadp(i))}_getBgadp(e){return{getCivilRegistriesV1:()=>new Xs(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}_paginationMapping(e){return e}}y(Li,"GET_EVENTS",{customEvent:"civil-registries-api-dm-fetch",paginationEvent:"civil-registries-api-dm-pagination",errorFireEventHandler:"civil-registries-api-dm-fetch-error"}),customElements.define(Li.is,Li);class wi extends gi{static get is(){return"bbva-global-civil-registries-api-dm"}static get properties(){return{civilRegistries:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.civilRegistries=[],this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","civilRegistries"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./461bac76.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"localCustomProperties"==t&&this._loaded||"_module"!==t&&"_requestParams"!==t&&"localCustomProperties"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CivilRegistries`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCivilRegistries${e}ApiDm`;(0,this._modules[e])().then((async e=>{const s=e[t].is;this._module=this._createModuleElement(s),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-civil-registries-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-civil-registries-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=Li.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetCivilRegistries(){await this.module.updateComplete,this.module.resetCivilRegistries()}async getCivilRegistries(e={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({params:e}):this._requestParams={get:[{params:e}]}}async _getCivilRegistries(){await this.module.updateComplete,Object.keys(this.civilRegistries).length||(this._requestParams.get.forEach((e=>{this.module.getCivilRegistries(e.params)})),delete this._requestParams.get)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return e` ${this._module?this._module:""}`}}class Bi extends gi{static get is(){return"bbva-global-customers-child-customers-base-api-dm"}postCustomersChildCustomers(e){this._generateGetService(this._getService("post",e),this.constructor.POST_EVENTS,this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomersChildCustomers`,this._getBgadp(i))}_getBgadp(e){return{postCustomersChildCustomersV3:()=>new we(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}y(Bi,"POST_EVENTS",{customEvent:"customers-child-customers-api-dm-create",errorFireEventHandler:"customers-child-customers-api-dm-create-error"}),customElements.define(Bi.is,Bi);class qi extends gi{static get is(){return"bbva-global-customers-child-customers-api-dm"}static get properties(){return{country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.country="",this.localCustomProperties={},this._countries=["Mx"],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties"],this._loaded=!1,this._requestParams={},this._modules={Mx:()=>import("./586103ff.js")}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CustomersChildCustomers`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCustomersChildCustomers${e}ApiDm`;(0,this._modules[e])().then((async e=>{const s=e[t].is;this._module=this._createModuleElement(s),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customers-child-customers-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customers-child-customers-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=Bi.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async postCustomersChildCustomers(e){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({body:e}):this._requestParams={post:[{body:e}]}}async _postCustomersChildCustomers(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postCustomersChildCustomers(e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return e` ${this._module?this._module:""}`}}class Ni extends gi{static get is(){return"bbva-global-customer-identification-process-documents-base-api-dm"}resetCustomerIdentificationProcessDocuments(){this.customerIdentificationProcessDocuments=[]}getCustomerIdentificationProcessDocuments(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}postCustomerIdentificationProcessDocuments(e,t){const s={"customer-id":e};this._generateGetService(this._getService("post",t,s),this.constructor.POST_EVENTS,this._responseMapping),this.resetCustomerIdentificationProcessDocuments()}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerIdentificationProcessDocuments`,this._getBgadp(i))}_getBgadp(e){return{getCustomerIdentificationProcessDocumentsV1:()=>new li(e),postCustomerIdentificationProcessDocumentsV1:()=>new di(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return e}}y(Ni,"GET_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-fetch",errorFireEventHandler:"customer-identification-process-documents-api-dm-fetch-error"}),y(Ni,"POST_EVENTS",{customEvent:"customer-identification-process-documents-api-dm-create",errorFireEventHandler:"customer-identification-process-documents-api-dm-create-error"}),customElements.define(Ni.is,Ni);class ji extends gi{static get is(){return"bbva-global-customer-identification-process-documents-api-dm"}static get properties(){return{customerIdentificationProcessDocuments:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.customerIdentificationProcessDocuments=[],this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","customerIdentificationProcessDocuments"],this._loaded=!1,this._requestParams={}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CustomerIdentificationProcessDocuments`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCustomerIdentificationProcessDocuments${e}ApiDm`;(0,this._modules[e])().then((async e=>{const s=e[t].is;this._module=this._createModuleElement(s),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customer-identification-process-documents-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customer-identification-process-documents-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=Ni.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetCustomerIdentificationProcessDocuments(){await this.module.updateComplete,this.module.resetCustomerIdentificationProcessDocuments()}async getCustomerIdentificationProcessDocuments(e,t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({customerId:e,params:t}):this._requestParams={get:[{customerId:e,params:t}]}}async _getCustomerIdentificationProcessDocuments(){await this.module.updateComplete,Object.keys(this.customerIdentificationProcessDocuments).length||(this._requestParams.get.forEach((e=>{this.module.getCustomerIdentificationProcessDocuments(null==e?void 0:e.customerId,null==e?void 0:e.params)})),delete this._requestParams.get)}async postCustomerIdentificationProcessDocuments(e,t){await this.module.updateComplete,this._requestParams.post?this._requestParams.post.push({customerId:e,body:t}):this._requestParams={post:[{customerId:e,body:t}]}}async _postCustomerIdentificationProcessDocuments(){await this.module.updateComplete,this._requestParams.post.forEach((e=>{this.module.postCustomerIdentificationProcessDocuments(null==e?void 0:e.customerId,null==e?void 0:e.body)})),delete this._requestParams.post}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return e` ${this._module?this._module:""}`}}class Vi extends gi{static get is(){return"bbva-global-customer-indicators-base-api-dm"}resetCustomerIndicators(){this.customerIndicators=[]}getCustomerIndicators(e,t){t=Object.assign({"customer-id":e},t),this._generateGetService(this._getService("get",{},t),this.constructor.GET_EVENTS,this._responseMapping,t.fields)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}CustomerIndicators`,this._getBgadp(i))}_getBgadp(e){return{getCustomerIndicatorsV1:()=>new ci(e),getCustomerIndicatorsV3:()=>new Le(e),default:()=>"BGADP does not exist."}}_responseMapping(e){return"1"==this.version&&Object.keys(e).length&&e.forEach((e=>{["BASIC_DATA","ENTREPRENEUR_AND_POTENTIAL","WEB_CONSUMPTION_ACCOUNT","USER_EXPIRED"].includes(e.id)&&this._removeFields(["id"],e),this._removeFields(["payrollAmounts","payrollAge"],e)})),e}}y(Vi,"GET_EVENTS",{customEvent:"customer-indicators-api-dm-fetch",errorFireEventHandler:"customer-indicators-api-dm-fetch-error"}),customElements.define(Vi.is,Vi);class Hi extends gi{static get is(){return"bbva-global-customer-indicators-api-dm"}static get properties(){return{customerIndicators:{type:Array,attribute:!1},country:{type:String},localCustomProperties:{type:Object,attribute:"custom-properties"},_countries:{type:Array},_configProperties:{type:Array},_module:{type:Object},_modules:{type:Object},_loaded:{type:Boolean},_requestParams:{type:Object}}}constructor(){super(),this.customerIndicators=[],this.country="",this.localCustomProperties={},this._countries=[],this._configProperties=["host","version","headers","requiredToken","params","cacheType","cacheKey","encodeCache","native","withCredentials","monitoring","requiredOTP","emitRequestEvents","responseType","forceBoundary","multipart","timeout","simulate","paramArrayMode","tsecHandler","jwtHandler","otpId","messages","apiInfo","pagination","page","totalPages","totalElements","pageSize","nextKey","previousKey","firstKey","lastKey","morePages","localCustomProperties","customerIndicators"],this._loaded=!1,this._requestParams={}}update(e){super.update(e),e.forEach(((e,t)=>{"country"===t&&this.country&&this.country!==e?this._loadModule():"_module"!==t&&"_requestParams"!==t&&"_loaded"!==t&&this._module&&this[t]!==e?this._module[t]=this[t]:("_requestParams"===t&&this._requestParams&&this._requestParams!==e&&void 0!==e&&(this._loaded||!this._countries.includes(this._capitalize(this.country)))||"_loaded"===t&&this._loaded)&&Object.entries(this._requestParams).forEach((([e])=>{this[`_${e}CustomerIndicators`]()}))}))}async _loadModule(){const e=this._capitalize(this.country);if(this._countries.includes(e)&&this._modules[e]){const t=`BbvaCustomerIndicators${e}ApiDm`;(0,this._modules[e])().then((async e=>{const s=e[t].is;this._module=this._createModuleElement(s),await this.updateComplete,this._loaded=!0,this._dispatchEvent("bbva-global-customer-indicators-api-dm-module-load")})).catch((async e=>{this._module=null,await this.updateComplete,this._dispatchEvent("bbva-global-customer-indicators-api-dm-module-error",e)}))}else this._module=this._createModuleElement(),this.appendChild(this._module)}_capitalize(e){return e.charAt(0).toUpperCase()+e.slice(1).toLowerCase()}_createModuleElement(e=Vi.is){const t=document.createElement(e);return this._bindConfig(t),t}async _bindConfig(e){this._configProperties.forEach((t=>{e[t]=this[t]})),await this.updateComplete}_dispatchEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}async resetCustomerIndicators(){await this.module.updateComplete,this.module.resetCustomerIndicators()}async getCustomerIndicators(e,t={}){await this.module.updateComplete,this._requestParams.get?this._requestParams.get.push({customerId:e,params:t}):this._requestParams={get:[{customerId:e,params:t}]}}async _getCustomerIndicators(){await this.module.updateComplete,Object.keys(this.customerIndicators).length||(this._requestParams.get.forEach((e=>{this.module.getCustomerIndicators(e.customerId,e.params)})),delete this._requestParams.get)}get module(){return this._module||(this._module=this._createModuleElement(),this.appendChild(this._module)),this._module}render(){return e` ${this._module?this._module:""}`}}customElements.define(vi.is,vi),customElements.define(bi.is,bi),customElements.define(yi.is,yi),customElements.define(_i.is,_i),customElements.define(Ci.is,Ci),customElements.define(Si.is,Si),customElements.define(ki.is,ki),customElements.define(Pi.is,Pi),customElements.define(Ei.is,Ei),customElements.define($i.is,$i),customElements.define(xi.is,xi),customElements.define(Oi.is,Oi),customElements.define(Ai.is,Ai),customElements.define(Ii.is,Ii),customElements.define(Mi.is,Mi),customElements.define(wi.is,wi),customElements.define(qi.is,qi),customElements.define(ji.is,ji),customElements.define(Hi.is,Hi);class Fi extends(_(f(a(r)))){static get is(){return"trading-stocks-purchase-and-sale-dm"}static get scopedElements(){const e=[ye,me,Ve,ze,ge,K,ve,Fe,ki];return Fi.scopedElementsFromClasses(e)}static get properties(){return{country:{type:String},privateBankingPortfolioId:{type:String,attribute:"private-banking-portfolio-id"},issuerId:{type:String,attribute:"issuer-id"},issuerNameAndDescription:{type:String,attribute:"issuer-name-and-description"},customerEmail:{type:String,attribute:"customer-email"},publicSettingsKey:{type:String,attribute:"public-settings-key"},publicSettingsId:{type:String,attribute:"public-settings-id"},customerId:{type:String,attribute:"customer-id"},appSettingsApiVersion:{type:String,attribute:"app-settings-api-version"},orderSimulationApiVersion:{type:String,attribute:"order-simulation-api-version"},investmentDetailApiVersion:{type:String,attribute:"investment-detail-api-version"},calculateSharesTransactionMarginApiVersion:{type:String,attribute:"calculate-shares-transaction-margin-api-version"},getCalculateSharesTransactionMarginData:{type:Object,attribute:"calculate-shares-transaction-margin-data"},getOrderSimulationData:{type:Object,attribute:"order-simulation-data"},createOrderApiVersion:{type:String,attribute:"create-order-api-version"},cancelOrderApiVersion:{type:String},getOrderApiVersion:{type:String},privateBankingPortfolioApiVersion:{type:String,attribute:"private-banking-portfolio-api-version"},customerContactDetailsApiVersion:{type:String,attribute:"customer-contact-details-api-version"},localCustomProperties:{type:Object,attribute:"local-custom-properties"}}}constructor(){super(),this.publicSettingsId="",this.publicSettingsKey="",this.privateBankingPortfolioId="",this.country="",this.issuerId="",this.issuerNameAndDescription="",this.customerEmail="",this.customerId="",this.appSettingsApiVersion="0",this.orderSimulationApiVersion="0",this.investmentDetailApiVersion="0",this.calculateSharesTransactionMarginApiVersion="0",this.privateBankingPortfolioApiVersion="0",this.createOrderApiVersion="0",this.cancelOrderApiVersion="0",this.getOrderApiVersion="0",this.customerContactDetailsApiVersion="0",this.publicSettings=[],this.getCalculateSharesTransactionMarginData={},this.getOrderSimulationData={},this.getOrderData={},this.localCustomProperties={}}firstUpdated(){super.firstUpdated(),this._getDms()}requestPublicSettingsDm(){this._publicSettingsDm.resetPublicSettings(),this._publicSettingsDm.getPublicSettings(this.publicSettingsId,{key:this.publicSettingsKey})}_successPublicSettingsHandler(e){var t;const s=e&&(null==e?void 0:e.detail)&&(null==e||null===(t=e.detail)||void 0===t?void 0:t.data)||(null==e?void 0:e.detail)||(null==e?void 0:e.data)||this.publicSettings,[i]=s,a=JSON.parse(i.value),{bTrader:r}=(null==a?void 0:a.data)||{};this._dispatchCustomEvent("trading-stocks-purchase-and-sale-app-settings-respond",r)}getCalculateSharesTransactionMarginDataDm(e){this._getCalculateSharesTransactionMarginDm.resetPrivateBankingPortfolioCalculateSharesTransactionMargin(),this._getCalculateSharesTransactionMarginDm.postPrivateBankingPortfolioCalculateSharesTransactionMargin(this.privateBankingPortfolioId,e)}_setCalculateSharesTransactionMarginResponse({detail:e}){this._dispatchCustomEvent("trading-stocks-purchase-and-sale-get-calculate-shares-respond",e)}_buildBodyForOrder(e){const{orderType:t,operationType:s,privateBankingPortfolioId:i,issuerName:a,issuerDescription:r,selectedDate:o,titleQuantity:n,titlePriceAmount:l,titleObjectivePriceAmount:d,titleMinimumPriceAmount:c,currency:u}=e;return{classification:{id:t},securityAccount:{id:i},operationType:{id:s},issuer:{id:r,name:a},title:{quantity:n,objectivePrice:{amount:d??0,currency:u},minimumPrice:{amount:c??0,currency:u},price:{amount:l??0,currency:u}},settlementDate:o}}getOrderSimulationDataDm(e){const t=this._buildBodyForOrder(e);this._orderSimulationOrderDm.resetOrdersSimulation(),this._orderSimulationOrderDm.postOrdersSimulation(t)}_setOrderSimulationResponse({detail:e}){this._dispatchCustomEvent("trading-stocks-purchase-and-sale-get-order-simulation-respond",e)}getCreatedOrderDataDm(e){const t=this._buildBodyForOrder(e);this._createOrderDm.resetOrders(),this._createOrderDm.postOrders(t)}_setCreatedOrderResponse({detail:e}){this._dispatchCustomEvent("trading-stocks-purchase-and-sale-get-create-order-respond",e)}getInvestmentDetailDataDm(e=this.issuerId){this._getInvestmentDetailDm.resetSecurityAccountIssuer(),this._getInvestmentDetailDm.getSecurityAccountIssuer(this.privateBankingPortfolioId,e)}_handleInvestmentDetailResponse({detail:e}){this._dispatchCustomEvent("trading-stocks-purchase-and-sale-dm-get-investment-detail-respond",e)}getOrderDataDm(e){this._getOrderDm.resetOrder(),this._getOrderDm.getOrder(e)}_setOrderResponse({detail:e}){this._dispatchCustomEvent("trading-stocks-purchase-and-sale-get-order-respond",e)}getCancelOrderDataDm(e){this._getCancelOrderDm.postOrderCancelation(e,{cancelationType:"ORDER"})}_setCancelOrderResponse({detail:e}){this._dispatchCustomEvent("trading-stocks-purchase-and-sale-cancel-respond",e)}getPrivateBankingPortfoliosDataDm(){this._getPrivateBankingPortfoliosDm.getPrivateBankingPortfolio(this.privateBankingPortfolioId)}_setPrivateBankingPortfoliosResponse({detail:e}){this._dispatchCustomEvent("trading-stocks-purchase-and-sale-get-private-banking-portfolios-respond",e)}getCustomerContactDetailsDataDm(e){this.customerEmail.length>0?this._getCustomerContactDetailsDm.customerContactDetails=this.customerEmail:this._getCustomerContactDetailsDm.getCustomerContactDetails(e)}_successCustomerContactDetailsHandler({detail:e}){this._dispatchCustomEvent("trading-stocks-purchase-and-sale-customer-contact-details-respond",e)}_handleErrorResponse(e){this._dispatchCustomEvent(`trading-stocks-purchase-and-sale-dm-api-dm-${e}-error`,e)}_handleSimulationErrorResponse(e){var t;const{messages:s}=e,i=null===(t=s[0])||void 0===t?void 0:t.code;this._dispatchCustomEvent("trading-stocks-purchase-and-sale-dm-api-dm-simulation-error",i)}_getDms(){this._publicSettingsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-public-settings-api-dm"]'),this._getInvestmentDetailDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-security-account-issuer-api-dm"]'),this._getCalculateSharesTransactionMarginDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-private-banking-portfolio-calculate-shares-transaction-margin-api-dm"]'),this._getPrivateBankingPortfoliosDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-private-banking-portfolio-api-dm"]'),this._orderSimulationOrderDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-orders-simulation-api-dm"]'),this._createOrderDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-orders-api-dm"]'),this._getCancelOrderDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-order-cancelation-api-dm"]'),this._getCustomerContactDetailsDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-customer-contact-details-api-dm"]'),this._getOrderDm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-order-api-dm"]')}get _renderDMs(){return e`
      ${this._publicSettings} ${this._renderStockMarketsApiDmBGADMS}
      ${this._renderPrivateBankingPortfoliosApiDmBGADMS}
      ${this._renderCustomerContactDetailsApiDmBGADMS}
    `}get _publicSettings(){return e`
      <bbva-global-public-settings-api-dm
        host="${this.publicSettingsHost}"
        version="${this.appSettingsApiVersion}"
        requiredtoken="${this.publicSettingsRequiredToken}"
        ?native="${this.native}"
        @public-settings-api-dm-fetch="${this._successPublicSettingsHandler}"
        @public-settings-api-dm-fetch-error="${this._handleErrorResponse}"
      ></bbva-global-public-settings-api-dm>
    `}get _renderStockMarketsApiDmBGADMS(){return e`
      <bbva-global-security-account-issuer-api-dm
        .version="${this.investmentDetailApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        .localCustomProperties="${this.localCustomProperties}"
        @security-account-issuer-api-dm-fetch="${this._handleInvestmentDetailResponse}"
        @security-account-issuer-api-dm-fetch-error="${()=>this._handleErrorResponse("investment-detail-error")}"
      >
      </bbva-global-security-account-issuer-api-dm>

      <bbva-global-orders-simulation-api-dm
        .version="${this.orderSimulationApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .country="${this.country}"
        .requiredToken="${this.requiredToken}"
        @orders-simulation-api-dm-fetch="${this._setOrderSimulationResponse}"
        @orders-simulation-api-dm-fetch-error="${e=>this._handleSimulationErrorResponse(e.detail)}"
      >
      </bbva-global-orders-simulation-api-dm>

      <bbva-global-orders-api-dm
        .version="${this.createOrderApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @orders-api-dm-create="${this._setCreatedOrderResponse}"
        @orders-api-dm-create-error="${()=>this._handleErrorResponse("create-order")}"
        @api-dm-error="${()=>this._handleErrorResponse("create-order")}"
      >
      </bbva-global-orders-api-dm>

      <bbva-global-order-api-dm
        .version="${this.getOrderApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @order-api-dm-fetch="${this._setOrderResponse}"
        @order-api-dm-fetch-error="${()=>this._handleErrorResponse("order-detail-error")}"
      ></bbva-global-order-api-dm>

      <bbva-global-order-cancelation-api-dm
        .version="${this.cancelOrderApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        @order-cancelation-api-dm-create="${this._setCancelOrderResponse}"
        @order-cancelation-api-dm-create-error="${()=>this._handleErrorResponse("cancel-order")}"
        @api-dm-error="${()=>this._handleErrorResponse("cancel-order")}"
      >
      </bbva-global-order-cancelation-api-dm>
    `}get _renderPrivateBankingPortfoliosApiDmBGADMS(){return e`
      <bbva-global-private-banking-portfolio-calculate-shares-transaction-margin-api-dm
        .version="${this.calculateSharesTransactionMarginApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @private-banking-portfolio-calculate-shares-transaction-margin-api-dm-fetch="${this._setCalculateSharesTransactionMarginResponse}"
        @private-banking-portfolio-calculate-shares-transaction-margin-api-dm-fetch-error="${()=>this._handleErrorResponse("calculate-shares")}"
      >
      </bbva-global-private-banking-portfolio-calculate-shares-transaction-margin-api-dm>

      <bbva-global-private-banking-portfolio-api-dm
        .version="${this.privateBankingPortfolioApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @private-banking-portfolio-api-dm-fetch="${this._setPrivateBankingPortfoliosResponse}"
        @private-banking-portfolio-api-dm-fetch-error="${()=>this._handleErrorResponse("private-banking-portfolio")}"
      >
      </bbva-global-private-banking-portfolio-api-dm>
    `}get _renderCustomerContactDetailsApiDmBGADMS(){return e`
      <bbva-global-customer-contact-details-api-dm
        .version="${this.customerContactDetailsApiVersion}"
        .host="${this.host}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @customer-contact-details-api-dm-fetch="${this._successCustomerContactDetailsHandler}"
        @customer-contact-details-api-dm-fetch-error="${()=>this._handleErrorResponse("customer-contact-details")}"
      ></bbva-global-customer-contact-details-api-dm>
    `}render(){return e` ${this._renderDMs}`}}customElements.define(Fi.is,Fi);class zi extends(_(f(a(r)))){static get is(){return"trading-stocks-purchase-and-sale"}static get scopedElements(){const e=[Ct,kt,Tt,ks,Ts,$s,Fi,xs,...zi.configurationScopedElements()];return zi.scopedElementsFromClasses(e)}static get properties(){return{initTrading:{type:Boolean,attribute:"init-trading"},country:{type:String},visibleModal:{type:Boolean,attribute:"visible-modal"},issuingEntity:{type:Object,attribute:"issuing-entity"},orderTypeList:{type:Array,attribute:"order-type-list"},isPurchase:{type:Boolean,attribute:"is-purchase"},operationType:{type:String,attribute:"operation-type"},privateBankingPortfolioId:{type:String,attribute:"private-banking-portfolio-id"},purchaseOrSale:{type:String,attribute:"purchase-or-sale"},assetId:{type:String,attribute:"asset-id"},assetNumberTypeId:{type:String,attribute:"asset-number-type-id"},aliasContract:{type:String,attribute:"alias-contract"},orderId:{type:String,attribute:"order-id"},dateSelected:{type:String,attribute:"date-selected"},localCustomProperties:{type:Object,attribute:"local-custom-properties"},customerId:{type:String,attribute:"customer-id"},publicSettingsId:{type:String,attribute:"public-settings-id"},publicSettingsKey:{type:String,attribute:"public-settings-key"},specificAmountsId:{type:Object,attribute:"specific-amounts-id"},fixNativeCalendar:{type:Boolean,attribute:"fix-native-calendar",reflect:!0},_isCancellation:{type:Boolean,attribute:"is-cancellation"},_contractNumber:{type:String},_issuerDataResponse:{type:Object},_calculateSharesData:{type:Object},_simulateResponseData:{type:Object},_createOrderResponse:{type:Object},_appSettingResponse:{type:Object},_cancelOrderResponse:{type:Object},_cancelModalVisible:{type:Boolean},_cancelReceiptVisible:{type:Boolean},_tradingErrorKey:{type:String},_orderDetailBtn:{type:Boolean},_errorCreatedOrderModalVisible:{type:Boolean},_cancelOrderId:{type:String},_errorModalConfig:{type:Object},_simulationErrorResponse:{type:String},_customerEmail:{type:String},_availableBalance:{type:Object},gmtTime:{type:Number,attribute:"gmt-time"}}}static get styles(){return[Ds,Os,o("trading-stocks-purchase-and-sale-shared-styles")]}constructor(){super(),this.config={loader:!0},this.country="",this.requiredToken="",this.aliasContract="",this.privateBankingPortfolioId="",this.issuingEntity={},this.orderTypeList=[],this.operationType="",this._customerEmail="",this.dateSelected=mt(),this.assetId="",this.purchaseOrSale="",this.assetNumberTypeId="",this.orderId="",this.customerId="",this.localCustomProperties={},this.specificAmountsId={dayPerformancePercent:"dayPerformancePercent",lastPrice:"lastPrice",tendency:"tendency",volumePrice:"volumePrice",salePrice:"salePrice",purchasePrice:"purchasePrice"},this._contractNumber="",this._createOrderRetryBody={},this._availableBalance={},this._cancelOrderId="",this.initTrading=!1,this.isPurchase=!1,this._isCancellation=!1,this.visibleModal=!1,this._orderDetailBtn=!1,this._cancelModalVisible=!1,this._cancelReceiptVisible=!1,this._errorCreatedOrderModalVisible=!1,this._issuerDataResponse={},this._calculateSharesData={},this._simulateResponseData={},this._createOrderResponse={},this._cancelOrderResponse={},this._appSettingResponse={},this._tradingErrorKey="",this._errorModalConfig={},this._simulationErrorResponse="",this.appSettingsApiVersion="0",this.orderSimulationApiVersion="0",this.investmentDetailApiVersion="0",this.calculateSharesTransactionMarginApiVersion="0",this.createOrderApiVersion="0",this.customerContactDetailsApiVersion="0",this.privateBankingPortfolioApiVersion="0",this.gmtTime=0}update(e){super.update(e),e.has("initTrading")&&this.initTrading&&this._requestSettings()}updated(e){if(super.updated(e),e.has("_availableBalance")&&Object.keys(this._appSettingResponse).length){var t,s;this.isPurchase&&(null===(t=this._availableBalance)||void 0===t?void 0:t.amount)<(null===(s=this._appSettingResponse)||void 0===s?void 0:s.minimumAmountToInvest)&&this._manageSimulationError("insufficientFunds")}}updateDateCalendarMultistep(e){if(this.native){this.shadowRoot.querySelector("#trading-multi-step").updateDataCalendar({detail:{value:e}})}}_setIssuingEntity(e){this.issuingEntity={...e},this.isPurchase=null==e?void 0:e.buy,this.operationType=this.isPurchase?"PURCHASE":"SALE",this._isCancellation=(null==e?void 0:e.cancel)??!1}async _requestSettings(){var e;(this.showLoader(),this.dateSelected=mt(),this._setIssuingEntity(this.issuingEntity),this.requestUpdate(),await this.updateComplete,this._isCancellation)?(this.orderId=null===(e=this.issuingEntity)||void 0===e?void 0:e.orderId,this._dataManager.getOrderDataDm(this.orderId)):this._requestPurchaseAndSaleSettings()}async _requestPurchaseAndSaleSettings(){this._dataManager.requestPublicSettingsDm(),this._dataManager.getInvestmentDetailDataDm(this.issuerId),this._requestCalculateShares(),this._requestPrivateBankingPortfolio(),this._requestCustomerEmail(),this.visibleModal=!0}_requestCalculateShares(){var e,t;this.isPurchase?(this.purchaseOrSale=this.purchaseOrSale?this.purchaseOrSale:"PURCHASE",this._dispatchCustomEvent("trading-stocks-purchase-and-sale-purchase-operative-initialize")):(this.purchaseOrSale=this.purchaseOrSale?this.purchaseOrSale:"SALE",this._dispatchCustomEvent("trading-stocks-purchase-and-sale-sale-operative-initialize")),this.calculateTransactionMarginBody={operationType:{id:this.purchaseOrSale},asset:{id:this.assetId,name:null===(e=this.issuingEntity)||void 0===e?void 0:e.name,number:null===(t=this.issuingEntity)||void 0===t?void 0:t.description,numberType:{id:this.assetNumberTypeId}}},this._dataManager.getCalculateSharesTransactionMarginDataDm(this.calculateTransactionMarginBody)}get nameAndDescription(){const{name:e,description:t}=this.issuingEntity??{};return`${e} ${t}`}get issuerId(){var e;return null===(e=this.issuingEntity)||void 0===e?void 0:e.issuerId}get _dataManager(){return this.shadowRoot.querySelector("#trading-stocks-purchase-and-sale-dm")}async _handleGetAppSettingstDetailResponse({detail:e}){this._appSettingResponse=await e}async _handleGetInvestmentDetailResponse({detail:e}){this._issuerDataResponse=await e}async _handleCalculateSharesResponse({detail:e}){this._availableBalance=null==e?void 0:e.transactionMarginAmount,this._calculateSharesData=await e,this.requestUpdate(),await this.updateComplete}async _handleOrderSimulationResponse({detail:e}){this._orderDetailBtn=!0,this._simulateResponseData=await e,this.requestUpdate(),await this.updateComplete}async _handleOrdersCreateResponse({detail:e}){this._createOrderResponse=await e,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-create-order-respond",e),this.requestUpdate(),this.clearLoader(),await this.updateComplete}async _handleCancelOrderResponse({detail:e}){this._cancelOrderResponse=await e,this._cancelReceiptVisible=!0,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-cancel-order-respond",{orderId:this.orderId,detail:e}),this.requestUpdate(),this.clearLoader(),await this.updateComplete}async _handleGetOrderResponse({detail:e}){var t,s;this._orderDetailData=await e,this._cancelModalVisible=!0,this.requestUpdate(),this.clearLoader(),await this.updateComplete,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-sale-cancel-operative",{titlesQuantity:null===(t=this._orderDetailData)||void 0===t||null===(s=t.title)||void 0===s?void 0:s.pendingQuantity})}_requestPrivateBankingPortfolio(){this._dataManager.getPrivateBankingPortfoliosDataDm()}async _handlePrivateBankingPorfoliosResponse({detail:e}){var t;this.aliasContract=null!=e&&e.alias?e.alias:this.aliasContract,this._contractNumber=(null==e||null===(t=e.number)||void 0===t?void 0:t.slice(-4))??this._contractNumber,this.requestUpdate(),await this.updateComplete}_requestCustomerEmail(){this._dataManager.getCustomerContactDetailsDataDm(this.customerId)}async _handleGetCustomerContactDetailsResponse({detail:e}){this._customerEmail=this._getEmailAddress(e),this.clearLoader(),await this.updateComplete}_getEmailAddress(e){for(const t of e)if("EMAIL"===t.contact.contactDetailType)return t.contact.address;return""}_manageCreateOrderError(e){const t=e.toUpperCase().replace(/-/g,"_"),s={...Xe,id:t};this._errorModalConfig=It(s),this._errorCreatedOrderModalVisible=!0,this._cancelModalVisible=!1,this.clearLoader()}_manageSimulationError(e){this._tradingErrorKey="SIMULATION_ERROR",this._simulationErrorResponse=e,this._orderDetailBtn=!1,this.clearLoader()}_reset(){this.aliasContract="",this._contractNumber="",this._availableBalance={},this.privateBankingPortfolioId="",this.issuingEntity={},this.operationType="",this._customerEmail="",this.dateSelected=mt(),this.assetId="",this.purchaseOrSale="",this.assetNumberTypeId="",this.orderId="",this._createOrderRetryBody={},this._cancelOrderId="",this.initTrading=!1,this.isPurchase=!1,this.visibleModal=!1,this._isCancellation=!1,this._orderDetailBtn=!1,this._errorCreatedOrderModalVisible=!1,this._cancelModalVisible=!1,this._cancelReceiptVisible=!1,this._issuerDataResponse={},this._calculateSharesData={},this._simulateResponseData={},this._createOrderResponse={},this._tradingErrorKey=""}get _renderCancelOperative(){return e`
      <cancel-modal
        language="${this.language}"
        ?visible=${this._cancelModalVisible}
        .modalConfig=${At(null==nt?void 0:nt.modalConfig)}
        .orderDetailData=${this._orderDetailData}
        @trading-stocks-purchase-and-sale-cancel-order-confirm=${e=>{this.showLoader(),this._cancelOrderId=e.detail,this._dataManager.getCancelOrderDataDm(e.detail)}}
        @trading-stocks-purchase-and-sale-cancel-order-modal-close-no-confirm=${()=>{this.initTrading=!1,this._cancelModalVisible=!1,this._dispatchCustomEvent("trading-stocks-purchase-and-sale-exit-operative")}}
      >
      </cancel-modal>
    `}get _renderCancelReceipt(){return e`
      <cancel-receipt-modal
        language="${this.language}"
        ?visible=${this._cancelReceiptVisible}
        .modalConfig=${Rt(lt)}
        .orderDetailData=${this._orderDetailData}
        .cancelOrderResponse=${this._cancelOrderResponse}
        @trading-stocks-purchase-and-sale-cancel-receipt-modal-close=${({detail:e})=>{this._reset(),this._dispatchCustomEvent("trading-stocks-purchase-and-sale-exit-cancel-operative",e)}}
      >
      </cancel-receipt-modal>
    `}get _renderCreatedOrderError(){return e`
      <created-order-error-modal
        ?visible=${this._errorCreatedOrderModalVisible}
        .errorModalConfig=${this._errorModalConfig}
        @trading-stocks-purchase-and-sale-navigation-purchase-and-sale-go-back=${this._reset}
        @trading-stocks-purchase-and-sale-create-order-error-modal-close=${e=>{this._errorCreatedOrderModalVisible=!1,"CANCEL_ORDER"===(null==e?void 0:e.detail)&&(this._cancelModalVisible=!0),"CREATE_ORDER"===(null==e?void 0:e.detail)&&(this.visibleModal=!0)}}
      >
      </created-order-error-modal>
    `}get _renderMultiStep(){return e`
      <trading-multi-step
        id="trading-multi-step"
        ?native="${this.native}"
        language="${this.language}"
        .visibleModal="${this.visibleModal}"
        .specificAmountsId="${this.specificAmountsId}"
        .isPurchase="${this.isPurchase}"
        .operationType="${this.operationType}"
        .issuingEntity="${this.issuingEntity}"
        .aliasContract="${this.aliasContract}"
        .availableBalance="${this._availableBalance}"
        .customerEmail="${this._customerEmail}"
        .orderTypeList="${this.orderTypeList}"
        .privateBankingPortfolioId="${this.privateBankingPortfolioId}"
        .contractNumber="${this._contractNumber}"
        .calculateSharesData="${this._calculateSharesData}"
        .simulateResponseData="${this._simulateResponseData}"
        .simulationErrorResponse="${this._simulationErrorResponse}"
        .createOrderResponse="${this._createOrderResponse}"
        .errorKey="${this._tradingErrorKey}"
        .appSettingResponse="${this._appSettingResponse}"
        .issuerDataResponse="${this._issuerDataResponse}"
        .orderDetailBtn="${this._orderDetailBtn}"
        .selectedDate="${this.dateSelected}"
        .fixNativeCalendar="${this.fixNativeCalendar}"
        .gmtTime="${this.gmtTime}"
        @trading-stocks-purchase-and-sale-edit-step-request=${()=>{this._orderDetailBtn=!1,this._simulateResponseData={}}}
        @trading-stocks-purchase-and-sale-get-order-simulation-body-book-respond=${e=>{this._tradingErrorKey="",this._dataManager.getOrderSimulationDataDm(e.detail)}}
        @trading-stocks-purchase-and-sale-get-order-simulation-body-conditioned-respond=${e=>{this._tradingErrorKey="",this._dataManager.getOrderSimulationDataDm(e.detail)}}
        @trading-stocks-purchase-and-sale-create-order-respond=${e=>{this._tradingErrorKey="",this.visibleModal=!1,this._createOrderRetryBody=e.detail,this.showLoader(),this._dataManager.getCreatedOrderDataDm(e.detail)}}
        @trading-stocks-purchase-and-sale-receipt-close=${()=>{this._dispatchCustomEvent("trading-stocks-purchase-and-sale-exit-operative"),this._reset()}}
        @trading-stocks-purchase-and-sale-navigation-purchase-and-sale-go-back=${()=>{this._reset()}}
      ></trading-multi-step>
    `}get _tplDM(){var t;return e`
      <trading-stocks-purchase-and-sale-dm
        id="trading-stocks-purchase-and-sale-dm"
        host="${this.host}"
        language="${this.language}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        .isPurchase="${this.isPurchase}"
        .privateBankingPortfolioId="${this.privateBankingPortfolioId}"
        .issuerId="${null===(t=this.issuingEntity)||void 0===t?void 0:t.issuerId}"
        .issuerNameAndDescription="${this.nameAndDescription}"
        .localCustomProperties="${this.localCustomProperties}"
        .customerId="${this.customerId}"
        .orderSimulationApiVersion="${this.orderSimulationApiVersion}"
        .investmentDetailApiVersion="${this.investmentDetailApiVersion}"
        .calculateSharesTransactionMarginApiVersion="${this.calculateSharesTransactionMarginApiVersion}"
        .createOrderApiVersion="${this.createOrderApiVersion}"
        .appSettingsApiVersion="${this.appSettingsApiVersion}"
        .privateBankingPortfolioApiVersion="${this.privateBankingPortfolioApiVersion}"
        .customerContactDetailsApiVersion="${this.customerContactDetailsApiVersion}"
        public-settings-host="${this.publicSettingsHost}"
        public-settings-id="${this.publicSettingsId}"
        public-settings-key="${this.publicSettingsKey}"
        public-settings-required-token="${this.publicSettingsRequiredToken}"
        @trading-stocks-purchase-and-sale-app-settings-respond=${this._handleGetAppSettingstDetailResponse}
        @trading-stocks-purchase-and-sale-dm-get-investment-detail-respond=${this._handleGetInvestmentDetailResponse}
        @trading-stocks-purchase-and-sale-get-calculate-shares-respond=${this._handleCalculateSharesResponse}
        @trading-stocks-purchase-and-sale-get-order-simulation-respond=${this._handleOrderSimulationResponse}
        @trading-stocks-purchase-and-sale-get-create-order-respond=${this._handleOrdersCreateResponse}
        @trading-stocks-purchase-and-sale-get-private-banking-portfolios-respond=${this._handlePrivateBankingPorfoliosResponse}
        @trading-stocks-purchase-and-sale-customer-contact-details-respond=${this._handleGetCustomerContactDetailsResponse}
        @trading-stocks-purchase-and-sale-dm-api-dm-create-order-error=${e=>this._manageCreateOrderError(e.detail)}
        @trading-stocks-purchase-and-sale-dm-api-dm-simulation-error=${e=>this._manageSimulationError(e.detail)}
        @trading-stocks-purchase-and-sale-dm-api-dm-cancel-order-error=${e=>this._manageCreateOrderError(e.detail)}
        @trading-stocks-purchase-and-sale-get-order-respond=${this._handleGetOrderResponse}
        @trading-stocks-purchase-and-sale-cancel-respond=${this._handleCancelOrderResponse}
      ></trading-stocks-purchase-and-sale-dm>
    `}render(){return e`${super.render()} ${this._tplDM}
    ${this._isCancellation?e` ${this._renderCancelOperative} ${this._renderCancelReceipt} `:this._renderMultiStep}
    ${this._renderCreatedOrderError}`}}customElements.define("trading-stocks-purchase-and-sale",zi);customElements.define("bbva-analyticmanager-trading",class extends r{static get is(){return"bbva-analyticmanager-trading"}static get properties(){return{counter:{type:Number},counterCpmmission:{type:Number},counterCompletePurchase:{type:Number},counterStarted:{type:Number},counterCalendar:{type:Number},counterStepThree:{type:Number},counterCompleteSales:{type:Number},tipology:{type:String},gender:{type:String},cancelTitleQuantity:{type:Number}}}constructor(){super(),this.cancelTitleQuantity=0,this.counter=0,this.counterCalendar=0,this.counterComission=0,this.counterCompletePurchase=0,this.counterCompleteSales=0,this.counterStarted=0,this.counterStepThree=0,this.gender="",this.isPurchase=null,this.tipology=""}reset(){this.cancelTitleQuantity=0,this.counter=0,this.counterCalendar=0,this.counterComission=0,this.counterCompletePurchase=0,this.counterCompleteSales=0,this.counterStarted=0,this.counterStepThree=0}loginSuccess(e){this.gender=e.gender.name.toLowerCase()}tradingStocksPurchaseAppPageVisit(){this._dispatchCustomEvent("trading-stocks-purchase-app-page-visit",{gender:this.gender})}tradingStocksPurchaseAppStarted(e){let t="";t="BOOK"===e?"limitada":"condicionada",0===this.counterStarted&&(this._dispatchCustomEvent("trading-stocks-purchase-started",t),this.counterStarted+=1)}tradingStocksPurchaseAndSaleAppStepSelection({orderSelected:e,step:t}){"orderType"===t.id&&(this.tipology=e.label.toLowerCase(),t.purchase&&(0===this.counter&&this._dispatchCustomEvent("trading-stocks-purchase-step-selection",this.tipology),this.counter+=1),t.purchase||(0===this.counter&&setTimeout((()=>{this._dispatchCustomEvent("trading-stocks-sales-step-selection",this.tipology)}),1e3),this.counter+=1))}tradingStocksPurchaseAppStepConfirmation({purchase:e,orderAmount:t,currency:s,titleQuantity:i,commission:a}){e&&(0===this.counterStepThree&&this._dispatchCustomEvent("trading-stocks-purchase-step-confirmation-modal",{orderAmount:t,currency:s,titleQuantity:i,commission:a,tipology:this.tipology}),this.counterStepThree+=1),e||(0===this.counterStepThree&&this._dispatchCustomEvent("trading-stocks-sales-step-confirmation-modal",{orderAmount:t,currency:s,titleQuantity:i,commission:a,tipology:this.tipology}),this.counterStepThree+=1)}tradingStocksPurchaseAndSaleAppCompleted({totalPrice:e,title:t,otherAmountsTotal:s,operationFolio:i,operationType:a}){"PURCHASE"===a.id&&(0===this.counterCompletePurchase&&this._dispatchCustomEvent("trading-stocks-purchase-create-order-respond",{orderAmount:e.amount,currency:e.currency,titleQuantity:t.quantity,commission:s.amount,state:"contratado",operationFolio:i,tipology:this.tipology}),this.counterCompletePurchase+=1),"SALE"===a.id&&0===this.counterCompleteSales&&(this._dispatchCustomEvent("trading-stocks-sale-step-complete",{orderAmount:e.amount,currency:e.currency,titleQuantity:t.quantity,commission:s.amount,state:"finalizado",operationFolio:i,tipology:this.tipology}),this.counterCompleteSales+=1),this.reset()}tradingStocksPurchaseAppFootprintChangeValidity(e){e.purchase&&0===this.counterCalendar&&(this._dispatchCustomEvent("trading-stocks-purchase-calendar-open"),this.counterCalendar+=1),e.purchase||0===this.counterCalendar&&(this._dispatchCustomEvent("trading-stocks-sales-calendar-open"),this.counterCalendar+=1)}tradingStocksPurchaseAppFootprintCommission(e){e.purchase&&0===this.counterComission&&(this._dispatchCustomEvent("trading-stocks-purchase-info-modal-commission"),this.counterComission+=1),e.purchase||0===this.counterComission&&(this._dispatchCustomEvent("trading-stocks-sales-info-modal-commission"),this.counterComission+=1)}tradingStocksSaleAppPageVisit(){this._dispatchCustomEvent("trading-stocks-sales-app-page-visit")}tradingStocksSaleAppStarted({step:e}){"orderType"===e.id&&(e.purchase||this._dispatchCustomEvent("trading-stocks-sales-app-started"))}tradingStocksCancelAppPageVisit({titlesQuantity:e}){this.cancelTitleQuantity=e,this._dispatchCustomEvent("trading-stocks-cancel-page-visit",e)}tradingStocksCancelOrderConfirmAccept(){this._dispatchCustomEvent("trading-stocks-cancel-order-confirm",{confirm:"aceptar",titlesQuantity:this.cancelTitleQuantity})}tradingStocksCancelOrderLinkClickExit(){this._dispatchCustomEvent("trading-stocks-cancel-order-link-click",{confirm:"salir",titlesQuantity:this.cancelTitleQuantity})}tradingStocksCancelOrderCloseIconClickClose(){this._dispatchCustomEvent("trading-stocks-cancel-order-close-icon-click",{confirm:"cerrar",titlesQuantity:this.cancelTitleQuantity})}tradingStocksCancelAppCompleted(e){const t="BOOK"===e.detail.classification.id?"limitada":"condicionada",s=e.detail.operationFolio,i=e.detail.price.amount,{price:{currency:a},title:{quantity:r}}=e.detail;this._dispatchCustomEvent("trading-stocks-cancel-order-complete",{state:"finalizado",tipology:t,operationNumber:s,amountOperation:i,currency:a,quantity:r})}_dispatchCustomEvent(e,t=!0,s=!0,i=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:s,composed:i,detail:t,cancelable:!0}))}});var Gi=Object.freeze({__proto__:null});export{Ti as B,Ri as a,Li as b,Bi as c,Gi as d};
