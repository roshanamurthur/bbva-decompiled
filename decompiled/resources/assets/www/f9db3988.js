import{z as e,a8 as t,ad as i,ab as a,a9 as r,aa as n,b0 as s,aJ as o,a as l,ap as d,an as c,L as h,bj as p,b6 as m,ag as g,dt as b,ak as v,h as u,av as y,i as f,f as _,o as x,g as S,bZ as $,cS as C,a_ as k,a$ as T,eY as w,f6 as E,b1 as I,ar as P,H as D,aX as L,b3 as M,b7 as R,aV as N,ac as O,F as A,b$ as z,bx as F,c0 as B,y as q,ah as V,aN as H,ai as j,aA as U,cO as K,G,el as Y,em as W,cG as X,aW as J,u as Z,cJ as Q,aD as ee,aB as te,aI as ie,eZ as ae,cD as re,bX as ne,b4 as se,b5 as oe,cH as le,bG as de,b8 as ce,b9 as he,e$ as pe,dm as me,f0 as ge,f1 as be,bU as ve,dy as ue,f7 as ye,f8 as fe,f9 as _e,bF as xe,di as Se,Y as $e,cI as Ce}from"./952f98a9.js";import{cg as ke,aM as Te,br as we,ck as Ee,c5 as Ie,aC as Pe,u as De,aX as Le,ch as Me,ci as Re,cj as Ne,ao as Oe,bH as Ae}from"./7f3d7ca9.js";import{c as ze,B as Fe}from"./703ea9fa.js";import"./d6d9f126.js";import{b as Be,B as qe}from"./609b7f72.js";import{b as Ve,B as He}from"./e1831171.js";import"./7cfc68eb.js";import{B as je,a as Ue,b as Ke}from"./45933d48.js";import{ax as Ge,j as Ye,g as We}from"./216055dc.js";import{a as Xe,C as Je}from"./23d80423.js";import{S as Ze}from"./e284eba4.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./8e6fdf7b.js";var Qe=e`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${t(r.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${t(r.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${t(r.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${t(r.secondary200)})));
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

.image {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${t(i.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(a.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${t(i.typeLarge)});
}
.title.not-text {
  margin-bottom: 0;
}

.description {
  margin: 0 auto;
  color: var(--_panel-info-text-color);
}

[data-tag-name=bbva-link] {
  display: inline-block;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
[data-tag-name=bbva-link][disabled] {
  opacity: 1;
}

:host([loading]):before {
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 144px 144px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 8px, 283% 168px, -20% 200px, 92% 232px;
}

:host([loading][image]):before {
  margin-top: 0;
  min-height: 17.5rem;
  background-image: linear-gradient(var(--_skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg, transparent);
  background-size: 100% 152px, calc((44% * 2) + (16px/ 2)) 16px, calc((75% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px;
  background-position: 50% 0px, 283% 172px, -20% 204px, 92% 236px;
}

:host([loading]):before {
  content: "";
  position: absolute;
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  min-height: 18.5rem;
  display: inline-block;
  pointer-events: none;
  background-repeat: no-repeat;
  font-size: 1em;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
}
:host([loading]) > :nth-child(n) {
  opacity: 0;
}

@keyframes pulse {
  0% {
    filter: opacity(100%);
  }
  50% {
    filter: opacity(60%);
  }
  100% {
    filter: opacity(100%);
  }
}
`,et=e`
[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
`,tt=e`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${t(r.primaryMedium)});
}
`;const it={light:e`
    ${s.light}
    ${et}
  `,dark:e`
    ${s.dark}
    ${tt}
  `};class at extends(o(l(d(c(h))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":p,"bbva-link":m,"bbva-text":g}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=b,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[Qe,super.styles,v("bbva-panel-info-shared-styles"),it.light,it.dark]}get _contentImage(){return this.image?u` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:u`
      <span
        class="${y({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===b}render(){return u`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&u`
          <bbva-text
            tabindex="0"
            class="title ${y({"not-text":!this.text})}"
            text=${this.t(this.heading)}
            size="L"
            alignment="center"
            tag="${f(this.headingLevelTitle)}"
            ?ellipsis="${!!this.headingLines}"
            .lines="${this.headingLines}"
            inherit
          ></bbva-text>
        `}
        ${this.t(this.text)&&u`
          <bbva-text
            tabindex="0"
            class="description"
            text=${this.t(this.text)}
            size="S"
            alignment="center"
            ?ellipsis="${!!this.textLines}"
            .lines="${this.textLines}"
            inherit
          ></bbva-text>
        `}
        ${u` <slot></slot> `}
        ${this.linkText&&u`
          <bbva-link
            ?disabled=${this.disabled}
            @click="${this._buttonClickHandler}"
            .text="${this.t(this.linkText)}"
          ></bbva-link>
        `}
      </div>
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}S("colors.primaryCoreLightened"),S("colors.primaryCoreLightened"),S("colors.primaryCoreLightened"),S("colors.cool50");const rt={light:e`
    ${ke.light}
    ${$.light}
    ${C.light}
    ${ze.light}
    ${k.light}
    ${Te.light}
    ${Be.light}
    ${T.light}
    ${s.light}
    ${we.light}
    ${w.light}
    ${Ve.light}
    ${it.light}
    ${E.light}
    ${I.light}
  `};var nt=e`:host {
  display: block;
  box-sizing: border-box;
  --bbva-notification-container-z-index: 11;
  --_payments-mobile-payment-header-margin: var(--payments-mobile-payment-header-margin, var(--bbva-header-main-min-height, 3rem));
}

:host([hidden]), [hidden] {
  display: none !important;
}

:host([loader-active]) {
  --bbva-header-main-z-index: var(--payments-mobile-payment-configuration-z-index, 11);
  --bbva-progress-content-z-index: var(--payments-mobile-payment-progress-z-index, 12);
}

*, *:before, *:after {
  box-sizing: inherit;
}
${(new P).mediaRules()}`;class st extends je{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`hub-payments/v${this.version}/devices/register`)}toString(){return super.toString("BGADPHubPaymentsDevicesRegisterPostV0")}}class ot extends Ue{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`hub-payments/v${this.version}/devices/register`)}toString(){return super.toString("BGADPHubPaymentsDevicesRegisterPostV1")}}class lt extends Ke{static get is(){return"bbva-global-devices-register-api-dm"}constructor(){super()}postDevicesRegister(e){this._generateGetService(this._getService("post",e),{customEvent:"devices-register-api-dm-create",errorFireEventHandler:"devices-register-api-dm-create-error"},this._responseMapping)}_getService(e,t={},i={}){const a=this._getServiceParams(i,t);return this._getServicePath(`${e}DevicesRegister`,this._getBgadp(a))}_getBgadp(e){return{postDevicesRegisterV0:()=>new st(e),postDevicesRegisterV1:()=>new ot(e),default:()=>"BGADP called not exist"}}_responseMapping(e){return e}}const dt={initializeMobilePayment:"payments-mobile-payment-call-initialize-mobile-payment",isRegistered:"payments-mobile-payment-call-is-registered",isNfcPaymentApp:"payments-mobile-payment-call-is-nfc-payment-app",checkDigitizeStatus:"payments-mobile-payment-call-check-digitized-card",setCardDigitizeStatus:"payments-mobile-payment-call-digitize-card",getFavoriteCard:"payments-mobile-payment-call-get-default-card",setFavoriteCard:"payments-mobile-payment-call-default-card-selected",areKeysReady:"payments-mobile-payment-call-are-keys-ready",deleteDeviceLocalMobilePayment:"payments-mobile-payment-call-delete-device-local-mobilepayment",deleteDeviceLocalTrustDevice:"payments-mobile-payment-call-delete-device-local-trustdevice",changeSecuritySetting:"payments-mobile-payment-call-set-cdcvm-for-lvt",getSecuritySetting:"payments-mobile-payment-call-is-cdcvm-for-lvt",login:"payments-mobile-payment-call-login",preRegister:"payments-mobile-payment-call-preregister",setRegistrationToken:"payments-mobile-payment-call-set-registration-token"},ct={getCard:"card-api-dm-fetch",getCards:"cards-api-dm-fetch",postSingleSignOn:"single-sign-on-api-dm-create",postDevicesRegister:"devices-register-api-dm-create"},ht=["login","setCardDigitizeStatus"],pt="SESSION",mt="mobilePaymentCards",gt=D((e=>class extends e{static get properties(){return{maxTries:{type:Number,attribute:"max-tries"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"}}}constructor(){super(),this.maxTries=3,this.native=!1,this.requiredToken="jws",this._pendingPluginCalls={},this._pendingDmCalls={},this._lastServiceCall={}}dmCall(e,t,i){return t in this._pendingDmCalls||(this._pendingDmCalls[t]=this._generateDmCall(e,t,i)),this._pendingDmCalls[t]}pluginCall(e,t,i){return e in this._pendingPluginCalls||(this._pendingPluginCalls[e]=this._generatePluginCall(e,t,i)),this._pendingPluginCalls[e]}retryDmCallOnError(){const{dm:e,method:t,params:i}=this._lastServiceCall;this._pendingDmCalls[t]=this._generateDmCall(e,t,i)}_generateDmCall(e,t,i){let a,r;const n=ct[t];return new Promise(((s,o)=>{a=e=>s(e.detail),r=e=>o(e),e.addEventListener(n,a),e.addEventListener(`${n}-error`,r),this._lastServiceCall={dm:e,method:t,params:i},e[t](i)})).catch((e=>Promise.reject(new Error(e.message,{cause:{method:t,params:i}})))).finally((()=>{delete this._pendingDmCalls[t],e.removeEventListener(n,a),e.removeEventListener(`${n}-error`,r)}))}_generatePluginCall(e,t,i=!1){return new Promise(((i,a)=>{this[`${e}Resolver`]=i,this[`${e}ResolverError`]=a,this._sendPluginEvent(e,t)})).catch((a=>Promise.reject(new Error(a.message,{cause:{method:e,params:t},noRetry:i})))).finally((()=>{delete this[`${e}Resolver`],delete this[`${e}ResolverError`],delete this._pendingPluginCalls[e]}))}_sendPluginEvent(e,t){this.dispatchEvent(new CustomEvent(dt[e],{bubbles:!0,composed:!0,detail:t&&"object"==typeof t?{...t}:t}))}})),bt={INOPERATIVE:"off",BLOCKED:"blocked"},vt={INOPERATIVE:"neutral",BLOCKED:"error"},ut=e=>(null==e?void 0:e.id)+(null==e?void 0:e.expirationDate),yt=(e,t="FRONT_CARD")=>{const i=(e.images||[]).find((e=>e.id===t));return(null==i?void 0:i.url)||null},ft=(e,t="EUR")=>{const i=(e.currencies||[]).find((e=>e.isMajor));return i&&i.currency?i.currency:t},_t=e=>{var t;const i=ft(e);return((null==e||null===(t=e.availableBalance)||void 0===t?void 0:t.currentBalances)||[]).filter((e=>{var t;return(null===(t=e.amount)||void 0===t?void 0:t.currency)===i})).reduce(((e,t)=>{var i;return e+((null===(i=t.amount)||void 0===i?void 0:i.amount)||0)}),0)},xt=e=>{var t;return bt[null==e||null===(t=e.status)||void 0===t?void 0:t.id]||null},St=e=>{var t;return(null==e?void 0:e.alias)||(null==e||null===(t=e.product)||void 0===t?void 0:t.name)};class $t extends(L(gt(M(h)))){static get is(){return"payments-mobile-payment-dm"}static get scopedElements(){const e=[R,Ee,lt,Ge];return $t.scopedElementsFromClasses(e)}static get properties(){return{cardApiVersion:{type:String,attribute:"card-api-version"},cardsApiVersion:{type:String,attribute:"cards-api-version"},hubPaymentsApiVersion:{type:String,attribute:"hub-payments-api-version"},localCardDmCustomProperties:{type:Object,attribute:"local-card-dm-custom-properties"},singleSignOnApiVersion:{type:String,attribute:"single-sign-on-api-version"},ssoAapTarget:{type:String,attribute:"sso-aap-target"},ssoTargetIdUniqueKey:{type:String,attribute:"sso-target-id"},country:{type:String}}}constructor(){super(),this.cardApiVersion="2",this.cardsApiVersion="1",this.country="",this.hubPaymentsApiVersion="0",this.localCardDmCustomProperties={},this.singleSignOnApiVersion="0",this.ssoAapTarget="30000051",this.ssoTargetIdUniqueKey=""}get dmCard(){return this._dmCard||(this._dmCard=this.shadowRoot.getElementById("cardDm")),this._dmCard}get dmCards(){return this._dmCards||(this._dmCards=this.shadowRoot.getElementById("cardsDm")),this._dmCards}get dmDevicesRegister(){return this._dmDeviceRegister||(this._dmDeviceRegister=this.shadowRoot.getElementById("devicesRegisterDm")),this._dmDeviceRegister}get dmSingleSignOn(){return this._dmSingleSignOn||(this._dmSingleSignOn=this.shadowRoot.getElementById("singleSignOnDm")),this._dmSingleSignOn}callInitialize(){return this.pluginCall("initializeMobilePayment")}callIsRegistered(){return this.pluginCall("isRegistered")}callIsDefaultApp(){return this.pluginCall("isNfcPaymentApp")}callSetDefaultApp(e){this.dispatchEvent(new CustomEvent("payments-mobile-payment-call-set-nfc-payment-app",{bubbles:!0,composed:!0,detail:e}))}async callFirstRegistration(e,t){const{pkcs7:i}=await this.callGetPKCS7(),a=await this.callPreRegister(i,t),{derivationId:r}=await this.callDevicesRegister(e,t,a);return await this.callSetRegistrationToken(r),i}callCheckDigitizeStatus(e){return this.pluginCall("checkDigitizeStatus",{cardId:ut(e)})}callEnableCard(e,t){return this.pluginCall("setCardDigitizeStatus",{card:{cardId:ut(e),pan:e.number,expirationMonth:moment(e.expirationDate).format("MM"),expirationYear:moment(e.expirationDate).format("YYYY")},pkcs7:t})}callSetFavoriteCard(e){return this.pluginCall("setFavoriteCard",e?ut(e):"UNSET_FAVORITE")}callGetFavoriteCard(){return this.pluginCall("getFavoriteCard")}callAreKeysReady(){return this.pluginCall("areKeysReady")}async callDeleteDeviceLocalMobilePayment(e){return this.pluginCall("deleteDeviceLocalMobilePayment",e)}async callDeleteDeviceLocalTrustDevice(){return this.pluginCall("deleteDeviceLocalTrustDevice")}callChangeSecuritySetting(e){return this.pluginCall("changeSecuritySetting",e)}callGetSecuritySetting(){return this.pluginCall("getSecuritySetting")}async callGetCards(){return this.dmCards||await this.updateComplete,this.dmCall(this.dmCards,"getCards")}async callGetCard(e){return this.dmCard||await this.updateComplete,this.dmCall(this.dmCard,"getCard",e)}async callGetPKCS7(){return this.dmSingleSignOn||await this.updateComplete,this.dmCall(this.dmSingleSignOn,"postSingleSignOn",{aapTarget:this.ssoAapTarget,targetIdUniqueKey:this.ssoTargetIdUniqueKey})}callLogin(e){return this.pluginCall("login",e)}async callDevicesRegister(e,t,i){return this.dmDevicesRegister||await this.updateComplete,this.dmCall(this.dmDevicesRegister,"postDevicesRegister",{country:{id:e},device:t,webSignatureData:i})}callPreRegister(e,t){return this.pluginCall("preRegister",{pkcs7:e,deviceRequest:t})}callSetRegistrationToken(e){return this.pluginCall("setRegistrationToken",e)}resetData(){for(const e of Object.keys(this._pendingDmCalls))delete this._pendingDmCalls[e];for(const e of Object.keys(this._pendingPluginCalls))delete this._pendingPluginCalls[e]}render(){return u`
      <bbva-global-cards-api-dm
        id="cardsDm"
        .host="${this.host}"
        .version="${this.cardsApiVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
      ></bbva-global-cards-api-dm>
      <bbva-global-card-api-dm
        id="cardDm"
        .host="${this.host}"
        .version="${this.cardApiVersion}"
        .requiredToken="${this.requiredToken}"
        .country="${this.country}"
        .localCustomProperties="${this.localCardDmCustomProperties}"
        ?native="${this.native}"
      ></bbva-global-card-api-dm>
      <bbva-global-devices-register-api-dm
        id="devicesRegisterDm"
        .host="${this.host}"
        .version="${this.hubPaymentsApiVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        requiredOtp
      ></bbva-global-devices-register-api-dm>
      <bbva-global-single-sign-on-api-dm
        id="singleSignOnDm"
        .host="${this.host}"
        .version="${this.singleSignOnApiVersion}"
        .requiredToken="${this.requiredToken}"
        ?native="${this.native}"
        requiredOtp
      ></bbva-global-single-sign-on-api-dm>
    `}}class Ct{constructor(e){this.controller=e}t(...e){var t;return null===(t=this.controller)||void 0===t?void 0:t.t(...e)}openModal(e,t={}){var i;null===(i=this.controller)||void 0===i||i.openModal(e,t)}_dispatchCustomEvent(e,t=!0){this.controller._dispatchCustomEvent(e,t)}}class kt extends Ct{get selectedCard(){var e;return((null===(e=this.controller)||void 0===e?void 0:e.cardsDigitizedStatus)||[]).find((e=>(null==e?void 0:e.id)===this.controller.selectedCardId))}get isCardEnabled(){var e;return(null===(e=this.selectedCard)||void 0===e?void 0:e.digitized)||!1}get cardStatusLabel(){return"payments-mobile-payment-feature-card-"+(this.isCardEnabled?"added":"not-added")}get cardBadgeTypeColor(){return this.isCardEnabled?"success":"neutral"}async _chooseCardAsDefault(e){const t=(null==e?void 0:e.detail)||!1;this._dispatchCustomEvent("payments-mobile-payment-change-favorite-card",{card:this.selectedCard,status:t})}selectedCardToEnable(){this._dispatchCustomEvent("payments-mobile-payment-digitize-card",{card:this.selectedCard})}showCardActions(e,t){return this.isCardEnabled?u`
          <bbva-list-toggle
            id="favoriteToggle"
            .heading="${this.t("payments-mobile-payment-feature-default-card-title")}"
            ?disabled=${t}
            ?checked="${e}"
            @list-toggle-switch-change="${e=>this._chooseCardAsDefault(e)}"
          ></bbva-list-toggle>
        `:u`
          <bbva-notification-message>
            ${this.t("payments-mobile-payment-feature-card-add-notification")}
          </bbva-notification-message>
          <div class="button-container">
            <bbva-button-default @click="${e=>this.selectedCardToEnable(e)}">
              ${this.t("payments-mobile-payment-feature-card-add-button")}
            </bbva-button-default>
          </div>
        `}render(){var e;const{language:t,localCurrency:i,isActualCardFavorite:a,disableSetFavorite:r}=this.controller;return this.selectedCard?u`
      <bbva-panel-detail
        no-link
        card-title="${St(this.selectedCard)}"
        badge-text="${this.t(this.cardStatusLabel)}"
        badge-text-type="${this.cardBadgeTypeColor}"
        badge-alignment="center"
        card-image="${yt(this.selectedCard)}"
        .mask="${null===(e=this.selectedCard)||void 0===e?void 0:e.number}"
        .language="${t}"
        .currencyCode="${ft(this.selectedCard,i)}"
        .localCurrency="${i}"
        amount="${_t(this.selectedCard)}"
        .amountInfo="${this.t("payments-mobile-payment-feature-card-available-amount")}"
        ?digitized=${this.isCardEnabled}
      ></bbva-panel-detail>
      ${this.showCardActions(a,r)}
    `:N}}var Tt=e`
:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${t(r.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 0.25rem;
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(r.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${t(r.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${t(r.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${t(r.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)})));
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(r.primaryCore)});
  --_header-main-active-icon-color: var(--bbva-header-main-dark-active-icon-color, var(--colorsPrimarySubduedLight, ${t(r.primarySubduedLight)}));
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${t(O.typeMedium)}));
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
`;let wt=class e extends(l(d(c(h)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":g,"bbva-icon":A,"bbva-badge-notification":z}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(t,i);return a in e?e[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[Tt,v("bbva-header-main-shared-styles"),F("button:focus"),I.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return u`<bbva-icon icon="${f(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return u`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right-header"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(t,i,a,r){const n=e.toCamelCase(t),s=`icon${n}`,o=`accessibilityTextIcon${n}`;return u`<button
      class="${i}"
      id="btn-${t}"
      aria-label="${f(this.t(this[o]))}"
      aria-expanded=${f(r)}
      ?hidden="${!this[s]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(s):this._icon(s)}
      ${this.showTextIcon?this._textIcon(a):""}
    </button>`}_textIcon(e){return u` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${f(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return u`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(e)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:a,_hasMicroillustration:r}=this;return u`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(r||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${f(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span
            class="${r}"
            ?hidden="${!r}"
            aria-hidden="true"
          >
            ${this.microillustration}
          </span>
        </h1>

        <div class="header-icons ${e} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}};S("colors.primaryCoreLightened"),S("colors.cool80"),S("colors.cool70"),S("colors.primaryCoreLightened"),S("colors.cool100"),S("colors.tertiaryType6Darkened"),S("colors.tertiaryType4Darkened"),S("colors.secondary300");var Et=e`:host {
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
${(new P).mediaRules()}`;class It extends(l(h)){static get is(){return"bbva-notification-container"}static get scopedElements(){return{"bbva-notification-toast":q}}static get properties(){return{duration:{type:Number},defaultType:{type:String,attribute:"default-type"},notificationIcons:{type:Object},fixedBottom:{type:Boolean,attribute:"fixed-bottom"},roleText:{type:String,attribute:"role-text"},ariaLiveText:{type:String,attribute:"aria-live-text"}}}constructor(){super(),this.ariaLiveText="polite",this.roleText="alert",this.defaultType="error",this.duration=4e3,this.notificationIcons={info:V(),warning:V(),error:H(),success:j()},this._stack=[],this._currentNotification={},this._toastOpened=!1,this._uniqueId=String(Math.floor(Math.random()*Date.now()))}get _defaultNotification(){return{description:"",simpleLinkText:"",type:this.defaultType,duration:this.duration}}getParentElement(){const e=this.getRootNode();return 11===e.nodeType?e.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowNotification=this._showNotification.bind(this),this._boundHideNotification=this._hideOnEvent.bind(this),this._parentElement.addEventListener("show-notification",this._boundShowNotification),this._parentElement.addEventListener("hide-notification",this._boundHideNotification)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.clear(),this._parentElement.removeEventListener("show-notification",this._boundShowNotification),this._parentElement.removeEventListener("hide-notification",this._boundHideNotification)}clear(e=!1){e&&(this._stack=[]),this._hideNotification()}_hideNotification(){this._currentTime&&this._clearTime(),this._toastOpened=!1,this.requestUpdate()}_clearTime(){clearTimeout(this._currentTime),this._currentTime=null}_computeIcon(e){return this.notificationIcons[e]||this.notificationIcons[this.defaultType]}_onNotificationClosed(e){e.stopPropagation(),this._showNextInStack()}_setCurrentNotification(){this._currentNotification={...this._defaultNotification,...this._stack.shift()}}_setNotificationDuration(){const{duration:e}=this._currentNotification;e>0&&(this._currentTime=setTimeout(this.clear.bind(this),e))}_hideOnEvent(e){this.clear(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNotification(e){this.add(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}_showNextInStack(){this._stack.length>0&&!this._toastOpened&&(this._setCurrentNotification(),this._toastOpened=!0,this._setNotificationDuration(),this.requestUpdate())}add({description:e="",simpleLinkText:t,type:i=this.defaultType,duration:a=this.duration}={}){const r=i;this._stack.push({type:r,description:e,simpleLinkText:t,duration:a}),this._showNextInStack()}static get styles(){return[Et,v("bbva-notification-container-shared-styles")]}render(){return u`
      <bbva-notification-toast
        .id="toast_${this._uniqueId}"
        ?show="${this._toastOpened}"
        @click="${this._hideNotification}"
        type="${f(this._currentNotification.type)}"
        .iconExplainer="${this._computeIcon(this._currentNotification.type)}"
        @closed="${this._onNotificationClosed}"
        .simpleLinkText="${this._currentNotification.simpleLinkText}"
        .alertText="${f(this._currentNotification.description)}"
        ?fixed-bottom="${this.fixedBottom}"
        .ariaLiveText="${this.ariaLiveText}"
        .roleText="${this.roleText}"
      ></bbva-notification-toast>
    `}}var Pt={...U};const Dt=new P;var Lt=e`:host {
  --_bg-color: var(--bbva-progress-content-dark-mode-bg-color, var(--bbva-progress-content-bg-color, var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)})));
  --_spinner-size: var(--bbva-progress-content-spinner-size, 3rem);
  --_spinner-message-color: var(--bbva-progress-content-dark-mode-spinner-message-color, var(--bbva-progress-content-spinner-message-color, var(--colorsSecondary600, ${t(r.secondary600)})));
  --_spinner-message-size: var(--bbva-progress-content-spinner-message-size, 0.9375rem);
  --_small-spinner-size: var(--bbva-progress-content-small-spinner-size, 2rem);
  --_login-bg-color: var(--bbva-progress-content-dark-mode-login-bg-color, var(--bbva-progress-content-login-bg-color, var(--colorsPrimaryCore, ${t(r.primaryCore)})));
  --_login-content-bg-color: var(--bbva-progress-content-dark-mode-login-content-bg-color, var(--bbva-progress-content-login-content-bg-color, var(--colorsPrimaryCoreDarkened, ${t(r.primaryCoreDarkened)})));
  --_login-content-text-color: var(--bbva-progress-content-dark-mode-login-text-color, var(--bbva-progress-content-login-text-color, var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)})));
  --_login-success-animation-duration: var(--bbva-progress-content-login-success-animation-duration, 1000ms);
  --_login-success-animation-delay: var(--bbva-progress-content-login-success-animation-delay, 0ms);
  --_content-height: calc(calc(((13 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) + 3rem);
  --_progress-content-mask-display: var(--bbva-progress-content-dark-mode-mask-display, var(--bbva-progress-content-mask-display, initial));
  --_progress-content-no-mask-display: var(--bbva-progress-content-dark-mode-no-mask-display, var(--bbva-progress-content-no-mask-display, none));
  z-index: var(--bbva-progress-content-z-index, 10);
  box-sizing: border-box;
  position: fixed;
  top: 0;
  left: 0;
  display: none;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  height: 100%;
  min-height: 3rem;
  overflow: hidden;
  font-size: var(--typographyTypeSmall, ${t(O.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${t(i.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(a.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${t(a.medium.fontStyle)});
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*::before,
*::after {
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

.overlay {
  visibility: hidden;
  flex: auto;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: 100%;
  background-color: var(--_bg-color);
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
}
.overlay p {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  color: var(--_spinner-message-color);
  font-size: var(--_spinner-message-size);
}

:host([variant=bottom]) {
  top: auto;
  bottom: 0;
  height: auto;
  --bbva-spinner-size: var(--_small-spinner-size);
}
:host([variant=bottom]) .overlay {
  padding: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) 0;
}

.spinner.no-mask {
  display: var(--_progress-content-no-mask-display);
}

.spinner.mask {
  display: var(--_progress-content-mask-display);
}

:host([variant=login]) .overlay {
  padding-bottom: var(--_content-height);
  background-color: var(--_login-bg-color);
  --bbva-core-spinner-bg-color: var(--_login-bg-color);
  --bbva-foundations-spinner-bg-color: var(--bbva-progress-content-dark-mode-login-bg-color);
}

:host([variant=transparent]) .spinner {
  transition: opacity 80ms linear 160ms;
  opacity: 0;
}
:host([variant=transparent]) .overlay {
  transition: visibility 0s linear 240ms, opacity 240ms linear;
  opacity: 0;
}

.content {
  width: 100%;
  height: 100%;
  position: absolute;
  top: 100%;
  left: 0;
  transform: translateY(calc(var(--_content-height) * -1));
  background-color: var(--_login-content-bg-color);
}

.layer {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
  height: 100%;
  padding: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
  white-space: nowrap;
  overflow: hidden;
  text-overflow: ellipsis;
  color: var(--_login-content-text-color);
}

.icon {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

:host([visible]) {
  display: flex;
}
:host([visible]) .overlay {
  visibility: visible;
}

:host([login-animation]) .content {
  animation-name: message;
  animation-duration: var(--bbva-progress-content-login-animation-message-duration, 1500ms);
  animation-delay: var(--bbva-progress-content-login-animation-message-delay, 0ms);
  animation-fill-mode: forwards;
}

:host([visible][variant=transparent]) .overlay {
  transition-delay: 0s;
  opacity: 0.9;
}
:host([visible][variant=transparent]) .spinner {
  opacity: 1;
}

:host([login-animation][login-successful]) .content {
  animation-duration: var(--_login-success-animation-duration);
  animation-delay: var(--_login-success-animation-delay);
  animation-fill-mode: forwards;
  animation-name: content;
}
:host([login-animation][login-successful]) .layer {
  animation-duration: var(--_login-success-animation-duration);
  animation-delay: var(--_login-success-animation-delay);
  animation-fill-mode: forwards;
  animation-name: layer;
}

@keyframes message {
  from {
    transform: translateY(0);
  }
  to {
    transform: translateY(calc(var(--_content-height) * -1));
  }
}
@keyframes content {
  to {
    transform: translateY(-100%);
  }
}
@keyframes layer {
  to {
    transform: translateY(calc(50% - var(--_content-height) / 2));
  }
}
${Dt.mediaRules()}`;const Mt=new P;var Rt=e`[ambient^=dark] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreLight, ${t(r.primaryCoreLight)});
  --bbva-progress-content-mask-display: none;
  --bbva-progress-content-no-mask-display: block;
}

[ambient^=dark200] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCore, ${t(r.primaryCore)});
}

[ambient^=dark300] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreDark, ${t(r.primaryCoreDark)});
}

[ambient^=dark400] {
  --bbva-progress-content-bg-color: var(--colorsPrimaryCoreDarkened, ${t(r.primaryCoreDarkened)});
}
${Mt.mediaRules()}`;var Nt=e`[ambient^=light] {
  --bbva-progress-content-bg-color: initial;
  --bbva-progress-content-mask-display: initial;
  --bbva-progress-content-no-mask-display: initial;
}
${(new P).mediaRules()}`;const Ot={dark:e`
    ${K.dark}
    ${I.dark}
    ${Rt}
  `,light:e`
    ${K.light}
    ${I.light}
    ${Nt}
  `};class At extends(l(c(h))){static get is(){return"bbva-progress-content"}static get scopedElements(){return{"bbva-icon":A,"bbva-text":g,"bbva-spinner":G}}static get properties(){return{variant:{type:String,reflect:!0},loginIcon:{type:String,attribute:"login-icon"},loginIconSize:{type:String,attribute:"login-icon-size"},loginSuccessIcon:{type:String,attribute:"login-success-icon"},loginMessageLabels:{type:Array,attribute:"login-message-labels"},loginSuccessMessageLabel:{type:String,attribute:"login-success-message-label"},loginMessageTimer:{type:Number,attribute:"login-message-timer"},loginAnimation:{type:Boolean,attribute:"login-animation",reflect:!0},loginSuccessful:{type:Boolean,attribute:"login-successful",reflect:!0},_loginMessageLabel:{type:String},spinnerMessageLabel:{type:String,attribute:"spinner-message-label"},showSpinnerMessageLabel:{type:Boolean,attribute:"show-spinner-message-label"},visible:{type:Boolean,reflect:!0}}}constructor(){super(),this.variant="full",this.loginIcon=Y(),this.loginSuccessIcon=W(),this.loginIconSize="M",this.loginSuccessful=!1,this._loginMessageLabel="",this.loginMessageLabels=["bbva-progress-content-login-verifying-credentials","bbva-progress-content-login-connecting-bbva"],this.loginSuccessMessageLabel="bbva-progress-content-login-loading-products",this.loginMessageTimer=3e3,this.loginAnimation=!1,this.spinnerMessageLabel="bbva-progress-content-login-loading-message",this.showSpinnerMessageLabel=!1,this.visible=!1}get _getLoginIcon(){return this.loginSuccessful?this.loginSuccessIcon:this.loginIcon}get _loginIconSize(){const e={S:16,M:24,L:32},t=parseInt(this.loginIconSize,10);return Object.values(e).includes(t)?t:e[this.loginIconSize]||24}updated(e){super.updated&&super.updated(e),(e.has("loginSuccessful")||e.has("variant"))&&"login"===this.variant&&(this.loginSuccessful?this._setLoginSuccess():this._setLoginInProcess()),e.has("visible")&&void 0!==e.get("visible")&&this._notifyVisibleChanged()}static get styles(){return[Lt,Ot.dark,Ot.light,v("bbva-progress-content-shared-styles")]}getParentElement(){const e=this.getRootNode();return 11===e.nodeType?e.host:document}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._parentElement=this.getParentElement(),this._boundShowProgressContent=this._showLoader.bind(this),this._boundHideProgressContent=this._hideLoader.bind(this),this._parentElement.addEventListener("show-loader",this._boundShowProgressContent),this._parentElement.addEventListener("hide-loader",this._boundHideProgressContent)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this._parentElement.removeEventListener("show-loader",this._boundShowProgressContent),this._parentElement.removeEventListener("hide-loader",this._boundHideProgressContent)}render(){return u`
      <div class="overlay">
        <span class="sr-only" role="alert" aria-busy="true">
          <slot></slot>
        </span>
        <bbva-spinner
          id="spinner"
          class="spinner no-mask"
          ?paused="${!this.visible}"
        ></bbva-spinner>
        <bbva-spinner
          id="spinnerMask"
          class="spinner mask"
          ?paused="${!this.visible}"
          ?with-mask="${"login"!==this.variant}"
        ></bbva-spinner>
        <bbva-text
          size="S"
          ?hidden=${!this.showSpinnerMessageLabel}
          .text=${this.t(this.spinnerMessageLabel,"bbva-progress-content-login-loading-message")}
        >
        </bbva-text>
      </div>

      ${"login"===this.variant?u`
            <div class="content" @animationend="${this._onAnimationEnd}">
              <div class="layer">
                <bbva-icon
                  class="icon"
                  .icon="${this._getLoginIcon}"
                  .size="${this._loginIconSize}"
                ></bbva-icon>
                <div class="message">${this.t(this._loginMessageLabel)}</div>
              </div>
            </div>
          `:""}
    `}_onAnimationEnd(e){"content"===e.animationName&&this._fireEvent("progress-content-success-login-click")}_fireEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{detail:t,bubbles:!0,composed:!0}))}_setLoginInProcess(){const[e]=this.loginMessageLabels;this._loginMessageLabel=e,this._loadingMessageInterval=setInterval((()=>{const e=this.loginMessageLabels.indexOf(this._loginMessageLabel),t=this.loginMessageLabels[e+1]||this.loginMessageLabels[0];this._loginMessageLabel=t}),this.loginMessageTimer),this._fireEvent("progress-content-start-login-click")}_setLoginSuccess(){clearInterval(this._loadingMessageInterval),this._loginMessageLabel=this.loginSuccessMessageLabel,this.loginAnimation||this._fireEvent("progress-content-success-login-click")}_notifyVisibleChanged(){this._fireEvent("progress-content-visible-changed",this.visible)}loginSuccess(){this.loginSuccessful=!0}loginReset(){this.loginSuccessful=!1}show(){this.visible=!0}showCustom({variant:e="full",showSpinnerMessageLabel:t=!1,loginAnimation:i=!1}){this.variant=e,this.showSpinnerMessageLabel=t,this.loginAnimation=i,this.show()}_showLoader(e){this.showCustom(e.detail),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}hide(){this.visible=!1}_hideLoader(e){this.hide(),e.stopPropagation(),e.stopImmediatePropagation(),e.preventDefault()}}var zt={..._,...X,bbvaProgressContent:`\n  --bbva-progress-content-dark-mode-bg-color: ${S("colors.cool90")};\n  --bbva-progress-content-dark-mode-spinner-message-color: ${S("colors.primaryCoreLightened")};\n  --bbva-progress-content-dark-mode-login-bg-color: ${S("colors.cool90")};\n  --bbva-progress-content-dark-mode-login-content-bg-color: ${S("colors.cool70")};\n  --bbva-progress-content-dark-mode-login-text-color: ${S("colors.primaryCoreLightened")};\n  --bbva-progress-content-dark-mode-mask-display: initial;\n  --bbva-progress-content-dark-mode-no-mask-display: initial;\n  `};const Ft=new P;var Bt=e`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${t(r.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(r.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${t(r.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${t(r.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${t(r.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)})));
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
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: calc(((0.25 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 10) * 1em);
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${t(O.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
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

[data-tag-name=bbva-badge-notification] {
  --bbva-badge-notification-position-right: -0.5625rem;
  --bbva-badge-notification-position-top: -0.1875rem;
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
${Ft.mediaRules()}`;let qt=class e extends(l(d(c(h)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":g,"bbva-icon":A,"bbva-badge-notification":z}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(t,i);return a in e?e[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[Bt,v("bbva-header-main-shared-styles"),F("button:focus"),I.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return u`<bbva-icon icon="${f(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return u`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(t,i,a,r){const n=e.toCamelCase(t),s=`icon${n}`,o=`accessibilityTextIcon${n}`;return u`<button
      class="${i}"
      id="btn-${t}"
      aria-label="${f(this.t(this[o]))}"
      aria-expanded=${f(r)}
      ?hidden="${!this[s]}"
      @click="${()=>this._headerIconClick(t)}"
    >
      ${"left-primary"===t&&this.notificationText?this._badgeNotification(s):this._icon(s)}
      ${this.showTextIcon?this._textIcon(a):""}
    </button>`}_textIcon(e){return u` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${f(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return u`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(e)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:a,_hasMicroillustration:r,microillustration:n}=this;return u`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(n||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${f(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span class="${r}" ?hidden="${!n}" aria-hidden="true">
            ${this.microillustration&&J[this.microillustration]}
          </span>
        </h1>

        <div class="header-icons ${e} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}};var Vt={...B,..._,bbvaHeaderMain:`\n  --bbva-header-main-dark-mode-text-color:${S("colors.primaryCoreLightened")};\n  --bbva-header-main-dark-mode-bg-color:${S("colors.cool80")};\n  --bbva-header-main-dark-mode-bg-color-modal:${S("colors.cool70")};\n  --bbva-header-main-dark-mode-color-modal-three-level:${S("colors.primaryCoreLightened")};\n  --bbva-header-main-dark-mode-bg-color-modal-three-level:${S("colors.cool100")};\n  --bbva-header-main-dark-mode-bg-color-process:${S("colors.tertiaryType6Darkened")};\n  --bbva-header-main-dark-mode-bg-color-sign:${S("colors.tertiaryType4Darkened")};\n  `};const Ht=D((e=>class extends(L(e)){static configurationScopedElements(){return[It,At,qt,Z]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index);"}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(e,t){const i=`_${e}`;return this[i]||(this[i]=document.createElement(e)),"object"==typeof t&&Object.keys(t).forEach((e=>{"@"===e[0]?this[i].addEventListener(e.substring(1),t[e]):this[i][e]=t[e]})),this._setSecondaryRightIcon(e,i),u`${this[i]}`}_setSecondaryRightIcon(e,t){this.config.header&&e===this.getScopedTagName("bbva-header-main")&&(this[t].iconRightSecondary=this[t].iconRightSecondary||this.config.smartAssistant&&Q()||this.config.faqs&&ee())}_dispatchCustomEvent(e,t=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:a,detail:t,cancelable:!0}))}showLoader(e="full",t=!1,i=!1){const a={variant:e,showSpinnerMessageLabel:t,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(e,t,i,a){const r={description:e,simpleLinkText:t,type:i,duration:a};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:e="",status:t=""}={}){this.config.notifyTop={...this.config.notifyTop,text:e,status:t},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var e,t,i;return u`
          ${null!==(e=this.config)&&void 0!==e&&e.notify||null!==(t=this.config)&&void 0!==t&&t.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var e,t,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(e=this.config)||void 0===e?void 0:e.notifyTop)||(null===(t=this.config)||void 0===t?void 0:t.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const e=this._getElements();return u`
            <section style="${this._headerStyles}">
              ${Object.keys(e).map((t=>e[t].condition?this._tpl(t,e[t].config):null))}
              <slot name="customHeaderContainer"></slot>
            </section>
            ${this.renderNotify()}
        `}}));const jt=D((e=>class extends e{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(e){return e.reduce(((e,t)=>(e[t.is]=t,e)),{})}_handleModalState(e){var t;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==i?void 0:i.visible,modal:i}}))}})),Ut=new P;var Kt=e`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-help-faqs-aem-dark-mode-bg, var(--bbva-help-faqs-aem-bg, var(--ambientsLight, ${t(ie.light)})));
  height: 100%;
  --bbva-help-modal-padding: var(--bbva-help-faqs-aem-help-modal-padding, 0);
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-divider] {
  display: block;
}

section [data-tag-name=bbva-divider] {
  margin-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-notification-message],
.description-box {
  margin: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text].title {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(a.medium.fontWeight)});
}

[data-tag-name=bbva-help-modal][visible] {
  transform: translateZ(0.1px);
}

.description-box {
  text-align: left;
}
${Ut.mediaRules()}`;class Gt extends(Ht(jt(c(L(h))))){static get is(){return"help-faqs-aem"}static get scopedElements(){const e=[re,Pe,Ye,ne,se,m,De,Le,oe,le,g,de];return Gt.scopedElementsFromClasses(e)}static get properties(){return{_item:{type:Object},showModal:{type:Boolean,attribute:"show-modal"},_showRatingText:{type:Boolean},_showError:{type:Boolean},_counterAemError:{type:Number},contentFragmentPath:{type:String,attribute:"content-fragment-path"},aemData:{type:Object},headerText:{type:String},showDivider:{type:Boolean,attribute:"show-divider"},hideFooter:{type:Boolean,attribute:"hide-footer"},headingLevel:{type:Number},answerTitleTag:{type:String},disableEllipsis:{type:Boolean,attribute:"disable-ellipsis",reflect:!0},maxRequestAttempts:{type:Number,attribute:"max-request-attempts"}}}static get styles(){return[Kt,s.light,k.light,Ie.light,T.light,$.light,ke.light,ae.light,I.light,v("help-faqs-aem-shared-styles")]}constructor(){super(),this.showModal=!1,this._showError=!1,this._showRatingText=!1,this.showDivider=!1,this.hideFooter=!1,this.headerText="help-faqs-aem-header-text",this.headingLevel=1,this.answerTitleTag="h2",this.disableEllipsis=!1,this._counterAemError=0,this.maxRequestAttempts=3,this._item={},this.config={...this.config,loader:!0}}firstUpdated(){super.firstUpdated&&super.firstUpdated(),this._dataManager=this.shadowRoot.querySelector('[data-tag-name="bbva-global-aem-content-fragment-dm"]'),this._getAEMData()}update(e){super.update(e),e.has("contentFragmentPath")&&this.aemData&&(this._dataManager.resetCache(),this._dataManager.getAemData())}_getAEMData(){this.aemData||this._dataManager.getAemData()}_setAEMData(e){this._showError=!1,this.aemData=e.detail||[],this.clearLoader()}get _list(){var e,t,i;return(null===(e=this.aemData)||void 0===e||null===(t=e.items)||void 0===t||null===(i=t.contentfragmentlist)||void 0===i?void 0:i.items)||[]}get _shouldRetryAemRequest(){return this._counterAemError<=this.maxRequestAttempts}_handleClick(e){this._item=e,this.showModal=!0,this._handleNewEvent("help-faqs-aem-detail-show",e)}_closeModal(){this.showModal=!1,this._showRatingText=!1}_handleNewEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}_handleRatingClick({detail:e}){this._showRatingText=!0,this._handleNewEvent("help-faqs-aem-feedback-click",e)}_handleRetryError(){this._shouldRetryAemRequest&&(this.showLoader("full"),this._getAEMData(),this._handleNewEvent("help-faqs-aem-notification-retry-click"))}_handleAemContentDmError(){this._showError=!0,this._counterAemError+=1,this.clearLoader(),this._handleNewEvent("help-faqs-aem-content-service-error")}get _renderContent(){var e,t,i,a,r,n,s,o,l,d;const c=null===(e=this._item)||void 0===e?void 0:e.elements;return u`
      <bbva-help-modal
        full-height
        header-text=${null!=c&&null!==(t=c.entity)&&void 0!==t&&t.value?c.entity.value:this.headerText}
        accessibility-text-icon-right-primary="${this.t("help-faqs-aem-header-icon-right-primary-accessibility-text")}"
        ?visible="${this.showModal}"
        ?i-o-s-fixed-header="${this.iOSFixedHeader}"
        hide-content-padding-top
        @help-modal-close=${this._closeModal}
      >
        ${c&&this.showModal?u`
              <section slot="slot-content">
                <article>
                  ${this._sourceMediaFile(c)}
                  <div class="description-box" role="presentation">
                    <bbva-text
                      tag="${this.answerTitleTag}"
                      class="title"
                      size="M"
                      unset
                      text=${null!==(i=c.alternativeTitle)&&void 0!==i&&i.value?c.alternativeTitle.value:c.title.value}
                    ></bbva-text>
                    ${null!==(a=c.alternativeAnswer)&&void 0!==a&&a.value?Gt._getAlternativeAnswer(null===(r=c.alternativeAnswer)||void 0===r?void 0:r.value,null===(n=c.bullets)||void 0===n?void 0:n.value,null===(s=c.itemsposition)||void 0===s?void 0:s.value):u`
                          <bbva-text text=${c.answer.value} size="S"></bbva-text>
                        `}
                    <bbva-link
                      ?hidden=${!(null!==(o=c.linkUrl)&&void 0!==o&&o.value&&""!==(null===(l=c.linkUrl)||void 0===l?void 0:l.value))}
                      @click=${()=>{var e;return this._handleNewEvent("help-faqs-aem-detail-link-click",null===(e=c.linkUrl)||void 0===e?void 0:e.value)}}
                      >${null===(d=c.linkText)||void 0===d?void 0:d.value}</bbva-link
                    >
                  </div>
                </article>
                ${this._renderFooter}
              </section>
            `:""}
      </bbva-help-modal>
    `}static _getAlternativeAnswer(e=[],t=[],i=[]){const a=(null==e?void 0:e.length)+(null==t?void 0:t.length);let r=0,n=0;const s=[];for(let o=0;o<a;o+=1)if(i.includes(o.toString())){const e=t[n];n+=1,e&&s.push(u`
              <bbva-list-bullet disabled-tabindex> ${e} </bbva-list-bullet>
            `)}else{const t=e[r];r+=1,t&&s.push(u`
              <bbva-text tag="p" text=${t} size="S"> </bbva-text>
            `)}return u`
      ${s}
    `}get _renderDivider(){return this.showDivider?u`
          <bbva-divider></bbva-divider>
        `:""}get _renderFooter(){return this.hideFooter?"":u`
          <footer>
            ${this._renderDivider}
            <bbva-form-rating
              thumbs
              ?hide-text=${!this._showRatingText}
              title=${this.t("help-faqs-aem-thumbs")}
              text=${this.t("help-faqs-aem-feedback-text")}
              @form-rating-value-change=${this._handleRatingClick}
              disabled-tabindex
            ></bbva-form-rating>
          </footer>
        `}_sourceMediaFile(e){var t;return null!==(t=e.header)&&void 0!==t&&t.value?"video"===e.headerType.value?u`
          <bbva-banner-video
            @banner-video-button-click=${()=>this._handleNewEvent("help-faqs-aem-video-show")}
            url-image=${e.header.value}
          ></bbva-banner-video>
        `:u`
        <bbva-banner-image
          fullwidth
          image-src=${`${this.host}${e.header.value}`}
        ></bbva-banner-image>
      `:""}get _renderList(){return this._list&&this._list.length>0?this._list.map(((e,t)=>{const i=e.elements.title.value;return u`
          <bbva-list-link
            disabled-tabindex
            header-text=${i}
            .multiline=${!this.disableEllipsis}
            @list-link-click=${()=>this._handleClick({...e,key:t})}
          ></bbva-list-link>
          ${t<this._list.length-1?u`
                <bbva-divider size="fit"></bbva-divider>
              `:""}
        `})):""}get _renderError(){return u`
      <bbva-notification-message
        variant="error"
        message=${this.t("help-faqs-aem-error-load-list"+(this._shouldRetryAemRequest?"":"-call-bank"))}
        link-title=${this.t(""+(this._shouldRetryAemRequest?"help-faqs-aem-error-retry":""))}
        @notification-message-link-click=${this._handleRetryError}
      ></bbva-notification-message>
    `}get _dmTemplate(){return u`
      <bbva-global-aem-content-fragment-dm
        .host=${this.host}
        .path=${this.contentFragmentPath}
        ?native=${this.native}
        @aem-content-fragment-dm-fetch-error=${this._handleAemContentDmError}
        @aem-content-fragment-dm-fetch=${this._setAEMData}
      >
      </bbva-global-aem-content-fragment-dm>
    `}render(){return u`
      ${super.render()} ${this._dmTemplate}
      <div ambient="light" role="presentation">
        <bbva-header-category
          heading-level="${this.headingLevel}"
          text=${this.t("help-faqs-aem-message-faqs")}
        ></bbva-header-category>
        ${this._showError?this._renderError:this._renderList} ${this._renderContent}
      </div>
    `}}S("colors.cool80");const Yt=D((e=>class extends e{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(e){return e.reduce(((e,t)=>(e[t.is]=t,e)),{})}_handleModalState(e){var t;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==i?void 0:i.visible,modal:i}}))}})),Wt=new P;var Xt=e`:host {
  display: block;
  box-sizing: border-box;
  background-color: var(--bbva-header-main-dark-mode-bg-color, var(--bbva-header-main-bg-color, var(--colorsPrimaryCoreDarkened, ${t(r.primaryCoreDarkened)})));
  color: var(--_text-color);
  position: var(--bbva-header-main-position, -webkit-sticky);
  position: var(--bbva-header-main-position, sticky);
  top: 0;
  z-index: var(--bbva-header-main-z-index, 1);
  padding: 0 calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
  --_bg-color-modal: var(--colorsPrimaryCore, ${t(r.primaryCore)});
  --_bg-color-modal-three-level: var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)});
  --_color-modal-three-level: var(--bbva-header-main-dark-mode-color-modal-three-level ,var(--colorsSecondary600, ${t(r.secondary600)}));
  --_bg-color-process: var(--colorsTertiaryType6Dark, ${t(r.tertiaryType6Dark)});
  --_bg-color-sign: var(--colorsTertiaryType4Dark, ${t(r.tertiaryType4Dark)});
  --_bg-color-transparent: transparent;
  --_text-color: var(--bbva-header-main-dark-mode-text-color ,var(--bbva-header-main-color, var(--colorsPrimaryCoreLightened, ${t(r.primaryCoreLightened)})));
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
.header-main .header-icons .text-icon {
  width: 100%;
  padding-top: calc(((0.25 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 10) * 1em);
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
  font-size: var(--bbva-header-main-text-font-size, var(--typographyTypeMedium, ${t(O.typeMedium)}));
  line-height: var(--bbva-header-main-text-line-height, 3rem);
  font-weight: 400;
  min-width: 0;
}
.header-main .heading-wrapper.image {
  display: flex;
  justify-content: center;
  align-items: center;
}
.header-main .heading-wrapper .microillustration {
  width: 3rem;
  height: 3rem;
}
.header-main .heading-wrapper .text-wrapper {
  padding: 0 calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
  min-width: 0;
}
.header-main .heading-wrapper svg {
  max-height: 100%;
  padding: calc(((0.625 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
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

[data-tag-name=bbva-badge-notification] {
  --bbva-badge-notification-position-right: -0.5625rem;
  --bbva-badge-notification-position-top: -0.1875rem;
}

@supports (padding-top: env(safe-area-inset-top)) {
  :host([variant*=notch-top]) {
    --safe-area-inset-top: env(safe-area-inset-top);
    padding-top: var(--safe-area-inset-top, 0);
  }
}
${Wt.mediaRules()}`;class Jt extends(l(d(c(h)))){static get is(){return"bbva-header-main"}static get scopedElements(){return{"bbva-text":g,"bbva-icon":A,"bbva-badge-notification":z}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},accessibilityNotificationText:{type:String,attribute:"accessibility-notification-text"},notificationText:{type:String,attribute:"notification-text"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightPrimaryExpanded:{type:String,attribute:"icon-right-primary-expanded"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},iconSize:{type:Number,attribute:"icon-size"},image:{type:String},microillustration:{type:String},text:{type:String},variant:{type:String,reflect:!0},position:{type:String,reflect:!0},accessibilityTextImage:{type:String,attribute:"accessibility-text-image"},showTextIcon:{type:Boolean,attribute:"show-text-icon",reflect:!0},textIconLeftPrimary:{type:String,attribute:"text-icon-left-primary"},textIconLeftSecondary:{type:String,attribute:"text-icon-left-secondary"},textIconRightPrimary:{type:String,attribute:"text-icon-right-primary"},textIconRightSecondary:{type:String,attribute:"text-icon-right-secondary"}}}get _availableHeadingSpace(){const e={1:"half-space",2:"full-space"},t=[this.iconLeftPrimary,this.iconLeftSecondary].filter(Boolean).length,i=[this.iconRightPrimary,this.iconRightSecondary].filter(Boolean).length,a=Math.max(t,i);return a in e?e[a]:""}get _hasImage(){return this.image?"image":""}get _hasMicroillustration(){return this.microillustration?"microillustration":""}constructor(){super(),this.iconSize=24,this.accessibilityTextImage="",this.showTextIcon=!1}static get styles(){return[Xt,v("bbva-header-main-shared-styles"),F("button:focus"),I.dark]}static toCamelCase(e){return(e.charAt(0).toUpperCase()+e.slice(1)).replace(/([-_][a-z])/gi,(e=>e.toUpperCase().replace("-","").replace("_","")))}_icon(e){return u`<bbva-icon icon="${f(this[e])}" size="${this.iconSize}"></bbva-icon>`}_badgeNotification(e){return u`<bbva-badge-notification
      accessibility-text=${this.t(this.accessibilityNotificationText)}
      text="${this.notificationText}"
      position="right"
      variant="alert"
    >
      ${this._icon(e)}
    </bbva-badge-notification>`}_tplButton(e,t,i,a){const r=Jt.toCamelCase(e),n=`icon${r}`,s=`accessibilityTextIcon${r}`;return u`<button
      class="${t}"
      id="btn-${e}"
      aria-label="${f(this.t(this[s]))}"
      aria-expanded=${f(a)}
      ?hidden="${!this[n]}"
      @click="${()=>this._headerIconClick(e)}"
    >
      ${"left-primary"===e&&this.notificationText?this._badgeNotification(n):this._icon(n)}
      ${this.showTextIcon?this._textIcon(i):""}
    </button>`}_textIcon(e){return u` <bbva-text
      unset
      ambient="dark"
      ellipsis
      class="text-icon"
      size="3XS"
      tag="span"
      alignment="center"
      .text="${f(this.t(e))}"
    >
    </bbva-text>`}_tplHeading(e){return u`
      <bbva-text
        unset
        ambient="dark"
        ellipsis
        class="text-wrapper"
        id="text"
        tag="span"
        alignment="center"
        .text="${this.t(e)}"
      >
      </bbva-text>
    `}render(){const{_availableHeadingSpace:e,_hasImage:t,text:i,image:a,_hasMicroillustration:r,microillustration:n}=this;return u`
      <header class="header-main">
        <div class="header-icons ${e} left-group" data-id="iconsLeft">
          ${this._tplButton("left-primary","icon primary",this.textIconLeftPrimary?this.textIconLeftPrimary:this.accessibilityTextIconLeftPrimary)}
          ${this._tplButton("left-secondary","icon secondary",this.textIconLeftSecondary?this.textIconLeftSecondary:this.accessibilityTextIconLeftSecondary)}
        </div>

        <h1
          class="heading-wrapper ${t}"
          id="heading"
          aria-label=${(n||a)&&this.accessibilityTextImage?this.t(this.accessibilityTextImage):this.t(i)}
          tabindex="-1"
        >
          ${i&&" "!==i&&this._tplHeading(i)||""}
          <img src="${f(a)}" alt="" ?hidden="${!a}" id="image" aria-hidden="true" />

          <span class="${r}" ?hidden="${!n}" aria-hidden="true">
            ${this.microillustration&&J[this.microillustration]}
          </span>
        </h1>

        <div class="header-icons ${e} right-group" data-id="iconsRight">
          ${this._tplButton("right-secondary","icon secondary",this.textIconRightSecondary?this.textIconRightSecondary:this.accessibilityTextIconRightSecondary)}
          ${this._tplButton("right-primary","icon primary",this.textIconRightPrimary?this.textIconRightPrimary:this.accessibilityTextIconRightPrimary,this.iconRightPrimaryExpanded)}
        </div>
      </header>
    `}_headerIconClick(e){this.dispatchEvent(new CustomEvent(`header-main-icon-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}}S("colors.primaryCoreLightened"),S("colors.cool80"),S("colors.cool70"),S("colors.primaryCoreLightened"),S("colors.cool100"),S("colors.tertiaryType6Darkened"),S("colors.tertiaryType4Darkened");const Zt=D((e=>class extends(L(e)){static configurationScopedElements(){return[It,At,Jt,Z]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index);"}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(e,t){const i=`_${e}`;return this[i]||(this[i]=document.createElement(e)),"object"==typeof t&&Object.keys(t).forEach((e=>{"@"===e[0]?this[i].addEventListener(e.substring(1),t[e]):this[i][e]=t[e]})),this._setSecondaryRightIcon(e,i),u`${this[i]}`}_setSecondaryRightIcon(e,t){this.config.header&&e===this.getScopedTagName("bbva-header-main")&&(this[t].iconRightSecondary=this[t].iconRightSecondary||this.config.smartAssistant&&Q()||this.config.faqs&&ee())}_dispatchCustomEvent(e,t=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:a,detail:t,cancelable:!0}))}showLoader(e="full",t=!1,i=!1){const a={variant:e,showSpinnerMessageLabel:t,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(e,t,i,a){const r={description:e,simpleLinkText:t,type:i,duration:a};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:e="",status:t=""}={}){this.config.notifyTop={...this.config.notifyTop,text:e,status:t},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var e,t,i;return u`
          ${null!==(e=this.config)&&void 0!==e&&e.notify||null!==(t=this.config)&&void 0!==t&&t.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var e,t,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(e=this.config)||void 0===e?void 0:e.notifyTop)||(null===(t=this.config)||void 0===t?void 0:t.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const e=this._getElements();return u`
            <section style="${this._headerStyles}">
              ${Object.keys(e).map((t=>e[t].condition?this._tpl(t,e[t].config):null))}
              <slot name="customHeaderContainer"></slot>
            </section>
            ${this.renderNotify()}
        `}})),Qt=new P;var ei=e`:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.carousel-wrapper {
  flex: 1;
}

[data-tag-name=bbva-progress-content] {
  position: absolute;
}

[data-tag-name=bbva-carousel-swipe] {
  padding: var(--onboarding-full-screen-carousel-content-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) 0 0);
  --bbva-carousel-swipe-gradient-color: rgba(255,255,255,0);
}

.footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
.footer.hidden {
  visibility: hidden;
}
${Qt.mediaRules()}`,ti=e`[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

.carousel-wrapper {
  flex: 1;
}

[data-tag-name=bbva-progress-content] {
  position: absolute;
}

[data-tag-name=bbva-carousel-swipe] {
  padding: var(--onboarding-full-screen-carousel-content-padding, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) 0 0);
  --bbva-carousel-swipe-gradient-color: rgba(255,255,255,0);
}

.footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
.footer.hidden {
  visibility: hidden;
}
`;class ii extends(L(Yt(Zt(c(h))))){static get is(){return"onboarding-full-screen-carousel"}static get scopedElements(){const e=[ve,We,le,ue,Ye,...ii.configurationScopedElements()];return ii.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean,reflect:!0},modalTitle:{type:String,attribute:"modal-title"},contentFragmentHost:{type:String,attribute:"content-fragment-host"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},serviceCacheEnabled:{type:Boolean,attribute:"service-cache-enabled"},headers:{type:Object},items:Array,buttonText:{type:String,attribute:"button-text"},headerIconRightPrimary:{type:String,attribute:"header-icon-right-primary"},headerIconRightSecondary:{type:String,attribute:"header-icon-right-secondary"},maxErrorRetries:{type:Number,attribute:"max-error-retries"},attachModalsToBody:{type:Boolean,attribute:"attach-modals-to-body"},_data:Array,_selectedPage:Number,_scopedItems:Array}}get _headers(){return this.headers||{Accept:"application/json, text/plain, */*; q=0.01","Content-Type":"text/plain"}}static get styles(){return[ei,v("onboarding-full-screen-carousel-shared-styles")]}constructor(){super(),this.config={header:!1,loader:!0,notify:!1},this.attachModalsToBody=!1,this.visible=!1,this.modalTitle="",this.items=[],this.buttonText="",this.maxErrorRetries=2,this.serviceCacheEnabled=!1,this._selectedPage=0,this._errorRetries=0,this._scopedItems=[{tagName:"bbva-panel-offer",class:ue}]}render(){var e,t;const i=`onboardingAemData-${(null===(e=this.contentFragmentPath)||void 0===e||null===(t=e.match(/\/([^/.]+)\./))||void 0===t?void 0:t[1])||""}-${this.language||""}`;return u`
      <bbva-global-aem-content-fragment-dm
        ?native="${this.native}"
        host="${this.contentFragmentHost}"
        path="${this.contentFragmentPath}"
        cachetype="${this.serviceCacheEnabled?"SESSION":"NONE"}"
        cachekey="${i}"
        @aem-content-fragment-dm-fetch="${e=>{this._generateCarouselContent(e),this.clearLoader()}}"
        @aem-content-fragment-dm-fetch-error="${this._manageFetchError}"
        cross-domain
        .headers="${this._headers}"
      ></bbva-global-aem-content-fragment-dm>
      <bbva-help-modal
        data-id="modalOnboardingFullScreenCarousel"
        .contentStyles="${this.attachModalsToBody?ti:""}"
        full-height
        fixed-footer
        ?attach-to-body="${this.attachModalsToBody}"
        header-type="modal"
        header-text="${this.modalTitle}"
        aria-label="${this.modalTitle}"
        ?visible=${this.visible}
        @modal-state-change=${e=>{this.visible=e.detail.visible}}
        hide-content-padding-top
        icon-right-primary="${f(this.headerIconRightPrimary)}"
        icon-right-secondary="${f(this.headerIconRightSecondary)}"
        accessibility-text-icon-right-primary="${this.t("onboarding-full-screen-carousel-accessibility-text-icon-right-primary")}"
        accessibility-text-icon-right-secondary="${this.t("onboarding-full-screen-carousel-accessibility-text-icon-right-secondary")}"
      >
        <div class="carousel-wrapper" slot="slot-content">
          ${super.render()}
          <bbva-carousel-swipe
            .items=${this.items}
            .scopedComponents=${this._scopedItems}
            variant="full-screen"
            @carousel-swipe-item-select=${this._changedPage}
          ></bbva-carousel-swipe>
        </div>
        <div class="footer ${y({hidden:!this.buttonText})}" slot="slot-footer">
          <bbva-button-default
            @click=${this._buttonClick}
            text="${this.buttonText}"
          ></bbva-button-default>
        </div>
      </bbva-help-modal>
    `}firstUpdated(){this._dm=this.shadowRoot.querySelector('[data-tag-name="bbva-global-aem-content-fragment-dm"]')}updated(e){(e.has("contentFragmentHost")||e.has("contentFragmentPath"))&&(this._errorRetries=0,this.showLoader(),this._dm.getAemData())}_manageFetchError(){this._errorRetries<this.maxErrorRetries?(this._errorRetries+=1,this._dm.getAemData()):(this.clearLoader(),this.dispatchEvent(new CustomEvent("onboarding-full-screen-carousel-loading-error",{detail:!0,bubbles:!0,composed:!0})))}_generateCarouselContent(e){var t,i,a;this._data=((null==e||null===(t=e.detail)||void 0===t||null===(i=t.items)||void 0===i||null===(a=i.contentfragmentlist)||void 0===a?void 0:a.items)||[]).map((({elements:e})=>e)),this.items=(this._data||[]).map((({image:e,title:t,description:i})=>({content:u`
        <bbva-panel-offer content-title="${t.value}">
          <img
            slot="microillustration"
            src="${`${this.contentFragmentHost}${e.value}`}"
            alt="${e.title}"
          />
          <p>${i.value}</p>
        </bbva-panel-offer>
      `}))),this._changedPage()}_changedPage({detail:e}={}){var t,i;this._selectedPage=e||0,this.buttonText=this._data?((null===(t=this._data[this._selectedPage])||void 0===t||null===(i=t.buttonText)||void 0===i?void 0:i.value)||"").trim():this.buttonText,this._selectedPage===this.items.length-1&&this.dispatchEvent(new CustomEvent("onboarding-full-screen-carousel-last-item",{detail:!0,bubbles:!0,composed:!0}))}_buttonClick(){const e=this._data?this._data[this._selectedPage].buttonAction.value:"onboarding-full-screen-carousel-item-select";this.dispatchEvent(new CustomEvent(e,{detail:this._selectedPage,bubbles:!0,composed:!0})),this.visible=!1}}class ai{static get defaultProperties(){return{bodyText:null,buttonText:null,fullHeight:!1,headerText:null,headerType:null,hideContentPaddingTop:!1,linkText:null,template:"modal",titleIcon:null,titleText:null,modalType:null}}constructor(e,t={}){this.controller=e,this._properties=t}get data(){var e;return(null===(e=this.controller)||void 0===e?void 0:e.data)||{}}get properties(){return{...ai.defaultProperties,...this._properties}}set properties(e){return this._properties={...e},this._properties}t(...e){var t;return null===(t=this.controller)||void 0===t?void 0:t.t(...e)}closeModal(){var e;null===(e=this.controller)||void 0===e||e.closeModal()}cancelModal(){var e;null===(e=this.controller)||void 0===e||e.cancelModal()}_dispatchCustomEvent(e,t=!0){var i;null===(i=this.controller)||void 0===i||i._dispatchCustomEvent(e,t)}render(){return N}}class ri extends ai{constructor(e){super(e,{fullHeight:!0,headerType:"modal",headerText:"payments-mobile-payment-settings-activate-service-header",buttonText:"payments-mobile-payment-settings-activate-service-button",hideContentPaddingTop:!0})}render(){return u`
      <div slot="slot-content">
        <bbva-panel-info
          slot="slot-title"
          .microillustration=${ye}
          heading=${this.t("payments-mobile-payment-settings-activate-service-heading")}
          text=${this.t("payments-mobile-payment-settings-activate-service-description")}
        ></bbva-panel-info>
      </div>
    `}}class ni extends ai{constructor(e){super(e,{fullHeight:!0,headerType:"modal",headerText:"payments-mobile-payment-modal-title",hideContentPaddingTop:!0})}get availableCards(){var e;return null===(e=this.controller)||void 0===e?void 0:e.cardsDigitizedStatus.filter((e=>!e.digitized&&!xt(e)))}async selectCard(e){var t;const i=null==e?void 0:e.detail,a=null===(t=this.controller)||void 0===t?void 0:t.cardsDigitizedStatus.find((e=>e.id===i));this._dispatchCustomEvent("payments-mobile-payment-modal-select-default-card",{card:a}),this.closeModal()}render(){return u`
      <div slot="slot-title">
        <bbva-header-category
          .text="${this.t("payments-mobile-payment-feature-card-add-card")}"
        ></bbva-header-category>
        <bbva-text .text="${this.t("payments-mobile-payment-modal-add-card-message")}"></bbva-text>
      </div>
      <div slot="slot-content">
        <cards-list-cards
          show-link
          .cards=${this.availableCards}
          .localCurrency="${this.localCurrency}"
          ?native="${this.native}"
          .language="${this.language}"
          divider-type="fit"
          @cards-list-cards-select-card=${e=>this.selectCard(e)}
        ></cards-list-cards>
        <bbva-notification-message
          .message="${this.t("payments-mobile-payment-modal-add-card-notification")}"
        ></bbva-notification-message>
      </div>
    `}}class si extends ai{constructor(e){super(e,{titleIcon:H(),modalType:"warning",titleText:"payments-mobile-payment-error-generic-title",bodyText:"payments-mobile-payment-error-generic-max-retry-exceed-message"})}update(){var e;Object.assign(this.controller,null!==(e=this.controller)&&void 0!==e&&e.phoneNumber?{buttonText:"payments-mobile-payment-error-generic-max-retry-exceed-button",linkText:"payments-mobile-payment-error-generic-exit"}:{buttonText:"payments-mobile-payment-error-generic-exit"})}footerButtonClick(){var e;null!==(e=this.controller)&&void 0!==e&&e.phoneNumber&&this._dispatchCustomEvent("payments-mobile-payment-phone-call",this.controller.phoneNumber),this._dispatchCustomEvent("payments-mobile-payment-call-exit")}footerLinkClick(){this._dispatchCustomEvent("payments-mobile-payment-call-exit")}}class oi extends ai{constructor(e){super(e,{titleIcon:V(),modalType:"info",titleText:"payments-mobile-payment-add-card-not-eligible-modal-title",bodyText:"payments-mobile-payment-add-card-not-eligible-modal-body",buttonText:"payments-mobile-payment-add-card-not-eligible-modal-ok"})}}class li extends ai{constructor(e){super(e,{fullHeight:!0,headerType:"modal",headerText:"payments-mobile-payment-modal-title",hideContentPaddingTop:!0})}get digitizedCards(){var e;return((null===(e=this.controller)||void 0===e?void 0:e.cardsDigitizedStatus)||[]).filter((e=>e.digitized))}selectCard({detail:e}){const[t]=e,i=this.controller.cardsDigitizedStatus.find((e=>e.id===t));t&&this._dispatchCustomEvent("payments-mobile-payment-modal-select-default-card",{card:i}),this.closeModal()}render(){const{native:e,favoriteCardId:t}=this.controller;return u`
      <div slot="slot-content">
        <selector-card
          ?native="${e}"
          title="${this.t("payments-mobile-payment-modal-default-card-title")}"
          description="${this.t("payments-mobile-payment-modal-default-card-message")}"
          button-text="${this.t("payments-mobile-payment-modal-default-card-button")}"
          selector-type="single"
          .internalCards=${this.digitizedCards}
          .selectedCards=${t?[t]:[]}
          @selector-card-button-click="${e=>this.selectCard(e)}"
        ></selector-card>
      </div>
    `}}class di extends ai{constructor(e){super(e,{titleIcon:V(),modalType:"info",titleText:"payments-mobile-payment-default-card-confirmation-modal-title",bodyText:"payments-mobile-payment-default-card-confirmation-modal-body",buttonText:"payments-mobile-payment-default-card-confirmation-modal-ok",linkText:"payments-mobile-payment-default-card-confirmation-modal-cancel"})}footerButtonClick(){var e;this._dispatchCustomEvent("payments-mobile-payment-modal-default-card-confirmation-accept",{card:null===(e=this.data)||void 0===e?void 0:e.card})}}class ci extends ai{constructor(e){super(e,{fullHeight:!0,headerType:"modal",headerText:"payments-mobile-payment-modal-title",buttonText:"payments-mobile-payment-expired-keys-confirm",linkText:"payments-mobile-payment-expired-keys-later",hideContentPaddingTop:!0})}render(){return u`
      <div slot="slot-content">
        <bbva-panel-info
          .microillustration=${ye}
          heading="${this.t("payments-mobile-payment-expired-keys-title")}"
          text="${this.t("payments-mobile-payment-expired-keys-text")}"
        ></bbva-panel-info>
      </div>
    `}}class hi extends ai{constructor(e){super(e,{template:"transitional",headerText:"payments-mobile-payment-modal-title",headerType:"modal-three-level"})}onNativeButtonClick(){this._faqsAemTarget?(this._faqsAemTarget.showModal=!1,this._faqsAemTarget=null):this.cancelModal()}onShowItem(e){this._part._faqsAemTarget=e.target}render(){const{aemHost:e,native:t,faqsContentFragmentPath:i,faqsAemData:a,hideFeedbackFooter:r}=this.controller;return u`
      <help-faqs-aem
        slot="slot-content"
        host="${e}"
        ?native="${t}"
        content-fragment-path="${i}"
        .aemData=${a}
        @help-faqs-aem-detail-show=${this.onShowItem}
        @visible-changed=${e=>e.stopPropagation()}
        ?hide-footer=${r}
      ></help-faqs-aem>
    `}}class pi extends ai{constructor(e){super(e,{fullHeight:!0,headerType:"modal",headerText:"payments-mobile-payment-no-cards-header",buttonText:"payments-mobile-payment-no-cards-button",hideContentPaddingTop:!0})}footerButtonClick(){this._dispatchCustomEvent("payments-mobile-payment-modal-no-card-available-to-show")}render(){return u`
      <div slot="slot-content">
        <bbva-panel-info
          slot="slot-title"
          .microillustration=${fe}
          heading="${this.t("payments-mobile-payment-no-cards-heading")}"
          text=${this.t("payments-mobile-payment-no-cards-description")}
        ></bbva-panel-info>
      </div>
    `}}class mi extends ai{constructor(e){super(e,{template:"onboarding",headerText:"payments-mobile-payment-modal-title"})}footerButtonClick(){var e;const t=null===(e=this.data)||void 0===e?void 0:e.mode;this._dispatchCustomEvent(`payments-mobile-payment-modal-register-${t}`)}}class gi extends ai{constructor(e){super(e,{fullHeight:!0,headerType:"modal",headerText:"payments-mobile-payment-modal-title",buttonText:"payments-mobile-payment-pending-operation-modal-button",hideContentPaddingTop:!0})}changeVisible(e){const t=e.detail?"open":"close",i=this.data.operationType;this._dispatchCustomEvent(`payments-mobile-payment-pending-${i}-operation-${t}`)}render(){var e;return u`
      <div slot="slot-content">
        <bbva-panel-info
          slot="slot-title"
          .microillustration=${_e}
          heading="${this.t(`payments-mobile-payment-pending-${this.data.operationType}-modal-title`)}"
        ></bbva-panel-info>
        <bbva-panel-detail
          .statusDescription="${St(this.data.card)}"
          .mask="${null===(e=this.data.card)||void 0===e?void 0:e.number}"
          no-link
        ></bbva-panel-detail>
        <bbva-notification-message>
          ${this.t(`payments-mobile-payment-pending-${this.data.operationType}-modal-message`)}
        </bbva-notification-message>
      </div>
    `}}class bi extends ai{constructor(e){super(e,{titleIcon:H(),titleText:"payments-mobile-payment-error-generic-title",bodyText:"payments-mobile-payment-error-generic-message",buttonText:"payments-mobile-payment-error-generic-understood"})}}class vi extends ai{constructor(e){super(e,{titleIcon:H(),modalType:"warning",titleText:"payments-mobile-payment-error-generic-title",bodyText:"payments-mobile-payment-error-generic-message",buttonText:"payments-mobile-payment-error-generic-retry",linkText:"payments-mobile-payment-error-generic-exit"})}}class ui extends ai{constructor(e){super(e,{titleIcon:V(),modalType:"info",titleText:"payments-mobile-payment-settings-unsubscribe-modal-title",bodyText:"payments-mobile-payment-settings-unsubscribe-modal-description",buttonText:"payments-mobile-payment-settings-unsubscribe-modal-button",linkText:"payments-mobile-payment-settings-unsubscribe-modal-link"})}}var yi=e`:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-transition-duration: 0.3s;
  --bbva-help-modal-veil-transition-duration: 0.25s;
  --bbva-help-modal-veil-transition-delay: 0s;
  --bbva-help-modal-transition-delay: 0s;
  --_modal-z-index: 10;
}

:host([mode=error-retry]) {
  --bbva-help-modal-title-icon-color: var(--colorsTertiaryType1Dark, ${t(r.tertiaryType1Dark)});
}

:host([mode=expired-keys]) .button-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
:host([mode=expired-keys]) .button-container [data-tag-name=bbva-link] {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
:host([mode=expired-keys]) [data-tag-name=bbva-notification-message] {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

:host([mode=help]) [data-tag-name=bbva-transition-container] {
  --bbva-transition-container-padding: 0;
}
:host([mode=help]) [data-tag-name=help-faqs-aem] {
  height: auto;
}

:host([mode=default-card]) [data-tag-name=bbva-text],
:host([mode=add-card]) [data-tag-name=bbva-text] {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
}
:host([mode=default-card]) [data-tag-name=bbva-notification-message],
:host([mode=add-card]) [data-tag-name=bbva-notification-message] {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

:host([mode=pending-operation]) {
  --bbva-panel-detail-box-shadow: none;
}
:host([mode=pending-operation]) [data-tag-name=bbva-notification-message] {
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}
`;const fi=D((e=>class extends(l(c(e))){static get properties(){return{aemHost:{type:String,attribute:"aem-host"},cardsDigitizedStatus:{type:Array,attribute:"cards-digitized-status"},country:{type:String},favoriteCardId:{type:String,attribute:"favorite-card-id"},isRegistered:{type:Boolean,attribute:"is-registered"},language:{type:String},localCurrency:{type:String},native:{type:Boolean},selectedCardId:{type:String}}}constructor(){super(),this.aemHost="",this.selectedCardId="",this.favoriteCardId="",this.isRegistered=!1,this.cardsDigitizedStatus=[],this.language="",this.country="",this.localCurrency=""}openModal(e,t={}){this._dispatchCustomEvent("payments-mobile-payment-open-modal",{mode:e,...t})}_dispatchCustomEvent(e,t=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}}));class _i extends(L(fi(c(M(h))))){static get MODES(){return{activateService:"activate-service",addCard:"add-card",callBank:"call-bank",cardNotElegible:"card-not-elegible",defaultCard:"default-card",defaultCardConfirmation:"default-card-confirmation",expiredKeys:"expired-keys",help:"help",noCardAvailable:"no-card-available",onboarding:"onboarding",pendingOperation:"pending-operation",errorNoRetry:"error-no-retry",errorRetry:"error-retry",unsubscribe:"unsubscribe"}}static get TEMPLATES(){return{modal:"modal",transitional:"transitional",onboarding:"onboarding"}}static get is(){return"payments-mobile-payment-modal"}static get scopedElements(){const e=[ve,Fe,se,wt,oe,ne,He,at,ue,g,Ze,le,Oe,Je,Gt,Se,re,ii,ri,ni,si,oi,li,di,ci,hi,pi,gi,bi,vi,ui];return _i.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean,reflect:!0},mode:{type:String,attribute:"mode",reflect:!0},data:{type:Object},contentFragmentPath:{type:String,attribute:"content-fragment-path"},hideFeedbackFooter:{type:Boolean,attribute:"hide-feedback-footer"},faqsAemData:{type:Object},faqsContentFragmentPath:{type:String,attribute:"faqs-content-fragment-path"},phoneNumber:{type:String,attribute:"phone-number"}}}static get styles(){return[yi,C.light,k.light,T.light,Ve.light,E.light,it.light,Xe.light,we.light,$.light,ze.light,v("payments-mobile-payment-modal-shared-styles")]}constructor(){super(),this.contentFragmentPath="",this.data={},this.faqsAemData=null,this.faqsContentFragmentPath="",this.hideFeedbackFooter=!1,this.mode="",this.phoneNumber="",this.visible=!1,this._activateServicePart=new ri(this),this._addCardPart=new ni(this),this._callBankPart=new si(this),this._cardNotElegiblePart=new oi(this),this._defaultCardPart=new li(this),this._defaultCardConfirmationPart=new di(this),this._expiredKeysPart=new ci(this),this._helpPart=new hi(this),this._noCardAvailablePart=new pi(this),this._onboardingPart=new mi(this),this._pendingOperationPart=new gi(this),this._errorNoRetryPart=new bi(this),this._errorRetryPart=new vi(this),this._unsubscribePart=new ui(this),this._resetConfig()}update(e){var t,i;e.has("mode")?(this._resetConfig(),this._configs()):null===(t=this._part)||void 0===t||null===(i=t.update)||void 0===i||i.call(t,e);super.update(e)}get _part(){const e={[_i.MODES.activateService]:this._activateServicePart,[_i.MODES.addCard]:this._addCardPart,[_i.MODES.callBank]:this._callBankPart,[_i.MODES.cardNotElegible]:this._cardNotElegiblePart,[_i.MODES.defaultCard]:this._defaultCardPart,[_i.MODES.defaultCardConfirmation]:this._defaultCardConfirmationPart,[_i.MODES.expiredKeys]:this._expiredKeysPart,[_i.MODES.help]:this._helpPart,[_i.MODES.noCardAvailable]:this._noCardAvailablePart,[_i.MODES.onboarding]:this._onboardingPart,[_i.MODES.pendingOperation]:this._pendingOperationPart,[_i.MODES.errorNoRetry]:this._errorNoRetryPart,[_i.MODES.errorRetry]:this._errorRetryPart,[_i.MODES.unsubscribe]:this._unsubscribePart};return this.mode in e?e[this.mode]:null}_configs(){this._part&&Object.assign(this,this._part.properties)}_resetConfig(){Object.assign(this,ai.defaultProperties)}async _changeVisible(e){var t,i;const{detail:a,target:r}=e;this.visible=a,null===(t=(i=this._part).changeVisible)||void 0===t||t.call(i,e),this._dispatchCustomEvent("payments-mobile-payment-modal-status",{visible:a,target:r,mode:this.mode}),this._dispatchCustomEvent(`payments-mobile-payment-modal-${this.mode}-${a?"open":"close"}`)}_footerButtonClick(e){var t,i,a;null!==(t=this._part)&&void 0!==t&&t.footerButtonClick?null===(i=this._part)||void 0===i||null===(a=i.footerButtonClick)||void 0===a||a.call(i,e):this._dispatchCustomEvent(`payments-mobile-payment-modal-${this.mode}-button-click`);this.closeModal()}_footerLinkClick(e){var t,i;(e.stopPropagation(),null!==(t=this._part)&&void 0!==t&&t.footerLinkClick)?null===(i=this._part)||void 0===i||i.footerLinkClick(e):(this._dispatchCustomEvent(`payments-mobile-payment-modal-${this.mode}-link-click`),this.cancelModal())}_closeButtonClick(e){var t,i,a;(null==e||null===(t=e.stopPropagation)||void 0===t||t.call(e),null!==(i=this._part)&&void 0!==i&&i.closeButtonClick)?null===(a=this._part)||void 0===a||a.closeButtonClick(e):this.cancelModal()}nativeButtonClick(){var e,t,i;null!==(e=this._part)&&void 0!==e&&e.onNativeButtonClick?null===(t=this._part)||void 0===t||null===(i=t.onNativeButtonClick)||void 0===i||i.call(t):this._closeButtonClick()}cancelModal(){this._dispatchCustomEvent(`payments-mobile-payment-modal-${this.mode}-cancel`),this.closeModal()}closeModal(){this.visible=!1}showTransitionModal(){var e;const t=this.mode===_i.MODES.help;return u`
      <bbva-transition-container
        header-text=${this.headerText}
        header-type=${this.headerType}
        ?hide-return-icon=${t}
        icon-right-primary=${t?xe():""}
        accessibility-text-icon-right-primary=${this.t("payments-mobile-payment-modal-header-icon-right-accessibility-text")}
        ?visible=${this.visible}
        @visible-changed=${this._changeVisible}
      >
        ${null===(e=this._part)||void 0===e?void 0:e.render()}
      </bbva-transition-container>
    `}showBasicModal(){var e;return u`
      <bbva-help-modal
        .headerType=${this.headerType}
        .titleIcon=${this.titleIcon}
        .titleText=${this.t(this.titleText)}
        .headerText=${this.t(this.headerText)}
        .bodyText=${this.t(this.bodyText)}
        .buttonText=${this.t(this.buttonText)}
        .linkText=${this.t(this.linkText)}
        .modalType=${this.modalType}
        accessibility-text-icon-right-primary=${this.t("payments-mobile-payment-modal-header-icon-right-accessibility-text")}
        ?full-height=${this.fullHeight}
        ?hide-content-padding-top=${this.hideContentPaddingTop}
        ?visible=${this.visible}
        @visible-changed=${this._changeVisible}
        @help-modal-footer-button-click=${this._footerButtonClick}
        @help-modal-footer-link-click=${this._footerLinkClick}
        @help-modal-header-right-primary-click=${this._closeButtonClick}
        @help-modal-veil-click=${this.cancelModal}
        fixed-footer
      >
        ${null===(e=this._part)||void 0===e?void 0:e.render()}
      </bbva-help-modal>
    `}showOnboarding(){return u`
      <onboarding-full-screen-carousel
        modal-title=${this.t(this.headerText)}
        content-fragment-host=${this.aemHost}
        content-fragment-path=${this.contentFragmentPath}
        ?visible=${this.visible}
        @visible-changed=${this._changeVisible}
        ?native=${this.native}
        @onboarding-full-screen-carousel-activate=${this._footerButtonClick}
        @help-modal-header-right-primary-click=${this._closeButtonClick}
      ></onboarding-full-screen-carousel>
    `}render(){switch(this.template){case _i.TEMPLATES.transitional:return this.showTransitionModal();case _i.TEMPLATES.onboarding:return this.showOnboarding();default:return this.showBasicModal()}}}class xi extends Ct{get favoriteCard(){const{favoriteCardId:e,cardsDigitizedStatus:t}=this.controller;return e&&t.length?t.find((t=>ut(t)===e)):null}get otherCardsFilterIds(){const{favoriteCardId:e,cardsDigitizedStatus:t}=this.controller;return(t||[]).filter((t=>!t.digitized||ut(t)===e)).map((e=>e.id))}_openAddCardModal(){this.openModal(_i.MODES.addCard)}_openChangeDefaultCardModal(){this.openModal(_i.MODES.defaultCard)}get showFavoriteCard(){const{language:e,localCurrency:t,favoriteCardId:i}=this.controller;if(i&&this.favoriteCard){var a,r,n;const i=xt(this.favoriteCard),l=i?`cards-list-cards-status-${i}`:"";return u`
        <bbva-list-card
          .language="${e}"
          .localCurrency="${t}"
          show-card
          no-link
          .cardImage=${yt(this.favoriteCard)}
          .cardTitle=${St(this.favoriteCard)}
          .cardType=${null===(a=this.favoriteCard)||void 0===a||null===(r=a.cardType)||void 0===r?void 0:r.id}
          .cardStatus=${xt(this.favoriteCard)}
          .numProduct=${null===(n=this.favoriteCard)||void 0===n?void 0:n.number}
          .badgeText=${l}
          .badgeType=${s=this.favoriteCard,vt[null==s||null===(o=s.status)||void 0===o?void 0:o.id]||null}
          .amount=${_t(this.favoriteCard)}
          .currencyCode=${ft(this.favoriteCard,t)}
          .contentText=${this.t("payments-mobile-payment-card-available-balance")}
        ></bbva-list-card>
      `}var s,o;return u`
      <bbva-panel-info
        .text="${this.t("payments-mobile-payment-feature-no-default-card-selected-message")}"
        .linkText="${this.t("payments-mobile-payment-feature-no-default-card-change-card")}"
        @panel-info-link-click="${()=>this._openChangeDefaultCardModal()}"
      ></bbva-panel-info>
    `}get showOtherCards(){const{host:e,cardsApiVersion:t,requiredToken:i,native:a,localCurrency:r,language:n,cardsDigitizedStatus:s,favoriteCardId:o}=this.controller,l=(s||[]).filter((e=>ut(e)!==o));if(!l.length)return u``;const d=l.filter((e=>e.digitized));return u`
      <bbva-divider></bbva-divider>
      ${d.length?u`
            <cards-list-cards
              .host="${e}"
              .cards=${this.controller.cardsDigitizedStatus||[]}
              .cardsApiVersion="${t}"
              .requiredToken="${i}"
              ?native="${a}"
              .localCurrency="${r}"
              .language="${n}"
              cache-type="${pt}"
              cache-key="${mt}"
              divider-size="fit"
              .filterByCardId="${this.otherCardsFilterIds}"
              .listTitle="${this.t("payments-mobile-payment-feature-other-default-card-title")}"
            ></cards-list-cards>
            <bbva-list-link
              .headerText="${this.t("payments-mobile-payment-feature-card-change-default-card")}"
              @list-link-click="${()=>this._openChangeDefaultCardModal()}"
            ></bbva-list-link>
          `:u`
            <bbva-header-category
              text="${this.t("payments-mobile-payment-feature-other-default-card-title")}"
            ></bbva-header-category>
          `}

      <bbva-list-link
        .headerText="${this.t("payments-mobile-payment-feature-card-add-card")}"
        @list-link-click="${()=>this._openAddCardModal()}"
      ></bbva-list-link>
    `}get showMessageDisabledCard(){return this.favoriteCard&&xt(this.favoriteCard)?u`
      <bbva-notification-message
        class="panel"
        .textContent="${this.t("payments-mobile-payment-feature-card-disabled-message")}"
        .linkTitle="${this.t("payments-mobile-payment-feature-card-disabled-link-message")}"
        @notification-message-link-click="${()=>this._openChangeDefaultCardModal()}"
      ></bbva-notification-message>
    `:u``}render(){return u`
      <bbva-header-category
        .text=${this.t("payments-mobile-payment-feature-default-card-title")}
      ></bbva-header-category>
      ${this.showMessageDisabledCard} ${this.showFavoriteCard} ${this.showOtherCards}
    `}}class Si extends Ct{async changeSecurityUnlock({detail:e}){const{checked:t}=e;this._dispatchCustomEvent("payments-mobile-payment-change-security-settings",{checked:t})}openConfirmUnsubscribe(){this._dispatchCustomEvent("payments-mobile-payment-unsubscribe-click"),this.openModal(_i.MODES.unsubscribe)}render(){const e=this.controller.hasCDCVM?u`
          <bbva-header-category
            .text=${this.t("payments-mobile-payment-settings-security-header")}
          ></bbva-header-category>
          <bbva-form-toggle
            @form-toggle-switch-change="${e=>this.changeSecurityUnlock(e)}"
            ?checked="${this.controller.securityToggleStatus}"
            disabled-ellipsis
            variant="list-right"
            description=${this.t("payments-mobile-payment-settings-security-unlock-toggle-description")}
          >
            ${this.t("payments-mobile-payment-settings-security-unlock-label")}
          </bbva-form-toggle>
          <bbva-divider></bbva-divider>
        `:N;return u`
      ${e}
      <bbva-header-category
        .text=${this.t("payments-mobile-payment-settings-unsubscribe-title")}
      ></bbva-header-category>
      <div class="container">
        <bbva-text
          text="${this.t("payments-mobile-payment-settings-unsubscribe-description")}"
          size="S"
          tag="span"
        ></bbva-text>
      </div>
      <bbva-list-link
        header-text=${this.t("payments-mobile-payment-settings-unsubscribe-service")}
        @list-link-click=${()=>this.openConfirmUnsubscribe()}
      ></bbva-list-link>
    `}}var $i=e`:host {
  display: block;
  overflow-y: auto;
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
  height: calc(100vh - var(--_payments-mobile-payment-header-margin));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-notification-message] {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

:host([mode=detail]) {
  --bbva-panel-detail-box-shadow: none;
}
:host([mode=detail]) .button-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) 0;
}
:host([mode=detail]) [data-tag-name=bbva-panel-detail] {
  --_panel-detail-status-description-color: var(--colorsSecondary500, ${t(r.secondary500)});
}
:host([mode=detail]) [data-tag-name=bbva-panel-detail][digitized] {
  --_panel-detail-status-description-color: var(--colorsTertiaryType6Dark, ${t(r.tertiaryType6Dark)});
}

:host([mode=reset]) .button-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem) 0;
  justify-content: center;
}

:host([mode=list]) [data-tag-name=bbva-list-link] {
  padding: 0;
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1rem);
}

:host([mode=settings]) {
  padding-top: 0;
  --bbva-form-toggle-description-color: var(--colorsSecondary500, ${t(r.secondary500)});
}
:host([mode=settings]) [data-tag-name=bbva-header-category] {
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
}
:host([mode=settings]) [data-tag-name=bbva-text] {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
}
:host([mode=settings]) .container {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(n.spacer)}))) / 16) * 1em);
}
:host([mode=settings]) [data-tag-name=bbva-help-modal] {
  transform: none;
}
`;class Ci extends(fi(h)){static get MODES(){return{settings:"settings",detail:"detail",list:"list"}}static get is(){return"payments-mobile-payment-page"}static get scopedElements(){const e=[kt,xi,Si,qe,se,oe,m,Oe,ne,$e,re,g,Je,He,at,ve,le];return Ci.scopedElementsFromClasses(e)}static get properties(){return{disableSetFavorite:{type:Boolean,attribute:"disable-set-favorite"},hasCDCVM:{type:Boolean,attribute:"has-cdcvm"},isActualCardFavorite:{type:Boolean,attribute:"is-actual-card-favorite"},isNfcEnabled:{type:Boolean,attribute:"is-nfc-enabled"},mode:{type:String,reflect:!0},securityToggleStatus:{type:Boolean,attribute:"security-toggle-status"}}}static get styles(){return[$i,we.light,k.light,Xe.light,Ve.light,it.light,C.light,Be.light,w.light,T.light,$.light,v("payment-mobile-payment-page-shared-styles")]}constructor(){super(),this.disableSetFavorite=!1,this.hasCDCVM=!1,this.isActualCardFavorite=!1,this.isNfcEnabled=!1,this.mode="reset",this.securityToggleStatus=!1,this.detailPart=new kt(this),this.listPart=new xi(this),this.settingsPart=new Si(this)}async update(e){e.has("mode")&&this.mode&&this._dispatchCustomEvent(`payments-mobile-payment-navigate-to-${this.mode}`),super.update(e)}get _part(){const e={[Ci.MODES.detail]:this.detailPart,[Ci.MODES.list]:this.listPart,[Ci.MODES.settings]:this.settingsPart};return this.mode in e?e[this.mode]:null}activateNfc(){this._dispatchCustomEvent("payments-mobile-payment-nfc-activate")}_showMessageNfcDisabled(){return this.mode===Ci.MODES.settings||this.isNfcEnabled?"":u`
      <bbva-notification-message
        .messageTitle=${this.t("payments-mobile-payment-feature-nfc-disabled-title")}
        .message="${this.t("payments-mobile-payment-feature-nfc-disabled-message")}"
        .linkTitle="${this.t("payments-mobile-payment-feature-nfc-disabled-link-message")}"
        @notification-message-link-click="${this.activateNfc}"
      ></bbva-notification-message>
    `}render(){var e,t;return u`
      ${this._showMessageNfcDisabled()} ${(null===(e=this._part)||void 0===e||null===(t=e.render)||void 0===t?void 0:t.call(e))||""}
    `}}const ki=D((e=>class extends(L(e)){static configurationScopedElements(){return[It,At,wt,Z]}static get properties(){return{config:{type:Object},_showNotifyTop:{type:Boolean}}}constructor(){super(),this.config={header:!1,back:!0,fixedHeader:!1,loader:!1,notify:!1,notifyTop:!1,notifyFeature:!1,smartAssistant:!1,faqs:!1},this._showNotifyTop=!1,this._boundBackHandler=this._back.bind(this),this._fixedHeaderStyles="position: sticky; top: 0; left: 0; width: 100%; z-index: var(--bbva-header-main-z-index, 1);"}firstUpdated(){this.config={...this.config,back:!Object.prototype.hasOwnProperty.call(this.config,"back")||this.config.back}}get _headerStyles(){return this.config.header&&this.config.fixedHeader?this._fixedHeaderStyles:""}_tpl(e,t){const i=`_${e}`;return this[i]||(this[i]=document.createElement(e)),"object"==typeof t&&Object.keys(t).forEach((e=>{"@"===e[0]?this[i].addEventListener(e.substring(1),t[e]):this[i][e]=t[e]})),this._setPrimaryLeftIcon(e,i),this._setSecondaryRightIcon(e,i),u`${this[i]}`}_back(){this._dispatchCustomEvent("navigation-go-back")}_setPrimaryLeftIcon(e,t){if(this.config.header&&e===this.getScopedTagName("bbva-header-main")&&this.config.back){this[t].iconLeftPrimary=this.config.header.iconLeftPrimary||Ce();const e="@header-main-icon-left-primary-click",i=this.config.header[e]?this.config.header[e]:this._boundBackHandler;this[t].removeEventListener("header-main-icon-left-primary-click",i),this[t].addEventListener("header-main-icon-left-primary-click",i)}}_setSecondaryRightIcon(e,t){this.config.header&&e===this.getScopedTagName("bbva-header-main")&&(this[t].iconRightSecondary=this[t].iconRightSecondary||this.config.smartAssistant&&Q()||this.config.faqs&&ee())}_dispatchCustomEvent(e,t=!0,i=!0,a=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:i,composed:a,detail:t,cancelable:!0}))}showLoader(e="full",t=!1,i=!1){const a={variant:e,showSpinnerMessageLabel:t,loginAnimation:i};this._dispatchCustomEvent("show-loader",a)}clearLoader(){this._dispatchCustomEvent("hide-loader")}showNotify(e,t,i,a){const r={description:e,simpleLinkText:t,type:i,duration:a};this._dispatchCustomEvent("show-notification",r)}clearNotify(){this._dispatchCustomEvent("hide-notification")}showNotifyTop({text:e="",status:t=""}={}){this.config.notifyTop={...this.config.notifyTop,text:e,status:t},this._showNotifyTop=!0}clearNotifyTop(){this._showNotifyTop=!1}renderNotify(){var e,t,i;return u`
          ${null!==(e=this.config)&&void 0!==e&&e.notify||null!==(t=this.config)&&void 0!==t&&t.notifyFeature?this._tpl(this.getScopedTagName("bbva-notification-container"),{fixedBottom:null===(i=this.config)||void 0===i?void 0:i.notifyFeature,...this.config.notify}):null}
        `}_getElements(){var e,t,i,a;return{[this.getScopedTagName("bbva-notification-status")]:{config:{...this.config.notifyTop,hide:!this._showNotifyTop},condition:(null===(e=this.config)||void 0===e?void 0:e.notifyTop)||(null===(t=this.config)||void 0===t?void 0:t.notifyFeature)},[this.getScopedTagName("bbva-progress-content")]:{config:this.config.loader,condition:null===(i=this.config)||void 0===i?void 0:i.loader},[this.getScopedTagName("bbva-header-main")]:{config:this.config.header,condition:null===(a=this.config)||void 0===a?void 0:a.header}}}render(){const e=this._getElements();return u`
          <section style="${this._headerStyles}">
            ${Object.keys(e).map((t=>e[t].condition?this._tpl(t,e[t].config):null))}
            <slot name="customHeaderContainer"></slot>
          </section>
          ${this.renderNotify()}
        `}})),Ti=D((e=>class extends(L(ki(M(c(e))))){static get properties(){return{modalVisible:{type:Boolean,attribute:"modal-visible"},_disableSetFavorite:{type:Boolean},_isActualCardFavorite:{type:Boolean},_isNfcEnabled:{type:Boolean},_isRegistered:{type:Boolean},_cardsDigitizedStatus:{type:Array},_modalMode:{type:String},loaderActive:{type:Boolean,attribute:"loader-active",reflect:!0},_modalData:{type:Object},_operativeInitialized:{type:Boolean}}}constructor(){super(),this.maxTries=3,this.modalVisible=!1,this.disableSetFavorite=!1,this.loaderActive=!1,this._modalStack=[],this._modalMode=null,this._modalData=null,this._askedDefault=!1,this._cardsDigitizedStatus=[],this._isActualCardFavorite=!1,this._isNfcEnabled=!1,this._isRegistered=!1,this._operativeInitialized=!1,this._addPluginCallListeners(),this._addListeners()}_addListeners(){this.addEventListener("payments-mobile-payment-open-modal",(async e=>{e.stopPropagation();const{mode:t,...i}=e.detail;this._openModal(t,i)}))}_addPluginCallListeners(){for(const[e,t]of Object.entries(dt))this.addEventListener(t,(t=>{const[i]=t.composedPath();this!==i&&i[`${e}Resolver`]&&(this[`${e}Resolver`]=i[`${e}Resolver`],this[`${e}ResolverError`]=i[`${e}ResolverError`])}))}_onClosePendingOperation(){!this.productId&&this._isRegistered||this.exitOperative()}_onCancelRetry(){!this.productId&&this._isRegistered||this.exitOperative()}async _doCall(e,t,i){const{onSuccess:a,onError:r,onFinish:n,preventRetryErrorModal:s=!1,preventClearLoaderAfterFinish:o=!1,isHalfModalSpinner:l=!1}=t;let d=!1;try{this.showLoader(),this.loaderActive=l;const t=await e();a&&await a(t)}catch(t){this._dispatchCustomEvent("payments-mobile-payment-error",t),d=!0;const o=()=>this._doCall(e,{onSuccess:a,onError:r,onFinish:n,preventRetryErrorModal:s,isHalfModalSpinner:l},i+1);r&&(null==r||r(t,{retryAction:o,actualTry:i})),s&&r||this._generateRetryAction(t,o,i)}finally{o&&!d||(this.clearLoader(),this.loaderActive=!1),null==n||n(d)}}_manageRetryCall(e,t={}){return this._doCall(e,t,0)}_generateRetryAction(e,t,i){if(i<this.maxTries){var a;this._errorRetryCallback=t;const i=(null===(a=e.cause)||void 0===a?void 0:a.method)in ht;this._openModal(i?_i.MODES.errorNoRetry:_i.MODES.errorRetry)}else this._openModal(_i.MODES.callBank)}_modalStackControl(e){const[t]=e.composedPath(),{visible:i,target:a}=e.detail;this.modalVisible=i,i?this._modalStack.push(t):this._modalStack.pop(),this._dispatchCustomEvent("modal-state-change",{visible:i,target:a,property:"modalVisible"})}_onInitOperative(e){this._manageRetryCall((async()=>{var t;this._operativeInitialized||(await(null===(t=this._dm)||void 0===t?void 0:t.callInitialize()),this._operativeInitialized=!0);this._isRegistered=await this._dm.callIsRegistered(),this._isRegistered?this._checkKeys():this._showOnboarding();const i=await e(this._isRegistered);this._dispatchCustomEvent(`payments-mobile-payment-${this.showMode}-load`,i??!0)}),{preventClearLoaderAfterFinish:!0,onFinish:()=>{this._isRegistered&&this.clearLoader()}})}async _openModal(e,t){this._modalMode=e,this._modalData=t,await this.updateComplete,this.modalVisible=!0}async _registerIntoOperative(e,t=!1){this._manageRetryCall((async()=>{this._dispatchCustomEvent("payments-mobile-payment-devices-register");return await this._dm.callFirstRegistration(this.country,this.deviceInfo)}),{preventClearLoaderAfterFinish:!0,onSuccess:async i=>{await this._loginIntoOperative(e,t,i)}})}async _loginIntoOperative(e,t,i){this._manageRetryCall((async()=>this._dm.callLogin(i)),{onSuccess:e,preventClearLoaderAfterFinish:t,onFinish:e=>{e||this._dispatchCustomEvent("payments-mobile-payment-devices-success-register")}})}_showOnboarding(){const e={[Ci.MODES.detail]:_i.MODES.onboarding,[Ci.MODES.list]:_i.MODES.onboarding,[Ci.MODES.settings]:_i.MODES.activateService};this._openModal(e[this.showMode],{mode:this.showMode})}clearAndBack(){this.clearLoader(),this.exitOperative()}exitOperative(){this._dispatchCustomEvent("payments-mobile-payment-back-step")}manageBackButton(){const e=this._modalStack.length;var t;e?null===(t=this._modalStack[e-1])||void 0===t||t.nativeButtonClick():this.exitOperative()}}));class wi extends(Ti(h)){static get is(){return"payments-mobile-payment"}static get scopedElements(){const e=[le,ne,re,g,Se,_i,Ci,$t,...wi.configurationScopedElements()];return wi.scopedElementsFromClasses(e)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},cardApiVersion:{type:String,attribute:"card-api-version"},cardsApiVersion:{type:String,attribute:"cards-api-version"},contentFragmentPath:{type:String,attribute:"content-fragment-path"},country:{type:String},deviceInfo:{type:Object,attribute:"device-info"},faqsAemData:{type:Object,attribute:"faqs-aem-data"},faqsContentFragmentPath:{type:String,attribute:"faqs-content-fragment-path"},hasCDCVM:{type:Boolean,attribute:"has-cdcvm"},hideFeedbackFooter:{type:Boolean,attribute:"hide-feedback-footer"},hubPaymentsApiVersion:{type:String,attribute:"hub-payments-api-version"},maxTries:{type:Number,attribute:"max-tries"},localCardDmCustomProperties:{type:Object},localCurrency:{type:String,attribute:"local-currency"},operation:{type:String},phoneNumber:{type:String,attribute:"phone-number"},productId:{type:String,attribute:"product-id"},showHelpFaqs:{type:Boolean,attribute:"show-help-faqs"},singleSignOnApiVersion:{type:String,attribute:"single-sign-on-api-version"},ssoAapTarget:{type:String,attribute:"sso-aap-target"},ssoTargetIdUniqueKey:{type:String,attribute:"sso-target-id"},_requestCode:{type:Number},_securityToggleStatus:{type:Boolean}}}static get styles(){return[nt,rt.light,v("payments-mobile-payment-shared-styles")]}constructor(){super(),this.config={header:{text:this.t("payments-mobile-payment-feature-title"),accessibilityTextIconRightSecondary:this.t("payments-mobile-payment-header-icon-right-accessibility-text"),accessibilityTextIconLeftPrimary:this.t("payments-mobile-payment-header-icon-left-accessibility-text"),"@header-main-icon-left-primary-click":()=>this.exitOperative(),"@header-main-icon-right-secondary-click":()=>this.showHelpFaqs?this._openModal(_i.MODES.help):this._dispatchCustomEvent("payments-mobile-payment-help-click")},faqs:!0,fixedHeader:!0,loader:!0,notifyFeature:!0},this.aemHost="",this.cardApiVersion="1",this.cardsApiVersion="2",this.contentFragmentPath="",this.country="",this.deviceInfo={deviceType:"PHONE",hasNFC:!1,id:null,model:null,os:null,osVersion:null},this.faqsContentFragmentPath="",this.hasCDCVM=!1,this.hubPaymentsApiVersion="0",this.hideFeedbackFooter=!1,this.maxTries=2,this.localCurrency="",this.operation="reset",this.phoneNumber="",this.productId="",this.singleSignOnApiVersion="0",this.ssoAapTarget="30000051",this.ssoTargetIdUniqueKey="",this.localCardDmCustomProperties={},this._requestCode=0}get showMode(){return{reset:"reset",settings:Ci.MODES.settings,operative:this.productId?Ci.MODES.detail:Ci.MODES.list}[this.operation]||Ci.MODES.list}_activateKeys(){this._manageRetryCall((async()=>{const{pkcs7:e}=await this._dm.callGetPKCS7();await this._dm.callLogin(e),this.showNotify(this.t("payments-mobile-payment-feature-card-update-keys-success"),null,"success")}))}_cancelChangeDefaultCard(){this._isActualCardFavorite=!1,this._disableSetFavorite=!1}_changeDefaultCard(e){const{card:t,status:i=!0}=e instanceof Event?e.detail:e,a=this._favoriteCardId;this._manageRetryCall((async()=>{var e;this.clearNotify(),await this._dm.callSetFavoriteCard(i&&t?t:null),this._favoriteCardId=await(null===(e=this._dm)||void 0===e?void 0:e.callGetFavoriteCard()),this._isActualCardFavorite=this._favoriteCardId===ut(t),this.showNotify(this.t(`payments-mobile-payment-feature-card-change-default-card-${this._isActualCardFavorite?"enable":"disable"}-success`),null,"success"),this._dispatchCustomEvent("payments-mobile-payment-set-default-card-success",{cardId:this._favoriteCardId})}),{onFinish:()=>{this._disableSetFavorite=!1},onError:async()=>{this._isActualCardFavorite=!i,await this.requestUpdate()}}).catch((()=>{this._favoriteCardId=a,this._cancelChangeDefaultCard()}))}_changeSecurityUnlock(e){const{checked:t}=e.detail;this.clearNotify(),this._manageRetryCall((async()=>{var e;this._securityToggleStatus=t,await(null===(e=this._dm)||void 0===e?void 0:e.callChangeSecuritySetting(t)),this.showNotify(this.t("payments-mobile-payment-settings-notify-security-"+(t?"enable":"disable")),null,"success")}),{onError:async()=>{this._securityToggleStatus=!t,await this.requestUpdate()}})}_checkKeys(){this._manageRetryCall((async()=>{await this._dm.callAreKeysReady(),this._askedDefault||await this._dm.callIsDefaultApp()||(this._askedDefault=!0,this._dm.callSetDefaultApp(this._requestCode))}),{onError:e=>{"LOGIN_NEEDED"===e.message&&"unsubscribe"!==this.productId&&this._openModal(_i.MODES.expiredKeys)},preventRetryErrorModal:!0,preventClearLoaderAfterFinish:!0})}async _digitizeCard(e){const{card:t}=e instanceof Event?null==e?void 0:e.detail:e;this._manageRetryCall((async()=>{const e=(await this._dm.callGetPKCS7()).pkcs7,i="string"==typeof t?await this._dm.callGetCard(t):t,{result:a}=await this._dm.callEnableCard(i,e);"NOT_ELIGIBLE"===a?this._openModal(_i.MODES.cardNotElegible,{card:i}):(this._openModal(_i.MODES.pendingOperation,{operationType:this._isRegistered?"addition":"activation",card:i}),this._dispatchCustomEvent("payments-mobile-payment-card-success-digitize",t))}))}_onInitDetailPage(){this._onInitOperative((async e=>{var t,i,a,r;this._selectedCard=await(null===(t=this._dm)||void 0===t?void 0:t.callGetCard(this.productId));const n=!!e&&"ENABLED"===(null===(i=await(null===(a=this._dm)||void 0===a?void 0:a.callCheckDigitizeStatus(this._selectedCard)))||void 0===i?void 0:i.status);return this._cardsDigitizedStatus=[{...this._selectedCard,digitized:n}],this._favoriteCardId=e?await(null===(r=this._dm)||void 0===r?void 0:r.callGetFavoriteCard()):null,this._isActualCardFavorite=this._favoriteCardId===ut(this._selectedCard),{digitized:n}}))}_onInitListPage(){this._onInitOperative((async e=>{var t;const i=(await(null===(t=this._dm)||void 0===t?void 0:t.callGetCards())||[]).filter((e=>{var t;return"PENDING_CANCELLATION"!==(null===(t=e.status)||void 0===t?void 0:t.id)}));if(e)if(i.length){this._cardsDigitizedStatus=await Promise.all(i.map((async e=>{var t,i;return{...e,digitized:"ENABLED"===(null===(t=await(null===(i=this._dm)||void 0===i?void 0:i.callCheckDigitizeStatus(e)))||void 0===t?void 0:t.status)}})));var a;if(this._cardsDigitizedStatus.filter((e=>e.digitized)).length)this._favoriteCardId=await(null===(a=this._dm)||void 0===a?void 0:a.callGetFavoriteCard());else this._openModal(_i.MODES.addCard)}else this._openModal(_i.MODES.noCardAvailable)}))}_onInitSettingsPage(){this._onInitOperative((async()=>{var e;this._securityToggleStatus=await(null===(e=this._dm)||void 0===e?void 0:e.callGetSecuritySetting())}))}_onAcceptedDetailOnboarding(){this._registerIntoOperative((async()=>{var e;const t=this._selectedCard??await(null===(e=this._dm)||void 0===e?void 0:e.callGetCard(this.productId));await this._digitizeCard({card:t})}),!0)}_onAcceptedListOnboarding(){this._registerIntoOperative((async()=>{this._openModal(_i.MODES.addCard)}))}_onAcceptedSettingsOnboarding(){this._registerIntoOperative((async()=>{this.showNotify(this.t("payments-mobile-payment-settings-activate-service-success"),null,"success")}))}_tryToChangeFavoriteCard(e){const{card:t,status:i}=e.detail;this._isActualCardFavorite=i||!1,this._manageRetryCall((async()=>{var e;this._disableSetFavorite=!0,await this.requestUpdate(),this._favoriteCardId=await(null===(e=this._dm)||void 0===e?void 0:e.callGetFavoriteCard()),this._favoriteCardId&&i?await this._openModal(_i.MODES.defaultCardConfirmation,{card:t}):this._changeDefaultCard({card:t,status:i})}))}_unsubscribeFromService(){"settings"!==this.showMode?this._dispatchCustomEvent("payments-mobile-payment-unsubscribe-navigation"):this._manageRetryCall((async()=>{this.productId="unsubscribe",await this._dm.callDeleteDeviceLocalMobilePayment(),await this._dm.callDeleteDeviceLocalTrustDevice(),this.showNotify(this.t("payments-mobile-payment-settings-notify-unsubscribe"),null,"success"),this._dispatchCustomEvent("payments-mobile-payment-unsubscribe-success"),this._showOnboarding()}),{isHalfModalSpinner:!0})}firstUpdated(){super.firstUpdated(),this._dm=this.shadowRoot.querySelector('[data-tag-name="payments-mobile-payment-dm"]')}updated(e){(e.has("operation")||e.has("productId"))&&"reset"!==this.operation&&(this._modalStack=[],this._selectedCard=null)}setDeviceId(e){const t="object"==typeof e?e.value:e;this.deviceInfo.id=t}setDeviceNfcStatus(e){this.deviceInfo.hasNFC="NOT_AVAILABLE"!==e,this._isNfcEnabled="ON"===e}setDeviceModel(e){this.deviceInfo.model=e}setDevicePlatform(e){const{platformName:t,versionName:i,platformVersionName:a}=e||{};this.deviceInfo.os=t;const r=i||a,n=r?r.split("."):[],s=new Array(3).fill(0).map(((e,t)=>n[t]||0));this.deviceInfo.osVersion=s.join(".")}setOperativeParams(e){const{operation:t,productId:i}=e||{};this.productId=i,this.operation=t||(null==e?void 0:e.continue)||"operative"}retryAfterError(){var e;null===(e=this._dm)||void 0===e||e.retryDmCallOnError()}resetOperative(){var e;this.operation="reset",this.productId=null,this.modalVisible=!1,null===(e=this._dm)||void 0===e||e.resetData(),this.clearNotify()}render(){return u`
      <div ambient="light">
        ${super.render()}
        <payments-mobile-payment-page
          ?disable-set-favorite=${this._disableSetFavorite}
          ?is-actual-card-favorite=${this._isActualCardFavorite}
          ?is-nfc-enabled=${this._isNfcEnabled}
          ?is-registered=${this._isRegistered}
          ?native=${this.native}
          ?security-toggle-status=${this._securityToggleStatus}
          .cardsDigitizedStatus=${this._cardsDigitizedStatus}
          .country=${this.country}
          .favoriteCardId=${this._favoriteCardId}
          .hasCDCVM=${this.hasCDCVM}
          .language=${this.language}
          .localCurrency=${this.localCurrency}
          .mode=${this.showMode}
          .selectedCardId=${this.productId}
          @payments-mobile-payment-digitize-card=${this._digitizeCard}
          @payments-mobile-payment-change-favorite-card=${this._tryToChangeFavoriteCard}
          @payments-mobile-payment-change-security-settings=${this._changeSecurityUnlock}
          @payments-mobile-payment-navigate-to-detail=${this._onInitDetailPage}
          @payments-mobile-payment-navigate-to-list=${this._onInitListPage}
          @payments-mobile-payment-navigate-to-settings=${this._onInitSettingsPage}
        ></payments-mobile-payment-page>

        <payments-mobile-payment-modal
          ?hide-feedback-footer=${this.hideFeedbackFooter}
          ?is-registered=${this._isRegistered}
          ?native=${this.native}
          ?visible=${this.modalVisible}
          .aemHost=${this.aemHost}
          .cardsDigitizedStatus=${this._cardsDigitizedStatus}
          .contentFragmentPath="${this.contentFragmentPath}"
          .country=${this.country}
          .data=${this._modalData}
          .faqsAemData=${this.faqsAemData}
          .faqsContentFragmentPath=${this.faqsContentFragmentPath}
          .favoriteCardId=${this._favoriteCardId}
          .language=${this.language}
          .localCurrency=${this.localCurrency}
          .mode=${this._modalMode}
          .phoneNumber=${this.phoneNumber}
          .selectedCardId=${this.productId}
          @payments-mobile-payment-modal-activate-service-button-click=${this._onAcceptedSettingsOnboarding}
          @payments-mobile-payment-modal-activate-service-cancel=${this.exitOperative}
          @payments-mobile-payment-modal-default-card-confirmation-accept=${this._changeDefaultCard}
          @payments-mobile-payment-modal-default-card-confirmation-cancel=${this._cancelChangeDefaultCard}
          @payments-mobile-payment-modal-select-default-card=${this._changeDefaultCard}
          @payments-mobile-payment-modal-error-no-retry-button-click=${this._onCancelRetry}
          @payments-mobile-payment-modal-error-retry-button-click=${this._errorRetryCallback}
          @payments-mobile-payment-modal-error-retry-cancel=${this._onCancelRetry}
          @payments-mobile-payment-modal-expired-keys-button-click=${this._activateKeys}
          @payments-mobile-payment-modal-expired-keys-cancel=${this.exitOperative}
          @payments-mobile-payment-modal-no-card-available-cancel=${this.exitOperative}
          @payments-mobile-payment-modal-onboarding-cancel=${this.exitOperative}
          @payments-mobile-payment-modal-pending-operation-close=${this._onClosePendingOperation}
          @payments-mobile-payment-modal-register-detail=${this._onAcceptedDetailOnboarding}
          @payments-mobile-payment-modal-register-list=${this._onAcceptedListOnboarding}
          @payments-mobile-payment-modal-status=${this._modalStackControl}
          @payments-mobile-payment-modal-unsubscribe-button-click=${this._unsubscribeFromService}
          @payments-mobile-payment-call-exit=${this.exitOperative}
        ></payments-mobile-payment-modal>

        <payments-mobile-payment-dm
          ?native=${this.native}
          card-api-version=${this.cardApiVersion}
          cards-api-version=${this.cardsApiVersion}
          host=${this.host}
          hub-payments-api-version=${this.hubPaymentsApiVersion}
          max-tries=${this.maxTries}
          country="${this.country}"
          required-token=${this.requiredToken}
          single-sign-on-api-version=${this.singleSignOnApiVersion}
          sso-aap-target=${this.ssoAapTarget}
          sso-target-id=${this.ssoTargetIdUniqueKey}
          .localCardDmCustomProperties="${this.localCardDmCustomProperties}"
        ></payments-mobile-payment-dm>
      </div>
    `}}customElements.define(wi.is,wi);class Ei extends h{static get is(){return"bbva-manager-mobile-payment"}static get properties(){return{operation:{type:String},productId:{type:String,attribute:"product-id"},financialOverview:{type:Object,attribute:"financial-overview"}}}constructor(){super(),this.operation="operative",this.productId=null}_dispatch(e,t=!0){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}openNfcConfig(){this._dispatch("bbva-manager-mobile-payment-open-nfc-settings",{setting:"nfc_settings"})}onResumeOperative({isVisible:e=!1}={}){e&&this._dispatch("bbva-manager-mobile-payment-check-on-resume-operative")}sendLocalCardCustomProperties(){this._dispatch("bbva-manager-mobile-payment-local-card-custom-properties",{...this.financialOverview?{financialOverview:this.financialOverview}:{}})}manageNavigationActiveTokenCancel(){"settings"===this.operation?this._dispatch("bbva-manager-mobile-payment-navigation-mobile-payment-to-settings"):this._dispatch("bbva-manager-mobile-payment-navigation-mobile-payment-to-product-detail",{productId:this.productId})}}customElements.define(Ei.is,Ei);class Ii extends(Ae(h)){static get is(){return"bbva-analyticmanager-payments-mobile-payment"}static get properties(){return{isRegister:{type:Boolean},operation:{type:String},_areKeysReady:{type:Boolean},_isOperativeLoaded:{type:Boolean}}}constructor(){super(),this.isRegister=!1,this._isOperativeLoaded=!1,this._areKeysReady=!1,this._retryCont=0}updated(){this._isOperativeLoaded&&this.isRegister&&this._areKeysReady&&this.fireOperativeIsLoadedAndShowing()}fireCancelServiceCall(){this._dispatch("bbva-analyticmanager-payments-mobile-payment-cancel-service-call")}fireSecurityCheck(e){const{checked:t}=e;this._dispatch(`bbva-analyticmanager-payments-mobile-payment-security-check-${t}`)}fireConnectionStatus(e){try{const t=JSON.parse(e).connection?"success":"failed";this._dispatch(`bbva-analyticmanager-payments-mobile-payment-connection-${t}`)}catch(e){this._dispatch("bbva-analyticmanager-payments-mobile-payment-connection-error",{error:e})}}fireOperativeIsLoadedAndShowing(){this._dispatch(`bbva-analyticmanager-payments-mobile-payment-${this.operation}-loaded`)}fireShowOtp(){this._dispatch("bbva-analyticmanager-payments-mobile-payment-show-otp")}manageToFireCallAnalytics(){this._retryCont+=1;let e="retry-error";this._retryCont>2&&(e="cancel-service-call",this._retryCont=0),this._dispatch(`bbva-analyticmanager-payments-mobile-payment-${e}`)}reset(){this._retryCont=0,this._isOperativeLoaded=!1,this._areKeysReady=!1}setOperativeLoaded(){this._isOperativeLoaded=!0}setAreKeysReady(){this._areKeysReady=!0}setAreKeysExpired(){this._areKeysReady=!1}}customElements.define(Ii.is,Ii);
