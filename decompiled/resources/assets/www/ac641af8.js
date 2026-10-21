import"./fc15786a.js";import"./7936765e.js";import{aJ as e,t,aK as a,aL as i}from"./7f3d7ca9.js";import{L as s,aC as r,aX as n,a as o,bV as l,ak as c,h as m,i as p,aD as h,ah as d,aU as u,bW as b,aN as _,U as v,bT as y,R as g,bX as f,bI as I,ag as $}from"./952f98a9.js";import{B as D,a as x}from"./06acded6.js";import{C as P}from"./216055dc.js";import{b as C,B as S,a as A,c as E,d as k}from"./b42a85fd.js";import{b as w,B as T,a as V,c as O}from"./c3262640.js";import{B as N}from"./e32b4658.js";import{B}from"./1709aeaa.js";import{B as R}from"./59781be1.js";import{B as Y}from"./0efe7f4c.js";import"./c9f15469.js";import"./4dec7a01.js";import{B as M}from"./ca32b966.js";import"./0ef545a5.js";import"./111ad2c6.js";import{B as F}from"./e2fc8430.js";import{B as j}from"./7bf5357f.js";import{s as L,f as G}from"./b9888d0b.js";import"./99ab2e44.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./afb1d3bc.js";class U extends(j(s)){static get is(){return"credit-amount-validator"}static get properties(){return{minAmount:{type:Number,attribute:"min-amount"},maxAmount:{type:Number,attribute:"max-amount"},language:{type:String}}}constructor(){super(),this.minAmont=0,this.maxAmont=0,this.language=""}validate(e){const t=r(this.language),a=e.replace(new RegExp(`[^0-9${t}-]+`,"g"),""),i=this.minAmount<=Number(a)&&Number(a)<=this.maxAmount,s=Number(a)%1!=0,n=i&&!s;return this.dispatchEvent(new CustomEvent("credit-amount-validation",{bubbles:!0,composed:!0,detail:n})),n}}class q extends(j(s)){static get is(){return"down-payment-amount-validator"}static get properties(){return{minAmount:{type:Number,attribute:"min-amount"},maxAmount:{type:Number,attribute:"max-amount"},language:{type:String}}}constructor(){super(),this.minAmont=0,this.maxAmont=0,this.language=""}validate(e){const t=r(this.language),a=e.replace(new RegExp(`[^0-9${t}-]+`,"g"),""),i=this.minAmount<=Number(a)&&Number(a)<=this.maxAmount,s=Number(a)%1!=0,n=i&&!s;return this.dispatchEvent(new CustomEvent("down-payment-amount-validation",{bubbles:!0,composed:!0,detail:n})),n}}const H="completed",W="CONFIRM_EXIT",z="FIRST_PRIVACY",X="PRIVACY_NOTICE",J="TERMS_CONDITIONS",Q="CREDIT_BUREAU",Z="HITCH_MODAL",K="ANNUAL_FIXED",ee="COMMISSION_OPENNING",te="CAT_MODAL",ae="LIFE_INSURANCE",ie="VARIABLE_INCOME",se="expandable-multistep-all-complete",re="multistep-no-pre-approved-car-create-full-modal",ne="multistep-no-pre-approved-car-create-half-modal",oe="multistep-no-pre-approved-car-create-hitch-full-modal",le="multistep-no-pre-approved-car-create-commission-openning-full-modal",ce="multistep-no-pre-approved-hide-confirm-button",me="complete",pe="multistep-no-pre-approved-car-certificate-exit";class he extends(n(o(D(P(s))))){static get is(){return"bbva-multistep-no-pre-approved-car-certificate"}static get scopedElements(){const e=[S,A,T,V,N,O,B,v,t,R,Y,y,M,g,f,a,E,I,k,i,x,$,F,U,q];return he.scopedElementsFromClasses(e)}static get properties(){return{renderMultistep:{type:Boolean,attribute:"render-multistep"},loanCurrency:{type:String,attribute:"loan-currency"},currenciesFormat:{type:Object},previousStep:{type:Number},installmentsList:{type:Array},maxRangeTerms:{type:Number,attribute:"max-range-terms"},installment:{type:Number,attribute:"installment"},customerAge:{type:String,attribute:"customer-age"},customerEmail:{type:String,attribute:"customer-email"},customerPhoneNumber:{type:String,attribute:"customer-phone-number"},minTotalIncome:{type:Number,attribute:"min-total-income"},userDataOptions:{type:Object},_updatedField:{type:String},_hasInteraction:{type:Boolean},_isFirstTime:{type:Boolean},_carData:{type:Object},_ratesData:{type:Object},_hasPreownedCar:{type:Boolean},_maxCarPrice:{type:Number},_minCarPrice:{type:Number},_isCarPriceValid:{type:Boolean},_carPriceErrorMessage:{type:String},_maxDownPayment:{type:Number},_minDownPayment:{type:Number},_isDownPaymentValid:{type:Boolean},_downPaymentErrorMessage:{type:String},_creditAmount:{type:Number},_lifeInsurance:{type:Number},_commissionWithoutIva:{type:Number},_fixedRate:{type:Number},_catRate:{type:Number},_expirationDate:{type:String},_calculationDate:{type:String},_mensualAmount:{type:Number},_carDataBtnDisabled:{type:Boolean},_userData:{type:Object},_employeeType:{type:String},_hasVariableIncome:{type:Boolean},_showVariableIncomeField:{type:Boolean},_hideGrossIncome:{type:Boolean},_grossIncome:{type:Number},_isGrossIncomeEmpty:{type:Boolean},_isGrossIncomeValid:{type:Boolean},_variableIncome:{type:Number},_isVariableIncomeValid:{type:Boolean},_validateIncomeSum:{type:Boolean},_isTotalIncomeValid:{type:Boolean},_userDataBtnDisabled:{type:Boolean},_termsChecks:{type:Object},_termsCheckBoxes:{type:Array},_isTermsBtnEnabled:{type:Boolean},_carPriceInfo:{type:String},_downPaymentInfo:{type:String},_downPaymentAmount:{type:Number},_carPriceAmount:{type:Number,state:!0},_homeYearsErrorMessage:{type:String},_workingYearsErrorMessage:{type:String},_advisorySelectedOption:{type:Number},_variableIncomeSelectedOption:{type:Number},_isYearsInHomeInvalid:{type:Boolean},_isWorkingYearsInvalid:{type:Boolean},_variableIncomeAmount:{type:String},_grossIncomeAmount:{type:String},_hideStickyPayment:{type:Boolean,state:!0},showCallMeBack:{type:Boolean,attribute:"show-call-me-back"},_currentYear:{type:String},_preOwnedAvailableYears:{type:Number},_stepIncrease:{type:Number},_downPaymentPerYear:{type:Object}}}constructor(){super(),this._bindStepListeners(),this.renderMultistep=!1,this.loanCurrency="",this.currenciesFormat={style:"currency",currency:"USD"},this.previousStep=1,this.installmentsList=[],this.maxRangeTerms=0,this.installment=60,this.customerAge=0,this.customerEmail="",this.customerPhoneNumber="",this.minTotalIncome=6e3,this.userDataOptions={carTypes:{NUEVO:"Nuevo",SEMINUEVO:"Seminuevo"},advisoryTypes:{SI:"Sí recibí",NO:"No recibí"},educationOptions:{"0/SIN ESTUDIOS":"Sin estudios","1/PRIMARIA":"Primaria","2/SECUNDARIA":"Secundaria","3/PREPARATORIA":"Preparatoria","4/UNIVERSIDAD":"Universidad","5/POSTGRADO":"Posgrado"},residenceOptions:{"R/RENTA":"Rentada","D/DÑO C/HIPOTECA":"Hipoteca","F/VIVE CON FAMS":"Vive con familiares","P/PROPIO":"Propia","X/OTROS":"Otros"},employmentOptions:{"1482/FIJO":"Empleado","1484/INDEPENDIENTE":"Independiente"},companyTypeOptions:{"1616/PRIVADA":"Privada","1615/PUBLICA":"Pública"},economicActivityOptions:{"1H/CONSTRUCCION/CEMENTO":"Construcción","1I/ALIMENTACION/BEBIDA":"Alimentos y bebidas","2A/ADMINISTRACION PUBLI":"Dependencia de gobierno","2B/EJERCITO/POLICIA/CUE":"Policía o ejército","2D/SANIDAD/SALUD/SERVIC":"Sector salud","2E/ENSENANZA/EDUCACION":"Educación","2F/BANCA/FINANZAS/SEGUR":"Banca o seguros","2R/AGENCIA DE VIAJES/TU":"Turismo","2T/OTROS":"Otros"}},this._updatedField="",this._hasInteraction=!1,this._isFirstTime=!0,this._carData={loanAmount:{value:"",amount:!0},carType:{value:"NUEVO",text:"Nuevo"},carYear:{value:""},mensualAmount:{value:"",amount:!0},carPrice:{value:"0",amount:!0},downPayment:{value:"0",amount:!0},paymentTerm:{value:"0",valueDescription:"meses"},lifeInsurance:{value:"2160",amount:!0}},this._ratesData={fixedRate:{value:"",highlight:!0},commission:{value:"",amount:!0},cat:{value:"",highlight:!0,valueDescription:"sin IVA"},lifeInsurance:{value:"",amount:!0}},this._hasPreownedCar=!1,this._maxCarPrice=1e6,this._minCarPrice=8e4,this._isCarPriceValid=!0,this._carPriceErrorMessage="",this._maxDownPayment=8e4,this._minDownPayment=1e4,this._isDownPaymentValid=!0,this._downPaymentErrorMessage="",this._creditAmount=0,this._lifeInsurance=0,this._commissionWithoutIva=0,this._fixedRate=0,this._catRate=0,this._expirationDate="",this._calculationDate="",this._mensualAmount=0,this._carDataBtnDisabled=!1,this._userData={educationLevel:{employeeType:"Empleado",value:""},houseType:{employeeType:"Empleado",value:""},yearsInHome:{employeeType:"Empleado",value:"",valueDescription:this.t("npa-car-loan-years-label")},employeeType:{employeeType:"Empleado",value:""},workingYears:{employeeType:"Empleado",value:"",valueDescription:this.t("npa-car-loan-years-label")},companyType:{employeeType:"Empleado",value:""},companySector:{employeeType:"Empleado",value:""},grossIncome:{employeeType:"Independiente",value:"",amount:!0},hasVariableIncome:{employeeType:"Independiente",value:"",discard:!0},variableIncome:{employeeType:"Empleado",value:"",amount:!0},hadAdvisory:{employeeType:"Empleado",value:""}},this._employeeType="",this._hasVariableIncome=!1,this._showVariableIncomeField=!1,this._hideGrossIncome=!1,this._grossIncome=0,this._isGrossIncomeEmpty=!0,this._isGrossIncomeValid=!0,this._variableIncome=0,this._isVariableIncomeValid=!0,this._validateIncomeSum=!0,this._isTotalIncomeValid=!1,this._userDataBtnDisabled=!0,this._termsChecks={1:!1,2:!1},this._termsCheckBoxes=[{id:"creditBureauHistoryCheck",name:"creditBureauHistoryCheck",value:"1",label:"no-pre-approved-car-certificate-check-1"},{id:"personalDataPrivacyCheck",name:"personalDataPrivacyCheck",value:"2",label:"no-pre-approved-car-certificate-check-2"}],this._isTermsBtnEnabled=!1,this._carPriceInfo="no-pre-approved-car-certificate-configuration-price-car",this._downPaymentInfo="no-pre-approved-car-certificate-configuration-price-hitch",this._variableIncomeAmount="",this._grossIncomeAmount="",this._homeYearsErrorMessage="",this._workingYearsErrorMessage="",this._advisorySelectedOption=-1,this._variableIncomeSelectedOption=-1,this._isYearsInHomeInvalid=!1,this._isWorkingYearsInvalid=!1,this._hideStickyPayment=!1,this._downPaymentAmount=0,this._carPriceAmount=0,this.showCallMeBack=!1,this._currentYear="",this._preOwnedAvailableYears=0,this._stepIncrease=12,this._downPaymentPerYear={}}static get styles(){return[l,C.dark,e.dark,w.light,L,c("bbva-multistep-no-pre-approved-car-certificate-shared-styles")]}get _steps(){const e=this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]');return Array.from(e.querySelectorAll('[data-tag-name="bbva-expandable-step"]'))}clearFormControls(){this._hasPreownedCar=!1,this._carDataBtnDisabled=!1,this._updatedField="",this._hasInteraction=!1,this._hasVariableIncome=!1,this._grossIncome=0,this._variableIncome=0,this._userDataBtnDisabled=!0,this._isTermsBtnEnabled=!1,this._isCarPriceValid=!0,this._isDownPaymentValid=!0,this._showVariableIncomeField=!1,this._hideGrossIncome=!1,this._isGrossIncomeValid=!0,this._isGrossIncomeEmpty=!0,this._isVariableIncomeValid=!0,this._validateIncomeSum=!0,this._isTotalIncomeValid=!1,this.maxRangeTerms=60,this.installment=60,this._advisorySelectedOption=-1,this._variableIncomeSelectedOption=-1,this._variableIncomeAmount="",this._grossIncomeAmount="",this._isYearsInHomeInvalid=!1,this._isWorkingYearsInvalid=!1,this.installmentsList=[],this._hideStickyPayment=!1}validateExitConfirmation(){this._hasInteraction?(G(this,ce,!0),G(this,ne,W)):this.resetAndCloseNoPreApprovedCarValidation()}openStep(e){this._steps[e].completed=!1}toggleDisableStep(e,t){this._steps[e].disabled=t}resetAndCloseNoPreApprovedCarValidation(){this._restoreLocalProps(),G(this,pe,!0)}resetNoPreApprovedCarValidation(){this._restoreLocalProps(),G(this,pe,!1)}handleStepStateChange({index:e,type:t}){const a=this.previousStep>e?this.previousStep:e+1;G(this,"call-me-back-analytics-manage-step",""+("step-complete"===t?`${a}`:`${e}`)),this.previousStep=a,this._toggleMainHeader(e,t),this._toggleStepSummaryPadding(e,t),2===e&&"step-edit"===t&&this._onUserDataStepEdit()}dismissCloseNoPreApprovedCarAlert(){3===this._countStepsWithProperty(H)&&G(this,ce,!1)}showCallMeBackFlag(e){var t;const a=null===(t=e["glomo.widgetcallmeback.ocCarLoanNPA"])||void 0===t?void 0:t.value;this.showCallMeBack=a,G(this,"npa-car-loan-show-call-me-back-flag-value",a)}setSharedCommonData(e){this._currentYear=e.currentYear,this._preOwnedAvailableYears=e.preOwnedAvailableYears,this.installmentsList=e.availableInstallments,this._stepIncrease=e.stepIncrease,this._carPriceAmount=e.carPrice,this._downPaymentAmount=e.downPayment,this._carData.carYear.value=e.currentYear,this._carData.carPrice.value=e.carPrice,this._carData.downPayment.value=e.downPayment,this._downPaymentPerYear=e.downPaymentPerYear,this._minDownPayment=e.downPaymentPerYear[e.currentYear].min*e.carPrice,this._maxDownPayment=e.downPaymentPerYear[e.currentYear].max*e.carPrice}_restoreStepsInitialState(){this._steps.forEach(((e,t)=>this.openStep(t))),this._steps.forEach(((e,t)=>this.toggleDisableStep(t,!0))),this.toggleDisableStep(0,!1)}_bindStepListeners(){this.addEventListener(se,(({detail:e})=>{G(this,ce,!e)}))}_countStepsWithProperty(e){return Array.from(this._steps).reduce(((t,a)=>t+(a[e]?1:0)),0)}_restoreLocalProps(){this._resetCarData(),this._clearUserData(),this._restoreStepsInitialState(),this.clearFormControls(),this.renderMultistep=!1,this.previousStep=1}_resetCarData(){this._carData={loanAmount:{value:"",amount:!0},carType:{value:"NUEVO",text:"Nuevo"},carYear:{value:""},mensualAmount:{value:"",amount:!0},carPrice:{value:"0",amount:!0},downPayment:{value:"0",amount:!0},paymentTerm:{value:"0",valueDescription:"meses"},lifeInsurance:{value:"2160",amount:!0}}}_clearUserData(){Object.keys(this._userData).forEach((e=>{this._userData[e].value="",delete this._userData[e].text}))}updateQuoteData(e){this._minCarPrice=e.good.detail.marketValues[0].amount,this._maxCarPrice=e.good.detail.marketValues[1].amount,this._carData.paymentTerm.value=e.installmentPlan.terms.number,this._creditAmount=e.requestedAmount.amount,this._lifeInsurance=e.additionalProducts[1].amount.amount,this._fixedRate=he._getMerchantRate(e.rates,"TIN").rateUnit.percentage,this._commissionWithoutIva=e.fees.itemizeFees[0].feeAmount.amount,this._catRate=he._getMerchantRate(e.rates,"CAT").rateUnit.percentage;const t=he._getMerchantRate(e.rates,"CAT").calculationDate;this._calculationDate=new Date(t).toLocaleDateString("es",{year:"numeric",month:"long",day:"numeric"});const a=he._getMerchantRate(e.rates,"CAT").expirationDate;this._expirationDate=new Date(a).toLocaleDateString("es",{year:"numeric",month:"long",day:"numeric"}),this._mensualAmount=e.installmentPlan.installmentAmount.amount,this._carData.loanAmount.value=this._creditAmount,this._carData.mensualAmount.value=this._mensualAmount,this._carData.lifeInsurance.value=this._lifeInsurance,this._ratesData.fixedRate.value=`${this._fixedRate}%`,this._ratesData.commission.value=this._commissionWithoutIva,this._ratesData.cat.value=`${this._catRate}%`,this._ratesData.lifeInsurance.value=this._lifeInsurance;const i={interestRate:this.fixedRate,serviceCharge:this.mensualAmount,loanLife:this.lifeInsurance};G(this,"analytics-loan-rate-event",i)}static _getMerchantRate(e,t){return e.filter((e=>e.rateType.id===t))[0]}_stepCompletedHandler({target:e}){this._hasInteraction=!0,G(e,me)}_fireCompletedStepEvent(e,t){const a={1:this._carData,2:this._userData,3:""},i={1:"car-form",2:"user-form",3:"terms"};e&&e.detail&&(G(this,`multistep-no-pre-approved-car-step-${i[t]}-completed`,a[t]),G(this,"npa-car-loan-step-change",{index:t,type:"step-complete"}),G(this,"analytics-manage-step",t),1===t?(this._handleStepPaddingX("remove",0),G(this,"multistep-npa-car-loan-rates-data",this._ratesData)):3===t&&this._handleStepPaddingX("set",2))}_editStepEvent(e){G(this,"npa-car-loan-step-change",{index:e,type:"step-edit"}),3===e?this._handleStepPaddingX("remove",2):1===e&&this._handleStepPaddingX("set",0)}_handleStepPaddingX(e,t){"set"===e?(this._steps[t].setAttribute("hide-padding-right",""),this._steps[t].setAttribute("hide-padding-left","")):(this._steps[t].removeAttribute("hide-padding-right"),this._steps[t].removeAttribute("hide-padding-left"))}_renderContinueButton(e,t,a){return m`
      <div class="step-button-container">
        <bbva-button-default class="btnContinue"
          id="${p(e)}"
          ?disabled="${this[t]}"
          text="${this.t("no-pre-approved-car-certificate-continue-button-label")}"
          variant="${1===a?"positive":"default"}"
          @click="${this._stepCompletedHandler}">
        </bbva-button-default>
      </div>
      <bbva-panel-button-fixed
        sticky
        button-disabled
        class="callmeBack"
        footer-link="${this.t("npa-car-loan-call-consultant")}"
        ?show="${this.showCallMeBack}"
        @click="${()=>{G(this,"npa-car-loan-open-call-me-back-from-sticky",!0)}}"
        >
      </bbva-panel-button-fixed>
    `}_toggleMainHeader(e,t){let a=e;if(1===a){a-=1;const e=this._steps[a];"step-complete"===t?e.setAttribute("header",this.t("no-pre-approved-car-certificate-promotion-information-general-title")):e.removeAttribute("header")}}_onUserDataStepEdit(){this._userDataBtnDisabled=!0,this._userData.hadAdvisory.value="",this._advisorySelectedOption=-1}_toggleStepSummaryPadding(e,t){const a=e-2;a>=0&&("step-complete"===t?this._steps[a].setAttribute("hide-padding-bottom",""):this._steps[a].removeAttribute("hide-padding-bottom"))}_renderExpandableStep(e,t,a,i,s,r=!1,n,o){return m`
      <bbva-expandable-step
        header="${t}"
        class="step"
        hide-divider="true"
        disabled-target=".action"
        edit-label="${s}"
        total-steps="3"
        step="${e}"
        @expandable-step-complete-change="${t=>this._fireCompletedStepEvent(t,e)}"
        @expandable-step-edit-step="${()=>this._editStepEvent(e)}"
        ?hide-padding-right="${1===e}"
        ?hide-padding-left="${1===e}"
        hide-padding-top>
        <div class="step-content">
          ${a}
          ${r?this._renderContinueButton(n,o,e):null}
        </div>
        <div class="step-summary" slot="summary">
          ${i}
        </div>
      </bbva-expandable-step>
    `}static _parseEvent(e){return e.detail?{value:e.detail.value?e.detail.value.toString():e.detail.value,name:e.target.name}:e.target}static _eventForRegister(e,t){return{target:{name:e,value:t}}}static _isMinAmountValid(e,t){return e>=t}_onDataInput(e,t){const a={carYear:this._validateCarYear,carPrice:this._handlePriceCar,downPayment:this._handleDownPayment,carType:this._handleTypeCarRadioChange,paymentTerm:this._handleRange,yearsInHome:this._validateYearsInHome,workingYears:this._validateWorkingYears,employeeType:this._handleEmployeeTypeChange,grossIncome:this._handleIncomeInput,hasVariableIncome:this._handleVariableIncomeChange,variableIncome:this._handleIncomeInput,hadAdvisory:this._handleAdvisoryOptionsChange},i=he._parseEvent(e);"_carData"===t&&G(this,"data-step-started-type-analytics","carType"===(null==i?void 0:i.name)?null==i?void 0:i.value:null==i?void 0:i.name),a[i.name]?a[i.name].apply(this,[e]):this._registerData(e,t)}_registerData(e,t,a=!1){let i={};Object.keys(this.userDataOptions).forEach((e=>{i={...i,...this.userDataOptions[e]}}));const s=he._parseEvent(e),r=s.value!==this[t][s.name].value;!this._isFirstTime&&r&&(this._hasInteraction=!0),this._isFirstTime=!1,this[t]={...this[t],[s.name]:{...this[t][s.name],value:s.value}},i[s.value]&&(this[t][s.name].text=i[s.value]);const n=this._validateData(this[t],t);"_carData"!==t||""===s.value||!r||n||a||this._updateMerchantData(s.name,this._carData),this[{_userData:"_userDataBtnDisabled",_carData:"_carDataBtnDisabled"}[t]]=n}_updateMerchantData(e,t){this._updatedField=e,G(this,"merchant-options-installments-data-updated",{updatedField:e,data:t})}_validateData(e,t){const a=Object.keys(e);let i,s=!1;return i="_userData"===t?this._validateUserDataCase(e,a):this._validateCarDataCase(a),s=i.every((t=>""!==e[t].value)),!s}_renderCarYearInput(){const e=Number(this._currentYear)-1;return m`
      <bbva-form-select id="carYear"
        name="carYear"
        class="form-loan__field form-loan__field--select"
        required=""
        label="Año"
        @change="${e=>this._onDataInput(e,"_carData")}"
        label-out="${this.t("no-pre-approved-car-certificate-label-out-years")}">
        ${Array(this._preOwnedAvailableYears).fill(0).map(((t,a)=>m`<bbva-form-option value="${e-a}">${e-a}</bbva-form-option>`))}
      </bbva-form-select>
    `}_handleTypeCarRadioChange(e){let t=this._currentYear;1===e.detail.selected?(this._hasPreownedCar=!0,t-=1):this._hasPreownedCar=!1,this._carData.carYear.value=t.toString(),this._carData.downPayment.value="0",this._registerData(e,"_carData",!0),this._triggerDownPaymentValidation()}_triggerDownPaymentValidation(e=!1){var t,a;const i=null===(t=this._carData)||void 0===t||null===(a=t.carYear)||void 0===a?void 0:a.value;this._isCarPriceValid&&i&&(this._minDownPayment=this._downPaymentPerYear[i].min*Number(this._carPriceAmount),this._maxDownPayment=this._downPaymentPerYear[i].max*Number(this._carPriceAmount),this._handleDownPayment({target:{name:"downPayment",amount:this._downPaymentAmount,cancel:e}}))}get _listConsiderations(){return[this.t("no-pre-approved-car-certificate-considerations-bullet-1"),this.t("no-pre-approved-car-certificate-considerations-bullet-2"),this.t("no-pre-approved-car-certificate-considerations-bullet-3")]}_renderOfferDetailSummary(e){return m`
    <bbva-list-simple 
      class="no-margin-x" 
      ambient="dark"
      hide-padding-top
      hide-padding-bottom
      label="${this.t("no-pre-approved-car-certificate-credit-amount-text")}"
      language="${this.language}">
    </bbva-list-simple>
    <bbva-amount
      ambient="dark"
      currency-code="${this.loanCurrency}"
      local-currency="${this.loanCurrency}"
      amount="${this._creditAmount}"
      variant="4xl">
    </bbva-amount>
    <hr divider="small">
    <bbva-list-simple
      class="step-summary__item no-margin-x"
      ambient="dark"
      description="${this._hasPreownedCar?this.t("no-pre-approved-car-certificate-type-car-2"):this.t("no-pre-approved-car-certificate-type-car-1")}"
      label="${this.t("no-pre-approved-car-certificate-collapsed-type-car")}">
    </bbva-list-simple>
    <bbva-list-simple
      ?hidden="${!this._hasPreownedCar}"
      class="step-summary__item no-margin-x"
      ambient="dark"
      description="${e.carYear.value}"
      label="${this.t("no-pre-approved-car-certificate-collapsed-year-car")}">
    </bbva-list-simple>
    <bbva-list-simple 
      class="step-summary__item no-margin-x"
      ambient="dark"
      label="${this.t("no-pre-approved-car-certificate-collapsed-mensual-pay")}"
      language="${this.language}"
      currency-code="${this.loanCurrency}"       
      local-currency="${this.loanCurrency}"
      amount="${this._mensualAmount}">
    </bbva-list-simple>
    <bbva-list-simple 
      class="step-summary__item no-margin-x"
      ambient="dark"
      label="${this.t("no-pre-approved-car-certificate-collapsed-value-car")}"
      language="${this.language}"
      currency-code="${this.loanCurrency}"       
      local-currency="${this.loanCurrency}"
      amount="${e.carPrice.value}">
    </bbva-list-simple>
    <bbva-list-simple 
      class="step-summary__item no-margin-x"
      ambient="dark"
      label="${this.t("no-pre-approved-car-certificate-down-payment")}"
      language="${this.language}"
      currency-code="${this.loanCurrency}"       
      local-currency="${this.loanCurrency}"
      amount="${e.downPayment.value}">
    </bbva-list-simple>
    <bbva-list-simple 
      class="step-summary__item no-margin-x"
      ambient="dark"
      amount ="${this.installment}"
      label="${this.t("no-pre-approved-car-certificate-limit")}"
      description="${e.paymentTerm.value}${this.t("no-pre-approved-car-certificate-number-of-payment-value")}">
    </bbva-list-simple>
    <hr divider="small">
    <bbva-list-simple
      class="step-summary__item no-margin-x"
      ambient="dark"
      label="${this.t("no-pre-approved-car-certificate-annual-fixed")}"
      description="${this._ratesData.fixedRate.value}"
      description-medium>
    </bbva-list-simple>
    <bbva-list-simple 
      class="step-summary__item no-margin-x"
      ambient="dark"
      label="${this.t("no-pre-approved-car-certificate-commission-openning")}"
      language="${this.language}"
      currency-code="${this.loanCurrency}"       
      local-currency="${this.loanCurrency}"
      amount="${this._commissionWithoutIva}">
    </bbva-list-simple>
    <bbva-list-simple 
      class="step-summary__item no-margin-x cat-summary"
      ambient="dark"
      label="${this.t("no-pre-approved-car-certificate-cat")}"
      description="${`<span class='highlight'>${this._catRate}%</span> ${this.t("no-pre-approved-car-certificate-cat-desc")}`}">
    </bbva-list-simple>
    <bbva-list-simple 
      class="step-summary__item no-margin-x"
      hide-padding-bottom
      ambient="dark"
      label="${this.t("no-pre-approved-car-certificate-life-insurance")}"
      language="${this.language}"
      currency-code="${this.loanCurrency}"       
      local-currency="${this.loanCurrency}"
      amount="${this._lifeInsurance}">
    </bbva-list-simple>
    <hr divider="small" class="step-divider"/>
    `}_renderCustomerData(e){return m`
      <bbva-list-simple 
        class="step-summary__item no-margin-x"
        ambient="dark" 
        label="${this.t("no-pre-approved-car-certificate-education-level")}"
        description="${e.educationLevel.text}">
      </bbva-list-simple>
      <bbva-list-simple 
        class="step-summary__item no-margin-x" 
        ambient="dark" 
        label="${this.t("no-pre-approved-car-certificate-living-place")}"
        description="${e.houseType.text}">
      </bbva-list-simple>
      <bbva-list-simple 
        class="step-summary__item no-margin-x" 
        ambient="dark" 
        label="${this.t("no-pre-approved-car-certificate-collapsed-antiquity")}"
        description="${`${e.yearsInHome.value} ${this.t("npa-car-loan-years-label")}`}">
      </bbva-list-simple>
      <bbva-list-simple 
        class="step-summary__item no-margin-x" 
        ambient="dark" 
        label="${this.t("no-pre-approved-car-certificate-collapsed-job")}"
        description="${e.employeeType.text}">
      </bbva-list-simple>
      <bbva-list-simple 
        class="step-summary__item no-margin-x" 
        ambient="dark" 
        label="${this.t("no-pre-approved-car-certificate-years-worked")}"
        description="${`${e.workingYears.value} ${this.t("npa-car-loan-years-label")}`}">
      </bbva-list-simple>
      <bbva-list-simple 
        class="step-summary__item no-margin-x" 
        ambient="dark" 
        label="${this.t("no-pre-approved-car-certificate-company-type")}"
        description="${e.companyType.text}">
      </bbva-list-simple>
      <bbva-list-simple 
        class="step-summary__item no-margin-x" 
        ambient="dark" 
        label="${this.t("no-pre-approved-car-certificate-sector")}"
        description="${e.companySector.text}">
      </bbva-list-simple>
      <bbva-list-simple 
        class="step-summary__item no-margin-x"
        ?hidden="${this._hideGrossIncome}"
        ambient="dark" 
        label="${this.t("no-pre-approved-car-certificate-gross-income")}"
        language="${this.language}"
        currency-code="${this.loanCurrency}"
        local-currency="${this.loanCurrency}"
        amount="${e.grossIncome.value}">
      </bbva-list-simple>
      <bbva-list-simple
        class="step-summary__item no-margin-x" 
        ?hidden="${!this._hasVariableIncome}"
        ambient="dark" 
        label="${this.t("no-pre-approved-car-certificate-variable-income")}"
        language="${this.language}"
        currency-code="${this.loanCurrency}"
        local-currency="${this.loanCurrency}"
        amount="${e.variableIncome.value}">
      </bbva-list-simple>
      </bbva-list-simple>
      <bbva-list-simple 
        class="step-summary__item no-margin-x" 
        ambient="dark" 
        label="${this.t("no-pre-approved-car-certificate-advisory")}"
        description="${e.hadAdvisory.text}"
        hide-padding-bottom>
      </bbva-list-simple>
      <hr divider="small" class="step-divider"/>
    `}get _quoteStep(){const e=m`
    <bbva-panel-info
    class="offer-hero padding-x"
    image="images/noPreApprovedCar/car_loan_dollar_dark.svg" 
    text="${this.t("no-pre-approved-car-certificate-promotion-information-text")}">
    </bbva-panel-info>
    
    <div class="quote">
      <div class="padding-x">
        <bbva-text 
          class="quote__title"
          tag="span"
          font-weight="500" 
          size="S" 
          text="${this.t("no-pre-approved-car-certificate-promotion-information-general-title")}">
        </bbva-text>
        <bbva-text
          class="quote__description"
          tag="span"
          font-weight="300" 
          size="S" 
          text="${this.t("no-pre-approved-car-certificate-promotion-information-general-text")}">
        </bbva-text>
      </div>

      <div class="form-loan padding-x">
        <bbva-form-radio-group id="carType"
          name="carType"
          selected="0"
          label-out="${this.t("no-pre-approved-car-certificate-promotion-information-auto-type")}"
          required
          @form-radio-group-item-change="${e=>this._onDataInput(e,"_carData")}">
            <bbva-form-radio-button value="NUEVO">Nuevo</bbva-form-radio-button>
            <bbva-form-radio-button value="SEMINUEVO" info-message="Al menos 1 año de uso">Seminuevo</bbva-form-radio-button>
        </bbva-form-radio-group>

        ${this._hasPreownedCar?this._renderCarYearInput():""}

        <bbva-form-amount
          id="carPrice"
          name="carPrice"
          class="form-loan__field"
          symbol="$"
          amount="${this._carPriceAmount}"
          inputMode="decimal"
          currency-code="${this.loanCurrency}"
          local-currency="${this.loanCurrency}"
          language="${this.language}"
          label="${this.t("no-pre-approved-car-certificate-configuration-input-text")}" 
          label-out="${this.t("no-pre-approved-car-certificate-label-out-price-car")}" 
          optional-label=""
          ?invalid="${!this._isCarPriceValid}"
          info-message="${this._isCarPriceValid?this.t(this._carPriceInfo,"",{minAmount:this._minCarPrice.toLocaleString("en",this.currenciesFormat),maxAmount:this._maxCarPrice.toLocaleString("en",this.currenciesFormat)}):""}"
          error-message="${this._carPriceErrorMessage}"
          auto-validate
          validator="credit-amount-validator"
          @form-field-input-focus="${e=>{this._hideStickyPayment=e}}"
          @form-field-input-blur="${e=>{this._hideStickyPayment=!1,e.target.amount>0&&this._onDataInput(e,"_carData")}}}"
          @form-amount-input-change="${this._handleAmountInput}">
        </bbva-form-amount>
        <credit-amount-validator
          min-amount=${this._minCarPrice}
          max-amount="${this._maxCarPrice}"
          language="${this.language}"
          @credit-amount-validation="${e=>{this._isCarPriceValid=e.detail}}"
        ></credit-amount-validator>

        <bbva-form-amount
          id="downPayment"
          name="downPayment"
          class="form-loan__field"
          symbol="$"
          amount="${this._downPaymentAmount}"
          inputMode="decimal"
          ?disabled="${!this._isCarPriceValid}"
          ?invalid="${!this._isDownPaymentValid}"
          currency-code="${this.loanCurrency}"
          local-currency="${this.loanCurrency}"
          language="${this.language}"
          label="${this.t("no-pre-approved-car-certificate-configuration-input-text")}" 
          label-out="${this.t("no-pre-approved-car-certificate-label-out-price-hitch")}" 
          optional-label=""
          info-message="${this._isDownPaymentValid?this.t(this._downPaymentInfo,"",{minAmount:this._minDownPayment.toLocaleString("en",this.currenciesFormat),maxAmount:this._maxDownPayment.toLocaleString("en",this.currenciesFormat)}):""}"
          error-message="${this._downPaymentErrorMessage}"
          help-icon="${h()}"
          auto-validate
          validator="down-payment-amount-validator"
          @form-field-help-click="${()=>{G(this,oe,Z)}}"
          @form-field-input-focus="${e=>{this._hideStickyPayment=e}}"
          @form-field-input-blur="${e=>{this._hideStickyPayment=!1,e.target.amount>0&&this._onDataInput(e,"_carData")}}"
          @form-amount-input-change="${this._handleAmountInput}">
        </bbva-form-amount>
        <down-payment-amount-validator
          min-amount=${this._minDownPayment}
          max-amount="${this._maxDownPayment}"
          language="${this.language}"
          @down-payment-amount-validation="${e=>{this._isDownPaymentValid=e.detail}}"
        ></down-payment-amount-validator>

        <bbva-list-definition-amount
          class="quote__loan-amount"
          title="${this.t("no-pre-approved-car-certificate-credit-amount-text")}"
          amount="${this._creditAmount}"
          currency-code="${this.loanCurrency}" language="en"
          local-currency="${this.loanCurrency}"
          variant-amount="4xl">
        </bbva-list-definition-amount>
        <bbva-list-definition-amount
          class="quote__loan-amount life-insurance"
          title="${this.t("no-pre-approved-car-certificate-life-insurance-text")}"
          amount="${this._lifeInsurance}"
          currency-code="${this.loanCurrency}" local-currency="${this.loanCurrency}"
          variant-amount="2xl">
        </bbva-list-definition-amount>
        <bbva-notification-help
          text="${this.t("no-pre-approved-car-certificate-life-insurance-message")}"
          accessibility-label-icon="${this.t("no-pre-approved-car-certificate-life-insurance-alert")}"
          icon=${d()}>
        </bbva-notification-help>

        <div class="payment-term">
          <bbva-text
            class="payment-term__title"
            tag="span"
            size="S"
            text="${this.t("no-pre-approved-car-certificate-label-out-range")}">
          </bbva-text>
          <bbva-list-simple
            class="payment-term__description"
            description-medium=""
            label="Plazo"
            description="${this.installment}${this.t("no-pre-approved-car-certificate-number-of-payment-value")}">
          </bbva-list-simple>
          <bbva-form-range id="paymentTerm"
            name="paymentTerm"
            variant="informational-section"
            class="action payment-term__range"
            ?disabled="${!this._isCarPriceValid||!this._isDownPaymentValid}"
            value="${this.installment/this._stepIncrease}"
            .itemLabels="${this.installmentsList}"
            show-labels=""
            min="1"
            max="${1===this.maxRangeTerms?2:this.maxRangeTerms}"
            @change="${e=>this._onDataInput(e,"_carData")}">
          </bbva-form-range>
        </div>
      </div>

      <div class="considerations">
        <bbva-text
          class="considerations__title padding-x"
          tag="span"
          size="S"
          font-weight="500"
          text="${this.t("no-pre-approved-car-certificate-considerations-title")}">
        </bbva-text>
        <bbva-aggregation-bullet-list .items="${this._listConsiderations}" class="margin-x" role="list"></bbva-aggregation-bullet-list>
      </div>

      <div class="quote__rates-list">
        <bbva-text
          class="considerations__title padding-x"
          tag="span"
          size="S"
          font-weight="500"
          text="${this.t("no-pre-approved-car-certificate-taxes-title")}">
        </bbva-text>
        <bbva-list-simple id="fixedRate"
          label="${this.t("no-pre-approved-car-certificate-annual-fixed")}" 
          description-date="" 
          action-icon="${h()}" 
          @list-simple-icon-click="${()=>{G(this,re,K)}}"
          action-accessibility-text="bbva-list-simple-action-help" 
          description="${this._ratesData.fixedRate.value}">
        </bbva-list-simple>
        <bbva-list-simple  id="commission"
          label="${this.t("no-pre-approved-car-certificate-commission-openning")}" 
          action-icon="${h()}" 
          @list-simple-icon-click="${()=>{G(this,le,ee)}}"
          action-accessibility-text="bbva-list-simple-action-help" 
          currency-code="${this.loanCurrency}"       
          local-currency="${this.loanCurrency}"
          amount="${this._commissionWithoutIva}">
        </bbva-list-simple>
        <bbva-list-simple id="cat"
          label="${this.t("no-pre-approved-car-certificate-cat")}" 
          action-icon="${h()}" 
          @list-simple-icon-click="${()=>{G(this,re,te)}}"
          action-accessibility-text="bbva-list-simple-action-help" 
          description="${`<span class='highlight'>${this._catRate}%</span> ${this.t("no-pre-approved-car-certificate-cat-desc")}`}">
        </bbva-list-simple>
        <bbva-list-simple id="lifeInsurance"
          label="${this.t("no-pre-approved-car-certificate-life-insurance")}" 
          action-icon="${h()}" 
          @list-simple-icon-click="${()=>{G(this,re,ae)}}"
          action-accessibility-text="bbva-list-simple-action-help" 
          currency-code="${this.loanCurrency}"       
          local-currency="${this.loanCurrency}"
          amount="${this._lifeInsurance}">
        </bbva-list-simple>
      </div>

      <div class="padding-x">
        <bbva-text
          class="text-center cat-description"
          tag="span"
          size="S"
          text="${this._getCATDescription()}">
        </bbva-text>
        <bbva-text class="text-center" tag="span" size="S" text="${this.t("npa-car-loan-calculation-date","",{date:this._calculationDate})}"></bbva-text>
        <bbva-text class="text-center" tag="span" size="S" text="${this.t("npa-car-loan-expiration-date","",{date:this._expirationDate})}"></bbva-text>
        <bbva-text class="text-center" tag="span" size="S" text="${this.t("no-pre-approved-car-certificate-cat-text-line-4")}"></bbva-text>
        <bbva-text class="text-center" tag="span" size="S" text="${this.t("no-pre-approved-car-certificate-cat-text-line-5")}"></bbva-text>
      </div>

      <bbva-notification-message
        icon="${d()}"
        class="quote__notification-message margin-x"
        message="${this.t("no-pre-approved-car-certificate-notification-message")}"
        description="${this.customerPhoneNumber}">
      </bbva-notification-message>

      <bbva-text class="text-center padding-x" tag="span" size="S" text="${this.t("no-pre-approved-car-certificate-iva-text")}"></bbva-text>
        
      <bbva-list-file
        class="amortization-table"
        icon="${u()}"
        file-name="${this.t("no-pre-approved-car-certificate-pdf-name")}"
        info-message="${this.t("no-pre-approved-car-certificate-pdf-info")}"
        @list-file-link-click="${this._clickShare}">>
      </bbva-list-file>

      <bbva-panel-button-fixed
        ?show="${!this._hideStickyPayment}"
        sticky
        button-disabled
        class="quote__summary padding-x ${this.showCallMeBack?"quote__summaryCallmeBack":""}"
        button-class="positive" 
        label="${this.t("no-pre-approved-car-certificate-sticky-label")}"
        amount="${this._mensualAmount}" currency-code="${this.loanCurrency}"
        local-currency="${this.loanCurrency}"
        header-additional-info="${this.t("no-pre-approved-car-certificate-sticky-label-2")}">
      </bbva-panel-button-fixed>
    </div>
    `,t=this._carDataBtnDisabled?"":this._renderOfferDetailSummary(this._carData);return this._renderExpandableStep(1,"",e,t,this.t("no-pre-approved-car-certificate-change-step-label"),!0,"quoteStepContinueBtn","_carDataBtnDisabled")}_getCATDescription(){return`<span class='highlight' style="margin-right: 4px;">CAT ${this._catRate}%</span> ${this.t("no-pre-approved-car-certificate-cat-text-line-1")}`}_handleAmountInput(e){const{target:t,detail:{amount:a=0}}=e;Object.keys(t).length&&"carPrice"===(null==t?void 0:t.name)?(this._carPriceAmount=a,!this._hasDecimals(a,"carPrice")&&this._isCarPriceInRange(a)&&(this._carPriceInfo="no-pre-approved-car-certificate-configuration-price-car",this._triggerDownPaymentValidation(!0))):(this._downPaymentAmount=a,!this._hasDecimals(a,"downPayment")&&this._isDownPaymentInRange(a)&&(this._downPaymentInfo="no-pre-approved-car-certificate-configuration-price-hitch"))}_validateCarYear(e){this._carData.downPayment.value="0",this._registerData(e,"_carData",!0),this._triggerDownPaymentValidation()}_handlePriceCar({target:e}){const t={target:{name:e.name,value:e.amount}},a=e.amount;this._carPriceAmount=a,!this._hasDecimals(a,"carPrice")&&this._isCarPriceInRange(a)||(t.target.value=""),this._carData.downPayment.value="0",this._registerData(t,"_carData",!0),this._triggerDownPaymentValidation()}_isCarPriceInRange(e){let t=!0;return e<this._minCarPrice?(t=!1,this._carPriceErrorMessage=this.t("npa-car-loan-min-car-price-error-text","",{amount:this._minCarPrice.toLocaleString("en",this.currenciesFormat)})):e>this._maxCarPrice&&(t=!1,this._carPriceErrorMessage=this.t("npa-car-loan-max-car-price-error-text","",{amount:this._maxCarPrice.toLocaleString("en",this.currenciesFormat)})),t}_hasDecimals(e,t){const a=e%1!=0;return a?("carPrice"===t?this._carPriceErrorMessage=this.t("npa-car-loan-decimals-car-price-error-text"):this._downPaymentErrorMessage=this.t("npa-car-loan-decimals-down-payment-error-text"),a):a}_handleDownPayment({target:e}){const t={target:{name:e.name,value:e.amount}},a=e.amount;this._hasDecimals(a,"downPayment")||!this._isDownPaymentInRange(a)?(this._isDownPaymentValid=!1,t.target.value=""):this._isDownPaymentValid=!0,this._isDownPaymentValid||(this._carDataBtnDisabled=!0),this._registerData(t,"_carData",e.cancel)}_isDownPaymentInRange(e){let t=!0;return e<this._minDownPayment?(t=!1,this._downPaymentErrorMessage=this.t("npa-car-loan-min-down-payment-error-text","",{amount:this._minDownPayment.toLocaleString("en",this.currenciesFormat)})):e>this._maxDownPayment&&(t=!1,this._downPaymentErrorMessage=this.t("npa-car-loan-max-down-payment-error-text","",{amount:this._maxDownPayment.toLocaleString("en",this.currenciesFormat)})),t}_handleRange(e){this._registerData(e,"_carData"),this.installment=Number(e.target.getAttribute("aria-valuenow"))*this._stepIncrease}_validateCarDataCase(e){return e.splice(e.indexOf("paymentTerm"),1),e.splice(e.indexOf("loanAmount"),1),e.splice(e.indexOf("mensualAmount"),1),this._hasPreownedCar||e.splice(e.indexOf("carYear"),1),e}static _renderSelectOptions(e){return Object.keys(e).map((t=>m`<bbva-form-option value="${t}">${e[t]}</bbva-form-option>`))}get _dataStep(){const e=m`
    <bbva-text
      tag="span"
      font-weight="300"
      size="S"
      text="${this.t("no-pre-approved-car-certificate-promotion-data-text")}">
    </bbva-text>

    <form class="user-data">
      <bbva-form-select id="educationLevel"
        name="educationLevel"
        class="user-data__field"
        label="${this.t("no-pre-approved-car-certificate-education-level")}"
        label-out="${this.t("no-pre-approved-car-certificate-label-out-level")}"
        required 
        @change="${e=>this._onDataInput(e,"_userData")}">
        ${he._renderSelectOptions(this.userDataOptions.educationOptions)}
      </bbva-form-select>
      <bbva-form-select id="houseType"
        name="houseType"
        class="user-data__field"
        label="${this.t("no-pre-approved-car-certificate-living-place")}"
        label-out="${this.t("no-pre-approved-car-certificate-label-out-address")}"
        required 
        @change="${e=>this._onDataInput(e,"_userData")}">
        ${he._renderSelectOptions(this.userDataOptions.residenceOptions)}
      </bbva-form-select>
      <bbva-form-number id="yearsInHome"
        name="yearsInHome"
        inputMode="decimal"
        class="user-data__field"
        maxLength="2"
        ?invalid = "${this._isYearsInHomeInvalid}"
        label="${this.t("no-pre-approved-car-certificate-label-address-years")}"
        error-message="${this.t(this._homeYearsErrorMessage)}"
        required 
        @form-field-input-blur="${e=>this._onDataInput(e,"_userData")}"
        @input="${this._handleNumberInputChange}">
      </bbva-form-number>
      <bbva-form-select id="employeeType"
        name="employeeType"
        class="user-data__field"
        label="${this.t("no-pre-approved-car-certificate-label-type-worker")}"
        label-out="${this.t("no-pre-approved-car-certificate-label-out-labor-data")}"
        required 
        @change="${e=>this._onDataInput(e,"_userData")}">
        ${he._renderSelectOptions(this.userDataOptions.employmentOptions)}
      </bbva-form-select>
      <bbva-form-number id="workingYears"
        name="workingYears"
        inputMode="decimal"
        class="user-data__field"
        maxLength="2"
        ?invalid="${this._isWorkingYearsInvalid}"
        label="${this.t("no-pre-approved-car-certificate-years-worked")}"
        error-message="${this.t(this._workingYearsErrorMessage)}"
        required 
        @form-field-input-blur="${e=>this._onDataInput(e,"_userData")}"
        @input="${this._handleNumberInputChange}">
      </bbva-form-number>
      <bbva-form-select id="companyType"
        name="companyType"
        class="user-data__field"
        label="${this.t("no-pre-approved-car-certificate-company-type")}"
        required 
        @change="${e=>this._onDataInput(e,"_userData")}">
        ${he._renderSelectOptions(this.userDataOptions.companyTypeOptions)}
      </bbva-form-select>
      <bbva-form-select id="companySector"
        name="companySector"
        label="${this.t("no-pre-approved-car-certificate-sector")}"
        required 
        @change="${e=>this._onDataInput(e,"_userData")}">
        ${he._renderSelectOptions(this.userDataOptions.economicActivityOptions)}
      </bbva-form-select>
      <bbva-form-amount id="grossIncome"
        name="grossIncome"
        inputMode="decimal"
        .value="${this._grossIncomeAmount}"
        ?hidden="${this._hideGrossIncome}"
        ?invalid="${!this._isGrossIncomeValid}"
        currency-code="" 
        local-currency="${this.loanCurrency}"
        label="${this.t("no-pre-approved-car-certificate-gross-income")}" 
        label-out="${this.t("no-pre-approved-car-certificate-label-out-total")}"
        optional-label=""
        info-message="${this._isGrossIncomeValid?this.t("no-pre-approved-car-certificate-label-total-message"):""}" 
        error-message="${this.t("npa-car-loan-invalid-gross-income-error-message","",{minIncome:this.minTotalIncome.toLocaleString("en",this.currenciesFormat)})}"
        @form-field-input-blur="${e=>this._onDataInput(e,"_userData")}"
        @form-amount-input-change="${this._handleIncomesChange}">
      </bbva-form-amount>
      <bbva-form-radio-group id="hasVariableIncome"
        name="hasVariableIncome"
        ?hidden="${this._hideGrossIncome}"
        label-out="${this.t("no-pre-approved-car-certificate-variable-income")}" 
        help-icon="${h()}"
        .selected="${this._variableIncomeSelectedOption}"
        required two-option
        @bbva-form-radio-group-help-click="${()=>{G(this,re,ie)}}"
        @form-radio-group-item-change="${e=>this._onDataInput(e,"_userData")}">
        <bbva-form-radio-button value="tiene">${this.t("npa-car-loan-has-variable-income-text")}</bbva-form-radio-button>
        <bbva-form-radio-button value="no tiene">${this.t("npa-car-loan-has-not-variable-income-text")}</bbva-form-radio-button>
      </bbva-form-radio-group>
      ${this._renderRadioGroupErrorMessage()}
      ${this._showVariableIncomeField?this._renderVariableIncomeField():""}
      <bbva-form-radio-group id="advisoryOptions"
        name="hadAdvisory"
        label-out="${this.t("no-pre-approved-car-certificate-advisory")}"
        .selected="${this._advisorySelectedOption}" 
        required two-option
        @form-radio-group-item-change="${e=>this._onDataInput(e,"_userData")}">
        <bbva-form-radio-button value="SI">${this.t("npa-car-loan-has-advisory-text")}</bbva-form-radio-button>
        <bbva-form-radio-button value="NO">${this.t("npa-car-loan-has-not-advisory-text")}</bbva-form-radio-button>
      </bbva-form-radio-group>
      <bbva-text font-weight="500" text="${this.t("no-pre-approved-car-certificate-notice-privacy")}"></bbva-text>
      <bbva-list-link
        class="user-data__privacy-file"
        link-icon-left="${b()}"
        header-text="${this.t("no-pre-approved-car-certificate-privacy-step-2")}"
        @click="${()=>{G(this,re,z)}}">
      </bbva-list-link>
    </form>
    `,t=this._renderCustomerData(this._userData);return this._renderExpandableStep(2,this.t("no-pre-approved-car-certificate-data-step-header"),e,t,this.t("no-pre-approved-car-certificate-change-step-label"),!0,"userDataContinueBtn","_userDataBtnDisabled")}_renderVariableIncomeField(){return m`
    <bbva-form-amount id="variableIncome"
      name="variableIncome"
      inputMode="decimal"
      .value="${this._variableIncomeAmount}"
      ?invalid="${!this._isVariableIncomeValid}"
      class="${this._hideGrossIncome?"user-data__field":"user-data__field--half"}"
      currency-code="" 
      local-currency="${this.loanCurrency}"
      label="${this.t("no-pre-approved-car-certificate-label-variable-income")}"
      label-out="${this._hideGrossIncome?this.t("no-pre-approved-car-certificate-variable-income"):""}"
      optional-label=""
      help-icon="${h()}"
      error-message="${this._getVariableIncomeErrorMessage()}"
      @form-field-help-click="${()=>{G(this,re,ie)}}"
      @form-field-input-blur="${e=>this._onDataInput(e,"_userData")}"
      @form-amount-input-change="${this._handleIncomesChange}">
    </bbva-form-amount>
    `}_handleIncomesChange({target:e}){Object.keys(e).length&&"grossIncome"===e.name?(this._grossIncomeAmount=e.value,this._isGrossIncomeValid=!0):(this._variableIncomeAmount=e.value,this._isVariableIncomeValid=!0,e.value||this._hideGrossIncome||(this._validateVariableIncome(),this._validateTotalIncome(this._validateIncomeSum,this._isGrossIncomeEmpty)))}_handleNumberInputChange({target:e}){Object.keys(e).length&&"yearsInHome"===e.name?this._isYearsInHomeInvalid=!1:this._isWorkingYearsInvalid=!1}_renderRadioGroupErrorMessage(){const e=this._isObjPropInitialState("_userData","hasVariableIncome");return!this._isGrossIncomeEmpty||e||this._hasVariableIncome?"":m`
    <bbva-notification-help
      text="${this.t("npa-car-loan-empty-gross-income-radio-group-error-message","",{minIncome:this.minTotalIncome.toLocaleString("en",this.currenciesFormat)})}"
      accessibility-label-icon="Alert"
      class="alert variable-income-error-message"
      icon=${_()}>
    </bbva-notification-help>`}_getVariableIncomeErrorMessage(){let e;return this._isGrossIncomeEmpty?e=this.t("npa-car-loan-empty-gross-income-error-message"):this._isTotalIncomeValid||(e="1484/INDEPENDIENTE"===this._employeeType?this.t("npa-car-loan-invalid-variable-income-error-message","",{minIncome:this.minTotalIncome.toLocaleString("en",this.currenciesFormat)}):this.t("npa-car-loan-invalid-total-income-error-message","",{minIncome:this.minTotalIncome.toLocaleString("en",this.currenciesFormat)})),e}_isGrossIncomeInputEmpty(){return 0===this._grossIncome}_isObjPropInitialState(e,t){return""===this[e][t].value}_validateYearsInHome({target:e}){const t=e.value;this._isYearsInHomeInvalid=!t||t>this.customerAge||"0"===t;const a={target:{name:e.name,value:e.value}};this._isYearsInHomeInvalid&&(a.target.value="",this._homeYearsErrorMessage=t&&"0"!==t?"npa-car-loan-years-in-home-error-message":"npa-car-loan-min-years-in-home-error-message"),this._registerData(a,"_userData")}_validateWorkingYears({target:e}){const t=e.value;this._isWorkingYearsInvalid=!t||this.customerAge-t<14||"0"===t;const a={target:{name:e.name,value:e.value}};this._isWorkingYearsInvalid&&(a.target.value="",this._workingYearsErrorMessage=t&&"0"!==t?"npa-car-loan-seniority-error-message":"npa-car-loan-min-seniority-error-message"),this._registerData(a,"_userData")}_handleEmployeeTypeChange(e){this._employeeType=e.target.value,this._setEmployeeTypeEffect(this._employeeType),this._registerData(e,"_userData")}_setEmployeeTypeEffect(e){"1484/INDEPENDIENTE"===e?(this._hasVariableIncome=!0,this._variableIncomeSelectedOption=0,this._showVariableIncomeField=!0,this._hideGrossIncome=!0,this._isVariableIncomeValid=!0):(this._showVariableIncomeField=!1,this._variableIncomeSelectedOption=-1,this._hideGrossIncome=!1,this._isGrossIncomeValid=!0,this._userData.hasVariableIncome.value=""),this._userData.variableIncome.value="",this._userData.grossIncome.value="",this._grossIncome=0,this._grossIncomeAmount="",this._variableIncome=0,this._variableIncomeAmount=""}_handleIncomeInput(e){"grossIncome"===e.target.name?(this._grossIncome=e.target.amount,this._validateGrossIncome(this._grossIncome)):this._variableIncome=e.target.amount,this._validateVariableIncome(),this._validateTotalIncome(this._validateIncomeSum,this._isGrossIncomeEmpty)}_validateGrossIncome(e=this._grossIncome){let t=e;this._isGrossIncomeEmpty=this._isGrossIncomeInputEmpty();const a=he._isMinAmountValid(e,this.minTotalIncome),i=this._isObjPropInitialState("_userData","hasVariableIncome");this._isGrossIncomeEmpty||i||this._hasVariableIncome||a?"0"===t.toString()&&(t="",this._isGrossIncomeEmpty=!0):(this._isGrossIncomeValid=!1,t="");const s=he._eventForRegister("grossIncome",t);this._registerData(s,"_userData")}_validateVariableIncome(){this._validateIncomeSum="1482/FIJO"===this._employeeType,this._validateIncomeSum||(this._isGrossIncomeEmpty=!1),this._hasVariableIncome&&(this._isVariableIncomeValid=!this._isGrossIncomeEmpty)}_validateTotalIncome(e,t){let a=this._variableIncome;const i=e?this._grossIncome+this._variableIncome>=this.minTotalIncome:he._isMinAmountValid(this._variableIncome,this.minTotalIncome);!t&&this._hasVariableIncome&&(this._isVariableIncomeValid=i,this._isTotalIncomeValid=i),(!i||i&&(0===this._variableIncome||t))&&(a="");const s=he._eventForRegister("variableIncome",a);this._registerData(s,"_userData")}_handleVariableIncomeChange(e){this._variableIncomeSelectedOption=e.detail.selected,this._hasVariableIncome=0===e.detail.selected,this._isGrossIncomeEmpty=this._isGrossIncomeInputEmpty();const t=this._employeeType,a=this._isObjPropInitialState("_userData","hasVariableIncome");"1482/FIJO"===t&&this._hasVariableIncome?(this._showVariableIncomeField=!0,this._isGrossIncomeValid=!0):a||this._hasVariableIncome||(this._showVariableIncomeField=!1,this._variableIncomeAmount="",this._userData.variableIncome.value=""),this._registerData(e,"_userData"),this._validateGrossIncome()}_handleAdvisoryOptionsChange(e){var t;this._advisorySelectedOption=null==e||null===(t=e.detail)||void 0===t?void 0:t.selected,this._registerData(e,"_userData")}_validateUserDataCase(e,t){let a=t;return"1484/INDEPENDIENTE"===this._employeeType?a=t.filter((t=>"Empleado"===e[t].employeeType)):""===e.hasVariableIncome.value||this._hasVariableIncome||(a.splice(t.indexOf("hasVariableIncome"),1),a.splice(t.indexOf("variableIncome"),1)),a}_checkboxTemplate({id:e,name:t,value:a,label:i}){return m`
      <bbva-form-checkbox id="${e}"
        class="checkbox"
        name="${t}"
        value="${a}"
        label=${this.t(i)}
        optional-label=" "
        @input="${this._validateCheck}">
      </bbva-form-checkbox>
    `}_validateCheck({target:e}){this._termsChecks[e.value]=e.checked,this._isTermsBtnEnabled=Object.keys(this._termsChecks).every((e=>this._termsChecks[e]))}get _termsAndConditionsStep(){const e=m`
      <div class="terms">
        <bbva-text size="S" tag="span" id="termsDescription"
          text="${this.t("no-pre-approved-car-certificate-terms-step-text")}"></bbva-text>
        <div class="terms__links">
          <bbva-list-link id="termsConditionsInfo"
            class="terms__link"
            link-icon-left="${b()}"
            header-text="${this.t("no-pre-approved-car-certificate-terms-step-3")}"
            @click="${()=>{G(this,re,J)}}">
          </bbva-list-link>
          <bbva-list-link id="creditBureauInfo"
            class="terms__link"
            link-icon-left="${b()}"
            header-text="${this.t("no-pre-approved-car-certificate-terms-credit-3")}"
            @click="${()=>{G(this,re,Q)}}">
          </bbva-list-link>
          <bbva-list-link id="privacyInfo"
            class="terms__link"
            link-icon-left="${b()}"
            header-text="${this.t("no-pre-approved-car-certificate-privacy")}"
            @click="${()=>{G(this,re,X)}}">
          </bbva-list-link>
        </div>
        <section class="checkbox-section">
          ${this._termsCheckBoxes.map((e=>this._checkboxTemplate(e)))}
        </section>
            </section>  
        </section>  
        <bbva-notification-message 
          icon="${d()}" 
          class="terms__notification-message" 
          message=${this.customerEmail?this.t("no-pre-approved-car-certificate-notification-message-2"):this.t("no-pre-approved-car-certificate-notification-message-3")}
          description="${this.customerEmail?this.customerEmail:""}">
        </bbva-notification-message>
        
        <div class="step-button-container">
          <bbva-button-default
            class="terms__button"
            ?disabled="${!this._isTermsBtnEnabled}" 
            text="Continuar"
            @click="${this._stepCompletedHandler}">
          </bbva-button-default>
        </div> 
        <bbva-panel-button-fixed
          sticky
          button-disabled
          class="callmeBack"
          footer-link="${this.t("npa-car-loan-call-consultant")}"
          ?show="${this.showCallMeBack}"
          @click="${()=>{G(this,"npa-car-loan-open-call-me-back-from-sticky",!0)}}"
        >
        </bbva-panel-button-fixed>
      </div>
    `,t=this._isTermsBtnEnabled?m`
      <bbva-list-multistep-check class="step-summary__terms-check" icon="coronita:correct" ambient="dark">
        <span>${this.t("no-pre-approved-car-certificate-terms-step-accepted")}</span>
      </bbva-list-multistep-check>
      <div class="margin-x">
        <hr divider="small" ?hidden="${!this.customerEmail}"/>
      </div>
      <bbva-list-simple 
        class="step-summary__item"
        ambient="dark"
        ?hidden="${!this.customerEmail}"
        label="Correo electrónico" 
        description="${this.customerEmail}">
      </bbva-list-simple>
    `:"";return this._renderExpandableStep(3,this.t("no-pre-approved-car-certificate-conditions"),e,t,this.t("no-pre-approved-car-certificate-consult-step-label"))}_clickShare(){G(this,"npa-car-loan-action-PDF"),G(this,"npa-car-loan-analytics-PDF","PDF")}render(){return this.renderMultistep?m`
      <bbva-expandable-multistep hide-step-numbers="" class="scrollable" step-selector=".step">
        ${this._quoteStep}
        ${this._dataStep}
        ${this._termsAndConditionsStep}
      </bbva-expandable-multistep>
    `:""}}customElements.define(he.is,he);
