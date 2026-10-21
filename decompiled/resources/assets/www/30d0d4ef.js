import"./fc15786a.js";import"./6547a2ba.js";import{z as t,a8 as e,ac as a,ad as i,aa as r,ab as o,a9 as n,aX as s,an as c,L as l,ak as d,h as m,az as p,b6 as h,aC as u,bZ as b,aD as g,ah as v,ai as y,b4 as f,bX as S,bG as $,ag as _}from"./952f98a9.js";import{a7 as x,t as k,aL as C,p as P}from"./7f3d7ca9.js";import{B as A,a as w}from"./06acded6.js";import{a as V,d as I,B as L,e as D,c as E}from"./b42a85fd.js";import{c as M,B as T,a as W}from"./c3262640.js";import{B as F}from"./e32b4658.js";import{B as j}from"./59781be1.js";import{B}from"./0efe7f4c.js";import"./c9f15469.js";import{B as z}from"./d4a97cf1.js";import{B as R,a as N}from"./9269a6c6.js";import"./111ad2c6.js";import{B as O}from"./7bf5357f.js";import"./1336f6d9.js";import"./216055dc.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./afb1d3bc.js";import"./b427c606.js";import"./dd0af563.js";var H=t`:host {
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
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.guide-text {
  font-style: var(--bbva-terms-and-conditions-oc-car-loan-guide-text-font-style, var(--fontFacePrimaryLightFontStyle, ${e(o.light.fontStyle)}));
  font-weight: var(--bbva-terms-and-conditions-oc-car-loan-guide-text-font-weight, var(--fontFacePrimaryLightFontWeight, ${e(o.light.fontWeight)}));
  color: var(--bbva-terms-and-conditions-oc-car-loan-guide-text-color, var(--colorsSecondary600, ${e(n.secondary600)}));
  font-size: var(--bbva-terms-and-conditions-oc-car-loan-guide-text-font-size, var(--typographyTypeSmall, ${e(a.typeSmall)}));
  line-height: var(--bbva-terms-and-conditions-oc-car-loan-guide-text-line-height, var(--lineHeightTypeLarge, ${e(i.typeLarge)}));
  letter-spacing: 0;
  margin: 0 0 calc(((1.75 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) 0;
}

.documents-section {
  margin-bottom: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  display: flex;
  flex-direction: column;
  align-items: flex-start;
}

.icon-link {
  font-size: var(--bbva-terms-and-conditions-oc-car-loan-icon-link-font-size, var(--typographyTypeMedium, ${e(a.typeMedium)}));
  letter-spacing: 0;
  text-align: left;
}

.icon-link:first-child {
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.icon-link:not(:last-child) {
  padding-bottom: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.checkbox-section {
  letter-spacing: 0;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.notification {
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  --bbva-notification-message-icon-color: var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)});
}

.notification-text {
  font-weight: var(--bbva-terms-and-conditions-oc-car-loan-notification-text-font-weight, var(--fontFacePrimaryLightFontWeight, ${e(o.light.fontWeight)}));
  margin: 0;
}

.actions {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}

.button {
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) 0 0;
}

.footer-link {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  display: flex;
  justify-content: center;
}
`;class q extends(s(A(x(c(l))))){static get is(){return"bbva-terms-and-conditions-oc-car-loan"}static get scopedElements(){const t=[h,M,V,I];return q.scopedElementsFromClasses(t)}static get properties(){return{documents:{type:Array},checks:{type:Array},guideText:{type:String,attribute:"guide-text"},hasNotification:{type:Boolean,attribute:"has-notification"},iconNotification:{type:String,attribute:"icon-notification"},buttonText:{type:String,attribute:"button-text"},isEnable:{type:Boolean,state:!0,attribute:"is-enable"},isEmail:{type:Boolean,attribute:"is-email"},showCallMeBack:{type:Boolean}}}constructor(){super(),this.documents=[],this.checks=[],this.guideText="",this.hasNotification=!1,this.iconNotification="",this.buttonText="",this.isEnable=!1,this.notificationDescription="",this.isEmail=!1,this.showCallMeBack=!1}static get styles(){return[H,d("bbva-terms-and-conditions-oc-car-loan-pre-approved-shared-styles")]}get _conditionsChecks(){const t=this.shadowRoot.querySelectorAll('[data-tag-name="bbva-form-checkbox"]');return Array.from(t)}render(){return m`
      <div class= "container" >
        ${this.guideText?m`<p class = "guide-text">${this.t(this.guideText)}</p>`:""}
        ${this.hasNotification?m`
            <bbva-notification-message
              id="nmTermsConditionsPreApproved"
              icon = "${this.t(this.iconNotification)}"
              class="notification"
              message="${this.t("bbva-multistep-oc-car-loan-terms-and-conditions-notification-text-pre-approved")}">
            </bbva-notification-message>
          `:""}
        ${this.documents.length?m`
            <section class = "documents-section" id="documentsSection">
              ${this.documents.map((t=>this._iconLinkTemplate(t)))}
            </section>
          `:""}
        ${this.checks.length?m`
            <section class= "checkbox-section">
              ${this.checks.map((t=>this._checkboxTemplate(t)))}
            </section>
          `:""}
        <div class= "actions">
          ${this.buttonText?m`
              <bbva-button-default
                id="buttonContinueTerms"
                class="button"
                ?disabled="${!this.isEnable}"
                text= "${this.t(this.buttonText)}"
                @click= "${this._handleButtonContinueClick}">
              </bbva-button-default>
              <div class="footer-link">
                <bbva-button-default
                  variant="link"
                  text="${this.t("bbva-multistep-oc-car-loan-certificated-call-consultant")}"
                  icon=${p()}
                  ?hidden="${!this.showCallMeBack}"
                  @click="${()=>{this._dispatchCustomEvent("car-loan-open-call-me-back-from-sticky")}}"
                >
                </bbva-button-default>
              </div>
            `:""}
        </div>
      </div>
      `}_iconLinkTemplate({id:t,icon:e,text:a}){return m`
      <bbva-link
        id="${t}"
        class="icon-link"
        icon="${e}"
        icon-size="24"
        @click="${({target:t})=>{this._fireEvent("link-click",t.id)}}">
        ${this.t(a)}
      </bbva-link>
    `}_checkboxTemplate({name:t,value:e,label:a,checkIcon:i}){return m`
      <bbva-form-checkbox
        id = "${t}"
        class="checkbox"
        name="${t}"
        value="${e}"
        label=${this.t(a)}
        @change="${this._validateCheck}"
        check-icon="${i}"
        required>
      </bbva-form-checkbox>
    `}_validateCheck(){this.isEnable=this._conditionsChecks.every((({checked:t})=>t))}_handleButtonContinueClick(){this._fireEvent("button-click")}_fireEvent(t,e=!0){const a=new CustomEvent(`terms-and-conditions-oc-car-loan-${t}`,{bubbles:!0,composed:!0,detail:e});this.dispatchEvent(a)}}class X extends(O(l)){static get is(){return"car-loan-input-validator"}static get properties(){return{amountData:Object,language:String}}constructor(){super(),this.amountData={},this.language=""}validate(t){const e=u(this.language),a=t.replace(new RegExp(`[^0-9${e}-]+`,"g"),""),i=Number.isInteger(Number(a))&&a>=this.amountData.amountMin&&a<=this.amountData.amountMax;return!t||i}}customElements.define(X.is,X);var U=t`:host {
  display: block;
  position: absolute;
  top: 0;
  bottom: 0;
  right: 0;
  left: 0;
  box-sizing: border-box;
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-0: var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)});
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-1: var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)});
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-2: var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)});
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-3: var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)});
  --bbva-form-range-bg-bar-filled-dark-mode-color-step-4: var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)});
  --bbva-expandable-step-content-max-height: none;
  --bbva-list-info-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-info-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

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

#contract-step-1 {
  --bbva-expandable-step-completed-content-max-height: none;
  margin-top: calc(((-7 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

#headerPreApproved {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  padding-right: 0;
  padding-left: 0;
  padding-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  background-color: var(--colorsPrimaryCore, ${e(n.primaryCore)});
  --bbva-panel-info-image-width: 120px;
  --bbva-panel-info-image-height: 83px;
  --bbva-text-font-weight: var(--fontFacePrimaryLightFontWeight, ${e(o.light.fontWeight)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  top: 0;
  left: 0;
  right: 0;
}

#secondStepTitle {
  --bbva-header-category-heading-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-link-color: var(--colorsPrimarySubdued, ${e(n.primarySubdued)});
}

.amount-title {
  font-size: var(--bbva-multistep-oc-car-loan-amount-title-font-size, var(--typographyTypeSmall, ${e(a.typeSmall)}));
  font-weight: var(--bbva-multistep-oc-car-loan-amount-title-font-weight, var(--fontFacePrimaryLightFontWeight, ${e(o.light.fontWeight)}));
  letter-spacing: var(--bbva-multistep-oc-car-loan-amount-title-letter-spacing, 0);
  line-height: var(--bbva-multistep-oc-car-loan-amount-title-line-height, var(--lineHeightTypeLarge, ${e(i.typeLarge)}));
  margin: 0;
}

.amount {
  margin-bottom: calc(((0.875 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  --_amount-text-color: var(--colorsSecondaryWhite, ${e(n.SecondaryWhite)});
  --bbva-amount-color: var(--colorsSecondaryWhite, ${e(n.SecondaryWhite)});
}

.step-1-section-title {
  font-size: var(--bbva-multistep-oc-car-loan-step-1-section-title-font-size, var(--typographyTypeSmall, ${e(a.typeSmall)}));
  letter-spacing: var(--bbva-multistep-oc-car-loan-step-1-section-title-letter-spacing, 0);
  line-height: var(--bbva-multistep-oc-car-loan-step-1-section-title-line-height, var(--lineHeightTypeLarge, ${e(i.typeLarge)}));
  text-transform: uppercase;
  margin: calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) 0;
  font-weight: var(--bbva-multistep-oc-car-loan-step-1-section-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(o.medium.fontWeight)}));
}

.list-item {
  padding: 0 0 calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) 0;
  --bbva-list-simple-label-color: var(--colorsSecondaryWhite, ${e(n.SecondaryWhite)});
  --bbva-list-simple-icon-color: var(--colorsSecondaryWhite, ${e(n.SecondaryWhite)});
  --bbva-list-simple-dark-label-color: var(--colorsSecondaryWhite, ${e(n.SecondaryWhite)});
  --_list-simple-description-color: var(--colorsSecondaryWhite, ${e(n.SecondaryWhite)});
  --bbva-list-simple-description-color: var(--colorsSecondaryWhite, ${e(n.SecondaryWhite)});
  --bbva-text-font-weight: 300;
}
.list-item .highlight {
  --bbva-text-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}

.list-item-info {
  padding: 0;
}

.list-item:not(:last-child) {
  margin-bottom: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.list-info {
  --typographyTypeSmall: 12px;
  --bbva-list-info-min-height: grid8Spacer(36px);
  --lineHeightTypeSmall: 16px;
  --bbva-list-info-color: var(--colorsSecondaryWhite, ${e(n.SecondaryWhite)});
  --_list-info-icon-color: var(--colorsSecondaryWhite, ${e(n.SecondaryWhite)});
  margin-bottom: calc(((1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  padding: 0;
  --gridSpacerVariant: 4;
}

.info-text {
  font-weight: var(--bbva-multistep-oc-car-loan-info-text-font-weight, var(--fontFacePrimaryLightFontWeight, ${e(o.light.fontWeight)}));
  letter-spacing: var(--bbva-multistep-oc-car-loan-info-text-letter-spacing, 0);
}

.account-title {
  text-transform: uppercase;
  font-size: var(--bbva-multistep-oc-car-loan-account-title-font-size, var(--typographyTypeSmall, ${e(a.typeSmall)}));
  font-weight: var(--bbva-multistep-oc-car-loan-account-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(o.medium.fontWeight)}));
  letter-spacing: var(--bbva-multistep-oc-car-loan-account-title-letter-spacing, 0);
  line-height: var(--bbva-multistep-oc-car-loan-account-title-line-height, var(--lineHeightTypeLarge, ${e(i.typeLarge)}));
  margin-top: calc(((2.625 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.step-two {
  margin-bottom: calc(((12 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

#termsPreApproved {
  --bbva-terms-and-conditions-oc-car-loan-content-padding: 0 0 grid8Spacer(16px) 0;
}

.notification-text {
  margin: 0;
}

.icon-link {
  text-align: left;
  --bbva-core-icon-fill-color: var(--colorsSecondaryWhite, ${e(n.SecondaryWhite)});
  --bbva-link-color: var(--colorsSecondaryWhite, ${e(n.SecondaryWhite)});
  font-weight: var(--bbva-multistep-oc-car-loan-icon-link-font-weight, var(--fontFacePrimaryBookFontWeight, ${e(o.book.fontWeight)}));
  --gridSpacerVariant: 4;
}

.panel {
  display: flex;
  position: absolute;
  align-items: center;
  justify-content: center;
  max-height: calc(((12 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  min-height: calc(((12 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  --bbva-panel-button-fixed-padding: 0;
}

[data-tag-name=bbva-list-info] {
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${e(o.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${e(o.mediumItalic.fontStyle)});
  line-height: var(--lineHeightTypeLarge, ${e(i.typeLarge)});
  align-items: center;
  padding: 0;
  min-height: 0;
}

.amount-title {
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  font-weight: var(--fontFacePrimaryLightFontWeight, ${e(o.light.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${e(i.typeLarge)});
}

.divider {
  display: block;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  margin-right: 0;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  margin-left: 0;
  --bbva-divider-opacity: 0.3;
}

.summary {
  padding-left: 0;
  --bbva-text-font-weight: var(--fontFacePrimaryLightFontWeight, ${e(o.light.fontWeight)});
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-info-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-info-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-text-highlight-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}
.summary #acceptedInfo {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

#summaryAmount {
  padding-top: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  padding-right: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  padding-bottom: calc(((0 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  display: flex;
  flex-direction: column;
}

.footer {
  display: flex;
  justify-content: center;
  padding-top: 0;
}

.footer-link {
  display: flex;
  justify-content: center;
  margin-top: calc(((1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.footer-link-summary {
  display: flex;
  justify-content: center;
  margin-top: calc(((1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.amortization-table {
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) 0 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.padding-x {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.padding-notification {
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-panel-button-fixed][id=panelFixedPreApproved] {
  margin-top: 0;
  z-index: 0;
}

[data-tag-name=bbva-list-simple][id=simpleTextPreApproved] {
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.text-justify {
  text-align: justify;
}

.amountContent {
  padding-top: 1.5rem;
  padding-left: 1rem;
  padding-right: 1rem;
  padding-bottom: 1.5rem;
  text-align: center;
}
`;class G extends(s(c(A(x(l))))){static get scopedElements(){const t=[L,V,D,f,T,W,F,M,k,j,B,z,h,S,$,R,N,E,C,P,w,_,q,X];return G.scopedElementsFromClasses(t)}static get is(){return"bbva-multistep-oc-car-loan-pre-approved"}static get properties(){return{contractSummary:{type:Object,attribute:"contract-summary"},contractDocs:{type:Array,attribute:"contract-docs"},checks:{type:Array},currencyCode:{type:String,attribute:"currency-code"},localCurrency:{type:String,attribute:"local-currency"},items:{type:Array},itemSelectedIndex:{type:Number,attribute:"item-selected-index"},amountData:{type:Object},_amount:{type:Number,state:!0},_invalidAmount:{type:Boolean,state:!0},sliderProperty:{type:Object},sliderSelected:{type:Number,attribute:"slider-selected"},_sliderValue:{type:Number,state:!0},keyInfo:{type:Array},customMessage:{type:Object},customOrdinaryRate:{type:String},stickyPayload:{type:Object},keyInfoPayment:{type:Array},userEmail:{type:String,attribute:"user-email"},userPhone:{type:String,attribute:"user-phone"},_hasInteraction:{type:Boolean,state:!0},_onResetStep:{type:Array,state:!0},_currentStep:{type:Number,state:!0},_allCompleted:{type:Boolean,state:!0},_interaction:{type:String,state:!0},currentAmount:{type:Number,attribute:"current-amount"},_showSpinner:{type:Boolean,state:!0},_hideStickyPayment:{type:Boolean,state:!0},_amountError:{type:String,state:!0},showCallMeBack:{type:Boolean,attribute:"show-call-me-back"},_hideSymbolAmount:{type:Boolean,state:!0}}}constructor(){super(),this._hasInteraction=!1,this.contractSummary={},this.contractDocs=[],this.checks=[],this.currencyCode="",this.localCurrency="",this.language="",this._allCompleted=!1,this._currentStep=-1,this.items=[],this.itemSelectedIndex=0,this.amountData={},this._amount=0,this._invalidAmount=!1,this.sliderProperty={},this.sliderSelected=-1,this._sliderValue=0,this.keyInfo=[],this.customMessage={},this.customOrdinaryRate="",this.stickyPayload={},this.keyInfoPayment=[],this._steps=[],this.userEmail="",this.userPhone="",this._onResetStep=[],this.oldItemSelectedIndex=0,this._interaction="",this._showSpinner=!1,this._hideStickyPayment=!1,this._amountError="",this.showCallMeBack=!1,this._hideSymbolAmount=!1}static get styles(){return[U,b.light,d("bbva-multistep-oc-car-loan-pre-approved-shared-styles")]}update(t){super.update(t),t.has("currencyCode")&&(this._numberFormat=new Intl.NumberFormat(this.language,{style:"currency",currency:this.currencyCode,minimumFractionDigits:2,maximumFractionDigits:2})),t.has("itemSelectedIndex")&&this._notifyPropertyChanged("item-selected-index",this.itemSelectedIndex),t.has("amountData")&&(this._amount=-1,this._hideSymbolAmount=!1,this._validateFormAmount()),t.has("_amount")&&(this._validateFormAmount(),this._notifyPropertyChanged("amount",this._amount)),(t.has("_amount")||t.has("amountData"))&&this._inputFocusout(),t.has("sliderProperty")&&this._initializeSliderAndPaymentDetails(),t.has("sliderSelected")&&this._notifyPropertyChanged("slider-selected",this.sliderSelected),(t.has("_currentStep")||t.has("_allCompleted"))&&(this._allCompleted||this._currentStep>=0)&&this._notifyStepOrCompletionStatusChange(),t.has("stickyPayload")&&Object.keys(this.stickyPayload).length&&!this._steps.length&&this._setupSteps(),t.has("_interaction")&&this._interaction&&!this._hasInteraction&&this._notifyPropertyChanged("interaction",{interaction:this._interaction}),t.has("_showSpinner")&&this._genericDispatchEvent((this._showSpinner?"show":"hide")+"-spinner",!0)}firstUpdated(){super.firstUpdated(),this._showSpinner=!0}get currentAmount(){return this._amount>=0||Number.isNaN(this._amount)?this._amount:this.amountData.amount}get _amountRange(){return{amountMin:this._formatAmount(this.amountData.amountMin),amountMax:this._formatAmount(this.amountData.amountMax)}}get customMessageText(){return this.customMessage&&this.customMessage.message?` ${this.t(this.customMessage.message,{...this.customMessage.params,percentageText:`${this.t("bbva-multistep-oc-car-loan-certificated-taxes-and-costs-cat-without")} <span class='highlight'>${this.customMessage.params.percentage}%</span>`})} `:""}get customMessageOrdinaryRate(){return this.customOrdinaryRate?this.customOrdinaryRate:""}get monthlyPayment(){return this.stickyPayload&&this.stickyPayload.monthlyPayment||""}get paymentText(){return this.stickyPayload&&this.stickyPayload.paymentText?this.t(this.stickyPayload.paymentText):""}get _panelButton(){return this.shadowRoot.querySelector("#panelButton")||{}}get _sliderDefaultSelected(){return this.sliderProperty&&this.sliderProperty.snaps&&this.sliderProperty.snaps.indexOf(this.sliderProperty.sliderValue)}get _formSliderLength(){return this.sliderProperty.snaps&&this.sliderProperty.snaps.length||0}get _formAmountInfo(){return this._invalidAmount?"":this.t("bbva-multistep-oc-car-loan-certificated-form-amount-info",this._amountRange)}get _formAmountError(){const t=(Number.isInteger((this.formAmount||{}).amount)?(this.formAmount||{}).amount>this.amountData.amountMax&&"maximun":"decimals")||(this.formAmount||{}).amount<this.amountData.amountMin&&"minimum";return this._invalidAmount?this.t(`bbva-multistep-oc-car-loan-certificated-form-amount-error-${t}`,this._amountRange):""}get _disabler(){return this._invalidAmount||!(this.formAmount||{}).amount||Number.isNaN(this._amount)}get _numberOfPrefilledSteps(){return this._steps.reduce(((t,e)=>e.hasAttribute("prefilled")?t+1:t),0)}get _interestRate(){const t=this.keyInfo[0]&&this.keyInfo[0].keyValues&&this.keyInfo[0].keyValues.find((t=>"CAT"===t.id)),e=t&&t.value;return e.slice(0,e.length-1)}get _checkboxList(){return[...this.shadowRoot.querySelector("#termsPreApproved").shadowRoot.querySelectorAll(".checkbox")]}get _buttonTermsAndConditions(){return this.shadowRoot.querySelector("#termsPreApproved")}get formAmount(){return this._formAmount||(this._formAmount=this.shadowRoot.querySelector('[data-tag-name="bbva-form-amount"]')),this._formAmount}get _radioItems(){return this.items.map((({id:t,name:e,description:a,oficialName:i},r)=>({id:i,text:this.t(e),value:t,infoMessage:a,checked:0===r})))}_setupSteps(){this._steps=[...this.shadowRoot.querySelectorAll("[data-tag-name='bbva-expandable-step']")],this._steps.forEach(((t,e)=>{this._enableFirstIncompletedStep(t,e)}));const t=this._steps.filter((t=>t.completed));this._currentStep=this._steps.indexOf(t[t.length-1])+1,this._firstStep=this._steps.indexOf(t[t.length-1])+1}_enableFirstIncompletedStep(t,e){const a=e-1,i=this._steps[a];(!i||i&&i.completed)&&(this._firstStepIndex=e,this._firstStepHeader=this._steps[e].shadowRoot.querySelector(".header"))}static _stepCompletedHandler({target:t}){t.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0}))}_bbvaListSimple({keyInfo:t=[],hideHeader:e=!1,showActionIcon:a=!1}){return m`
      ${t.map((({title:t="",keyValues:i=[]})=>m`
        ${e?"":m`
          <bbva-header-category
            text="${this.t(t)}">
          </bbva-header-category>
          `}
        <div class="keyInfo">
          ${i.map((({key:t,value:e,localValue:i,descriptionMedium:r}={})=>m`
            <bbva-list-simple
              action-icon="${a?g():""}"
              label="${this.t(t)}"
              ?description-medium="${r}"
              description="${e?this.t(i||e,{highlight:"<span class='highlight'>",endHighlight:"</span>",value:e}):""}">
            </bbva-list-simple>
          `))}
        </div>
      `))}
    `}_onStepCompletedChanged({detail:t,target:e}){if(t){const t=this._steps.find((t=>e&&e.step!==t.step&&!t.completed))||{};this._currentStep=t.step||-1}}_onAllComplete({detail:t}){this._allCompleted=t,this._allCompleted||(this._panelButton.show=!1)}_getCredit(){this._genericDispatchEvent("get-credit")}_changeItemSelected({detail:t}){var e,a;t&&"number"==typeof t.selected&&void 0!==t.selected&&null!==t.selected&&t.selected!==this.oldItemSelectedIndex&&(this.itemSelectedIndex=t.selected,this.oldItemSelectedIndex=this.itemSelectedIndex,this._interaction=null===(e=this._radioItems[null==t?void 0:t.selected])||void 0===e||null===(a=e.id)||void 0===a?void 0:a.toLowerCase())}_changeAmount(t){const{detail:e,target:a}=t;this._amount="number"==typeof e&&e||"object"==typeof a&&"number"==typeof a.amount&&a.amount||""}_updateSliderValue(t){return e=>{this[t]=this.sliderProperty.snaps&&this.sliderProperty.snaps[e.target.value-1]||0}}static _bbvaText({text:t,size:e="S",alignment:a="left",fontWeight:i="300",tag:r="span",className:o="",ambientColor:n=""}){return m`
      <bbva-text
        text="${t}"
        size="${e}"
        class="${o}"
        alignment="${a}"
        font-weight="${i}"
        tag="${r}"
        ambient-color="${n}">
      </bbva-text>
    `}_openModal(t){this._genericDispatchEvent(`car-loan-modal-${t}`,`${t}`)}_formatAmount(t){return this._numberFormat&&this._numberFormat.format(t)||t}_validateFormAmount(){this.formAmount.value&&this.formAmount.value!==this.formAmount.srAmount&&(this.formAmount.value=this.formAmount.srAmount)}_inputFocusout(){Promise.all([this.updateComplete,this.formAmount.updateComplete]).then((()=>{this.formAmount.blur()}))}validateExitConfirmation(){this._interaction?this._openModal("leave-contract"):this._genericDispatchEvent("car-loan-exit-confirmation")}get expandableMultistep(){return this._multistep||(this._multistep=this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]')),this._multistep}reset(){this.expandableMultistep&&this.expandableMultistep.scroll(0,0),this.items=[],this.itemSelectedIndex=0,this.oldItemSelectedIndex=0,this._interaction="",this._amount=-1,this._sliderValue=0,this._currentStep=-1,this.amountData={amount:0,amountMax:0,amountMin:0},this.sliderProperty={sliderValue:0,snaps:[]},this.sliderSelected=0,this.keyInfo=[],this.customMessage="",this.customOrdinaryRate="",this.stickyPayload={},this.keyInfoPayment=[],this._checkboxList.length&&this._checkboxList.forEach((t=>{t.checked=!1})),this._buttonTermsAndConditions.isEnable=!1,this._hasInteraction=!1,this._restoreStepsInitialState()}exit(){this._genericDispatchEvent("car-loan-exit-confirmation")}openStep(t){this._steps[t].completed=!1,this._steps[t].removeAttribute("completed")}toggleDisableStep(t,e){this._steps[t].disabled=e,this._steps[t].active=!e}_restoreStepsInitialState(){this._steps.forEach(((t,e)=>{this.openStep(e),this.toggleDisableStep(e,0!==e)}))}_notifyPropertyChanged(t,e){this._genericDispatchEvent(`${t}-changed`,e)}_dispatchChangeAmount(t){const{target:e,bubbles:a,composed:i}=t;e.amount===this.currentAmount||Number.isNaN(this._amount)&&""===e.value||e.dispatchEvent(new CustomEvent("change-amount",{bubbles:a,composed:i}))}_genericDispatchEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}_createContractDetailsStep(){return m`
      <bbva-expandable-step
        hide-padding-left
        hide-padding-right
        id="contract-step-1"
        class="step-one"
        header="${this.t("bbva-oc-car-loan-car-loan-text")}"
        @expandable-step-edit-step="${t=>{this._currentStep=t+this._numberOfPrefilledSteps}}"
        @expandable-step-complete-change="${this._onStepCompletedChanged}"
      >
          ${this._simulatorStep}
        <div class="summary" slot="summary">
          <bbva-header-category
            id="secondStepTitle"
            text="${this.t("bbva-multistep-oc-car-loan-certificated-quotation-title")}"
            option-link="bbva-multistep-oc-car-loan-option-change"
            link-accessibility-text="bbva-multistep-oc-car-loan-option-change"
            @header-category-link-click="${()=>{this._steps[this._firstStepIndex].edit()}}">
          </bbva-header-category>
          ${this._simulatorSummaryStep}
        </div>
      </bbva-expandable-step>
    `}_initializeSliderAndPaymentDetails(){this.sliderSelected=-1,this._sliderValue=0,this.keyInfoPayment=[{key:"bbva-multistep-oc-car-loan-car-type",label:this.items[this.itemSelectedIndex]?this.items[this.itemSelectedIndex].label:""},{key:"bbva-multistep-oc-car-loan-certificated-form-range-label",value:`${this.sliderSelected>=0?this.sliderSelected:this.sliderProperty.sliderValue}`,label:"bbva-multistep-oc-car-loan-form-range-months"},{key:"bbva-multistep-oc-car-loan-monthly-payment-without-vat",value:this._formatAmount(this.stickyPayload.monthlyPayment)}]}_notifyStepOrCompletionStatusChange(){(this._allCompleted||this._currentStep>=0)&&this._notifyPropertyChanged(this._allCompleted?"all-completed":`current-step-${this._currentStep}`,{typology:this.items[this.itemSelectedIndex]&&this.items[this.itemSelectedIndex].oficialName.toLowerCase(),amount:this.currentAmount,paymentAmount:this.stickyPayload.monthlyPayment,interestRate:this._interestRate,numberOfPayments:this.sliderSelected>=0?this.sliderSelected:this.sliderProperty.sliderValue,currency:this.currencyCode})}showCallMeBackFlag(t){var e;const a=null===(e=t["glomo.widgetcallmeback.ocCarLoan.leadRefactor"])||void 0===e?void 0:e.value;this.showCallMeBack=a,this._genericDispatchEvent("car-loan-show-call-me-back-flag-value",a)}get _simulatorStep(){return m`
      <bbva-panel-info
        id="headerPreApproved"
        disabled-tabindex
        image="images/noPreApprovedCar/car_loan_dollar_dark.svg"
        heading=${this.t("bbva-multistep-oc-car-loan-pre-approved-heading-panel-title")}
        text="${this.t("bbva-multistep-oc-car-loan-certificated-header-title")}">
      </bbva-panel-info>
      <bbva-header-category
        id="titleHeaderPreApproved"
        class="removable_padding"
        text="${this.t("bbva-multistep-oc-car-loan-certificated-quotation-title")}">
      </bbva-header-category>
      <div class="content">
        ${this._contentSimulatorStep}
      </div>
      <bbva-panel-button-fixed
        id="buttonFixedPreApproved"
        button-class="positive"
        show
        sticky
        button-text="${this.t("bbva-multistep-oc-car-loan-button-continue-text")}"
        ?disabled=${this._disabler}
        @panel-button-fixed-item-click="${G._stepCompletedHandler}"
      >
      </bbva-panel-button-fixed>
      <div class="footer-link">
        <bbva-button-default
          variant="link"
          text="${this.t("bbva-multistep-oc-car-loan-certificated-call-consultant")}"
          icon=${p()}
          ?hidden="${!this.showCallMeBack}"
          @click="${()=>{this._genericDispatchEvent("car-loan-open-call-me-back-from-sticky")}}"
        >
        </bbva-button-default>
      </div>
    `}get _contentSimulatorStep(){return m`
      <car-loan-input-validator language=${this.language} .amountData=${this.amountData}>
      </car-loan-input-validator>
      <div class="padding-x">
        <bbva-form-radio-group
          name="radios"
          label-out="${this.t("bbva-multistep-oc-car-loan-certificated-form-radio-title")}"
          selected="0"
          link-accessibility-text = "${this.t("bbva-multistep-oc-car-loan-radio-group-link-accessibility-text")}"
          required
          .items="${this._radioItems}"
          @form-radio-group-item-change="${this._changeItemSelected}"
        >
        </bbva-form-radio-group>
        <bbva-form-amount
          label="${this.t("bbva-multistep-oc-car-loan-certificated-form-amount-label")}"
          currency-code="${this.currencyCode}"
          local-currency="${this.localCurrency}"
          language="${this.language}"
          value="${this.amountData.amount}"
          inputmode="decimal"
          info-message="${this._formAmountInfo}"
          info-icon="${v()}"
          error-message="${this._amountError}"
          auto-validate
          symbol= "${!0===this._hideSymbolAmount?" ":"$"}"
          validator="car-loan-input-validator"
          ?invalid="${this._invalidAmount}"
          @keydown="${()=>{this._hideSymbolAmount=!1}}"
          @change-amount="${this._changeAmount}"
          @bbva-core-input-validate="${({target:t})=>{this._invalidAmount=t.invalid,this._amountError=this._formAmountError}}"
          @form-field-input-clear="${()=>{this._amount=0,this._hideSymbolAmount=!0}}"
          @form-field-input-focus="${()=>{this._hideStickyPayment=!0}}"
          @form-field-input-blur="${t=>{this._hideStickyPayment=!1,this._dispatchChangeAmount(t)}}"
          @click="${()=>{this._interaction=this.t("bbva-multistep-oc-car-loan-interaction-3")}}"
        >
        </bbva-form-amount>
        <div class="amountContent">
        ${G._bbvaText({text:this.t("bbva-multistep-oc-car-loan-pre-approved-text-pay-monthly"),size:"XS",tag:"p",alignment:"center",ambientColor:"secondary500"})}
        <bbva-amount
          id="amountPreApproved"
          class="amount"
          variant="4xl"
          amount="${this._disabler?0:this.stickyPayload.monthlyPayment}"
          currency-code="${this.currencyCode}"
          local-currency="${this.localCurrency}"
          language="${this.language}">
        </bbva-amount>
        ${G._bbvaText({text:this.t("bbva-multistep-oc-car-loan-pre-approved-text-pay-without-iva"),tag:"p",size:"XS",alignment:"center"})}
        </div>
        ${G._bbvaText({text:this.t("bbva-multistep-oc-car-loan-certificated-form-range-info-title"),size:"2XS",tag:"p",ambientColor:"secondary500"})}
        <bbva-list-simple
          id="simpleTextPreApproved"
          action-accessibility-text="${this.t("bbva-multistep-oc-car-loan-list-simple-action-accessibility-text")}"
          class="removable_padding"
          hide-padding-top
          hide-padding-bottom
          label="${this.t("bbva-multistep-oc-car-loan-certificated-form-range-label")}"
          description-medium
          description="${this.t("bbva-multistep-oc-car-loan-certificated-form-range-description",{sliderValue:this._sliderValue||this.sliderProperty.sliderValue})}"
        >
        </bbva-list-simple>
        <bbva-form-range
          variant="informational-section"
          min="1"
          max="${Math.max(this._formSliderLength,2)}"
          value="${this._sliderDefaultSelected+1}"
          .itemLabels="${this.sliderProperty.snaps}"
          ?disabled="${this._disabler}"
          show-labels
          @change="${this._updateSliderValue("sliderSelected")}"
          @click="${()=>{this._interaction=this.t("bbva-multistep-oc-car-loan-interaction-1")}}"
          @input="${this._updateSliderValue("_sliderValue")}"
        >
        </bbva-form-range>
      </div>
      <div>
        ${this.keyInfo.map((({title:t="",keyValues:e=[]})=>m`
          <bbva-header-category
            id="taxesPreApproved"
            class="removable_padding"
            text="${this.t(t)}">
          </bbva-header-category>
          ${e.map((({key:t,value:e,localValue:a,modal:i,id:r,descriptionMedium:o}={})=>m`
            <bbva-list-simple
              id="${r}"
              action-accessibility-text="${this.t("bbva-multistep-oc-car-loan-list-simple-modal-accessibility-text")}"
              class="removable_padding"
              action-icon="${g()}"
              label="${this.t(t)}"
              description="${e?this.t(a||e,{highlight:"<span class='highlight'>",endHighlight:"</span>",value:e}):""}"
              ?description-medium="${o}"
              @list-simple-icon-click="${({detail:t})=>{this._interaction=t,this._openModal(i)}}"
            >
            </bbva-list-simple>
          `))}
        `))}
      </div>
      <div class ="padding-notification">
        ${G._bbvaText({text:this.customMessageText,alignment:"center"})}
        ${G._bbvaText({text:this.customMessageOrdinaryRate,alignment:"center",tag:"p"})}
        ${G._bbvaText({text:this.t("bbva-multistep-oc-car-loan-certificated-text-iva-info"),alignment:"center",tag:"p"})}
      </div>
    `}get _simulatorSummaryStep(){return m`
      <div id="summaryAmount">
        <span class="amount-title">${this.t("bbva-multistep-oc-car-loan-amount-to-request")}</span>
        <bbva-amount
          id="summaryAmountPreApproved"
          class="amount"
          variant="4xl"
          amount="${this.currentAmount}"
          currency-code="${this.currencyCode}"
          local-currency="${this.localCurrency}"
          language="${this.language}">
        </bbva-amount>
      </div>
      <bbva-divider class="divider" size="small"></bbva-divider>
      ${this.keyInfoPayment.map((({key:t,value:e,label:a,descriptionMedium:i=!1})=>m`
        <bbva-list-simple
          label="${this.t(t)}"
          ?description-medium="${i}"
          description="${e||""} ${a?this.t(a):""}">
        </bbva-list-simple>
      `)).reverse()}
      <bbva-divider class="divider" size="small"></bbva-divider>
      ${this._bbvaListSimple({keyInfo:this.keyInfo,hideHeader:!0})}
    `}_createTermsAndConditionsStep(){return m`
      <bbva-expandable-step
        id="contract-step-2"
        class="step-two"
        aria-hidden="true"
        aria-disabled="true"
        header="${this.t("bbva-multistep-oc-car-loan-terms-and-conditions-title")}"
        disabled-target=".action"
        edit-label="${this.t("bbva-multistep-oc-car-loan-consult-tex")}"
        hide-padding-top
        hide-padding-left
        hide-padding-right
        @expandable-step-edit-step="${t=>{this._currentStep=t+this._numberOfPrefilledSteps}}"
        @expandable-step-complete-change="${this._onStepCompletedChanged}">
        <bbva-terms-and-conditions-oc-car-loan
          id="termsPreApproved"
          button-text="${this.t("bbva-multistep-oc-car-loan-button-continue-text")}"
          .documents=${this.contractDocs}
          .checks=${this.checks}
          notification-description="${this.userEmail}"
          ?is-email="${this.userEmail}"
          ?showCallMeBack="${this.showCallMeBack}"
          has-notification
          @terms-and-conditions-oc-car-loan-link-click="${({detail:t})=>{this._openModal(t)}}"
          @terms-and-conditions-oc-car-loan-button-click="${G._stepCompletedHandler}"
        >
        </bbva-terms-and-conditions-oc-car-loan>
        <div class="summary" slot="summary">
          <bbva-list-info
            id="acceptedInfo"
            icon="${y()}"
            icon-size="16">
              ${this.t("bbva-multistep-oc-car-loan-step-2-accepted-terms")}
          </bbva-list-info>
          ${this.userEmail?m`
            <bbva-divider class="divider" size="small"></bbva-divider>
            <bbva-list-simple
              hide-paddin-top
              hide-padding-bottom
              id="emailItem"
              label="${this.t("bbva-multistep-oc-car-loan-email")}"
              description="${this.userEmail}">
            </bbva-list-simple>`:""}
        </div>
      </bbva-expandable-step>
    `}render(){return m`
      <bbva-expandable-multistep
        step-selector="[data-tag-name=\'bbva-expandable-step\']"
        id="contract-multistep" class="scrollable"
        hide-step-numbers
        .stepsToReset="${this._onResetStep}"
        @expandable-multistep-all-complete="${this._onAllComplete}"
        @expandable-multistep-scroll-animation-end="${()=>{this._panelButton.show=this._allCompleted}}">
          ${this._createContractDetailsStep()}
          ${this._createTermsAndConditionsStep()}
      </bbva-expandable-multistep>
      <bbva-panel-button-fixed
        id="panelButton"
        class="panel"
        ?hidden="${!this._allCompleted}"
        button-class="positive"
        button-text="${this.t("bbva-multistep-oc-car-loan-step-2-panel-button-fixed-text")}"
        sticky
        @panel-button-fixed-item-click="${this._getCredit}"
      >
      </bbva-panel-button-fixed>
      <div class="footer-link-summary">
        <bbva-button-default 
          variant="link" 
          text="${this.t("bbva-multistep-oc-car-loan-certificated-call-consultant")}"
          icon=${p()} 
          ?hidden="${!(this._allCompleted&&this.showCallMeBack)}"
          @click="${()=>{this._genericDispatchEvent("car-loan-open-call-me-back-from-sticky")}}"
        >
        </bbva-button-default>
      </div>
    `}}customElements.define(G.is,G);
