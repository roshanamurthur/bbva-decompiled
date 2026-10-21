import{z as t,a8 as e,ac as a,ad as i,ar as r,aa as o,a9 as n,a as s,an as l,aJ as c,L as d,F as h,ag as b,ak as p,h as v,g as m,b0 as g,b1 as u,aM as f,b6 as y,aN as x,ah as _,i as $,aD as S,aO as k,o as C,f as F,ab as L,aI as w,be as M,cs as I,af as T,aH as R,bF as E,dw as V,cu as A,J as D,cR as P,bU as z,cS as B,av as q,m as O,cG as N,j as H,l as G,r as U,H as j,aX as W,A as X,b5 as Y,cH as Q,D as J,a$ as Z,ci as K,cW as tt,cV as et,ey as at,aV as it,bl as rt,dk as ot,b4 as nt,bh as st,dy as lt,bV as ct,bc as dt,a_ as ht,cQ as bt,W as pt}from"./952f98a9.js";import{aM as vt,t as mt,aN as gt,a$ as ut,bt as ft,a7 as yt,u as xt,c5 as _t}from"./7f3d7ca9.js";import{B as $t,c as St}from"./29a2800d.js";import"./84af4f94.js";import{B as kt,b as Ct}from"./0efe7f4c.js";import"./c9f15469.js";import{ez as Ft,eA as Lt,eB as wt,ex as Mt,eC as It,eD as Tt,eE as Rt,eF as Et}from"./216055dc.js";import{B as Vt,b as At}from"./ca32b966.js";import"./0ef545a5.js";import{B as Dt}from"./a7c05d27.js";import{b as Pt,B as zt}from"./96b40574.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./afb1d3bc.js";class Bt extends Ft{constructor(t=null){super(Object.assign(t||{},{method:"PUT"}))}toString(t=""){return super.toString(t||"BGADPRequestPUT")}}class qt extends Lt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`relevant-facts/v${this.version}/relevant-facts/configurations`)}toString(){return super.toString("BGADPRelevantFactsConfigurationsGetV0")}}class Ot extends Bt{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`relevant-facts/v${this.version}/relevant-facts/configurations`)}toString(){return super.toString("BGADPRelevantFactsConfigurationsPutV0")}}let Nt=class extends wt{static get is(){return"bbva-global-relevant-facts-configurations-api-dm"}static get properties(){return{relevantFactsConfigurations:{type:Array,attribute:!1}}}constructor(){super(),this.relevantFactsConfigurations=[]}resetRelevantFactsConfigurations(){this.relevantFactsConfigurations=[]}getRelevantFactsConfigurations(t={}){if(!Object.keys(this.relevantFactsConfigurations).length){this._generateGetService(this._getService("get",{},t),{customEvent:"relevant-facts-configurations-api-dm-fetch",errorFireEventHandler:"relevant-facts-configurations-api-dm-fetch-error"},this._responseMapping,t.fields)}}putRelevantFactsConfigurations(t){this._generateGetService(this._getService("put",t),{customEvent:"relevant-facts-configurations-api-dm-update",errorFireEventHandler:"relevant-facts-configurations-api-dm-update-error"},this._responseMapping),this.resetRelevantFactsConfigurations()}_getService(t,e={},a={}){var i=this._getServiceParams(a,e);return this._getServicePath(t+"RelevantFactsConfigurations",this._getBgadp(i))}_getBgadp(t){return{getRelevantFactsConfigurationsV0:()=>new qt(t),putRelevantFactsConfigurationsV0:()=>new Ot(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}};const Ht=new r;var Gt=t`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${e(n.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${e(n.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${e(n.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${e(n.secondary200)})));
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
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${e(a.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${e(i.type3XSmall)}));
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
${Ht.mediaRules()}`;var Ut=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new r).mediaRules()}`;const jt=new r;const Wt={dark:t`
    ${t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${e(n.primaryCoreLight)});
}
${jt.mediaRules()}`}
  `,light:t`
    ${Ut}
  `};let Xt=class extends(s(l(c(d)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":h,"bbva-text":b}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,Gt,Wt.dark,Wt.light,p("bbva-notification-help-shared-styles")]}render(){return v`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}};m("colors.primarySubduedLight"),m("colors.cool20"),m("colors.tertiaryType1Light"),m("colors.primaryCoreLightened"),m("colors.tertiaryType6Light"),m("colors.cool20"),m("colors.cool50");const Yt=new r;var Qt=t`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${e(n.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${e(n.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${e(a.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${Yt.mediaRules()}`;const Jt=new r;var Zt=t`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${e(n.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${e(n.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${e(n.primaryMediumLight)});
}
${Jt.mediaRules()}`;var Kt=t`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new r).mediaRules()}`;const te={dark:t`
    ${Zt}
    ${vt.dark}
    ${g.dark}
    ${Wt.dark}
    ${u.dark}
  `,light:t`
    ${Kt}
    ${vt.light}
    ${g.light}
    ${Wt.light}
    ${u.light}
  `};let ee=class extends(s(l(f(d)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":mt,"bbva-notification-help":Xt,"bbva-text":b,"bbva-link":y}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=x(),this.errorIconSize=16,this.infoIcon=_(),this.infoIconSize=16,this.name=`form-radio-group-${((t=10)=>`${Math.random().toString(36).substr(2,t)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(t=>this._setRadioName(t)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(t){(((t||{}).detail||{}).contentSlots||[]).forEach((t=>{const e=(t||{}).assignedNodes;"bbva-form-radio-button"===(e.getAttribute("data-tag-name")||(e||{}).nodeName).toLowerCase()&&(e.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(t=>this._updateItems(t)))}updated(t){if(super.updated&&super.updated(t),t.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const t=this.radioItems.find((t=>t.checked));t&&(t.checked=!1)}t.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].disabled=this.disabled}))),t.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].invalid=this.invalid}))),t.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].readonly=this.readonly}))),t.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].required=!1})),this.radioItems[0].required=!0)}_updateItems(t){const e=this.radioItems.indexOf(t.target);this.selected=e,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:t.target.value,selected:e},bubbles:!0,composed:!0}))}_helpClicked(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?v`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${$(this.linkHref)}"
          icon="${S()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const t=this.t(this.labelOut);return v`
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
      `}return""}static get styles(){return[Qt,p("bbva-form-radio-group-shared-styles"),te.dark,te.light]}render(){return v`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((t=>v`
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
              ${t.text?k(t.text):t.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?v`
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
    `}};m("colors.primarySubdued"),m("colors.primaryMediumLight"),m("colors.primaryCoreLightened");const ae=new r;var ie=t`:host {
  display: block;
  box-sizing: border-box;
  --_form-textarea-field-bg-color: var(--bbva-form-textarea-dark-mode-field-bg-color, var(--bbva-form-textarea-field-bg-color, var(--ambientsLight100, ${e(w.light100)})));
  --_form-textarea-field-border-color: var(--bbva-form-textarea-dark-mode-field-border-color, var(--bbva-form-textarea-field-border-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_form-textarea-focused-field-border-color: var(--bbva-form-textarea-dark-mode-focused-field-border-color, var(--bbva-form-textarea-focused-field-border-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_form-textarea-invalid-field-bg-color: var(--bbva-form-textarea-dark-mode-invalid-field-bg-color, var(--bbva-form-textarea-invalid-field-bg-color, var(--colorsTertiaryType5Lightened, ${e(n.tertiaryType5Lightened)})));
  --_form-textarea-invalid-field-border-color: var(--bbva-form-textarea-dark-mode-invalid-field-border-color, var(--bbva-form-textarea-invalid-field-border-color, var(--colorsTertiaryType5Medium, ${e(n.tertiaryType5Medium)})));
  --_form-textarea-textarea-color: var(--bbva-form-textarea-dark-mode-textarea-color, var(--bbva-form-textarea-textarea-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_form-textarea-readonly-textarea-color: var(--bbva-form-textarea-dark-mode-readonly-textarea-color, var(--bbva-form-textarea-readonly-textarea-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_form-textarea-invalid-textarea-color: var(--bbva-form-textarea-dark-mode-invalid-textarea-color, var(--bbva-form-textarea-invalid-textarea-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_form-textarea-label-color: var(--bbva-form-textarea-dark-mode-label-color, var(--bbva-form-textarea-label-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_form-textarea-focused-label-color: var(--bbva-form-textarea-dark-mode-focused-label-color, var(--bbva-form-textarea-focused-label-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_form-textarea-readonly-label-color: var(--bbva-form-textarea-dark-mode-readonly-label-color, var(--bbva-form-textarea-readonly-label-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_form-textarea-invalid-label-color: var(--bbva-form-textarea-dark-mode-invalid-label-color, var(--bbva-form-textarea-invalid-label-color, var(--colorsTertiaryType1Dark, ${e(n.tertiaryType1Dark)})));
  --_form-textarea-message-info-color: var(--bbva-form-textarea-dark-mode-message-info-color, var(--bbva-form-textarea-message-info-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_form-textarea-message-error-color: var(--bbva-form-textarea-dark-mode-message-error-color, var(--bbva-form-textarea-message-error-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_form-textarea-message-info-icon-color: var(--bbva-form-textarea-dark-mode-message-info-icon-color, var(--bbva-form-textarea-message-info-icon-color, var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)})));
  --_form-textarea-message-error-icon-color: var(--bbva-form-textarea-dark-mode-message-error-icon-color, var(--bbva-form-textarea-message-error-icon-color, var(--colorsTertiaryType1Dark, ${e(n.tertiaryType1Dark)})));
  --_form-textarea-message-info-counter-color: var(--bbva-form-textarea-dark-mode-message-info-counter-color, var(--bbva-form-textarea-message-info-counter-color, var(--colorsSecondary500, ${e(n.secondary500)})));
}

:host([disabled]) {
  opacity: 0.4;
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

.field {
  position: relative;
  max-height: calc(((17.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  background-color: var(--_form-textarea-field-bg-color);
  border-bottom: 1px solid var(--_form-textarea-field-border-color);
  border-radius: var(--bbva-form-textarea-field-border-radius, var(--borderRadiusSmall, ${e(M.small)}));
}
:host([focused]) .field {
  border-bottom-color: var(--_form-textarea-focused-field-border-color);
}
:host([invalid]) .field {
  background-color: var(--_form-textarea-invalid-field-bg-color);
  border-bottom-color: var(--_form-textarea-invalid-field-border-color);
}

.label,
.message,
.slot-textarea ::slotted(textarea) {
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(L.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(L.book.fontWeight)});
}

.label,
.slot-textarea ::slotted(textarea) {
  font-size: var(--typographyTypeSmall, ${e(a.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(i.typeSmall)});
}

.slot-textarea ::slotted(textarea) {
  will-change: transform;
  width: 100%;
  height: var(--area-height, calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem));
  min-height: calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  max-height: calc(((12.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  font-family: inherit;
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 15) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 15) * 1em);
  outline: none;
  resize: none;
  overflow-x: hidden;
  border: none;
  background: transparent;
  color: var(--_form-textarea-textarea-color);
}
:host([readonly]) .slot-textarea ::slotted(textarea) {
  color: var(--_form-textarea-readonly-textarea-color);
}
:host([invalid]) .slot-textarea ::slotted(textarea) {
  color: var(--_form-textarea-invalid-textarea-color);
}
:host([focused]) .slot-textarea ::slotted(textarea) {
  width: calc(100% - calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem));
}

.label {
  position: absolute;
  top: 0;
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 15) * 1em);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 15) * 1em);
  color: var(--_form-textarea-label-color);
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 15) * 1em));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_form-textarea-focused-label-color);
  transform: translateY(calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 15) * 1em)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_form-textarea-readonly-label-color);
}
:host([invalid]) .label {
  color: var(--_form-textarea-invalid-label-color);
}

.clear {
  display: none;
  position: absolute;
  top: 0;
  right: 0;
}
:host(:not([invalid])[focused]) .clear {
  display: flex;
}

.message {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 12) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 12) * 1em) 0;
  display: flex;
  align-items: center;
  font-size: var(--typographyType3XSmall, ${e(a.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${e(i.type3XSmall)});
}
.message.info {
  color: var(--_form-textarea-message-info-color);
}
.message.error {
  color: var(--_form-textarea-message-error-color);
}
.message.counter {
  justify-content: flex-end;
  color: var(--_form-textarea-message-info-counter-color);
}

:host([maxlength][info-message]) .message {
  margin-top: 0px;
}

.message-icon {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}
.info .message-icon {
  color: var(--_form-textarea-message-info-icon-color);
}
.error .message-icon {
  color: var(--_form-textarea-message-error-icon-color);
}
${ae.mediaRules()}`;const re=new r;var oe=t`[ambient^=light] {
  --bbva-form-textarea-field-bg-color: initial;
  --bbva-form-textarea-field-border-color: initial;
  --bbva-form-textarea-field-border-radius: initial;
  --bbva-form-textarea-invalid-field-bg-color: initial;
  --bbva-form-textarea-invalid-field-border-color: initial;
  --bbva-form-textarea-label-color: initial;
  --bbva-form-textarea-focused-label-color: initial;
  --bbva-form-textarea-readonly-label-color: initial;
  --bbva-form-textarea-invalid-label-color: initial;
  --bbva-form-textarea-textarea-color: initial;
  --bbva-form-textarea-invalid-textarea-color: initial;
  --bbva-form-textarea-readonly-textarea-color: initial;
  --bbva-form-textarea-message-info-color: initial;
  --bbva-form-textarea-message-error-color: initial;
  --bbva-form-textarea-message-info-icon-color: initial;
  --bbva-form-textarea-message-error-icon-color: initial;
}

[ambient=light100] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}
${re.mediaRules()}`;const ne=new r;const se={dark:t`
    ${t`[ambient^=dark] {
  --bbva-form-textarea-field-bg-color: #0a5393;
  --bbva-form-textarea-field-border-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-textarea-focused-field-border-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-textarea-field-border-radius: var(--borderRadiusSmall, ${e(M.small)});
  --bbva-form-textarea-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${e(n.tertiaryType5Lightened)});
  --bbva-form-textarea-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${e(n.tertiaryType5Medium)});
  --bbva-form-textarea-label-color: var(--colorsSecondary100, ${e(n.secondary100)});
  --bbva-form-textarea-focused-label-color: var(--colorsSecondary100, ${e(n.secondary100)});
  --bbva-form-textarea-readonly-label-color: var(--colorsSecondary100, ${e(n.secondary100)});
  --bbva-form-textarea-invalid-label-color: var(--colorsTertiaryType1Dark, ${e(n.tertiaryType1Dark)});
  --bbva-form-textarea-textarea-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-textarea-invalid-textarea-color: var(--colorsSecondary600, ${e(n.secondary600)});
  --bbva-form-textarea-readonly-textarea-color: var(--colorsSecondary100, ${e(n.secondary100)});
  --bbva-form-textarea-message-info-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-textarea-message-error-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-textarea-message-info-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-textarea-message-error-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}

[ambient=dark100] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreLight, ${e(n.primaryCoreLight)});
}

[ambient=dark400] {
  --bbva-form-textarea-field-bg-color: var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)});
}
${ne.mediaRules()}`}
    ${I.dark}
  `,light:t`
    ${oe}
    ${I.light}
  `};class le extends(s(l(Mt))){static get is(){return"bbva-form-textarea"}static get scopedElements(){return{"bbva-core-icon":T,"bbva-button-icon":R}}static get properties(){return{validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},characterCounterLabel:{type:String,attribute:"character-counter-label"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"}}}constructor(){super(),this.characterCounterLabel="bbva-form-textarea-counter-label",this.clearIcon=E(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-textarea-clear",this.errorIcon=V(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=_(),this.infoIconSize=16,this.infoMessage=""}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field"),this._formElement=this.querySelector("textarea")}updated(t){super.updated(t),t.has("value")&&(this.autoValidate||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}static get styles(){return[ie,se.dark,se.light,p("bbva-form-textarea-shared-styles")]}render(){return v` ${this.field} ${this.messageError} ${this._characterCounter} ${this.messageInfo}`}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}_onInput(t){super._onInput&&super._onInput(t),this.style.removeProperty("--area-height"),this.style.setProperty("--area-height",this._formElement.scrollHeight/16+"rem"),this._calculateCharacters()}get field(){return v`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this._labelledTextarea} ${this.clearButton}
      </div>
    `}get clearButton(){return v`
      <bbva-button-icon
        class="clear"
        variant="no-background white"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearTextarea}"
        aria-hidden="true"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-icon>
    `}get messageError(){return this._errorVisible?v`
          <div class="message error">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.errorMessage)}</span>
          </div>
        `:""}get _errorVisible(){return this.errorMessage&&this.invalid}get _characters(){return"number"==typeof this._remainingCharacters?this._remainingCharacters:this.maxlength}get _characterCounter(){return this.maxlength?v`
          <div class="message info counter">
            <span>${this._characters} ${this.t(this.characterCounterLabel)}</span>
          </div>
        `:""}get messageInfo(){return this.infoMessage?v`
          <div class="message info">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.infoIcon}"
              .size="${this.infoIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.infoMessage)}</span>
          </div>
        `:""}_calculateCharacters(){var t;this._remainingCharacters=this.maxlength-(null===(t=this._formElement)||void 0===t?void 0:t.value.length)}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const{activeElement:t}=this._rootNode,e=this.shadowRoot.activeElement||t;this._field.contains(e)||t===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("focus"))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("blur"))}clearTextarea(){this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-textarea-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus()}}m("colors.cool70"),m("colors.cool20"),m("colors.primaryCoreLightened"),m("colors.cool60"),m("colors.tertiaryType1Light"),m("colors.primaryCoreLightened"),m("colors.cool20"),m("colors.primaryCoreLightened"),m("colors.cool20"),m("colors.cool20"),m("colors.cool20"),m("colors.tertiaryType1Light"),m("colors.primaryCoreLightened"),m("colors.primaryCoreLightened"),m("colors.primarySubduedLight"),m("colors.tertiaryType1Light"),m("colors.cool20");class ce extends(D(d)){}class de extends ce{static get is(){return"bbva-global-relevant-facts-api-dm"}static get properties(){return{relevantFacts:{type:Array,attribute:!1}}}constructor(){super(),this.relevantFacts=[]}resetRelevantFacts(){this.relevantFacts=[]}getRelevantFacts(t={}){if(Object.keys(this.relevantFacts).length)return;this._generateGetService(this._getService(t),{customEvent:"relevant-facts-api-dm-fetch",errorFireEventHandler:"relevant-facts-api-dm-fetch-error"},this._responseMapping,t.fields)}_getService(t){const e=this._getServiceParams(t);return e.params=t||{},this._getServicePath("relevantFacts",this._getBgadp(e))}_getBgadp(t){return{relevantFactsV0:()=>new It(t),default:()=>"BGADP called not exist"}}_responseMapping(t={}){return t}}customElements.define(de.is,de);class he extends ce{static get is(){return"bbva-global-relevant-fact-api-dm"}static get properties(){return{relevantFact:{type:Object,attribute:!1}}}constructor(){super(),this.relevantFact={}}resetRelevantFact(){this.relevantFact={}}getRelevantFact(t,e={}){if(Object.keys(this.relevantFact).length)return;const a={"relevant-fact-id":t,...e};this._generateGetService(this._getService("get",a),{customEvent:"relevant-fact-api-dm-fetch",errorFireEventHandler:"relevant-fact-api-dm-fetch-error"},this._responseMapping,a.fields)}patchRelevantFact(t,e){this._requestMapping(e);const a={"relevant-fact-id":t};this._generateGetService(this._getService("patch",a,e),{customEvent:"relevant-fact-api-dm-update",errorFireEventHandler:"relevant-fact-api-dm-update-error"},this._responseMapping),this.resetRelevantFact()}_getService(t,e={},a={}){const i=this._getServiceParams(e,a);return this._getServicePath(`${t}RelevantFact`,this._getBgadp(i))}_getBgadp(t){return{getRelevantFactV0:()=>new Tt(t),patchRelevantFactV0:()=>new Rt(t),default:()=>"BGADP called not exist"}}_requestMapping(t){return t}_responseMapping(t={}){return t}}customElements.define(he.is,he);class be extends ce{static get is(){return"bbva-global-relevant-facts-configurations-api-dm"}static get properties(){return{relevantFactsConfigurations:{type:Array,attribute:!1}}}constructor(){super(),this.relevantFactsConfigurations=[]}resetRelevantFactsConfigurations(){this.relevantFactsConfigurations=[]}getRelevantFactsConfigurations(t={}){if(Object.keys(this.relevantFactsConfigurations).length)return;this._generateGetService(this._getService("get",{},t),{customEvent:"relevant-facts-configurations-api-dm-fetch",errorFireEventHandler:"relevant-facts-configurations-api-dm-fetch-error"},this._responseMapping,t.fields)}putRelevantFactsConfigurations(t){this._generateGetService(this._getService("put",t),{customEvent:"relevant-facts-configurations-api-dm-update",errorFireEventHandler:"relevant-facts-configurations-api-dm-update-error"},this._responseMapping),this.resetRelevantFactsConfigurations()}_getService(t,e={},a={}){const i=this._getServiceParams(a,e);return this._getServicePath(`${t}RelevantFactsConfigurations`,this._getBgadp(i))}_getBgadp(t){return{getRelevantFactsConfigurationsV0:()=>new qt(t),putRelevantFactsConfigurationsV0:()=>new Ot(t),default:()=>"BGADP called not exist"}}_responseMapping(t){return t}}customElements.define(be.is,be);const pe=new r;var ve=t`:host {
  display: block;
  --_veil-bg-color: var(--bbva-help-modal-dark-mode-veil-bg-color, var(--colorsPrimaryCoreDarkened, ${e(n.primaryCoreDarkened)}));
  --bbva-help-modal-safe-area-inset-top: 0;
  --bbva-help-modal-safe-area-inset-bottom: 0;
  --_modal-padding: 0;
  --_help-modal-content-bg-color: var(--bbva-help-modal-dark-mode-content-bg-color, var(--bbva-help-modal-content-bg-color, var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)})));
  --_help-modal-title-icon-color: var(--bbva-help-modal-dark-mode-title-icon-color, var(--bbva-help-modal-title-icon-color, var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)})));
  --_help-modal-title-icon-color-warning: var(--bbva-help-modal-dark-mode-title-icon-color-warning, var(--bbva-help-modal-title-icon-color-warning, var(--colorsTertiaryType1Dark, ${e(n.tertiaryType1Dark)})));
  --_help-modal-title-icon-color-info: var(--bbva-help-modal-dark-mode-title-icon-color-info, var(--bbva-help-modal-title-icon-color-info, var(--colorsTertiaryType3Dark, ${e(n.tertiaryType3Dark)})));
  --_help-modal-title-color: var(--bbva-help-modal-dark-mode-title-color, var(--bbva-help-modal-title-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_help-modal-content-color: var(--bbva-help-modal-dark-mode-content-color, var(--bbva-help-modal-content-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_help-modal-footer-bg-color: var(--bbva-help-modal-dark-mode-footer-bg-color, var(--bbva-help-modal-footer-bg-color, var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)})));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal-dark-mode-ios-header-bg-color, var(--bbva-help-modal-ios-header-bg-color, var(--colorsPrimaryCore, ${e(n.primaryCore)})));
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.3s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.25s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-full-height-bg-color: var(--bbva-help-modal-dark-mode-full-height-bg-color, var(--bbva-help-modal-full-height-bg-color, var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)})));
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
  padding-bottom: calc(calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) + var(--bbva-help-modal-safe-area-inset-bottom) / 2);
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
  padding: var(--bbva-help-modal-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) 0);
  align-items: center;
  outline: 0;
}

.modal-title {
  align-items: center;
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${e(a.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${e(L.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${e(i.typeMedium)}));
  position: relative;
  outline: 0;
}
.modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color);
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem));
}
.modal-title [data-tag-name=bbva-text] {
  width: 100%;
  color: var(--_help-modal-title-color);
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) 0 0);
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
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${e(a.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${e(i.typeSmall)}));
  text-align: center;
  margin: 0 auto;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
}

.footer-button:last-child {
  margin-top: var(--bbva-help-modal-footer-last-button-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem));
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
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
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
    padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  }

  .modal-title [data-tag-name=bbva-text] {
    width: 40rem;
  }
}
${pe.mediaRules()}`;class me extends(s(l(P))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":z,"bbva-icon":h,"bbva-text":b,"bbva-header-main":ut,"bbva-link":y}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},closeModalElements:{type:Array,attribute:"close-modal-elements"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header",reflect:!0},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top",reflect:!0},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},disabledButton:{type:Boolean,attribute:"disabled-button"},titleLines:{type:Number,attribute:"title-lines"},showTextIcon:{type:Boolean,attribute:"show-text-icon"}}}constructor(){super(),this.iconLeftPrimary="",this.iconLeftSecondary="",this.iconRightPrimary=E(),this.iconRightSecondary="",this.accessibilityTextIconLeftPrimary="",this.accessibilityTextIconLeftSecondary="",this.accessibilityTextIconRightPrimary="",this.accessibilityTextIconRightSecondary="",this.closeModalElements=["footer-button","footer-link","header-right-primary"],this.headerText="",this.headerType="modal-three-level",this.titleIcon="",this.titleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1,this.disabledButton=!1,this.showTextIcon=!1}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this.removeAttribute("aria-modal"),this._checkHeight()}updated(t){if(super.updated&&super.updated(t),this.fullHeight||this.setAttribute("hide-content-padding-top",!0),t.has("visible")){let t="close";this.visible&&(t="open"),this.dispatchEvent(new CustomEvent(`help-modal-${t}`,{detail:{status:t,modal:this},bubbles:!0,composed:!0}))}this._updateAccessibility()}static get styles(){return[super.styles,ve,p("bbva-help-modal-shared-styles"),B.light,g.light]}get _fixedIOSHeader(){return v`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get helpModalHeader(){return this.headerText?v`
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
        `:""}get helpModalContent(){return v`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content">
          ${this.descriptionText?v`<bbva-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                alignment="center"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-text>`:v`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilTpl(){return this.fullHeight?"":v`
        <div class="veil" @keyup="${this._keyupEvent}" @click="${this._onVeilClick}"></div>
      `}get helpModalFooter(){return v`
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
            ${this.linkText?v`<bbva-link
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
    `}get helpModalTitle(){return v`
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
          ${this.titleText?v` <bbva-text
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
    `}_updateAccessibility(){!this.getAttribute("aria-label")&&this.titleText&&this.setAttribute("aria-label",this.titleText)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_runScrollReset(){const t=this._getFirstScrollableParent(this._container);requestAnimationFrame((()=>{requestAnimationFrame((()=>{null==t||t.scrollTo(0,0)}))}))}_setFooterShadow(t){t.currentTarget.scrollTop>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight?(this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"),this.dispatchEvent(new CustomEvent("help-modal-content-scroll-bottom-reach",{detail:!0,bubbles:!0,composed:!0}))):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_handleClick(t){this.dispatchEvent(new CustomEvent(`help-modal-${t}-click`,{detail:!0,bubbles:!0,composed:!0})),this.closeModalElements.includes(t)&&this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick("veil")}_shouldDisplayFixedHeader(){const t=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(t[0])}get _modalContent(){return v`
      ${this._fixedIOSHeader}
      <section
        class="transition-container ${q({"half-height":!this.fullHeight})}"
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
    `}}m("colors.cool100"),m("colors.cool60"),m("colors.primarySubduedLight"),m("colors.tertiaryType1Light"),m("colors.tertiaryType3Light"),m("colors.primaryCoreLightened"),m("colors.cool20"),m("colors.cool60"),m("colors.cool60"),m("colors.cool100"),m("colors.primaryCoreLightened"),m("colors.primaryCoreLightened"),m("colors.cool20"),m("colors.primaryMediumLight"),m("colors.cool50"),m("colors.cool100"),m("colors.cool60"),m("colors.cool50"),m("colors.primaryCoreLightened"),m("colors.primarySubdued"),m("colors.primarySubdued"),m("colors.cool60"),m("colors.primaryMediumLight"),m("colors.cool20");const ge=j((t=>class extends t{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(t){return t.reduce(((t,e)=>(t[e.is]=e,t)),{})}_handleModalState(t){var e;const a=null==t||null===(e=t.detail)||void 0===e?void 0:e.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==a?void 0:a.visible,modal:a}}))}})),ue=new r;var fe=t`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${e(n.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${e(n.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${e(n.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${e(n.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${e(n.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${e(n.secondary200)})));
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
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${e(a.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${e(i.type3XSmall)}));
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
${ue.mediaRules()}`;var ye=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new r).mediaRules()}`;const xe=new r;const _e={dark:t`
    ${t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${e(n.primaryCoreLight)});
}
${xe.mediaRules()}`}
  `,light:t`
    ${ye}
  `};class $e extends(s(l(c(d)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":h,"bbva-text":b}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,fe,_e.dark,_e.light,p("bbva-notification-help-shared-styles")]}render(){return v`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}m("colors.primarySubduedLight"),m("colors.cool20"),m("colors.tertiaryType1Light"),m("colors.primaryCoreLightened"),m("colors.tertiaryType6Light"),m("colors.cool20"),m("colors.cool50");const Se=new r;var ke=t`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${e(n.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${e(n.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${e(n.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${e(a.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${Se.mediaRules()}`;const Ce=new r;var Fe=t`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${e(n.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${e(n.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${e(n.primaryMediumLight)});
}
${Ce.mediaRules()}`;var Le=t`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new r).mediaRules()}`;const we={dark:t`
    ${Fe}
    ${vt.dark}
    ${g.dark}
    ${_e.dark}
    ${u.dark}
  `,light:t`
    ${Le}
    ${vt.light}
    ${g.light}
    ${_e.light}
    ${u.light}
  `};class Me extends(s(l(f(d)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":mt,"bbva-notification-help":$e,"bbva-text":b,"bbva-link":y}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=x(),this.errorIconSize=16,this.infoIcon=_(),this.infoIconSize=16,this.name=`form-radio-group-${((t=10)=>`${Math.random().toString(36).substr(2,t)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(t=>this._setRadioName(t)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(t){(((t||{}).detail||{}).contentSlots||[]).forEach((t=>{const e=(t||{}).assignedNodes;"bbva-form-radio-button"===(e.getAttribute("data-tag-name")||(e||{}).nodeName).toLowerCase()&&(e.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(t=>this._updateItems(t)))}updated(t){if(super.updated&&super.updated(t),t.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const t=this.radioItems.find((t=>t.checked));t&&(t.checked=!1)}t.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].disabled=this.disabled}))),t.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].invalid=this.invalid}))),t.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].readonly=this.readonly}))),t.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].required=!1})),this.radioItems[0].required=!0)}_updateItems(t){const e=this.radioItems.indexOf(t.target);this.selected=e,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:t.target.value,selected:e},bubbles:!0,composed:!0}))}_helpClicked(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?v`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${$(this.linkHref)}"
          icon="${S()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const t=this.t(this.labelOut);return v`
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
      `}return""}static get styles(){return[ke,p("bbva-form-radio-group-shared-styles"),we.dark,we.light]}render(){return v`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((t=>v`
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
              ${t.text?k(t.text):t.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?v`
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
    `}}m("colors.primarySubdued"),m("colors.primaryMediumLight"),m("colors.primaryCoreLightened");const Ie=new r;var Te=t`:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  height: 100%;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-button-default] {
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-help-modal][full-height] {
  --bbva-help-modal-padding: 0;
}

.content form {
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-form-textarea] {
  text-align: left;
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-form-radio-button] {
  text-align: left;
}

.button {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
}
${Ie.mediaRules()}`;const Re="1004",Ee={markNotRead:{modal:"",update:!0,message:"bbva-proactivity-settings-marked-as-not-read"},markRead:{modal:"",update:!0,message:"bbva-proactivity-settings-marked-as-read"},reportError:{modal:"reportErrorModal",update:!1,message:"bbva-proactivity-settings-sended-thanks"},discardedMessage:{modal:"confirmDeleteModal",update:!0,message:"bbva-proactivity-settings-deleted-thanks"},offCategory:{modal:"",update:!0,message:"bbva-proactivity-settings-no-more-this-family-message"},notifyLater:{modal:"notifyLaterModal",update:!1,message:"bbva-proactivity-settings-notify-later-message"}};class Ve extends(W(l(ge(yt(d))))){static get is(){return"proactivity-settings"}static get scopedElements(){const t=[z,X,Me,le,Y,Q,b,Et,Nt,...Ve.configurationScopedElements()];return Ve.scopedElementsFromClasses(t)}static get properties(){return{relevantFactsApiVersion:{type:Number,attribute:"relevant-facts-version"},fixedPath:{type:String,attribute:"fixed-path"},showNativeOptions:{type:Boolean,attribute:"show-native-options"},relevantFactId:{type:String,attribute:"relevant-fact-id"},_settingOptions:{type:Array},_notifyLaterItemsRadioGroup:{type:Array},_confirmDeleteModalVisible:{type:Boolean},_reportErrorModalVisible:{type:Boolean},_notifyLaterModalVisible:{type:Boolean},_formButtonDisabled:{type:Boolean},_notifyLaterFormButtonDisabled:{type:Boolean},_radioGroupValue:{type:String},_reportErrorRadioGroupSelected:{type:Number},_notifyLaterRadioGroupSelected:{type:Number},_dateNotifyLater:{type:Number},_relevantFact:{type:Object},_sendingUpdate:{type:Boolean},_textAreaValue:{type:String},_loaded:{type:Boolean}}}static get styles(){return[Te,B.light,J.light,we.light,se.light,Z.light,p("proactivity-settings-shared-styles")]}constructor(){super(),this.language="es-ES",this.relevantFactsApiVersion=0,this.requiredToken="tsec",this.showNativeOptions=!1,this._confirmDeleteModalVisible=!1,this._formButtonDisabled=!1,this._loaded=!1,this._notifyLaterFormButtonDisabled=!1,this._notifyLaterItemsRadioGroup=[],this._notifyLaterModalVisible=!1,this._radioGroupValue=null,this._reportErrorModalVisible=!1,this._sendingUpdate=!1,this._settingOptions=[],this._textAreaValue=""}firstUpdated(t){super.firstUpdated(t),this._relevantFactDM=this.shadowRoot.querySelector("#relevantFactDm"),this._configurationDM=this.shadowRoot.querySelector("#relevantFactsConfigurationsDm"),this._relevantFactDM.getRelevantFact(this.relevantFactId),this._textAreaStyle={display:"none"}}update(t){super.update(t),this._loaded||this.showLoader("full",!1,!1),this._sendingUpdate&&this.showLoader("transparent",!1,!1)}_offCategory(){this._configurationDM.getRelevantFactsConfigurations()}static _getRememberDate(t,e,a){const i=new Date(Number(t));return e&&i.setDate(t.getDate()+1),i.setHours(a),i.setMinutes(0),i.setSeconds(0),i.valueOf()}async _notifyLater(){await this._notifyLaterCleanForm(),this._openModal("notifyLaterModal")}_handleConfigurationFetch(t){const e=t.detail||[],{family:{id:a}}=this._relevantFact;e.forEach(((t,i)=>{t.family.id===a&&(e[i].isAppNotificationDisabled=!0)})),this._configurationDM.putRelevantFactsConfigurations(e),this._actionWaiting="offCategory"}async _factError(){await this._reportErrorCleanForm(),this._openModal("reportErrorModal")}_notRead(){this._actionWaiting="markNotRead",this._relevantFactDM.patchRelevantFact(this.relevantFactId,{isRead:!1})}_read(){this._actionWaiting="markRead",this._relevantFactDM.patchRelevantFact(this.relevantFactId,{isRead:!0})}_reportErrorRadioGroupChange(t){const{value:e,selected:a}=t.detail;this._reportErrorRadioGroupSelected=a,this._formButtonDisabled=!1,this._textAreaValue="",this._textAreaStyle.display=e===Re?"block":"none",this._radioGroupValue=e}_reportErrorCleanForm(){this._reportErrorRadioGroupSelected=-1,this._formButtonDisabled=!0,this._textAreaStyle.display="none",this._textAreaValue=""}_radioGroupNotifyLaterChange(t){this._notifyLaterRadioGroupSelected=t.detail.selected,this._dateNotifyLater=t.target.items[this._notifyLaterRadioGroupSelected].value,this._notifyLaterFormButtonDisabled=!1}_notifyLaterCleanForm(){this._notifyLaterRadioGroupSelected=-1,this._notifyLaterFormButtonDisabled=!0}_reportError(){const t=this._radioGroupValue,e=t===Re?this._textAreaValue:"";this._actionWaiting="reportError",this._relevantFactDM.patchRelevantFact(this.relevantFactId,{feedback:{reportedError:{id:t,description:e}}}),this._closeModal("reportErrorModal"),this._sendingUpdate=!0}_deleteFact(){this._openModal("confirmDeleteModal")}_confirmDelete(){this._actionWaiting="discardedMessage",this._relevantFactDM.patchRelevantFact(this.relevantFactId,{discarded:!0}),this._sendingUpdate=!0}_closeSettings(){const t=new CustomEvent("proactivity-settings-close",{detail:!0,bubbles:!0,composed:!0});this.dispatchEvent(t)}_modalClosed(t){const{id:e}=t.currentTarget;this._closeModal(e)}_closeModal(t){this[`_${t}Visible`]=!1}_openModal(t){this[`_${t}Visible`]=!0}_notifyLaterSendEvent(){const t=this._relevantFact;this._actionWaiting="notifyLater",this._relevantFactUpdate();const e=new CustomEvent("proactivity-settings-remember",{detail:{title:t.name,date:this._dateNotifyLater,message:t.shortDescription,url:this.fixedPath.replace("{ID}",t.id)},bubbles:!0,composed:!0});this.dispatchEvent(e)}_sendUpdate(t,e){const a=new CustomEvent("proactivity-settings-update",{detail:{updateParent:e,message:t},bubbles:!0,composed:!0});this.dispatchEvent(a)}async _relevantFactUpdate(){const{modal:t,message:e,update:a}=Ee[this._actionWaiting];t&&this._closeModal(t),this._updateMessage={message:this.t(e),type:"success"},this._sendUpdate(this._updateMessage,a),this.clearLoader(),this._sendingUpdate=!1,await this.updateComplete,this._actionWaiting="",this._closeSettings()}async _relevantFactUpdateError(){const{modal:t}=Ee[this._actionWaiting];t&&this._closeModal(t),this._updateMessage={message:this.t("bbva-proactivity-settings-update-error"),type:"error"},this._sendUpdate(this._updateMessage,!1),await this.updateComplete,this.clearLoader(),this._actionWaiting="",this._closeSettings()}_getRelevantFact(t){this._relevantFact=t.detail,this._loaded=!0,this.clearLoader()}_handleClickItemSetting(t){const e=t.detail,{method:a,modal:i}=this._settingOptions[e];this[a](),!1===i&&this.showLoader("transparent",!1,!1)}_textAreaChange(t){this._textAreaValue=t.target.value}get _headers(){return this.headers||{"accept-language":this.language}}get _loadSettingOption(){const t=[{id:"deleteFact",icon:K(),label:this.t("bbva-proactivity-settings-delete-this-message"),method:"_deleteFact",modal:!0},{id:"notRead",icon:tt(),label:this.t("bbva-proactivity-settings-mark-as-not-read"),method:"_notRead",modal:!1},{id:"read",icon:et(),label:this.t("bbva-proactivity-settings-mark-as-read"),method:"_read",modal:!1},{id:"notifyLater",icon:V(),label:this.t("bbva-proactivity-settings-notify-later"),method:"_notifyLater",modal:!0},{id:"noMoreThisCategory",icon:at(),label:this.t("bbva-proactivity-settings-no-more-this-family"),method:"_offCategory",modal:!1},{id:"factError",icon:x(),label:this.t("bbva-proactivity-settings-report-error"),method:"_factError",modal:!0}],e=this._relevantFact.isRead?2:1;return this.showNativeOptions||t.splice(3,1),this._settingOptions=t.filter(((t,a)=>e!==a)),this._settingOptions}get _dataManagers(){return v`
      <bbva-global-relevant-fact-api-dm
        id="relevantFactDm"
        .headers="${this._headers}"
        ?native="${this.native}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.relevantFactsApiVersion}"
        @relevant-fact-api-dm-fetch="${this._getRelevantFact}"
        @relevant-fact-api-dm-update="${this._relevantFactUpdate}"
        @relevant-fact-api-dm-update-error="${this._relevantFactUpdateError}"
        @api-dm-error="${this._relevantFactUpdateError}"
      >
      </bbva-global-relevant-fact-api-dm>
      <bbva-global-relevant-facts-configurations-api-dm
        id="relevantFactsConfigurationsDm"
        .headers="${this._headers}"
        .host="${this.host}"
        .version="${this.relevantFactsApiVersion}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @relevant-facts-configurations-api-dm-fetch="${this._handleConfigurationFetch}"
        @relevant-facts-configurations-api-dm-update="${this._relevantFactUpdate}"
        @relevant-facts-configurations-api-dm-update-error="${this._relevantFactUpdateError}"
        @api-dm-error="${this._relevantFactUpdateError}"
      >
      </bbva-global-relevant-facts-configurations-api-dm>
    `}get _settingsWidget(){return this._relevantFact?v`
          <bbva-button-row
            ambient="light"
            data-id="settingsOptions"
            .options="${this._loadSettingOption}"
            @button-row-item-click="${this._handleClickItemSetting}"
          >
          </bbva-button-row>
        `:it}get _confirmModal(){return v`
      <bbva-help-modal
        data-id="confirmDeleteModal"
        id="confirmDeleteModal"
        modal-type="warning"
        title-icon="${x()}"
        aria-label="${this.t("bbva-proactivity-settings-sure-delete-this-message")}"
        title-text="${this.t("bbva-proactivity-settings-sure-delete-this-message")}"
        body-text="${this.t("bbva-proactivity-settings-this-message-disapear")}"
        button-text="${this.t("bbva-proactivity-settings-remove")}"
        link-text="${this.t("bbva-proactivity-settings-cancel")}"
        ?visible=${this._confirmDeleteModalVisible}
        @help-modal-footer-button-click="${this._confirmDelete}"
        @help-modal-close="${this._modalClosed}"
        hide-content-padding-top
      ></bbva-help-modal>
    `}get _reportErrorModal(){const t=[{text:this.t("bbva-proactivity-settings-wrong-calc"),value:"1001"},{text:this.t("bbva-proactivity-settings-wrong-date"),value:"1002"},{text:this.t("bbva-proactivity-settings-wrong-concept"),value:"1003"},{text:this.t("bbva-proactivity-settings-others"),value:"1004"}];return v`
      <bbva-help-modal
        data-id="reportErrorModal"
        id="reportErrorModal"
        icon-right-primary="${E()}"
        full-height
        fixed-footer
        header-type="modal-three-level"
        ?visible=${this._reportErrorModalVisible}
        aria-label="${this.t("bbva-proactivity-settings-report-error")}"
        header-text="${this.t("bbva-proactivity-settings-report-error")}"
        hide-content-padding-top
        @help-modal-close="${this._modalClosed}"
      >
        <div class="content" slot="slot-content" ambient="light">
          <bbva-header-category
            heading-level="2"
            text="${this.t("bbva-proactivity-settings-what-error")}"
          >
          </bbva-header-category>
          <form class="form">
            <bbva-text size="S" text="${this.t("bbva-proactivity-settings-choice")}"></bbva-text>
            <bbva-form-radio-group
              id="choiceError"
              name="choice-error"
              .selected="${this._reportErrorRadioGroupSelected}"
              .items="${t}"
              @form-radio-group-item-change="${this._reportErrorRadioGroupChange}"
            ></bbva-form-radio-group>
            <bbva-form-textarea
              id="otherErrorDescription"
              label="${this.t("bbva-proactivity-settings-say-me-what")}"
              info-icon="${_()}"
              info-message="${this.t("bbva-proactivity-settings-characters-remaining")}"
              style="${rt(this._textAreaStyle)}"
              .value="${this._textAreaValue}"
              @change="${t=>this._textAreaChange(t)}"
            >
            </bbva-form-textarea>
          </form>
        </div>
        <div class="button" slot="slot-footer">
          <bbva-button-default
            id="reportErrorButton"
            @click="${this._reportError}"
            ?disabled="${this._formButtonDisabled}"
            >${this.t("bbva-proactivity-settings-continue")}</bbva-button-default
          >
        </div>
      </bbva-help-modal>
    `}get _notifyLaterModal(){const t=new Date,e=t.getHours();return e<18&&(this._notifyLaterItemsRadioGroup=[{text:this.t("bbva-proactivity-settings-later"),value:Ve._getRememberDate(t,!1,18)},{text:this.t("bbva-proactivity-settings-tonight"),value:Ve._getRememberDate(t,!1,21)},{text:this.t("bbva-proactivity-settings-tomorrow-morning"),value:Ve._getRememberDate(t,!0,9)}]),e>=18&&(this._notifyLaterItemsRadioGroup=[{text:this.t("bbva-proactivity-settings-tonight"),value:Ve._getRememberDate(t,!1,21)},{text:this.t("bbva-proactivity-settings-tomorrow-morning"),value:Ve._getRememberDate(t,!0,9)},{text:this.t("bbva-proactivity-settings-tomorrow-afternoon"),value:Ve._getRememberDate(t,!0,18)}]),e>=22&&(this._notifyLaterItemsRadioGroup=[{text:this.t("bbva-proactivity-settings-tomorrow-morning"),value:Ve._getRememberDate(t,!0,9)},{text:this.t("bbva-proactivity-settings-tomorrow-afternoon"),value:Ve._getRememberDate(t,!0,18)},{text:this.t("bbva-proactivity-settings-tomorrow-night"),value:Ve._getRememberDate(t,!0,21)}]),v`
      <bbva-help-modal
        data-id="notifyLaterModal"
        id="notifyLaterModal"
        icon-right-primary="${E()}"
        full-height
        header-type="modal-three-level"
        ?visible=${this._notifyLaterModalVisible}
        aria-label="${this.t("bbva-proactivity-settings-notify-later")}"
        header-text="${this.t("bbva-proactivity-settings-notify-later")}"
        hide-content-padding-top
        @help-modal-close="${this._modalClosed}"
      >
        <div class="content" slot="slot-content" ambient="light">
          <bbva-header-category
            heading-level="2"
            text="${this.t("bbva-proactivity-settings-choose-when")}"
          >
          </bbva-header-category>
          <form class="form">
            <bbva-form-radio-group
              id="choicenotifyLater"
              name="choice-notify"
              .selected="${this._notifyLaterRadioGroupSelected}"
              .items="${this._notifyLaterItemsRadioGroup}"
              @form-radio-group-item-change="${this._radioGroupNotifyLaterChange}"
            ></bbva-form-radio-group>
            <div class="button">
              <bbva-button-default
                id="notifyLaterButton"
                @click="${this._notifyLaterSendEvent}"
                ?disabled="${this._notifyLaterFormButtonDisabled}"
                >${this.t("bbva-proactivity-settings-continue")}</bbva-button-default
              >
            </div>
          </form>
        </div>
      </bbva-help-modal>
    `}render(){return v`
      ${super.render()} ${this._dataManagers}
      ${this._loaded?v`
            ${this._settingsWidget} ${this._confirmModal} ${this._notifyLaterModal}
            ${this._reportErrorModal}
          `:it}
    `}}const Ae=j((t=>class extends t{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(t){return t.reduce(((t,e)=>(t[e.is]=e,t)),{})}_handleModalState(t){var e;const a=null==t||null===(e=t.detail)||void 0===e?void 0:e.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==a?void 0:a.visible,modal:a}}))}}));var De=t`html {
  --bbva-help-modal-padding: grid8Spacer(24px) 0 0 0;
  --_modal-z-index: 100;
}
html .form {
  text-align: left;
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
}
html .feedback-button {
  display: flex;
  justify-content: center;
  padding: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) 0;
}
html .feedback-question {
  text-align: left;
}
html [data-tag-name=bbva-form-textarea] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
}
html * {
  box-sizing: border-box;
}
`;const Pe=new r;var ze=t`:host {
  display: block;
  box-sizing: border-box;
  --_proactivity-ticket-bg-color-dark300: var(--proactivity-ticket-dark-mode-bg-color-dark300, var(--proactivity-ticket-bg-color-dark300, var(--ambientsDark300, ${e(w.dark300)})));
  --_proactivity-ticket-bg-color-light: var(--proactivity-ticket-dark-mode-bg-color-light, var(--proactivity-ticket-bg-color-light, var(--ambientsLight, ${e(w.light)})));
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[ambient^=dark300] {
  background-color: var(--_proactivity-ticket-bg-color-dark300);
}

[ambient^=light] {
  background-color: var(--_proactivity-ticket-bg-color-light);
}

.center {
  display: flex;
  justify-content: center;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
}

.action-button {
  display: flex;
  justify-content: center;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) 0;
}

.padding-top {
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
}

.proposal {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(L.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(L.medium.fontStyle)});
}

.introduction-proposal-padding {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em) 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-form-range], [data-tag-name=bbva-notification-help] {
  text-align: left;
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-badge-default] {
  width: 100%;
  display: flex;
  justify-content: center;
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
}

[data-tag-name=bbva-help-modal][full-height] {
  --bbva-help-modal-padding: 0;
}

[data-tag-name=bbva-list-badge] {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(o.spacer)}))) / 16) * 1em);
}
${Pe.mediaRules()}`;ot();const{moment:Be}=window,qe=["proactivity-ticket-today","proactivity-ticket-yesterday","proactivity-ticket-before-yesterday"];class Oe extends(W(l(Ae(yt(d))))){static get is(){return"proactivity-ticket"}static get scopedElements(){const t=[nt,st,z,zt,y,$t,Y,me,ee,kt,xt,le,Vt,Xt,Dt,lt,b,Ve,he,...Oe.configurationScopedElements()];return Oe.scopedElementsFromClasses(t)}static get properties(){return{fixedPath:{type:String,attribute:"fixed-path"},radioGroupValue:{type:Number,attribute:"radio-group-value"},relevantFactId:{type:String,attribute:"relevant-fact-id"},relevantFactsVersion:{type:String,attribute:"relevant-facts-version"},settingsAvailable:{type:Boolean,attribute:"settings-available"},showNativeOptions:{type:Boolean,attribute:"show-native-options"},thankyouFeedback:{type:Boolean,attribute:"thankyou-feedback"},thumbValue:{type:Number,attribute:"thumb-value"},_amountToContribute:{type:Number},_infoModalText:{type:String},_loaded:{type:Boolean},_modalFeedbackVisible:{type:Boolean},_moreInfoModalVisible:{type:Boolean},_relevantFact:{type:Object},_settingsVisible:{type:Boolean},_textAreaValue:{type:String},_radioGroupSelected:{type:Number}}}constructor(){super(),this.language="es-ES",this.relevantFactsVersion="0",this.requiredToken="tsec",this.settingsAvailable=!1,this.showNativeOptions=!1,this.thankyouFeedback=!1,this._amountToContribute=0,this._infoModalText="",this._loaded=!1,this._modalFeedbackVisible=!1,this._moreInfoModalVisible=!1,this._settingsVisible=!1,this._textAreaValue="",this._radioGroupSelected=-1}static get styles(){return[ze,ct,dt.light,B.light,St.dark,ht.light,te.light,Ct.light,_t.light,se.light,Z.light,g.dark,At.dark,At.light,Wt.light,p("proactivity-ticket-shared-styles")]}firstUpdated(t){super.firstUpdated(t)}getRelevantFactService(t){this.relevantFactId=null==t?void 0:t.relevantFactId,this._getRelevantFactService()}_getRelevantFactService(){this._relevantFactDM=this.shadowRoot.querySelector("#relevantFactDm"),this._relevantFactDM.getRelevantFact(this.relevantFactId)}updated(t){super.updated(t),t.has("relevantFactId")&&this.relevantFactId&&(this._loaded=!1,this._getRelevantFactService()),this._loaded||this.showLoader("full",!1,!1)}_getRelevantFact({detail:t}){var e,a;this._relevantFact=t,this._loaded=!0,this.clearLoader(),this._checkRead(),this._amountToContribute=null===(e=this._relevantFact.recommendation)||void 0===e||null===(a=e.recommendationAmount)||void 0===a?void 0:a.amount,this.dispatchEvent(new CustomEvent("proactivity-ticket-load",{detail:t,bubbles:!0,composed:!0}))}_notifyServiceError(){this.clearLoader(),this.showNotify(this.t("proactivity-ticket-fetch-error"),"","error","2000"),this.dispatchEvent(new CustomEvent("proactivity-ticket-fetch-error",{bubbles:!0,composed:!0}))}_textAreaChange(t){this._textAreaValue=t.target.value}get main(){var t,e,a,i,r;const{additionalInformation:o,description:n,highlight:s,image:l,name:c,relatedContracts:d}=this._relevantFact;let h="";var b,p,m;d&&(h="-1"!==(null===(b=d[0])||void 0===b?void 0:b.contractId)&&"-1"!==(null===(p=d[0])||void 0===p?void 0:p.id)?null===(m=d[0])||void 0===m?void 0:m.id:"");const g=h?h.slice(-4):void 0,u=`${this.t("proactivity-ticket-last-digits")}: ${g}`;return v`
      <div ambient="dark300">
        <bbva-card-banner
          ambient="dark"
          date-title=${this._relevantFactDate()}
          .headerLink=${this.settingsAvailable?this.t("proactivity-ticket-settings"):""}
          clip-entity="${h?"entity:BBVAESMMXXX":""}"
          text-entity="&bull;${$(g)}"
          accessible-text-entity="${$(u)}"
          title="${$(c)}"
          description="${$(n)}"
          microillustration="${l.id}"
          variant="full-width"
          .linkText=${o?this.t("proactivity-ticket-modal-info"):""}
          @card-banner-link-click=${()=>this._infoModalOpen(null==o?void 0:o.description)}
          @card-banner-header-link-click="${this._handleClickSetting}"
        >
        </bbva-card-banner>
        ${null!=s&&s.unusualAmount?v`
              <bbva-list-definition-amount
                ambient="dark"
                amount=${null===(t=s.unusualAmount)||void 0===t?void 0:t.amount}
                currency-code=${null===(e=s.unusualAmount)||void 0===e?void 0:e.currency}
                local-currency="${null===(a=s.unusualAmount)||void 0===a?void 0:a.currency}"
                description=${s.amountCategory||this.t("proactivity-ticket-extra-amount")}
                center
                variant-amount="4xl"
                language=${this.language}
              >
              </bbva-list-definition-amount>
            `:it}
        ${null!=s&&null!==(i=s.additionalInformation)&&void 0!==i&&null!==(r=i.description)&&void 0!==r&&r.length?v`
              <div class="center" ambient="dark">
                <bbva-link
                  ambient="dark"
                  text=${this.t("proactivity-ticket-modal-info")}
                  @click=${()=>{var t;return this._infoModalOpen(null==s||null===(t=s.additionalInformation)||void 0===t?void 0:t.description)}}
                ></bbva-link>
              </div>
            `:it}
      </div>
    `}get mainAction(){const{availableActions:t,eventType:e}=this._relevantFact;return v`
      <div class="action-button">
        <bbva-button-default
          id="actionButton"
          text=${t[0].description}
          @click="${t=>this._onButtonClick(t,0,!0,e)}"
        >
        </bbva-button-default>
      </div>
    `}get secondaryActions(){const{availableActions:t,eventType:e}=this._relevantFact,a=null==t?void 0:t.slice(1),i=a.map(((t,a)=>{var i;return v`
        ${null!=t&&t.performedActionDate?v`
              <bbva-list-badge
                ambient="light"
                type="full-width"
                link="${null==t?void 0:t.description}"
                icon="${bt[Oe._iconName(null==t||null===(i=t.image)||void 0===i?void 0:i.id)]()}"
                @list-badge-link-click="${t=>this._onButtonClick(t,a,!1,e)}"
                badge="${this.t("proactivity-ticket-done",{date:Be(null==t?void 0:t.performedActionDate).format("L")})}"
                badge-type="success"
              >
                <span slot="subtitle">${null==t?void 0:t.benefitDescription}</span>
              </bbva-list-badge>
            `:v`
              <bbva-list-default
                ambient="light"
                link="#"
                prevent-navigation
                heading-icon=${bt[Oe._iconName(t.image.id)]()}
                heading=${t.description}
                @click="${t=>this._onButtonClick(t,a,!1,e)}"
                description=${t.benefitDescription}
              >
              </bbva-list-default>
            `}
        <bbva-divider ambient="light"></bbva-divider>
      `}));return v`
      ${a.length?v`
            <bbva-header-category
              ambient="light"
              text=${this.t("proactivity-ticket-secondary-actions")}
            ></bbva-header-category>
            ${i}
          `:it}
    `}get moreInfoModal(){return v`
      <bbva-help-modal
        id="infoModal"
        full-height
        hide-content-padding-top
        accessibility-text-icon-right-primary=${this.t("proactivity-ticket-close")}
        icon-right-primary="${E()}"
        header-type="modal, notch-top"
        attach-to-body
        .contentStyles="${De}"
        ?visible="${this._moreInfoModalVisible}"
        header-text=${this.t("proactivity-ticket-modal-info")}
        @header-main-icon-right-primary-click="${this._infoModalClose}"
      >
        <div slot="slot-content">
          <bbva-panel-offer
            content-title=${this.t("proactivity-ticket-modal-info-title")}
            primary-button-text=${this.t("proactivity-ticket-close")}
            @panel-offer-primary-button-click="${this._infoModalClose}"
            microillustration="education"
          >
            <p>${this._infoModalText}</p>
          </bbva-panel-offer>
        </div>
      </bbva-help-modal>
    `}get proposal(){const{recommendation:t,availableActions:e}=this._relevantFact;return v`
      ${t.introduction?v`
            <bbva-text
              class="introduction-proposal-padding"
              unset
              text=${t.introduction}
              alignment="center"
              size="S"
            ></bbva-text>
          `:it}
      <bbva-text
        class="introduction-proposal-padding proposal"
        id="proposalText"
        unset
        text=${$(t.description)}
        alignment="center"
        size="L"
      >
      </bbva-text>
      ${this.proposalType}
      ${e[0].performedActionDate?v`
            <bbva-badge-default
              ambient="light"
              text="${this.t("proactivity-ticket-done",{date:Be(e[0].performedActionDate).format("L")})}"
              type="success"
            >
            </bbva-badge-default>
          `:it}
    `}get proposalType(){var t,e,a,i,r;const{recommendation:o}=this._relevantFact,n=null===(t=o.simulationAmountRange)||void 0===t?void 0:t.averageAmount.amount,s=null===(e=o.simulationAmountRange)||void 0===e?void 0:e.maximumAmount.amount,l=null===(a=o.simulationAmountRange)||void 0===a?void 0:a.minimumAmount.amount,c=null===(i=o.recommendationAmount)||void 0===i?void 0:i.amount,d=o.amountCategory,h=null===(r=o.recommendationAmount)||void 0===r?void 0:r.currency,b=pt(l,{language:this.language,currencyCode:h,localCurrency:h,decimalDigits:0}),p=pt(s,{language:this.language,currencyCode:h,localCurrency:h,decimalDigits:0});return o.simulationAmountRange?v`
        <bbva-form-range
          ambient="light"
          show-labels=""
          decimals-hidden
          informational-title=${$(d)}
          variant="informational-slider"
          min="${l}"
          max=${s}
          value=${n}
          .currencyCode="${h}"
          .localCurrency="${h}"
          .language="${this.language}"
          .items=${[b,p]}
          @change=${this._currentFormRangeValue}
        >
        </bbva-form-range>
        <bbva-notification-help
          ambient="light"
          accessibility-label-icon="Info"
          icon=${_()}
          text=${this.suggestedAmount}
        ></bbva-notification-help>
      `:c?v`
        <bbva-list-definition-amount
          class="padding-top"
          ambient="light"
          amount=${c}
          description=${$(d)}
          center
          decimals-hidden
          currency-code=${h}
          local-currency=${h}
          language=${this.language}
          variant-amount="4xl"
        >
        </bbva-list-definition-amount>
      `:it}get suggestedAmount(){const{recommendationAmount:t}=this._relevantFact.recommendation,e=Math.trunc(null==t?void 0:t.amount),a=null==t?void 0:t.currency;return`${this.t("proactivity-ticket-suggested-amount")}${pt(e,{language:this.language,currencyCode:a,localCurrency:a,decimalDigits:0})}`}_currentFormRangeValue({currentTarget:t}){const e=t.value;this._amountToContribute=e}get feedbackModal(){return v`
      <bbva-help-modal
        id="feedbackModal"
        icon-right-primary="${E()}"
        full-height
        header-type="modal, notch-top"
        hide-content-padding-top
        attach-to-body
        .contentStyles="${De}"
        ?visible="${this._modalFeedbackVisible}"
        header-text=${this.t("proactivity-ticket-header")}
        @header-main-icon-right-primary-click="${this._feedbackModalClear}"
      >
        <div class="feedback-question" slot="slot-content">
          <bbva-header-category
            ambient="light"
            heading-level="2"
            text=${this._feedbackQuestion()}
          ></bbva-header-category>
          <form class="form">
            <bbva-text inherit size="S" text=${this.t("proactivity-ticket-reasons")}></bbva-text>
            <bbva-form-radio-group
              ambient="light"
              id="choiceAssessment"
              name="choice-assessment"
              .selected="${this._radioGroupSelected}"
              @form-radio-group-item-change="${this._radioGroupValue}"
              .items=${this._feedbackItems()}
            >
            </bbva-form-radio-group>
            <bbva-form-textarea
              ambient="light"
              id="textareaModal"
              label=${this.t("proactivity-ticket-feedback-description")}
              .value="${this._textAreaValue}"
              @change="${t=>this._textAreaChange(t)}"
            >
            </bbva-form-textarea>
            <div class="feedback-button">
              <bbva-button-default
                class="primary"
                text=${this.t("proactivity-ticket-feedback-send")}
                @click="${this._feedbackSend}"
              ></bbva-button-default>
            </div>
          </form>
        </div>
      </bbva-help-modal>
    `}get _feedbackFromServer(){var t;const e=null===(t=this._relevantFact.feedback)||void 0===t?void 0:t.rating;return e>0?"0":e<0?"1":null}get _headers(){return this.headers||{"accept-language":this.language}}get _settingsModal(){return v`
      <bbva-help-modal
        id="settingsModal"
        full-height
        hide-content-padding-top
        ?visible="${this._settingsVisible}"
        icon-right-primary="${E()}"
        header-type="modal-three-level, notch-top"
        attach-to-body
        .contentStyles="${De}"
        header-text="${this.t("proactivity-ticket-settings")}"
        @help-modal-close="${this._settingsClosed}"
      >
        <div slot="slot-content" ambient="light">
          ${this._settingsVisible?v`
                <proactivity-settings
                  host="${this.host}"
                  relevant-fact-id="${this._relevantFact.id}"
                  fixed-path="${this.fixedPath}"
                  ?show-native-options="${this.showNativeOptions}"
                  .config="${this.config}"
                  @proactivity-settings-close="${this._settingsClosed}"
                  @proactivity-settings-update="${this._settingsUpdate}"
                  @proactivity-settings-remember="${this._settingsRemember}"
                >
                </proactivity-settings>
              `:it}
        </div>
      </bbva-help-modal>
    `}_checkRead(){this._relevantFact.isRead||this._relevantFactDM.patchRelevantFact(this._relevantFact.id,{isRead:!0})}_feedbackItems(){return Object.entries(-1===this.thumbValue?{"proactivity-ticket-negative-feedback-not-interested":-2,"proactivity-ticket-negative-feedback-misscalculation":-3,"proactivity-ticket-negative-feedback-proposal":-4,"proactivity-ticket-positive-feedback-others":-5}:{"proactivity-ticket-positive-feedback-message":2,"proactivity-ticket-positive-feedback-useful":3,"proactivity-ticket-positive-feedback-action":4,"proactivity-ticket-positive-feedback-others":5}).map((t=>({text:this.t(t[0]),value:this.t(t[1])})))}_feedbackModalClear(){this._textAreaValue="",this._radioGroupSelected=-1,this.radioGroupValue="",this._modalFeedbackVisible=!1}_feedbackQuestion(){const t=-1===this.thumbValue?"negative":"positive";return this.t(`proactivity-ticket-${t}-feedback-question`)}_feedbackSend(){const t=this._textAreaValue||"",e=this.radioGroupValue?this.radioGroupValue:this.thumbValue;(t||e!==this.thumbValue)&&(this._relevantFactDM.patchRelevantFact(this._relevantFact.id,{feedback:{rating:e,description:t}}),this._feedbackModalClear()),this._modalFeedbackVisible=!1}_feedbackThumbValue(t){const e=t.target&&t.target.value;this.thumbValue=[1,-1][e];const a=this.thumbValue;this.thankyouFeedback=!0,this._relevantFactDM.patchRelevantFact(this._relevantFact.id,{feedback:{rating:a,description:""}}),this._modalFeedbackVisible=!0}_formatDate(t){return new Date(t).toLocaleDateString(this.language,{month:"long",day:"numeric",year:"numeric",timeZone:"UTC"})}_handleClickSetting(){this._settingsVisible=!0}static _iconName(t){const e=t.split(":"),a=e[1].charAt(0).toUpperCase()+e[1].slice(1);return e[0]+a}_infoModalOpen(t){this._infoModalText=t,this._moreInfoModalVisible=!0}_infoModalClose(){this._moreInfoModalVisible=!1}_onButtonClick(t,e,a,i){var r;const o=this._relevantFact.availableActions,n=a?o[0]:o[e+1],s=o.map((t=>t.id!==n.id?{id:t.id,performedActionDate:t.performedActionDate}:{id:n.id,performedActionDate:Be().startOf("day")}));this._relevantFactDM.patchRelevantFact(this._relevantFact.id,{availableActions:s}),this.dispatchEvent(new CustomEvent("proactivity-ticket-action-navigate",{detail:{action:n.description,href:n.links[0].href,idAction:n.id,relevantFactId:i.id,relevantFactSubtypeId:null===(r=i.subType)||void 0===r?void 0:r.id,params:{amountToContribute:this._amountToContribute}}}))}_radioGroupValue(t){const{detail:{value:e,selected:a}}=t;this.radioGroupValue=e,this._radioGroupSelected=a}_relevantFactDate(){const{creationDate:t}=this._relevantFact,e=Be(t).startOf("day"),a=Be().startOf("day").diff(e,"days");return a>2?this._formatDate(t):this.t(qe[a])}_settingsClosed(){this._settingsVisible=!1}_settingsUpdate(t){const{message:e,updateParent:a}=t.detail;a&&this.dispatchEvent(new CustomEvent("proactivity-ticket-go-back",{bubbles:!0,composed:!0,detail:!0})),this.showNotify(e.message,"",e.type,"2000")}render(){return v`
      ${super.render()}
      <bbva-global-relevant-fact-api-dm
        id="relevantFactDm"
        ?native="${this.native}"
        .host="${this.host}"
        .requiredToken="${this.requiredToken}"
        .version="${this.relevantFactsVersion}"
        .headers="${this._headers}"
        @relevant-fact-api-dm-fetch="${this._getRelevantFact}"
        @relevant-fact-api-dm-fetch-error="${this._notifyServiceError}"
        @api-dm-error="${this._notifyServiceError}"
      >
      </bbva-global-relevant-fact-api-dm>
      ${this._loaded?v`
            ${this.main}
            <div ambient="light">
              ${this.proposal} ${this.mainAction} ${this.secondaryActions}
              ${this._relevantFact.availableActions.length>=2?it:v`
                    <bbva-divider ambient="light"></bbva-divider>
                  `}
              <bbva-form-rating
                ambient="light"
                thumbs
                value="${this._feedbackFromServer}"
                title="${this.t("proactivity-ticket-feedback")}"
                text=${this.thankyouFeedback?this.t("proactivity-ticket-thankyou"):""}
                accessibility-text=${this.t("proactivity-ticket-feedback-accessibility")}
                @form-rating-value-change="${t=>this._feedbackThumbValue(t)}"
              >
              </bbva-form-rating>
              ${this.feedbackModal} ${this.moreInfoModal} ${this._settingsModal}
            </div>
          `:it}
    `}}customElements.define(Oe.is,Oe);
