import{H as t,L as e,z as a,ar as i,a8 as n,a9 as o,b0 as s,au as r,bd as l,ab as c,aa as d,ap as h,as as m,at as p,aJ as u,a as g,an as y,bx as b,ak as v,h as f,V as _,av as C,i as $,aw as S,b6 as x,S as P,ag as k,af as T,b3 as E,aV as A,b4 as w,bU as I,ac as L,ad as M,bF as R,b5 as O,cD as H,E as D,bj as B,T as N,aN as q,F as z,g as F,b1 as j,aM as V,ah as U,aD as G,aO as X,dB as W,dA as K,aZ as J,J as Y,cR as Q,cS as Z,bG as tt,cU as et,di as at,dG as it}from"./952f98a9.js";import{a7 as nt,a$ as ot,ao as st,aM as rt,t as lt,d as ct,cl as dt}from"./7f3d7ca9.js";import"./25ca3c7f.js";import"./62eefc6e.js";import{B as ht}from"./a83e7741.js";import"./22a53e3e.js";import{B as mt}from"./40b41b3c.js";import{B as pt,a as ut}from"./a1d2a84f.js";import{B as gt}from"./dd0af563.js";const yt=t((t=>class extends t{static get properties(){return{config:{type:Object},data:{type:Object},appStartedText:{type:String},stringNormalizeExceptions:{type:Array},dynamicMethodsName:{type:Array},dependsOnAppStartedLaunched:{type:Boolean},_isAppStartedLaunched:{type:Boolean}}}constructor(){super(),this.config={items:{},buttons:{continue:""},steps:{}},this.data={},this.appStartedText="app started:",this.stringNormalizeExceptions=["paymentCurrency","currency","operationNumber"],this.dynamicMethodsName=[],this.dependsOnAppStartedLaunched=!1,this._isAppStartedLaunched=!1}persistData(t){Object.assign(this.data,t)}buildDynamicMethods(){this.dynamicMethodsName.forEach((t=>{this[t]=()=>this._dispatch(`analytics-${this._camelToKebabCase(t)}`,this.data)}))}_camelToKebabCase(t){return t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`))}persistDataString(t){Object.assign(this.data,this.parseDataToString(t))}_toStringProcess(t,e){const a=t.toString();return this.stringNormalizeExceptions.includes(e)?a:this._normalizeStr(a)}_normalizeStr(t){let e=t;if("string"==typeof t){const a="ÁÃÀÄÂÉËÈÊÍÏÌÎÓÖÒÔÚÜÙÛÇáãàäâéëèêíïìîóöòôúüùûç",i="AAAAAEEEEIIIIOOOOUUUUCaaaaaeeeeiiiioooouuuuc",n=new RegExp(`[${a}]`,"ug");e=t.replace(n,(t=>i.charAt(a.indexOf(t)))).toLowerCase()}return e}parseDataToString(t,e){if(!t)return t;switch(typeof t){case"string":case"boolean":case"number":return this._toStringProcess(t,e);case"object":if(Array.isArray(t))return t.map((t=>this.parseDataToString(t)));const a={...t};return Object.keys(a).forEach((e=>{a[e]=this.parseDataToString(t[e],e)})),a;case"function":return this.parseDataToString(t());default:return t.toString()}}firePersistedData(t){this.persistData(t),this._dispatch("analytics-persisted-data",this.data)}fireNormalizedPersistedData(t){let e=t;"string"==typeof e&&(e=this.normalizeString(e)),"object"==typeof e&&Object.keys(e).forEach((t=>{e[t]=this.normalizeString(e[t])})),this.firePersistedData(e)}resetData(){this.data={},this._isAppStartedLaunched=!1}firePageVisit(){this._dispatch("analytics-page-visit",this.data),this._isAppStartedLaunched=!1}firePageView(t){this._dispatch("analytics-page-view"+(t?`-${t}`:""))}fireModal(){this._dispatch("analytics-modal")}fireModalWithData(){this._dispatch("analytics-modal",this.data)}fireInternalLink(t){this._dispatch("analytics-internal-link",t)}fireInternalLinkCard(t){this._dispatch("analytics-internal-link-card",t)}fireExternalLink(){this._dispatch("analytics-external-link")}fireItemAppStarted(t){if(!this._isAppStartedLaunched){const e=(null==t?void 0:t.id)||t,a=this._getTextConfig(e,"items");a&&(this.fireAppStarted(a),this._isAppStartedLaunched=this.dependsOnAppStartedLaunched)}}fireAppOnClickStart(){this._dispatch("analytics-app-on-click-start",this.data)}fireAppStarted(t){this.persistData({detail:`${this.appStartedText}${t}`}),this._dispatch("analytics-app-started",this.data)}fireAdvancedMark(){this._dispatch("analytics-advanced-mark",this.data)}fireAppCompleted(){this._dispatch("analytics-app-completed",this.data),this.resetData()}fireFrequentAppCompleted(){this._dispatch("analytics-frequent-app-completed",this.data),this.resetData()}normalizeString(t){return t.toLowerCase().normalize("NFD").replace(/[^a-zA-Z0-9 ]/g,"")}_getTextConfig(t,e){var a,i;return null===(a=this.config)||void 0===a||null===(i=a[e])||void 0===i?void 0:i[t]}getPathValue(t,e){return e.split(".").reduce(((t,e)=>t[e]),t)}_dispatch(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}})),bt=t((t=>class extends(yt(t)){static get properties(){return{currentStep:{type:Number},signatureTypes:{type:Object},signaturePrefix:{type:String},operationNumberPath:{type:String}}}constructor(){super(),this.currentStep=1,this.signatureTypes={},this.signaturePrefix="firma:",this.operationNumberPath="id"}fireStepLoaded(){1===this.currentStep?this.firePageVisit():this._dispatch(`analytics-${this.config.steps[this.currentStep]}`,this.data)}fireButtonAppStarted(){this.fireAppStarted(this.config.buttons.continue)}onStep(t){const e=null==t?void 0:t.currentStep,a=this._getTextConfig(e,"steps");a&&this._dispatch(`analytics-${a}`,this.data)}onLastStep(t){t&&this._dispatch(`analytics-${this.config.steps.last}`,this.data)}manageAnalyticsSign(t){if(t&&Object.keys(t).length){var e;const a=null===(e=this.signatureTypes)||void 0===e?void 0:e[null==t?void 0:t.signatureType];a&&this.persistData({customFields:`${this.signaturePrefix}${a}`})}this._dispatch(`analytics-${this.config.steps.sign}`,this.data)}parseAnalyticsConfirmData(t){const e=null==t?void 0:t[this.operationNumberPath];e&&(this.persistData({operationNumber:e}),this.fireAppCompleted())}}));class vt extends(bt(e)){static get is(){return"bbva-analytics-loan-payment"}static get properties(){return{_paymentOptions:{type:Object},_lastStepDispatched:{type:String}}}constructor(){super(),this._paymentOptions={"recipt-amount":"importe del recibo","other-amount":"otra cantidad","settle-amount":"liquidacion"},this.config={steps:{2:"detail-payment",3:"account-select",4:"summary-payment",sign:"otp"}},this.signatureTypes={"05":"sms",33:"token",131:"sms",145:"token cronto",fingerprint:"touch id",face:"face id"},this._lastStepDispatched=""}fireAppStarted(t){this._isAppStartedLaunched||(this.persistData({detail:this._paymentOptions[t]}),this._dispatch("analytics-app-started",this.data),this._isAppStartedLaunched=!0)}fireDynamicStep({currentStep:t,amount:e="",currency:a="",process:i=""}){const n=Number(e);this._lastStepDispatched!==t&&("2"===t&&this.persistData({amount:n,currency:a,process:i}),this._lastStepDispatched=t,this.onStep({currentStep:t}))}manageAnalyticsSign(t){if(t&&Object.keys(t).length){const e=t.type.split(";")[0],a=this.signatureTypes[e];this.persistData({customFields:`${this.signaturePrefix}${a}`}),this._dispatch(`analytics-${this.config.steps.sign}`,this.data)}}errorLoanPaymentAnalytics(){this._dispatch("analytics-error-loan-payment")}errorGetAccountsAnalytics(){this._dispatch("analytics-error-get-accounts")}}customElements.define(vt.is,vt);var ft=a`:host {
  display: block;
  box-sizing: border-box;
  --bbva-transition-container-padding: 0;
  --bbva-transition-container-padding-bottom: 0;
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

.fullscreen-spinner {
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  width: 100vw;
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  background: var(--bbva-transition-container-dark-mode-modal-container-bg-color, var(--bbva-transition-container-modal-container-bg-color, var(--colorsPrimaryCoreLightened, #ffffff)));
  position: relative;
  z-index: 2;
  pointer-events: none;
  transition: none;
}

:host > [data-tag-name=bbva-transition-container] {
  z-index: 1;
}
`;const _t=(t=!1,e=0)=>{if(t){const t=100*e;return 0!==t%1?Math.trunc(t):t}return 1==e.toString().indexOf(".")?Number(Number(e).toFixed(2)):Number((Math.round(100*Number(e))/1e4).toFixed(2))};var Ct=a`[ambient^=light] {
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
${(new i).mediaRules()}`;const $t=new i;var St=a`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${n(o.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${n(o.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${n(o.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
}
${$t.mediaRules()}`;const xt={dark:a`
    ${s.dark}
    ${r.dark}
    ${l.dark}
    ${St}
  `,light:a`
    ${s.light}
    ${r.light}
    ${l.light}
    ${Ct}
  `},Pt=new i;var kt=a`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${n(o.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${n(o.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${n(o.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${n(o.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${n(o.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${n(o.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${n(o.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${n(o.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${n(o.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${n(o.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${n(o.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem));
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
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
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
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(c.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${n(c.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${n(c.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${n(c.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${n(c.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${n(c.mediumItalic.fontStyle)});
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
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
}
${Pt.mediaRules()}`;class Tt extends(h(m(p(u(g(y(e))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const t=[S,x,P,k,T];return Tt.scopedElementsFromClasses(t)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,kt,xt.light,xt.dark,b("button:focus"),v("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return f`
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
    `}get _icon(){return f`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return f`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return f`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const t="nochange"===this.status?"no-change":this.status;return f`
      <bbva-badge-variability
        disabled-tabindex
        .status=${t}
        .color=${this.color}
      ></bbva-badge-variability>
    `}get _mask(){const t=_(this.mask,this.maskChars,!0,this.visibleChars);return f`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${t.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let t=null;return this.actionIcon||this.actionSecondaryIcon?t=this._actionIcons:this.actionLink&&(t=this._tplLink("actionLink")),t}get _definitionDescriptionTpl(){let t=null,e="";return this.description?(t=this._tplText("description"),e="description"):this.mask?(t=this._mask,e="mask"):this._isValidAmount&&(t=this._amount,e="amount"),f`
      <dd class=${C({[`wrapper-${e}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${t}
      </dd>
    `}_tplLink(t){const e="actionLink"===t?`${t}AccessibilityText`:`${t}LinkAccessibilityText`;return f`
      <bbva-link
        class=${C({ellipsis:this[`${t}Ellipsis`]})}
        aria-label="${$(this.t(this[e]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(t)}"
      >
        <span role=${$(this.roleLink)} aria-live=${$(this.arialiveLink)}>
          ${this[t]}
        </span>
      </bbva-link>
    `}_tplNoLink(t){const e=`${t}AccessibilityText`,a=`${t}TagText`,i=`${t}RoleText`,n=`${t}AriaLiveText`;return f`
      <bbva-text
        aria-label="${this.t(this[e])}"
        role="${$(this[i])}"
        aria-live="${$(this[n])}"
        class="${t}"
        unset
        size="S"
        text="${this[t]}"
        tag="${$(this[a])}"
      >
      </bbva-text>
    `}_tplText(t){return f` ${this[`${t}Link`]?this._tplLink(t):this._tplNoLink(t)} `}_iconClick(t){this.dispatchEvent(new CustomEvent(`list-simple-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(t){const e=t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return f`
      <dl>
        <dt class=${C({ellipsis:this.labelEllipsis})}>
          ${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}
        </dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return f`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?f`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let t=null;const e=["stacked","stacked-center"].includes(this.variant);return t=this.label?this.description||this._isValidAmount||this.mask||e?e?this.renderStacked():this.renderDefault():this._tplText("label"):f` <div class="wrapper-description">${this._tplText("description")}</div> `,f`
      ${t}
      <div class="skeleton"></div>
    `}}customElements.define(Tt.is,Tt);var Et=a`:host {
  display: block;
  box-sizing: border-box;
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

.emphasis-description {
  --bbva-text-font-weight: 500;
}

.emphasis-amount,
* > bbva-amount {
  --bbva-amount-font-weight: 500;
  font-weight: 500;
}

.emphasis {
  --bbva-text-font-weight: 500;
  --bbva-amount-font-weight: 500;
  font-weight: 500;
}

.summary {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
}
`;class At extends(E(e)){static get scopedElements(){const t=[w,Tt];return At.scopedElementsFromClasses(t)}static get is(){return"loan-repeat-list-simple"}static get styles(){return[Et,v("loan-repeat-list-simple-shared-styles")]}static get properties(){return{listItems:{type:Array}}}constructor(){super(),this.listItems=[]}render(){return f`
      ${this.listItems.map((t=>f`
          ${t.showDivider?f`<bbva-divider size="small"></bbva-divider>`:A}
          <bbva-list-simple
            class=${$(t.class)}
            label=${$(t.label)}
            .description=${$(t.description)}
            visible-chars=${Number(t.visibleChars)}
            mask-chars=${$(t.maskChars)}
            .mask=${$(t.mask)}
            language=${$(t.language)}
            .amount=${$(t.amount)}
            .currencyCode=${$(t.currencyCode)}
            .localCurrency=${$(t.localCurrency)}
          >
          </bbva-list-simple>
        `))}
    `}}customElements.define(At.is,At);var wt=a`:host {
  display: block;
  box-sizing: border-box;
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

.center-item {
  display: table;
  margin: 0 auto 0.9375rem auto;
}
`;class It extends(E(e)){static get is(){return"loan-button-group"}static get scopedElements(){const t=[I];return It.scopedElementsFromClasses(t)}static get styles(){return[wt,v("loan-payment-other-amount-form-shared-styles")]}static get properties(){return{primaryButtonText:{type:String},primaryButtonVariant:{type:String},primaryButtonEvent:{type:String},primaryButtonDisabled:{type:Boolean},secondaryButtonText:{type:String},secondaryButtonVariant:{type:String},secondaryButtonEvent:{type:String},secondaryButtonDisabled:{type:Boolean}}}constructor(){super(),this.primaryButtonText="",this.primaryButtonVariant="",this.primaryButtonEvent="",this.primaryButtonDisabled=!1,this.secondaryButtonText="",this.secondaryButtonVariant="link",this.secondaryButtonEvent="",this.secondaryButtonDisabled=!1}_handleClickEvent(t){t.stopPropagation();const e=t.target.dataset.eventName;this.dispatchEvent(new CustomEvent(`${It.is}-${e}`,{bubbles:!0,composed:!0,detail:!0}))}render(){return f`
      ${this.primaryButtonText?f` <bbva-button-default
            id="primaryBtn"
            class="center-item"
            variant=${this.primaryButtonVariant}
            text=${this.primaryButtonText}
            data-event-name=${this.primaryButtonEvent}
            ?disabled=${this.primaryButtonDisabled}
            @click=${this._handleClickEvent}
          >
          </bbva-button-default>`:A}
      ${this.secondaryButtonText?f` <bbva-button-default
            id="secondaryBtn"
            class="center-item"
            variant=${this.secondaryButtonVariant}
            text=${this.secondaryButtonText}
            data-event-name=${this.secondaryButtonEvent}
            ?disabled=${this.secondaryButtonDisabled}
            @click=${this._handleClickEvent}
          >
          </bbva-button-default>`:A}
    `}}customElements.define(It.is,It);var Lt=a`:host {
  display: block;
  box-sizing: border-box;
  --bbva-panel-process-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-date-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-divider-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-clip-product-bg-color: var(--colorsSecondary100, ${n(o.secondary100)});
  --_panel-process-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
}
:host .distanceIcon {
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
}
:host [data-tag-name=bbva-panel-process] {
  background-color: var(--colorsTertiaryType6Dark, ${n(o.tertiaryType6Dark)});
  padding-bottom: 2.5rem;
}
:host [data-tag-name=content-header] {
  background-color: var(--colorsTertiaryType6Dark, ${n(o.tertiaryType6Dark)});
  padding-top: 1rem;
}
:host [data-tag-name=content-panel] {
  background-color: var(--colorsTertiaryType6Dark, ${n(o.tertiaryType6Dark)});
  padding-left: 1rem;
  padding-right: 1rem;
}

.green {
  background-color: var(--colorsTertiaryType6Dark, ${n(o.tertiaryType6Dark)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
}

.distanceOperation {
  padding-bottom: calc(((4.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
}

.distanceMask {
  padding: 0;
}

.paddingList {
  display: contents;
}

[data-tag-name=bbva-core-heading],
[data-tag-name=bbva-text] {
  display: block;
  color: var(--_panel-process-color);
}

[data-tag-name=bbva-core-heading] {
  font-size: var(--typographyTypeXLarge, ${n(L.typeXLarge)});
  line-height: var(--lineHeightTypeXLarge, ${n(M.typeXLarge)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${n(c.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${n(c.medium.fontWeight)});
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
}

.format-text-time {
  color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  font-weight: 500;
  font-style: italic;
}
`;class Mt extends(nt(E(y(e)))){static get is(){return"loan-payment-ticket-page"}static get scopedElements(){const t=[O,ot,Tt,ht,H,It,D,B,N,k,w,It,At];return Mt.scopedElementsFromClasses(t)}static get styles(){return[Lt,v("loan-payment-ticket-page-shared-styles")]}static get properties(){return{localCurrency:{type:String},language:{type:String},loanPaymentTicketPageConfiguration:{type:Object},email:{type:String}}}constructor(){super(),this.loanDetail={},this.localCurrency="",this.language="",this.loanPaymentTicketPageConfiguration={},this.email=""}_formatLoanType(t){const{id:e}=t;return"CM"==e||"CN"==e||"CU"==e||"CD"==e?this.t("loan-payment-ticket-loan-consumer-label"):this.t("loan-payment-staff")}get _headerProcess(){return f`
      <bbva-core-heading level="2"> ${this.t("loan-payment-ticket-payment")} </bbva-core-heading> 

      <bbva-date
        date="${$(this.loanPaymentTicketPageConfiguration.operationDate)}"
        .locale="${this.language}" 
        .options="${{day:"2-digit",month:"short",year:"numeric"}}"
      >
      </bbva-date> 
      <span class="format-text-time">,</span>
      <bbva-date
        date="${$(this.loanPaymentTicketPageConfiguration.operationDate)}"
        .locale="${this.language}" 
        .options="${{hour:"2-digit",minute:"2-digit"}}"
      >
      </bbva-date> 
    `}render(){var t;return f`
      <bbva-header-main
        text="${this.t("loan-payment-ticket-header-main")}"
        variant="process"
        icon-right-primary="${R()}"
        @header-main-icon-right-primary-click=${t=>{t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${Mt.is}-${this.loanPaymentTicketPageConfiguration.headerMainEventRight}`,{composed:!0,bubbles:!0,detail:!0}))}}
      >
      </bbva-header-main>
     
      <div data-tag-name="content-panel">
        <div data-tag-name="content-header">
          ${this._headerProcess} 
        </div>
      </div>

      <bbva-panel-process
        class="${this.summaryTicket?"distanceOperation":""}"
        bbva-panel-process-bg-color="--colorsTertiaryType6Dark"
        ambient="dark"
        .currencyCode=${this.localCurrency}
        .localCurrency=${this.localCurrency}
        .language=${this.language}
        text="loan-payment-ticket-pay-import"
        .amount=${$(this.loanPaymentTicketPageConfiguration.amount)}
        points-decimals-hidden
        description="loan-payment-ticket-commision" 
      > 
      </bbva-panel-process> 

      <loan-repeat-list-simple
        class="green ${1===(null===(t=this.loanPaymentTicketPageConfiguration.summaryTicket)||void 0===t?void 0:t.length)?"distanceOperation":""}"
        .listItems=${$(this.loanPaymentTicketPageConfiguration.summaryTicket)}
      ></loan-repeat-list-simple>

      <bbva-panel-operation
          clip-item = "loandollar"
          variant-clip-product=""
          clip-item="card"
          label-left="${this.t("loan-payment-ticket-panel-operation-label")}"
          .text=${$(this.loanPaymentTicketPageConfiguration.id)}
        >
        <span slot="left">${this._formatLoanType(this.loanPaymentTicketPageConfiguration)}</span>
      </bbva-panel-operation>

      <bbva-list-simple
        variant="stacked-center"
        label="${this.t("loan-payment-ticket-number-payment-label")}"
        .mask=${$(this.loanPaymentTicketPageConfiguration.number)}
        visible-chars="4"
        mask-chars="•"
      >
      </bbva-list-simple>

      <bbva-list-simple
        variant="stacked-center"
        style="padding-bottom: 1rem;"
        label="${this.t("loan-payment-ticket-type-payment-label")}"
        .description=${$(this.loanPaymentTicketPageConfiguration.labelSelected)}
      >
      </bbva-list-simple>

      <bbva-list-simple
        class="paddingList"
        variant="stacked-center"
        label="${this.t("loan-payment-ticket-account-name-label")}"
        .description=${$(this.loanPaymentTicketPageConfiguration.cardTitle)}
      >
      </bbva-list-simple>

      <bbva-list-simple
        class="distanceMask"
        variant="stacked-center"
        label=" "
        .mask=${$(this.loanPaymentTicketPageConfiguration.cardNumber)}
        visible-chars="4"
        mask-chars="•"
      >
      </bbva-list-simple>

      <bbva-list-simple
        variant="stacked-center"
        label="${this.t("loan-payment-ticket-type-operation-label")}"
        style="padding-bottom: 1rem;"
        description="${this.t("loan-payment-ticket-type-operation-description")}"
      >
      </bbva-list-simple>

      <bbva-list-simple
        variant="stacked-center"
        label="loan-payment-ticket-operation"
        .description=${$(this.loanPaymentTicketPageConfiguration.id)}
      >
      </bbva-list-simple>

      <bbva-notification-message
        .messageTitle=${$(this.loanPaymentTicketPageConfiguration.secondInfoMessageTitle)}
        .message=${$(this.loanPaymentTicketPageConfiguration.secondInfoMessage)}
        ?hidden="${$(this.loanPaymentTicketPageConfiguration.secondInfoMessageHidden)}"
        style="margin:1rem"
      >
      </bbva-notification-message>

      <bbva-notification-message
        ?hidden="${!this.email}"
        variant="default"
        message="${this.t("loan-payment-ticket-notification-message")}"
        description=${$(this.email)}
        style="margin:1rem"
      >
      </bbva-notification-message>

      <loan-button-group
        class="button-container"
        primaryButtonText="loan-button-close"
        primaryButtonEvent="close-loan-payment-detail-page"
      >
      </loan-button-group>
    `}}customElements.define(Mt.is,Mt);var Rt=a`:host {
  display: block;
  box-sizing: border-box;
  height: 100vh;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.button-container {
  width: 100%;
  position: absolute;
  bottom: 0;
}
`,Ot=a`:host {
  --_message-icon-color: var(
    --bbva-form-field-message-icon-dark-mode-color,
    var(--bbva-form-field-message-icon-color, var(--colorsTertiaryType1Dark, ${n(o.tertiaryType1Dark)}))
  );
}

.message {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
  display: flex;
  font-size: var(--bbva-loan-payment-message-font-size, var(--typographyType3XSmall, ${n(L.type3XSmall)}));
  line-height: var(--bbva-loan-payment-message-line-height, var(--lineHeightType3XSmall, ${n(M.type3XSmall)}));
}
.message-icon {
  color: var(--_message-icon-color);
  min-width: 1rem;
  min-height: 1rem;
}
`;class Ht extends(nt(E(y(e)))){static get is(){return"loan-account-item"}static get scopedElements(){const t=[st,T,w];return Ht.scopedElementsFromClasses(t)}static get styles(){return[Ot,v("loan-account-item-shared-styles")]}static get properties(){return{class:{type:String},number:{type:String,reflect:!0},amount:{type:Number},disabled:{type:Boolean},numProduct:{type:String},cardTitle:{type:String},contentText:{type:String},language:{type:String},visibleChars:{type:String},currencyCode:{type:String},localCurrency:{type:String},showDivider:{type:Boolean},noLink:{type:Boolean}}}constructor(){super(),this.class="",this.noLink=!1,this.amount=0,this.disabled=!1,this.numProduct="",this.cardTitle="",this.contentText="",this.language="",this.visibleChars="",this.currencyCode="",this.localCurrency="",this.showDivider=!1,this.number=""}_dispachClick(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${Ht.is}-selected`,{bubbles:!0,composed:!0,detail:{class:this.class,amount:this.amount,number:this.number,numProduct:this.numProduct,cardTitle:this.cardTitle,contentText:this.contentText,language:this.language,visibleChars:this.visibleChars,currencyCode:this.currencyCode,localCurrency:this.localCurrency}}))}render(){return f`
      <bbva-list-card
        class=${$(this.class)}
        .amountVariant=${this.cardTitle.length>12||this.amount>=1e9?"long":""} 
        .amount="${$(this.amount)}"
        ?disabled=${this.disabled}
        .numProduct=${$(this.numProduct)}
        .noLink=${$(this.noLink)}
        card-title=${$(this.cardTitle)}
        content-text=${$(this.contentText)}
        language=${$(this.language)}
        visible-chars="${$(this.visibleChars)}"
        currency-code=${$(this.currencyCode)}
        local-currency=${$(this.localCurrency)}
        @list-card-item-click=${$(this._dispachClick)}
      ></bbva-list-card>
      ${this.disabled?f`<div class="message">
            <bbva-core-icon
              class="message-icon"
              .icon="${q()}"
              size="16"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t("loan-payment-insufficient-balance")}</span>
          </div>`:A}
      ${this.showDivider?f`<bbva-divider size="fit"></bbva-divider>`:A}
    `}}customElements.define(Ht.is,Ht);var Dt=a`.gray-letter {
  --_header-category-heading-color: var(--bbva-header-category-heading-dark-mode-color, var(--bbva-header-category-heading-color, var(--colorsSecondary500, #666666)));
}
`;class Bt extends(E(g(e))){static get scopedElements(){const t=[Ht,w,O,H];return Bt.scopedElementsFromClasses(t)}static get is(){return"loan-list-account"}static get styles(){return[Dt,v("loan-list-account-shared-styles")]}static get properties(){return{listAccount:{type:Array},maxItems:{type:Number},primaryHeaderOptionLinkEvent:{type:String},primaryHeaderOptionLink:{type:String},primaryHeader:{type:String},primaryHeaderVariant:{type:String},errorMessageHidden:{type:Boolean}}}constructor(){super(),this.listAccount=[],this.maxItems=0,this.primaryHeaderOptionLinkEvent="custom-evet",this.primaryHeaderOptionLink="",this.primaryHeader="",this.primaryHeaderVariant="",this.errorMessageHidden=!1}_newListAccount(t){return(t?this.listAccount.slice(0,t):this.listAccount).sort(((t,e)=>e.amount-t.amount))}_setLinkHeader(t,e,a){return e&&e<t.length&&a?this.primaryHeaderOptionLink:""}render(){return f`
      <bbva-header-category
        class="gray-letter"
        .text=${this.primaryHeader}
        .variant=${$(this.primaryHeaderVariant)}
        .optionLink=${this._setLinkHeader(this.listAccount,this.maxItems,this.errorMessageHidden)}
        @header-category-link-click=${t=>{t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${Bt.is}-${this.primaryHeaderOptionLinkEvent}`,{bubbles:!0,composed:!0,detail:!0}))}}
      >
      </bbva-header-category>
      <bbva-notification-message
        style="margin:1rem"
        ?hidden=${this.errorMessageHidden}
        variant="error"
        message="loan-payment-account-error"
      >
      </bbva-notification-message>
      ${this.listAccount.length?this._newListAccount(this.maxItems).map((t=>f` <loan-account-item
              .class=${$(t.class)}
              .amount="${$(t.amount)}"
              ?disabled=${t.disabled}
              .numProduct=${$(t.numProduct)}
              .number=${$(t.number)}
              .cardTitle=${$(t.cardTitle)}
              .showDivider=${$(t.showDivider)}
              .contentText=${$(t.contentText)}
              .language=${$(t.language)}
              .visibleChars="${$(t.visibleChars)}"
              .currencyCode=${$(t.currencyCode)}
              .localCurrency=${$(t.localCurrency)}
            >
            </loan-account-item>`)):A}
    `}}customElements.define(Bt.is,Bt);class Nt extends(g(e)){static get is(){return"loan-payment-accounts-page"}static get scopedElements(){const t=[Bt,ot,It];return Nt.scopedElementsFromClasses(t)}static get styles(){return[Rt,v("loan-payment-accounts-page-shared-styles")]}static get properties(){return{accounts:{type:Array},headerMainEventRight:{type:String}}}constructor(){super(),this.accounts=[],this.headerMainEventRight="close"}render(){return f`
      <bbva-header-main
        variant="modal-three-level"
        icon-right-primary=${R()}
        text=loan-header-page-accounts
        @header-main-icon-right-primary-click=${t=>{t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${Nt.is}-${this.headerMainEventRight}`,{composed:!0,bubbles:!0,detail:!0}))}}
      >
      </bbva-header-main>
      <loan-list-account
        errorMessageHidden
        .listAccount=${$(this.accounts)}
      ></loan-list-account>

      <loan-button-group
        class="button-container"
        primaryButtonText="loan-button-close"
        primaryButtonEvent="close-accounts">
      </loan-button-group>
    `}}customElements.define(Nt.is,Nt);var qt=a`:host {
  display: block;
  box-sizing: border-box;
  height: 100vh;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.button-container {
  width: 100%;
  position: absolute;
  bottom: 0;
}
`,zt=a`:host {
  display: block;
  box-sizing: border-box;
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

.header-padding-bottom {
  padding-bottom: 1rem;
}

.extra-description {
  padding-top: 1rem;
}

.summary {
  --bbva-text-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-header-category-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --_header-category-heading-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
}
`,Ft=a`:host {
  display: block;
  box-sizing: border-box;
}
:host bbva-notification-message:not(:last-child) {
  margin: 0 1rem 1rem;
}
:host bbva-notification-message:last-child {
  margin: 0 1rem;
}
:host bbva-amount {
  font-weight: 500;
  margin-top: 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class jt extends(E(e)){static get is(){return"loan-message-list"}static get scopedElements(){const t=[S,H,k];return jt.scopedElementsFromClasses(t)}static get styles(){return[Ft,v("loan-message-list-shared-styles")]}static get properties(){return{messageList:{typeof:Array}}}constructor(){super(),this.messageList=[]}render(){return f`
    ${this.messageList.map((t=>f`
      <bbva-notification-message
       .variant=${t.variant}
       .messageTitle=${t.messageTitle}>
        <bbva-text alignment="center" text=${t.message} tag="span"></bbva-text>
        ${t.amountMessage?f`
          <bbva-amount
            variant="M"
            .amount=${$(t.amountMessage.amount)}
            .currencyCode=${$(t.amountMessage.currencyCode)}
            .localCurrency=${$(t.amountMessage.localCurrency)}
            .language=${$(t.amountMessage.language)}>
          </bbva-amount>
        `:A}
      </bbva-notification-message>
      `))}
    `}}customElements.define(jt.is,jt);class Vt extends(E(e)){static get scopedElements(){const t=[O,H,Tt,At,jt];return Vt.scopedElementsFromClasses(t)}static get is(){return"loan-payment-description"}static get styles(){return[zt,v("loan-payment-description-shared-styles")]}static get properties(){return{primaryHeader:{type:String},primaryHeaderClass:{type:String},primaryHeaderOptionLink:{type:String},primaryHeaderOptionLinkEvent:{type:String},primaryHeaderHasHelp:{type:Boolean},secondaryHeader:{type:String},listDescription:{type:Array},extraDescription:{type:String},primaryMessages:{type:Array},secondaryMessages:{type:Array}}}constructor(){super(),this.primaryHeader="",this.primaryHeaderClass="",this.primaryHeaderOptionLink="",this.primaryHeaderOptionLinkEvent="",this.primaryHeaderHasHelp=!1,this.secondaryHeader="",this.extraDescription="",this.listDescription=[],this.primaryMessages=[],this.secondaryMessages=[]}render(){return f`
    ${this.primaryHeader?f`<bbva-header-category
            class=${this.primaryHeaderClass}
            .text=${this.primaryHeader}
            .optionLink=${this.primaryHeaderOptionLink}
            ?has-help=${this.primaryHeaderHasHelp}
            @header-category-link-click=${t=>{t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${Vt.is}-${this.primaryHeaderOptionLinkEvent}`,{bubbles:!0,composed:!0,detail:!0}))}}>
          </bbva-header-category>`:A}

    ${this.primaryMessages.length?f`<loan-message-list id="primaryMessages" .messageList=${this.primaryMessages}></loan-message-list>`:A}

    ${this.extraDescription?f`<bbva-list-simple 
      class=${this.primaryMessages.length?"extra-description":""} label=${this.extraDescription}></bbva-list-simple>`:A}

    ${this.secondaryHeader?f`<bbva-header-category
            variant="product"
            text=${this.secondaryHeader}>
          </bbva-header-category>`:A}

    ${this.listDescription.length?f`<loan-repeat-list-simple
            .listItems=${this.listDescription}>
          </loan-repeat-list-simple>`:A}

    ${this.secondaryMessages.length?f`<loan-message-list class="extra-description" id="secondaryMessages" .messageList=${this.secondaryMessages}></loan-message-list>`:A}
    `}}customElements.define(Vt.is,Vt);class Ut extends(E(e)){static get scopedElements(){const t=[ot,Vt];return Ut.scopedElementsFromClasses(t)}static get is(){return"loan-payment-setlement-page"}static get styles(){return[qt,v("loan-payment-setlement-page-shared-styles")]}static get properties(){return{loanPaymentSetlementPageConfiguration:{type:Object}}}constructor(){super(),this.loanPaymentSetlementPageConfiguration={}}_sendListDescription(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${Ut.is}-list-description`,{bubbles:!0,composed:!0,detail:this.loanPaymentSetlementPageConfiguration.loanPaymentSummaryDescription})),this.dispatchEvent(new CustomEvent(`${Ut.is}-set-summary-payment-ticket`,{bubbles:!0,composed:!0,detail:this.loanPaymentSetlementPageConfiguration.loanPaymentSummaryTicket})),this._amortizationEvents()}_amortizationEvents(){this.dispatchEvent(new CustomEvent(`${Ut.is}-set-payment-amortization`,{bubbles:!0,composed:!0,detail:this.loanPaymentSetlementPageConfiguration.amortizationId})),this.dispatchEvent(new CustomEvent(`${Ut.is}-set-is-payment-installment`,{bubbles:!0,composed:!0,detail:this.loanPaymentSetlementPageConfiguration.isPaymentInstallment}))}render(){return f`
      <bbva-header-main
        variant="modal-three-level"
        icon-right-primary=${R()}
        .text=${this.loanPaymentSetlementPageConfiguration.headerMainText}
        @header-main-icon-right-primary-click=${t=>{var e;t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${Ut.is}-${null===(e=this.loanPaymentSetlementPageConfiguration)||void 0===e?void 0:e.headerMainEventRight}`,{composed:!0,bubbles:!0,detail:!0}))}}
      >
      </bbva-header-main>

      <loan-payment-description
        .primaryHeader=${$(this.loanPaymentSetlementPageConfiguration.loanPaymentDescription)}
        ?primaryHeaderHasHelp=${$(this.loanPaymentSetlementPageConfiguration.loanPaymentPrimaryHeaderHasHelp)}
        .secondaryHeader=${$(this.loanPaymentSetlementPageConfiguration.loanPaymentSecondaryDescription)}
        .listDescription=${$(this.loanPaymentSetlementPageConfiguration.loanPaymentListDescription)}
        .secondaryMessages=${$(this.loanPaymentSetlementPageConfiguration.loanPaymentSecondaryMessages)}
      >
      </loan-payment-description>

      <loan-button-group
        class="button-container"
        primaryButtonText="loan-button-continue"
        primaryButtonEvent="continue-setlement-page"
        secondaryButtonText="loan-button-other-payment"
        secondaryButtonEvent="close-setlement-page"
        @loan-button-group-continue-setlement-page=${this._sendListDescription}
      >
      </loan-button-group>
    `}}customElements.define(Ut.is,Ut);var Gt=a`:host {
  display: block;
  box-sizing: border-box;
  text-align: left;
  --bbva-text-color: var(--colorsSecondary600)
  bbva-text {
    color:var(--bbva-text-dark-mode-color, var(--bbva-text-color, var(--colorsSecondary600, #6666)))
  } ;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.defaultPadding {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
}
`;const Xt=new i;var Wt=a`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${n(o.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${n(o.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${n(o.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${n(o.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${n(o.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${n(o.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${n(o.secondary200)})));
  --skeleton-quote-bg: var(--bbva-notification-help-dark-mode-skeleton-bg, var(--bbva-notification-help-skeleton-bg, transparent));
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([hide-top-padding]) {
  padding-top: 0;
}

:host([hide-bottom-padding]) {
  padding-bottom: 0;
}

:host([hide-left-padding]) {
  padding-left: 0;
}

:host([hide-right-padding]) {
  padding-right: 0;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.accessible-hide {
  border: 0;
  clip: rect(0 0 0 0);
  height: 1px;
  margin: -1px;
  overflow: hidden;
  padding: 0;
  position: absolute;
  width: 1px;
}

[data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color);
  flex-shrink: 0;
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${n(L.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${n(M.type3XSmall)}));
  margin: 0;
}

:host(.alert) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-alert);
}
:host(.alert) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-alert);
}

:host(.success) [data-tag-name=bbva-icon] {
  color: var(--_notification-help-icon-color-success);
}
:host(.success) [data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color-success);
}

:host([loading]) {
  position: relative;
  top: 0;
  left: 0;
  display: inline-flex;
  width: 100%;
  pointer-events: none;
  background-repeat: no-repeat;
  will-change: transform;
  transform: opacity;
  animation: pulse 2s ease-in-out infinite;
  background-image: linear-gradient(var(--skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--skeleton-quote-color) 50%);
  background-color: var(--skeleton-quote-bg);
  background-size: 16px 16px, calc((80px * 2) + (16px/ 2)) 16px;
  background-position: 0 0, 20px 0;
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
${Xt.mediaRules()}`;var Kt=a`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new i).mediaRules()}`;const Jt=new i;const Yt={dark:a`
    ${a`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${n(o.primaryCoreLight)});
}
${Jt.mediaRules()}`}
  `,light:a`
    ${Kt}
  `};class Qt extends(g(y(u(e)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":z,"bbva-text":k}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,Wt,Yt.dark,Yt.light,v("bbva-notification-help-shared-styles")]}render(){return f`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}F("colors.primarySubduedLight"),F("colors.cool20"),F("colors.tertiaryType1Light"),F("colors.primaryCoreLightened"),F("colors.tertiaryType6Light"),F("colors.cool20"),F("colors.cool50");const Zt=new i;var te=a`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${n(o.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${n(o.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${n(o.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${n(L.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${Zt.mediaRules()}`;const ee=new i;var ae=a`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${n(o.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${n(o.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${n(o.primaryMediumLight)});
}
${ee.mediaRules()}`;var ie=a`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new i).mediaRules()}`;const ne={dark:a`
    ${ae}
    ${rt.dark}
    ${s.dark}
    ${Yt.dark}
    ${j.dark}
  `,light:a`
    ${ie}
    ${rt.light}
    ${s.light}
    ${Yt.light}
    ${j.light}
  `};class oe extends(g(y(V(e)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":lt,"bbva-notification-help":Qt,"bbva-text":k,"bbva-link":x}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=q(),this.errorIconSize=16,this.infoIcon=U(),this.infoIconSize=16,this.name=`form-radio-group-${((t=10)=>`${Math.random().toString(36).substr(2,t)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(t=>this._setRadioName(t)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(t){(((t||{}).detail||{}).contentSlots||[]).forEach((t=>{const e=(t||{}).assignedNodes;"bbva-form-radio-button"===(e.getAttribute("data-tag-name")||(e||{}).nodeName).toLowerCase()&&(e.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(t=>this._updateItems(t)))}updated(t){if(super.updated&&super.updated(t),t.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const t=this.radioItems.find((t=>t.checked));t&&(t.checked=!1)}t.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].disabled=this.disabled}))),t.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].invalid=this.invalid}))),t.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].readonly=this.readonly}))),t.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].required=!1})),this.radioItems[0].required=!0)}_updateItems(t){const e=this.radioItems.indexOf(t.target);this.selected=e,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:t.target.value,selected:e},bubbles:!0,composed:!0}))}_helpClicked(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?f`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${$(this.linkHref)}"
          icon="${G()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const t=this.t(this.labelOut);return f`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text="${this.required?t:`${t} ${this.t(this.optionalLabel)}`}"
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `}return""}static get styles(){return[te,v("bbva-form-radio-group-shared-styles"),ne.dark,ne.light]}render(){return f`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((t=>f`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${t.value}"
              label="${t.label}"
              divider="${$(t.divider)}"
              ?disabled="${t.disabled}"
              ?checked="${t.checked}"
              ?required="${t.required}"
              ?label-medium="${t.labelMedium}"
              .errorIcon="${this.errorIcon}"
              .errorIconSize="${this.errorIconSize}"
              .errorMessage="${t.invalid?t.errorMessage:""}"
              .infoIcon="${this.infoIcon}"
              .infoIconSize="${this.infoIconSize}"
              .infoMessage="${t.infoMessage}"
              accessibility-icon-info-notification="${$(t.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${$(t.accessibilityIconAlert)}"
              variant="${$(t.variant)}"
            >
              ${t.text?X(t.text):t.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?f`
            <bbva-notification-help
              class="alert"
              .icon="${this.errorIcon}"
              .iconSize="${this.errorIconSize}"
              .text="${this.errorMessage}"
              hide-top-padding
              hide-bottom-padding
              hide-left-padding
              hide-right-padding
            ></bbva-notification-help>
          `:""}
    `}}customElements.define(oe.is,oe);class se extends(E(y(e))){static get scopedElements(){const t=[H,k,O,oe];return se.scopedElementsFromClasses(t)}static get is(){return"loan-list-radio-buttons"}static get styles(){return[Gt,v("loan-list-radio-buttons-shared-styles")]}static get properties(){return{items:{type:Array},text:{type:String},headerText:{type:String}}}constructor(){super(),this.items=[],this.text="",this.headerText=""}_onChangeSelected(t){null==t||t.stopPropagation();const{value:e}=t.detail;this.dispatchEvent(new CustomEvent(`${se.is}-${e}`,{bubbles:!0,composed:!0,detail:!0}))}render(){return f`
      ${this.headerText?f`
      <bbva-header-category
            .text=${this.headerText}></bbva-header-category>
          </bbva-header-category>`:A}
      ${this.text?f`<bbva-text size="XS" class="defaultPadding" .text=${this.text}></bbva-text>`:A}

      <bbva-form-radio-group
        class="defaultPadding"
        selected
        .items=${this.items}
        @form-radio-group-item-change=${this._onChangeSelected}
      >
      </bbva-form-radio-group>
    `}}customElements.define(se.is,se);var re=a`:host {
  display: block;
  box-sizing: border-box;
  width: 100%;
  position: absolute;
}
:host bbva-text {
  margin: auto;
}

:host(.back-ground-white) {
  background-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
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

.center-item {
  display: table;
  margin: auto;
}
`;class le extends(E(e)){static get is(){return"loan-summary-payment-info"}static get scopedElements(){const t=[S,k,It];return le.scopedElementsFromClasses(t)}static get styles(){return[re,v("loan-summary-payment-info-shared-styles")]}static get properties(){return{paymentInfoText:{type:String},paymentCommisionText:{type:String},paymentAmonut:{type:Object},primaryButtonConfig:{type:Object},secondaryButtonConfig:{type:Object}}}constructor(){super(),this.paymentInfoText="loan-payment-panel-button-label",this.paymentCommisionText="loan-payment-ticket-commision",this.paymentAmonut={},this.primaryButtonConfig={},this.secondaryButtonConfig={}}render(){return f`
    <bbva-text 
      class="center-item" 
      .text=${this.paymentInfoText}>
    </bbva-text>
    
    <bbva-amount
      class="center-item"
      .variant=${$(this.paymentAmonut.variant)}
      .amount=${$(this.paymentAmonut.amount)}
      .currencyCode=${$(this.paymentAmonut.currencyCode)}
      .localCurrency=${$(this.paymentAmonut.localCurrency)}
      .language=${$(this.paymentAmonut.language)}>
    </bbva-amount>

    <bbva-text 
      class="center-item" 
      text=${this.paymentCommisionText}>
    </bbva-text>

    <loan-button-group
      
      .primaryButtonText=${$(this.primaryButtonConfig.text)}
      .primaryButtonEvent=${$(this.primaryButtonConfig.eventName)}
      .primaryButtonVariant=${$(this.primaryButtonConfig.variant)}
      ?primaryButtonDisabled=${$(this.primaryButtonConfig.disabled)}
      .secondaryButtonText=${$(this.secondaryButtonConfig.text)}
      .secondaryButtonEvent=${$(this.secondaryButtonConfig.eventName)}
      .secondaryButtonVariant=${$(this.secondaryButtonConfig.variant)}
      ?secondaryButtonDisabled=${$(this.secondaryButtonConfig.disabled)}>
    </loan-button-group>
    `}}customElements.define(le.is,le);var ce=a`:host {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  height: 100vh;
}
:host loan-summary-payment-info {
  position: relative;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.button-container {
  width: 100%;
}
`;class de extends(E(y(e))){static get scopedElements(){const t=[se,le,ot];return de.scopedElementsFromClasses(t)}static get is(){return"loan-radio-buttons-page"}static get styles(){return[ce,v("loan-radio-buttons-page-shared-styles")]}static get properties(){return{loanPaymentRadioButtonsConfiguration:{type:Object}}}constructor(){super(),this.loanPaymentRadioButtonsConfiguration={},this._amortizationId="INSTALLMENT_AMOUNT_REDUCTION"}_formatAmount(t){return{variant:"4xl",amount:t.amount??0,currencyCode:t.currencyCode,localCurrency:t.localCurrency,language:t.language}}_continueHomePage(t){t.stopPropagation(),this._setAmortizationId(),this.dispatchEvent(new CustomEvent(`${de.is}-request-simulate-amortization`,{bubbles:!0,composed:!0,detail:!0})),this.dispatchEvent(new CustomEvent(`${de.is}-set-summary-payment-ticket`,{bubbles:!0,composed:!0,detail:this.loanPaymentRadioButtonsConfiguration.loanPaymentSummaryTicket}))}_cuotaAmoirtizationId(t){t.stopPropagation(),this._amortizationId="INSTALLMENT_AMOUNT_REDUCTION"}_plazoAmoirtizationId(t){t.stopPropagation(),this._amortizationId="INSTALLMENTS_NUMBER_REDUCTION"}_setAmortizationId(){this.dispatchEvent(new CustomEvent(`${de.is}-set-amortization-id`,{bubbles:!0,composed:!0,detail:this._amortizationId}))}render(){return f`
      <div>
        <bbva-header-main
          variant="modal-three-level"
          icon-right-primary=${R()}
          text="loan-payment-multistep-options-second-title"
          @header-main-icon-right-primary-click=${t=>{t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${de.is}-${this.loanPaymentRadioButtonsConfiguration.headerMainEventRight}`,{composed:!0,bubbles:!0,detail:!0}))}}
        >
        </bbva-header-main>
        <loan-list-radio-buttons
          text="loan-payment-options-reduction-type"
          headerText="loan-payment-reduction-type"
          .items=${[{value:"payment-plazo",labelMedium:!0,text:'<bbva-text tag="span" font-weight="500" text="loan-payment-reduction-plaze"></bbva-text> <bbva-text slot="description" size="XS" variant="product" text-color="#666666" text="loan-payment-reduction-type-term-reduction"></bbva-text>'},{value:"payment-cuota",text:'<bbva-text tag="span" font-weight="500" text="loan-payment-quota-reduction"></bbva-text> <bbva-text slot="description" size="XS" text-color="#666666" text="loan-payment-reduction-type-info-message"></bbva-text>',labelMedium:!0,checked:!0}]}
          @loan-list-radio-buttons-payment-plazo=${this._plazoAmoirtizationId}
          @loan-list-radio-buttons-payment-cuota=${this._cuotaAmoirtizationId}
        ></loan-list-radio-buttons>
      </div>
      <loan-summary-payment-info
        class="button-container"
        .paymentAmonut=${this._formatAmount(this.loanPaymentRadioButtonsConfiguration)}
        primaryButtonConfig='{"text": "loan-button-continue", "eventName": "continue-home-page", "variant": ""}'
        secondaryButtonConfig='{"text": "loan-payment-change-amount", "eventName": "change-amount"}'
        @loan-button-group-continue-home-page=${this._continueHomePage}
      >
      </loan-summary-payment-info>
    `}}customElements.define(de.is,de);var he=a`:host {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  height: 100vh;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.button-container {
  margin-top: 1rem;
  width: 100%;
}
`;class me extends(E(y(e))){static get scopedElements(){const t=[ot,Vt,It];return me.scopedElementsFromClasses(t)}static get is(){return"loan-other-amount-detail-page"}static get styles(){return[he,v("loan-other-amount-detail-page-shared-styles")]}static get properties(){return{loanPaymentOtherAmountDetailConfiguration:{type:Object}}}constructor(){super(),this.loanPaymentOtherAmountDetailConfiguration={}}_sendEvents(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${me.is}-list-description`,{bubbles:!0,composed:!0,detail:this.loanPaymentOtherAmountDetailConfiguration.loanPaymentSummaryDescription})),this._installmentEvents()}_installmentEvents(){this.dispatchEvent(new CustomEvent(`${me.is}-set-installment-mode`,{bubbles:!0,composed:!0,detail:this.loanPaymentOtherAmountDetailConfiguration.modeId})),this.dispatchEvent(new CustomEvent(`${me.is}-set-is-payment-installment`,{bubbles:!0,composed:!0,detail:this.loanPaymentOtherAmountDetailConfiguration.isPaymentInstallment})),this.dispatchEvent(new CustomEvent(`${me.is}-set-summary-payment-ticket`,{bubbles:!0,composed:!0,detail:this.loanPaymentOtherAmountDetailConfiguration.loanPaymentSummaryTicket}))}render(){return f`
      <div>
        <bbva-header-main
          variant="modal-three-level"
          icon-right-primary=${R()}
          text="loan-payment-multistep-options-second-title"
          @header-main-icon-right-primary-click=${t=>{t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${me.is}-${this.loanPaymentOtherAmountDetailConfiguration.headerMainEventRight}`,{composed:!0,bubbles:!0,detail:!0}))}}
        >
        </bbva-header-main>
        <loan-payment-description
          .primaryHeader=${$(this.loanPaymentOtherAmountDetailConfiguration.loanPaymentDescription)}
          ?primaryHeaderHasHelp=${$(this.loanPaymentOtherAmountDetailConfiguration.loanPaymentPrimaryHeaderHasHelp)}
          .secondaryHeader=${$(this.loanPaymentOtherAmountDetailConfiguration.loanPaymentSecondaryDescription)}
          .listDescription=${$(this.loanPaymentOtherAmountDetailConfiguration.loanPaymentListDescription)}
          .secondaryMessages=${$(this.loanPaymentOtherAmountDetailConfiguration.loanPaymentSecondaryMessages)}
        >
        </loan-payment-description>
      </div>
      <loan-button-group
        class="button-container"
        primaryButtonText="loan-button-continue"
        .primaryButtonEvent=${$(this.loanPaymentOtherAmountDetailConfiguration.primaryButtonEvent)}
        secondaryButtonText="loan-button-change-amount-entered"
        secondaryButtonEvent="close-detail-other-amount"
        @loan-button-group-other-amount-detail=${this._sendEvents}
      >
      </loan-button-group>
    `}}customElements.define(me.is,me);var pe=a`:host {
  display: block;
  box-sizing: border-box;
  height: 100vh;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.button-container {
  width: 100%;
  position: absolute;
  bottom: 0;
}
`;class ue extends(E(e)){static get scopedElements(){const t=[ot,Vt];return ue.scopedElementsFromClasses(t)}static get is(){return"loan-payment-detail-page"}static get styles(){return[pe,v("loan-payment-detail-page-shared-styles")]}static get properties(){return{loanPaymentDetailPageConfiguration:{type:Object}}}constructor(){super(),this.loanPaymentDetailPageConfiguration={}}render(){return f`
      <bbva-header-main
        variant="modal-three-level"
        icon-right-primary=${R()}
        .text=${this.loanPaymentDetailPageConfiguration.headerMainText}
        @header-main-icon-right-primary-click=${t=>{t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${ue.is}-${this.loanPaymentDetailPageConfiguration.headerMainEventRight}`,{composed:!0,bubbles:!0,detail:!0}))}}
      >
      </bbva-header-main>

 
      <loan-payment-description
        .primaryHeader=${$(this.loanPaymentDetailPageConfiguration.loanPaymentDescription)}
        .primaryHeaderOptionLink=${$(this.loanPaymentDetailPageConfiguration.primaryHeaderOptionLink)}
        ?primaryHeaderHasHelp=${$(this.loanPaymentDetailPageConfiguration.loanPaymentPrimaryHeaderHasHelp)}
        .secondaryHeader=${$(this.loanPaymentDetailPageConfiguration.loanPaymentSecondaryDescription)}
        .listDescription=${$(this.loanPaymentDetailPageConfiguration.loanPaymentListDescription)}
        .secondaryMessages=${$(this.loanPaymentDetailPageConfiguration.loanPaymentSecondaryMessages)}
      >
      </loan-payment-description>
      

      <loan-button-group
        class="button-container"
        primaryButtonText="loan-button-close"
        primaryButtonEvent="close-loan-payment-detail-pages">
      </loan-button-group>
    `}}customElements.define(ue.is,ue);var ge=a`:host {
  display: block;
  box-sizing: border-box;
  height: 100vh;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.button-container {
  width: 100%;
  position: absolute;
  bottom: 0;
}
`;class ye extends(E(e)){static get scopedElements(){const t=[ot,Vt];return ye.scopedElementsFromClasses(t)}static get is(){return"loan-payment-recipt-amount-page"}static get styles(){return[ge,v("loan-payment-recipt-amount-page-shared-styles")]}static get properties(){return{loanPaymentReciptAmountPageConfiguration:{type:Object}}}constructor(){super(),this.loanPaymentReciptAmountPageConfiguration={}}_sendEvents(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${ye.is}-list-description`,{bubbles:!0,composed:!0,detail:this.loanPaymentReciptAmountPageConfiguration.loanPaymentSummaryDescription})),this.dispatchEvent(new CustomEvent(`${ye.is}-set-summary-payment-ticket`,{bubbles:!0,composed:!0,detail:this.loanPaymentReciptAmountPageConfiguration.loanPaymentSummaryTicket})),this._installmentEvents()}_installmentEvents(){this.dispatchEvent(new CustomEvent(`${ye.is}-set-installment-mode`,{bubbles:!0,composed:!0,detail:this.loanPaymentReciptAmountPageConfiguration.modeId})),this.dispatchEvent(new CustomEvent(`${ye.is}-set-is-payment-installment`,{bubbles:!0,composed:!0,detail:this.loanPaymentReciptAmountPageConfiguration.isPaymentInstallment}))}render(){return f`
      <bbva-header-main
        variant="modal-three-level"
        icon-right-primary=${R()}
        .text=${this.loanPaymentReciptAmountPageConfiguration.headerMainText}
        @header-main-icon-right-primary-click=${t=>{t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${ye.is}-${this.loanPaymentReciptAmountPageConfiguration.headerMainEventRight}`,{composed:!0,bubbles:!0,detail:!0}))}}
      >
      </bbva-header-main>

      <loan-payment-description
        .primaryHeader=${$(this.loanPaymentReciptAmountPageConfiguration.loanPaymentDescription)}
        .primaryHeaderOptionLink=${$(this.loanPaymentReciptAmountPageConfiguration.primaryHeaderOptionLink)}
        .primaryHeaderOptionLinkEvent=${$(this.loanPaymentReciptAmountPageConfiguration.primaryHeaderOptionLinkEvent)}
        ?primaryHeaderHasHelp=${$(this.loanPaymentReciptAmountPageConfiguration.loanPaymentPrimaryHeaderHasHelp)}
        .secondaryHeader=${$(this.loanPaymentReciptAmountPageConfiguration.loanPaymentSecondaryDescription)}
        .listDescription=${$(this.loanPaymentReciptAmountPageConfiguration.loanPaymentListDescription)}
        .secondaryMessages=${$(this.loanPaymentReciptAmountPageConfiguration.loanPaymentSecondaryMessages)}>
      </loan-payment-description>

      <loan-button-group
        class="button-container"
        primaryButtonText="loan-button-continue"
        primaryButtonEvent="continue-recipt-amount-page"
        secondaryButtonText="loan-button-other-payment"
        secondaryButtonEvent="close-recipt-amount-page"
        @loan-button-group-continue-recipt-amount-page=${this._sendEvents}
      >
      </loan-button-group>
    `}}customElements.define(ye.is,ye);var be=a`:host {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  box-sizing: border-box;
  height: 100vh;
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

.button-container {
  width: 100%;
}
`,ve=a`:host {
  display: block;
  box-sizing: border-box;
}
:host bbva-form-amount {
  text-align: left;
  margin-bottom: 1rem;
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

.center-item {
  display: table;
  margin: 0 auto 0.9375rem auto;
}

.defaultPadding {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
}
`;class fe extends(E(y(e))){static get is(){return"loan-amount-input"}static get scopedElements(){const t=[k,ct];return fe.scopedElementsFromClasses(t)}static get styles(){return[ve,v("loan-amount-input-shared-styles")]}static get properties(){return{maxAmount:{type:Number},localCurrency:{type:String},textPayment:{type:String},infoMessage:{type:String},errorMessage:{type:String},currencyCode:{type:String},belowCeroErrorMessage:{type:String},label:{type:String},_invalidAmount:{type:Boolean}}}constructor(){super(),this.maxAmount=0,this.currencyCode="",this.localCurrency="",this.textPayment="",this.errorMessage="",this.belowCeroErrorMessage="",this.infoMessage="",this.label="",this._amount=0,this._invalidAmount=!1,this._isNotFirstValidation=!1}_inputChanged(t){t.stopPropagation();const{detail:{value:e}}=t;this._setPropertiesInput(e),this.dispatchEvent(new CustomEvent(`${fe.is}-changed`,{detail:{amount:this._amount,invalid:this._invalidAmount},bubbles:!0,composed:!0}))}_setPropertiesInput(t){this._amount=Number(t.replaceAll(",","")),this._invalidAmount=!!this._isNotFirstValidation&&(!this._amount||this.maxAmount>0&&this._amount>this.maxAmount),this._isNotFirstValidation=!0,this._loanInput.currencyCode=0===this._amount?"":this.currencyCode,this.requestUpdate()}_setErrorMessage(t,e,a){return t?e:a}_setInfoMessage(t,e){return e?"":t}reset(){this.maxAmount=0,this.localCurrency="",this.textPayment="",this.errorMessage="",this.belowCeroErrorMessage="",this.infoMessage="",this.label="",this._amount=0,this._invalidAmount=!1,this._isNotFirstValidation=!1}resetInput(){this._amount=0,this._invalidAmount=!1,this._isNotFirstValidation=!1,this._loanInput.clearInput(),this.requestUpdate()}get _loanInput(){return this._loanFormAmount||(this._loanFormAmount=this.shadowRoot.querySelector('[data-tag-name="bbva-form-amount"]')),this._loanFormAmount}render(){return f`
      <bbva-text .text="${this.textPayment}" size="XS" class="defaultPadding"> </bbva-text>
      <bbva-form-amount
        class="defaultPadding"
        .label=${this.label}
        currencyCode=""
        .localCurrency=${this.localCurrency}
        .language=${this.language}
        ?invalid=${this._invalidAmount}
        inputmode="decimal"
        .errorMessage=${this._setErrorMessage(this._amount,this.errorMessage,this.belowCeroErrorMessage)}
        .infoMessage=${this._setInfoMessage(this.infoMessage,this._invalidAmount)}
        @form-amount-input-change=${this._inputChanged}
      >
      </bbva-form-amount>
    `}}customElements.define(fe.is,fe);class _e extends(E(e)){static get scopedElements(){const t=[ot,Vt,It,fe];return _e.scopedElementsFromClasses(t)}static get is(){return"loan-payment-other-amount-form"}static get styles(){return[be,v("loan-payment-other-amount-form-shared-styles")]}static get properties(){return{loanPaymentOtherAmountConfiguration:{type:Object}}}constructor(){super(),this.loanPaymentOtherAmountConfiguration={},this._isEnabled=!1}_disabledButton(t){const{amount:e,invalid:a}=t.detail;this._isEnabled=!(e>0)||a,this._amount=e,this.requestUpdate()}_handlerContinue(t){this._handlerAmount(),this._handlerPage()}_handlerPage(){this.dispatchEvent(new CustomEvent(`${_e.is}-${this.loanPaymentOtherAmountConfiguration.primaryButtonEvent}`,{bubbles:!0,composed:!0,detail:!0}))}_handlerAmount(){this.dispatchEvent(new CustomEvent(`${_e.is}-amount`,{bubbles:!0,composed:!0,detail:this._amount}))}get _loanInput(){return this._loanInputElement||(this._loanInputElement=this.shadowRoot.querySelector("loan-amount-input")),this._loanInputElement}_resetInputForm(){this._loanInput.resetInput()}connectedCallback(){super.connectedCallback(),this.addEventListener(`${_e.is}-close-loan-payment-other-amount-page`,this._resetInputForm)}disconnectedCallback(){super.disconnectedCallback(),this.removeEventListener(`${_e.is}-close-loan-payment-other-amount-page`,this._resetInputForm)}_leaveAnotherAmount(){this._loanInput.resetInput(),this.dispatchEvent(new CustomEvent(`${_e.is}-close-loan-payment-other-amount-page`,{bubbles:!0,composed:!0,detail:!0}))}render(){var t,e,a,i,n,o,s,r,l,c,d,h,m,p,u,g,y,b,v,_,C,S,x,P;return f`
      <div>
        <bbva-header-main
          variant="modal-three-level"
          icon-right-primary=${R()}
          .text=${this.loanPaymentOtherAmountConfiguration.headerMainText}
          @header-main-icon-right-primary-click=${t=>{t.stopPropagation(),this.dispatchEvent(new CustomEvent(`${_e.is}-${this.loanPaymentOtherAmountConfiguration.headerMainEventRight}`,{composed:!0,bubbles:!0,detail:!0}))}}
        >
        </bbva-header-main>

        <loan-payment-description
          .primaryHeader=${$(this.loanPaymentOtherAmountConfiguration.loanPaymentDescription)}
          ?primaryHeaderHasHelp=${$(null===(t=this.loanPaymentOtherAmountConfiguration)||void 0===t?void 0:t.loanPaymentPrimaryHeaderHasHelp)}
          .secondaryHeader=${$(null===(e=this.loanPaymentOtherAmountConfiguration)||void 0===e?void 0:e.loanPaymentSecondaryDescription)}
          .listDescription=${$(null===(a=this.loanPaymentOtherAmountConfiguration)||void 0===a?void 0:a.loanPaymentListDescription)}
          .secondaryMessages=${$(null===(i=this.loanPaymentOtherAmountConfiguration)||void 0===i?void 0:i.loanPaymentSecondaryMessages)}
          .primaryMessages=${$(null===(n=this.loanPaymentOtherAmountConfiguration)||void 0===n?void 0:n.loanPaymentPrimaryMessages)}
          .extraDescription=${$(null===(o=this.loanPaymentOtherAmountConfiguration)||void 0===o?void 0:o.loanPaymentExtraDescription)}
        >
        </loan-payment-description>
        <loan-amount-input
          @loan-amount-input-changed=${this._disabledButton}
          .errorMessage=${$(null===(s=this.loanPaymentOtherAmountConfiguration)||void 0===s||null===(r=s.loanPaymentInputConfiguration)||void 0===r?void 0:r.errorMessage)}
          .belowCeroErrorMessage=${$(null===(l=this.loanPaymentOtherAmountConfiguration)||void 0===l||null===(c=l.loanPaymentInputConfiguration)||void 0===c?void 0:c.belowCeroErrorMessage)}
          .textPayment=${$(null===(d=this.loanPaymentOtherAmountConfiguration)||void 0===d||null===(h=d.loanPaymentInputConfiguration)||void 0===h?void 0:h.textPayment)}
          .language=${$(null===(m=this.loanPaymentOtherAmountConfiguration)||void 0===m||null===(p=m.loanPaymentInputConfiguration)||void 0===p?void 0:p.language)}
          .localCurrency=${$(null===(u=this.loanPaymentOtherAmountConfiguration)||void 0===u||null===(g=u.loanPaymentInputConfiguration)||void 0===g?void 0:g.localCurrency)}
          .currencyCode=${$(null===(y=this.loanPaymentOtherAmountConfiguration)||void 0===y||null===(b=y.loanPaymentInputConfiguration)||void 0===b?void 0:b.currencyCode)}
          .label=${$(null===(v=this.loanPaymentOtherAmountConfiguration)||void 0===v||null===(_=v.loanPaymentInputConfiguration)||void 0===_?void 0:_.label)}
          .maxAmount=${$(null===(C=this.loanPaymentOtherAmountConfiguration)||void 0===C||null===(S=C.loanPaymentInputConfiguration)||void 0===S?void 0:S.maxAmount)}
          .infoMessage=${$(null===(x=this.loanPaymentOtherAmountConfiguration)||void 0===x||null===(P=x.loanPaymentInputConfiguration)||void 0===P?void 0:P.infoMessage)}
        ></loan-amount-input>
      </div>

      <loan-button-group
        @loan-button-group-continue=${this._handlerContinue}
        class="button-container"
        primaryButtonText="loan-button-calculate"
        ?primaryButtonDisabled="${this._isEnabled}"
        primaryButtonEvent="continue"
        secondaryButtonEvent="leave"
        secondaryButtonText="loan-button-other-payment"
        @loan-button-group-leave=${this._leaveAnotherAmount}
      >
      </loan-button-group>
    `}}customElements.define(_e.is,_e);var Ce=a`:host .displayFix {
  display: contents;
}
:host .displayFix loan-payment-options {
  min-height: auto !important;
}
:host .displayFix loan-summary-view {
  min-height: auto !important;
}

.full-width {
  width: 100%;
  padding: 1.5rem 0;
  border: 0;
}
`,$e=a`:host {
  display: block;
  box-sizing: border-box;
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
}
:host loan-repeat-list-simple {
  padding-bottom: 0.5rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class Se extends(E(e)){static get is(){return"loan-summary-view"}static get scopedElements(){const t=[W,At];return Se.scopedElementsFromClasses(t)}static get styles(){return[$e,v("loan-summary-view-shared-styles")]}static get properties(){return{summaryHeader:{type:String,attribute:"summary-header"},summaryViewLavel:{type:String,attribute:"summary-view-lavel"},summaryElements:{type:Array},completed:{type:Boolean}}}constructor(){super(),this.summaryElements=[],this.summaryHeader="",this.summaryViewLavel="",this.completed=!1}firstUpdated(){this.completed=!0}render(){return f`
      <bbva-expandable-step
        id="summaryLoan"
        .header=${this.summaryHeader}
        .viewLabel=${this.summaryViewLavel}
        prefilled
        ?completed="${this.completed}"
        hide-padding-top
        hide-padding-left
        hide-padding-right
        hide-padding-bottom
      >
        <loan-repeat-list-simple slot="summary" .listItems=${this.summaryElements}>
        </loan-repeat-list-simple>
      </bbva-expandable-step>
    `}}customElements.define(Se.is,Se);var xe=a`*,
*:before,
*:after {
  box-sizing: inherit;
}

:host {
  --_message-icon-color: var(
    --bbva-form-field-message-icon-dark-mode-color,
    var(--bbva-form-field-message-icon-color, var(--colorsTertiaryType1Dark, ${n(o.tertiaryType1Dark)}))
  );
  display: block;
  box-sizing: border-box;
  text-align: left;
  --bbva-list-link-description-color: var(--colorsSecondary600, ${n(o.secondary600)});
}
:host bbva-notification-message {
  margin: 1rem 1rem 0;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

:host([active]:not(:first-of-type)) ::before {
  visibility: visible;
  transform: scaleY(1);
}

.colorIcon {
  --_help-modal-title-icon-color: var(
    --bbva-help-modal-dark-mode-title-icon-color,
    var(--bbva-help-modal-title-icon-color, var(--colorsTertiaryType3Dark, ${n(o.tertiaryType3Dark)}))
  );
}

.message {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  font-size: var(--bbva-loan-payment-message-font-size, var(--typographyType3XSmall, ${n(L.type3XSmall)}));
  line-height: var(--bbva-loan-payment-message-line-height, var(--lineHeightType3XSmall, ${n(M.type3XSmall)}));
}
.message-icon {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
  color: var(--_message-icon-color);
  min-width: 1rem;
  min-height: 1rem;
}

.padding-left-16 {
  padding-left: 1rem;
}

.paddin-right-16 {
  padding-right: 1rem;
}

.padding-bottom-8 {
  padding-bottom: 0.5rem;
}

.summary {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-text-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-header-category-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-card-num-product-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-card-description-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-card-heading-no-link-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-card-description-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-header-category-heading-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
}
`;class Pe extends(nt(E(y(e)))){static get is(){return"loan-payment-options"}static get scopedElements(){const t=[W,dt,Tt,O,k,H,Vt,It];return Pe.scopedElementsFromClasses(t)}static get styles(){return[xe,v("loan-payment-options-shared-styles")]}static get properties(){return{currentStep:{type:String},maxSteps:{type:String},headerStep:{type:String},paymentOptions:{type:Array},useBbvaListLink:{type:Boolean},showModalOnReset:{type:Boolean},active:{type:Boolean,reflect:!0},disabled:{type:Boolean,reflect:!0},completed:{type:Boolean},hasBeenSelected:{type:Boolean},_paymentOptionSelectedText:{type:String},paymentOptionDescriptionSelected:{type:Array},showMessage:{type:Boolean}}}constructor(){super(),this.paymentOptionDescriptionSelected=[],this.currentStep="",this.showMessage=!1,this.maxSteps="",this.headerStep="",this.paymentOptions=[],this.useBbvaListLink=!1,this.disabled=!1,this.active=!1,this.completed=!1,this.hasBeenSelected=!1,this._paymentOptionSelectedText=""}get _renderPaymentTypeList(){return f`
      <bbva-text
        class="padding-left-16 paddin-right-16 padding-bottom-8"
        size="XS"
        tag="span"
        text="loan-payment-multistep-header-subtitle"
      ></bbva-text>
      <bbva-aggregation-link-list
        aria-disabled="true"
        tabindex="-1"
        ?useBbvaListLink="${this.useBbvaListLink}"
        .linkList=${this.paymentOptions}
        @aggregation-link-list-click=${this._selectPaymentType}
      >
      </bbva-aggregation-link-list>
      ${this.showMessage?f`
            <bbva-notification-message message="loan-payment-options-notification-message">
            </bbva-notification-message>
          `:A}
    `}_changePaymentOptionProperties(t,e){return t.map((t=>{try{const a=t.class.replace("summary ","");t.class=e?"summary "+a:a}catch(a){t.class=e?"summary ":""}return t}))}get _renderChangePaymentOption(){return f`
      <loan-payment-description
        class="padding-bottom-8"
        secondaryHeader=${this._paymentOptionSelectedText}
        .listDescription=${$(this._changePaymentOptionProperties(this.paymentOptionDescriptionSelected,this.completed))}
      >
      </loan-payment-description>
      <loan-button-group
        primaryButtonText="loan-button-change-payment-type"
        primaryButtonEvent="confirm-change-home"
        secondaryButtonText="loan-payment-keep-selection-continue"
        secondaryButtonEvent="wont-change"
      >
      </loan-button-group>
    `}get _renderSumaryPaymentOption(){return f`
      <div slot="summary">
        <loan-payment-description
          primaryHeaderClass="summary"
          primaryHeader=${this._paymentOptionSelectedText}
          .listDescription=${$(this._changePaymentOptionProperties(this.paymentOptionDescriptionSelected,this.completed))}
        >
        </loan-payment-description>
      </div>
    `}_selectPaymentType(t){t.stopPropagation(),this._paymentOptionSelectedText=t.detail.label;const e=t.detail.eventText;this.dispatchEvent(new CustomEvent(`${Pe.is}-${e}`,{bubbles:!0,composed:!0,detail:e}))}render(){return f`
      <bbva-expandable-step
        ?active=${$(this.active)}
        header=${$(this.headerStep)}
        class="${$(this.classList)}"
        step=${Number(this.currentStep)}
        total-steps=${Number(this.maxSteps)}
        ?completed="${$(this.completed)}"
        ?disabled=${$(this.disabled)}
        disabled-target="[data-tag-name='loan-payment-options']"
        disabled-target-attr="[data-tag-name='loan-payment-options']"
        hidden-continue-button
        hide-padding-left
        hide-padding-right
      >
        ${this.hasBeenSelected&&!this.completed?this._renderChangePaymentOption:A}
        ${this.hasBeenSelected||this.completed?A:this._renderPaymentTypeList}
        ${this.hasBeenSelected&&this.completed?this._renderSumaryPaymentOption:A}
      </bbva-expandable-step>
    `}}customElements.define(Pe.is,Pe);var ke=a`*,
*:before,
*:after {
  box-sizing: inherit;
}

:host {
  display: block;
  box-sizing: border-box;
  text-align: left;
}
:host bbva-notification-message {
  margin: 1rem 1rem 0;
}

.near-summary {
  margin-top: -1.5rem;
}

:host([active]) ::before {
  visibility: visible;
  transform: scaleY(1);
}

:host(.hide-when-disabled[disabled]) {
  display: none;
}

.padding-bottom-8 {
  padding-bottom: 0.5rem;
}

.summary {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-amount-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-text-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-header-category-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-card-num-product-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-card-description-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-card-heading-no-link-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-list-card-description-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
  --bbva-header-category-heading-color: var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)});
}

.button-container {
  width: 100%;
  position: absolute;
  bottom: 0;
}
`,Te=a`:host > [data-tag-name=bbva-notification-message] {
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem);
}
`;class Ee extends(nt(E(y(e)))){static get is(){return"loan-notification-error"}static get properties(){return{_count:{type:Number},_description:{type:String},_linkText:{type:String}}}static get scopedElements(){const t=[H];return Ee.scopedElementsFromClasses(t)}constructor(){super(),this._count=0,this._linkText="loan-payment-you-repeat",this._description="loan-payment-try-again"}static get styles(){return[Te,v("loan")]}retry(){const t=this._count>=2,e=t?"call-bbva":"retry";this._description=t?"loan-payment-notification-error":this._description,this._linkText=t?"loan-payment-call":this._linkText,this.dispatchEvent(new CustomEvent(`${Ee.is}-${e}`,{bubbles:!0,composed:!0,detail:!0})),this._count+=1,this.requestUpdate()}reset(){this._count=0,this._linkText=this.t("loan-payment-you-repeat"),this._description=this.t("loan-payment-try-again")}render(){return f`
      <bbva-notification-message
        variant="error"
        icon="${q()}"
        .description=${this._description}
        .linkTitle=${this._linkText}
        @notification-message-link-click=${this.retry}
      >
      </bbva-notification-message>
    `}}customElements.define(Ee.is,Ee);class Ae extends(nt(E(y(e)))){static get is(){return"loan-payment-account"}static get scopedElements(){const t=[W,O,k,It,Ee,Bt,Ht];return Ae.scopedElementsFromClasses(t)}static get properties(){return{currentStep:{type:String},maxSteps:{type:String},headerStep:{type:String},accounts:{type:Array},active:{type:Boolean,reflect:!0},hasBeenSelected:{type:Boolean},accountSelected:{type:Object},disabled:{type:Boolean,reflect:!0},completed:{type:Boolean,reflect:!0},showMessage:{type:Boolean},errorAccounts:{type:Boolean}}}constructor(){super(),this.currentStep="",this.summaryCard=!1,this.maxSteps="",this.headerStep="",this.disabled=!1,this.active=!1,this.completed=!1,this.hasBeenSelected=!1,this.accountSelected={},this.showMessage=!1,this.errorAccounts=!1,this.accounts=[]}static get styles(){return[ke,v("loan-payment-account-shared-styles")]}_shoudHiddenErrorMessage(t){return!t.every((t=>t.disabled))}_setAccountSelected(t){this.accountSelected=t.detail,this.dispatchEvent(new CustomEvent(`${Ae.is}-selected`,{bubbles:!0,composed:!0,detail:this.accountSelected.number})),this.dispatchEvent(new CustomEvent(`${Ae.is}-selected-card-title`,{bubbles:!0,composed:!0,detail:this.accountSelected.cardTitle})),this.requestUpdate()}get _renderPaymentTypeList(){return f`
      <loan-list-account
        class="padding-bottom-8"
        primaryHeader="loan-header-page-accounts"
        primaryHeaderVariant="product"
        .errorMessageHidden=${this._shoudHiddenErrorMessage(this.accounts)}
        primaryHeaderOptionLink="loan-payment-see-all"
        primaryHeaderOptionLinkEvent="go-accounts-page"
        maxItems="3"
        .listAccount=${$(this.accounts)}
        @loan-account-item-selected=${this._setAccountSelected}
      ></loan-list-account>
      ${1!==this.accounts.length||this.accounts[0].disabled?A:f`<loan-button-group
            primaryButtonText="loan-button-continue"
            primaryButtonEvent="one-account"
            @loan-button-group-one-account=${()=>this._setAccountSelected({detail:this.accounts[0]})}
          ></loan-button-group>`}
    `}get _renderChangePaymentAccount(){return f`
      <loan-account-item
        noLink
        .amount="${$(this.accountSelected.amount)}"
        ?disabled="${$(this.accountSelected.disabled)}"
        .numProduct=${$(this.accountSelected.numProduct)}
        .number=${$(this.accountSelected.number)}
        .cardTitle=${$(this.accountSelected.cardTitle)}
        .showDivider=${$(this.accountSelected.showDivider)}
        .contentText=${$(this.accountSelected.contentText)}
        .language=${$(this.accountSelected.language)}
        .visibleChars=${$(this.accountSelected.visibleChars)}
        .currencyCode=${$(this.accountSelected.currencyCode)}
        .localCurrency=${$(this.accountSelected.localCurrency)}
      >
      </loan-account-item>
      <loan-button-group
        primaryButtonText="loan-payment-change-change-retirement-account"
        primaryButtonEvent="will-change"
        secondaryButtonText="loan-payment-keep-selection-continue"
        secondaryButtonEvent="wont-change"
      >
      </loan-button-group>
    `}get _renderSumaryPaymentAccount(){return f`
      <div slot="summary" class="near-summary">
        <loan-account-item
          noLink
          class="summary"
          .amount="${$(this.accountSelected.amount)}"
          ?disabled="${$(this.accountSelected.disabled)}"
          .numProduct=${$(this.accountSelected.numProduct)}
          .number=${$(this.accountSelected.number)}
          .cardTitle=${$(this.accountSelected.cardTitle)}
          .showDivider=${$(this.accountSelected.showDivider)}
          .contentText=${$(this.accountSelected.contentText)}
          .language=${$(this.accountSelected.language)}
          .visibleChars="${$(this.accountSelected.visibleChars)}"
          .currencyCode=${$(this.accountSelected.currencyCode)}
          .localCurrency=${$(this.accountSelected.localCurrency)}
        >
        </loan-account-item>
      </div>
    `}get _renderErrorAccounts(){return f`
      <bbva-header-category
        text="loan-header-page-accounts"
        variant="product"
      ></bbva-header-category>
      <loan-notification-error> </loan-notification-error>
    `}get _renderSuccesAccounts(){return f`
      ${this.hasBeenSelected&&!this.completed?this._renderChangePaymentAccount:A}
      ${this.hasBeenSelected||this.completed?A:this._renderPaymentTypeList}
      ${this.hasBeenSelected&&this.completed?this._renderSumaryPaymentAccount:A}
    `}render(){return f`
      <bbva-expandable-step
        ?active=${$(this.active)}
        header=${$(this.headerStep)}
        class="${$(this.classList)}"
        step=${Number(this.currentStep)}
        total-steps=${Number(this.maxSteps)}
        edit-label=${1===this.accounts.length?"":"bbva-expandable-step-edit"}
        ?completed="${$(this.completed)}"
        ?disabled=${this.disabled}
        disabled-target="[data-tag-name='loan-payment-account']"
        disabled-target-attr="[data-tag-name='loan-payment-account']"
        hidden-continue-button
        hide-padding-left
        hide-padding-right
        disable-on-previous-step-edit
      >
        ${this.errorAccounts?this._renderErrorAccounts:this._renderSuccesAccounts}
      </bbva-expandable-step>
    `}}customElements.define(Ae.is,Ae);class we extends(nt(E(y(e)))){static get is(){return"loan-payment-multi-step"}static get styles(){return[Ce,v("loan-payment-multi-step-shared-styles")]}static get scopedElements(){const t=[Se,Pe,K,Ae,le];return we.scopedElementsFromClasses(t)}static get properties(){return{loanDetail:{type:Object},localCurrency:{type:String},summaryPaymentList:{type:Array},accounts:{type:Array},_stepOneHasBeenCompleted:{type:Boolean},_stepOneCompleted:{type:Boolean},_stepTwoHasBeenCompleted:{type:Boolean},_stepTwoCompleted:{type:Boolean},_stepTwoDisabled:{type:Boolean},amount:{type:Number},_stepsToReset:{type:Array},_accountSelected:{type:Object},errorAccounts:{type:Boolean}}}constructor(){super(),this.amount=0,this.loanDetail={},this.language="",this.localCurrency="",this.accounts=[],this.summaryPaymentList=[],this._stepOneCompleted=!1,this._stepOneHasBeenCompleted=!1,this._stepTwoCompleted=!1,this._stepTwoHasBeenCompleted=!1,this._stepTwoDisabled=!1,this.scrollAnimationStart=100,this.scrollAnimationFinish=500,this.scrollAnimation=600,this.scrollAnimationCompleted=900,this.scrollingAnimationDelay=10,this.currencyCode="",this._stepsToReset=[],this._accountSelected={},this.errorAccounts=!1}updated(t){this._getpaymentOptions(this.loanDetail),t.has("summaryPaymentList")&&(this._stepOneCompleted=this._stepOneHasBeenCompleted=!!this.summaryPaymentList.length,this.requestUpdate())}_getSummaryInfo(t){var e,a,i,n;return[{label:this.t("loan-payment-multistep-summary-first-label"),class:"summary",description:null==t?void 0:t.alias},{label:this.t("loan-payment-multistep-summary-second-label"),class:"summary",visibleChars:"4",maskChars:"•",mask:null==t?void 0:t.number},{label:this.t("loan-payment-multistep-summary-third-label"),class:"summary",language:this.language,amount:null==t||null===(e=t.pendingAmount)||void 0===e||null===(a=e.totals[0])||void 0===a?void 0:a.amount,currency:null==t||null===(i=t.pendingAmount)||void 0===i||null===(n=i.totals[0])||void 0===n?void 0:n.currency,localCurrency:this.localCurrency,currencyCode:this.currencyCode}]}_getpaymentOptions(t){var e,a,i,n;const o=Number(null==t||null===(e=t.currentInstallment)||void 0===e?void 0:e.number),s=(null==t||null===(a=t.totalInstallmentsNumber)||void 0===a?void 0:a.overdue)>0,r=Number(null==t||null===(i=t.lastInstallment)||void 0===i?void 0:i.number),l=Number(null==t||null===(n=t.currentInstallment)||void 0===n?void 0:n.totals[0].amount),c=[{id:"titleAmountOverdue",loading:!1,disabled:!1,titleHeader:s?this.t("loan-payment-multistep-options-overdue-first-title"):this.t("loan-payment-multistep-options-first-title"),description:s?this.t("loan-payment-multistep-options-overdue-first-description"):this.t("loan-payment-multistep-options-first-description"),linkText:"",dividerBottom:"full",data:{page:"titleAmountOverdue",label:s?this.t("loan-payment-multistep-options-overdue-first-title"):this.t("loan-payment-multistep-options-first-title"),eventText:"recipt-amount"}},{id:"titleOtherAmount",titleHeader:this.t("loan-payment-multistep-options-second-title"),description:this.t("loan-payment-multistep-options-second-title-description"),linkText:"",dividerBottom:"full",data:{page:"loanPaymentOtherAmountPage",label:this.t("loan-payment-multistep-options-second-title"),eventText:"other-amount"}},{id:"titleSettleLoan",titleHeader:this.t("loan-payment-multistep-options-third-title"),description:this.t("loan-payment-multistep-options-third-description"),linkText:"",disabled:s,data:{page:"titleSettleLoan",label:this.t("loan-payment-multistep-options-third-title"),eventText:"settle-amount"}}];return(!o||r===o&&0===l)&&c.shift(),c}setSelectedAccount(t){this._setCompletedAccountStep(),this._accountSelected=t.detail,this.dispatchEvent(new CustomEvent(`${we.is}-account-selected`,{bubbles:!0,composed:!0,detail:t.detail.number}))}_setCompletedAccountStep(){this._stepTwoCompleted=this._stepTwoHasBeenCompleted=!0}_wontResetStepOne(){this._stepOneCompleted=!0,this._stepTwoDisabled=!1,this.requestUpdate()}_wontResetStepTwo(){this._stepTwoCompleted=!0,this.requestUpdate()}willResetStepOne(){this._stepOneCompleted=!1,this._stepOneHasBeenCompleted=!1,this.resetSteps(1,2),this.requestUpdate()}willResetStepTwo(){this._stepTwoCompleted=this._stepTwoHasBeenCompleted=!1,this._stepTwoDisabled=!this._stepOneCompleted,this.shadowRoot.querySelector("loan-payment-account").disabled=this._stepTwoDisabled,this.resetSteps(1,2),this.requestUpdate()}_shoudResetStepOne(t){null==t||t.stopPropagation(),this._stepTwoCompleted=!!this._stepTwoHasBeenCompleted||this._stepTwoCompleted,this._stepTwoDisabled=!this._stepTwoHasBeenCompleted,this._stepOneCompleted=!1,this.shadowRoot.querySelector("loan-payment-account").disabled=this._stepTwoDisabled,this.resetSteps(1,2),this.requestUpdate()}_shoudResetStepTwo(t){null==t||t.stopPropagation(),this._stepOneCompleted=!!this._stepOneHasBeenCompleted||this._stepOneCompleted,this._stepTwoCompleted=!1,this.resetSteps(1,2),this.requestUpdate()}_shoudShowBottomMessage(t){var e;return(null==t||null===(e=t.totalInstallmentsNumber)||void 0===e?void 0:e.overdue)>0}_formatAmount(t){return{variant:"4xl",amount:t,currencyCode:this.currencyCode,localCurrency:this.localCurrency,language:this.language}}resetSteps(...t){this._stepsToReset=[...t]}_fireAccountsStepActive(t){!t.detail&&this._stepOneCompleted&&(this.dispatchEvent(new CustomEvent(`${we.is}-account-step-active`,{bubbles:!0,composed:!0,detail:!0})),this.errorAccounts&&this.dispatchEvent(new CustomEvent("error-on-get-accounts-analytics",{bubbles:!0,composed:!0,detail:!0})))}get _summaryViewElement(){return f`
      <loan-summary-view
        summary-header="${this.t("loan-payment-multistep-header")}"
        .summaryElements=${this._getSummaryInfo(this.loanDetail)}
      >
      </loan-summary-view>
    `}get _loanPaymentOptionsElement(){return f`
      <loan-payment-options
        currentStep="0"
        ?completed=${this._stepOneCompleted}
        ?hasBeenSelected=${this._stepOneHasBeenCompleted}
        maxSteps="2"
        headerStep="${this.t("loan-payment-multistep-header-step")}"
        subTitleStep="${this.t("loan-payment-multistep-header-subtitle")}"
        useBbvaListLink
        .paymentOptionDescriptionSelected=${this.summaryPaymentList}
        ?showMessage=${this._shoudShowBottomMessage(this.loanDetail)}
        primary-button-label-on-change="${this.t("loan-button-change-payment-type")}"
        .paymentOptions=${this._getpaymentOptions(this.loanDetail)}
        @expandable-step-edit-step=${this._shoudResetStepOne}
        @loan-button-group-wont-change=${this._wontResetStepOne}
      >
      </loan-payment-options>
    `}get _loanPaymentAccountElement(){return f`
      <loan-payment-account
        .accounts=${$(this.accounts)}
        .accountSelected=${$(this._accountSelected)}
        ?completed=${this._stepTwoCompleted}
        ?disabled=${this._stepTwoDisabled}
        ?hasBeenSelected=${this._stepTwoHasBeenCompleted}
        ?errorAccounts=${this.errorAccounts}
        currentStep="1"
        maxSteps="2"
        headerStep="${this.t("loan-payment-multistep-header-retirement")}"
        @expandable-step-edit-step=${this._shoudResetStepTwo}
        @loan-payment-account-selected=${this._setCompletedAccountStep}
        @loan-button-group-wont-change=${this._wontResetStepTwo}
        @loan-button-group-will-change=${this.willResetStepTwo}
        @expandable-step-disable-change = ${this._fireAccountsStepActive}
      ></loan-payment-account>
    `}render(){return f`
      <bbva-expandable-multistep
        class="displayFix"
        step-selector="[data-tag-name='loan-payment-options'],[data-tag-name='loan-payment-account'],[data-tag-name='loan-summary-view']"
        heading-selector="bbva-expandable-step"
        @expandable-multistep-all-complete=${this._checkCompleteMultiStep}
        @expandable-multistep-scroll-animation-end=${this._animationCompleteMultiStep}
        hide-disabled-steps
        has-confirm-animation
        offsetHeight="10"
        scroll-animation-completed=${this.scrollAnimationCompleted}
        scroll-animation=${this.scrollAnimation}
        ?has-animation=${!1}
        start-animation-step=${this.scrollAnimationStart}
        finish-animation-step=${this.scrollAnimationFinish}
        scrolling-delay=${this.scrollingAnimationDelay}
        .stepsToReset=${this._stepsToReset}
      >
        <div slot="content">
          ${this._summaryViewElement} ${this._loanPaymentOptionsElement}
          ${this._loanPaymentAccountElement}
        </div>
        <loan-summary-payment-info
          slot="confirmation"
          class="back-ground-white full-width"
          .paymentAmonut=${this._formatAmount(this.amount)}
          primaryButtonConfig='{"text": "loan-payment-pay", "eventName": "request-payment", "variant": ""}'
        >
        </loan-summary-payment-info>
      </bbva-expandable-multistep>
    `}}customElements.define(we.is,we);class Ie{constructor(){void 0===Array.prototype.includes&&Object.defineProperty(Array.prototype,"includes",{value:function(t,e){if(null===this)throw new TypeError('"this" is null or not defined');let a=Object(this),i=a.length>>>0;if(0===i)return!1;let n=0|e,o=Math.max(n>=0?n:i-Math.abs(n),0);for(;o<i;){if((s=a[o])===(r=t)||"number"==typeof s&&"number"==typeof r&&isNaN(s)&&isNaN(r))return!0;o++}var s,r;return!1}}),String.fromCodePoint||function(t){var e=function(e){for(var a=[],i=0,n="",o=0,s=arguments.length;o!==s;++o){var r=+arguments[o];if(!(r<1114111&&r>>>0===r))throw RangeError("Invalid code point: "+r);r<=65535?i=a.push(r):(r-=65536,i=a.push(55296+(r>>10),r%1024+56320)),i>=16383&&(n+=t.apply(null,a),a.length=0)}return n+t.apply(null,a)};try{Object.defineProperty(String,"fromCodePoint",{value:e,configurable:!0,writable:!0})}catch(t){String.fromCodePoint=e}}(String.fromCharCode)}_error(t=0,e="",a=null){throw t=`0000${t=t.toString()}`.substr(t.length),Error(`BGADP_ERROR_${t} :: ${e} :: ${a&&a.message}`)}}class Le extends Ie{get length(){return Object.keys(this._items).length}constructor(){super(),Object.defineProperty(this,"_reservedKeys",{value:["_items","_reservedKeys","setItem","getItem","removeItem"]}),Object.defineProperty(this,"_items",{configurable:!1,enumerable:!0,value:{},writable:!0})}setItem(t="",e=""){if("string"==typeof t&&t)if(this._reservedKeys.includes(t))this._error(2,`"${t}" should NOT be a reserved key`);else{if("string"!=typeof e)try{e=JSON.stringify(e)}catch(t){this._error(1,`"${e}" couldn't be transformed into String`)}e=e.replace(/</g,"&lt;").replace(/>/g,"&gt;"),this._items[t]=e}else this._error(3,"Missing {item} parameter")}getItem(t=""){return this._items[t]?this._items[t]:null}removeItem(t=""){this._items.hasOwnProperty(t)&&delete this._items[t]}clear(){Object.keys(this._items).length&&(this._items={})}}const Me=0,Re=1,Oe="jwt",He="tsec",De="none";class Be extends Ie{constructor(t=null){super(),this.host="http://localhost:8100",this.version="0",this.method="GET",this.params=null,this.multipart=null,this.body=null,this.headers=null,this.timeout=60,this.requiresTsec=!1,this.tsecHandler=null,this.getTokenHandlerKey=null,this.requiresJWT=!1,this.jwtHandler=null,this.requiredToken=null,this.cacheType="NONE",this.cacheKey="bgadp",this.encodeCache=!1,this.withCredentials=!1,this.simulate=[],this.native=!1,this.jwtHeaderName="vnd.bbva.access-token",this.semaasMonitoring=!1,this.htmlContext=null,this.forceBoundary=null,this.responseType="text",this.emitRequestEvents=!0,this.paramArrayMode=Me,this._assignPrivateValues(),this._assignConstantValues(),this._assignConfigValues(t),this._assignSecurityToken(),this._setCacheEngine()}_assignPrivateValues(){let t={_className:"BGADPRequestBase",_headers:{Accept:"application/json, text/html, */*; q=0.1","Content-Type":"application/json"},_promise:null,_request:null,_lastResponse:null,_lastResponseHeaders:null,_cacheItem:null};Object.keys(t).forEach((e=>{Object.defineProperty(this,e,{configurable:!1,enumerable:!1,value:t[e],writable:"_headers"!==e})}),this),Object.defineProperty(this,"_memCache",{configurable:!1,enumerable:!1,value:new Le,writable:!1}),Object.defineProperty(this,"_STATUS_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_INVALID:[401,403],PENDING_PROCESS_RESPONSE:[400]}}),Object.defineProperty(this,"_ERROR_CODES",{configurable:!0,enumerable:!0,value:{SIGNATURE_REQUIRED:["70","999","forbidden","stateChangeGoOn"],SIGNATURE_INVALID:["168","398","429","402","576","invalidCredentials","expiredCredentials","lockedCredentials"],SIGNATURE_FIRST_STEP:["70","forbidden"],PENDING_PROCESS_RESPONSE:["validationProcessPendingInternal","validationProcessPending"]}})}_assignConstantValues(){["_DEFAULT_XHR","_NATIVE_XHR"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this),["_CACHE_NONE","_CACHE_LOCAL","_CACHE_SESSION","_CACHE_MEMORY"].forEach(((t,e)=>{Object.defineProperty(this,t,{configurable:!1,enumerable:!0,value:e})}),this)}_assignConfigValues(t=null){null!=t&&"object"==typeof t&&Object.keys(t).forEach((e=>{if(this.hasOwnProperty(e)&&"_"!==e.charAt(0)&&"function"!=typeof this[e])if("object"==typeof this[e])Array.isArray(t[e])?this[e]=Array.from(t[e]):null===this[e]?this[e]=t[e]:this[e]=Object.assign(this[e]||{},t[e]);else this[e]=t[e];else"signatureRequiredErrors"===e?this._ERROR_CODES.SIGNATURE_REQUIRED=t[e]:"signatureInvalidErrors"===e?this._ERROR_CODES.SIGNATURE_INVALID=t[e]:"signatureFirstErrorCode"===e?this._ERROR_CODES.SIGNATURE_FIRST_STEP=t[e]:"pendingProcessResponseErrors"===e?this._ERROR_CODES.PENDING_PROCESS_RESPONSE=t[e]:"signatureInvalidStatus"===e?this._STATUS_CODES.SIGNATURE_INVALID=t[e]:"pendingProcessResponseStatus"==e?this._STATUS_CODES.PENDING_PROCESS_RESPONSE=t[e]:"getTokenHandlerKey"===e?this.getTokenHandlerKey=t[e]:("function"==typeof this[e]&&this._error(1,`${e} is a class method, can't be override`),"_"===e.charAt(0)&&this._error(2,`"${e}" is a restricted property, can't be override`),this.hasOwnProperty(e)||this._error(3,`"${e}" is not a valid property for ${this._className}`))}),this),Object.defineProperty(this,"_xhrType",{configurable:!1,enumerable:!1,value:this.native?this._NATIVE_XHR:this._DEFAULT_XHR,writable:!1})}_assignSecurityToken(){null===this.requiredToken?(this.requiresTsec?this.requiredToken=He:this.requiredToken=De,this.requiresJWT=!1):this.requiredToken===He?(this.requiresTsec=!0,this.requiresJWT=!1):this.requiredToken===Oe?(this.requiresJWT=!0,this.requiresTsec=!1):this.requiredToken===De?(this.requiresJWT=!1,this.requiresTsec=!1):this._error(1,`requiredToken has an invalid value ${this.requiredToken}`),this._setTsecHandler(),this._setJwtHandler()}_setTsecHandler(){this._setTokenHandler(He)}_setJwtHandler(){this._setTokenHandler(Oe)}_setTokenHandler(t){const e=`${t}Handler`;this[e]=this[e]||window.sessionStorage;try{this[e].setItem("test","test"),this[e].removeItem("test")}catch(t){this._error(4,`Invalid [${e}]. If not specified, default window.sessionStorage can't be written/read`,t)}}_setCacheEngine(){this._cache=this[`_CACHE_${this.cacheType.toUpperCase()}`],void 0===this._cache&&this._error(5,'Invalid [cacheType] value. "NONE", "LOCAL", "SESSION" or "MEMORY" are available')}_setPath(t=""){t&&"string"==typeof t?Object.defineProperty(this,"_path",{configurable:!1,enumerable:!0,value:t,writable:!1}):this._error(6,"[path] is required")}_buildPromise(t=!1){if(!this._promise||this._promise.promise&&!this._promise.isPending){let e={isPending:!0};e.promise=new window.Promise(((a,i)=>{e=Object.assign(e,{resolve:a,reject:i}),this._buildRequest(t)})),this._promise=Object.assign({},e)}return this._promise.promise}_defaultXHR(t=""){let e=new window.XMLHttpRequest;if(e instanceof window.XMLHttpRequest){e.withCredentials=this.withCredentials,e.timeout=1e3*this.timeout,e.onreadystatechange=this._onReadyStateChange.bind(this),e.responseType=this.responseType,e.open(this.method.toUpperCase(),t);let a=this._getRequestHeaders();Object.keys(a).forEach((t=>{this.forceBoundary&&this.multipart&&"Content-Type"===t||e.setRequestHeader(t,a[t])})),e.send(this._buildBody())}return e}_nativeXHR(t=""){let e=this._buildNativeRequest();return e?(e=e[this.method.toLowerCase()],"function"==typeof e?e=e({url:t,params:this._buildBody(),headers:this._getRequestHeaders(),multipart:this.multipart,timeout:1e3*this.timeout}).then(this._onRequestSuccess.bind(this)).catch(this._onRequestFail.bind(this)):this._error(7,`Methhod Http.${this.method.toLowerCase()}() not present in native engine.`)):this._error(8,`There isn't any native engine to build Http.${this.method.toLowerCase()}() request.`),e}_buildNativeRequest(){let t=null;return!!window.CellsNativePlugins&&(t=J),t}_buildRequest(t=!1){let e=this._buildURL();if(this._cacheItem=this._retrieveFromCache(),this.emitRequestEvents){const t={url:e,path:this._path,method:this.method};this._emitRequestEvent("start",t)}if(!t&&this._cacheItem&&e===this._cacheItem.url&&this.method===this._cacheItem.method)setTimeout((()=>{this._onRequestSuccess(this._cacheItem)}),100);else if(!t&&Array.isArray(this.simulate)&&this.simulate.length)setTimeout((()=>{this._onRequestSuccess({response:this.simulate.shift()})}),100);else switch(null!==this._request&&(this._request=null),this._cacheItem=Object.assign({},{url:e,method:this.method,response:null}),this._xhrType){case this._DEFAULT_XHR:this._request=this._defaultXHR(e);break;case this._NATIVE_XHR:this._request=this._nativeXHR(e)}return this._request}_buildURL(){let t=[this.host,this._path].join("/");if(null!==this.params){let e=Object.assign({},this.params);-1!==t.lastIndexOf("{")&&(t=t.replace(/(\{[\w\-]+\})/g,(t=>{let a=t.replace(/[\{\}]+/g,""),i=e[a];return i?delete e[a]:this._error(9,`Missing ${a} param value`),i})),-1!==t.lastIndexOf("{")&&this._error(10,"Missing query [params]"));let a=Object.keys(e);a.length&&(t=[t,a.map((t=>{let a=e[t];return Array.isArray(a)&&this.paramArrayMode===Re?this._arrayToQueryParam(t,a):`${t}=${a}`})).join("&")].join("?"))}return t}_arrayToQueryParam(t,e){return e.map((e=>`${t}=${e}`)).join("&")}_getRequestHeaders(){let t=Object.assign(this._headers,this.headers||{});if(!0===this.requiresTsec&&(t=this._getTokenForRequestHeaders(He,t)),!0===this.requiresJWT&&(t=this._getTokenForRequestHeaders(Oe,t)),!0===this.semaasMonitoring){let e=this._getSemaasHeaders();Object.assign(t,e)}const e=this._getCustomHeaders();return Object.assign(t,e),t}_getSemaasHeaders(){var t={};if(window.sessionStorage){var e=window.sessionStorage;["x-rho-traceid","x-rho-parentspanid"].forEach((function(a){var i=e.getItem(a);i&&"null"!==i&&(t[a]=i)}))}return t}_getCustomHeaders(){const t="x-bgadp-";let e={};if(window.sessionStorage){const a=window.sessionStorage;e=Object.keys(a).filter((e=>e.startsWith(t))).reduce(((e,i)=>(e[i.replace(t,"")]=a.getItem(i),e)),{})}return e}_getTokenForRequestHeaders(t,e){const a=`${t}Handler`,i=t===Oe?"JWT ":"",n=t===Oe?"Authorization":He;if(void 0===this[a]||null===this[a])this._error(11,`${t} handler is undefined`);else{const o=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):t;let s=this[a].getItem(o);s?e[n]=e[n]||i+s:this._error(12,`Missing '${t}' value`)}return e}_buildBody(){let t=this.body;if(t&&this._xhrType===this._DEFAULT_XHR){let e=this.headers&&this.headers["Content-Type"]||"";if("application/x-www-form-urlencoded"===e){let e=[];Object.keys(t).forEach((a=>{e.push(`${a}=${t[a]}`)})),t=e.join("&")}else this.headers&&-1!==e.indexOf("multipart/")||(t=JSON.stringify(t))}return t}_onReadyStateChange(){let t=this._request;if(t&&t.readyState===window.XMLHttpRequest.DONE)switch(t.status.toString().charAt(0)){case"2":case"3":this._onRequestSuccess(t);break;default:this._onRequestFail(t)}}_extractRequestResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)e={result:e};else if(e&&e instanceof ArrayBuffer)try{const t=this._decode(e);try{e=JSON.parse(t)}catch(a){e={result:t,originalResponse:e}}}catch(t){e=null}else if(e&&"string"==typeof e)try{e=JSON.parse(e)}catch(t){e=null}return e}async _extractRequestErrorResponse(t=null){let e=null!==t?t.response:t;if(e&&e instanceof window.Blob)try{const t=await this._blobDecode(e);try{e=JSON.parse(t)}catch(a){e={result:t,originalResponse:e}}}catch(t){e=null}else e=this._extractRequestResponse(t);return e}_blobDecode(t){const e=new FileReader;let a;const i=new Promise(((t,e)=>{a=(a,i)=>{a?e(a):t(i)}}));return e.addEventListener("loadend",(function t(i){e.removeEventListener("loadend",t),i.error?a(i.error):a(null,e.result)})),e.readAsText(t),i}_decode(t){let e;if("function"==typeof TextDecoder){e=new TextDecoder("utf-8").decode(t)}else{let a=0;for(;a<t.length;){let i=t[a],n=0,o=0;if(i<=127?(n=0,o=255&i):i<=223?(n=1,o=31&i):i<=239?(n=2,o=15&i):i<=244&&(n=3,o=7&i),t.length-a-n>0){let e=0;for(;e<n;)i=t[a+e+1],o=o<<6|63&i,e+=1}else o=65533,n=t.length-a;e+=String.fromCodePoint(o),a+=n+1}}return e}_storeIntoCache(){try{void 0!==this._cacheItem&&null!==this._cacheItem&&(this._cacheItem.response=this._lastResponse);let t=JSON.stringify(this._cacheItem);switch(this.encodeCache&&(t=window.btoa(t)),this._cache){case this._CACHE_MEMORY:this._memCache.setItem(this.cacheKey,t);break;case this._CACHE_LOCAL:window.localStorage.setItem(this.cacheKey,t);break;case this._CACHE_SESSION:window.sessionStorage.setItem(this.cacheKey,t);case this._CACHE_NONE:}}catch(t){this._error(13,`Can't write into cache engine: ${t.message}`,t)}}_retrieveFromCache(){let t;try{switch(this._cache){case this._CACHE_MEMORY:t=this._memCache.getItem(this.cacheKey);break;case this._CACHE_LOCAL:t=window.localStorage.getItem(this.cacheKey);break;case this._CACHE_SESSION:t=window.sessionStorage.getItem(this.cacheKey);case this._CACHE_NONE:}}catch(t){this._error(14,"Can't read from cache engine",t)}return t&&(this.encodeCache&&(t=window.atob(t)),"string"==typeof t&&/[\{\[]/.test(t.charAt(0))&&(t=JSON.parse(t))),t}_setLastResponse(t=null){t&&(this._lastResponse=Object.assign({},t))}_setLastResponseHeaders(t=null){let e={};t&&(t instanceof window.XMLHttpRequest?e=this._parseResponseHeadersToObject(t.getAllResponseHeaders()):t.headers&&(e=JSON.parse(t.headers))),this._lastResponseHeaders=e}_parseResponseHeadersToObject(t){let e={},a=t.trim().split(/[\r\n]+/);for(const t in a)if(a.hasOwnProperty(t)&&""!==a[t]){let i=": ",n=a[t].split(i);e[n.shift().toLowerCase()]=n.join(i)}return e}_onRequestSuccess(t=null){this._setLastResponse(this._extractRequestResponse(t)),this._setLastResponseHeaders(t),this.jwtHandler&&this._storeToken(this.jwtHandler,t,"jwt",this.jwtHeaderName),this.tsecHandler&&this._storeToken(this.tsecHandler,t,"tsec","tsec"),this._storeIntoCache(),this._onRequestEnd("resolve",t)}_storeToken(t,e,a,i){let n=null;switch(this._xhrType){case this._DEFAULT_XHR:e&&e.getAllResponseHeaders&&e.getResponseHeader&&e.getAllResponseHeaders().indexOf(i)>=0&&(n=e.getResponseHeader(i));break;case this._NATIVE_XHR:e&&e.headers&&(n=JSON.parse(e.headers)[i])}if(n){const e=this.getTokenHandlerKey&&"function"==typeof this.getTokenHandlerKey?this.getTokenHandlerKey.call(this):a;t.getItem(e)!==n&&(t.setItem(e,n),this._emitTokenUpdate(a,n))}}_emitTokenUpdate(t,e){if(this.htmlContext){const a=new CustomEvent("token-update",{bubbles:!0,detail:{type:t,token:e}});this.htmlContext.dispatchEvent(a)}}_emitRequestEvent(t,e){this.htmlContext?this.htmlContext.dispatchEvent(new CustomEvent(`http-request-${t}`,{bubbles:!0,composed:!0,detail:{metadata:e}})):console.warn(`Missing htmlContext to dispatch event http-request-${t}`)}_onRequestFail(t=null){(async()=>{if(!this._isSignatureRequired(t)&&!this._isWaitingForProcessResponse(t)){let e=await this._extractRequestErrorResponse(t);this._setLastResponse(e),this._setLastResponseHeaders(t),this._onRequestEnd("reject",t)}})()}_onRequestEnd(t="resolve",e=null){if(this._resetDPState(),this.emitRequestEvents){const t={method:this.method,path:this._path};null!==e&&(t.status=e.status,t.url=e.responseURL),this._emitRequestEvent("end",t)}this._promise&&"function"==typeof this._promise[t]&&(this._promise.isPending=!1,this._promise[t](e))}_resetDPState(){["Data","Type","State"].forEach((t=>{let e=`Authentication${t}`;this._headers&&this._headers.hasOwnProperty(e)&&delete this._headers[e],this.headers&&this.headers.hasOwnProperty(e)&&delete this.headers[e]}),this),this.hasOwnProperty("signatureValue")&&delete this.signatureValue,this.hasOwnProperty("signatureType")&&delete this.signatureType}_extractSignatureResponseHeaders(t=null){let e,a,i,n,o;if(t instanceof window.XMLHttpRequest)e=t.getResponseHeader("AuthenticationType"),a=t.getResponseHeader("AuthenticationData"),i=t.getResponseHeader("AuthenticationState"),n=t.getResponseHeader("AuthenticationChallenge"),o=t.getResponseHeader("AuthenticationResponse");else{let s=JSON.parse(t.headers);e=s.authenticationtype,a=s.authenticationdata||null,i=s.authenticationstate,n=s.authenticationchallenge,o=s.authenticationresponse}return{type:e,data:a,state:i,challenge:n,response:o}}_defineSignatureType(){Object.defineProperty(this,"signatureType",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureTypeChange(t,...arguments)}})}_defineSignatureValue(){Object.defineProperty(this,"signatureValue",{enumerable:!0,configurable:!0,set:t=>{this._onSignatureValueChange(t,...arguments)}})}_onSignatureTypeChange(t="",e="",a=""){if("string"==typeof t&&""!==t)if(e.includes(t)){if("string"==typeof t&&""!==t){const i=this._getSignatureData(t,e,a);this.headers=Object.assign(this.headers||{},{AuthenticationType:t,AuthenticationData:i}),this._buildRequest()}}else this._error(15,`${t} is not a valid signature type`);"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_onSignatureValueChange(t=null,e="",a="",i=""){let n;if("object"==typeof t&&t){const o=this._getSignatureData(t.signatureType,e,a);n=this._makeKeyValuePairFromObject(o,t.signatureValue),t.challenge&&(n+=`,challenge=${t.challenge}`),this._buildSignatureHeaders(n,t.signatureType,i)}else"string"==typeof t&&""!==t&&(this._hasSignatureAuthenticationType(e,"2")?(n=`password=${t}`,this._buildSignatureHeaders(n,"2",i)):(n=`${a}=${t}`,this._buildSignatureHeaders(n,e,i)));"boolean"==typeof t&&!1===t&&this._onRequestEnd("reject",this._extractRequestResponse(this._request))}_makeKeyValuePairFromObject(t="",e=""){if(!t)return"";let a,i=t.split(",");if(i.length>1){a=i.map((t=>`${t}=${e[t]}`)).join(",")}else a=`${t}=${e}`;return a}_hasSignatureAuthenticationType(t,e){return-1!==t.split(";").findIndex((t=>t===e))}_buildSignatureHeaders(t="",e="",a=""){this.headers=Object.assign(this.headers||{},{AuthenticationData:t,AuthenticationType:e||""}),a&&(this.headers=Object.assign(this.headers,{AuthenticationState:a})),this._buildRequest()}_isSignatureRequired(t=null){const e=Number((t||{}).status);let a=!1;if(this._STATUS_CODES.SIGNATURE_INVALID.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),n=this._ERROR_CODES.SIGNATURE_INVALID.includes(i),{type:o,data:s,state:r,challenge:l,response:c}=this._extractSignatureResponseHeaders(t),d=this._getRequestMetadata(t);if(n)this._notifySignatureInvalid(d),a=!0;else if(o)if(e){this._ERROR_CODES.SIGNATURE_REQUIRED.includes(i)?(this._notifySignatureTypeUsingErrorCode(i,d,o,s,r,l,c),a=!0):console.warn("BGADP: Response with Signature Invalid headers but not found ErrorCode in body... response is rejected.")}else this._notifySignatureTypeUsingHeaders(d,o,s,r,l,c),a=!0}return a}checkProcessResponse(){this._buildRequest()}_isWaitingForProcessResponse(t=null){const e=Number((t||{}).status);let a=!1;if(this._STATUS_CODES.PENDING_PROCESS_RESPONSE.includes(e)){const e=this._extractRequestResponse(t),i=this._extractResponseErrorCode(e),n=this._ERROR_CODES.PENDING_PROCESS_RESPONSE.includes(i),o=this._getRequestMetadata(t);n&&(this._notifyWaitingForProcessResponse(o),a=!0)}return a}_notifySignatureRequiredFirstStep(t,e,a,i){this._defineSignatureType(e,a),this._defineSignatureValue(e,a,i),this._emitEvent(new CustomEvent("signature-required-first-step",{bubbles:!0,detail:{type:e,data:a,metadata:t}}))}_notifySignatureRequired(t,e,a,i,n,o){this._defineSignatureValue(e,a,i);const s={type:e,data:a,challenge:n,metadata:t};o&&(s.response=o),this._emitEvent(new CustomEvent("signature-required",{bubbles:!0,detail:s}))}_notifySignatureInvalid(t){this._emitEvent(new CustomEvent("signature-invalid",{bubbles:!0,detail:{metadata:t}}))}_notifyWaitingForProcessResponse(t){this._emitEvent(new CustomEvent("waiting-process-response",{bubbles:!0,detail:{metadata:t}}))}_getRequestMetadata(t){const{responseURL:e,status:a}=t;return{path:this._path,method:this.method,url:e,status:a}}_emitEvent(t){this.htmlContext?this.htmlContext.dispatchEvent(t):console.warn("Missing htmlContext to dispatch event signature-invalid")}_getSignatureData(t="",e="",a=""){const i=e.split(";").findIndex((e=>e===t));return a?a.split(";")[i]:""}toString(t=""){return`[object ${t||this._className}]`}getLastResponse(){return this._lastResponse}getLastResponseHeaders(){return this._lastResponseHeaders}getLastRequest(){return this._request}generateRequest(t=!1){return this._buildPromise(t)}_extractResponseErrorCode(t){return t?t["error-code"]||t.messages&&t.messages[0].code:null}_notifySignatureTypeUsingHeaders(t,e,a,i,n,o){i?this._notifySignatureRequired(t,e,a,i,n,o):this._notifySignatureRequiredFirstStep(t,e,a,i)}_notifySignatureTypeUsingErrorCode(t,e,a,i,n,o,s){this._ERROR_CODES.SIGNATURE_FIRST_STEP.includes(t)?this._notifySignatureRequiredFirstStep(e,a,i,n):this._notifySignatureRequired(e,a,i,n,o,s)}}class Ne extends Be{constructor(t=null){super(Object.assign(t||{},{method:"GET"}))}toString(t=""){return super.toString(t||"BGADPRequestGET")}}class qe extends Ne{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`accounts/v${this.version}/accounts/{account-id}/transactions`)}toString(){return super.toString("BGADPAccountsAccountTransactionsGetV0")}}class ze extends(Y(e)){static get is(){return"bbva-dataprovider-accounts"}static get properties(){return{productId:{type:String},services:{type:Object},_bgadpNotExistMessagge:{type:String}}}constructor(){super(),this.native=!1,this.requiredToken="tsec",this._bgadpNotExistMessagge="BGADP called not exist",this.requiredOTP=!0,this.services={BGADPAccountsAccountTransactionsGetV0:qe,BGADPAccountsGetV1:mt}}getTransactions(t){const e=this._getServiceParams({...t,"account-id":this.productId}),a=this._getService("BGADPAccountsAccountTransactionsGet",e);this._generateGetService(a,{customEvent:"set-account-transaction-list",errorFireEventHandler:"error-on-get-transactions"})}getAllAccounts(t){const e=this._getServiceParams({...t}),a=this._getService("BGADPAccountsGet",e);this._generateGetService(a,{customEvent:"set-accounts",errorFireEventHandler:"error-on-get-accounts"})}_getService(t,e){return new this.services[`${t}V${this.version}`](e)}}class Fe extends ze{static get is(){return"bbva-dataprovider-co-pensional-agreements"}getPensionAgreements(t={}){this._generateGetService(this._getService("get",{},t),{customEvent:"pension-agreements-dm-fetch",errorFireEventHandler:"pension-agreements-dm-fetch-error"})}_getService(t,e={},a={}){const i=this._getServiceParams(a,e);return this._getServicePath(`${t}PensionAgreements`,this._getBgadp(i))}_getBgadp(t){return{getPensionAgreementsV0:()=>new pt(t),default:()=>this._bgadpNotExistMessagge}}}class je extends ze{static get is(){return"bbva-dataprovider-account-gmf"}postMarksAccountsGmf(t){this._generateGetService(this._getService("post",t),{customEvent:"accounts-mark-gmf-create",errorFireEventHandler:"accounts-mark-gmf-create-error"})}_getService(t,e={},a={}){const i=this._getServiceParams(a,e);return this._getServicePath(`${t}MarksAccountsGmf`,this._getBgadp(i))}_getBgadp(t){return{postMarksAccountsGmfV0:()=>new ut(t),default:()=>this._bgadpNotExistMessagge}}}customElements.define(ze.is,ze),customElements.define(Fe.is,Fe),customElements.define(je.is,je);var Ve=a`:host {
  display: block;
  box-sizing: border-box;
}
:host .smaller-spaces {
  --gridSpacerVariant: 5;
}
:host bbva-list-bullet {
  text-align: initial;
  margin-top: 1rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.golden-icon {
  --_help-modal-title-icon-color: var(--colorsTertiaryType3Dark, ${n(o.tertiaryType3Dark)});
}

.modal-content-wrapper {
  --_help-modal-content-color: color: black;
  --_help-modal-title-icon-color: #1973B8;
  --bbva-help-modal-padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, 8))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, 8))) / 16) * 1em) 0;
  --bbva-help-modal-title-icon-margin-bottom: 1.5rem;
}
`;const Ue=new i;var Ge=a`:host {
  display: block;
  --_veil-bg-color: var(--bbva-help-modal-dark-mode-veil-bg-color, var(--colorsPrimaryCoreDarkened, ${n(o.primaryCoreDarkened)}));
  --bbva-help-modal-safe-area-inset-top: 0;
  --bbva-help-modal-safe-area-inset-bottom: 0;
  --_modal-padding: 0;
  --_help-modal-content-bg-color: var(--bbva-help-modal-dark-mode-content-bg-color, var(--bbva-help-modal-content-bg-color, var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)})));
  --_help-modal-title-icon-color: var(--bbva-help-modal-dark-mode-title-icon-color, var(--bbva-help-modal-title-icon-color, var(--colorsPrimaryCoreDark, ${n(o.primaryCoreDark)})));
  --_help-modal-title-icon-color-warning: var(--bbva-help-modal-dark-mode-title-icon-color-warning, var(--bbva-help-modal-title-icon-color-warning, var(--colorsTertiaryType1Dark, ${n(o.tertiaryType1Dark)})));
  --_help-modal-title-icon-color-info: var(--bbva-help-modal-dark-mode-title-icon-color-info, var(--bbva-help-modal-title-icon-color-info, var(--colorsTertiaryType3Dark, ${n(o.tertiaryType3Dark)})));
  --_help-modal-title-color: var(--bbva-help-modal-dark-mode-title-color, var(--bbva-help-modal-title-color, var(--colorsSecondary600, ${n(o.secondary600)})));
  --_help-modal-content-color: var(--bbva-help-modal-dark-mode-content-color, var(--bbva-help-modal-content-color, var(--colorsSecondary500, ${n(o.secondary500)})));
  --_help-modal-footer-bg-color: var(--bbva-help-modal-dark-mode-footer-bg-color, var(--bbva-help-modal-footer-bg-color, var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)})));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal-dark-mode-ios-header-bg-color, var(--bbva-help-modal-ios-header-bg-color, var(--colorsPrimaryCore, ${n(o.primaryCore)})));
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.3s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.25s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-full-height-bg-color: var(--bbva-help-modal-dark-mode-full-height-bg-color, var(--bbva-help-modal-full-height-bg-color, var(--colorsPrimaryCoreLightened, ${n(o.primaryCoreLightened)})));
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  visibility: hidden;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.veil {
  opacity: 0;
  position: fixed;
  transition: visibility 0.2s ease-in-out, opacity var(--_help-modal-veil-transition-duration) var(--_help-modal-veil-transition-easing);
  visibility: hidden;
  pointer-events: none;
}

.modal-main {
  display: flex;
  flex-direction: column;
  overflow-y: auto;
  width: 100%;
  height: 100%;
  padding-bottom: calc(calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1em) + var(--bbva-help-modal-safe-area-inset-bottom) / 2);
  max-width: 45rem;
}

.transition-container {
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  position: fixed;
  transform: translateY(100%);
  transition: visibility var(--_help-modal-transition-duration), transform var(--_help-modal-transition-duration) var(--_help-modal-transition-easing);
  width: 100%;
  will-change: transform;
  z-index: 1;
}
.transition-container.half-height {
  max-height: 50%;
  top: auto;
}
.transition-container.half-height .modal-main {
  background-color: var(--_help-modal-content-bg-color);
}
.transition-container .help-modal {
  width: 100%;
  box-sizing: border-box;
  height: 100%;
  align-items: center;
  margin: auto;
  display: flex;
  justify-content: center;
}

.modal-container {
  width: 100%;
  padding: var(--bbva-help-modal-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1em) 0);
  align-items: center;
  outline: 0;
}

.modal-title {
  align-items: center;
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${n(L.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${n(c.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${n(M.typeMedium)}));
  position: relative;
  outline: 0;
}
.modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color);
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem));
}
.modal-title [data-tag-name=bbva-text] {
  width: 100%;
  color: var(--_help-modal-title-color);
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1em) 0 0);
  transform: translateZ(0.01px);
}

:host(:not([full-height])) .slot-footer {
  background-color: var(--_help-modal-footer-bg-color);
}

:host([full-height]) .help-modal {
  background-color: var(--_help-modal-full-height-bg-color);
  display: block;
}
:host([full-height]) .modal-header {
  width: 100%;
  position: sticky;
  position: -webkit-sticky;
  top: 0;
  z-index: 1;
}

.modal-content {
  outline: 0;
}
.modal-content [data-tag-name=bbva-text] {
  color: var(--_help-modal-content-color);
}

:host([modal-type=warning]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-warning);
}

:host([modal-type=info]) .modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color-info);
}

.modal-content-wrapper {
  max-width: var(--bbva-help-modal-content-max-width, 100%);
  width: var(--bbva-help-modal-content-width, 100%);
  color: var(--_help-modal-content-color);
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${n(L.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${n(M.typeSmall)}));
  text-align: center;
  margin: 0 auto;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1em);
}

.footer-button:last-child {
  margin-top: var(--bbva-help-modal-footer-last-button-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1rem));
}

[data-tag-name=bbva-link].footer-button {
  text-align: center;
}

:host([fixed-footer]) .modal-container {
  flex-grow: 1;
  overflow-y: auto;
  display: flex;
  flex-direction: column;
}
:host([fixed-footer]) .modal-content-wrapper, :host([fixed-footer]) .modal-content, :host([fixed-footer]) .slot-content {
  flex-grow: 1;
  display: flex;
  flex-direction: column;
  width: 100%;
}
:host([fixed-footer]) .slot-footer {
  box-shadow: var(--bbva-help-modal-footer-fixed-shadow, 0 0 4px 0 rgba(18, 18, 18, 0.3));
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1em);
}
:host([fixed-footer]) .transition-container .modal-main {
  padding-bottom: var(--bbva-help-modal-safe-area-inset-bottom, 0);
}

:host([visible]) {
  visibility: visible;
}
:host([visible]) .veil {
  visibility: visible;
  opacity: var(--_veil-opacity, 0.9);
  pointer-events: all;
}
:host([visible]) .transition-container {
  transform: translateY(0%);
}
:host([visible]) .transition-container .help-modal {
  display: flex;
  flex-direction: column;
}

:host(:not([visible])) {
  position: relative;
  height: auto;
  width: auto;
  --bbva-help-modal-transition-duration: 0.15s;
  --bbva-help-modal-veil-transition-duration: 0.15s;
  --bbva-help-modal-transition-easing: cubic-bezier(0.8,0,1,1);
  --bbva-help-modal-veil-transition-easing: cubic-bezier(0.8,0,1,1);
  --_modal-padding: 0;
}
:host(:not([visible])) .transition-container {
  visibility: hidden;
}
:host(:not([visible]))[full-height] .veil {
  transition: none;
}
:host(:not([visible])) div[tabindex="0"] > .veil {
  visibility: hidden;
  opacity: 0;
}

@supports (padding-top: constant(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  :host([i-o-s-fixed-header]) [data-tag-name=bbva-header-main] {
    padding-top: 0;
  }
}

:host([visible][full-height]) {
  --bbva-help-modal-veil-transition-duration: 0.15s;
}

:host(:not([visible])[full-height]) {
  --bbva-help-modal-transition-duration: 0.2s;
}
:host(:not([visible])[full-height]) .transition-container {
  transform: translateY(100%);
}
:host(:not([visible])[full-height]) .modal-main {
  max-width: none;
}

.transition-container[_should-display-fixed-header] {
  padding-top: var(--bbva-help-modal-safe-area-inset-top, 0);
  position: fixed;
}
@supports (padding-top: constant(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .transition-container[_should-display-fixed-header] {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}

@supports (padding-top: constant(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: constant(safe-area-inset-top);
  }
}
@supports (padding-top: env(safe-area-inset-top)) {
  .iOS-fixed-header {
    --bbva-help-modal-safe-area-inset-top: env(safe-area-inset-top);
  }
}
@supports (padding-bottom: constant(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: constant(safe-area-inset-bottom);
  }
}
@supports (padding-bottom: env(safe-area-inset-bottom)) {
  .modal-main {
    --bbva-help-modal-safe-area-inset-bottom: env(safe-area-inset-bottom);
  }
}
@supports (will-change: transform) {
  .transition-container {
    will-change: transform;
  }
}
.iOS-fixed-header {
  background-color: var(--_help-modal-ios-header-bg-color);
  height: var(--bbva-help-modal-safe-area-inset-top, 0);
  position: absolute;
  bottom: calc(100vh - var(--bbva-help-modal-safe-area-inset-top, 0));
  width: 100%;
  z-index: 5;
}

@media (min-width: 45rem) {
  :host([full-height]) .transition-container {
    padding-bottom: 0;
  }
  :host([full-height]) .modal-header {
    --bbva-header-main-max-width: 45rem;
  }
  :host([full-height]) .modal-container,
:host([full-height]) .modal-footer {
    margin: auto;
  }
  :host([full-height]) .modal-container {
    max-width: 45rem;
    flex-grow: 1;
    overflow-y: auto;
  }
  :host([full-height]) .modal-footer {
    width: 45rem;
  }
  :host([full-height]) .modal-footer .slot-footer {
    padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${n(d.spacer)}))) / 16) * 1em);
  }

  .modal-title [data-tag-name=bbva-text] {
    width: 40rem;
  }
}
${Ue.mediaRules()}`;class Xe extends(g(y(Q))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":I,"bbva-icon":z,"bbva-text":k,"bbva-header-main":ot,"bbva-link":x}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},closeModalElements:{type:Array,attribute:"close-modal-elements"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header",reflect:!0},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top",reflect:!0},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},disabledButton:{type:Boolean,attribute:"disabled-button"},titleLines:{type:Number,attribute:"title-lines"},showTextIcon:{type:Boolean,attribute:"show-text-icon"}}}constructor(){super(),this.iconLeftPrimary="",this.iconLeftSecondary="",this.iconRightPrimary=R(),this.iconRightSecondary="",this.accessibilityTextIconLeftPrimary="",this.accessibilityTextIconLeftSecondary="",this.accessibilityTextIconRightPrimary="",this.accessibilityTextIconRightSecondary="",this.closeModalElements=["footer-button","footer-link","header-right-primary"],this.headerText="",this.headerType="modal-three-level",this.titleIcon="",this.titleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1,this.disabledButton=!1,this.showTextIcon=!1}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this.removeAttribute("aria-modal"),this._checkHeight()}updated(t){if(super.updated&&super.updated(t),this.fullHeight||this.setAttribute("hide-content-padding-top",!0),t.has("visible")){let t="close";this.visible&&(t="open"),this.dispatchEvent(new CustomEvent(`help-modal-${t}`,{detail:{status:t,modal:this},bubbles:!0,composed:!0}))}this._updateAccessibility()}static get styles(){return[super.styles,Ge,v("bbva-help-modal-shared-styles"),Z.light,s.light]}get _fixedIOSHeader(){return f`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get helpModalHeader(){return this.headerText?f`
          <slot name="slot-header" class="header-slot">
            <bbva-header-main
              data-tag-name="bbva-header-main"
              id="helpModalHeader"
              ?show-text-icon="${this.showTextIcon}"
              variant="${this.headerType}"
              text="${this.headerText}"
              icon-right-primary="${this.iconRightPrimary}"
              icon-right-secondary="${this.iconRightSecondary}"
              icon-left-primary="${this.iconLeftPrimary}"
              icon-left-secondary="${this.iconLeftSecondary}"
              accessibility-text-icon-left-primary="${this.accessibilityTextIconLeftPrimary}"
              accessibility-text-icon-left-secondary="${this.accessibilityTextIconLeftSecondary}"
              accessibility-text-icon-right-primary="${this.accessibilityTextIconRightPrimary}"
              accessibility-text-icon-right-secondary="${this.accessibilityTextIconRightSecondary}"
              @header-main-icon-right-primary-click="${()=>this._handleClick("header-right-primary")}"
              @header-main-icon-right-secondary-click="${()=>this._handleClick("header-right-secondary",!1)}"
              @header-main-icon-left-primary-click="${()=>this._handleClick("header-left-primary",!1)}"
              @header-main-icon-left-secondary-click="${()=>this._handleClick("header-left-secondary",!1)}"
            ></bbva-header-main>
          </slot>
        `:""}get helpModalContent(){return f`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content">
          ${this.descriptionText?f`<bbva-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                alignment="center"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-text>`:f`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilTpl(){return this.fullHeight?"":f`
        <div class="veil" @keyup="${this._keyupEvent}" @click="${this._onVeilClick}"></div>
      `}get helpModalFooter(){return f`
      <div class="modal-footer">
        <slot name="slot-footer">
          <div class="slot-footer" ?hidden="${!this.buttonText&&!this.linkText}">
            <bbva-button-default
              ambient="light"
              class="footer-button"
              data-tag-name="bbva-button-default"
              ?hidden="${!this.buttonText}"
              ?disabled="${this.disabledButton}"
              @click="${()=>this._handleClick("footer-button")}"
              >${this.buttonText}</bbva-button-default
            >
            ${this.linkText?f`<bbva-link
                  ambient="light"
                  class="footer-button"
                  data-tag-name="bbva-link"
                  @click="${()=>this._handleClick("footer-link")}"
                  ?hidden="${!this.linkText}"
                  >${this.linkText}</bbva-link
                >`:null}
          </div>
        </slot>
      </div>
    `}get helpModalTitle(){return f`
      <div id="helpModalTitle" class="modal-title">
        <slot name="slot-title">
          <bbva-icon
            class="title-icon"
            data-tag-name="bbva-icon"
            size="24"
            icon="${this.titleIcon}"
            ?hidden="${!this.titleIcon}"
            aria-hidden="true"
          ></bbva-icon>
          ${this.titleText?f` <bbva-text
                id="title-text"
                .text=${this.titleText}
                ?hidden="${!this.titleText}"
                alignment="center"
                ellipsis
                .lines="${this.titleLines}"
                unset
                font-weight="500"
                tag="h2"
              >
              </bbva-text>`:null}
        </slot>
      </div>
    `}_updateAccessibility(){!this.getAttribute("aria-label")&&this.titleText&&this.setAttribute("aria-label",this.titleText)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_runScrollReset(){const t=this._getFirstScrollableParent(this._container);requestAnimationFrame((()=>{requestAnimationFrame((()=>{null==t||t.scrollTo(0,0)}))}))}_setFooterShadow(t){t.currentTarget.scrollTop>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight?(this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"),this.dispatchEvent(new CustomEvent("help-modal-content-scroll-bottom-reach",{detail:!0,bubbles:!0,composed:!0}))):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_handleClick(t){this.dispatchEvent(new CustomEvent(`help-modal-${t}-click`,{detail:!0,bubbles:!0,composed:!0})),this.closeModalElements.includes(t)&&this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick("veil")}_shouldDisplayFixedHeader(){const t=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(t[0])}get _modalContent(){return f`
      ${this._fixedIOSHeader}
      <section
        class="transition-container ${C({"half-height":!this.fullHeight})}"
        ?_should-display-fixed-header="${this._shouldDisplayFixedHeader()}"
      >
        <div class="help-modal">
          <div class="modal-header">${this.helpModalHeader}</div>
          <div class="modal-main">
            <div class="modal-container" @scroll="${this._setFooterShadow}">
              <div class="modal-content-wrapper">
                ${this.helpModalTitle} ${this.helpModalContent}
              </div>
            </div>
            ${this.helpModalFooter}
          </div>
        </div>
      </section>
    `}}customElements.define(Xe.is,Xe);class We extends(g(e)){static get is(){return"loan-modal-manager"}static get scopedElements(){const t=[Xe,tt];return We.scopedElementsFromClasses(t)}static get styles(){return[Ve,v("loan-modal-manager-shared-styles")]}static get properties(){return{_modalId:{type:String},_fullHeightModal:{type:Boolean},_hideContentPaddingTopModal:{type:Boolean},_fixedFooterModal:{type:Boolean},_headerTypeModal:{type:String},_modalType:{type:String},_iconRightPrimaryHeaderModal:{type:String},_iconRightSecondaryHeaderModal:{type:String},_iconLeftPrimaryHeaderModal:{type:String},_iconLeftSecondaryHeaderModal:{type:String},_headerTextModal:{type:String},_titleIconModal:{type:String},_titleTextModal:{type:String},_listTextModal:{type:Array},_bodyTextModal:{type:String},_buttonTextModal:{type:String},_linkTextModal:{type:String},_modalHelp:{type:Object}}}constructor(){super(),this._modalId="",this._fullHeightModal=!1,this._hideContentPaddingTopModal=!1,this._fixedFooterModal=!1,this._headerTypeModal="",this._modalType="",this._iconRightPrimaryHeaderModal="",this._iconRightSecondaryHeaderModal="",this._iconLeftPrimaryHeaderModal="",this._iconLeftSecondaryHeaderModal="",this._headerTextModal="",this._titleIconModal="",this._titleTextModal="",this._listTextModal=[],this._bodyTextModal="",this._buttonTextModal="",this._linkTextModal=""}get _bbvaHelpModal(){return this._modalHelp||(this._modalHelp=this.shadowRoot.querySelector('[data-tag-name="bbva-help-modal"]')),this._modalHelp}openWithSettings(t){this._modalId=t.modalId,this._fullHeightModal=t.fullHeightModal,this._hideContentPaddingTopModal=t.hideContentPaddingTopModal,this._fixedFooterModal=t.fixedFooterModal,this._headerTypeModal=t.headerTypeModal,this._modalType=t.modalType,this._iconRightPrimaryHeaderModal=t.iconRightPrimaryHeaderModal,this._iconRightSecondaryHeaderModal=t.iconRightSecondaryHeaderModal,this._iconLeftPrimaryHeaderModal=t.iconLeftPrimaryHeaderModal,this._iconLeftSecondaryHeaderModal=t.iconLeftSecondaryHeaderModal,this._headerTextModal=t.headerTextModal,this._titleIconModal=t.titleIconModal,this._titleTextModal=t.titleTextModal,this._listTextModal=t.listTextModal,this._bodyTextModal=t.bodyTextModal,this._buttonTextModal=t.buttonTextModal,this._linkTextModal=t.linkTextModal,this._bbvaHelpModalClass=t.bbvaHelpModalClass,this.requestUpdate(),this.open()}open(){this._bbvaHelpModal.open()}close(){this._bbvaHelpModal.close()}_fireModalEvents(t){this.dispatchEvent(new CustomEvent(`${We.is}-${t}-${this._modalId}`,{bubbles:!0,composed:!0,detail:!0}))}render(){var t,e;return f`
      <bbva-help-modal
        class="${this._bbvaHelpModalClass}"
        ?full-height=${this._fullHeightModal}
        ?hide-content-padding-top=${this._hideContentPaddingTopModal}
        ?fixed-footer=${this._fixedFooterModal}
        header-type=${$(this._headerTypeModal)}
        modal-type=${$(this._modalType)}
        icon-right-primary=${$(this._iconRightPrimaryHeaderModal)}
        icon-right-secondary=${$(this._iconRightSecondaryHeaderModal)}
        icon-left-primary=${$(this._iconLeftPrimaryHeaderModal)}
        icon-left-secondary=${$(this._iconLeftSecondaryHeaderModal)}
        header-text=${$(this._headerTextModal)}
        title-icon=${$(this._titleIconModal)}
        title-text=${$(this._titleTextModal)}
        body-text=${$(this._bodyTextModal)}
        button-text=${$(this._buttonTextModal)}
        link-text=${$(this._linkTextModal)}
        @help-modal-header-right-primary-click=${()=>this._fireModalEvents("header-right-primary")}
        @help-modal-header-right-secondary-click=${()=>this._fireModalEvents("header-right-secondary")}
        @help-modal-header-left-primary-click=${()=>this._fireModalEvents("header-left-primary")}
        @help-modal-header-left-secondary-click=${()=>this._fireModalEvents("header-left-secondary")}
        @help-modal-footer-button-click=${()=>this._fireModalEvents("accept-button")}
        @help-modal-footer-link-click=${()=>this._fireModalEvents("link-button")}>

        ${null!==(t=this._listTextModal)&&void 0!==t&&t.length?f`
            <div slot="slot-content" class="container">
            ${null!==(e=this._listTextModal)&&void 0!==e&&e.length&&this._bodyTextModal?f`<span>${this._bodyTextModal}</span>`:A}

              ${this._listTextModal.map((t=>f`
              <bbva-list-bullet
                class=${t.class}
                ?disabled=${t.disabled}>
                ${t.text}
              </bbva-list-bullet>`))}
            </div>`:A}
      </bbva-help-modal>
    `}}customElements.define(We.is,We);class Ke extends(nt(E(y(e)))){static get is(){return"bbva-feature-loan-payment"}static get scopedElements(){const t=[ze,gt,ot,at,it,Nt,we,Mt,ye,Ut,_e,de,me,We,ue];return Ke.scopedElementsFromClasses(t)}static get styles(){return[ft,v("bbva-feature-loan-payment-shared-styles")]}static get properties(){return{loanId:{type:String},loanDetail:{type:Object},localCurrency:{type:String},accounts:{type:Array},email:{type:String},pages:{type:Object},bbvaSuportNumber:{type:String},_paymentResponse:{type:Object},_summaryPaymetTicket:{type:Object},_amountToPay:{type:Number},_analyticsSetleAmount:{type:Number},_analyticsOtherAmount:{type:Number},_analyticsReciptAmount:{type:Number},_loanModalManagerElement:{type:Object},_amortizationId:{type:String},_summaryPaymetList:{type:Array},_multiStepElement:{type:Object},_lastSimulateIsInstallment:{type:Boolean},_isPaymentInstallment:{type:Boolean},_modeId:{type:Number},_account:{type:String},_onErrorAccounts:{type:Boolean},_cardTitleSelected:{type:String}}}constructor(){super(),this.isLoanding=!0,this.loanId="",this.loanDetail={},this.localCurrency="",this.language="",this.email="",this.accounts=[],this._amountToPay=0,this._analyticsSetleAmount=0,this._analyticsOtherAmount=0,this._analyticsReciptAmount=0,this._amortizationId="",this._summaryPaymetList=[],this._lastSimulateIsInstallment=!1,this._modeId=0,this._isPaymentInstallment=!1,this._account="",this._paymentResponse={},this._summaryPaymetTicket={},this._onErrorAccounts=!1,this.bbvaSuportNumber="",this._cardTitleSelected="",this.pages={homePage:{id:"homePage",show:!0},otherAmountPage:{id:"otherAmountPage",show:!1},radioButtonsPage:{id:"radioButtonsPage",show:!1},otherAmountDetailPage:{id:"otherAmountDetailPage",show:!1},recepitAmountPage:{id:"recepitAmountPage",show:!1},accountsPage:{id:"accountsPage",show:!1},setlementPage:{id:"setlementPage",show:!1},detailPage:{id:"detailPage",show:!1},ticketPage:{id:"ticketPage",show:!1}}}get _accountDm(){return this._accountsProvider||(this._accountsProvider=this.shadowRoot.querySelector('[data-tag-name = "bbva-dataprovider-accounts"]')),this._accountsProvider}get _loanDm(){return this._loansProvider||(this._loansProvider=this.shadowRoot.querySelector('[data-tag-name = "bbva-dataprovider-loans"]')),this._loansProvider}initFlow(){this.getLoan(),this._getCustomerAccounts()}getLoan(){this.isLoanding=!0,this.loanId&&this._loanDm.getLoanDetail()}_getCustomerAccounts(){this._accountDm.getAllAccounts()}_setAccounts({detail:t}){this.accounts=t,this._onErrorAccounts=!1}_oneResponseError(t,e="retry"){var a,i,n,o;let s={retryErrorData:{errorId:`${e}-${t.errorId}-loan`,errorType:(null==t?void 0:t.errorTypeSchema)||"operative",retryConfig:{className:null!==(a=t.retryConfig)&&void 0!==a&&a.className?t.retryConfig.className:(null==t?void 0:t.className)||"error",title:t.retryConfig.title,message:t.retryConfig.message,messageClass:t.retryConfig.messageClass,fullModal:t.retryConfig.fullModal},callConfig:{className:null!==(i=t.callConfig)&&void 0!==i&&i.className?t.callConfig.className:(null==t?void 0:t.className)||"error",title:t.callConfig.title,message:t.callConfig.message,messageClass:t.callConfig.messageClass,fullModal:t.callConfig.fullModal}}};null!==(n=t.callConfig)&&void 0!==n&&n.acceptBtLabel&&(s.retryErrorData.callConfig.acceptBtLabel=t.callConfig.acceptBtLabel),null!==(o=t.callConfig)&&void 0!==o&&o.cancelBtLabel&&(s.retryErrorData.callConfig.cancelBtLabel=t.callConfig.cancelBtLabel),this.dispatchEvent(new CustomEvent("retry-error",{bubbles:!0,composed:!0,detail:s}))}_formatAccounts(t,e){return t.map(((a,i)=>{var n,o,s,r,l,c,d,h,m;return{number:null==a?void 0:a.number,cardTitle:null!=a&&a.alias?null==a?void 0:a.alias:null==a||null===(n=a.title)||void 0===n?void 0:n.name,amount:Number(null==a||null===(o=a.availableBalance)||void 0===o||null===(s=o.currentBalances[0])||void 0===s?void 0:s.amount),localCurrency:null==a||null===(r=a.availableBalance)||void 0===r||null===(l=r.currentBalances[0])||void 0===l?void 0:l.currency,currencyCode:null==a||null===(c=a.availableBalance)||void 0===c||null===(d=c.currentBalances[0])||void 0===d?void 0:d.currency,language:this.language,contentText:this.t("loan-payment-multistep-options-account-content"),numProduct:null==a?void 0:a.number,showEllipsis:!1,visibleChars:4,showDivider:1!==t.length&&t.length!==i+1,divider:{size:"fit"},disabled:e>Number(null==a||null===(h=a.availableBalance)||void 0===h||null===(m=h.currentBalances[0])||void 0===m?void 0:m.amount)}}))}_setAccount(t){this._account=t.detail,this.requestUpdate()}_setCardTitleSelected(t){this._cardTitleSelected=t.detail,this.requestUpdate()}_postInstallments(){this._loanDm.postPaymentInstallment({paymentAmount:{mode:{id:this._modeId},amount:_t(!0,this._amountToPay),currency:this.localCurrency},origin:{number:this._account}})}_postAmortizations(){this._loanDm.postLoanPaymentAmortizations({id:this.loanId,requestBody:{paymentAmount:{amount:_t(!0,this._amountToPay),currency:this.localCurrency},amortizationType:{id:this._amortizationId},origin:{number:this._account}}})}retrySimulate(){this._lastSimulateIsInstallment?this._requestSimulateInstallment(this._lastSimulateRequest):this._requestSimulateAmortization(this._lastSimulateRequest)}_handleOnSuccesLoanDetail(t){const{detail:e}=t;this.isLoanding=!1,this.loanDetail=e}_handleOnErrorLoanDetail(){this.isLoanding=!1,this._oneResponseError({errorId:"get-loan-detail",className:"error",retryConfig:{title:this.t("loan-payment-information-not-available"),message:this.t("loan-payment-not-load-information"),messageClass:"full-height-error",fullModal:!0},callConfig:{title:this.t("loan-payment-information-not-available"),message:this.t("loan-payment-not-load-information"),messageClass:"error",fullModal:!0}})}retrySignature(){this._pay()}_pay(){this.isLoanding=!0,this.pages.homePage.show=!1,this._isPaymentInstallment?this._postInstallments():this._postAmortizations(),this.requestUpdate()}onSignOtpModalIsCanceled(){this.isLoanding=!1,this.pages.homePage.show=!0,this.requestUpdate()}_showTicket(t){this.isLoanding=!1,this._paymentResponse=t.detail,this.goNavigation("ticketPage"),this.dispatchEvent(new CustomEvent(`${Ke.is}-change-header`,{bubbles:!0,composed:!0,detail:"light-green-bg"})),this.requestUpdate()}_handleOnErrorLoanSignature(){this.isLoanding=!1,this.pages.homePage.show=!0,this._oneResponseError({errorTypeSchema:"operative",errorId:"post-loan-signature",className:"full-height-error",retryConfig:{title:this.t("loan-payment-operation-not-performed"),message:this.t("loan-payment-operation-not-available"),messageClass:"error",fullModal:!1},callConfig:{title:this.t("loan-payment-operation-not-performed"),message:this.t("loan-payment-try-again-later"),messageClass:"full-height-error",fullModal:!0,acceptBtLabel:this.t("loan-payment-call"),cancelBtLabel:this.t("loan-payment-exit")}}),this.dispatchEvent(new CustomEvent("error-on-loan-payment-analyitics",{bubbles:!0,composed:!0,detail:!0})),this.requestUpdate()}_handleOnErrorLoanSimulate(){this.isLoanding=!1,this._oneResponseError({errorTypeSchema:"operative",errorId:"post-loan-simulates",className:"error",retryConfig:{title:this.t("loan-payment-information-not-available"),message:this.t("loan-payment-not-load-information"),messageClass:"full-height-error",fullModal:!0},callConfig:{acceptBtLabel:this.t("loan-payment-exit"),title:this.t("loan-payment-information-not-available"),message:this.t("loan-payment-not-load-information"),messageClass:"full-height-error",fullModal:!0}})}_handlePaymentSimulateAmortization(t){var e,a;this.isLoanding=!1,this._isPaymentInstallment=!1,this._setSuccesPaymentStep([{label:this.t("loan-payment-panel-button-label"),language:this.language,amount:_t(!1,null===(e=t.detail)||void 0===e||null===(a=e.paymentAmount)||void 0===a?void 0:a.amount),currencyCode:this.currencyCode,localCurrency:this.localCurrency,toPay:!0},{label:this.t("loan-payment-reduction-type"),description:"INSTALLMENT_AMOUNT_REDUCTION"===this._amortizationId?"loan-payment-reduction-type-cuota":"loan-payment-reduction-type-plazo"}])}_requestSimulateInstallment(t){this._lastSimulateRequest=t,this._lastSimulateIsInstallment=!0,this._loanDm.postPaymentInstallmentSimulate(t)}_requestSimulateAmortization(t){this._lastSimulateRequest=t,this._lastSimulateIsInstallment=!1,this._loanDm.postLoanPaymentAmortizationsSimulate({id:this.loanId,requestBody:t})}_loanPaymentReciptAmountConfiguration(t){var e,a,i,n,o,s,r,l,c,d,h,m,p,u,g;const y=Number(null==t||null===(e=t.currentInstallment)||void 0===e?void 0:e.number),b=Number(null==t||null===(a=t.totalInstallmentsNumber)||void 0===a?void 0:a.total),v=null==t||null===(i=t.currentInstallment)||void 0===i||null===(n=i.totals[0])||void 0===n?void 0:n.amount,f=null==t||null===(o=t.pendingAmount)||void 0===o||null===(s=o.interests[0])||void 0===s?void 0:s.amount,_=null==t||null===(r=t.pendingAmount)||void 0===r||null===(l=r.interests[1])||void 0===l?void 0:l.amount,C=null==t||null===(c=t.pendingAmount)||void 0===c||null===(d=c.interests[2])||void 0===d?void 0:d.amount,$=null==t||null===(h=t.pendingAmount)||void 0===h||null===(m=h.interests[3])||void 0===m?void 0:m.amount,S=null==t||null===(p=t.pendingAmount)||void 0===p||null===(u=p.interests[4])||void 0===u?void 0:u.amount,x=(null==t||null===(g=t.totalInstallmentsNumber)||void 0===g?void 0:g.overdue)>0;let P={};const k={message:"loan-payment-tickets-receipt"};return this._analyticsReciptAmount=v,(y||x)&&(P={headerMainText:x?"loan-payment-multistep-options-overdue-first-title":"loan-payment-multistep-options-first-title",headerMainEventRight:"close-loan-payment-recipt-amount-page",primaryHeaderOptionLinkEvent:"go-recepit-detail",loanPaymentDescription:"loan-payment-other-amount-header-category",primaryHeaderOptionLink:x?"":"loan-payment-receipt-amount-option-link",loanPaymentPrimaryHeaderHasHelp:x,loanPaymentSecondaryDescription:x?"":"loan-payment-detail-options-header",isPaymentInstallment:!0,modeId:1,loanPaymentListDescription:x?[{label:"loan-payment-first-text-settlement",language:this.language,amount:f,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-second-text-settlement",language:this.language,amount:_,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-interest-iva",language:this.language,amount:C,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-mora",language:this.language,amount:$,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-mora-interes",language:this.language,amount:S,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-panel-button-label",language:this.language,amount:v,class:"emphasis-amount",currencyCode:this.currencyCode,localCurrency:this.localCurrency,class:"emphasis",toPay:!0}]:[{class:"emphasis-description",label:this.t("loan-payment-number-receipts",{penddingPayment:y,totalInstallments:b}),language:this.language,amount:v,currencyCode:this.currencyCode,localCurrency:this.localCurrency,toPay:!0}],loanPaymentSummaryDescription:x?[{class:"",label:"loan-payment-capital",language:this.language,amount:f,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{class:"",label:"loan-payment-second-text-settlement",language:this.language,amount:_,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{showDivider:"true",label:"loan-payment-panel-button-label",class:"emphasis",language:this.language,amount:v,currencyCode:this.currencyCode,localCurrency:this.localCurrency,toPay:!0}]:[{label:this.t("loan-payment-number-receipts",{penddingPayment:y,totalInstallments:b}),class:"emphasis-amount",language:this.language,amount:v,currencyCode:this.currencyCode,localCurrency:this.localCurrency,toPay:!0}],loanPaymentSummaryTicket:{labelSelected:x?"loan-payment-multistep-options-overdue-first-title":"loan-payment-multistep-options-first-title",secondInfoMessageHidden:!0,summaryTicketList:x?[{label:"loan-payment-capital",language:this.language,amount:f,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-second-text-settlement",language:this.language,amount:_,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-panel-button-label",language:this.language,amount:v,currencyCode:this.currencyCode,localCurrency:this.localCurrency,toPay:!0}]:[{label:this.t("loan-payment-number-receipts",{penddingPayment:y,totalInstallments:b}),language:this.language,amount:v,currencyCode:this.currencyCode,localCurrency:this.localCurrency,class:"emphasis",toPay:!0}]},loanPaymentSecondaryMessages:x?[k]:[]}),P}_loanPaymentDetailConfiguration(t){var e,a,i,n,o,s,r,l;const c=Number(null==t||null===(e=t.currentInstallment)||void 0===e?void 0:e.number),d=Number(null==t||null===(a=t.totalInstallmentsNumber)||void 0===a?void 0:a.total),h=null==t||null===(i=t.currentInstallment)||void 0===i||null===(n=i.totals[0])||void 0===n?void 0:n.amount,m=null==t||null===(o=t.pendingAmount)||void 0===o||null===(s=o.interests[0])||void 0===s?void 0:s.amount,p=null==t||null===(r=t.pendingAmount)||void 0===r||null===(l=r.interests[1])||void 0===l?void 0:l.amount;let u={};return c&&(u={headerMainText:"loan-payment-header-detail",headerMainEventRight:"close-loan-payment-detail-page",loanPaymentDescription:"loan-payment-detail-options-header",loanPaymentPrimaryHeaderHasHelp:!0,loanPaymentListDescription:[{label:this.t("loan-payment-number-receipts",{penddingPayment:c,totalInstallments:d}),class:"emphasis"},{label:"loan-payment-first-text-settlement",language:this.language,amount:m,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-second-text-settlement",language:this.language,amount:p,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{class:"emphasis-description  emphasis-amount",label:"loan-payment-multistep-options-first-title",language:this.language,amount:h,currencyCode:this.currencyCode,localCurrency:this.localCurrency,class:"emphasis",toPay:!0}]}),u}_loanPaymentOtherAmountConfiguration(t){var e,a,i,n,o,s,r,l,c,d,h,m,p,u,g,y;const b=Number(null==t||null===(e=t.currentInstallment)||void 0===e?void 0:e.number),v=Number(null==t||null===(a=t.totalInstallmentsNumber)||void 0===a?void 0:a.total),f=null==t||null===(i=t.currentInstallment)||void 0===i||null===(n=i.totals[0])||void 0===n?void 0:n.amount,_=null==t||null===(o=t.pendingAmount)||void 0===o||null===(s=o.interests[0])||void 0===s?void 0:s.amount,C=null==t||null===(r=t.pendingAmount)||void 0===r||null===(l=r.interests[1])||void 0===l?void 0:l.amount,$=null==t||null===(c=t.pendingAmount)||void 0===c||null===(d=c.interests[2])||void 0===d?void 0:d.amount,S=null==t||null===(h=t.pendingAmount)||void 0===h||null===(m=h.interests[3])||void 0===m?void 0:m.amount,x=null==t||null===(p=t.pendingAmount)||void 0===p||null===(u=p.interests[4])||void 0===u?void 0:u.amount,P=(null==t||null===(g=t.totalInstallmentsNumber)||void 0===g?void 0:g.overdue)>0,k=Number(null==t||null===(y=t.lastInstallment)||void 0===y?void 0:y.number);this._analyticsOtherAmount=f;return{headerMainText:"loan-payment-multistep-options-second-title",primaryButtonEvent:!b||k===b&&0===f?"radio-buttons-page":"other-amount-detail",headerMainEventRight:"close-loan-payment-other-amount-page",loanPaymentDescription:"loan-payment-other-amount-header-category",loanPaymentPrimaryHeaderHasHelp:P,loanPaymentSecondaryDescription:P?"":"loan-payment-multistep-summary-step-header",loanPaymentInputConfiguration:{infoMessage:b?"loan-payment-other-amount-error-first-message":"loan-payment-anticipate-payment",maxAmount:b?f:0,label:b?"loan-payment-import":"loan-payment-amount",errorMessage:b?"loan-payment-amount-different":"",localCurrency:this.localCurrency,currencyCode:this.currencyCode,belowCeroErrorMessage:"loan-payment-import-minimum",textPayment:b?"loan-payment-payment-amount":"loan-payment-label-amount",language:this.language},loanPaymentExtraDescription:P?"loan-payment-tickets":"",loanPaymentListDescription:P?[{label:"loan-payment-first-text-settlement",language:this.language,amount:_,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-second-text-settlement",language:this.language,amount:C,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-interest-iva",language:this.language,amount:$,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-mora",language:this.language,amount:S,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-mora-interes",language:this.language,amount:x,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-multistep-options-overdue-first-title",language:this.language,amount:f,class:"emphasis-amount",showDivider:!0,currencyCode:this.currencyCode,localCurrency:this.localCurrency,class:"emphasis-description emphasis-amount",toPay:!0}]:[{label:this.t("loan-payment-number-receipts",{penddingPayment:b,totalInstallments:v}),class:"emphasis-description",language:this.language,amount:f,currencyCode:this.currencyCode,localCurrency:this.localCurrency}],loanPaymentPrimaryMessages:P?[{message:"loan-payment-amount-anticipate"}]:[]}}_loanPaymentOtherAmountDetailConfiguration(t,e){var a,i,n,o,s,r,l,c,d,h,m,p,u,g,y,b,v,f,_;const C=Number(null==t||null===(a=t.currentInstallment)||void 0===a?void 0:a.number),$=Number(null==t||null===(i=t.totalInstallmentsNumber)||void 0===i?void 0:i.total),S=null==t||null===(n=t.currentInstallment)||void 0===n||null===(o=n.totals[0])||void 0===o?void 0:o.amount,x=null==t||null===(s=t.pendingAmount)||void 0===s||null===(r=s.interests[0])||void 0===r?void 0:r.amount,P=null==t||null===(l=t.pendingAmount)||void 0===l||null===(c=l.interests[1])||void 0===c?void 0:c.amount,k=null==t||null===(d=t.pendingAmount)||void 0===d||null===(h=d.interests[2])||void 0===h?void 0:h.amount,T=null==t||null===(m=t.pendingAmount)||void 0===m||null===(p=m.interests[3])||void 0===p?void 0:p.amount,E=null==t||null===(u=t.pendingAmount)||void 0===u||null===(g=u.interests[4])||void 0===g?void 0:g.amount,A=(null==t||null===(y=t.totalInstallmentsNumber)||void 0===y?void 0:y.overdue)>0,w=_t(!1,null==e||null===(b=e.breakDown)||void 0===b||null===(v=b.outstandingBalance)||void 0===v?void 0:v.amount),I=_t(!1,null==e||null===(f=e.breakDown)||void 0===f||null===(_=f.total)||void 0===_?void 0:_.amount),L=I>=S;let M="";M=L?"loan-payment-payment-current":"loan-payment-import-receive";let R=[{message:`${M}`}];return L||(R[0].amountMessage={amount:w,currencyCode:this.currencyCode,localCurrency:this.localCurrency,language:this.language}),{headerMainText:"loan-payment-multistep-options-second-title",primaryButtonEvent:"other-amount-detail",headerMainEventRight:"close-other-amount-detail-page",loanPaymentDescription:"loan-payment-other-amount-header-category",loanPaymentPrimaryHeaderHasHelp:A,loanPaymentSecondaryDescription:A?"":"loan-payment-multistep-summary-step-header",loanPaymentExtraDescription:A?"loan-payment-tickets":"",isPaymentInstallment:!0,modeId:L?1:3,loanPaymentListDescription:A?[{label:"loan-payment-first-text-settlement",language:this.language,amount:x,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-second-text-settlement",language:this.language,amount:P,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-interest-iva",language:this.language,amount:k,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-mora",language:this.language,amount:T,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-mora-interes",language:this.language,amount:E,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{label:"loan-payment-multistep-options-overdue-first-title",language:this.language,amount:S,class:"emphasis-amount",showDivider:!0,currencyCode:this.currencyCode,localCurrency:this.localCurrency,class:"emphasis",toPay:!0}]:[{label:this.t("loan-payment-number-receipts",{penddingPayment:C,totalInstallments:$}),language:this.language,amount:S,currencyCode:this.currencyCode,localCurrency:this.localCurrency,class:"emphasis"},{label:"loan-payment-panel-button-label",language:this.language,amount:I,currencyCode:this.currencyCode,localCurrency:this.localCurrency,class:"emphasis",toPay:!0}],loanPaymentSummaryDescription:[{class:"",label:A?"loan-payment-total":"loan-payment-receipt-amount-text",language:this.language,amount:S,currencyCode:this.currencyCode,localCurrency:this.localCurrency},{class:"",label:"loan-payment-panel-button-label",language:this.language,amount:I,currencyCode:this.currencyCode,localCurrency:this.localCurrency,toPay:!0},{class:"",label:"loan-payment-pending-payment",language:this.language,amount:w,currencyCode:this.currencyCode,localCurrency:this.localCurrency}],loanPaymentSummaryTicket:{labelSelected:this.t("loan-payment-multistep-options-second-title"),secondInfoMessage:this.t("loan-payment-info-remember-complete"),secondInfoMessageHidden:L||A,summaryTicketList:L&&!A?[{label:this.t("loan-payment-number-receipts",{penddingPayment:C,totalInstallments:$}),language:this.language,amount:S,currencyCode:this.currencyCode,localCurrency:this.localCurrency,class:"emphasis"}]:A?[{label:"loan-payment-pending-payment",language:this.language,amount:w,currencyCode:this.currencyCode,localCurrency:this.localCurrency,class:"emphasis"}]:[{label:this.t("loan-payment-number-receipts",{penddingPayment:C,totalInstallments:$}),language:this.language,amount:S,currencyCode:this.currencyCode,localCurrency:this.localCurrency,class:"emphasis"},{label:"loan-payment-pending-payment",language:this.language,amount:w,currencyCode:this.currencyCode,localCurrency:this.localCurrency,class:"emphasis"}]},loanPaymentSecondaryMessages:R}}_loanPaymentTicketPageConfiguration(t,e,a,i,n){var o,s,r;return{operationDate:null==t?void 0:t.operationDate,id:null==t?void 0:t.id,amount:(null==t||null===(o=t.breakDown)||void 0===o||null===(s=o.total)||void 0===s?void 0:s.amount)||(null==t||null===(r=t.paymentAmount)||void 0===r?void 0:r.amount),secondInfoMessageTitle:null==e?void 0:e.secondInfoMessageTitle,secondInfoMessage:null==e?void 0:e.secondInfoMessage,secondInfoMessageHidden:null==e?void 0:e.secondInfoMessageHidden,headerMainEventRight:"close-ticket",number:null==n?void 0:n.number,cardNumber:a,cardTitle:i,labelSelected:null==e?void 0:e.labelSelected,summaryTicket:(null==e?void 0:e.summaryTicketList)||[]}}_setAmout(t){this._amountToPay=t.detail,this.dispatchEvent(new CustomEvent("persist-data-analytics",{detail:{amount:this._amountToPay}}))}_setSuccesPaymentStep(t){const[{amount:e}]=t.filter((t=>t.toPay));this._amountToPay=e,this._summaryPaymetList=t,this.goNavigation("homePage"),this.requestUpdate()}_loanPaymentRadioButtonsConfiguration(t,e){return{headerMainEventRight:"close-radio-buttons-page",amount:t,currencyCode:this.currencyCode,language:this.language,localCurrency:this.localCurrency,loanPaymentSummaryTicket:{labelSelected:this.t("loan-payment-multistep-options-second-title"),secondInfoMessage:this.t("loan-payment-info-remember-complete"),secondInfoMessageHidden:!1,summaryTicketList:[{label:this.t("loan-payment-reduction-type"),description:"INSTALLMENT_AMOUNT_REDUCTION"===e?"loan-payment-reduction-type-cuota":"loan-payment-reduction-type-plazo"}]}}}_handlePaymentSimulateAmortizationRequest(t){t.stopPropagation(),this.isLoanding=!0,this._requestSimulateAmortization({paymentAmount:{amount:_t(!0,this._amountToPay),currency:this.localCurrency},amortizationType:{id:this._amortizationId}})}_setInstallmentMode(t){this._modeId=t.detail,this.requestUpdate()}_setSummaryPaymentTicket(t){t.stopPropagation(),this._summaryPaymetTicket=t.detail,this.requestUpdate()}_setIsPaymentInstallment(t){this._isPaymentInstallment=t.detail,this.requestUpdate()}_setListCompletedStepOne(t){t.stopPropagation(),this._setSuccesPaymentStep(t.detail)}_handleAmountDetailPage(t){this.isLoanding=!0,this._requestSimulateInstallment({paymentAmount:{amount:_t(!0,this._amountToPay),currency:this.localCurrency}}),this.goNavigation("otherAmountDetailPage")}_handlePaymentSimulateInstallment(t){this._simulatePaymentInstallment=t.detail,this.isLoanding=!1,this.requestUpdate()}_amortizationIdEvent(t){this._amortizationId=t.detail,this.requestUpdate()}_loanPaymentSetlementConfiguration(t){var e,a,i;const n=null==t||null===(e=t.pendingAmount)||void 0===e||null===(a=e.totals[0])||void 0===a?void 0:a.amount,o=null==t||null===(i=t.totalInstallmentsNumber)||void 0===i?void 0:i.pending,s={message:this.t("loan-payment-message-settlement",{pendingNumberInstallment:o})};return this._analyticsSetleAmount=n,{headerMainText:"loan-payment-multistep-options-third-title",loanPaymentPrimaryHeaderHasHelp:n,headerMainEventRight:"close-loan-payment-setlement-page",loanPaymentDescription:"loan-payment-other-amount-header-category",amortizationId:"PAY_OFF",isPaymentInstallment:!1,loanPaymentListDescription:[{label:"loan-payment-panel-button-label",language:this.language,amount:n,currencyCode:this.currencyCode,localCurrency:this.localCurrency,class:"emphasis",toPay:!0}],loanPaymentSummaryDescription:[{label:"loan-payment-panel-button-label",language:this.language,amount:n,currencyCode:this.currencyCode,localCurrency:this.localCurrency,class:"emphasis-amount",toPay:!0}],loanPaymentSummaryTicket:{labelSelected:this.t("loan-payment-multistep-options-third-title"),secondInfoMessageTitle:this.t("loan-payment-congratulations"),secondInfoMessage:this.t("loan-payment-info-liquidated"),secondInfoMessageHidden:!1,summaryTicketList:[]},loanPaymentSecondaryMessages:[s]}}get _loanApiProvider(){return f`
      <bbva-dataprovider-loans
        .host=${this.host}
        api-version="1"
        .requiredToken=${this.requiredToken}
        ?native=${this.native}
        .loanId=${this.loanId}
        .headers=${this.headers}
        @get-loan-detail-v1-success=${this._handleOnSuccesLoanDetail}
        @get-loan-detail-v1-error=${this._handleOnErrorLoanDetail}
        @post-payment-installment-simulate-v1-success=${this._handlePaymentSimulateInstallment}
        @post-payment-installment-simulate-v1-error=${this._handleOnErrorLoanSimulate}
        @post-payment-installment-v1-success=${this._showTicket}
        @post-loan-payment-amortizations=${this._showTicket}
        @error-on-post-loan-payment-amortizations=${this._handleOnErrorLoanSignature}
        @post-loan-payment-amortizations-simulation=${this._handlePaymentSimulateAmortization}
        @error-on-post-loan-payment-amortizations-simulation=${this._handleOnErrorLoanSimulate}
        @post-payment-installment-v1-error=${this._handleOnErrorLoanSignature}
      >
      </bbva-dataprovider-loans>
    `}get _accontsApiProvider(){return f`
      <bbva-dataprovider-accounts
        .host=${this.host}
        version="1"
        .requiredToken=${this.requiredToken}
        ?native=${this.native}
        .loanId=${this.loanId}
        .headers=${this.headers}
        @set-accounts=${this._setAccounts}
        @error-on-get-accounts=${()=>this._onErrorAccounts=!0}
      >
      </bbva-dataprovider-accounts>
    `}goNavigation(t){for(const e in this.pages)this.pages[e].show=this.pages[e].id===t;this.requestUpdate()}get _multiStepsPage(){return this._multiStepElement||(this._multiStepElement=this.shadowRoot.querySelector('[data-tag-name="loan-payment-multi-step"]')),this._multiStepElement}get _loanModalManager(){return this._loanModalManagerElement||(this._loanModalManagerElement=this.shadowRoot.querySelector('[data-tag-name="loan-modal-manager"]')),this._loanModalManagerElement}fullModalFooterFixed(){this._loanModalManager.openWithSettings({bbvaHelpModalClass:"modal-content-wrapper smaller-spaces",modalId:"footer-fixed",fullHeightModal:!0,fixedFooterModal:!0,headerTypeModal:"modal-three-level",hideContentPaddingTopModal:!0,iconRightPrimaryHeaderModal:R(),headerTextModal:"loan-payment-modal-header",titleIconModal:G(),bodyTextModal:this.t("loan-payment-modal-first-text"),listTextModal:[{text:this.t("loan-payment-modal-second-text")},{text:this.t("loan-payment-modal-third-text")}],buttonTextModal:this.t("loan-button-close")})}shouLeave(){this.dispatchEvent(new CustomEvent(`${Ke.is}-change-header`,{bubbles:!0,composed:!0,detail:"dark-blue-bg"})),this._amountToPay>0?this._loanModalManager.openWithSettings({modalId:"leave-feature",modalType:"warning",titleIconModal:q(),bodyTextModal:this.t("loan-payment-confirm-to-exit"),buttonTextModal:this.t("loan-button-continue"),linkTextModal:this.t("loan-payment-cancel")}):this.exitFeature()}_resetSteps(t){null==t||t.stopPropagation(),this._multiStepsPage.willResetStepOne(),this._multiStepsPage.willResetStepTwo(),this._summaryPaymetList=[],this._loanInput.resetInput(),this.requestUpdate()}_resetOtherAmountPage(){this._loanInput.resetInput(),this.goNavigation("otherAmountPage")}get _loanInput(){if(!this._inputAmount){const t=this.shadowRoot.querySelector('[data-tag-name="loan-payment-other-amount-form"]');this._inputAmount=t.shadowRoot.querySelector("loan-amount-input")}return this._inputAmount}_resetFeature(){this.isLoanding=!0,this._amountToPay=0,this.accounts=[],this._amortizationId="",this._account="",this._isPaymentInstallment=!1,this._modeId="",this._cardTitleSelected="",this._paymentResponse={},this._summaryPaymetTicket={},this.loanId="",this.loanDetail={},this.goNavigation("homePage"),this._resetSteps()}exitFeature(){this._resetFeature(),this.dispatchEvent(new CustomEvent("exit",{detail:!0,bubbles:!0,composed:!0}))}_openModalInfo(){this._loanModalManager.openWithSettings({modalId:"modal-info",fullHeightModal:!0,fixedFooterModal:!0,headerTypeModal:"modal",hideContentPaddingTopModal:!0,iconRightPrimaryHeaderModal:R(),headerTextModal:this.t("loan-payment-modal-header"),titleIconModal:G(),bodyTextModal:this.t("loan-payment-modal-first-text"),listTextModal:[{text:this.t("loan-payment-modal-second-text")},{text:this.t("loan-payment-modal-third-text")}],buttonTextModal:this.t("loan-button-close")})}_confirmChangePaymentOption(){this._loanModalManager.openWithSettings({bbvaHelpModalClass:"golden-icon",modalId:"change-payment-option",titleIconModal:et(),bodyTextModal:this.t("loan-payment-update-data"),buttonTextModal:this.t("loan-button-continue"),linkTextModal:this.t("loan-payment-cancel")})}_callBbvaSupport(){this.dispatchEvent(new CustomEvent(`${Ke.is}-call-bbva-support`,{composed:!0,bubbles:!0,detail:{value:this.bbvaSuportNumber}}))}_sendAnalyticsStep(t,e,a){this.dispatchEvent(new CustomEvent("send-analytics-step-data",{composed:!0,bubbles:!0,detail:{currentStep:t,amount:e,currency:a,process:"pesos mexicanos"}}))}render(){return f`
      ${this._loanApiProvider} ${this._accontsApiProvider}
      <bbva-foundations-spinner class="fullscreen-spinner" with-mask ?hidden=${!this.isLoanding}>
      </bbva-foundations-spinner>

      <bbva-transition-container id="loanPaymentMultiStepPage" ?visible=${this.pages.homePage.show}>
        <div slot="slot-content" class="container">
          <bbva-header-main
            text="${this.t("loan-payment-ticket-header-main")}"
            variant="modal"
            icon-right-primary="${R()}"
            accessibility-text-icon-right-primary=${this.t("loan-payment-accesibility-close-icon")}
            @header-main-icon-right-primary-click=${this.shouLeave}
          >
          </bbva-header-main>

          <loan-payment-multi-step
            .loanDetail=${this.loanDetail}
            .language=${this.language}
            .amount=${this._amountToPay}
            .summaryPaymentList=${this._summaryPaymetList}
            .localCurrency=${this.localCurrency}
            .currencyCode=${this.currencyCode}
            .accounts=${this._formatAccounts(this.accounts,this._amountToPay)}
            ?errorAccounts=${this._onErrorAccounts}
            @loan-payment-multi-step-account-selected=${this._setAccount}
            @loan-payment-account-selected=${t=>this._account=t.detail}
            @loan-payment-account-selected-card-title=${this._setCardTitleSelected}
            @loan-list-account-go-accounts-page=${()=>this.goNavigation("accountsPage")}
            @loan-button-group-request-payment=${()=>this._pay()}
            @loan-payment-options-recipt-amount=${()=>this.goNavigation("recepitAmountPage")}
            @loan-payment-options-other-amount=${()=>this.goNavigation("otherAmountPage")}
            @loan-payment-options-settle-amount=${()=>this.goNavigation("setlementPage")}
            @loan-button-group-confirm-change-home=${this._confirmChangePaymentOption}
            @loan-notification-error-retry=${this._getCustomerAccounts}
            @loan-notification-error-call-bbva=${this._callBbvaSupport}
            @loan-payment-multi-step-account-step-active=${()=>this._sendAnalyticsStep("3","","")}
            @loan-button-group-will-change=${()=>this._sendAnalyticsStep("3","","")}
            @expandable-multistep-all-complete=${t=>{t.detail&&this._sendAnalyticsStep("4","","")}}
          >
          </loan-payment-multi-step>
        </div>
      </bbva-transition-container>

      <bbva-transition-container
        id="loanPaymentReciptAmountPage"
        ?visible=${this.pages.recepitAmountPage.show}
        @transition-container-open=${()=>{this._sendAnalyticsStep("2",this._analyticsReciptAmount,this.localCurrency)}}
        >
        <div slot="slot-content" class="container">
          <loan-payment-recipt-amount-page
            @loan-payment-recipt-amount-page-close-loan-payment-recipt-amount-page=${()=>this.goNavigation("homePage")}
            .loanPaymentReciptAmountPageConfiguration=${this._loanPaymentReciptAmountConfiguration(this.loanDetail)}
            @loan-button-group-close-recipt-amount-page=${()=>this.goNavigation("homePage")}
            @header-category-help-click=${this.fullModalFooterFixed}
            @loan-payment-description=${this._openModalInfo}
            @loan-payment-recipt-amount-page-set-summary-payment-ticket=${this._setSummaryPaymentTicket}
            @loan-payment-recipt-amount-page-list-description=${this._setListCompletedStepOne}
            @loan-payment-recipt-amount-page-set-installment-mode=${this._setInstallmentMode}
            @loan-payment-recipt-amount-page-set-is-payment-installment=${this._setIsPaymentInstallment}
            @loan-payment-description-go-recepit-detail=${()=>this.goNavigation("detailPage")}
          >
          </loan-payment-recipt-amount-page>
        </div>
      </bbva-transition-container>

      <bbva-transition-container
        id="loanPaymentSetlementPage"
        ?visible=${this.pages.setlementPage.show}
        @transition-container-open=${()=>{this._sendAnalyticsStep("2",this._analyticsSetleAmount,this.localCurrency)}}
      >
        <div slot="slot-content" class="container">
          <loan-payment-setlement-page
            @loan-payment-setlement-page-close-loan-payment-setlement-page=${()=>this.goNavigation("homePage")}
            .loanPaymentSetlementPageConfiguration=${this._loanPaymentSetlementConfiguration(this.loanDetail)}
            @loan-payment-setlement-page-set-summary-payment-ticket=${this._setSummaryPaymentTicket}
            @loan-button-group-close-setlement-page=${()=>this.goNavigation("homePage")}
            @loan-payment-setlement-page-list-description=${this._setListCompletedStepOne}
            @loan-payment-setlement-page-set-payment-amortization=${this._amortizationIdEvent}
            @loan-payment-setlement-page-set-is-payment-installment=${this._setIsPaymentInstallment}
            @header-category-help-click=${this.fullModalFooterFixed}
          >
          </loan-payment-setlement-page>
        </div>
      </bbva-transition-container>

      <bbva-transition-container
        id="loanPaymentOtherAmountPage"
        ?visible=${this.pages.otherAmountPage.show}
        @transition-container-open=${()=>{this._sendAnalyticsStep("2",this._analyticsOtherAmount,this.localCurrency)}}
      >
        <div slot="slot-content" class="container">
          <loan-payment-other-amount-form
            @loan-payment-other-amount-form-close-loan-payment-other-amount-page=${()=>this.goNavigation("homePage")}
            .loanPaymentOtherAmountConfiguration=${this._loanPaymentOtherAmountConfiguration(this.loanDetail)}
            @loan-payment-other-amount-form-amount=${this._setAmout}
            @loan-payment-other-amount-form-radio-buttons-page=${()=>this.goNavigation("radioButtonsPage")}
            @loan-payment-other-amount-form-other-amount-detail=${this._handleAmountDetailPage}
            @header-category-help-click=${this.fullModalFooterFixed}
          >
          </loan-payment-other-amount-form>
        </div>
      </bbva-transition-container>

      <bbva-transition-container
        id="loanRadioButtonsPage"
        ?visible=${this.pages.radioButtonsPage.show}
      >
        <div slot="slot-content" class="container">
          <loan-radio-buttons-page
            @loan-radio-buttons-page-request-simulate-amortization=${this._handlePaymentSimulateAmortizationRequest}
            @loan-radio-buttons-page-close-radio-buttons-page=${this._resetOtherAmountPage}
            @loan-radio-buttons-page-set-summary-payment-ticket=${this._setSummaryPaymentTicket}
            @loan-radio-buttons-page-set-amortization-id=${this._amortizationIdEvent}
            .loanPaymentRadioButtonsConfiguration=${this._loanPaymentRadioButtonsConfiguration(this._amountToPay,this._amortizationId)}
            @loan-button-group-change-amount=${this._resetOtherAmountPage}
          >
          </loan-radio-buttons-page>
        </div>
      </bbva-transition-container>

      <bbva-transition-container
        id="loanOtherAmountDetailPage"
        ?visible=${this.pages.otherAmountDetailPage.show}
      >
        <div slot="slot-content" class="container">
          <loan-other-amount-detail-page
            @header-category-help-click=${this.fullModalFooterFixed}
            @loan-other-amount-detail-page-close-other-amount-detail-page=${this._resetOtherAmountPage}
            @loan-other-amount-detail-page-list-description=${this._setListCompletedStepOne}
            .loanPaymentOtherAmountDetailConfiguration=${this._loanPaymentOtherAmountDetailConfiguration(this.loanDetail,this._simulatePaymentInstallment)}
            @loan-button-group-close-detail-other-amount=${this._resetOtherAmountPage}
            @loan-other-amount-detail-page-set-summary-payment-ticket=${this._setSummaryPaymentTicket}
            @loan-other-amount-detail-page-set-installment-mode=${this._setInstallmentMode}
            @loan-other-amount-detail-page-set-is-payment-installment=${this._setIsPaymentInstallment}
          >
          </loan-other-amount-detail-page>
        </div>
      </bbva-transition-container>

      <bbva-transition-container id="loanAccountsPage" ?visible=${this.pages.accountsPage.show}>
        <div slot="slot-content" class="container">
          <loan-payment-accounts-page
            @loan-payment-accounts-page-close=${()=>this.goNavigation("homePage")}
            @loan-payment-account-selected-card-title=${this._setCardTitleSelected}
            @loan-account-item-selected=${t=>{this._multiStepsPage.setSelectedAccount(t),this.goNavigation("homePage")}}
            .accounts=${this._formatAccounts(this.accounts,this._amountToPay)}
            @loan-button-group-close-accounts=${()=>this.goNavigation("homePage")}
          >
          </loan-payment-accounts-page>
        </div>
      </bbva-transition-container>

      <bbva-transition-container id="loanPaymentDetailPage" ?visible=${this.pages.detailPage.show}>
        <div slot="slot-content" class="container">
          <loan-payment-detail-page
            @loan-payment-detail-page-close-loan-payment-detail-page=${()=>this.goNavigation("recepitAmountPage")}
            .loanPaymentDetailPageConfiguration=${this._loanPaymentDetailConfiguration(this.loanDetail)}
            @header-category-help-click=${this.fullModalFooterFixed}
            @loan-button-group-close-loan-payment-detail-pages=${()=>this.goNavigation("recepitAmountPage")}
            @loan-payment-detail-page-set-installment-mode=${this._setInstallmentMode}
            @loan-payment-detail-page-set-is-payment-installment=${this._setIsPaymentInstallment}
          >
          </loan-payment-detail-page>
        </div>
      </bbva-transition-container>

      <bbva-transition-container id="loanPaymentTicketPage" ?visible=${this.pages.ticketPage.show}>
        <div slot="slot-content" class="container">
          <loan-payment-ticket-page
            @loan-payment-ticket-page-close-ticket=${this.exitFeature}
            @loan-button-group-close-loan-payment-detail-page=${this.exitFeature}
            .language=${this.language}
            .localCurrency=${this.localCurrency}
            .loanPaymentTicketPageConfiguration=${this._loanPaymentTicketPageConfiguration(this._paymentResponse,this._summaryPaymetTicket,this._account,this._cardTitleSelected,this.loanDetail)}
            .email=${this.email}
          ></loan-payment-ticket-page>
        </div>
      </bbva-transition-container>

      <loan-modal-manager
        @loan-modal-manager-accept-button-change-payment-option=${this._resetSteps}
        @loan-modal-manager-accept-button-leave-feature=${this.exitFeature}
      >
      </loan-modal-manager>
    `}}customElements.define(Ke.is,Ke);class Je extends Ke{static get is(){return"bbva-feature-loan-payment-mx"}static get properties(){return{...super.properties,parametersFromPushNotification:{type:Object},financialOverviewDetails:{type:Object},featureFlagCollection:{type:Object},checkPushNotificationsFlagKey:{type:String}}}constructor(){super(),this.parametersFromPushNotification={},this.financialOverviewDetails={},this.featureFlagCollection={},this.checkPushNotificationsFlagKey="glomo.loans.loanPaymentRisksCollection"}updated(t){if(super.updated(t),t.has("loanId")&&Object.values(this.parametersFromPushNotification).length){this.getLoanIdFromPushNotification(),this.parametersFromPushNotification={},this.financialOverviewDetails={};this.isPushEnabled(this.featureFlagCollection)||this.dispatchEvent(new CustomEvent("navigation-to-dashboard",{bubbles:!0,composed:!0,detail:!0}))}}isPushEnabled(t){var e;return(null===(e=t[this.checkPushNotificationsFlagKey])||void 0===e?void 0:e.value)||!1}getLoanIdFromPushNotification(){const t=this.getTerminationValue(),e=this.getContract(t);this.setLoanId(e)}getTerminationValue(){var t,e;const a=null===(t=this.parametersFromPushNotification)||void 0===t||null===(e=t.filter)||void 0===e?void 0:e.args,i=null==a?void 0:a.find((t=>t.includes("terminationValue"))),[,n]=i.split("=");return n}getContract(t){var e,a;return(null===(e=this.financialOverviewDetails)||void 0===e||null===(a=e.data)||void 0===a?void 0:a.contracts).find((e=>e.number.slice(-t.length)===t))}setLoanId(t){this.loanId=t.id}}customElements.define(Je.is,Je);
