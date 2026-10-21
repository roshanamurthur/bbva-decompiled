import{H as e,an as t,z as s,L as i,ak as r,h as a,a8 as o,a9 as n,aZ as d,J as l}from"./952f98a9.js";import{v as c,M as h,L as p,F as u,f as m,G as b,e as f,I as _,h as g,H as v,P as y,Q as S,K as x,at as C,aD as E}from"./216055dc.js";import{bf as T,bg as R,bP as $}from"./7f3d7ca9.js";import{a as P,B as D}from"./e3d898b2.js";import{B as w}from"./84dff06e.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./c0a2f832.js";import"./cae0f1de.js";const O=e((e=>class extends(t(e)){static get properties(){return{_openModal:{type:Boolean},LitsContracts:{type:Array},rangeDate:{type:Object},currentYear:{type:Array},isLostConnection:{type:Boolean},configToast:{type:Object},currentMonth:{type:Number}}}constructor(){super(),this._openModal=!1,this._openSuccessPage=!1,this.isLostConnection=!1,this.LitsContracts=[],this.configToast={isShowToast:!0,messageToast:"",typeToast:""},this.currentMonth=(new Date).getMonth(),this.currentYear=[]}getFiscalYear(){return this.currentMonth>2?`${this._getYear()}`:""+(this._getYear()-1)}shortMontAtTheMoment(){return this.currentYear=this.currentMonth<3?this.generateMonthsAfterYear().slice(0,this.currentMonth+13):this.generateMonthsAfterYear().slice(0,this.currentMonth+1),this.currentYear}_getYear(){return(new Date).getFullYear()}_getMonthSelected(e){return this._capitalizeWords(moment(e).format("MMMM"))}_getYearSelected(e){return this._capitalizeWords(moment(e).format("YYYY"))}_getLastDayOfMonth(e,t){return new Date(e,t,0).getDate()}generateMonthsAfterYear(){let e;const t=["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"],s=t.map(((e,t)=>({name:e,numberMonth:(t+1).toString().padStart(2,"0"),initalDay:"01",endDay:this._getLastDayOfMonth(this._getYear(),t+1).toString(),year:this.getFiscalYear().toString()}))),i=t.slice(0,3).map(((e,t)=>({name:e,numberMonth:(t+1).toString().padStart(2,"0"),initalDay:"01",endDay:this._getLastDayOfMonth(this._getYear(),t+1).toString(),year:this._getYear().toString()})));return e=this.currentMonth<3?s.concat(i):s,e}_formartStringToDate(e,t="YYYY-MM-DD"){return moment(e).format(t)}lostConnection(){this.isLostConnection=!0,this.configToast={isShowToast:!1,messageToast:this.t("update-rfc-profile-toast-notification-connection-discontinue"),typeToast:"error"}}resetConnection(){this.isLostConnection&&(this.configToast={messageToast:this.t("update-rfc-profile-toast-notification-connection"),typeToast:"info"},this.isLostConnection=!1)}setProducts(e){if(e){const{contracts:t}=(null==e?void 0:e.data)||{};let s=[];s=this._removeAccountItemArray(t),this.LitsContracts=this._parseContract(s)}}_removeAccountItemArray(e){return e.filter((e=>{var t,s,i;return"CH"===(null==e||null===(t=e.product)||void 0===t?void 0:t.id)||"AH"===(null==e||null===(s=e.product)||void 0===s?void 0:s.id)||"CREDIT_CARD"===(null==e||null===(i=e.subProductType)||void 0===i?void 0:i.id)})).filter((e=>{var t;return"DIGITAL BBVA"!==(null==e||null===(t=e.product)||void 0===t?void 0:t.name)}))}_parseContract(e){return e.map((({number:e,product:t,alias:s,relatedContracts:i,simpleCode:r})=>{var a;return{id:i?null===(a=i.find(((e,t)=>0===t)))||void 0===a?void 0:a.id:r,alias:void 0===s?"":s,numberCard:void 0===e?"":`• ${e.slice(-4)}`,productName:void 0===t?"":this._capitalizeWords(null==t?void 0:t.name),typeCard:void 0===t?"":this._selectTypeCard(null==t?void 0:t.name)}}))}_capitalizeWords(e){return e.toLowerCase().split(" ").map((e=>e.charAt(0).toUpperCase()+e.slice(1))).join(" ")}_selectTypeCard(e){let t;return t="Cuenta de Cheques"===e||"Cuenta de Ahorro"===e?"debit":"ORO BBVA"===e?"gold":"debit",t}fireEventForAnalytics(e){this._fireEvent(`analytics-${e}`)}_fireEvent(e,t={}){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}}));var M=s`:host {
  display: block;
  box-sizing: border-box;
}
:host [tabindex="0"] {
  outline: none;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-form-select] {
  margin: 2rem 0;
}

.form-select-item {
  margin-top: 0.5rem;
  margin-bottom: 0.5rem;
}

.margin-button {
  margin-top: 3rem;
}
`;class k extends(c(h(p(O(t(i)))))){static get is(){return"bbva-step-selection-period"}static get scopedElements(){const e=[T,R,P,D,u,m,b,f,...k.configurationScopedElements()];return k.scopedElementsFromClasses(e)}static get properties(){return{isDisbledButtonSerch:{type:Boolean},periodFrom:{type:String},periodTo:{type:String},_isValidDateFrom:{type:Boolean},_isValidDateTo:{type:Boolean}}}constructor(){super(),this.isDisbledButtonSerch=!1,this.periodFrom="",this.periodTo="",this.messageErrorInputTo="",this.messageErrorInputFrom="",this._isValidDateTo=!1,this._isValidDateFrom=!1}static get styles(){return[M,r("bbva-step-selection-period-shared-styles")]}resetProperties(){this.isDisbledButtonSerch=!1,this.periodFrom="",this.periodTo="",this.messageErrorInputTo="",this.messageErrorInputFrom="",this._isValidDateFrom=!1,this._isValidDateTo=!1,this.shadowRoot.querySelector("#bbvaSelectFormFrom").value="",this.shadowRoot.querySelector("#bbvaSelectFormTo").value=""}_selectFormItemDateFrom({detail:e}){this.isDisbledButtonSerch=!1,this.periodFrom=e.value,""!==this.periodFrom&&this._validFormStepFrom()}_validFormStepFrom(){this._isValidDateFrom=!1,""!==this.periodTo&&(this._formartStringToDate(this.periodFrom)>this._formartStringToDate(this.periodTo)&&(this._isValidDateFrom=!0),this._isValidDateTo&&(this._isValidDateTo=!1),this.isDisbledButtonSerch=!this._isValidDateFrom&&!this._isValidDateTo)}_selectFormItemDateTo({detail:e}){this.isDisbledButtonSerch=!1,this.periodTo=e.value,""!==this.periodTo&&this._validFormStepTo()}_validFormStepTo(){this._isValidDateTo=!1,""!==this.periodFrom&&(this._formartStringToDate(this.periodTo)<this._formartStringToDate(this.periodFrom)&&(this._isValidDateTo=!0),this._isValidDateFrom&&(this._isValidDateFrom=!1),this.isDisbledButtonSerch=!this._isValidDateTo&&!this._isValidDateFrom)}_confirmStep2(){this._fireEvent("complete"),this._fireEvent("reset-step-three-update-rfc"),this._fireEvent("reset-step-four-update-rfc")}_renderFormStep(e){return this.shortMontAtTheMoment(),a`
      ${this.currentYear.map((t=>a`
          <bbva-form-option
            class="border-input"
            id="valueInputDates"
            value="${`${t.year}-${t.numberMonth}-${"initial"===e?t.initalDay:t.endDay}`}">
              ${t.name} ${t.year}
          </bbva-form-option>
        `))}
    `}_renderStep2(){return a`
      <bbva-type-text id="selectPeriodStepTwoDescription" text="${this.t("update-rfc-profile-multistep-description-select-period")}" size="S"></bbva-type-text>
        <bbva-form-select
          id="bbvaSelectFormFrom"
          ambient="primary-alt"
          label="${this.t("update-rfc-profile-multistep-selected-period-moth-input")}"
          info-title="${this.t("update-rfc-profile-multistep-selected-period-from-input")}"
          optional-label=""
          ?invalid=${this._isValidDateFrom}
          error-message="${this.t("update-rfc-profile-multistep-selected-period-message-error-from-input")}"
          @bbva-form-select-selected-item="${this._selectFormItemDateFrom}">
            ${this._renderFormStep("initial")}
        </bbva-form-select>

        <bbva-form-select
          id="bbvaSelectFormTo"
          ambient="primary-alt"
          label="${this.t("update-rfc-profile-multistep-selected-period-moth-input")}"
          info-title="${this.t("update-rfc-profile-multistep-selected-period-to-input")}"
          optional-label=""
          error-message="${this.t("update-rfc-profile-multistep-selected-period-message-error-to-input")}"
          @bbva-form-select-selected-item="${this._selectFormItemDateTo}"
          ?invalid=${this._isValidDateTo}>
          ${this._renderFormStep("end")}
        </bbva-form-select>

        <bbva-button-default
          id="btnStepTwoDate"
          fullwidth
          ?disabled="${!this.isDisbledButtonSerch}"
          class="action margin-button"
          text="${this.t("update-rfc-profile-multistep-continue-button")}"
          @click="${this._sendSelectedPeriod}">
        </bbva-button-default>
    `}_sendSelectedPeriod(){this._dispatchCustomEvent("send-selected-period",{fromDate:this.periodFrom,toDate:this.periodTo}),this._fireEvent("send-message-summary-step-two",{message:this.t("update-rfc-summary-content-range-dates",{dateFrom:`${this._getMonthSelected(this.periodFrom)} ${this._getYearSelected(this.periodFrom)}`,dateTo:`${this._getMonthSelected(this.periodTo)} ${this._getYearSelected(this.periodTo)}`})}),this._confirmStep2()}render(){return a`
      ${this._renderStep2()}
    `}}var A=s`[ambient^=dark] {
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${o(n.primaryCoreLightened)});
  --bbva-list-simple-dark-mode-stacked-label-color: var(--colorsPrimaryCoreLightened, ${o(n.primaryCoreLightened)});
}

:host {
  display: block;
  box-sizing: border-box;
}
:host [tabindex="0"] {
  outline: none;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.form-select-item {
  margin-top: 0.5rem;
  margin-bottom: 0.5rem;
}

.margin-button {
  margin-top: 3rem;
}
`;class F extends(c(h(p(O(t(i)))))){static get is(){return"bbva-step-selection-product"}static get scopedElements(){const e=[T,R,m,u,P,D,w,b,k,...F.configurationScopedElements()];return F.scopedElementsFromClasses(e)}static get properties(){return{arrayProducts:{type:Array},producSelected:{type:Object},isDisbledButtonSerch:{type:Boolean},ambient:{type:String},listProducts:{type:Array},filterProduct:{type:Array}}}constructor(){super(),this.arrayProducts=[],this.producSelected={},this.isDisbledButtonSerch=!0,this.ambient="dark",this.listProducts=[],this.filterProduct=[]}static get styles(){return[A,r("bbva-step-selection-product-shared-styles")]}resetProperties(){this.arrayProducts=[],this.producSelected={},this.isDisbledButtonSerch=!0,this.ambient="dark",this.listProducts=[],this.filterProduct=[],this.shadowRoot.querySelector("#selectProductFormInput").value=""}_selectFormItem({detail:e}){this.producSelected=e,this.filterProduct=this._filterProductSelect(e.value),this.isDisbledButtonSerch=!1,this._fireEvent("send-analytic-app-started")}_confirmStep(){this._fireEvent("complete"),this._fireEvent("change-header-ambient",!0),this._fireEvent("send-selected-product",{productNumber:this.producSelected}),this._fireEvent("send-summary-content-step-one",{productSelect:this.filterProduct[0]}),this._fireEvent("reset-step-two-update-rfc"),this._fireEvent("reset-step-three-update-rfc"),this._fireEvent("reset-step-four-update-rfc"),this._fireEvent("send-analytic-app-step2")}_filterProductSelect(e){return this.listProducts.filter((t=>t.id===e))}_renderSelectForm(){return a`
      <bbva-type-text
        id="stepOneDescription" 
        text="${this.t("update-rfc-profile-multistep-description-select-product")}"
        size="S">
      </bbva-type-text>
        <bbva-form-select
        id="selectProductFormInput"
        ambient="primary-alt"
        label="${this.t("update-rfc-profile-multistep-description-select-product-placeholder-input")}"
        default-clip
        info-message="${this.t("update-rfc-profile-multistep-placeholder-select-product")}"
        @bbva-form-select-selected-item="${this._selectFormItem}">
          ${this._renderFormOptions()}
        </bbva-form-select> 
      <div 
        role="button"
        tabindex="-1"
        aria-hidden="${this.isDisbledButtonSerch}">
        <bbva-button-default
          id="btnSelectProduct"
          fullwidth
          aria-disabled="${this.isDisbledButtonSerch}"
          ?disabled="${this.isDisbledButtonSerch}"
          class="action margin-button"
          text="${this.t("update-rfc-profile-multistep-continue-button")}"
          @click="${this._confirmStep}">
        </bbva-button-default>
      </div>
    `}_renderFormOptions(){return a`
      ${this.listProducts.map((e=>a`
          <bbva-form-option value="${e.id}">
            <bbva-clip-card 
              class="form-select-item" 
              slot="clip"
              size="xs"
              variant=${e.typeCard}
              logo="bbva"
              card-type="visa">
            </bbva-clip-card>
                ${e.productName} ${e.numberCard}
          </bbva-form-option>
          `))}
    `}render(){return a`
      ${this._renderSelectForm()}
    `}}var q=s`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.button-continue {
  display: grid;
}

.contanier-header-group-cfdi-dummy {
  display: flex;
  justify-content: space-between;
}

.button-continue {
  padding-top: 1rem;
  padding-bottom: 1rem;
}
`;class N extends(c(h(p(O(t(i)))))){static get is(){return"bbva-step-confirm-cfdi"}static get scopedElements(){const e=[_,b,m,...N.configurationScopedElements()];return N.scopedElementsFromClasses(e)}static get properties(){return{totalCfdis:{type:Number},dataCfdi:{type:Array},dataParse:{type:Array},cfdisAvalible:{type:Number}}}constructor(){super(),this.totalCfdis=0,this.totalCfdisMax=5,this.dataParse=[],this.cfdisAvalible=0,this.dataCfdi=[]}static get styles(){return[q,r("bbva-step-confirm-cfdi-shared-styles")]}_confirmStep3(){this._fireEvent("complete"),this._fireEvent("reset-step-four-update-rfc"),this._fireEvent("send-analytic-app-step4"),this.totalCfdisMax=5}sliceDataCfdis(){return 5===this.totalCfdisMax&&this.cfdisAvalible>0?(this.dataParse=this.dataCfdi.slice(0,5),this.dataParse):10===this.totalCfdisMax&&this.cfdisAvalible>0?(this.dataParse=this.dataCfdi.slice(0,10),this.dataParse):15===this.totalCfdisMax&&this.cfdisAvalible>0?(this.dataParse=this.dataCfdi.slice(0,15),this.dataParse):20===this.totalCfdisMax&&this.cfdisAvalible>0?(this.dataParse=this.dataCfdi.slice(0,20),this.dataParse):(this.dataParse=this.dataCfdi,this.dataParse)}_formatDate(e){const t=this._formartStringToDate(e,"DD MMMM YYYY");let[s,i,r]=t.split(" ");return i=`${i.charAt(0).toUpperCase()}${i.slice(1)}`,`${s} ${i} ${r}`}_renderCfdiDummy(){return this.sliceDataCfdis(),a`
      ${this.dataParse.map((e=>a`
          <div id="renderCfdiDummy">
            <bbva-divider-default></bbva-divider-default>
                <div class="content-cfdi"></div>
                <bbva-type-text id="textValuePeriod" 
                  text="${this._formatDate(e.period)}" 
                  size="S" 
                  font-weight=500 ></bbva-type-text>
                <bbva-type-text id="textStatusAccount" text="${this.t("update-rfc-profile-multistep-confirm-cfdi-status-account")}" size="S"></bbva-type-text>
                <bbva-type-text id="textTaxFolio" text="${this.t("update-rfc-profile-multistep-confirm-cfdi-tax-folio")}" size="S"></bbva-type-text>
                <bbva-type-text text="${e.id}" size="S"></bbva-type-text>
            <bbva-divider-default></bbva-divider-default>
          </div>
        `))}`}makePagination(){this.totalCfdisMax+=5,this.cfdisAvalible-=5,this.sliceDataCfdis()}_renderHeaderCfdiDummy(){return a`
      <div id="headerGroupCfdiDummy">
        <bbva-type-text text="${this.t("update-rfc-profile-multistep-confirm-cfdi-description")}" size="S" ></bbva-type-text>
        <div class="contanier-header-group-cfdi-dummy">
          <bbva-type-text text="${`${this.t("update-rfc-profile-multistep-confirm-summary-cfdi")}`}" size="L" font-weight=500 ></bbva-type-text>
          <bbva-type-text text="${this.totalCfdis}" size="L" font-weight=500 ></bbva-type-text>
        </div>
        ${this._renderCfdiDummy()}
      </div>
    `}_renderStep3(){return this.cfdisAvalible>5?a`
      ${this._renderHeaderCfdiDummy()}
      <div id="containerButttons" class="button-continue">
        <bbva-button-default id="btnViewmoreCfdi" ambient="secondary" text="${this.t("update-rfc-profile-multistep-confirm-cfdi-view-more")}" @click = ${this.makePagination}></bbva-button-default>
        <bbva-button-default id="btnViewmoreCfdiContinue" text="${this.t("update-rfc-profile-multistep-continue-button")}" size="S" @click="${this._confirmStep3}"></bbva-button-default>
      </div>
      `:a`
      ${this._renderHeaderCfdiDummy()}
      <div id="containerButttons" class="button-continue">
        <bbva-button-default
          id="btnStepThreePeridCfdis"
          text="${this.t("update-rfc-profile-multistep-continue-button")}" 
          size="S" 
          @click="${this._confirmStep3}">
        </bbva-button-default>
      </div>`}render(){return a`
      ${this._renderStep3()}
    `}}var I=s`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.terms-conditions-check {
  padding-bottom: 1rem;
}
`;class H extends(c(h(p(O(t(i)))))){static get is(){return"bbva-step-terms-conditions"}static get properties(){return{isDisable:{type:Boolean},isChecked:{type:String}}}static get scopedElements(){const e=[b,$,m,...H.configurationScopedElements()];return H.scopedElementsFromClasses(e)}constructor(){super(),this.isDisable=!0,this.isChecked="false"}static get styles(){return[I,r("bbva-step-terms-conditions-shared-styles")]}resetProperties(){this.isDisable=!0,this.isChecked="false"}_formchecked(){this.isDisable=!this.isDisable}_confirmStep4(){this._fireEvent("complete"),this._fireEvent("send-analytic-app-step5")}_renderContentStep4(){return a`
      <bbva-type-text
        id="descriptionStepFour"
        text="${this.t("update-rfc-profile-multistep-terms-conditions-description")}" 
        size="S">
      </bbva-type-text>
      <bbva-form-checkbox
      id="checkBoxTermsConditions"
      class="terms-conditions-check"
      name="choice13"
      value="13"
      ?checked="${!this.isDisable}"
      .ariaChecked=${this.isChecked}
      @change="${this._formchecked}"
      label="${this.t("update-rfc-profile-multistep-terms-conditions-check")}"
    ></bbva-form-checkbox>
    
    <bbva-button-default
      id="btnStepFourContinue"
      text="${this.t("update-rfc-profile-multistep-continue-button")}" 
      size="S" 
      @click="${this._confirmStep4}"
      fullwidth
      ?disabled = ${this.isDisable}
    ></bbva-button-default>
    `}render(){return a`
    ${this._renderContentStep4()}
    `}}var B=s`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.font-italic {
  font-style: italic;
}
`;class j extends(h(p(t(i)))){static get is(){return"bbva-summary-steps-update-rfc"}static get scopedElements(){const e=[b,...j.configurationScopedElements()];return j.scopedElementsFromClasses(e)}static get properties(){return{currentStep:{type:String},selectProduct:{type:Object},messageSumaryContent:{type:String}}}constructor(){super(),this.currentStep="",this.selectProduct={},this.messageSumaryContent=""}static get styles(){return[B,r("bbva-summary-steps-update-rfc-shared-styles")]}_renderSummaryProduct(){return a`
      <div>
        <bbva-type-text tag="span" text="${this.selectProduct.typeAccount}" size="M" font-weight="700"></bbva-type-text>
        <bbva-type-text tag="span" class="font-italic" text="${this.selectProduct.termCuenta}" size="S" font-weight="200"></bbva-type-text>
      </div>
    `}_renderSummaryMessage(){return a`
      <bbva-type-text text="${this.messageSumaryContent}" size="15px" font-weight="350"></bbva-type-text>
    `}_renderSummary(){return a`
      ${"step-1"===this.currentStep?this._renderSummaryProduct():this._renderSummaryMessage()}
    `}render(){return a`
    ${this._renderSummary()}
   `}}var L=s`
:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

.simple-message {
  gap: 0.625rem;
  padding-top: 1.5rem;
  padding-bottom: 1.5rem;
}

.simple {
  margin-bottom: 1rem;
}
`;class V extends(c(h(p(O(t(i)))))){static get is(){return"success-page"}static get scopedElements(){const e=[g,m,b,v,y,S,x,f,...V.configurationScopedElements()];return V.scopedElementsFromClasses(e)}static get properties(){return{descriptionDocument:{type:String},statusOperation:{type:String},periodRange:{type:String},openPageSucces:{type:Boolean},closePageSuccess:{type:Boolean},totalCfdis:{type:Number},date:{type:Number},timeOptions:{type:Object}}}constructor(){super(),this.descriptionDocument="",this.statusOperation=this.t("update-rfc-header-title-main-success-page"),this.periodRange="",this.date=0,this.openPageSucces=!1,this.closePageSuccess=!1,this.timeOptions={day:"2-digit",month:"short",year:"numeric",hour:"2-digit",minute:"2-digit"},this.config={header:{variant:"modal-initial",text:this.t("update-rfc-header-title-main-success-page"),ambient:"primary-alt"}}}static get styles(){return[L,r("success-page-shared-styles")]}_onResetMultistep(){this._fireEvent("reset-all-multistep-update-rfc"),this._fireEvent("send-analytic-app-onclick-other")}_exitModal(){this._fireEvent("update-rfc-exit"),this._fireEvent("reset-multi-step-update-rfc")}_closeModal(){this._fireEvent("update-rfc-exit")}render(){return this.date=new Date,a`
      <bbva-help-modal
        id="modalSucces"
        header-text="${this.t("update-rfc-profile-multistep-modal-success-page-header-text")}"
        ?visible="${this.openPageSucces}"
        @help-modal-header-click="${()=>this._closeModal()}"
        @help-modal-footer-button-click="${()=>this._exitModal()}"
        @help-modal-footer-link-click="${()=>this._onResetMultistep()}"
        full-height
        header-type="modal"
        button-text="${this.t("update-rfc-profile-multistep-exit-modal-success-page-button")}"
        link-text="${this.t("update-rfc-profile-multistep-fix-other-modal-success-page-button")}"
      >
        <div slot="slot-content">
          <div class="content">
            <div>
              <bbva-clip-microillustration
              id="modalSuccessPageMicroillustration"
              ambient="primary"
              microillustration = "success"
              variant="M"
              ></bbva-clip-microillustration>
              <bbva-type-text 
              id="modalSuccessPageStatusOperation"
              text="${this.statusOperation}"
              variant="bold"
              size="XL"
              font-weight="700"
              ></bbva-type-text>
            </div>

            <div class="simple date">
              <bbva-type-text 
                id="modalSuccessPageSimpleDate"
                text="${this.t("update-rfc-profile-multistep-modal-success-page-date-text")}" 
                inherit>
              </bbva-type-text>
              <bbva-type-date
              id="modalSuccessPageContentDate"
              .options = "${this.timeOptions}" 
              date="${this.date}" 
              font-weight="500" 
              font-style="italic"
              inherit="" > </bbva-type-date>
            </div>

            <div id="modalSuccessPageContentSimplePeriod" class="simple">
              <bbva-type-text id="modalSuccessPageSimplePeriodText" inherit text="${this.t("update-rfc-profile-multistep-modal-success-page-period-text")}" ></bbva-type-text>
              <bbva-type-text id="modalSuccessPageSimplePeriodTextSecond" inherit font-weight=500 text="${this.periodRange}" ></bbva-type-text>
            </div>

            <div id="modalSuccessPageSimpleCfdiTotal" class="simple">
              <bbva-type-text id="modalSuccessPageSimpleCfdiTotalText" inherit text="${this.t("update-rfc-profile-multistep-modal-success-page-total-cdfi-request-text")}" ></bbva-type-text>
              <bbva-type-text id="modalSuccessPageSimpleCfdiTotalTextSecond" inherit font-weight=500 text="${this.totalCfdis}" ></bbva-type-text>
            </div>

            <div id="modalSuccessPageSimpleTypeCfdi" class="simple">
              <bbva-type-text id="modalSuccessPageSimpleTypeCfdiText" inherit text="${this.t("update-rfc-profile-multistep-modal-success-page-type-cfdi-text")}" ></bbva-type-text>
              <bbva-type-text id="modalSuccessPageSimpleTypeCfdiTextSecond" inherit font-weight=500 text="${this.descriptionDocument}: ${this.totalCfdis}"></bbva-type-text>
            </div>

            <div id="modalSuccessPageSimpleInfo">
              <bbva-type-text
                id="modalSuccessPageSimpleInfoText"
                text="${this.t("update-rfc-profile-multistep-modal-success-page-email-confirm-text")}" 
                size="S" 
                font-weight=350>
              </bbva-type-text>
            </div>

            <div id="modalSuccessPageSimpleMessage" class="simple-message">
              <bbva-notification-message
                  id="modalSuccessPageNotificationMessage"
                  icon="bbva:info">
                  ${this.t("update-rfc-profile-multistep-modal-success-page-notification-text")}
              </bbva-notification-message>
            </div>
          </div>
        </div>
      </bbva-help-modal>
    `}}var z=s`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.content-error {
  height: 20.5rem;
}

.button-error {
  height: 10rem;
  align-content: end;
}
`;class U extends(c(h(p(O(t(i)))))){static get is(){return"bbva-feature-update-rfc-exit-modal"}static get scopedElements(){const e=[f,...U.configurationScopedElements()];return U.scopedElementsFromClasses(e)}static get properties(){return{isOpenModal:{type:Boolean}}}constructor(){super(),this.isOpenModal=!1}static get styles(){return[z,r("update-rfc-without-cfdi-modal-shared-styles")]}closeModal(){this._fireEvent("hide-modal-exit")}_exitModal(){this._fireEvent("update-rfc-exit"),this._fireEvent("reset-multi-step-update-rfc")}render(){return a`
        <bbva-help-modal
          id="exitModal"
          ?visible="${this.isOpenModal}"
          header-text="${this.t("update-rfc-profile-multistep-modal-exit-header")}"
          modal-type="warning"
          title-text="${this.t("update-rfc-profile-multistep-modal-exit-title")}"
          title-icon="bbva:warning"
          body-text="${this.t("update-rfc-profile-multistep-modal-exit-body-text")}"
          @help-modal-close="${()=>this.closeModal()}"
          @help-modal-footer-button-click="${()=>this._exitModal()}"
          button-text="${this.t("update-rfc-profile-multistep-exit-modal-exit")}"
        >
        </bbva-help-modal>
    `}}class G extends(c(h(p(O(t(i)))))){static get is(){return"update-rfc-without-cfdi-period-modal"}static get scopedElements(){const e=[f,G.configurationScopedElements()];return G.scopedElementsFromClasses(e)}static get properties(){return{isOpenModal:{type:Boolean},iOSFixedHeader:{type:Boolean}}}constructor(){super(),this.isOpenModal=!1}static get styles(){return[z,r("update-rfc-without-cfdi-period-modal-shared-styles")]}closeModal(){this._fireEvent("header-main-icon-click",{typeModal:"modal-close"}),this._fireEvent("reset-prop-click"),this._fireEvent("on-reset-step-three")}veilClick(){this._fireEvent("reset-prop-click"),this._fireEvent("on-reset-step-three")}swipClose(){this._fireEvent("reset-prop-click"),this._fireEvent("on-reset-step-three")}render(){return a`
        <bbva-help-modal
          id="modalWithoutCfdiPeriod"
          ?i-o-s-fixed-header="${this.iOSFixedHeader}"
          ?visible="${this.isOpenModal}"
          header-text="${this.t("update-rfc-profile-multistep-modal-without-cfdi-perid-header")}"
          title-icon="bbva:info"
          body-text="${this.t("update-rfc-profile-multistep-modal-without-cfdi-perid-body-text")}"
          @help-modal-header-click=${()=>{this.closeModal()}}
          @help-modal-veil-click=${()=>{this.veilClick()}}
          @help-modal-swipe-close=${()=>{this.swipClose()}}
        >
        </bbva-help-modal>
    `}}class Y extends(c(h(p(O(t(i)))))){static get is(){return"update-rfc-operation-cancel"}static get scopedElements(){const e=[f,C,x,b,Y.configurationScopedElements()];return Y.scopedElementsFromClasses(e)}static get properties(){return{showSpinner:{type:Boolean},attemps:{type:Number},isOpenModal:{type:Boolean},iOSFixedHeader:{type:Boolean}}}constructor(){super(),this.showSpinner=!1,this.attemps=0,this.isOpenModal=!1,this.iOSFixedHeader=!1}static get styles(){return[z,r("update-rfc-operation-cancel-shared-styles")]}closeModal(){this._fireEvent("header-main-icon-click",{typeModal:"modal-close"}),this._fireEvent("reset-prop-click"),this._fireEvent("reset-step-three-update-rfc"),this.isOpenModal=!1}showProgressContent(){this.showSpinner=!0,this.isOpenModal=!1,setTimeout((()=>{this.showSpinner=!1}),4e3)}veilClick(){this._fireEvent("reset-step-three-update-rfc"),this._fireEvent("reset-prop-click")}swipeClose(){this._fireEvent("reset-step-three-update-rfc"),this._fireEvent("reset-prop-click")}onRetryModalSevice(){this._fireEvent("retry-service-tax-dcoument"),this._fireEvent("reset-step-three-update-rfc"),this._fireEvent("reset-prop-click"),this.isOpenModal=!1}retryModal(){this._countRetryServiceGet(),this.onRetryModalSevice()}_countRetryServiceGet(){this.attemps+=1,3===this.attemps&&this.showProgressContent()}fullModalCloseModal(){this._fireEvent("header-main-icon-click",{typeModal:"modal-close"}),this._fireEvent("reset-prop-click"),this._fireEvent("update-rfc-exit"),this.isOpenModal=!1}fullVeilClick(){this._fireEvent("reset-prop-click")}fullSwipeModal(){this._fireEvent("reset-prop-click")}_attempsServiceNotAvaiable(){return a`
    <bbva-help-modal
      id="middleModalServiceNotAvaiable"
      ?i-o-s-fixed-header="${this.iOSFixedHeader}"
      ?visible="${this.isOpenModal}"
      modal-type="warning"
      header-text="${this.t("update-rfc-profile-multistep-modal-cancel-operation-header")}"
      title-icon="bbva:warning"
      title-text="${this.t("update-rfc-profile-multistep-modal-cancel-operation-title")}"
      body-text="${this.t("update-rfc-profile-multistep-modal-cancel-operation-body-text")}"
      button-text="${this.t("update-rfc-profile-multistep-retry-button-modal")}"
      @help-modal-header-click=${e=>{this.closeModal(e)}}
      @help-modal-veil-click=${e=>{this.veilClick(e)}}
      @help-modal-swipe-close=${e=>{this.swipeClose(e)}}
      @help-modal-footer-button-click=${e=>{this.retryModal(e)}}
    >
    </bbva-help-modal>
      `}_errorServiceNotAvaiable(){return a`
    <bbva-help-modal
      id="fullModalServiceNotAvaiable"
      ?i-o-s-fixed-header="${this.iOSFixedHeader}"
      ?visible="${this.isOpenModal}"
      full-height
      header-text="${this.t("update-rfc-profile-multistep-modal-cancel-operation-header")}"
      @help-modal-close="${()=>this.attemps=0}"
      @help-modal-header-click=${()=>{this.fullModalCloseModal()}}
      @help-modal-veil-click=${()=>{this.fullVeilClick()}}
      @help-modal-swipe-close=${()=>{this.fullSwipeModal()}}
      @help-modal-footer-button-click=${()=>{this.resetPops()}}
    >
    <div slot="slot-content">
      <div>
        <div id="contentErrorFulllModal" class="content-error">
            <bbva-clip-microillustration
            id="fullModalServiceNotAvaiableMicroillustration"
            ambient="primary"
            microillustration="error"
            variant="M"
            ></bbva-clip-microillustration>

            <bbva-type-text id="fullModalServiceNotAvaiableSubTextOne" class="Text-error-case2" text="${this.t("update-rfc-profile-multistep-modal-cancel-operation-services-enabled")}"  variant="bold" font-weight=700 size="3XL"></bbva-type-text>

            <bbva-type-text id="fullModalServiceNotAvaiableSubTextTwo" class="Text-error-case2" text="${this.t("update-rfc-profile-multistep-modal-cancel-operation-retry-text")}" font-weight=350 ></bbva-type-text>
        </div>
      </div>  
    </div>
    </bbva-help-modal>`}render(){return this.attemps<3?a`
    ${this._attempsServiceNotAvaiable()}`:a`
    <bbva-progress-content id="progressContentOperationCancel" ?visible="${this.showSpinner}"></bbva-progress-content>
    ${this._errorServiceNotAvaiable()}`}}class J extends(c(h(p(O(t(i)))))){static get is(){return"update-rfc-failed-operation"}static get scopedElements(){const e=[f,x,b,m,J.configurationScopedElements()];return J.scopedElementsFromClasses(e)}static get properties(){return{attemps:{type:Number},isOpenModal:{type:Boolean},phoneLineBbva:{type:String},iOSFixedHeader:{type:Boolean}}}constructor(){super(),this.attemps=0,this.isOpenModal=!1,this.iOSFixedHeader=!1,this.phoneLineBbva="5552262663"}static get styles(){return[z,r("update-rfc-failed-operation-shared-styles")]}resetPops(){this._fireEvent("reset-prop-click"),this.isOpenModal=!1}closeModal(){this._fireEvent("header-main-icon-click",{typeModal:"modal-close"}),this._fireEvent("reset-prop-click")}veilClick(){this._fireEvent("reset-prop-click"),this._fireEvent("on-reset-step-three")}swipClose(){this._fireEvent("reset-prop-click"),this._fireEvent("on-reset-step-three")}onRetryFielOperation(){this.attemps+=1,this._fireEvent("retry-service-cancelation-rebranding"),this.resetPops()}_exitUpdateRfc(){this._fireEvent("update-rfc-exit")}_exitUpdateRfcHeader(){this._fireEvent("header-main-icon-click",{typeModal:"modal-close"}),this._fireEvent("update-rfc-exit")}callBbva(){this._fireEvent("call-line-bbva",{value:this.phoneLineBbva})}_attempsOperationCanceled(){return a`
    <bbva-help-modal
      id="middleModalOperationCanceled"
      ?i-o-s-fixed-header="${this.iOSFixedHeader}"
      ?visible="${this.isOpenModal}"
      modal-type="warning"
      header-text="${this.t("update-rfc-profile-multistep-modal-field-operation-header")}"
      title-icon="bbva:warning"
      title-text="${this.t("update-rfc-profile-multistep-modal-field-operation-title")}"
      body-text="${this.t("update-rfc-profile-multistep-modal-field-operation-body-text")}"
      button-text="${this.t("update-rfc-profile-multistep-retry-button-modal")}"
      @help-modal-header-click=${()=>{this.closeModal()}}
      @help-modal-veil-click=${()=>{this.veilClick()}}
      @help-modal-swipe-close=${()=>{this.swipClose()}}
      @help-modal-footer-button-click=${()=>{this.onRetryFielOperation()}}
      >
    </bbva-help-modal>
      `}_errorOperationCanceled(){return a`
    <bbva-help-modal
      id="fullModalOperationCanceled"
      ?i-o-s-fixed-header="${this.iOSFixedHeader}"
      ?visible="${this.isOpenModal}"
      full-height
      header-text="Error"
      @help-modal-header-click=${()=>{this._exitUpdateRfcHeader()}}
    >
    <div slot="slot-content">
      <div>
        <div class="content-error">
          <bbva-clip-microillustration
          id="modalMicroillustrationFailedOperation"
          ambient="primary"
          microillustration="error"
          variant="M"
          ></bbva-clip-microillustration>
          <bbva-type-text id="modalTextSubtitleMessage" class="Text-error-case2" text="${this.t("update-rfc-profile-multistep-modal-field-operation-title")}"  variant="bold" font-weight=700 size="3XL"></bbva-type-text>
          <bbva-type-text id="modalTextMessage" class="Text-error-case2" text="${this.t("update-rfc-profile-multistep-modal-field-operation-body-text-subtitle")}"  font-weight=350 ></bbva-type-text>
        </div>
        <div class="button-error">
          <bbva-button-default 
            fullwidth
            id="btnFullModalOperationCanceledCalledBbva" 
            text="${this.t("update-rfc-profile-multistep-modal-field-operation-body-btn-called-bbva")}" 
            @click=${()=>this.callBbva()}>
          </bbva-button-default>
          <bbva-button-default
            id="btnFullModalOperationCanceledExit" 
            text="${this.t("update-rfc-profile-multistep-exit-modal-exit")}" 
            fullwidth 
            variant="link" 
            @click="${()=>this._exitUpdateRfc()}">
          </bbva-button-default>
        </div>
      </div>
    </div>
  </bbva-help-modal>
`}render(){return this.attemps<3?a`
    ${this._attempsOperationCanceled()}`:a`
     ${this._errorOperationCanceled()}`}}var K=s`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.iosPadding-variant-header {
  padding-top: 7rem;
}

.toast-notification p {
  margin: 0;
}

.confirm-step {
  background-color: white;
  width: 100%;
  padding: 1.5rem 1rem 1.5rem;
}
.confirm-step [data-tag-name=bbva-button-default] {
  margin-top: 0.5rem;
  color: --_button-default-positive-color-active;
}
`;class X extends(c(h(p(O(t(i)))))){static get is(){return"bbva-feature-update-rfc"}static globalScopedElements(){return[b,g,T,R,u,m,E,C,F,k,N,H,V,j,U,G,Y,J,...X.configurationScopedElements()]}static get scopedElements(){return X.scopedElementsFromClasses(this.globalScopedElements())}static get properties(){return{contentSummaryStep:{type:Object},_selectedPeriod:{type:Object},_selectedProduct:{type:String},_isShowExitModal:{type:Boolean},_isFailedOperation:{type:Boolean},_isOperationCanceled:{type:Boolean},_isWithoutCfdi:{type:Boolean},_isNotCfdiPeriod:{type:Boolean},_showSuccesPage:{type:Boolean},unmasked:{type:Boolean},_contractSelected:{type:Object},dataResponseTaxDocuments:{type:Array},_totalElementsCfdis:{type:Number},_totalPages:{type:Number},_messageSummaryContent:{type:String},_typeDocument:{type:String},legalName:{type:String},rfcCustomer:{type:String},codePostalCustomer:{type:String},idTaxRegimes:{type:String},useCfdi:{type:String},customerId:{type:String},fileName:{type:String},fileReference:{type:String},emailCustomer:{type:String},summaryTermsConditions:{type:String},summarySelectPeriod:{type:String},numberCustomer:{type:String},isIos:{type:Boolean}}}constructor(){super(),this.summaryTermsConditions="update-rfc-profile-multistep-summary-terms-conditions",this.summarySelectPeriod="update-rfc-profile-multistep-summary-select-period",this.config={loader:!0,header:{variant:"modal-initial",text:this.t("update-rfc-header-title-main"),ambient:"primary-alt",closeIconAriaLabel:"close update rfc"}},this._selectedProduct="",this._selectedPeriod={},this._isShowExitModal=!1,this._isFailedOperation=!1,this._isOperationCanceled=!1,this._isWithoutCfdi=!1,this._isNotCfdiPeriod=!1,this._showSuccesPage=!1,this.unmasked=!1,this.isIos=!1,this._contractSelected={},this._totalElementsCfdis=0,this._totalPages=0,this.dataResponseTaxDocuments=[],this._messageSummaryContent="",this._typeDocument="",this.legalName="",this.rfcCustomer="",this.codePostalCustomer="",this.idTaxRegimes="",this.useCfdi="",this.customerId="",this.fileName="",this.fileReference="",this.emailCustomer="",this.numberCustomer="",this.addEventListener("header-main-icon-click",(()=>this._showModal())),this.addEventListener("reset-all-multistep-update-rfc",(()=>this.initPage())),this.addEventListener("reset-step-two-update-rfc",(()=>this.shadowRoot.getElementById("step2").completed=!1)),this.addEventListener("reset-step-three-update-rfc",(()=>this.shadowRoot.getElementById("step3").completed=!1)),this.addEventListener("reset-step-four-update-rfc",(()=>this.shadowRoot.getElementById("step4").completed=!1))}static get styles(){return[K,r("bbva-feature-update-rfc-shared-styles")]}initPage(){this.showVeil(),this._resetMultiStep(),this.hideVeil()}_resetMultiStep(){this._resetProperties(),this._resetNodesSteps()}_resetProperties(){this.isLostConnection=!1,this.config={loader:!0,header:{variant:"modal-initial",text:this.t("update-rfc-header-title-main"),ambient:"primary-alt"}},this._selectedProduct="",this.getBbvaHeaderMain.className="",this.getBbbvaMultiStep.className="",this._selectedPeriod={},this._isShowExitModal=!1,this._isFailedOperation=!1,this._isOperationCanceled=!1,this._isWithoutCfdi=!1,this._isNotCfdiPeriod=!1,this._showSuccesPage=!1,this.unmasked=!1,this._contractSelected={},this._resetServicesTaxDocument(),this._resetSteps(),this.summaryTermsConditions="update-rfc-profile-multistep-summary-terms-conditions",this.summarySelectPeriod="update-rfc-profile-multistep-summary-select-period"}_resetSteps(){this.shadowRoot.querySelector("#bbvaStepSelectionProduct").resetProperties();this.shadowRoot.querySelector("#bbvaStepSelectionPeriod").resetProperties();this.shadowRoot.querySelector("#bbvaStepTermsConditions").resetProperties()}_resetServicesTaxDocument(){this._totalElementsCfdis=0,this._totalPages=0,this.dataResponseTaxDocuments=[],this._messageSummaryContent="",this._typeDocument="",this.fileName="",this.fileReference="",this.numberCustomer=""}_resetNodesSteps(){const e=this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]');Array.prototype.slice.call(e).forEach((e=>{const t=e;return t.completed=!1,t.disabled=!0,t}));const t=this.shadowRoot.querySelector("#step1");t.disabled=!1,t.active=!0,this._removeBackgroundBlue()}_removeBackgroundBlue(){this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]').removeAttribute("edition-enabled")}get getBbvaHeaderMain(){return this.shadowRoot.querySelector('[data-tag-name="bbva-header-main"]')}get getBbbvaMultiStep(){return this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]')}openModalSuccesPage(){this._showSuccesPage=!this._showSuccesPage}_changeHeaderAmbient(){this.config.header.variant="modal-initial-secondary",this.requestUpdate()}_showModal(){this.getBbbvaMultiStep._allCompleted&&this._showSuccesPage||(this._isShowExitModal=!this._isShowExitModal)}_chengeCompleteStepOne(){this.contentSummaryStep={},this._fireEvent("reset-step-two-update-rfc"),this._fireEvent("reset-step-three-update-rfc"),this._fireEvent("reset-step-four-update-rfc"),this._removeBackgroundBlue()}_chengeCompleteStepTwo(){this._fireEvent("reset-step-three-update-rfc"),this._fireEvent("reset-step-four-update-rfc"),this._removeBackgroundBlue()}_chengeCompleteStepthree(){this._fireEvent("reset-step-four-update-rfc"),this._removeBackgroundBlue()}_modals(){return a`
      <bbva-feature-update-rfc-exit-modal
        @hide-modal-exit="${()=>this._isShowExitModal=!1}"
        ?isOpenModal="${this._isShowExitModal}">
      </bbva-feature-update-rfc-exit-modal>

      <update-rfc-failed-operation
      ?isOpenModal="${this._isFailedOperation}"
      @retry-service-cancelation-rebranding="${()=>this.requestCancelationRebranding()}"
      @reset-prop-click="${()=>this._isFailedOperation=!1}"
      ></update-rfc-failed-operation>

      <update-rfc-operation-cancel
      ?isOpenModal = "${this._isOperationCanceled}"
      @reset-step-three-update-rfc=${()=>this._onRetryTaxDocument()}
      @reset-prop-click="${()=>this._isOperationCanceled=!1}"
      @retry-service-tax-dcoument=${()=>this.requestTaxDocuments()}
      ></update-rfc-operation-cancel>

      <update-rfc-without-cfdi-period-modal
      ?isOpenModal = "${this._isNotCfdiPeriod}"
      @on-reset-step-three=${()=>this._onRetryTaxDocument()}
      @reset-prop-click="${()=>this._isNotCfdiPeriod=!1}"
      ></update-rfc-without-cfdi-period-modal>
    `}_onRetryTaxDocument(){const e=this.shadowRoot.querySelector("#step3");e.completed=!1,e.disabled=!1,e.active=!1;const t=this.shadowRoot.querySelector("#step2");t.active=!0,t.disabled=!1,t.completed=!1}showVeil(){this._fireEvent("profile-update-rfc-open-veil")}hideVeil(){this._fireEvent("profile-update-rfc-close-veil")}showToast(){const{isShowToast:e,messageToast:t,typeToast:s}=this.configToast;return a`
      <bbva-notification-status
        id="toastLostConection"
        ?hide="${e}"
        status="${s}"
        fixed-bottom
        transition-translate-y
        text="${t}">
      </bbva-notification-status>
    `}responseTaxDocuments(e){if(e){const{data:t,pagination:s}=e;this.dataResponseTaxDocuments=t,this._typeDocument=t[0].documentType.description,this._totalPagesCfdis=s.totalPages,this._totalElementsCfdis=s.totalElements,this.numberCustomer=t[0].customer.account.number}}requestTaxDocuments(){var e,t;return{"customer.identityDocument.documentNumber":this.rfcCustomer,"customer.account.number":this._selectedProduct,isGeneric:!1,fromDate:null===(e=this._selectedPeriod)||void 0===e?void 0:e.fromDate,toDate:null===(t=this._selectedPeriod)||void 0===t?void 0:t.toDate,"documentType.id":"EDC"}}templateBodyPostTax(){this.listaDeCfdis=this.dataResponseTaxDocuments.map((e=>({id:e.id,documentType:{id:"EDC"},cfdi:this.useCfdi,fileName:e.fileName,fileReference:e.fileReference,customer:{id:this.customerId,legalName:this.legalName,account:{number:this.numberCustomer},identityDocument:{documentType:{id:"RFC"},documentNumber:this.rfcCustomer},address:{location:{addressComponents:[{componentTypes:["POSTAL_CODE"],code:this.codePostalCustomer}]}},contactDetails:[{contact:{contactDetailType:"EMAIL",address:this.emailCustomer}}],taxRegime:{id:this.idTaxRegimes}}})))}bodyRequestPostTax(){const e={};return e.root=this.listaDeCfdis,this.requestBody=e,this.requestBody}requestCancelationRebranding(){this.fireEventForAnalytics("app-stepSix"),this.templateBodyPostTax(),this.bodyRequestPostTax(),this.requestBody}_setCurrentContract(e){var t;const s=null===(t=e.detail)||void 0===t?void 0:t.productSelect;if(s){const{numberCard:e,productName:t}=s;this._contractSelected={termCuenta:e,typeAccount:t}}}_setProductSelected(e){var t;const s=null===(t=e.detail)||void 0===t?void 0:t.productNumber;s&&(this._selectedProduct=s.value)}_renderStep1(){return a`
        <bbva-expandable-step
            id="step1"
            step="1"
            disabled-target=".action"
            show-link
            edit-label="${this.t("update-rfc-profile-multistep-modify-step")}"
            header="${this.t("update-rfc-profile-multistep-header-step-selelect-product")}"
            @expandable-step-complete-change="${this._chengeCompleteStepOne}"
            @send-selected-product="${e=>this._setProductSelected(e)}"
            @send-summary-content-step-one="${e=>this._setCurrentContract(e)}"
            @send-analytic-app-started = "${()=>this.fireEventForAnalytics("app-started")}"
            @send-analytic-app-step2 = "${()=>this.fireEventForAnalytics("app-stepTwo")}"
            >
            <div class="content">
            <bbva-step-selection-product
              id="bbvaStepSelectionProduct"
              .listProducts=${this.LitsContracts}>
            </bbva-step-selection-product>
            </div>
            <div class="summary" slot="summary">
              <bbva-summary-steps-update-rfc 
                currentStep="step-1"
                .selectProduct="${this._contractSelected}"
                messageSumaryContent=""
              ></bbva-summary-steps-update-rfc>
            </div>
          </bbva-expandable-step>
    `}_renderStep2(){return a`
      <bbva-expandable-step
        id="step2"
        step="2"
        header="${this.t("update-rfc-profile-multistep-header-step-select-period")}"
        show-link
        @expandable-step-complete-change="${this._chengeCompleteStepTwo}"
        edit-label="${this.t("update-rfc-profile-multistep-modify-step")}">
        <div class="content">
          <bbva-step-selection-period
            id="bbvaStepSelectionPeriod"
            @send-selected-period="${e=>{this._selectedPeriod=e.detail,this.requestTaxDocuments()}}"
            @send-message-summary-step-two="${e=>{var t;this._messageSummaryContent=null==e||null===(t=e.detail)||void 0===t?void 0:t.message}}">
          </bbva-step-selection-period>
        </div>
        <div class="summary" slot="summary">
          <bbva-summary-steps-update-rfc
            currentStep="step-2"
            messageSumaryContent= "${this._messageSummaryContent}"
          ></bbva-summary-steps-update-rfc>
        </div>
      </bbva-expandable-step>
    `}_renderStep3(){return a`
        <bbva-expandable-step
          id="step3"
          step="3"
          header="${this.t("update-rfc-profile-multistep-header-step-select-confirm-cfi")}"
          show-link
          @expandable-step-complete-change="${this._chengeCompleteStepthree}"
          edit-label="${this.t("update-rfc-profile-multistep-modify-step")}">
          <div class="content">
            <bbva-step-confirm-cfdi
              .dataCfdi ="${this.dataResponseTaxDocuments}"
              .totalCfdis = "${this._totalElementsCfdis}"
              .cfdisAvalible = "${this._totalElementsCfdis}"
              @send-analytic-app-step4 = "${()=>this.fireEventForAnalytics("app-stepFour")}"
            ></bbva-step-confirm-cfdi>
        </div>
          <div class="summary" slot="summary">
            <bbva-summary-steps-update-rfc
              currentStep="step-3"
              messageSumaryContent="${this.t(this.summarySelectPeriod)} ${this._totalElementsCfdis}"
            > </bbva-summary-steps-update-rfc>
          </div>
        </bbva-expandable-step>
      `}_renderStep4(){return a`
      <bbva-expandable-step
        id="step4"
        step="4"
        header="${this.t("update-rfc-profile-multistep-header-step-terms-conditions")}"
        show-link
        edit-label="${this.t("update-rfc-profile-multistep-modify-step")}">
        <div class="content">
          <bbva-step-terms-conditions
          id="bbvaStepTermsConditions"
          @send-analytic-app-step5 = "${()=>this.fireEventForAnalytics("app-stepFive")}"
          ></bbva-step-terms-conditions>
        </div>
        <div class="summary" slot="summary">
        <bbva-summary-steps-update-rfc
          currentStep="step-4"
          messageSumaryContent="${this.summaryTermsConditions}"
        ></bbva-summary-steps-update-rfc>
        </div>
      </bbva-expandable-step>
    `}succesPage(){return a`
      <success-page 
        .openPageSucces = "${this._showSuccesPage}"
        totalCfdis= "${this._totalElementsCfdis}"
        descriptionDocument = "${this._typeDocument}"
        .periodRange = "${this._messageSummaryContent}"
        @send-analytic-app-onclick-other = "${()=>this.fireEventForAnalytics("app-onclick-other")}"
      ></success-page>
    `}_taxDocumentsTemplate(){return a``}render(){return a`
    <div slot="slot-content">
      ${super.render()}
      ${this._taxDocumentsTemplate()}
      <bbva-expandable-multistep
        @change-header-ambient=${this._changeHeaderAmbient}>
          <div slot="content">
            ${this._renderStep1()}
            ${this._renderStep2()}
            ${this._renderStep3()}
            ${this._renderStep4()}
          </div>
          <div class="confirm-step" slot="confirmation" >
            <bbva-button-default
              id="btnConfirmStep"
              fullwidth
              variant="positive"
              text="${this.t("update-rfc-profile-multistep-confirm-button")}"
              class="button"
              @click="${this.requestCancelationRebranding}">
              </bbva-button-default>
            </div>
      </bbva-expandable-multistep>
      ${this.succesPage()}
      ${this._modals()}
      ${this.showToast()}
  </div> 
  <slot name="slot-content"></slot>
  `}}class W{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(e,t){if(null===this)throw new TypeError('"this" is null or not defined');let s=Object(this),i=s.length>>>0;if(0===i)return!1;let r=0|t,a=Math.max(r>=0?r:i-Math.abs(r),0);for(;a<i;){if((o=s[a])===(n=e)||"number"==typeof o&&"number"==typeof n&&isNaN(o)&&isNaN(n))return!0;a++}var o,n;return!1}}),String.fromCodePoint||function(e){var t=function(t){for(var s=[],i=0,r="",a=0,o=arguments.length;a!==o;++a){var n=+arguments[a];if(!(n<1114111&&n>>>0===n))throw RangeError("Invalid code point: "+n);n<=65535?i=s.push(n):(n-=65536,i=s.push(55296+(n>>10),n%1024+56320)),i>=16383&&(r+=e.apply(null,s),s.length=0)}return r+e.apply(null,s)};try{Object.defineProperty(String,"fromCodePoint",{value:t,configurable:!0,writable:!0})}catch(e){String.fromCodePoint=t}}(String.fromCharCode)}_error(e=0,t="",s=null){throw e=`0000${e=e.toString()}`.substr(e.length),Error(`BGADP_ERROR_${e} :: ${t} :: ${s&&s.message}`)}}class Q extends W{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(e="",t=""){if("string"==typeof e&&e)if(this._reservedKeys.includes(e))this._error(2,`"${e}" should NOT be a reserved key`);else{if("string"!=typeof t)try{t=JSON.stringify(t)}catch(e){this._error(1,`"${t}" couldn't be transformed into String`)}t=t.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[e]=t}else this._error(3,"Missing {item} parameter")}getItem(e=""){return this._items[e]?this._items[e]:null}removeItem(e=""){this._items.hasOwnProperty(e)&&delete this._items[e]}clear(){Object.keys(this._items).length&&(this._items={})}}const Z=0,ee=1,te="jwt",se="tsec",ie="none";class re extends W{constructor(e=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Z,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(e),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let e={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(e).forEach((t=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!1,value:e[t],writable:"_headers"!==t})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Q,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((e,t)=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!0,value:t})}),this)}_assignConfigValues(e=null){null!=e&&"object"==typeof e&&Object.keys(e).forEach((t=>{if(this.hasOwnProperty(t)&&"_"!==t.charAt(0)&&"function"!=typeof this[t])if("object"==typeof this[t])Array.isArray(e[t])?this[t]=Array.from(e[t]):null===this[t]?this[t]=e[t]:this[t]=Object.assign(this[t]||{},e[t]);else this[t]=e[t];else"signatureRequiredErrors"===t?this._ERROR_CODES.SIGNATURE_REQUIRED=e[t]:"signatureInvalidErrors"===t?this._ERROR_CODES.SIGNATURE_INVALID=e[t]:"signatureFirstErrorCode"===t?this._ERROR_CODES.SIGNATURE_FIRST_STEP=e[t]:"pendingProcessResponseErrors"===t?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=e[t]:"signatureInvalidStatus"===t?this._STATUS_CODES.SIGNATURE_INVALID=e[t]:"pendingProcessResponseStatus"==t?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=e[t]:"getTokenHandlerKey"===t?this.getTokenHandlerKey=e[t]:("function"==typeof this[t]&&this._error(1,`${t} is a class method, can't be override`),"_"===t.charAt(0)&&this._error(2,`"${t}" is a restricted property, can't be override`),this.hasOwnProperty(t)||this._error(3,`"${t}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=se:this.requiredToken=ie,this.requiresJWT=!1):this.requiredToken===se?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===te?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===ie?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(se)}_setJwtHandler(){this._setTokenHandler(te)}_setTokenHandler(e){const t=`${e}Handler`;this[t]=this[t]||window.sessionStorage;try{this[t].setItem("test","test"),this[t].removeItem("test")}catch(e){this._error(4,`Invalid [${t}]. If not specified, default window.sessionStorage can't be written/read`,e)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(e=""){e&&"string"==typeof e?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:e,writable:!1}):this._error(6,"[path] is required")}_buildPromise(e=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let t={isPending:!0};t.promise=new window.Promise(((s,i)=>{t=Object.assign(t,{resolve:s,reject:i}),this._buildRequest(e)})),this._promise=Object.assign({},t)}return this._promise.promise}_defaultXHR(e=""){let t=new window.XMLHttpRequest;if(t instanceof window.XMLHttpRequest){t.withCredentials=this.withCredentials,t.timeout=1e3*this.timeout,t.onreadystatechange=this._onReadyStateChange.bind(this),t.responseType=this.responseType,t.open(this.method.toUpperCase(),e);let s=this._getRequestHeaders();Object.keys(s).forEach((e=>{this.forceBoundary&&this.multipart&&"Content-Type"===e||t.setRequestHeader(e,s[e])})),t.send(this._buildBody())}return t}_nativeXHR(e=""){let t=this._buildNativeRequest();return t?(t=t[this.method.toLowerCase()],"function"==typeof t?t=t({url:e,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),t}_buildNativeRequest(){let e=null;return!!window.CellsNativePlugins&&(e=d),e}_buildRequest(e=!1){let t=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const e={url:t,path:this._path,method:this.method};this._emitRequestEvent("start",e)}if(!e&&this._cacheItem&&t===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!e&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:t,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(t);break;case this._NATIVE_XHR:this._request=this._nativeXHR(t)}return this._request}_buildURL(){let e=[this.host,this._path].join("/");if(null!==this.params){let t=Object.assign({},this.params);-1!==e.lastIndexOf("{")&&(e=e.replace(/(\{[\w\-]+\})/g,(e=>{let s=e.replace(/[\{\}]+/g,""),i=t[s];return i?delete t[s]:this._error(9,`Missing ${s} param value`),i})),-1!==e.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let s=Object.keys(t);s.length&&(e=[e,s.map((e=>{let s=t[e];return Array.isArray(s)&&this.paramArrayMode===ee?this._arrayToQueryParam(e,s):`${e}=${s}`})).join("&")].join("?"))}return e}_arrayToQueryParam(e,t){return t.map((t=>`${e}=${t}`)).join("&")}_getRequestHeaders(){let e=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(e=this._getTokenForRequestHeaders(se,e)),!0===this.requiresJWT&&(e=this._getTokenForRequestHeaders(te,e)),!0===this.semaasMonitoring){let t=this._getSemaasHeaders();Object.assign(e,t)}const t=this._getCustomHeaders();return Object.assign(e,t),e}_getSemaasHeaders(){var e={};if(window.sessionStorage){var t=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(s){var i=t.getItem(s);i&&"null"!==i&&(e[s]=i)}))}return e}_getCustomHeaders(){const e="x-bgadp-";let t={};if(window.sessionStorage){const s=window.sessionStorage;t=Object.keys(s).filter((t=>t.startsWith(e))).reduce(((t,i)=>(t[i.replace(e,"")]=s.getItem(i),t)),{})}return t}_getTokenForRequestHeaders(e,t){const s=`${e}Handler`,i=e===te?"JWT ":"",r=e===te?"Authorization":se;if(void 0===this[s]||null===this[s])this._error(11,`${e} handler is undefined`);else{const a=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):e;let o=this[s].getItem(a);o?t[r]=t[r]||i+o:this._error(12,`Missing '${e}' value`)}return t}_buildBody(){let e=this.body;if(e&&this._xhrType===this._DEFAULT_XHR){let t=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===t){let t=[];Object.keys(e).forEach((s=>{t.push(`${s}=${e[s]}`)})),e=t.join("&")}else this.headers&&-1!==t.indexOf("multipart/")||(e=JSON.stringify(e))}return e}_onReadyStateChange(){let e=this._request;if(e&&e.readyState===window.XMLHttpRequest.DONE)switch(e.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(e);break;default:this._onRequestFail(e)}}_extractRequestResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)t={result:t};else if(t&&t instanceof ArrayBuffer)try{const e=this._decode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else if(t&&"string"==typeof t)try{t=JSON.parse(t)}catch(e){t=null}return t}async _extractRequestErrorResponse(e=null){let t=null!==e?e.response:e;if(t&&t instanceof window.Blob)try{const e=await this._blobDecode(t);try{t=JSON.parse(e)}catch(s){t={result:e,originalResponse:t}}}catch(e){t=null}else t=this._extractRequestResponse(e);return t}_blobDecode(e){const t=new FileReader;let s;const i=new Promise(((e,t)=>{s=(s,i)=>{s?t(s):e(i)}}));return t.addEventListener("loadend",(function e(i){t.removeEventListener("loadend",e),i.error?s(i.error):s(null,t.result)})),t.readAsText(e),i}_decode(e){let t;if("function"==typeof TextDecoder){t=new TextDecoder("utf-8").decode(e)}else{let s=0;for(;s<e.length;){let i=e[s],r=0,a=0;if(i<=127?(r=0,a=255&i):i<=223?(r=1,a=31&i):i<=239?(r=2,a=15&i):i<=244&&(r=3,a=7&i),e.length-s-r>0){let t=0;for(;t<r;)i=e[s+t+1],a=a<<6|63&i,t+=1}else a=65533,r=e.length-s;t+=String.fromCodePoint(a),s+=r+1}}return t}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let e=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(e=window.btoa(e)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,e);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,e);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,e);case this._CACHE_NONE:}}catch(e){this._error(13,`Can't write into cache engine: ${e.message}`,e)}}_retrieveFromCache(){let e;try{switch(this._cache){case this._CACHE_MEMORY:e=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:e=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:e=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(e){this._error(14,"Can't read from cache engine",e)}return e&&(this.encodeCache&&(e=window.atob(e)),"string"==typeof e&&/[\{\[]/.test(e.charAt(0))&&(e=JSON.parse(e))),e}_setLastResponse(e=null){e&&(this._lastResponse=Object.assign({},e))}_setLastResponseHeaders(e=null){let t={};e&&(e instanceof window.XMLHttpRequest?t=this._parseResponseHeadersToObject(e.getAllResponseHeaders()):e.headers&&(t=JSON.parse(e.headers))),this._lastResponseHeaders=t}_parseResponseHeadersToObject(e){let t={},s=e.trim().split(/[\r\n]+/);for(const e in s)if(s.hasOwnProperty(e)&&""!==s[e]){let i=": ",r=s[e].split(i);t[r.shift().toLowerCase()]=r.join(i)}return t}_onRequestSuccess(e=null){this._setLastResponse(this._extractRequestResponse(e)),this._setLastResponseHeaders(e),this.jwtHandler&&this._storeToken(this.jwtHandler,e,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,e,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",e)}_storeToken(e,t,s,i){let r=null;switch(this._xhrType){case this._DEFAULT_XHR:t&&t.getAllResponseHeaders&&t.getResponseHeader&&t.getAllResponseHeaders().indexOf(i)>=0&&(r=t.getResponseHeader(i));break;case this._NATIVE_XHR:t&&t.headers&&(r=JSON.parse(t.headers)[i])}if(r){const t=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):s;e.getItem(t)!==r&&(e.setItem(t,r),this._emitTokenUpdate(s,r))}}_emitTokenUpdate(e,t){if(this.htmlContext){const s=new CustomEvent("token-update",{bubbles:!0,detail:{type:e,token:t}});this.htmlContext.dispatchEvent(s)}}_emitRequestEvent(e,t){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${e}`,{bubbles:!0,composed:!0,detail:{metadata:t}})):console.warn(`Missing htmlContext to dispatch event http-request-${e}`)}_onRequestFail(e=null){(async()=>{if(!this._isSignatureRequired(e)&&!this._isWaitingForProcessResponse(e)){let t=await this._extractRequestErrorResponse(e);this._setLastResponse(t),this._setLastResponseHeaders(e),this._onRequestEnd("reject",e)}})()}_onRequestEnd(e="resolve",t=null){if(this._resetDPState(),this.emitRequestEvents){const e={method:this.method,path:this._path};null!==t&&(e.status=t.status,e.url=t.responseURL),this._emitRequestEvent("end",e)}this._promise&&"function"==typeof this._promise[e]&&(this._promise.isPending=!1,this._promise[e](t))}_resetDPState(){["Data","Type","State"].forEach((e=>{let t=`Authentication${e}`;this._headers&&this._headers.hasOwnProperty(t)&&delete this._headers[t],this.headers&&this.headers.hasOwnProperty(t)&&delete this.headers[t]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(e=null){let t,s,i,r,a;if(e instanceof window.XMLHttpRequest)t=e.getResponseHeader("AuthenticationType"),s=e.getResponseHeader("AuthenticationData"),i=e.getResponseHeader("AuthenticationState"),r=e.getResponseHeader("AuthenticationChallenge"),a=e.getResponseHeader("AuthenticationResponse");else{let o=JSON.parse(e.headers);t=o.authenticationtype,s=o.authenticationdata||null,i=o.authenticationstate,r=o.authenticationchallenge,a=o.authenticationresponse}return{type:t,data:s,state:i,challenge:r,response:a}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureTypeChange(e,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:e=>{this._onSignatureValueChange(e,...arguments)}})}_onSignatureTypeChange(e="",t="",s=""){if("string"==typeof e&&""!==e)if(t.includes(e)){if("string"==typeof e&&""!==e){const i=this._getSignatureData(e,t,s);this.headers=Object.assign(this.headers||{},{AuthenticationType:e,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${e} is not a valid signature type`);"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(e=null,t="",s="",i=""){let r;if("object"==typeof e&&e){const a=this._getSignatureData(e.signatureType,t,s);r=this._makeKeyValuePairFromObject(a,e.signatureValue),e.challenge&&(r+=`,challenge=${e.challenge}`),this._buildSignatureHeaders(r,e.signatureType,i)}else"string"==typeof e&&""!==e&&(this._hasSignatureAuthenticationType(t,"2")?(r=`password=${e}`,this._buildSignatureHeaders(r,"2",i)):(r=`${s}=${e}`,this._buildSignatureHeaders(r,t,i)));"boolean"==typeof e&&!1===e&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(e="",t=""){if(!e)return"";let s,i=e.split(",");if(i.length>1){s=i.map((e=>`${e}=${t[e]}`)).join(",")}else s=`${e}=${t}`;return s}_hasSignatureAuthenticationType(e,t){return-1!==e.split(";").findIndex((e=>e===t))}_buildSignatureHeaders(e="",t="",s=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:e,AuthenticationType:t||""}),s&&(this.headers=Object.assign(this.headers,{AuthenticationState:s})),this._buildRequest()}_isSignatureRequired(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),r=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:a,data:o,state:n,challenge:d,response:l}=this._extractSignatureResponseHeaders(e),c=this._getRequestMetadata(e);if(r)this._notifySignatureInvalid(c),s=!0;else if(a)if(t){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,c,a,o,n,d,l),s=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(c,a,o,n,d,l),s=!0}return s}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(e=null){const t=Number((e||{}).status);let s=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(t)){const t=this._extractRequestResponse(e),i=this._extractResponseErrorCode(t),r=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),a=this._getRequestMetadata(e);r&&(this._notifyWaitingForProcessResponse(a),s=!0)}return s}_notifySignatureRequiredFirstStep(e,t,s,i){this._defineSignatureType(t,s),this._defineSignatureValue(t,s,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:t,data:s,metadata:e}}))}_notifySignatureRequired(e,t,s,i,r,a){this._defineSignatureValue(t,s,i);const o={type:t,data:s,challenge:r,metadata:e};a&&(o.response=a),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:o}))}_notifySignatureInvalid(e){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:e}}))}_notifyWaitingForProcessResponse(e){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:e}}))}_getRequestMetadata(e){const{responseURL:t,status:s}=e;return{path:this._path,method:this.method,url:t,status:s}}_emitEvent(e){this.htmlContext?this.htmlContext.dispatchEvent(e):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(e="",t="",s=""){const i=t.split(";").findIndex((t=>t===e));return s?s.split(";")[i]:""}toString(e=""){return`[object ${e||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(e=!1){return this._buildPromise(e)}_extractResponseErrorCode(e){return e?e["error-code"]||e.messages&&e.messages[0].code:null}_notifySignatureTypeUsingHeaders(e,t,s,i,r,a){i?this._notifySignatureRequired(e,t,s,i,r,a):this._notifySignatureRequiredFirstStep(e,t,s,i)}_notifySignatureTypeUsingErrorCode(e,t,s,i,r,a,o){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(e)?this._notifySignatureRequiredFirstStep(t,s,i,r):this._notifySignatureRequired(t,s,i,r,a,o)}}class ae extends re{constructor(e=null){super(Object.assign(e||{},{method:"GET"}))}toString(e=""){return super.toString(e||"BGADPRequestGET")}}class oe extends re{constructor(e=null){super(Object.assign(e||{},{method:"POST"}))}toString(e=""){return super.toString(e||"BGADPRequestPOST")}}class ne extends ae{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`tax-documents/v${this.version}/tax-documents`)}toString(){return super.toString("BGADPMxTaxDocumentsTaxDocumentsGetV0")}}class de extends oe{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`tax-documents/v${this.version}/tax-documents/cancellation-rebranding`)}toString(){return super.toString("BGADPMxTaxDocumentsTaxDocumentsCancellationRebrandingPostV0")}}class le extends(l(i)){}class ce extends le{static get is(){return"bbva-mx-tax-documents-api-dm"}static get properties(){return{taxDocuments:{type:Array,attribute:!1}}}constructor(){super(),this.native=!1,this.requiredToken="tsec",this.requiredOTP=!0,this.taxDocuments=[]}resetTaxDocuments(){this.taxDocuments=[]}getTaxDocuments(e={}){if(Object.keys(this.taxDocuments).length)return;this._generateGetService(this._getService("get",{},e),{customEvent:"tax-documents-api-dm-fetch",errorFireEventHandler:"tax-documents-api-dm-fetch-error"},this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}MxTaxDocuments`,this._getBgadp(i))}_getBgadp(e){return{getMxTaxDocumentsV0:()=>new ne(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}customElements.define(ce.is,ce);class he extends le{static get is(){return"bbva-mx-tax-documents-cancellation-rebranding-api-dm"}constructor(){super(),this.native=!1,this.requiredToken="tsec",this.requiredOTP=!0}postCancellationRebranding(e){this.requiredOTP=!0;this._generateGetService(this._getService("post",e),{customEvent:"tax-documents-cancellation-rebranding-api-dm-create",errorFireEventHandler:"tax-documents-cancellation-rebranding-api-dm-create-error"},this._responseMapping)}_getService(e,t={},s={}){const i=this._getServiceParams(s,t);return this._getServicePath(`${e}MxTaxDocumentsCancellationRebranding`,this._getBgadp(i))}_getBgadp(e){return{postMxTaxDocumentsCancellationRebrandingV0:()=>new de(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}customElements.define(he.is,he);var pe=s`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.headerFixedTop {
  position: fixed;
  top: 0;
}

.padding-variant-header {
  padding-top: 3rem;
}

.confirm-step {
  background-color: white;
  width: 100%;
  padding: 1.5rem 1rem 1.5rem;
  position: sticky;
}

.confirm-step [data-tag-name=bbva-button-default] {
  margin-top: 1rem;
  color: var(--_button-default-positive-color-active);
}
`;class ue extends X{static get is(){return"bbva-feature-update-rfc-mx"}static get properties(){return{taxDocumentsApiVersion:{type:String},financialOverviewDetail:{type:Object},customerFiscalData:{type:Object}}}static get scopedElements(){const e=[ce,he,...X.globalScopedElements()];return X.scopedElementsFromClasses(e)}static get styles(){return[pe,r("bbva-feature-update-rfc-mx-shared-styles")]}constructor(){super(),this.taxDocumentsApiVersion="",this.financialOverviewDetail={},this.customerFiscalData={}}firstUpdated(){super.firstUpdated(),this._taxDocumentsMxDM=this.shadowRoot.querySelector('[data-tag-name="bbva-mx-tax-documents-api-dm"]'),this._postCancelationRebranding=this.shadowRoot.querySelector('[data-tag-name="bbva-mx-tax-documents-cancellation-rebranding-api-dm"]')}getCustomerId(e){e&&(this.customerId=e.value)}getContactDetail(e){return e&&(this.emailCustomer=e[1].contact.address),this.emailCustomer}requestEmail(){this.unmasked=!0,this._fireEvent("unmasked-email-update-rfc",{unmasked:this.unmasked})}setFiscalData(e){e&&(this.customerFiscalData=e,this.legalName=`${e.customer.firstName} ${e.customer.lastName} ${e.customer.secondLastName}`,this.rfcCustomer=e.identityDocument.documentNumber,e.address.location.addressComponents.forEach(((e,t)=>{6===t&&(this.codePostalCustomer=e.code)})),e.taxRegimes.forEach(((e,t)=>{0===t&&(this.idTaxRegimes=e.id,this.useCfdi=e.uses[t].id)})))}_handleFetchTaxDocuments(e){this.fireEventForAnalytics("app-stepThree");const t=null==e?void 0:e.detail;t?(this.dataResponseTaxDocuments=t,this.dataResponseTaxDocuments.length>0&&this.dataResponseTaxDocuments.forEach(((e,t)=>{0===t&&(this._typeDocument=null==e?void 0:e.documentType.description,this.numberCustomer=null==e?void 0:e.customer.account.number)})),this._totalElementsCfdis=t.length,this.clearLoader()):(this._isNotCfdiPeriod=!0,this.clearLoader())}_handleFetchTaxDocumentsError(){this._isOperationCanceled=!0,this.clearLoader()}requestTaxDocuments(){var e,t,s,i;this.showLoader("full",null,null);const r={"customer.identityDocument.documentNumber":null===(e=this.customerFiscalData)||void 0===e||null===(t=e.identityDocument)||void 0===t?void 0:t.documentNumber,"customer.account.number":this._selectedProduct,isGeneric:!1,fromDate:null===(s=this._selectedPeriod)||void 0===s?void 0:s.fromDate,toDate:null===(i=this._selectedPeriod)||void 0===i?void 0:i.toDate,"documentType.id":"EDC"};return this._taxDocumentsMxDM.getTaxDocuments(r),r}templateBodyPostTax(){this.listaDeCfdis=this.dataResponseTaxDocuments.map((e=>({id:e.id,documentType:{id:"EDC"},cfdi:this.useCfdi,fileName:e.fileName,fileReference:e.fileReference,customer:{id:this.customerId,legalName:this.legalName,account:{number:this.numberCustomer},identityDocument:{documentType:{id:"RFC"},documentNumber:this.rfcCustomer},address:{location:{addressComponents:[{componentTypes:["POSTAL_CODE"],code:this.codePostalCustomer}]}},contactDetails:[{contact:{contactDetailType:"EMAIL",address:this.emailCustomer}}],taxRegime:{id:this.idTaxRegimes}}})))}bodyRequestPostTax(){const e={};return e.root=this.listaDeCfdis,this.requestBody=e,this.requestBody}requestCancelationRebranding(){this.showLoader("full",null,null),this.templateBodyPostTax(),this.bodyRequestPostTax();const e=this.requestBody;this.fireEventForAnalytics("app-stepSix"),this._postCancelationRebranding.postCancellationRebranding(e)}_handleFetchCancelationRebranding(e){(null==e?void 0:e.detail)?(this.fireEventForAnalytics("app-completed"),this.openModalSuccesPage(),this.clearLoader()):(this._isFailedOperation=!0,this.clearLoader())}_handleFetchCancelationRebrandingError(){this._isFailedOperation=!0,this.clearLoader()}_taxDocumentsTemplate(){return a`
      <bbva-mx-tax-documents-api-dm
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.taxDocumentsApiVersion}"
        .headers="${this.headers}"
        @tax-documents-api-dm-fetch="${this._handleFetchTaxDocuments}"
        @tax-documents-api-dm-fetch-error="${this._handleFetchTaxDocumentsError}"
        @api-dm-error="${this._handleFetchTaxDocumentsError}"
      >
      </bbva-mx-tax-documents-api-dm>

      <bbva-mx-tax-documents-cancellation-rebranding-api-dm
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.taxDocumentsApiVersion}"
        .headers="${this.headers}"
        @tax-documents-cancellation-rebranding-api-dm-create="${this._handleFetchCancelationRebranding}"
        @tax-documents-cancellation-rebranding-api-dm-create-error="${this._handleFetchCancelationRebrandingError}"
        @api-dm-error="${this._handleFetchCancelationRebrandingError}"
      >
      </bbva-mx-tax-documents-cancellation-rebranding-api-dm>
      `}}customElements.define(ue.is,ue);
