import{z as t,a8 as i,a9 as e,an as a,L as n,ak as s,h as r,aY as o,cT as l,cU as d,bF as u,aN as h,H as c}from"./952f98a9.js";import{M as b,L as m,D as p,a1 as v,E as w,V as g,A as f,Q as _,f as y,G as x,a2 as $,F as S,I as A,h as C,N as I,a3 as D,an as M,ao as E,K as T,a4 as k,v as P,e as F,ah as L}from"./216055dc.js";import{B as V,a as O}from"./722094db.js";import{b as z,B as R}from"./41ed0536.js";import{b as N,B}from"./161ddab1.js";import{bf as j,bg as H}from"./7f3d7ca9.js";import{b as G,B as W}from"./30ef6f1f.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./854beed0.js";import"./84dff06e.js";var q=t`
:host([hidden]), [hidden] {
  display: none !important;
}

.wrapper {
  background-color: var(--bbva-feature-investment-withdrawal-and-contribution-background-color, var(--colorsPrimaryCoreLightened, ${i(e.primaryCoreLightened)}));
  border-right: 1.0625rem solid transparent;
  width: auto;
}

.simple-list {
  display: flex;
  justify-content: space-between;
  margin-bottom: 1.0625rem;
}

.notification-message {
  margin-top: 0.625rem;
  margin-bottom: 1.25rem;
}

.form-input {
  margin-bottom: 1.0625rem;
}

.fit {
  padding: 1.0625rem;
  padding-top: 0.0625rem;
  padding-bottom: 0.0625rem;
}

.withdrawal-type-partial:hover,
.withdrawal-type-total:hover {
  background-color: var(--bbva-feature-investment-withdrawal-and-contribution-color, var(--colorsSecondary100, ${i(e.secondary100)}));
}

.account {
  display: flex;
  flex-direction: column;
}

.pair-title-amount {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  align-content: baseline;
  height: 2.5rem;
}

[data-tag-name=bbva-expandable-step] {
  --bbva-type-amount-font-weight: 350 ;
}

[data-tag-name=bbva-badge-reference] {
  --bbva-type-text-font-weight: 350 ;
}

.hide-step {
  display: none;
}

.withdrwal-option {
  padding-left: 1rem;
}

.notification-message-confirmation {
  margin-bottom: 1.0625rem;
  margin-top: 1.5625rem;
}

.fund-profile {
  display: flex;
  justify-content: space-between;
  margin: 0;
  position: relative;
}

.bar-one {
  width: 1rem;
}

.pair-label-text {
  display: flex;
  box-sizing: border-box;
  flex-direction: row;
  align-items: center;
}

.withdrawal-type-text {
  padding-top: 1rem;
  padding-bottom: 0.5rem;
}

.withdrawal-type-text-desc {
  padding-bottom: 1rem;
}

.notification-message-withdrawal {
  margin-top: 1.5625rem;
  padding-left: 1rem;
  padding-right: 1rem;
}
`;const U=e.tertiaryType2,Y=e.primaryMediumLight,K=e.primaryVariant,Q=e.tertiaryType3;class X extends(b(m(a(n)))){static get is(){return"investment-withdrawal-multistep"}static get properties(){return{dataFromProductDetail:{type:Object},_headerVariant:{type:String},reset:{type:Boolean},_configSteps:{type:Array},_stepsCompleted:{type:Boolean},stepsReset:{type:Array},_editing:{type:Boolean},_showGeneric:{type:String},_modalOpen:{type:Boolean},_interaction:{type:Boolean},withdrawalType:{attribute:"withdrawal-type",type:String,reflect:!0},_amountList:{type:Array},_amountInvest:{type:Number},_amountInvestString:{type:String},_amountInvestValid:{type:Boolean},_investmentData:{type:Array},_associatedAccountData:{type:Object},_contractNumber:{type:String},_distributionRanges:{type:Array},_completedInputAmountStep:{type:Boolean},_investmentProfile:{type:String},_messageInvalid:{type:Boolean},_labelValidMessage:{type:String},_labelInvalidMessage:{type:String},_stringMaxAmount:{type:String},_stringMinAmount:{type:String},_stringAmount:{type:String},localCurrency:{type:String,attribute:"local-currency"}}}static get styles(){return[q,z.secondary,p.secondary,j.styles,v.secondary,G.primary,w.primary,N.primary,g.primary,f.primary,s("bbva-investment-multistep-shared-styles")]}static get scopedElements(){const t=[j,H,_,W,y,x,$,R,S,B,A,C];return X.scopedElementsFromClasses(t)}constructor(){super(),this.dataFromProductDetail={},this._headerVariant="modal-initial",this.reset=!1,this._configSteps=[],this._stepsCompleted=!1,this.stepsReset=[],this._editing=!1,this._showGeneric="hide-step",this._interaction=!1,this._amountList=[],this._amountInvest=0,this._amountInvestString="",this._amountInvestValid=!1,this._investmentData=[],this._associatedAccountData={},this._contractNumber="",this._distributionRanges=[],this.withdrawalType="",this._completedInputAmountStep=!1,this._investmentProfile="",this._messageInvalid=!1,this._labelValidMessage="",this._labelInvalidMessage="",this._stringMaxAmount="",this._stringMinAmount="",this._stringAmount="",this._modalOpen=!1,this.localCurrency=""}updated(t){t.has("dataFromProductDetail")&&this.setRenderData(this.dataFromProductDetail),t.has("reset")&&!0===this.reset&&this._resetMultistep()}_exitHandler(){this._dispatchCustomEvent("exit-withdrawal-contribution",this._modalOpen)}_confirmStep(){return r`
        <div class="wrapper" slot="confirmation">
          <bbva-notification-message
            class="notification-message-confirmation"
            book-title
            message-title="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-confirm-step-withdrawal-notification")}"
          ></bbva-notification-message>
          <bbva-button-default
            fullwidth
            class="last-confirm"
            text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-confirm-step-withdrawal-button")}"
            variant="positive"
            @click="${this._completeWithdrawal}"
          ></bbva-button-default>
        </div>
      `}_nextStep(t){this._editing&&(this._stepsCompleted=!0,this._showGeneric="",this._editing=!1),this.fireCompleteEventHandler(t)}_completeWithdrawal(){const t={};t.amount=this._amountInvest,t.contract=this._contractNumber,t.account=this._associatedAccountData,t.distributionRanges=this._distributionRanges,t.withdrawalType=this.withdrawalType,t.orders=[],this._dispatchCustomEvent("complete-withdrawal",t)}_withdrawalTypeStep(){return r`
        <bbva-expandable-step
          hide-padding-top
          current-step-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-withdrawal-type-step-number")}"
          id="step-3"
          ?hide-divider="${!this._stepsCompleted}"
          header="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-withdrawal-type-step-header")}"
          edit-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-withdrawal-type-step-edit")}"
          show-link
          disabled-target=".action"
          is-dynamic-handler
          hide-padding-left
          hide-padding-right
          @expandable-step-edit-step="${this._softResetMultistep}"
        >
          <div class="content">
            <bbva-type-text 
              class="withdrawal-type-text withdrwal-option" 
              size="S" 
              text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-withdrawal-type-step-option")}" 
              tag="span"
            ></bbva-type-text>
            <div class="withdrawal-type-partial withdrwal-option">
              <bbva-type-text
                id="Parcial"  
                class="withdrawal-type-text" 
                variant="spotlight"
                text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-withdrawal-type-step-partial")}"
                font-weight="${o.fontWeight40}" 
                tag="span"
                @click="${this._setWithdrawalType}"
              ></bbva-type-text>
              <bbva-type-text
                id="Parcial" 
                class="withdrawal-type-text-desc" 
                text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-withdrawal-type-step-partial-description")}"
                font-weight="350"
                tag="span"
                @click="${this._setWithdrawalType}"
              ></bbva-type-text>
            </div>
            <div class="fit">  
                <bbva-divider-default size="full"></bbva-divider-default>
            </div>  
            <div class="withdrawal-type-total withdrwal-option" >
              <bbva-type-text
                id="Total"  
                class="withdrawal-type-text" 
                variant="spotlight"
                text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-withdrawal-type-step-total")}"
                font-weight="${o.fontWeight40}" 
                tag="span"
                @click="${this._setWithdrawalType}"
              ></bbva-type-text>
              <bbva-type-text
                id="Total" 
                class="withdrawal-type-text-desc" 
                text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-withdrawal-type-step-total-description")}"
                font-weight="350"
                tag="span"
                @click="${this._setWithdrawalType}"
              ></bbva-type-text>
            </div>
            <div class="notification-message-withdrawal">
              ${this._getDynamicOperativeMessage()}
            </div>
          </div>
          <div class="summary" slot="summary">
              <bbva-type-text 
                class="withdrwal-option" 
                size="S" 
                text="${this.withdrawalType}" 
                tag="span"
              ></bbva-type-text>
          </div>
        </bbva-expandable-step>
      `}_softResetMultistep(){this.reset=!0,this._showGeneric="hide-step",this._headerVariant="modal-initial",this._stepsCompleted=!1,"Total"===this.withdrawalType?this._configSteps=["step-1","step-2","step-3","step-6"]:this._configSteps=["step-1","step-2","step-3","step-4","step-5"],this._modalOpen=!1,this._interaction=!1,this._dispatchCustomEvent("investment-multistep-reset"),this.reset=!1,this.requestUpdate()}_setWithdrawalType(t){this._modalOpen=!0,this._stepsCompleted=!1,this.withdrawalType=t.target.id;const i="investment-withdrawal-app-started",e={analytic:{step:this.withdrawalType.toLowerCase()},nameEvent:i};this._dispatchCustomEvent(i,e);const a={analytic:{withdrawlType:"Parcial"===this.withdrawalType?this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-withdrawal-type-step-partial-low"):this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-withdrawal-type-step-total-low")},nameEvent:"investment-withdrawal-app-step-input"};this._dispatchCustomEvent("investment-withdrawal-app-step-input",a),this.fireCompleteEventHandler(t)}_withdrawalTotalImport(t){return r`
        <bbva-expandable-step
          hide-padding-top
          current-step-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-withdrawal-total-step-number")}"
          id="step-${t}"
          header="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-withdrawal-total-step-header")}"
          edit-label=""
          show-link
          hide-divider
          disabled-target=".action"
          @expandable-step-edit-step="${this._editStep}"
        >
          <div class="content">
            <bbva-type-text 
              text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-withdrawal-total-step-title")}" 
              size="S" 
              tag="span"
            ></bbva-type-text>
            <bbva-type-text 
              text="${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-value",{amount:this._stringAmount})}" 
              size="5XL" 
              tag="span" 
            ></bbva-type-text>
            <bbva-notification-message 
              class="notification-message"
              book-title
              message-title="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-withdrawal-total-step-notification")}"
            ></bbva-notification-message>
            <bbva-button-default
              id="continue-input-button"
              fullwidth
              class="action"
              text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-withdrawal-total-step-button")}"
              @click="${this._finalStep}"
            ></bbva-button-default>
          </div>
          <div class="summary" slot="summary" ambient="secondary">
            <bbva-type-text 
              text="${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-value",{amount:this._stringAmount})}"
              size="S" 
              tag="span"
            ></bbva-type-text>
          </div>
        </bbva-expandable-step>
      `}fireCompleteEventHandler(t){const{target:i}=t||{},e={Total:["step-1","step-2","step-3","step-6"],Parcial:["step-1","step-2","step-3","step-4","step-5"]};if("Parcial"===i.id||"Total"===i.id)this._configSteps=e[i.id];else if(["withdrawal-input-button"].includes(t.target.id)){const t={analytic:{amount:this._amountInvest,currency:this.dataFromProductDetail.portfolioConfiguration.currency},nameEvent:"investment-withdrawal-distribution-button"};this._dispatchCustomEvent("investment-withdrawal-distribution-button",t),this._amountList=[{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount"),value:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-value",{amount:this._amountInvestString})}]}else if(["withdrawal-distribution-button"].includes(t.target.id)){const t={nameEvent:"investment-withdrawal-step-complete"};this._dispatchCustomEvent("investment-withdrawal-step-complete",t)}X._handleClick(t)}setRenderData(t){const{contractNumber:i,investmentProfile:e,accountAlias:a,associatedAccountNumber:n,associatedAccountAmount:s,fundAmount:r,strategies:o,portfolioConfiguration:l}=t,d=[Y,K,Q];this._investmentData=[{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-contract-number"),value:i.slice(-10)},{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-investment-profile"),value:e}],this._investmentProfile=e,this._contractNumber=i,this._associatedAccountData.alias=a,this._associatedAccountData.labelReference=this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-available"),this._associatedAccountData.account=n,this._associatedAccountData.amount=s,this._associatedAccountData.currency=(null==l?void 0:l.currency)||this.localCurrency,this._maxAmount=r??s,this._stringMaxAmount=parseFloat(this._maxAmount,10).toLocaleString(this.language),this._labelValidMessage=this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-withdrawal-valid",{stringMaxAmount:this._stringMaxAmount}),this._minAmount=500,this._distributionRanges=o.map(((t,i)=>({key:t.portfolioTitle,value:`${t.percentage}%`,currentValue:t.percentage,bgColor:"BBVALIQ"===t.associatedFund?U:d[i%d.length]}))),this._stringAmount=parseFloat(r,10).toLocaleString(this.language),this.requestUpdate()}get _multistepElement(){return this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]')}get _steps(){return this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]')}_resetMultistep(){this._completedInputAmountStep=!1,this.reset=!0,this._configSteps=["step-1","step-2","step-3","step-6"],this._showGeneric="hide-step",this._headerVariant="modal-initial",this._amountInvest="",this._amountList=[],this._stepsCompleted=!1,this._amountInvestString="",this._amountInvestValid=!1,"Total"===this.withdrawalType?(this._steps[2].active=!0,this._steps[2].completed=!1,this._steps[5].active=!1,this._steps[5].completed=!1,this._stepsReset=[2,5]):(this._steps[2].completed=!1,this._steps[3].completed=!1,this._steps[3].active=!1,this._steps[4].completed=!1,this._steps[4].active=!1,this._steps[2].active=!0,this.stepsReset=[3,4]),this.withdrawalType="",this._modalOpen=!1,this._interaction=!1,this._dispatchCustomEvent("investment-multistep-reset"),this.reset=!1,this._scrollToStep="-1",this.requestUpdate(),this._multistepElement.removeAttribute("edition-enabled")}static _getSimpleList(t,i="350"){return r`
        ${t.map((t=>r`
          <div class="simple-list" ambient="secondary">
            <bbva-type-text font-weight="${i}" size="S" text="${null==t?void 0:t.key}" tag="span"></bbva-type-text>
            <bbva-type-text size="S" text="${null==t?void 0:t.value}" tag="span"></bbva-type-text>
          </div>`))}
      `}static _getAssociatedAccount(t){return r`
        <div class="account" ambient="secondary" >
          <div class="pair-title-amount" >
            <bbva-type-text 
              font-weight="${o.fontWeight40}"  
              size="L" 
              class="account-text" 
              text="${null==t?void 0:t.alias}" 
            ></bbva-type-text>
            <bbva-type-amount 
              variant="l" 
              class="amount-text" 
              currency-code="${t.currency}"
              local-currency="${t.currency}"
              amount="${null==t?void 0:t.amount}"
            ></bbva-type-amount>
          </div>
          <div class="pair-title-amount">
            <bbva-badge-reference 
              class="account-text" 
              number="${null==t?void 0:t.account}" 
            ></bbva-badge-reference>
            <bbva-type-text 
              size="S" 
              class="account-text" 
              text="${null==t?void 0:t.labelReference}" 
            ></bbva-type-text>
          </div>
        </div>
      `}static _genericPrefilledStep(t,i,e,a,n){return r`
        <bbva-expandable-step
          id="step-${i}"
          hide-padding-top
          hide-padding-bottom
          hide-divider
          header="${t}"
          class="${n}"
          disabled-target=".action"
          prefilled
        >   
          <div class="summary" slot="summary">
            ${a(e)}
          </div>
        </bbva-expandable-step>        
      `}static _handleClick({target:t}){t.dispatchEvent(new CustomEvent("complete",{bubbles:!0}))}_getDynamicOperativeMessage(){const t=X._outOfOperativeTime();let i="",e="";return i=t?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-withdrawal-unavailable-title"):this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-withdrawal-available-title"),e=t?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-withdrawal-unavailable-message"):this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-withdrawal-available-message"),r`
        <bbva-notification-message
          class="notification-message"
          message-title="${i}"
          message="${e}"
        ></bbva-notification-message>
      `}static _outOfOperativeTime(){const t=moment(),i=moment().hour(8).minute(30),e=moment().hour(13).minute(30);return!t.isBetween(i,e)}_inputAmountStep(t,i,e,a){return r`
        <bbva-expandable-step
          hide-padding-top
          id="step-${i}"
          current-step-label="${e}"
          symbol-right
          header="${t}"
          edit-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-edit-step")}"
          show-link
          .completed="${this._completedInputAmountStep}"
          disabled-target=".action"
          @expandable-step-edit-step="${this._editInputAmountStep}">
          <div class="content" ambient="primary">
            ${this._getFormAmountInput(this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-withdrawal-step"),"withdrawal-input",r`<bbva-notification-message
                class="notification-message"
                book-title
                message-title="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-withdrawal-step-notification")}"></bbva-notification-message>
              `)}
          </div>
          <div class="summary" slot="summary">
            ${X._getSimpleList(this._amountList)}
            <bbva-notification-help
              ambient="secondary"
              accessibility-label-icon="${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-notification-help-info")}"
              text="${a}"> 
            </bbva-notification-help>
          </div>
        </bbva-expandable-step>
      `}_getFormAmountInput(t,i,e=""){return r`
        <bbva-form-input 
          class="form-input"
          id="${i}"
          mode-input="decimal"
          type="amount"
          label-out="${t}"
          label="${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount")}"
          currency-code="${this.localCurrency}"
          local-currency="${this.localCurrency}"
          reset-value="${this.reset}"
          symbol-left
          ?invalid="${this._messageInvalid}"
          decimal-digits="4"
          info-message="${this._labelValidMessage}"
          error-message="${this._labelInvalidMessage}"
          @form-amount-input-change="${this._contributionHandler}"
          @form-field-input-focus="${this._focusAmountMessage}"
        ></bbva-form-input>
        ${e}
        <bbva-button-default
          id="${i}-button"
          ?disabled="${!this._amountInvestValid}"
          fullwidth
          text="${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-button")}"
          @click="${this._nextStep}"
        ></bbva-button-default>
      `}_editInputAmountStep(){this._editStep()}_editStep(){this._editing=!0,this._stepsCompleted=!1,this._showGeneric="hide-step"}_finalStep(t){this._stepsCompleted=!0,this._showGeneric="",this._editing=!1,this.fireCompleteEventHandler(t)}_distributionStep(t,i,e){let a="";return a="Tradicional"===this._investmentProfile?this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-step-withdrawal-description-traditional"):this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-step-withdrawal-description"),r`
        <bbva-expandable-step
          hide-divider
          id="step-${t}"
          step="${t}"
          current-step-label="${i}"
          header="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-step-header")}"
          edit-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-step-edit")}"
          show-link
          hide-padding-top
          hide-padding-bottom
          disabled-target=".action"
          @expandable-step-edit-step="${this._editStep}"
        >
          <div class="content">
            <bbva-type-text
              text="${a}"
              font-weight="350"
            ></bbva-type-text>
            <bbva-data-visualization-bar
              ambient="primary"
              class="list-colors"
              accessibility-text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-title")}"
              title-medium
              label="${"Tradicional"===this._investmentProfile?this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-title-traditional"):this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-title")}"
              currency-code="${this.localCurrency}"
              language="${this.language}"
              amount="${this._amountInvest}"
              bar-any-colors
              .barValues="${this._distributionRanges}"
            ></bbva-data-visualization-bar>
            ${this._graphs()}
            <bbva-notification-help
              ambient="primary"
              class="notification-message"
              accessibility-label-icon="${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-notification-help-info")}"
              text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-step-withdrawal-notification")}"> 
            </bbva-notification-help>
            <bbva-button-default
              id="${e}-distribution-button"
              fullwidth
              class="action"
              text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-step-withdrawal-button")}"
              @click="${this._finalStep}"
            ></bbva-button-default>
          </div>
          <div class="summary" slot="summary">
            ${X._getSimpleList(this._distributionRanges,"500")}
          </div>
        </bbva-expandable-step>
      `}_graphs(){return r`
        ${this._distributionRanges.map(((t,i)=>r`
          <div class="fund-profile">
            <div class="pair-label-text">
              <bbva-data-visualization-bar
                class="bar-one"
                current-value="35"
                max-value="50"
                fill-color="${t.bgColor}"
              ></bbva-data-visualization-bar>
              <bbva-type-text 
                class="list-colors" 
                font-weight="${o.fontWeight40}" 
                size="S" 
                text="${t.key}"
              ></bbva-type-text>
            </div>
            <bbva-type-text 
              class="list-colors" 
              font-weight="${o.fontWeight40}"  
              size="S" 
              text="${t.value}"
            ></bbva-type-text> 
          </div>
          ${i<this._distributionRanges.length-1?r`<bbva-divider-default size="full"></bbva-divider-default>`:""}
        `))}
      `}_contributionHandler(t){this._amountInvest=t.detail.amount;const i=parseFloat(this._amountInvest).toLocaleString(void 0,{minimumFractionDigits:2}).toString();this._amountInvestString=i,""!==t.detail.value?this._interaction=!0:(this._labelValidMessage=this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-withdrawal-valid",{stringMinAmount:this._stringMinAmount,stringMaxAmount:this._stringMaxAmount}),this._interaction=!1),this._updateMessages(),this._amountInvestValid=!!this._interaction&&this._amountInvestValid}_updateMessages(){this._formatAmounts();const t=this._minAmount<=this._amountInvest&&this._amountInvest<=this._maxAmount,i=this._amountInvest<this._minAmount,e=this._amountInvest>this._maxAmount;this._amountInvestValid=!1,!this._interaction||t?(this._amountInvestValid=!0,this._messageInvalid=!1,this._labelValidMessage=this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-withdrawal-valid",{stringMaxAmount:this._stringMaxAmount}),this._labelInvalidMessage=""):i?(this._messageInvalid=!0,this._labelInvalidMessage=this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-withdrawal-invalid-low",{stringMinAmount:this._stringMinAmount}),this._labelValidMessage=""):e&&(this._messageInvalid=!0,this._labelInvalidMessage=this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-withdrawal-invalid-max",{stringMaxAmount:this._stringMaxAmount}),this._labelValidMessage=""),this._labelInvalidMessage=""===this._amountInvestString||0===this._amountInvest?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-withdrawal-invalid-zero",{stringMaxAmount:this._stringMaxAmount}):this._labelInvalidMessage}_formatAmounts(){this._stringMaxAmount=parseFloat(this._maxAmount,10).toLocaleString(this.language),this._stringMinAmount=parseFloat(this._minAmount,10).toLocaleString(this.language)}render(){return r`
      <bbva-header-main
        id="multistep-header"
        variant="${this._headerVariant}"
        text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-header-withdrawal")}"
        close-icon-aria-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-header-exit-button")}"
        aria-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-header-exit-button")}"
        @header-main-icon-click="${this._exitHandler}"
      ></bbva-header-main>
      
      <bbva-expandable-multistep
        .activeSteps="${this._configSteps}"
        step-selector='[data-tag-name="bbva-expandable-step"]'
        .stepsToReset="${this.stepsReset}"
        @expandable-multistep-specific-step-scroll="${t=>{this._headerVariant=t.detail.completed?"modal-initial-secondary":"modal-initial"}}"
        offset-bottom="24"
        aria-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-aria-label-withdrawal")}"
        tabindex="0"
        show-dividers="show-all"
        edition-enabled="${this._editing}"
      >
        <div slot="content">
          ${X._genericPrefilledStep(this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-common-step-header"),1,this._investmentData,X._getSimpleList,this._showGeneric)}
          
          ${this._stepsCompleted?r`<div class="fit"><bbva-divider-default size="full"></bbva-divider-default><div>`:""}
          
          ${X._genericPrefilledStep(this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-common-step-associated-account"),2,this._associatedAccountData,X._getAssociatedAccount,this._showGeneric)}
          
          ${this._withdrawalTypeStep()}
    
          ${this._inputAmountStep(this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-step-withdrawal-title"),4,this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-step-withdrawal-number"),this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-step-withdrawal-description"))}
        
          ${this._distributionStep(5,this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-header-distribution-number"),"withdrawal")}
    
          ${this._withdrawalTotalImport(6)}
        </div>
        ${this._confirmStep()}
      </bbva-expandable-multistep>
    `}}var Z=t`
#status {
  display: flex;
  padding-top: 1rem;
  padding-right: 1rem;
  padding-bottom: 0;
  padding-left: 1rem;
  flex-direction: column;
  align-items: flex-start;
}

.simple-list {
  display: flex;
  justify-content: space-between;
  flex-direction: row;
  color: var(--bbva-feature-investment-withdrawal-and-contribution-background-color, var(--colorsPrimaryCoreLightened, ${i(e.primaryCoreLightened)}));
}

.header-category {
  margin-top: 0.5625rem;
  margin-bottom: 0.5625rem;
}

.customer-email {
  margin-top: 1.25rem;
  margin-bottom: 1.875rem;
}
`;class J extends(b(m(a(n)))){static get is(){return"investment-withdrawal-and-contribution-status"}static get properties(){return{isContribution:{type:Boolean,attribute:"is-contribution"},ordersData:{type:Object},_amount:{type:String},_customerEmail:{type:String},_descriptionList:{type:Array},_detailOperationList:{type:Array},_distributionList:{type:Array},_distributionListReceipt:{type:Array},_inOperativeTime:{type:Boolean},_isTraditional:{type:Boolean},_operationFolio:{type:String},_operationStatus:{type:String},localCurrency:{type:String,attribute:"local-currency"}}}static get styles(){return[z.primary,g.primary,I.primary,w.primary,D.primary,v.primary,p.primary,Z,s("bbva-feature-investment-withdrawal-and-contribution-status-shared-styles")]}static get scopedElements(){const t=[R,y,M,E,T,A,k,C,_,$,x];return J.scopedElementsFromClasses(t)}constructor(){super(),this.isContribution=!1,this.ordersData={},this._amount="",this._customerEmail="",this._descriptionList=[],this._detailOperationList=[],this._distributionList=[],this._distributionListReceipt=[],this._inOperativeTime=!1,this._isTraditional=!1,this._operationFolio="",this._operationStatus=""}updated(t){t.has("ordersData")&&this.formatData()}formatData(){if(this.ordersData&&Object.keys(this.ordersData).length>0){const{amount:t,orders:i,email:e,distributionRanges:a,withdrawalType:n,account:s,contract:r,operationDate:o,riskProfile:l}=this.ordersData;let d="";this._amount=t;const u=i.find((t=>t.schedule));this._inOperativeTime="PENDING"!==(null==u?void 0:u.schedule.status.id);const h=this.isContribution?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-account",{account:s.account.slice(-4)}):this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-invest-contract",{contract:r.slice(-4)}),c=this.isContribution?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-invest-contract",{contract:r.slice(-4)}):this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-account",{account:s.account.slice(-4)});this._descriptionList=[{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-date-hour"),value:moment(o).format("DD MMM YYYY, h:mm").replace(/(\b\w)/g,(t=>t.toUpperCase())).replace(".",""),font:"italic"},{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-account-origin"),value:h},{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-account-destination"),value:c}];const b=this._inOperativeTime?i.find((t=>"operationNumber"in t)):i.find((t=>"schedule"in t));b&&(this._operationFolio=this._inOperativeTime?b.operationNumber:b.schedule.id),this._isTraditional="TRADITIONAL"===(null==l?void 0:l.id),this._inOperativeTime&&this._isTraditional?this._operationStatus=this.isContribution?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-contribution-success-traditional"):this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-withdrawal-success-traditional"):this._operationStatus=this.isContribution?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-contribution-success"):this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-withdrawal-pending"),d=this.isContribution?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-operation-type-contribution"):this.t(J.withdrawalOperationType(n)),this._detailOperationList=[{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-operation-type-title"),value:d},{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-contract-number"),value:r.slice(-10)},{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-operation-number"),value:this._operationFolio}],this._distributionList=a.map((t=>({key:t.key,value:t.value}))),this._distributionListReceipt=a.map(((t,i)=>({key:`cells-share-operative-receipt-bbva-invest-distribution${i+1}`,fund:{name:t.key,percentage:t.value}}))),this._customerEmail=e.toLowerCase();const m={templateSelected:"bbvaInvestOperationReceipt",title:"cells-share-operative-receipt-bbva-invest-title",destination:{avatar:{src:"./images/official-document.svg"}},operationOrderReceipt:[{key:"cells-share-operative-receipt-bbva-invest-amount-to-invest",amount:{amount:this._amount,currency:this.localCurrency},class:"bold spacing"},{key:"cells-share-operative-receipt-bbva-invest-hour-date",value:o,class:"spacing light-key bold-value"},{key:"cells-share-operative-receipt-bbva-invest-origin-account",value:h},{key:"cells-share-operative-receipt-bbva-invest-destination-account",value:c},{key:"cells-share-operative-receipt-bbva-invest-details",value:"cells-share-operative-receipt-bbva-invest-details"},{key:"cells-share-operative-receipt-bbva-invest-type-of-operation",value:d},{key:"cells-share-operative-receipt-bbva-invest-origin-contract",value:r},{key:"cells-share-operative-receipt-bbva-invest-order-folio",value:this._operationFolio},{key:"cells-share-operative-receipt-bbva-invest-distribution-title",value:"cells-share-operative-receipt-bbva-invest-distribution-title"},...this._distributionListReceipt]};this._dispatchCustomEvent("investment-withdrawal-and-contribution-set-data",m)}}static withdrawalOperationType(t){return{Parcial:"bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-operation-type-withdrawal-partial"}[t]??"bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-operation-type-withdrawal-total"}_getNotificationMessage(){const t={true:{true:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-notification-contribution-success"),false:`${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-notification-contribution-pending-one")}<br><br>\n        ${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-notification-contribution-pending-two")}`},false:{true:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-notification-withdrawal-success"),false:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-notification-withdrawal-pending")}}[this.isContribution][this._inOperativeTime];return r`
      <bbva-notification-message class="notification-message"
        message-title="${this.isContribution?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-notification-contribution"):this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-notification-withdrawal")}"
        message="${t}"
      ></bbva-notification-message>
    `}static getSimpleList(t,i="350",e="500"){return r`
      ${t.map((t=>r`
        <div class="simple-list">
          <bbva-type-text 
            size="S"
            font-weight="${i}"
            text="${t.key}"
          ></bbva-type-text>
          <bbva-type-text 
            size="S"
            font-weight="${e}"
            text="${t.value}"
            font-style="${t.font}"
          ></bbva-type-text>
        </div>`))}
    `}_getDistribution(){var t;return"Parcial"===(null===(t=this.ordersData)||void 0===t?void 0:t.withdrawalType)||!0===this.isContribution?r`
        <bbva-header-category
          class="header-category"
          text="${this.isContribution?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-header-distribution-contribution"):this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-header-distribution-withdrawal")}"
        ></bbva-header-category>
        ${J.getSimpleList(this._distributionList,void 0,o.fontWeight40)}
      `:""}render(){return r`
      <bbva-header-main 
        variant="modal-initial"
        text="${this.isContribution?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-operation-type-contribution"):this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-operation-type-withdrawal")}"
        @header-main-icon-click="${()=>{this._dispatchCustomEvent("exit-form-bbva-invest-status-page")}}"
      ></bbva-header-main>
      <div id="status">
        <div class="panel-info">
          <div class="object-text">
            <bbva-clip-microillustration
              size='S'
              microillustration="${this._inOperativeTime?"success":"pending"}"
            ></bbva-clip-microillustration>
            <bbva-type-text 
              class="title" 
              text="${this._operationStatus}"
              size="XL"
              font-weight="${o.fontWeight40}"
            ></bbva-type-text>
            <bbva-type-text 
              class="title" 
              text="${this.isContribution?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-description-contribution"):this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-description-withdrawal")}"
              size="S"
              font-weight="350"
            ></bbva-type-text>
            <bbva-type-amount 
              variant="2xl"
              class="title" 
              type="bold"     
              currency-code="${this.localCurrency}"
              local-currency="${this.localCurrency}"
              amount="${this._amount}"
            ></bbva-type-amount>
            <bbva-type-text 
              class="title" 
              text="${this.isContribution?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-description-contribution-long"):this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-description-withdrawal-long")}"
              size="S"
              font-weight="350"
            ></bbva-type-text>
            ${J.getSimpleList(this._descriptionList)}
            <bbva-header-category
              class="header-category"
              text="${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-receipt-detail")}"
            ></bbva-header-category>
            ${J.getSimpleList(this._detailOperationList)}
            ${this._getDistribution()}
          </div>
        </div>
        ${this._isTraditional&&this._inOperativeTime?"":this._getNotificationMessage()}
        <div class="customer-email">
          <bbva-type-text 
            text="${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-email-description")}"
            size="S"
            tag="span"
            font-weight="350"
          ></bbva-type-text>
          <bbva-type-text 
            text="${this._customerEmail}"
            tag="span"
            size="S"
            font-weight="${o.fontWeight40}"
          ></bbva-type-text>
        </div>
      </div>
      <bbva-button-row 
        accessibility-text="${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-button-share")}"
        .options="${[{icon:l(),label:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-status-button-share"),id:"button-1"}]}"
        ambient="primary-alt" variant="simple" 
        @button-row-item-button-1-click="${()=>{this._dispatchCustomEvent("investment-withdrawal-and-contribution-share-receipt",{operative:"bbvaInvestOperationReceipt"})}}"
      ></bbva-button-row>
            
        `}}var tt=t`
:host([hidden]), [hidden] {
  display: none !important;
}

.wrapper {
  background-color: var(--bbva-feature-investment-withdrawal-and-contribution-background-color, var(--colorsPrimaryCoreLightened, ${i(e.primaryCoreLightened)}));
  border-right: 1.0625rem solid transparent;
  width: auto;
}

.simple-list {
  display: flex;
  justify-content: space-between;
  margin-bottom: 1rem;
}

.notification-message {
  margin-top: 0.625rem;
  margin-bottom: 1.25rem;
}

.form-input {
  margin-bottom: 1rem;
}

.fit {
  padding: 1rem;
  padding-top: 0.0625rem;
  padding-bottom: 0.0625rem;
}

.account {
  display: flex;
  flex-direction: column;
}

.pair-title-amount {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  align-items: center;
  align-content: center;
  height: 2.5rem;
}

[data-tag-name=bbva-expandable-step] {
  --bbva-type-amount-font-weight: 350 ;
}

[data-tag-name=bbva-badge-reference] {
  --bbva-type-text-font-weight: 350 ;
}

.hide-step {
  display: none;
}

.notification-message-confirmation {
  margin-bottom: 1rem;
  margin-top: 1.5rem;
}

.fund-profile {
  display: flex;
  justify-content: space-between;
  margin: 0;
  position: relative;
}

.bar-one {
  width: 1rem;
}

.pair-label-text {
  display: flex;
  box-sizing: border-box;
  flex-direction: row;
  align-items: center;
}
`;const it=e.tertiaryType2,et=e.primaryMediumLight,at=e.primaryVariant,nt=e.tertiaryType3;class st extends(b(m(a(n)))){static get is(){return"investment-contribution-multistep"}static get scopedElements(){const t=[R,y,B,A,j,H,W,C,S,_,$,x];return st.scopedElementsFromClasses(t)}static get properties(){return{dataFromProductDetail:{type:Object},_distributionAcepted:{type:Boolean},headerVariant:{type:String,attribute:"header-variant"},validAmount:{type:Boolean,attribute:"valid-amount"},reset:{type:Boolean},_amountInvestString:{type:String},_amountInvestValid:{type:Boolean},_associatedAccountStepSummary:{type:Array},_completedInputAmountStep:{type:Boolean},_completedDistributionStep:{type:Boolean},_distributionRanges:{type:Array},_distributionStepActive:{type:Boolean},_editing:{type:Boolean},_editAmountDivider:{type:Boolean},_inputAmountStepSummary:{type:Array},_investmentDataStepSummary:{type:Array},_maxAmount:{type:Number},_messageInvalid:{type:Boolean},_minAmount:{type:Number},_stringMaxAmount:{type:String},_stringMinAmount:{type:String},_showGeneric:{type:String},_scrollToStep:{type:Number},valueFundProfile:{type:Number},localCurrency:{type:String,attribute:"local-currency"}}}constructor(){super(),this.dataFromProductDetail={},this.headerVariant="modal-initial",this._distributionStepActive=!1,this.validAmount=!1,this.reset=!1,this._amountInvestValid=!1,this._associatedAccountStepSummary={alias:"",amount:0,account:"",labelReference:0},this._completedInputAmountStep=!1,this._completedDistributionStep=!1,this._distributionAcepted=!1,this._distributionRanges=[],this._editing=!1,this._editAmountDivider=!1,this._inputAmountStepSummary=[],this._investmentDataStepSummary=[{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-contract-number"),value:""},{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-investment-profile"),value:""}],this._maxAmount=0,this._messageInvalid=!1,this._minAmount=500,this._scrollToStep=-1,this._showGeneric="hide-step",this._stringMaxAmount="",this._stringMinAmount="",this.valueFundProfile=35,this.localCurrency=""}static get styles(){return[tt,z.secondary,N.primary,G.primary,v.secondary,p.secondary,g.primary,w.primary,f.primary,s("investment-contribution-multistep-shared-styles")]}updated(t){if(t.has("dataFromProductDetail")&&this._setRenderData(this.dataFromProductDetail),t.has("validAmount")&&this.validAmount){const t={amount:this._amountInvest,currency:this.dataFromProductDetail.portfolioConfiguration.currency};this._dispatchCustomEvent("investment-contribution-input-button",t),this._inputAmountStepSummary=[{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount"),value:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-value",{amount:this._amountInvestString})}],this._completedInputAmountStep=!0,this._distributionStepActive=!0,this._scrollToStep="3",this._editAmountDivider=!1}t.has("reset")&&!0===this.reset&&this.resetMultistep()}_setRenderData(t){const{contractNumber:i,investmentProfile:e,accountAlias:a,associatedAccountNumber:n,associatedAccountAmount:s,strategies:r}=t;this._distributionRanges=[{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-range-preservation"),value:"40%",currentValue:40,bgColor:"#49A5E6"},{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-range-generation"),value:"45%",currentValue:45,bgColor:"#2DCCCD"},{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-range-increase"),value:"15%",currentValue:15,bgColor:"#F8CD51"}],this._maxAmount=s,this._investmentDataStepSummary=[{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-contract-number"),value:i.slice(-10)},{key:this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-investment-profile"),value:e}],this._investmentProfile=e,this._contractNumber=i;const o=[et,at,nt];this._distributionRanges=r.map(((t,i)=>({key:t.portfolioTitle,value:`${t.percentage}%`,currentValue:t.percentage,bgColor:"BBVALIQ"===t.associatedFund?it:o[i%o.length]})));const l={};l.alias=a,l.labelReference=this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-available"),l.account=n,l.amount=s,l.currency=this.dataFromProductDetail.portfolioConfiguration.currency,this._associatedAccountStepSummary={...l}}get _confirmStep(){return r`
      <bbva-notification-message
        class="notification-message-confirmation"
        book-title
        message-title="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-confirm-step-contribution-notification")}"
      ></bbva-notification-message>
      <bbva-button-default
        fullwidth
        class="last-confirm"
        @click="${this._completeContribution}"
        text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-confirm-step-contribution-button")}"
        variant="positive"
      ></bbva-button-default>
    `}static _getAssociatedAccount(t){return r`
      <div class="account" ambient="secondary" >
        <div class="pair-title-amount" >
          <bbva-type-text 
            font-weight="${o.fontWeight40}"  
            size="L" 
            class="account-text" 
            text="${null==t?void 0:t.alias}" 
          ></bbva-type-text>
          <bbva-type-amount 
            variant="l" 
            class="amount-text" 
            currency-code="${null==t?void 0:t.currency}"
            local-currency="${null==t?void 0:t.currency}"
            amount="${null==t?void 0:t.amount}" 
          ></bbva-type-amount>
        </div>
        <div class="pair-title-amount">
          <bbva-badge-reference 
            class="account-text" 
            number="${null==t?void 0:t.account}" 
          ></bbva-badge-reference>
          <bbva-type-text 
            font-weight="350" 
            size="S" 
            class="account-text" 
            text="${null==t?void 0:t.labelReference}" 
          ></bbva-type-text>
        </div>
      </div>
    `}static _getSimpleList(t,i="350"){return r`
      ${t.map((t=>r`
        <div class="simple-list" ambient="secondary">
          <bbva-type-text font-weight="${i}" size="S" text="${null==t?void 0:t.key}" tag="span"></bbva-type-text>
          <bbva-type-text font-weight="350" size="S" text="${null==t?void 0:t.value}" tag="span"></bbva-type-text>
        </div>`))}
    `}static _outOfOperativeTime(){const t=moment(),i=moment().hour(8).minute(30),e=moment().hour(13).minute(30);return!t.isBetween(i,e)}_formatAmounts(){this._stringMaxAmount=parseFloat(this._maxAmount,10).toLocaleString(this.language),this._stringMinAmount=parseFloat(this._minAmount,10).toLocaleString(this.language)}_updateMessages(){this._formatAmounts();const t=this._minAmount<=this._amountInvest&&this._amountInvest<=this._maxAmount,i=this._amountInvest<this._minAmount,e=this._amountInvest>this._maxAmount;this._amountInvestValid=!1,!this._interaction||t?(this._amountInvestValid=!0,this._messageInvalid=!1,this._labelValidMessage="",this._labelInvalidMessage=""):i?(this._messageInvalid=!0,this._labelInvalidMessage=this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-contribution-invalid-low",{stringMinAmount:this._stringMinAmount,stringMaxAmount:this._stringMaxAmount}),this._labelValidMessage=""):e?(this._messageInvalid=!0,this._labelInvalidMessage=this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-contribution-invalid-max",{stringMaxAmount:this._stringMaxAmount}),this._labelValidMessage=""):this._messageInvalid=!0}_nextStep(t){this._editing&&(this.stepsCompleted=!0,this._showGeneric="",this._editing=!1);const i={};i.amount=this._amountInvest,i.contract=this._contractNumber,i.account=this._associatedAccountStepSummary,i.distributionRanges=this._distributionRanges,i.withdrawalType=this.withdrawalType,this._nextStepElement=t,this._dispatchCustomEvent("validate-amount-operation",i)}_contributionHandler(t){this._amountInvest=t.detail.amount;const i=parseFloat(this._amountInvest).toLocaleString(void 0,{minimumFractionDigits:2}).toString();this._amountInvestString=i,""!==t.detail.value?this._interaction=!0:(this._labelValidMessage=this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-contribution-valid",{stringMinAmount:this._stringMinAmount,stringMaxAmount:this._stringMaxAmount}),this._interaction=!1),this._updateMessages(),this._amountInvestValid=!!this._interaction&&this._amountInvestValid}_getDynamicOperativeMessage(){const t=st._outOfOperativeTime(),i=t?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-contribution-unavailable-title"):this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-contribution-available-title"),e=t?this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-contribution-unavailable-message"):this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-contribution-available-message");return r`
      <bbva-notification-message
        class="notification-message"
        message-title="${i}"
        message="${e}"
      ></bbva-notification-message>
    `}_focusAmountMessage(){const t="investment-contribution-validate-amount-on-focus",i={nameEvent:t};this._dispatchCustomEvent(t,i)}_exitHandler(){const t=!!this._amountInvest;this._dispatchCustomEvent("exit-withdrawal-contribution",t)}_editStep(){this._editing=!0,this.stepsCompleted=!1,this._showGeneric="hide-step",this.validAmount=!1}get _getInvestmentDataStep(){return r`
      <bbva-expandable-step
        id="step-1"
        hide-padding-top
        hide-padding-bottom
        header="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-common-step-header")}"
        class="${this._showGeneric}"
        disabled-target=".action"
        prefilled
      >   
        <div class="summary" slot="summary">
          ${st._getSimpleList(this._investmentDataStepSummary)}
        </div>
      </bbva-expandable-step>
    `}get _getAssociatedAccountStep(){return r`
      <bbva-expandable-step
        id="step-2"
        hide-divider
        hide-padding-top
        hide-padding-bottom
        header="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-common-step-associated-account")}"
        class="${this._showGeneric}"
        disabled-target=".action"
        prefilled
      >   
        <div class="summary" slot="summary">
          ${st._getAssociatedAccount(this._associatedAccountStepSummary)}
        </div>
      </bbva-expandable-step> 
    `}_editInputAmountStep(){this._editAmountDivider=!1,this._completedInputAmountStep=!1,this._editStep()}get _formInputAmount(){return r`
        <bbva-form-input 
            class="form-input"
            id="contribution-input"
            mode-input="decimal"
            type="amount"
            label-out="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-contribution-step")}"
            label="${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount")}"
            currency-code="${this.localCurrency}"
            reset-value="${this.reset}"
            local-currency="${this.localCurrency}"
            symbol-left
            ?invalid="${this._messageInvalid}"
            decimal-digits="4"
            info-message="${this._labelValidMessage}"
            error-message="${this._labelInvalidMessage}"
            @form-amount-input-change="${this._contributionHandler}"
            @form-field-input-focus="${this._focusAmountMessage}"
          ></bbva-form-input>
          ${this._getDynamicOperativeMessage()}
          <bbva-button-default
            id="contribution-input-button"
            ?disabled="${!this._amountInvestValid}"
            fullwidth
            text="${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-amount-button")}"
            @click="${this._nextStep}"
          ></bbva-button-default>
    `}get _getInputAmountStep(){return r`
      <bbva-expandable-step
        hide-padding-top
        id="step-3"
        current-step-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-step-contribution-number")}"
        header="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-step-contribution-title")}"
        edit-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-withdrawal-multistep-edit-step")}"
        show-link
        ?completed="${this._completedInputAmountStep}"
        disabled-target=".action"
        @expandable-step-edit-step="${this._editInputAmountStep}"
      >
        <div class="content" ambient="primary">
          ${this._formInputAmount}
        </div>
        <div class="summary" slot="summary">
          ${st._getSimpleList(this._inputAmountStepSummary)}
          <bbva-notification-help
            ambient="secondary"
            accessibility-label-icon="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-notification-info-label")}"
            text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-amount-step-contribution-description")}"> 
          </bbva-notification-help>
        </div>
      </bbva-expandable-step>
    `}get _getDistributionStep(){return r`
      <bbva-expandable-step
        hide-divider
        id="step-4"
        step="4"
        current-step-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-contribution-distribution-step-number")}"
        header="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-step-header")}"
        edit-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-step-edit")}"
        show-link
        hide-padding-top
        hide-padding-bottom
        ?active="${this._distributionStepActive}"
        ?completed="${this._completedDistributionStep}"
        disabled-target=".action"
        @expandable-step-edit-step="${this._editStep}"
      >
        <div class="content">
          <bbva-type-text
            text="${"Tradicional"===this._investmentProfile?this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-step-contribution-description-traditional"):this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-step-contribution-description")}"
            font-weight="350"
          ></bbva-type-text>
          <bbva-data-visualization-bar
            ambient="primary"
            class="list-colors"
            accessibility-text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-title")}"
            title-medium
            label="${"Tradicional"===this._investmentProfile?this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-title-traditional"):this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-title")}"
            currency-code="${this.localCurrency}"
            language="${this.language}"
            amount="${this._amountInvest}"
            bar-any-colors
            .barValues="${this._distributionRanges}"
          ></bbva-data-visualization-bar>
          ${this._graphs()}
          <bbva-notification-help
            ambient="primary"
            class="notification-message"
            accessibility-label-icon="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-notification-info-label")}"
            text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-step-contribution-notification")}">
          </bbva-notification-help>
          <bbva-button-default
            id="contribution-distribution-button"
            fullwidth
            class="action"
            text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-distribution-step-withdrawal-button")}"
            @click="${this._finalStep}"
          ></bbva-button-default>
        </div>
        <div class="summary" slot="summary">
          ${st._getSimpleList(this._distributionRanges,"500")}
        </div>
      </bbva-expandable-step>
    `}_handleClick({target:t}){"contribution-input-button"===t.id&&this._distributionAcepted?this._showGeneric="":"contribution-distribution-button"===t.id&&(this._distributionAcepted=!0,this._showGeneric="",this._dispatchCustomEvent("investment-contribution-distribution-button")),t.dispatchEvent(new CustomEvent("complete",{bubbles:!0}))}_graphs(){return r`
      ${this._distributionRanges.map(((t,i)=>r`
        <div class="fund-profile">
          <div class="pair-label-text">
            <bbva-data-visualization-bar
              class="bar-one"
              current-value="${this.valueFundProfile}"
              max-value="50"
              fill-color="${t.bgColor}"
            ></bbva-data-visualization-bar>
            <bbva-type-text 
              class="list-colors" 
              font-weight="${o.fontWeight40}" 
              size="S" 
              text="${t.key}"
            ></bbva-type-text>
          </div>
          <bbva-type-text 
            class="list-colors" 
            font-weight="${o.fontWeight40}"  
            size="S" 
            text="${t.value}"
          ></bbva-type-text> 
        </div>
        ${i<this._distributionRanges.length-1?r`<bbva-divider-default size="full"></bbva-divider-default>`:""}
      `))}
    `}_completeContribution(){const t={};t.amount=this._amountInvest,t.contract=this._contractNumber,t.account=this._associatedAccountStepSummary,t.distributionRanges=this._distributionRanges,t.withdrawalType=this.withdrawalType,t.orders=[],this._dispatchCustomEvent("complete-contribution",t)}_finalStep(t){this.stepsCompleted=!0,this._completedDistributionStep=!0,this._showGeneric="",this._editAmountDivider=!0,this._editing=!0,this._handleClick(t)}resetMultistep(){this.reset=!0,this._showGeneric="hide-step",this._amountInvest="",this._amountList=[],this.stepsCompleted=!1,this._amountInvestString="",this._amountInvestValid=!1,this._distributionStepActive=!1,this._completedInputAmountStep=!1,this._completedDistributionStep=!1,this.headerVariant="modal-initial",this._editing=!1,this._labelInvalidMessage="",this._dispatchCustomEvent("investment-multistep-reset"),this.reset=!1}render(){return r`
      <bbva-header-main
        id="multistep-header"
        variant="${this.headerVariant}"
        text="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-header-contribution")}"
        close-icon-aria-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-header-exit-button")}"
        @header-main-icon-click="${this._exitHandler}"
      ></bbva-header-main>
  
      <bbva-expandable-multistep
        @expandable-multistep-specific-step-scroll="${t=>{this.headerVariant=t.detail.completed?"modal-initial-secondary":"modal-initial"}}"
        aria-label="${this.t("bbva-feature-investment-withdrawal-and-contribution-multistep-aria-label-contribution")}"
        tabindex="0"
        ?edition-enabled="${this._editing}"
        offset-bottom="24"
        scroll-to-step-index="${this._scrollToStep}"
        show-dividers="show-all"
      >
        <div slot="content">
          ${this._getInvestmentDataStep}          
          ${this._getAssociatedAccountStep}
          ${this._getInputAmountStep}
          ${this._getDistributionStep}
        </div>
        <div class="wrapper" slot="confirmation">
          ${this._confirmStep}
        </div>
      </bbva-expandable-multistep>
    `}}var rt=t`
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

.notification-message {
  margin-top: 1.25rem;
}

[data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-text-align: left;
  z-index: 9;
}
`;class ot extends(P(b(m(a(n))))){static get is(){return"bbva-feature-investment-withdrawal-and-contribution"}static get scopedElements(){const t=[d,u,st,T,F,V,O,x,_,L,X,st,J,...ot.configurationScopedElements()];return ot.scopedElementsFromClasses(t)}static get properties(){return{dataFromProductDetail:{type:Object},isContribution:{type:Boolean},nextStepValidAmount:{type:Boolean},reset:{type:Boolean},statusData:{type:Object},_customerEmail:{type:String},_investmentFunds:{type:Object},_investmentPortfolio:{type:Object},_multistepVisible:{type:Boolean},_openErrorModal:{type:Boolean},_openExitModal:{type:Boolean},_openInvalidAmountModal:{type:Boolean},_statusVisible:{type:Boolean},_withdrawalType:{type:String},localCurrency:{type:String}}}constructor(){super(),this.config={loader:!0},this.dataFromProductDetail={},this.isContribution=!1,this.nextStepValidAmount=!1,this.reset=!1,this.statusData={},this._customerEmail="",this._investmentFunds={},this._investmentPortfolio={},this._multistepVisible=!1,this._openErrorModal=!1,this._openExitModal=!1,this._openInvalidAmountModal=!1,this._statusVisible=!1,this._withdrawalType="",this.localCurrency="MXN"}static get styles(){return[rt,I.primary,p.primary,s("bbva-feature-investment-withdrawal-and-contribution-shared-styles")]}firstUpdated(){super.firstUpdated(),this._investmentFunds=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-investment-funds"]'),this._investmentPortfolio=this.shadowRoot.querySelector('[data-tag-name="bbva-dataprovider-investment-portfolio"]')}cancelAfterError(){this._multistepVisible=!0,this._statusVisible=!1}customerEmail(t){this._customerEmail=`•${t.replace(/\*/g,"")}`}sendData(t){this.isContribution=t.isContribution,this.dataFromProductDetail={...t},this._multistepVisible=!0,this._statusVisible=!1;const i={investProfile:this.dataFromProductDetail.investmentProfile.toLowerCase()},e=this.isContribution?"investment-contribution-page-visit":"investment-withdrawal-page-visit",a={analytic:i,nameEvent:e};this._dispatchCustomEvent(e,a)}_exitModalHandler(t){this._openErrorModal=!1,this._multistepVisible=!0,t.detail?this._openExitModal=!0:this.resetComponent()}resetComponent(){this._multistepVisible=!1,this._statusVisible=!1,this.reset=!0,this._dispatchCustomEvent("on-exit-withdrawal-and-contribution")}_investmentFundsDataprovider(){return r`
      <bbva-dataprovider-investment-funds
        .headers="${this.headers}"
        host="${this.host}"
        version="${this.version}"
        requiredToken="${this.requiredToken}"
        @post-create-investment-funds-order-events-success="${this.createOrderResponseHandler}"
        @error-on-post-create-investment-funds-order-events="${this.createOrderResponseHandlerError}"
        @post-validate-list-operations-events-success="${this.validateListOperationsResponseHandler}"
        @error-on-post-validate-list-operations-events="${this.validateListOperationsResponseHandlerError}"
      ></bbva-dataprovider-investment-funds>
    `}validateListOperationsResponseHandler(t){const i=t.detail.orders;if(i.length>0){const t=i.map((t=>({subType:t.subType.id,offerId:t.offerId,serie:t.fund.serie,numberType:t.fund.numberFormats[0].number,amount:t.calculedPositionSize[0].positionAmount.amount})));this.statusData.dataFundOrder=t,this.nextStepValidAmount=!0}else this._openErrorModal=!0;this.clearLoader()}validateListOperationsResponseHandlerError(t){this.clearLoader();const[i]=t.detail.messages;Array.isArray(t.detail.messages)&&i.message.includes("TPE1040")||Array.isArray(t.detail.messages)&&i.message.includes("TPE1003")?(this._openInvalidAmountModal=!0,this._dispatchCustomEvent("investment-contribution-insufficient-amount")):(this._openErrorModal=!0,this._dispatchCustomEvent("investment-contribution-information-no-available"))}createOrderResponseHandlerError(){this._openErrorModal=!0;const t=this.isContribution?"investment-contribution-information-no-available":"investment-withdrawal-information-no-available";this._dispatchCustomEvent(t)}createOrderResponseHandler(t){if(t.detail&&Object.keys(t.detail).length>0){t.detail.operationDate;const i={email:this._customerEmail};this.statusData={...this.statusData,...t.detail,...i},this._multistepVisible=!1,this._statusVisible=!0;let e="";const a=t.detail.orders.find((t=>"operationNumber"in t))||t.detail.orders.find((t=>"schedule"in t));a&&(e=a.operationNumber||a.schedule.id);const n={operationNumber:e};this._dispatchCustomEvent("investment-contribution-completed",n)}else{this._openErrorModal=!0;const t=this.isContribution?"investment-contribution-information-no-available":"investment-withdrawal-information-no-available";this._dispatchCustomEvent(t)}}_investmentPortfolioDataprovider(){return r`
      <bbva-dataprovider-investment-portfolio
        .headers="${this.headers}"
        host="${this.host}"
        version="${this.version}"
        requiredToken="${this.requiredToken}"
        @get-investment-portfolio-events-success="${this.getInvestmentPortfolioSuccess}"
        @error-on-get-investment-portfolio-events="${this.getInvestmentPortfolioError}"
      ></bbva-dataprovider-investment-portfolio>
    `}getInvestmentPortfolioSuccess(t){const{detail:i}=t,[e]=i,a=e.strategies.map((t=>{const i=this.dataFromProductDetail.strategies.find((i=>i.marketFund===t.catalogStrategyId));return{amount:t.investProducts[0].initialContribution.amount,...i}}));this.isContribution?(this.showLoader("full",!1,!1),this.validateListOperation(t)):this.postCreateInvestmentFundOrder(a)}getInvestmentPortfolioError(){this._openErrorModal=!0;const t=this.isContribution?"investment-contribution-information-no-available":"investment-withdrawal-information-no-available";this._dispatchCustomEvent(t)}_genericErrorModal(){return r`
      <bbva-help-modal
        header-text="${this.t("bbva-feature-investment-withdrawal-and-contribution-help-modal-header-text")}"
        full-height
        button-text="${this.t("bbva-feature-investment-withdrawal-and-contribution-help-modal-button")}"
        link-text=""
        fixed-footer
        modal-type="warning"
        ?visible="${this._openErrorModal}"
        @visible-changed="${this._errorHandler}"
      >
        <div class="custom-header" slot="slot-title">
          <bbva-clip-microillustration
            size='S'
            microillustration="error"
          ></bbva-clip-microillustration>
          <bbva-type-text 
            text="${this.t("bbva-feature-investment-withdrawal-and-contribution-help-modal-title")}" 
            font-weight="500" 
            size="3XL" 
            tag="span"
          ></bbva-type-text>
        </div>
        <div class="content" slot="slot-content">
          <bbva-type-text 
            text="${this.t("bbva-feature-investment-withdrawal-and-contribution-help-modal-description")}" 
            font-weight="350" 
            size="S" 
            tag="span"
          ></bbva-type-text>
        </div>
      </bbva-help-modal>`}_errorHandler(t){!1===t.detail&&(this._openExitModal=!1,this._openInvalidAmountModal=!1)}_modalStatus(t){!1===t.detail&&(this._openExitModal=!1)}_exitModal(){return r`
      <bbva-help-modal
        class="exit-modal"
        header-text="${this.isContribution?this.t("bbva-feature-investment-withdrawal-and-contribution-exit-modal-title"):this.t("bbva-feature-investment-withdrawal-exit-modal-title")}"
        title-icon="${d()}"
        body-text="${this.t("bbva-feature-investment-withdrawal-and-contribution-exit-modal-body")}"
        button-text="${this.t("bbva-feature-investment-withdrawal-and-contribution-exit-modal-button-text")}"
        link-text="${this.t("bbva-feature-investment-withdrawal-and-contribution-exit-modal-link-text")}"
        modal-type="caution"
        illustration="success"
        hide-content-padding-top
        ?visible="${this._openExitModal}"
        @help-modal-footer-button-click="${this.resetComponent}"
        @visible-changed="${this._modalStatus}"
      ></bbva-help-modal>`}_errorSimulateModal(){return r`
      <bbva-help-modal
        id="errorSimulateModal"
        header-text="${this.t("bbva-feature-investment-withdrawal-and-contribution-amount-modal-title")}"
        full-height
        button-text="${this.t("bbva-feature-investment-withdrawal-and-contribution-amount-modal-button")}"
        fixed-footer
        modal-type="warning"
        title-icon="${h()}"
        ?visible="${this._openInvalidAmountModal}"
        @visible-changed="${this._errorHandler}"
      >
        <div class="content" slot="slot-content">
          <bbva-type-text 
            text="${this.t("bbva-feature-investment-withdrawal-and-contribution-amount-modal-description")}" 
            font-weight="500" 
            size="L" 
            tag="span"
          ></bbva-type-text>
          <bbva-type-text 
            text="${this.t("bbva-feature-investment-withdrawal-and-contribution-amount-modal-body")}" 
            font-weight="350" 
            size="S" 
            tag="span"
          ></bbva-type-text>
          <bbva-notification-message
            class="notification-message"
            message-title="${this.t("bbva-feature-investment-withdrawal-and-contribution-amount-modal-notification-title")}"
            message="${this.t("bbva-feature-investment-withdrawal-and-contribution-amount-modal-notification-description")}"
          ></bbva-notification-message>
        </div>
      </bbva-help-modal>`}flowManager(t){this.nextStepValidAmount=!1,this.statusData={...t.detail},this._withdrawalType=t.detail.withdrawalType,this.isContribution||"Parcial"===t.detail.withdrawalType?this.getInvestmentPortfolio(t):(this.statusData.amount=this.dataFromProductDetail.fundAmount,this.postCreateInvestmentFundOrder())}getInvestmentPortfolio(t){this.statusData={...t.detail},this._investmentPortfolio.getInvestmentPortfolio({"segment.id":"*",expand:"strategies",riskProfile:this.dataFromProductDetail.portfolioConfiguration.riskProfile,version:this.dataFromProductDetail.portfolioConfiguration.version,currency:this.dataFromProductDetail.portfolioConfiguration.currency,initialContribution:t.detail.amount})}validateListOperation(t){const{detail:i}=t,[e]=i,a=e.strategies.map((({catalogStrategyId:t,investProducts:i})=>({fund:{title:{name:i[0].product.name},marketClassification:t},positionSize:{positionAmount:{amount:i[0].initialContribution.amount,currency:i[0].initialContribution.currency},positionType:{id:"AMOUNT"}},contract:{id:this.dataFromProductDetail.contractNumber,numberType:{id:"CCC"}}}))),n={relatedContract:{number:"",numberType:{number:"",id:"CCC"}},productClassification:{id:"20",classificationType:{id:"ASIN"}},riskLevelCategory:this.dataFromProductDetail.investmentProfile,orders:a};this._investmentFunds.version="1",this._investmentFunds.postValidateListOperations(n)}postCreateInvestmentFundOrder(t={}){let i=[];i=this.isContribution||"Parcial"===this._withdrawalType?t.map((t=>({investmentFund:{number:this.dataFromProductDetail.contractNumber,numberType:{id:this.dataFromProductDetail.numberType}},orderType:{id:this.isContribution?"SUBSCRIPTION":"REDEEM"},orderSubtype:{id:this.isContribution?t.subType:t.operationCodes.partialSaleCode},positionSize:{positionType:{id:"AMOUNT"},requestedPositionAmount:{amount:t.amount,currency:this.dataFromProductDetail.portfolioConfiguration.currency}},serializedNumber:this.isContribution?"":t.serializedNumber,offerId:"00",fund:{serie:t.serie,numberFormats:[{number:this.isContribution?t.numberType:ot.marketFundToFundNumber(t.associatedFund)}]}}))):this.dataFromProductDetail.strategies.map((t=>({investmentFund:{number:this.dataFromProductDetail.contractNumber,numberType:{id:this.dataFromProductDetail.numberType}},orderType:{id:"REDEEM"},orderSubtype:{id:t.operationCodes.totalSalesCode},positionSize:{positionType:{id:"SHARE"},quantity:0},serializedNumber:t.serializedNumber,offerId:"00",fund:{serie:t.serie,numberFormats:[{number:ot.marketFundToFundNumber(t.associatedFund)}]}})));const e={productClassification:{id:"20"},orders:i};this._investmentFunds.version="0",this._investmentFunds.postCreateInvestmentFundOrder(e),this._multistepVisible=!1,this._statusVisible=!1}static marketFundToFundNumber(t){return{BBVALIQ:"2229","BBVAC+":"2315",BBVAGF:"2333",BBVACR:"2332"}[t]}sendContributionValidated(){this.postCreateInvestmentFundOrder(this.statusData.dataFundOrder)}render(){return r`
      ${super.render()}
      ${this._investmentFundsDataprovider()}
      ${this._investmentPortfolioDataprovider()}
      <bbva-transition-container id="multistep" ?visible="${this._multistepVisible}">
        <div slot="slot-content">
          ${this.isContribution?r`
              <investment-contribution-multistep
                .dataFromProductDetail="${this.dataFromProductDetail}"
                .reset="${this.reset}"
                ?valid-amount="${this.nextStepValidAmount}"
                local-currency="${this.localCurrency}"
                @validate-amount-operation="${this.flowManager}"
                @exit-withdrawal-contribution="${this._exitModalHandler}"
                @complete-contribution="${this.sendContributionValidated}"
                @investment-multistep-reset="${()=>{this.reset=!1}}"
              ></investment-contribution-multistep>
            `:r`
              <investment-withdrawal-multistep
                .dataFromProductDetail="${this.dataFromProductDetail}"
                .reset="${this.reset}"
                local-currency="${this.localCurrency}"
                withdrawal-type="${this.withdrawalType}"
                @exit-withdrawal-contribution="${this._exitModalHandler}"
                @complete-withdrawal="${this.flowManager}"
                @investment-multistep-reset="${()=>{this.reset=!1}}"
              ></investment-withdrawal-multistep>
            `}
        </div>
      </bbva-transition-container>
      <bbva-transition-container id="status" ?visible="${this._statusVisible}">
        <div slot="slot-content">
          <investment-withdrawal-and-contribution-status
            ?is-contribution="${this.isContribution}"
            .ordersData="${this.statusData}"
            local-currency="${this.localCurrency}"
            @exit-form-bbva-invest-status-page="${this.resetComponent}"
          ></investment-withdrawal-and-contribution-status>
        </div>
      </bbva-transition-container>
      ${this._exitModal()}
      ${this._genericErrorModal()}
      ${this._errorSimulateModal()}
    `}}customElements.define(ot.is,ot);const lt=c((t=>class extends t{static get properties(){return{config:{type:Object},data:{type:Object},appStartedText:{type:String},stringNormalizeExceptions:{type:Array},dynamicMethodsName:{type:Array},dependsOnAppStartedLaunched:{type:Boolean},_isAppStartedLaunched:{type:Boolean}}}constructor(){super(),this.config={items:{},buttons:{continue:""},steps:{}},this.data={},this.appStartedText="app started:",this.stringNormalizeExceptions=["paymentCurrency","currency","operationNumber"],this.dynamicMethodsName=[],this.dependsOnAppStartedLaunched=!1,this._isAppStartedLaunched=!1}persistData(t){Object.assign(this.data,t)}buildDynamicMethods(){this.dynamicMethodsName.forEach((t=>{this[t]=()=>this._dispatch(`analytics-${this._camelToKebabCase(t)}`,this.data)}))}_camelToKebabCase(t){return t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`))}persistDataString(t){Object.assign(this.data,this.parseDataToString(t))}_toStringProcess(t,i){const e=t.toString();return this.stringNormalizeExceptions.includes(i)?e:this._normalizeStr(e)}_normalizeStr(t){let i=t;if("string"==typeof t){const e="ÁÃÀÄÂÉËÈÊÍÏÌÎÓÖÒÔÚÜÙÛÇáãàäâéëèêíïìîóöòôúüùûç",a="AAAAAEEEEIIIIOOOOUUUUCaaaaaeeeeiiiioooouuuuc",n=new RegExp(`[${e}]`,"ug");i=t.replace(n,(t=>a.charAt(e.indexOf(t)))).toLowerCase()}return i}parseDataToString(t,i){if(!t)return t;switch(typeof t){case"string":case"boolean":case"number":return this._toStringProcess(t,i);case"object":if(Array.isArray(t))return t.map((t=>this.parseDataToString(t)));const e={...t};return Object.keys(e).forEach((i=>{e[i]=this.parseDataToString(t[i],i)})),e;case"function":return this.parseDataToString(t());default:return t.toString()}}firePersistedData(t){this.persistData(t),this._dispatch("analytics-persisted-data",this.data)}fireNormalizedPersistedData(t){let i=t;"string"==typeof i&&(i=this.normalizeString(i)),"object"==typeof i&&Object.keys(i).forEach((t=>{i[t]=this.normalizeString(i[t])})),this.firePersistedData(i)}resetData(){this.data={},this._isAppStartedLaunched=!1}firePageVisit(){this._dispatch("analytics-page-visit",this.data),this._isAppStartedLaunched=!1}firePageView(t){this._dispatch("analytics-page-view"+(t?`-${t}`:""))}fireModal(){this._dispatch("analytics-modal")}fireModalWithData(){this._dispatch("analytics-modal",this.data)}fireInternalLink(t){this._dispatch("analytics-internal-link",t)}fireInternalLinkCard(t){this._dispatch("analytics-internal-link-card",t)}fireExternalLink(){this._dispatch("analytics-external-link")}fireItemAppStarted(t){if(!this._isAppStartedLaunched){const i=(null==t?void 0:t.id)||t,e=this._getTextConfig(i,"items");e&&(this.fireAppStarted(e),this._isAppStartedLaunched=this.dependsOnAppStartedLaunched)}}fireAppOnClickStart(){this._dispatch("analytics-app-on-click-start",this.data)}fireAppStarted(t){this.persistData({detail:`${this.appStartedText}${t}`}),this._dispatch("analytics-app-started",this.data)}fireAdvancedMark(){this._dispatch("analytics-advanced-mark",this.data)}fireAppCompleted(){this._dispatch("analytics-app-completed",this.data),this.resetData()}fireFrequentAppCompleted(){this._dispatch("analytics-frequent-app-completed",this.data),this.resetData()}normalizeString(t){return t.toLowerCase().normalize("NFD").replace(/[^a-zA-Z0-9 ]/g,"")}_getTextConfig(t,i){var e,a;return null===(e=this.config)||void 0===e||null===(a=e[i])||void 0===a?void 0:a[t]}getPathValue(t,i){return i.split(".").reduce(((t,i)=>t[i]),t)}_dispatch(t,i){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:i}))}}));class dt extends(lt(n)){static get is(){return"bbva-analyticmanager-investment-contribution"}static get properties(){return{}}resetAnalytics(){this.data={}}fireAnalyticsCompleted(t){var i;this.persistData(t);const e=null!==(i=this.data)&&void 0!==i&&i.withdrawlType?"analytics-investment-withdrawal-completed":"analytics-investment-contribution-completed";this._dispatchEvent(e,this.data)}fireAnalyticsOTP(){var t;const i=null!==(t=this.data)&&void 0!==t&&t.withdrawlType?"analytics-investment-withdrawal-otp":"analytics-investment-contribution-otp";this._dispatchEvent(i,this.data)}fireAnalyticsAppStepCompleteWithdrawal(t){this._dispatchEvent(t.nameEvent,this.data)}fireAnalyticsAppStepDistribution(){this._dispatchEvent("analytics-investment-contribution-step-distribution",this.data)}fireAnalyticsAppStepDistributionWithdrawal(t){this.persistData(t),this.persistData(null==t?void 0:t.analytic),this._dispatchEvent(t.nameEvent,this.data)}fireAnalyticsAppStepInput(t){this.persistData(t),this._dispatchEvent("analytics-investment-contribution-step-input",this.data)}fireAnalyticsAppStepInputWithdrawal(t){this.persistData(t),this.persistData(null==t?void 0:t.analytic),this._dispatchEvent(t.nameEvent,this.data)}fireAnalyticsAppStarted(t){this.persistData(null==t?void 0:t.analytic),this._dispatchEvent(t.nameEvent,this.data)}fireAnalyticsPageVisit(t){this.persistData(null==t?void 0:t.analytic),this._dispatchEvent(t.nameEvent,this.data)}_dispatchEvent(t,i={},e=this){e.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:i}))}}customElements.define(dt.is,dt);
