import{J as t,L as e,z as a,a8 as i,aa as r,aX as n,an as s,ak as o,h as u}from"./952f98a9.js";import{M as l,L as m,f as c,I as p,F as d,a2 as h,G as f,h as b}from"./216055dc.js";import{B as v}from"./30ef6f1f.js";import{B as g}from"./99dc66c7.js";import{z as y,aH as _}from"./7f3d7ca9.js";import{B as I}from"./b7cb1dda.js";import{B as A}from"./dd0af563.js";import"./854beed0.js";import"./84dff06e.js";import"./afb1d3bc.js";import"./c0a2f832.js";import"./cae0f1de.js";class E extends y{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`loans/v${this.version}/preferential-rates/simulate`)}toString(){return super.toString("BGADPLoansPreferentialRatesSimulatePostV2")}}class $ extends(t(e)){}class S extends ${static get is(){return"bbva-local-loans-api-dm-offer"}static get properties(){return{}}postOffer(t){this._generateGetService(this._getService("post",t,{}),{customEvent:"preferential-rate-offer-api-dm-fetch",errorFireEventHandler:"preferential-rate-offer-api-dm-fetch-error"},S._responseMapping)}_getService(t,e={},a={}){const i=this._getServiceParams(a,e);return this._getServicePath(`${t}Offer`,S._getBgadp(i))}static _getBgadp(t){return{postOfferV2:()=>new E(t),default:()=>"BGADP called not exist"}}static _responseMapping(t){return t}}const T=Object.freeze({SUSTAINABLE:"SUSTAINABLE",AMOUNT:"AMOUNT",PREFERENTIAL:"PREFERENTIAL",PERCENTAGE:"PERCENTAGE",CONVENTIONAL_MONTHLY_PAYMENT:"Conventional Monthly Payment",PREFERENTIAL_MONTHLY_PAYMENT:"Preferential Monthly Payment",INSTALLMENT:"INSTALLMENT",ANUAL_RATE:"TASA_ANUAL"});var P=a`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.container {
  padding: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.container .comparative__title {
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.container .comparative__elements {
  padding-bottom: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.container .comparative__elements--panel {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) 0;
}
.container .comparative__elements--notification {
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.container .comparative__divider {
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.interactive .form__description {
  margin-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.interactive .slide {
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
.interactive .slide__header {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.footer {
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
`;class L extends(n(l(s(m(e))))){static get is(){return"bbva-widget-loan-sustainable-rate-simulator"}static get scopedElements(){const t=[c,p,d,v,g,h,f,_,I,b,S,A,...L.configurationScopedElements()];return L.scopedElementsFromClasses(t)}static get properties(){return{host:{type:String},bladmLoansVersion:{type:String},dataProviderLoansVersion:{type:String},formInputCurrencyCode:{type:String,attribute:"form-input-currency-code"},formInputLanguage:{type:String,attribute:"form-input-language"},listInformation:{type:Array,attribute:"list-information"},preferentialRatePercentage:{type:Number,attribute:"preferential-rate-amount-percentage"},amountTextPanelComparative:{type:String,attribute:"amount-text-panel-comparative"},formRangeLabels:{type:Array,attribute:"form-range-labels"},formRangeMin:{type:Number,attribute:"form-range-min"},formRangeMax:{type:Number,attribute:"form-range-max"},formRangeDefaultValue:{type:Number},sustainableUseAmount:{type:Number,attribute:"rate-amount"},amountInput:{type:Number,attribute:"amount-input"},maximumAmountInputOffer:{type:Number,attribute:"maximum-amount-input"},minimumAmountInputOffer:{type:Number,attribute:"minimum-amount-input"},notificationHelpVariant:{type:String,attribute:!1},titleListColor:{type:String,attribute:"title-list-color"},sustainablePercentage:{type:Number,attribute:"sustainable-percentage"},requiredToken:{type:String,attribute:"required-token"},countErrorRequest:{type:Number},offerId:{type:String,attribute:"offer-id"}}}constructor(){super(),this.config={loader:!0},this.bladmLoansVersion="",this.dataProviderLoansVersion="",this.host="",this.minimumAmountInputOffer=0,this.maximumAmountInputOffer=0,this.offerTermsValue=0,this.offerTermsFrequency="",this.formInputCurrencyCode="MXN",this.formInputLanguage="en",this.listInformation=["bbva-widget-loan-sustainable-rate-simulator-first-condition","bbva-widget-loan-sustainable-rate-simulator-second-condition","bbva-widget-loan-sustainable-rate-simulator-third-condition"],this.preferentialMonthlyPayment=0,this.preferentialRatePercentage=0,this.amountTextPanelComparative="%",this.formRangeLabels=["0%","25%","50%","80%","100%"],this.formRangeMin=1,this.formRangeMax=5,this.simulationAmount=0,this.amountInput=0,this.sustainableUseAmount=0,this.notificationHelpVariant="info",this.titleListColor="#666666",this.formRangeDefaultValue=2,this.sustainablePercentage=25,this._percentageDictionary={1:0,2:25,3:50,4:80,5:100},this.requiredToken="",this.showErrorMessage=!1,this.messageErrorInput="",this.countErrorRequest=0,this.offerId=""}static get styles(){return[P,o("bbva-widget-loan-sustainable-rate-simulator-shared-styles")]}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._dataProviderLoans&&this._bladmLoans&&(this._dmsLoaded=!0)}firstUpdated(){super.firstUpdated(),this.showLoader(),this._dmsLoaded&&this._bladmLoans.postOffer(this._generatePreferentialRateSimulatePostBody())}updated(t){if(super.updated(t),t.has("amountInput")){if(0===this.amountInput)return;this.amountInput>1&&(this.shadowRoot.querySelector('[data-tag-name="bbva-form-input"]').value=this.amountInput),this._validateAmountInputInRange()&&(this.showLoader(),this._dataProviderLoans.postOfferDetailQuotationsSimulate(this._generateQuoatationsSimulatePostBody()))}t.has("sustainablePercentage")&&this._validateAmountInputInRange()&&(this.showLoader(),this._bladmLoans.postOffer(this._generatePreferentialRateSimulatePostBody()))}_validateAmountInputInRange(){return this.amountInput>=this.minimumAmountInputOffer&&this.amountInput<=this.maximumAmountInputOffer}setSimulatorProperties(t){this.offerId=t.offerId,this.amountInput=t.lastAmount,this.offerTermsValue=t.offerTermValue,this.conventionalPercentage=t.conventionalRate,this.conventionalMonthlyPayment=t.monthlyPayment,this.localCurrency=t.currency,this.minimumAmountInputOffer=t.minimumAmountOffer,this.maximumAmountInputOffer=t.maximumAmountOffer,this.subproduct=t.subproduct,this.offerTermFrequency=t.offerTermFrequency}reset(){this.amountInput=0,this.offerTermsValue=0,this.conventionalPercentage=0,this.conventionalMonthlyPayment=0,this.localCurrency="",this.minimumAmountInputOffer=0,this.maximumAmountInputOffer=0,this.subproduct="",this.simulatedAmounmt=0,this.preferentialRatePercentage=0,this.preferentialMonthlyPayment=0,this.showErrorMessage=!1,this.offerTermsFrequency="",this.offerId="",this.formRangeDefaultValue=2,this.sustainablePercentage=25,this.shadowRoot.querySelector('[data-tag-name="bbva-form-range"]').value=2,this.shadowRoot.querySelector('[data-tag-name="bbva-form-input"]').value="0",this.shadowRoot.querySelector('[data-tag-name="bbva-form-input"]').blur(),this.requestUpdate()}static _typeText(t){const{text:e,size:a="",color:i="",weight:r="",alignment:n="",withoutInherit:s=!1}=t;return u`
      <bbva-type-text
        text="${e}"
        text-color="${i}"
        font-weight="${r}"
        alignment="${n}"
        ?inherit=${s}
        size="${a}"
      ></bbva-type-text>
    `}static _notificationHelp(t,e){return u`
      <bbva-notification-help
        variant="${t}"
        text="${e}"
      ></bbva-notification-help>
    `}_panelComparative(t){const{firstTitle:e,secondTitle:a,firstAmount:i,secondAmount:r,withoutCurrency:n=!1,amountText:s=""}=t;return u`
      <bbva-panel-comparative
        first-title="${e}"
        second-title="${a}"
        first-amount="${i}"
        second-amount="${r}"
        show-decimals=""
        amount-type="bold"
        local-currency="${n?"":this.formInputCurrencyCode}"
        currency-code="${n?"":this.formInputCurrencyCode}"
        language="${this.formInputLanguage}"
        title-size="S"
        amount-text="${s}"
      ></bbva-panel-comparative>
    `}get _slideHeader(){return u`
      ${L._typeText({text:this.t("bbva-widget-loan-sustainable-rate-simulator-sustainable-products"),alignment:"center",withoutInherit:!0})}
      <bbva-type-amount
        amount="${this.sustainableUseAmount}"
        currency-code="${this.formInputCurrencyCode}"
        local-currency="${this.formInputCurrencyCode}"
        language="${this.formInputLanguage}"
      ></bbva-type-amount>
    `}get _interactiveSection(){return u`
      <section class="interactive">
        <div class="form">
          <div class="form__description">
            ${L._typeText({text:this.t("bbva-widget-loan-sustainable-rate-simulator-main-legend")})}
          </div>
          ${this._formInput}
        </div>
        <div class="slide">
          <div class="slide__header">${this._slideHeader}</div>
          ${this._slideMain}
        </div>
      </section>
    `}get _formInput(){return u`
      <div class="form__input">
        <bbva-form-input
          type="amount"
          mode-input="decimal"
          label="${this.t("bbva-widget-loan-sustainable-rate-simulator-amount-request")}"
          amount="${this.amountInput}"
          currency-code="${this.formInputCurrencyCode}"
          local-currency="${this.formInputCurrencyCode}"
          language="${this.formInputLanguage}"
          clear-accessible-text="${this.t("bbva-widget-loan-sustainable-rate-simulator-clear-accessible-text")}"
          info-message="${this.showErrorMessage?"":this.t("bbva-widget-loan-sustainable-rate-simulator-amount-request-leggend",{minimumAmountInputOffer:this._parseCurrency(this.minimumAmountInputOffer),maximumAmountInputOffer:this._parseCurrency(this.maximumAmountInputOffer)})}"
          ?invalid="${this.showErrorMessage}"
          error-message="${this.messageErrorInput}"
          @form-field-input-blur="${this._blurInput}"
          @keypress="${this._onKeyboardEnter}"
        ></bbva-form-input>
      </div>
    `}_parseCurrency(t){return new Intl.NumberFormat(this.currency).format(t)}_onKeyboardEnter(t){13===t.keyCode&&this._blurInput()}_blurInput(){this.amountInput=parseInt(this.shadowRoot.querySelector('[data-tag-name="bbva-form-input"]').value.replace(/,/g,""),10),this.showErrorMessage=!1,this.messageErrorInput="",this.amountInput<this.minimumAmountInputOffer?(this.showErrorMessage=!0,this.messageErrorInput=this.t("bbva-widget-loan-sustainable-rate-simulator-title-error-minor-amount",{minimumAmountInputOffer:this._parseCurrency(this.minimumAmountInputOffer)})):this.amountInput>this.maximumAmountInputOffer&&(this.showErrorMessage=!0,this.messageErrorInput=this.t("bbva-widget-loan-sustainable-rate-simulator-title-error-major-amount",{maximumAmountInputOffer:this._parseCurrency(this.maximumAmountInputOffer)})),this.requestUpdate()}get _slideMain(){return u`
      <div class="slide__main">
        <bbva-form-range
          show-labels=""
          notification-help-variant="${this.notificationHelpVariant}"
          notification-help-message="${this.t("bbva-widget-loan-sustainable-rate-simulator-rate-legend")}"
          min="${this.formRangeMin}"
          max="${this.formRangeMax}"
          .value="${this.formRangeDefaultValue}"
          .itemLabels="${this.formRangeLabels}"
          variant="informational-basic-section"
          @form-range-value-change="${({detail:t})=>{this.sustainablePercentage=this._percentageDictionary[t.value]}}"
        ></bbva-form-range>
      </div>
    `}get _comparativeSection(){return u`
      <section class="comparative">
        <div class="comparative__title">
          ${L._typeText({text:this.t("bbva-widget-loan-sustainable-rate-simulator-legend-monthly-payment"),size:"S",withoutInherit:!0})}
        </div>
        ${this._comparativeElementsAmount}
        <div class="comparative__divider">
          <bbva-divider-default></bbva-divider-default>
        </div>
        <div class="comparative__title">
          ${L._typeText({text:this.t("bbva-widget-loan-sustainable-rate-simulator-comparative-interest-rate-legend"),size:"S",withoutInherit:!0})}
        </div>
        ${this._comparativeElementsPercentage}
        ${L._typeText({text:this.t("bbva-widget-loan-sustainable-rate-simulator-title-list"),size:"S",color:this.titleListColor,weight:"500",withoutInherit:!0})}
      </section>
    `}get _comparativeElementsAmount(){return u`
      <div class="comparative__elements">
        <div class="comparative__elements--panel">
          ${this._panelComparative({firstTitle:this.t("bbva-widget-loan-sustainable-rate-simulator-comparative-conventional-amount"),secondTitle:this.t("bbva-widget-loan-sustainable-rate-simulator-comparative-preference-amount"),firstAmount:this.conventionalMonthlyPayment,secondAmount:this.preferentialMonthlyPayment})}
        </div>
        <div class="comparative__elements--notification">
          ${L._notificationHelp("info",this.t("bbva-widget-loan-sustainable-rate-simulator-comparative-interest-rate-vat"))}
        </div>
      </div>
    `}get _comparativeElementsPercentage(){return u`
      <div class="comparative__elements">
        <div class="comparative__elements--panel">
          ${this._panelComparative({firstTitle:this.t("bbva-widget-loan-sustainable-rate-simulator-comparative-conventional-percentage"),secondTitle:this.t("bbva-widget-loan-sustainable-rate-simulator-comparative-preference-percentage"),firstAmount:this.conventionalPercentage,secondAmount:this.preferentialRatePercentage,withoutCurrency:!0,amountText:this.amountTextPanelComparative})}
        </div>
        <div class="comparative__elements--notification">
          ${L._notificationHelp("info",this.t("bbva-widget-loan-sustainable-rate-simulator-comparative-interest-percentage-vat"))}
        </div>
      </div>
    `}get _headerMain(){return u`
    <bbva-header-main
      close-icon-aria-label="${this.t("bbva-widget-loan-sustainable-rate-simulator-close-icon-aria-label")}"
      id="basic"
      variant="modal-initial"
      text="${this.t("bbva-widget-loan-sustainable-rate-simulator-header")}"
      @header-main-icon-click="${()=>this.leaveOperative()}"
    >
    </bbva-header-main>
    `}get _footer(){return u`
      <footer class="footer">
        <bbva-button-default
          text="${this.t("bbva-widget-loan-sustainable-rate-simulator-message-button")}"
          fullwidth=""
          @click="${()=>this.leaveOperative()}"
        ></bbva-button-default>
      </footer>
    `}leaveOperative(){this.reset(),this.dispatchEvent(new CustomEvent("exit-flow",{bubbles:!0,composed:!0}))}openErrorModal(){const t=this.countErrorRequest>=3?"exit":"retry",e="retry"===t?"":this.leaveOperative(),a="retry"===t?"bbva-widget-loan-sustainable-rate-simulator-modal-exit":"",i={code:`LOAN-SUSTAINABLE-ERROR-REQUEST-${t.toUpperCase()}`,selectedConfig:{className:"full-height-error header--title-grey credit-bureau--error",hideCloseIcon:!1,openMaximized:!0,title:this.t("bbva-widget-loan-sustainable-rate-simulator-header-modal-error"),heroImage:"./images/errors/fo_error.svg",message:this.t("bbva-widget-loan-sustainable-rate-simulator-message-error"),acceptBtLabel:this.t(`bbva-widget-loan-sustainable-rate-simulator-${t}-error`),cancelBtLabel:a,onAcceptEvent:e,template:{type:"paragraphs",values:[{text:this.t("bbva-widget-loan-sustainable-rate-simulator-modal-text")}]}}};this.countErrorRequest+=1,this.dispatchEvent(new CustomEvent("open-modal",{bubbles:!0,composed:!0,detail:i}))}get _bbvaLocalLoansApiDmOffer(){return u`
    <bbva-local-loans-api-dm-offer
      id="bladmLoans"
      host="${this.host}"
      version="${this.bladmLoansVersion}"
      requiredToken="${this.requiredToken}"
      ?native="${this.native}"
      @preferential-rate-offer-api-dm-fetch="${this._onPreferentialRateSimulateSuccess}"
      @preferential-rate-offer-api-dm-fetch-error="${this._onPreferentialRateSimulateError}"
    >
    </bbva-local-loans-api-dm-offer>
    `}get _dataProviderLoans(){return this.shadowRoot.querySelector("#dataProviderLoans")}async _onPreferentialRateSimulateSuccess(t){t.detail.forEach((({givenUse:t,rates:e,installmentPlan:a})=>{t.itemizeGivenUse.forEach((({givenUseType:t,itemizeGivenUseUnits:e})=>{t===T.SUSTAINABLE&&e.forEach((({unitType:t,amount:e})=>{t===T.AMOUNT&&(this.sustainableUseAmount=e)}))})),e.itemizeRates.forEach((t=>{t.rateType===T.PREFERENTIAL&&t.itemizeRateUnits.forEach((t=>{t.unitType===T.PERCENTAGE&&(this.preferentialRatePercentage=t.percentage)}))})),a.specificAmounts.forEach((({id:t,amount:e})=>{t===T.CONVENTIONAL_MONTHLY_PAYMENT?this.conventionalMonthlyPayment=e:t===T.PREFERENTIAL_MONTHLY_PAYMENT&&(this.preferentialMonthlyPayment=e)})),this.requestUpdate()})),await this.updateComplete,this.clearLoader()}_onPreferentialRateSimulateError(t){null!=t&&t.detail&&this.openErrorModal()}_generatePreferentialRateSimulatePostBody(){return{product:{id:"96",subproduct:{id:this.subproduct}},requestedAmount:{amount:this.amountInput,currency:this.localCurrency},givenUse:{itemizeGivenUse:[{givenUseType:"SUSTAINABLE",itemizeGivenUseUnits:[{unitType:"PERCENTAGE",percentage:this.sustainablePercentage}]}]},rates:{itemizeRates:[{rateType:"CONVENTIONAL",itemizeRateUnits:[{unitType:"PERCENTAGE",percentage:this.conventionalPercentage}]}]},installmentPlan:{terms:{number:this.offerTermsValue,frequency:this.offerTermFrequency},specificAmounts:[{id:"Conventional Monthly Payment",amount:this.conventionalMonthlyPayment,currency:this.localCurrency}]}}}get _bbvaDataproviderLoans(){return u`
    <bbva-dataprovider-loans
      id="dataProviderLoans"
      api-version="${this.dataProviderLoansVersion}"
      host="${this.host}"
      requiredToken="${this.requiredToken}"
      offerId="${this.offerId}"
      ?native="${this.native}"
      @post-offer-detail-quotations-simulate-v1-success="${this._onQuoatationsSimulateSuccess}"
      @post-offer-detail-quotations-simulate-v1-error="${this._onQuoatationsSimulateError}"
      >
    </bbva-dataprovider-loans>
    `}get _bladmLoans(){return this.shadowRoot.querySelector("#bladmLoans")}async _onQuoatationsSimulateSuccess(t){const{loanBreakDown:e,rates:a}=t.detail,i=e.find((t=>t.id===T.INSTALLMENT));i&&(this.conventionalMonthlyPayment=i.amount);const r=a.find((t=>t.rateType.id===T.ANUAL_RATE));r&&(this.conventionalPercentage=r.unit.percentage),this.requestUpdate(),await this.updateComplete,this._validateAmountInputInRange()&&this._bladmLoans.postOffer(this._generatePreferentialRateSimulatePostBody())}_onQuoatationsSimulateError(t){null!=t&&t.detail&&this.openErrorModal()}_generateQuoatationsSimulatePostBody(){return{initialAmount:{amount:this.amountInput,currency:this.localCurrency},terms:{number:this.offerTermsValue,frecuency:this.offerTermFrequency}}}render(){return u`
      ${super.render()}
      ${this._bbvaDataproviderLoans}
      ${this._bbvaLocalLoansApiDmOffer}
      <div class="header">
        ${this._headerMain}
      </div>
      <div class="container">
        ${this._interactiveSection}
        ${this._comparativeSection}
      </div>
      <div class="list">
        ${this.listInformation.map((t=>u`<bbva-list-bullet text="${this.t(t)}"></bbva-list-bullet>`))}
      </div>
      ${this._footer}
    `}}customElements.define(L.is,L);
