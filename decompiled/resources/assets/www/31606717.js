import"./2e477ad1.js";import{z as t,a8 as e,ac as i,ad as a,ar as o,aa as r,a9 as n,a as l,an as s,aJ as d,L as c,F as p,ag as h,ak as b,h as v,g as u,b0 as m,b1 as g,aM as y,b6 as f,aN as _,ah as S,i as $,aD as k,aO as x,o as C,f as A,ap as T,cl as L,ax as P,ab as E,bx as w,bf as I,au as O,bc as M,bd as N,al as z,aS as B,av as F,V as R,bS as D,aV as V,bW as j,aU as q,aY as U,aX as H,aw as W,bU as X,af as K,T as G,b4 as Y,dA as J,dB as Z,cM as Q,bG as tt,cD as et,J as it}from"./952f98a9.js";import{c as at,B as ot}from"./29a2800d.js";import"./84af4f94.js";import{aM as rt,t as nt,aN as lt,bc as st,bb as dt,aJ as ct,aK as pt,cd as ht}from"./7f3d7ca9.js";import{B as bt}from"./e32b4658.js";import{B as vt}from"./0efe7f4c.js";import"./c9f15469.js";import"./31b0a6f0.js";import{B as ut}from"./ca32b966.js";import"./0ef545a5.js";import"./82efcf78.js";import{B as mt}from"./4adf0da4.js";import{b as gt,B as yt}from"./055a082b.js";import"./70c7bb8e.js";import"./67b05b69.js";import"./dd9755f9.js";import"./fc15786a.js";import"./7936765e.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./afb1d3bc.js";import"./9d12c561.js";import"./980a7fb4.js";import"./19ae9b6c.js";const ft=new o;var _t=t`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
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
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${e(i.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${e(a.type3XSmall)}));
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
${ft.mediaRules()}`;var St=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new o).mediaRules()}`;const $t=new o;const kt={dark:t`
    ${t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${e(n.primaryCoreLight)});
}
${$t.mediaRules()}`}
  `,light:t`
    ${St}
  `};class xt extends(l(s(d(c)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":p,"bbva-text":h}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,_t,kt.dark,kt.light,b("bbva-notification-help-shared-styles")]}render(){return v`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}u("colors.primarySubduedLight"),u("colors.cool20"),u("colors.tertiaryType1Light"),u("colors.primaryCoreLightened"),u("colors.tertiaryType6Light"),u("colors.cool20"),u("colors.cool50");const Ct=new o;var At=t`:host {
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
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${e(i.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${Ct.mediaRules()}`;const Tt=new o;var Lt=t`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${e(n.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${e(n.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${e(n.primaryMediumLight)});
}
${Tt.mediaRules()}`;var Pt=t`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new o).mediaRules()}`;const Et={dark:t`
    ${Lt}
    ${rt.dark}
    ${m.dark}
    ${kt.dark}
    ${g.dark}
  `,light:t`
    ${Pt}
    ${rt.light}
    ${m.light}
    ${kt.light}
    ${g.light}
  `};class wt extends(l(s(y(c)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":nt,"bbva-notification-help":xt,"bbva-text":h,"bbva-link":f}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=_(),this.errorIconSize=16,this.infoIcon=S(),this.infoIconSize=16,this.name=`form-radio-group-${((t=10)=>`${Math.random().toString(36).substr(2,t)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(t=>this._setRadioName(t)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(t){(((t||{}).detail||{}).contentSlots||[]).forEach((t=>{const e=(t||{}).assignedNodes;"bbva-form-radio-button"===(e.getAttribute("data-tag-name")||(e||{}).nodeName).toLowerCase()&&(e.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(t=>this._updateItems(t)))}updated(t){if(super.updated&&super.updated(t),t.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const t=this.radioItems.find((t=>t.checked));t&&(t.checked=!1)}t.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].disabled=this.disabled}))),t.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].invalid=this.invalid}))),t.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].readonly=this.readonly}))),t.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].required=!1})),this.radioItems[0].required=!0)}_updateItems(t){const e=this.radioItems.indexOf(t.target);this.selected=e,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:t.target.value,selected:e},bubbles:!0,composed:!0}))}_helpClicked(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?v`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${$(this.linkHref)}"
          icon="${k()}"
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
      `}return""}static get styles(){return[At,b("bbva-form-radio-group-shared-styles"),Et.dark,Et.light]}render(){return v`
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
              ${t.text?x(t.text):t.label}
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
    `}}u("colors.primarySubdued"),u("colors.primaryMediumLight"),u("colors.primaryCoreLightened");var It=t`
:host {
  display: inline-block;
  position: relative;
  box-sizing: border-box;
  cursor: pointer;
  --_knob-width: 3rem;
  --_knob-height: 1.5rem;
  --_knob-margin: 1px;
  --_knob-tie-width: 1.375rem;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
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

.container {
  display: flex;
  align-items: center;
}

.bg {
  position: relative;
  display: flex;
  justify-content: center;
  flex-wrap: nowrap;
  height: var(--_knob-height);
  width: var(--_knob-width);
  background-color: #D3D3D3;
  overflow: hidden;
}

:host([checked]) .bg {
  background-color: #1973B8;
}

.knob {
  position: absolute;
  top: var(--_knob-margin);
  left: var(--_knob-margin);
  right: var(--_knob-margin);
  bottom: var(--_knob-margin);
  transition: transform .2s;
}

:host([checked]) .knob {
  transform: translateX(calc(100% - var(--_knob-tie-width)));
}

.knob-tie {
  display: block;
  height: 100%;
  width: var(--_knob-tie-width);
  background-color: #FFFFFF;
}

.knob-tag {
  position: relative;
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 0 4px;
}

.slot-control ::slotted(*) {
  position: absolute;
  bottom: 0;
  left: 0;
  display: flex;
  justify-content: center;
  align-items: flex-end;
  width: 100%;
  height: 100%;
  margin: 0;
  opacity: 0;
  pointer-events: none;
  z-index: -1;
}

:host([aria-disabled=true]) {
  opacity: .4;
  pointer-events: none;
  cursor: default;
}
`;class Ot extends(T(c)){static get is(){return"bbva-core-switch"}static get properties(){return{checked:{type:Boolean,reflect:!0},disabled:{type:Boolean,reflect:!0},form:{type:String},label:{type:String},name:{type:String,reflect:!0},radio:{type:Boolean},required:{type:Boolean,reflect:!0},tagOff:{type:String,attribute:"tag-off"},tagOn:{type:String,attribute:"tag-on"},value:{type:String},valueOff:{type:String,attribute:"value-off"},_formElementId:{type:String,attribute:!1}}}constructor(){super(),this._active=!1,this._formElementId=L(),this.checked=!1,this.name=`switch-${this._formElementId}`,this.radio=!1,this.value="",this.valueOff="",this._onClick=this.onClick.bind(this),this._onKeyUp=this.onKeyUp.bind(this),this._onKeyDown=this.onKeyDown.bind(this),this.addEventListener("click",this._onClick),this.addEventListener("keyup",this._onKeyUp),this.addEventListener("keydown",this._onKeyDown),P(this,"down",(()=>{this.disabled||(this.active=!0)})),P(this,"up",(()=>{this.active=!1})),this.addEventListener("blur",(()=>{this.active=!1}))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.active&&(this.active=!1)}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._setInitialAttribute("role",this.radio?"button":"switch"),this.disabled||(this._setInitialAttribute("tabindex","0"),this._setInitialAttribute("aria-disabled","false")),this._formElements=this.shadowRoot.querySelector(".controls"),this._formElements&&this.appendChild(this._formElements),this.hasAttribute("autofocus")&&this.focus()}updated(t){super.updated&&super.updated(t),(t.has("checked")||t.has("radio"))&&(this.radio?this.removeAttribute("aria-checked"):this.setAttribute("aria-checked",this.checked.toString())),t.has("radio")&&this.setAttribute("role",this.radio?"button":"switch"),t.has("disabled")&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.setAttribute("tabindex",this.disabled?"-1":"0"))}static get styles(){return[It,b("bbva-core-switch-shared-styles")]}get _labelledInput(){return v` <div class="container">${this._inputTemplate} ${this._labelTemplate}</div> `}get _inputTemplate(){return v`
      <span class="bg" aria-hidden="true">
        <span class="knob">
          <span class="knob-tie"></span>
        </span>

        ${this.tagOff?v` <span class="knob-tag">${this.tagOff}</span> `:""}
        ${this.tagOn?v` <span class="knob-tag">${this.tagOn}</span> `:""}
      </span>
    `}get _labelTemplate(){return v`
      <span class="label">
        <span class="sr-only" aria-live="${$(this.radio?"assertive":void 0)}">
          ${this.label} ${this._labelState}
        </span>
        <span class="slot-label"><slot></slot></span>
      </span>
    `}render(){return v` ${this._labelledInput} ${this._control} `}get value(){return this.radio&&!this.checked?this.valueOff:this._value}set value(t){const e=this._value;e!==t&&(this._value=t,this.requestUpdate("value",e))}get active(){return this._active}set active(t){t!==this._active&&(this._active=t,t?this.setAttribute("active",""):this.removeAttribute("active"))}get _labelState(){return this.checked?this.tagOn:this.tagOff}get _control(){return v`
      <span class="slot-control">
        <slot name="_control"></slot>
      </span>

      <div class="controls" slot="_control">
        ${this.radio?v`
              <input
                id="${this._formElementId}-off"
                style="display: none"
                aria-hidden="true"
                tabindex="-1"
                type="radio"
                ?disabled="${this.disabled}"
                ?checked="${!this.checked}"
                .checked="${!this.checked}"
                name="${this.name}"
                .value="${this.valueOff}"
                form="${$(this.form)}"
              />

              <input
                id="${this._formElementId}-on"
                style="display: none"
                aria-hidden="true"
                tabindex="-1"
                type="radio"
                ?disabled="${this.disabled}"
                ?checked="${this.checked}"
                .checked="${this.checked}"
                name="${this.name}"
                .value="${this.value}"
                form="${$(this.form)}"
              />
            `:v`
              <input
                id="${this._formElementId}"
                aria-hidden="true"
                tabindex="-1"
                type="checkbox"
                ?disabled="${this.disabled}"
                ?required="${this.required}"
                ?checked="${this.checked}"
                name="${this.name}"
                .value="${this.value}"
                @change="${this._onChange}"
                @input="${this._onInput}"
                form="${$(this.form)}"
              />
            `}
      </div>
    `}onClick(t){if(this.disabled)return t.preventDefault(),t.stopPropagation(),void t.stopImmediatePropagation();this._toggle()}onKeyUp(t){"Enter"!==t.key&&" "!==t.key||!this.active||(this.active=!1,this._toggle(),t.preventDefault(),t.stopPropagation())}onKeyDown(t){"Enter"!==t.key&&" "!==t.key||(this.active=!0,t.preventDefault(),t.stopPropagation())}_setInitialAttribute(t,e){this.hasAttribute(t)||this.setAttribute(t,e)}_onInput(t){t.preventDefault(),t.stopPropagation()}_onChange(t){t.preventDefault(),t.stopPropagation(),this.onClick(t)}_toggle(){this.checked=!this.checked,this._dispatchEvent("change"),this._dispatchEvent("input")}_dispatchEvent(t){this.dispatchEvent(new CustomEvent(t,{bubbles:!0}))}}var Mt=t`[ambient^=light] {
  --bbva-form-toggle-control-color: initial;
  --bbva-form-toggle-control-checked-color: initial;
  --bbva-form-toggle-knob-tie-color: initial;
  --bbva-form-toggle-knob-tie-checked-color: initial;
  --bbva-form-toggle-knob-tag-checked-color: initial;
  --bbva-form-toggle-knob-tag-unchecked-color: initial;
  --bbva-form-toggle-label-color: initial;
  --bbva-form-toggle-label-description-list-color: initial;
}
${(new o).mediaRules()}`;const Nt=new o;const zt={dark:t`
    ${t`[ambient^=dark] {
  --bbva-form-toggle-control-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-toggle-control-checked-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-toggle-knob-tie-color: var(--colorsSecondary500, ${e(n.secondary500)});
  --bbva-form-toggle-knob-tie-checked-color: var(--colorsPrimaryMedium, ${e(n.primaryMedium)});
  --bbva-form-toggle-knob-tag-checked-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-toggle-knob-tag-unchecked-color: var(--colorsSecondary500, ${e(n.secondary500)});
  --bbva-form-toggle-label-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-toggle-label-description-list-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}
${Nt.mediaRules()}`}
  `,light:t`
    ${Mt}
  `},Bt=new o;var Ft=t`:host {
  --_control-color: var(--bbva-form-toggle-control-color,var(--colorsSecondary500, ${e(n.secondary500)}));
  --_control-checked-color: var(--bbva-form-toggle-control-checked-color,var(--colorsPrimaryMedium, ${e(n.primaryMedium)}));
  --_knob-tie-color: var(--bbva-form-toggle-knob-tie-color,var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)}));
  --_knob-tie-checked-color: var(--bbva-form-toggle-knob-tie-checked-color,var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)}));
  --_knob-tag-checked: var(--bbva-form-toggle-knob-tag-checked-color,var(--colorsPrimaryMedium, ${e(n.primaryMedium)}));
  --_knob-tag-unchecked: var(--bbva-form-toggle-knob-tag-unchecked-color,var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)}));
  --_knob-width: var(--bbva-form-toggle-control-width, 2.5rem);
  --_knob-height: var(--bbva-form-toggle-control-height, 1.5rem);
  --_knob-margin: var(--bbva-form-toggle-control-border, 1px);
  --_knob-tie-width: var(--bbva-form-toggle-control-tie-width, 1.375rem);
  --_label-description-list-color: var(--bbva-form-toggle-label-description-list-color, var(--colorsSecondary500, ${e(n.secondary500)}));
  display: inline-block;
  position: relative;
  font: inherit;
  box-sizing: border-box;
  cursor: pointer;
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(a.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(E.book.fontWeight)});
  color: var(--bbva-form-toggle-label-color, var(--colorsSecondary600, ${e(n.secondary600)}));
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

:host([aria-disabled=true]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

:host([radio]) {
  --_knob-width: var(--bbva-form-toggle-radio-control-width, 4.6875rem);
  --_knob-tie-width: var(--bbva-form-toggle-radio-control-tie-width, 2.25rem);
}

:host([radio][variant=long]) {
  --_knob-width: var(--bbva-form-toggle-radio-long-control-width, 5.5rem);
  --_knob-tie-width: var(--bbva-form-toggle-radio-long-control-tie-width, 2.6875rem);
}

:host([variant^=list]),
:host([variant=section]) {
  display: block;
}

.container {
  display: flex;
  align-items: center;
  padding: var(--bbva-form-toggle-container-padding, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) 0);
}
:host([variant^=list]) .container {
  padding: var(--bbva-form-toggle-list-container-padding, calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) 0);
}
:host([variant=section]) .container {
  padding: var(--bbva-form-toggle-section-container-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) 0);
}

.bg {
  flex: none;
  position: relative;
  display: flex;
  justify-content: space-between;
  flex-wrap: nowrap;
  height: var(--_knob-height);
  width: var(--_knob-width);
  background-color: var(--_control-color);
  border-radius: 0.8125rem;
  overflow: hidden;
}
:host([radio]) .bg {
  background-color: var(--_control-checked-color);
}
:host([checked]) .bg {
  background-color: var(--_control-checked-color);
}
:host([variant=list-right]) .bg, :host([variant=section]) .bg {
  order: 1;
}

.knob {
  position: absolute;
  top: var(--_knob-margin);
  left: var(--_knob-margin);
  right: var(--_knob-margin);
  bottom: var(--_knob-margin);
  transition: transform 0.2s;
}
:host([checked]) .knob {
  transform: translateX(calc(100% - var(--_knob-tie-width)));
}
.knob-tie {
  display: block;
  height: 100%;
  width: var(--_knob-tie-width);
  border-radius: 0.8125rem;
  background-color: var(--_knob-tie-color);
}
:host([radio]) .knob-tie {
  background-color: var(--_knob-tie-checked-color);
}
:host([checked]) .knob-tie {
  background-color: var(--_knob-tie-checked-color);
}
.knob-tag {
  position: relative;
  display: flex;
  justify-content: center;
  align-items: center;
  margin-top: 1px;
  width: 50%;
  font-size: var(--typographyType2XSmall, ${e(i.type2XSmall)});
  line-height: var(--lineHeightType2XSmall, ${e(a.type2XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(E.medium.fontWeight)});
}
.knob-tag, :host([checked]) .knob-tag ~ .knob-tag {
  color: var(--_knob-tag-checked);
}
:host([checked]) .knob-tag, .knob-tag ~ .knob-tag {
  color: var(--_knob-tag-unchecked);
}

.label {
  flex: auto;
  display: flex;
  align-items: center;
  min-width: 0;
}
:host([variant=list]) .label, :host([variant=list-right]) .label {
  display: block;
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}
:host([variant=section]) .label {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(E.medium.fontWeight)});
}
.label-text {
  flex: auto;
  display: block;
  text-overflow: ellipsis;
  overflow: hidden;
  white-space: nowrap;
}
.label-description {
  flex: none;
  font-size: var(--typographyType3XSmall, ${e(i.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${e(a.type3XSmall)});
  display: block;
  margin-left: auto;
}
:host([variant=list]) .label-description, :host([variant=list-right]) .label-description {
  color: var(--_label-description-list-color);
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
}

.slot-control ::slotted(*) {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: flex-end;
  margin: 0;
  opacity: 0;
  z-index: -1;
  pointer-events: none;
}
${Bt.mediaRules()}`;class Rt extends Ot{static get is(){return"bbva-form-toggle"}static get properties(){return{radio:{type:Boolean,reflect:!0},description:{type:String}}}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._onChange=this._onChange.bind(this),this.addEventListener("change",this._onChange)}static get styles(){return[w(),Ft,zt.light,zt.dark,b("bbva-form-toggle-shared-styles")]}get _labelTemplate(){return v`
      <span class="label">
        <span class="sr-only" aria-live="${$(this.radio?"assertive":void 0)}">
          ${this.label} ${this._labelState}
        </span>
        <span class="label-text">
          <slot></slot>
        </span>
        ${this.description?v`
              <span class="label-description">${this.description}</span>
            `:v``}
      </span>
    `}_onChange(){this.dispatchEvent(new CustomEvent("form-toggle-switch-change",{detail:{checked:this.checked,value:this.radio&&!this.checked?this.valueOff:this.value},bubbles:!0,composed:!0}))}}customElements.define(st.is,st);const Dt=new o;var Vt=t`[top-spacer] {
  visibility: hidden;
  margin-top: 0;
}

[top-spacer="8"] {
  visibility: hidden;
  margin-top: 8;
}

[top-spacer="16"] {
  visibility: hidden;
  margin-top: 16;
}

[top-spacer="24"] {
  visibility: hidden;
  margin-top: 24;
}

[top-spacer="32"] {
  visibility: hidden;
  margin-top: 32;
}

[top-spacer="48"] {
  visibility: hidden;
  margin-top: 48;
}

[top-spacer="64"] {
  visibility: hidden;
  margin-top: 64;
}

[bottom-spacer] {
  visibility: hidden;
  margin-bottom: 0;
}

[bottom-spacer="8"] {
  visibility: hidden;
  margin-bottom: 8;
}

[bottom-spacer="16"] {
  visibility: hidden;
  margin-bottom: 16;
}

[bottom-spacer="24"] {
  visibility: hidden;
  margin-bottom: 24;
}

[bottom-spacer="32"] {
  visibility: hidden;
  margin-bottom: 32;
}

[bottom-spacer="48"] {
  visibility: hidden;
  margin-bottom: 48;
}

[bottom-spacer="64"] {
  visibility: hidden;
  margin-bottom: 64;
}

[divider] {
  box-sizing: border-box;
}
[divider]::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 100%;
}
[divider][top-spacer] {
  visibility: visible;
}
[divider][bottom-spacer] {
  visibility: visible;
}

hr[divider],
[divider]::after {
  margin: 0;
  border: none;
  display: block;
  height: 1px;
  background-color: var(--bbva-divider-color, var(--colorsSecondary300, ${e(n.secondary300)}));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}
${Dt.mediaRules()}`;const jt=new o;var qt=t`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${e(n.secondary300)});
  --bbva-divider-opacity: 1;
}
${jt.mediaRules()}`;const Ut=new o;const Ht={dark:t`
    ${t`[ambient^=dark] {
  --bbva-divider-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-divider-opacity: 0.3;
}
${Ut.mediaRules()}`}
  `,light:t`
    ${qt}
  `};class Wt extends c{static get is(){return"bbva-divider"}static get properties(){return{size:{type:String},topSpacer:{type:String,reflect:!0,attribute:"top-spacer"},bottomSpacer:{type:String,reflect:!0,attribute:"bottom-spacer"}}}constructor(){super(),this.size="full"}static get styles(){return[Vt,Ht.light,Ht.dark,b("bbva-divider-shared-styles")]}render(){return v`
      <hr divider="${this.size}" />
    `}}customElements.define(Wt.is,Wt);const Xt=new o;var Kt=t`:host {
  display: block;
  position: relative;
  box-sizing: border-box;
  --_list-card-subcategory-line-color: var(--bbva-list-card-subcategory-line-color, var(--colorsSecondary500, ${e(n.secondary500)}));
  --_list-card-heading-color: var(--bbva-list-card-heading-color, var(--colorsPrimaryMedium, ${e(n.primaryMedium)}));
  --_list-card-heading-active-color: var(--bbva-list-card-heading-active-color, var(--colorsSecondary500, ${e(n.secondary500)}));
  --_list-card-heading-no-link-color: var(--bbva-list-card-heading-no-link-color, var(--colorsSecondary600, ${e(n.secondary600)}));
  --_list-card-num-product-color: var(--bbva-list-card-num-product-color, var(--colorsSecondary600, ${e(n.secondary600)}));
  --_list-card-percentage-color: var(--bbva-list-card-percentage, var(--colorsSecondary600, ${e(n.secondary600)}));
  --_list-card-percetage-negative-color: var(--bbva-list-card-percentage-negative, var(--colorsTertiaryType1Dark, ${e(n.tertiaryType1Dark)}));
  --_list-card-percetage-positive-color: var(--bbva-list-card-percentage-positive, var(--colorsTertiaryType6Dark, ${e(n.tertiaryType6Dark)}));
  --_list-card-percetage-description-color: var(--bbva-list-card-description-color, var(--colorsSecondary500, ${e(n.secondary500)}));
  --_list-card-credit-balance-color: var(--bbva-list-card-credit-balance-color, var(--colorsSecondary600, ${e(n.secondary600)}));
  --_list-card-status-color: var(--bbva-list-card-status-color, var(--colorsSecondary600, ${e(n.secondary600)}));
  --_list-card-description-color: var(--bbva-list-card-description-color, var(--colorsSecondary500, ${e(n.secondary500)}));
  --_list-card-bg-active-color: var(--bbva-list-card-bg-active-color, var(--colorsSecondary100, ${e(n.secondary100)}));
  --_list-card-no-link-active-color: var(--bbva-list-card-no-link-active-color, var(--colorsPrimaryCore, ${e(n.primaryCore)}));
  --_list-card-skeleton-quote-color: var(--bbva-list-card-skeleton-quote-color, var(--colorsSecondary200, ${e(n.secondary200)}));
  --_list-card-skeleton-quote-bg: var(--bbva-list-card-skeleton-quote-bg, transparent);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
  margin: 0;
  padding: 0;
}

.container {
  display: flex;
  align-items: baseline;
  justify-content: space-between;
  position: relative;
  outline: none;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em);
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(a.typeSmall)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${e(E.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(E.book.fontWeight)});
}

.subcategory {
  position: absolute;
  width: 1rem;
  min-width: 1rem;
  height: 1rem;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

:host([subcategory]) .content-button, :host([indentation]) .content-button, .subcard .content-button {
  padding-left: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 15) * 1em);
}

.subcategory-line {
  position: absolute;
  width: 100%;
  height: 100%;
  border-left: 1px solid var(--_list-card-subcategory-line-color);
  border-bottom: 1px solid var(--_list-card-subcategory-line-color);
}

.content-button {
  flex-grow: 1;
  max-width: 100%;
}

.subcard .content-button {
  justify-content: flex-start;
  display: flex;
}

.header {
  display: flex;
  justify-content: space-between;
  align-items: baseline;
}

.heading {
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(E.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(E.medium.fontWeight)});
  font-size: var(--typographyTypeMedium, ${e(i.typeMedium)});
  line-height: var(--lineHeightTypeMedium, ${e(a.typeMedium)});
  color: var(--_list-card-heading-color);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
}

:host([variant=card]) {
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1em);
  -webkit-box-shadow: var(--boxShadowType2, ${e(I.type2)});
  -moz-box-shadow: var(--boxShadowType2, ${e(I.type2)});
  box-shadow: var(--boxShadowType2, ${e(I.type2)});
}

.ellipsis {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}

.content {
  display: flex;
  justify-content: space-between;
}

.card .content {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.column {
  display: flex;
  flex-direction: column;
  overflow: hidden;
}

.row {
  display: flex;
  flex-direction: row;
  align-items: center;
  overflow: hidden;
}

.row > .heading,
.row > bbva-badge-default {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

bbva-clip-entities {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.num-product {
  display: flex;
  height: 1.5rem;
  align-items: center;
  color: var(--_list-card-num-product-color);
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${e(E.bookItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${e(E.bookItalic.fontWeight)});
}

.percentage {
  display: flex;
  align-items: center;
  justify-content: flex-end;
  font-size: var(--typographyTypeXSmall, ${e(i.typeXSmall)});
  line-height: var(--lineHeightTypeXSmall, ${e(a.typeXSmall)});
  color: var(--_list-card-percentage-color);
}

.negative,
.positive {
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(a.typeSmall)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${e(E.bookItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${e(E.bookItalic.fontWeight)});
}

.negative {
  color: var(--_list-card-percetage-negative-color);
}

.positive {
  color: var(--_list-card-percetage-positive-color);
}

.description {
  color: var(--_list-card-percetage-description-color);
}

.credit-balance {
  font-size: var(--typographyTypeXSmall, ${e(i.typeXSmall)});
  line-height: var(--lineHeightTypeXSmall, ${e(a.typeXSmall)});
  color: var(--_list-card-credit-balance-color);
}

.margin-bottom {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.status {
  color: var(--_list-card-status-color);
}

.text-extended {
  color: var(--_list-card-description-color);
}

.text-amount {
  text-align: right;
}

.card-container {
  overflow: initial;
}

.card-image {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.wrapper {
  display: flex;
  align-items: center;
}

.mask {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

bbva-button-alert {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.no-link .heading, :host([no-link]) .heading {
  color: var(--_list-card-heading-no-link-color);
}

:host([expired]) .heading {
  color: var(--_list-card-heading-active-color);
}
:host([expired]) .num-product {
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${e(E.bookItalic.fontStyle)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${e(E.bookItalic.fontWeight)});
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
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-card-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_list-card-skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_list-card-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_list-card-skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_list-card-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_list-card-skeleton-quote-color) 50%, transparent 50%), linear-gradient(var(--_list-card-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_list-card-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_list-card-skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_list-card-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_list-card-skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--_list-card-skeleton-quote-bg);
  background-size: calc((30% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px, calc((45% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (8px/ 2)) 8px, calc((20% * 2) + (8px/ 2)) 8px, 100% 1px, calc((45% * 2) + (16px/ 2)) 16px, calc((30% * 2) + (16px/ 2)) 16px, calc((20% * 2) + (8px/ 2)) 8px, calc((20% * 2) + (8px/ 2)) 8px;
  background-position: 0 0px, 100% 0px, 0 40px, 100% 40px, 0 64px, 100% 64px, 0 88px, 0 105px, 100% 105px, 0 129px, 100% 129px;
}

:host([show-card]) .skeleton {
  background-image: linear-gradient(-60deg, transparent 50%, var(--_list-card-skeleton-quote-color) 50%), linear-gradient(var(--_list-card-skeleton-quote-color) 100%, transparent 0), linear-gradient(-60deg, transparent 50%, var(--_list-card-skeleton-quote-color) 50%), linear-gradient(-60deg, var(--_list-card-skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, var(--_list-card-skeleton-quote-color) 50%, transparent 50%);
  background-color: var(--_list-card-skeleton-quote-bg);
  background-size: calc((40% * 2) + (16px/ 2)) 16px, 60px 40px, calc((15% * 2) + (16px/ 2)) 16px, calc((35% * 2) + (16px/ 2)) 16px, calc((15% * 2) + (16px/ 2)) 16px;
  background-position: 0 0px, 0 32px, 0 80px, 100% 32px, 100% 56px;
}

:host([loading]) {
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  pointer-events: none;
}
:host([loading]) .container > * {
  opacity: 0;
}
:host([loading]) .skeleton {
  opacity: 1;
}

:host([show-card][loading]) .container {
  min-height: 5.9375rem;
}

:host(:not([show-card])[loading]) .container {
  min-height: 9.0625rem;
}

:host(:not([no-link]):not([button-active]):not([expired])) .container:not(.no-link):active {
  background: var(--_list-card-bg-active-color);
}
:host(:not([no-link]):not([button-active]):not([expired])) .container:not(.no-link):active .heading {
  color: var(--_list-card-no-link-active-color);
}

:host([amount-variant=long]) .text-amount {
  text-align: left;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}
:host([amount-variant=long]) .percentage {
  justify-content: flex-start;
}
:host([amount-variant=long]) .card-flex {
  display: flex;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  align-items: center;
}
:host([amount-variant=long]) .card-flex .num-product {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}
${Xt.mediaRules()}`;var Gt=t`[ambient^=light] {
  --bbva-list-card-subcategory-line-color: initial;
  --bbva-list-card-heading-color: initial;
  --bbva-list-card-num-product-color: initial;
  --bbva-list-card-percentage: initial;
  --bbva-list-card-percentage-negative: initial;
  --bbva-list-card-percentage-positive: initial;
  --bbva-list-card-description-color: initial;
  --bbva-list-card-credit-balance-color: initial;
  --bbva-list-card-status-color: initial;
  --bbva-list-card-description-color: initial;
  --bbva-list-card-heading-active-color: initial;
  --bbva-list-card-bg-active-color: initial;
  --bbva-list-card-no-link-active-color: initial;
  --_list-card-skeleton-quote-bg: initial;
  --bbva-list-card-skeleton-quote-color: initial;
}
${(new o).mediaRules()}`;const Yt=new o;var Jt=t`[ambient^=dark] {
  --bbva-list-card-subcategory-line-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-card-heading-color: var(--colorsPrimarySubdued, ${e(n.primarySubdued)});
  --bbva-list-card-heading-active-color: var(--colorsPrimarySubduedLight, ${e(n.primarySubduedLight)});
  --bbva-list-card-heading-no-link-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-card-num-product-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-card-percentage: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-card-percentage-negative: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-card-percentage-positive: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-card-description-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-card-credit-balance-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-card-status-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-card-description-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-card-bg-active-color: var(--colorsPrimaryCoreDark, ${e(n.primaryCoreDark)});
  --bbva-list-card-no-link-active-color: var(--colorsPrimarySubduedLight, ${e(n.primarySubduedLight)});
  --bbva-list-card-skeleton-quote-color: var(--colorsPrimaryMedium, ${e(n.primaryMedium)});
}
${Yt.mediaRules()}`;const Zt={light:t`
    ${Gt}
    ${O.light}
    ${M.light}
    ${N.light}
    ${dt.light}
    ${z.light}
    ${Ht.light}
  `,dark:t`
    ${Jt}
    ${O.dark}
    ${M.dark}
    ${N.dark}
    ${dt.dark}
    ${z.dark}
    ${Ht.dark}
  `},Qt=(t,e)=>e?t:void 0;class te extends(B(s(c))){static get is(){return"bbva-list-card"}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},secondaryAmount:{type:Number,attribute:"secondary-amount"},buttonActive:{type:Boolean,attribute:"button-active",reflect:!0},buttonText:{type:String,attribute:"button-text"},badgeText:{type:String,attribute:"badge-text"},badgeType:{type:String,attribute:"badge-type"},cardImage:{type:String,attribute:"card-image"},cardStatus:{type:String,attribute:"card-status"},cardType:{type:String,attribute:"card-type"},cardVariant:{type:String,attribute:"card-variant"},cardTitle:{type:String,attribute:"card-title"},contentText:{type:String,attribute:"content-text"},contentTextExtra:{type:String,attribute:"content-text-extra"},creditBalance:{type:String,attribute:"credit-balance"},secondaryCurrencyCode:{type:String,attribute:"secondary-currency-code"},description:{type:String},entity:{type:String},entityAccessibilityText:{type:String,attribute:"entity-accessibility-text"},expired:{type:Boolean,reflect:!0},loading:{type:Boolean,reflect:!0},secondaryLanguage:{type:String,attribute:"secondary-language"},secondaryLocalCurrency:{type:String,attribute:"secondary-local-currency"},numProduct:{type:String,attribute:"num-product"},subcategory:{type:Boolean},subCards:{type:Array},footerTextAmount:{type:String,attribute:"footer-text-amount"},showCard:{type:Boolean,attribute:"show-card",reflect:!0},showEllipsis:{type:Boolean,attribute:"show-ellipsis",reflect:!0},textExtended:{type:String,attribute:"text-extended"},noLink:{type:Boolean,attribute:"no-link"},isNegative:{type:Boolean,attribute:"is-negative"},percentage:{type:Number},percentSymbol:{type:String},variant:{type:String},amountVariant:{type:String,reflect:!0,attribute:"amount-variant"},visibleChars:{type:Number,attribute:"visible-chars"}}}constructor(){super(),this.secondaryCurrencyCode=this.currencyCode,this.isNegative=!1,this.noLink=!1,this.loading=!1,this.secondaryLocalCurrency=this.localCurrency,this.secondaryLanguage=this.language,this.subcategory=!1,this.subCards=[],this.showCard=!1,this.showEllipsis=!1,this.percentSymbol="%",this.variant="",this.visibleChars=5,this.expired=!1,this.amountVariant="default",this.cardVariant="default"}static _hasCard(t){return t.showCard||t.cardImage||t.cardType}get _hasAmount(){return void 0!==this.amount&&null!==this.amount}get _hasLink(){return!(this.noLink||this.expired)}get _statusPercentage(){return this.percentage<0?"decrease":"increase"}_getAmount(t){return this._hasAmount?v`
          <bbva-amount
            id="${t}"
            variant="xl"
            .amount="${this.amount}"
            .localCurrency="${this.localCurrency}"
            .currencyCode="${this.currencyCode}"
            .language="${this.language}"
          >
          </bbva-amount>
        `:v`
          <span class="status">${this.t("bbva-list-card-not-available","_Not Available")}</span>
        `}static get styles(){return[b("bbva-global-dividers-shared-styles"),Kt,b("bbva-list-card-shared-styles"),Zt.dark,Zt.light]}static _title(t){return v`
      <p class="heading${F({ellipsis:!!t.showEllipsis})}">
        ${t.cardTitle}
      </p>
    `}get _header(){return v`
      <div class="header">
        ${te._title(this)}
        ${te._hasCard(this)?"":this._getAmount("amountHeader")}
      </div>
    `}get _content(){const t="long"===this.amountVariant;return v`
      <div class="content">
        <div class="column">
          ${t?this._contentLeftLongAmount:this._contentLeft}
        </div>
        ${t?"":v`
              <div class="column text-amount${F({negative:this.isNegative})}">
                ${this._contentRight}
              </div>
            `}
      </div>
    `}get _numProduct(){return v`
      <span
        class="num-product${F({"margin-bottom":this.badgeText&&this.textExtended})}"
        ?hidden=${!this.numProduct}
      >
        ${this.entity?v`
              <bbva-clip-entities size="small" .entity="${this.entity}"
                >${this.t(this.entityAccessibilityText)}</bbva-clip-entities
              >
            `:""}
        ${te._getMaskElement(this.numProduct,"•",!0,this.visibleChars)}
      </span>
    `}get _contentLeft(){return v`
      <bbva-clip-card
        size="medium"
        class="card-image"
        .cardImage="${this.cardImage}"
        .cardType="${this.cardType}"
        .variant="${this.cardVariant}"
        .status="${this.cardStatus}"
        ?hidden="${!te._hasCard(this)}"
      ></bbva-clip-card>
      <div>
        ${this._numProduct}
        <bbva-badge-default
          .text="${this.badgeText}"
          type="${$(this.badgeType)}"
          ?hidden="${!this.badgeText}"
        ></bbva-badge-default>
        <p class="description" ?hidden="${!this.description}">${this.description}</p>
      </div>
    `}get _contentLeftLongAmount(){return v`
      <div class="card-flex">
        <bbva-clip-card
          size="medium"
          .cardImage="${this.cardImage}"
          .cardType="${this.cardType}"
          .variant="${this.cardVariant}"
          .status="${this.cardStatus}"
          ?hidden="${!te._hasCard(this)}"
        ></bbva-clip-card>
        ${this._numProduct}
      </div>
      <div>
        <div class="column text-amount${F({negative:this.isNegative})}">
          ${this._contentRight}
        </div>
        <bbva-badge-default
          .text="${this.badgeText}"
          type="${$(this.badgeType)}"
          ?hidden="${!this.badgeText}"
        ></bbva-badge-default>
        <p class="description" ?hidden="${!this.description}">${this.description}</p>
      </div>
    `}get _contentRight(){return v`
      ${te._hasCard(this)?this._getAmount("amount"):""}
      <p
        class="description ${F({"margin-bottom":this.contentTextExtra||this.percentage||this.footerTextAmount})}"
        ?hidden="${!this.contentText}"
      >
        ${this.contentText}
      </p>
      <p class="credit-balance" ?hidden="${!this.creditBalance}">${this.creditBalance}</p>
      <bbva-amount
        variant="xl"
        .amount="${this.secondaryAmount}"
        ?hidden="${!this.secondaryAmount}"
        .localCurrency="${this.secondaryLocalCurrency}"
        .currencyCode="${this.secondaryCurrencyCode}"
        .language="${this.secondaryLanguage}"
      >
      </bbva-amount>
      <p
        class="description ${F({"margin-bottom":this.percentage||this.footerTextAmount})}"
        ?hidden="${!this.contentTextExtra}"
      >
        ${this.contentTextExtra}
      </p>
      <p
        class="percentage ${F({negative:!te._hasCard(this)&&this.percentage<0,positive:!te._hasCard(this)&&this.percentage>0})}"
        ?hidden=${!this.percentage}
      >
        <bbva-badge-variability
          .status="${this._statusPercentage}"
          ?hidden="${!this._statusPercentage||te._hasCard(this)}"
        ></bbva-badge-variability>
        <span>${this.percentage}${this.percentSymbol}</span>
      </p>
      <p class="description">
        ${this.footerTextAmount}
      </p>
    `}get _footer(){return v`
      <p class="text-extended" ?hidden="${!this.textExtended}">${this.textExtended}</p>
      ${this.buttonText?v`
            <bbva-button-alert
              text="${this.buttonText}"
              .active="${this.buttonActive}"
              ?hidden="${!this.buttonText}"
              @focusin="${()=>{this.buttonActive=!0}}"
              @focusout="${()=>{this.buttonActive=!1}}"
              @click="${this._innerButtonClick}"
            ></bbva-button-alert>
          `:""}
    `}_contentInline(t){return v`
      <div class="subcategory" ?hidden="${!t.subcategory}">
        <div class="subcategory-line"></div>
      </div>
      <div class="content-button">
        <div class="column card-container">
          <bbva-clip-card
            size="medium"
            class="card-image"
            .cardImage="${t.cardImage}"
            .cardType="${t.cardType}"
            .variant="${t.cardVariant||"default"}"
            .status="${t.cardStatus}"
            ?hidden="${!te._hasCard(t)}"
          ></bbva-clip-card>
        </div>
        <div class="column">
          <div class="row">
            ${te._title(t)}
            ${te._getMaskElement(t.numProduct,"•",!0,this.visibleChars)}
          </div>
          <div class="row">
            <bbva-badge-default
              .text="${t.badgeText}"
              type="${$(t.badgeType)}"
              ?hidden="${!t.badgeText}"
            ></bbva-badge-default>
          </div>
        </div>
      </div>
    `}get _subCards(){return this.subCards.map(((t,e)=>v`
          <bbva-divider size="fit"></bbva-divider>
          <div
            class="subcard container${F({"no-link":t.noLink})}"
            role="${$(Qt("button",!t.noLink))}"
            aria-label="${$(Qt(t.accessibilityText,!t.noLink))}"
            @click="${()=>this._buttonSubcardClick(t,e)}"
          >
            ${this._contentInline(t)}
          </div>
        `))}static _getMaskElement(t,e,i,a){if(t){const o=R(t,e,i,a);return v`
        <div class="wrapper num-product">
          <span class="mask">${o[0]}</span>
          <span class="number">${o.substr(1)}</span>
        </div>
      `}return v``}_buttonClick(t){t&&"BBVA-BUTTON-ALERT"===t.target.tagName?this._innerButtonClick():this._hasLink&&this.dispatchEvent(new CustomEvent("list-card-item-click",{detail:!0,bubbles:!0,composed:!0}))}_buttonSubcardClick(t,e){t.noLink||this.dispatchEvent(new CustomEvent("list-card-item-subcard-click",{detail:e,bubbles:!0,composed:!0}))}_innerButtonClick(){this.dispatchEvent(new CustomEvent("list-card-alert-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return v`
      <div
        class="container ${F({card:te._hasCard(this)})}"
        role="${$(Qt("button",this._hasLink))}"
        tabindex="${$(Qt("0",this._hasLink))}"
        aria-label="${$(Qt(this.accessibilityText,this._hasLink))}"
        @click="${this._buttonClick}"
      >
        <div class="subcategory" ?hidden="${!this.subcategory}">
          <div class="subcategory-line"></div>
        </div>

        <div class="content-button">
          ${this._header} ${this._content} ${this._footer}
        </div>
        <div class="skeleton"></div>
      </div>
      <div class="column">
        ${this._subCards}
      </div>
    `}}customElements.define(te.is,te),customElements.define(xt.is,xt);var ee=t`
:host {
  display: inline-block;
  position: relative;
  font: inherit;
  box-sizing: border-box;
  cursor: default;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *::before, *::after {
  box-sizing: inherit;
}

:host([aria-disabled=true]) {
  opacity: .4;
  cursor: default;
  pointer-events: none;
}

.container {
  display: flex;
  align-items: center;
}

.box {
  flex: none;
  display: flex;
  justify-content: center;
  align-items: center;
  width: 1rem;
  height: 1rem;
  margin-right: .5em;
  border: 1px solid #666;
}

:host([active]) .box {
  background-color: #E9E9E9;
}

.check {
  display: block;
  width: .5rem;
  height: .5rem;
  background-color: #004481;
  opacity: 0;
}

:host([aria-checked=true]) .check {
  opacity: 1;
}

:host([aria-checked=mixed]) .check {
  opacity: 1;
  width: calc(100% - 2px);
  height: 2px;
}

.slot-control ::slotted(input[type=checkbox]) {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  margin: 0;
  opacity: 0;
  z-index: -1;
  pointer-events: none;
}
`;class ie extends(T(c)){static get properties(){return{disabled:{type:Boolean},value:{type:String},checked:{type:Boolean},indeterminate:{type:Boolean},required:{type:Boolean},name:{type:String},form:{type:String},_formElementId:{type:String,attribute:!1}}}constructor(){super(),this.checked=!1,this.value="on",this.__active=!1,this._formElementId=L(),this._onClick=this.onClick.bind(this),this.addEventListener("click",this._onClick),this._onKeyUp=this.onKeyUp.bind(this),this._onKeyDown=this.onKeyDown.bind(this),this.addEventListener("keyup",this._onKeyUp),this.addEventListener("keydown",this._onKeyDown),P(this,"down",(()=>{!this.disabled&&(this.active=!0)})),P(this,"up",(()=>{this.active=!1})),this.addEventListener("blur",(()=>{this.active=!1}))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.active&&(this.active=!1)}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._setInitialAttribute("role","checkbox"),this.disabled||(this._setInitialAttribute("tabindex","0"),this._setInitialAttribute("aria-disabled","false")),this._formElement=this.shadowRoot.querySelector(`#${this._formElementId}`),this._formElement&&this.appendChild(this._formElement),this.hasAttribute("autofocus")&&this.focus()}updated(t){super.updated&&super.updated(t),(t.has("checked")||t.has("indeterminate"))&&(this.indeterminate?this.setAttribute("aria-checked","mixed"):this.setAttribute("aria-checked",this.checked.toString())),t.has("disabled")&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.setAttribute("tabindex",this.disabled?"-1":"0"))}get checked(){return this._checked}set checked(t){const e=this.checked;t!==e&&(this._checked=t,t&&this.indeterminate&&(this.indeterminate=!1),this.requestUpdate("checked",e))}get indeterminate(){return this._indeterminate}set indeterminate(t){const e=this.indeterminate;t!==e&&(this._indeterminate=t,t&&(this.checked=!1),this.requestUpdate("indeterminate",e))}get active(){return this.__active}set active(t){t!==this.__active&&(this.__active=t,t?this.setAttribute("active",""):this.removeAttribute("active"),this.dispatchEvent(new CustomEvent("active-change",{bubbles:!0,detail:{value:this.__active}})))}static get styles(){return[ee,b("bbva-core-checkbox-shared-styles")]}render(){return v` ${this._labelledInput} ${this._checkbox} `}get _labelledInput(){return v` <div class="container">${this._inputTemplate} ${this._labelTemplate}</div> `}get _inputTemplate(){return v`
      <slot name="input-template">
        <span class="box">
          <span class="check"></span>
        </span>
      </slot>
    `}get _labelTemplate(){return v`
      <span class="label">
        <slot></slot>
      </span>
    `}get _checkbox(){return v`
      <span class="slot-control">
        <slot name="_checkbox"></slot>
      </span>

      <input
        aria-hidden="true"
        ?checked="${this.checked}"
        ?disabled="${this.disabled}"
        form="${$(this.form)}"
        id="${this._formElementId}"
        .indeterminate="${this.indeterminate}"
        name="${$(this.name)}"
        ?required="${this.required}"
        slot="_checkbox"
        tabindex="-1"
        type="checkbox"
        .value="${this.value}"
        @change="${this._onChange}"
        @input="${this._onInput}"
      />
    `}_setInitialAttribute(t,e){this.hasAttribute(t)||this.setAttribute(t,e)}_dispatchEvent(t){this.dispatchEvent(new CustomEvent(t,{bubbles:!0}))}_onInput(t){t.preventDefault(),t.stopPropagation()}_onChange(t){t.preventDefault(),t.stopPropagation(),this.onClick(t)}_toggle(){this.checked=!this.checked,this.dispatchEvent(new CustomEvent("change",{bubbles:!0})),this.dispatchEvent(new CustomEvent("input",{bubbles:!0}))}onClick(t){if(this.disabled)return t.preventDefault(),t.stopPropagation(),void t.stopImmediatePropagation();this._toggle()}onKeyUp(t){"Enter"!==t.key&&" "!==t.key||!this.active||(this.active=!1,this._toggle(),t.preventDefault(),t.stopPropagation())}onKeyDown(t){const{key:e}=t;"Enter"!==e&&" "!==e||(this.active=!0,t.preventDefault(),t.stopPropagation())}}const ae=new o;var oe=t`:host {
  --_form-checkbox-readonly-color: var(--bbva-form-checkbox-readonly-color, var(--colorsSecondary500, ${e(n.secondary500)}));
  --_form-checkbox-border-color: var(--bbva-form-checkbox-checkbox-border-color, var(--colorsSecondary500, ${e(n.secondary500)}));
  --_form-checkbox-bg-color: var(--bbva-form-checkbox-checkbox-bg-color, var(--colorsSecondary100, ${e(n.secondary100)}));
  --_form-checkbox-check-color: var(--bbva-form-checkbox-check-color, var(--colorsPrimaryCore, ${e(n.primaryCore)}));
  --_form-checkbox-error-color: var(--bbva-form-checkbox-error-color, var(--colorsTertiaryType1Dark, ${e(n.tertiaryType1Dark)}));
  --_form-checkbox-error-bg-color: var(--bbva-form-checkbox-error-bg-color, var(--colorsTertiaryType5Lightened, ${e(n.tertiaryType5Lightened)}));
  --_form-checkbox-error-icon-color: var(--bbva-form-checkbox-error-icon-color, var(--colorsTertiaryType1Dark, ${e(n.tertiaryType1Dark)}));
  --_form-checkbox-variant-amount-clip-color: var(--bbva-form-checkbox-variant-amount-clip-color, var(--colorsSecondary500, ${e(n.secondary500)}));
  --_form-checkbox-variant-icon-clip-color: var(--bbva-form-checkbox-variant-icon-clip-color, var(--colorsSecondary400, ${e(n.secondary400)}));
  --_form-checkbox-variant-card-description-color: var(--bbva-form-checkbox-variant-card-description-color, var(--colorsSecondary600, ${e(n.secondary600)}));
  --_form-checkbox-label-gap: var(--bbva-form-checkbox-label-gap, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem));
  --_form-checkbox-help-icon-color: var(--bbva-form-checkbox-help-icon-color, var(--colorsPrimaryMedium, ${e(n.primaryMedium)}));
  --_form-checkbox-label-out-color: var(--bbva-form-checkbox-label-out-color, var(--colorsSecondary600, ${e(n.secondary600)}));
  display: block;
  position: relative;
  box-sizing: border-box;
  cursor: default;
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(a.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(E.book.fontWeight)});
  color: var(--bbva-form-checkbox-color, var(--colorsSecondary600, ${e(n.secondary600)}));
}

:host([aria-readonly=true]) {
  color: var(--_form-checkbox-readonly-color);
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

:host([aria-disabled=true]) {
  opacity: 0.4;
  cursor: default;
  pointer-events: none;
}

.container {
  display: flex;
  align-items: var(--bbva-form-checkbox-container-align, flex-start);
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem) 0;
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

.checkbox {
  flex: none;
  display: flex;
  justify-content: center;
  align-items: center;
  width: var(--bbva-form-checkbox-width, 2rem);
  height: var(--bbva-form-checkbox-height, 2rem);
  border-radius: var(--bbva-form-checkbox-border-radius, none);
  margin-right: var(--_form-checkbox-label-gap);
  border: var(--bbva-form-checkbox-border, 1px solid var(--_form-checkbox-border-color));
  background-color: var(--_form-checkbox-bg-color);
}
:host([aria-invalid=true]) .checkbox {
  background-color: var(--_form-checkbox-error-bg-color);
  border-color: var(--_form-checkbox-error-color);
}
.checkbox-check {
  display: block;
  color: var(--_form-checkbox-check-color);
  opacity: 0;
}
:host([aria-checked=true]) .checkbox-check {
  opacity: 1;
}
:host([aria-invalid=true]) .checkbox-check {
  color: var(--_form-checkbox-error-color);
}
:host([aria-readonly=true]) .checkbox-check {
  color: var(--_form-checkbox-readonly-color);
}

.content {
  flex: auto;
  display: flex;
  align-items: flex-start;
  min-width: 0;
}

.main {
  flex: auto;
  min-width: 0;
  display: block;
  padding-top: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--bbva-form-checkbox-label-out-weight, var(--fontFacePrimaryMediumFontWeight, ${e(E.medium.fontWeight)}));
  color: var(--_form-checkbox-label-out-color);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.label {
  display: block;
}

.description {
  display: block;
  margin-top: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${e(a.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${e(E.book.fontWeight)});
}
.description bbva-clip-entities {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.error {
  display: flex;
  align-items: center;
}
.error-icon {
  width: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  height: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  color: var(--_form-checkbox-error-icon-color);
}
.error-message {
  font-size: var(--typographyType3XSmall, ${e(i.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${e(a.type3XSmall)});
}

.help-icon {
  color: var(--_form-checkbox-help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

.clip {
  flex: none;
  display: flex;
  align-items: center;
  height: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

:host([variant=amount]) .clip {
  color: var(--_form-checkbox-variant-amount-clip-color);
}

:host([variant=icon]) .clip,
:host([variant=icon-bold]) .clip {
  color: var(--_form-checkbox-variant-icon-clip-color);
}

:host([variant=icon-bold]) {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(E.medium.fontWeight)});
}

:host([variant=card]) .description {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${e(E.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${e(E.bookItalic.fontStyle)});
  color: var(--_form-checkbox-variant-card-description-color);
  display: flex;
}
:host([variant=card]) .description ::slotted(bbva-badge-default) {
  margin-left: 0.5rem;
}

.slot-control ::slotted(input[type=checkbox]) {
  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  margin: 0;
  opacity: 0;
  z-index: -1;
  pointer-events: none;
}

.medium {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(E.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${e(E.medium.fontStyle)});
}
${ae.mediaRules()}`;const re=new o;var ne=t`[ambient^=light] {
  --bbva-form-checkbox-color: initial;
  --bbva-form-checkbox-readonly-color: initial;
  --bbva-form-checkbox-checkbox-border-color: initial;
  --bbva-form-checkbox-checkbox-bg-color: initial;
  --bbva-form-checkbox-check-color: initial;
  --bbva-form-checkbox-error-color: initial;
  --bbva-form-checkbox-error-bg-color: initial;
  --bbva-form-checkbox-error-icon-color: initial;
  --bbva-form-checkbox-variant-amount-clip-color: initial;
  --bbva-form-checkbox-variant-icon-clip-color: initial;
  --bbva-form-checkbox-variant-card-description-color: initial;
  --bbva-form-checkbox-label-out-color: initial;
  --bbva-form-checkbox-help-icon-color: initial;
}

[ambient^=light100] {
  --bbva-form-checkbox-checkbox-bg-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}
${re.mediaRules()}`;const le=new o;var se=t`[ambient^=dark] {
  --bbva-form-checkbox-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-checkbox-readonly-color: var(--colorsSecondary300, ${e(n.secondary300)});
  --bbva-form-checkbox-checkbox-border-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-checkbox-checkbox-bg-color: #0a5393;
  --bbva-form-checkbox-check-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-checkbox-error-color: var(--colorsTertiaryType1Dark, ${e(n.tertiaryType1Dark)});
  --bbva-form-checkbox-error-bg-color: var(--colorsTertiaryType5Lightened, ${e(n.tertiaryType5Lightened)});
  --bbva-form-checkbox-error-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-checkbox-variant-amount-clip-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-checkbox-variant-icon-clip-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-checkbox-variant-card-description-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-checkbox-label-out-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-form-checkbox-help-icon-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}

[ambient^=dark100] {
  --bbva-form-checkbox-checkbox-bg-color: var(--colorsPrimaryCoreLight, ${e(n.primaryCoreLight)});
}

[ambient^=dark400] {
  --bbva-form-checkbox-checkbox-bg-color: var(--colorsPrimaryCoreLight, ${e(n.primaryCoreLight)});
}
${le.mediaRules()}`;const de={dark:t`
    ${z.dark}
    ${se}
  `,light:t`
    ${z.light}
    ${ne}
  `};class ce extends(s(ie)){static get is(){return"bbva-form-checkbox"}static get properties(){return{checkIcon:{type:String,attribute:"check-icon"},checkIconSize:{type:String,attribute:"check-icon-size"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},invalid:{type:Boolean},readonly:{type:Boolean},checked:{type:Boolean,reflect:!0},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"},notForm:{type:Boolean,attribute:"not-form"},help:{type:Boolean},label:{type:String},hideLabel:{type:Boolean,attribute:"hide-label"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},entity:{type:String},entityText:{type:String,attribute:"entity-text"},entitySize:{type:String,attribute:"entity-size"}}}constructor(){super(),this.checkIcon=D(),this.checkIconSize=24,this.errorIcon=_(),this.errorIconSize=16,this.optionalLabel="",this.notForm=!1,this.labelMedium=!1}updated(t){super.updated&&super.updated(t),t.has("readonly")&&this.setAttribute("aria-readonly",this.readonly.toString()),t.has("required")&&this.setAttribute("aria-required",this.required.toString()),t.has("invalid")&&this.setAttribute("aria-invalid",this.invalid.toString()),t.has("checked")&&!t.has("invalid")&&(this.invalid=!1),t.has("checked")&&void 0!==t.get("checked")&&this._dispatchEvent("change")}static get styles(){return[w(),oe,b("bbva-form-checkbox-shared-styles"),de.dark,de.light]}static renderIf(t,e){return t?v`
          ${e}
        `:V}get _inputTemplate(){return v`
      <span class="checkbox">
        <bbva-core-icon
          class="checkbox-check"
          .icon="${this.checkIcon}"
          .size="${this.checkIconSize}"
        ></bbva-core-icon>
      </span>
    `}get _labelOut(){return ce.renderIf(this.labelOut,v`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text="${this.required?`${this.labelOut}`:`${this.labelOut} ${this._optional}`}"
            size="S"
          >
          </bbva-text>
          ${ce.renderIf(this.help,v`
              <bbva-core-icon
                id="help"
                @click="${this._helpClicked}"
                class="help-icon"
                icon="${k()}"
              >
              </bbva-core-icon>
            `)}
        </div>
      `)}get _checkOptional(){return this.labelOut||this.required||this.notForm?"":this._optional}get _optional(){return this.optionalLabel||this.t("bbva-form-checkbox-optional-label")}get _labelTemplate(){return v`
      <span class="content">
        <span class="main">
          <span
            class=${F({label:!0,medium:this.labelMedium,"sr-only":this.hideLabel})}
          >
            ${this.label} ${this._checkOptional}
          </span>
          <span class="description">
            ${this.entity&&"small"===this.entitySize?v`
                  <bbva-clip-entities size="${this.entitySize}" entity="${this.entity}">
                    ${this.entityText}
                  </bbva-clip-entities>
                `:V}
            <slot name="description"></slot>
          </span>
          ${ce.renderIf(this.invalid&&this.errorMessage,v`
              <span class="error">
                <bbva-core-icon
                  class="error-icon"
                  .icon="${this.errorIcon}"
                  .size="${this.errorIconSize}"
                ></bbva-core-icon>
                <span class="error-message">${this.errorMessage}</span>
              </span>
            `)}
        </span>
        <span class="clip">
          ${this.entity&&"medium"===this.entitySize?v`
                <bbva-clip-entities size="${this.entitySize}" entity="${this.entity}">
                  ${this.entityText}
                </bbva-clip-entities>
              `:v`
                <slot name="clip"></slot>
              `}
        </span>
      </span>
    `}_toggle(){this.readonly||(this.checked=!this.checked,this._dispatchEvent("input"))}_helpClicked(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-checkbox-help-click",{bubbles:!0,composed:!0}))}render(){return v`
      ${this._labelOut} ${this._labelledInput} ${this._checkbox}
    `}}customElements.define(ce.is,ce);var pe=t`[ambient^=light] {
  --bbva-list-file-alert-text-color: initial;
  --bbva-list-file-file-size-color: initial;
}
${(new o).mediaRules()}`;const he=new o;var be=t`[ambient^=dark] {
  --bbva-list-file-alert-text-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
  --bbva-list-file-file-size-color: var(--colorsPrimaryCoreLightened, ${e(n.primaryCoreLightened)});
}
${he.mediaRules()}`;const ve={light:t`
    ${pe}
    ${de.light}
    ${m.light}
    ${M.light}
    ${kt.light}
  `,dark:t`
    ${be}
    ${de.dark}
    ${m.dark}
    ${M.dark}
    ${kt.dark}
  `},ue=new o;var me=t`:host {
  --bbva-notification-help-text-color-alert: var(--bbva-list-file-alert-text-color,var(--colorsSecondary500, ${e(n.secondary500)}));
  --bbva-form-checkbox-label-gap: 0;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
  display: flex;
  justify-content: space-between;
  flex-direction: column;
  box-sizing: border-box;
  width: 100%;
  --_list-file-file-size-color: var(--bbva-list-file-file-size-color, var(--colorsSecondary500, ${e(n.secondary500)}));
}

:host([hidden]),
[hidden] {
  display: none !important;
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

.box-container {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.main {
  display: flex;
  flex-direction: column;
  flex-grow: 1;
}

.content {
  display: flex;
  justify-content: start;
}

.file-size {
  margin: 0;
  margin-left: 2rem;
  line-height: var(--lineHeightTypeSmall, ${e(a.typeSmall)});
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${e(E.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${e(E.bookItalic.fontStyle)});
  color: var(--_list-file-file-size-color);
}

.link {
  align-items: flex-start;
  text-align: left;
}

.spinner {
  --bbva-spinner-size: 32px;
}

.checkbox {
  justify-content: center;
  padding-right: 0;
}

.help {
  padding-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${e(r.spacer)}))) / 16) * 1rem);
}

*,
*:before,
*:after {
  box-sizing: inherit;
}
${ue.mediaRules()}`;class ge extends(s(c)){static get is(){return"bbva-list-file"}static get properties(){return{icon:{type:String},iconAccesibilityText:{type:String,attribute:"icon-accesibility-text"},hrefLink:{type:String,attribute:"href-link"},fileName:{type:String,attribute:"file-name"},infoMessage:{type:String,attribute:"info-message"},errorMessage:{type:String,attribute:"error-message"},fileSize:{type:String,attribute:"file-size"},checkbox:{type:Boolean},checked:{type:Boolean},status:{type:String},spinnerAccesibilityText:{type:String,attribute:"spinner-accesibility-text"},withMask:{type:Boolean,attribute:"with-mask"},value:{type:String}}}constructor(){super(),this.icon=j(),this.iconInfo=S(),this.iconError=_(),this.openText="bbva-list-file-open-text",this.errorText="bbva-list-file-error-text",this.spinnerAccesibilityText="bbva-list-file-spinner-accesibility",this.withMask=!0,this.value=""}static get styles(){return[me,b("bbva-list-file-shared-styles"),ve.dark,ve.light]}get _loading(){return v`
      <span class="sr-only">${this.t(this.spinnerAccesibilityText)}</span>
      <bbva-spinner class="spinner" ?with-mask="${this.withMask}"></bbva-spinner>
    `}get _open(){return v`
      <bbva-badge-default text="${this.t(this.openText)}"></bbva-badge-default>
    `}get _error(){return v`
      <bbva-badge-default text="${this.t(this.errorText)}" type="error"></bbva-badge-default>
    `}get _errorMessage(){return this.errorMessage&&v`
        <div class="help">
          <bbva-notification-help
            id="messageError"
            class="notification alert"
            role="alert"
            .icon="${this.iconError}"
            .text="${this.errorMessage}"
          ></bbva-notification-help>
        </div>
      `}get _infoMessage(){return this.infoMessage&&v`
        <div class="help">
          <bbva-notification-help
            id="messageInfo"
            class="notification"
            .icon="${this.iconInfo}"
            .text="${this.infoMessage}"
          ></bbva-notification-help>
        </div>
      `}render(){return this._fileStatus={loading:this._loading,open:this._open,error:this._error},v`
      <div class="box-container">
        <div class="main">
          <div class="content">
            <span class="sr-only">${this.iconAccesibilityText}</span>
            <bbva-link
              class="link"
              .href="${this.hrefLink}"
              @click="${this.fileClicked}"
              .icon="${this.icon}"
              icon-size="24"
            >
              <span>
                ${this.fileName}
              </span>
            </bbva-link>
          </div>
          ${this.fileSize?v`
                <span class="file-size">${this.fileSize}</span>
              `:""}
        </div>
        ${this.checkbox?v`
              <div>
                <bbva-form-checkbox
                  class="checkbox"
                  not-form
                  .value="${this.value}"
                  ?checked="${this.checked}"
                  .label="${this.fileName}"
                  hide-label
                  @change="${this._oncheckboxChange}"
                ></bbva-form-checkbox>
              </div>
            `:""}
        ${this.status?this._fileStatus[this.status]:""}
      </div>
      ${this._infoMessage} ${this._errorMessage}
    `}fileClicked(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("list-file-link-click",{detail:t.detail,composed:!0,bubbles:!0}))}_oncheckboxChange(t){this.checked=t.target.checked,t.stopPropagation(),this.dispatchEvent(new CustomEvent("list-file-checkbox-change",{detail:t.target.checked,composed:!0,bubbles:!0}))}}const ye=(t,e,i)=>{t.dispatchEvent(new CustomEvent(e,{detail:i,bubbles:!0,composed:!0}))},fe=t=>0===t?j():q(),_e=t=>t.replace(/([a-z])([A-Z])/g,"$1-$2").replace(/[\s_]+/g,"-").toLowerCase(),Se=t=>t.replace(/([A-Z])/g,"_$1").toUpperCase(),$e=t=>e=>e.id&&e.id===t.id?Object.assign(e,t):e,ke=t=>e=>{const i=t.find((t=>t.id===e.id));return i&&e.id&&e.id===i.id?Object.assign(e,i):e};var xe=Object.freeze({__proto__:null,EVENTS:{STEPS:{COMPLETE:"complete",ALL_STEPS_COMPLETE:"all-steps-collapsed",FIRST_STEP_COMPLETE:"first-step-complete",STEP_COMPLETE:"step-complete",STEP_ENABLE:"step-enable"},ACTIONS:{CHANGE_LOAN_INPUT_AMOUNT:"change-loan-input-amount",CHANGE_LOAN_TERM:"change-loan-term",CHANGE_CREDIT_CARD_INPUT_AMOUNT:"change-credit-card-input-amount",CHANGE_PAYMENT_TOGGLE:"change-payment-toggle",CHANGE_PAYMENT_OPTION:"change-payment-option",CHANGE_ADDRESS_OPTION:"change-address-option",CHANGE_ADDRESS_MASK_OPTION:"change-address-mask-option",CLICK_LINK:"click-link-sticky",CLICK_DOCUMENT:"click-document",CLICK_TOOLTIP:"click-tooltip"}},OPTIONS:{STEP_NAME:{OFFER:"offerStep",LOAN:"loanStep",CARD:"creditCardStep",PAYMENT:"paymentStep",ADDRESS:"addressStep",ACCOUNT:"accountStep",TERMS:"termsAndConditionsStep"},CHECKBOXES:{TOTAL:7,POSITON:{THREE:3,FOUR:4,FIVE:5}}},fireEvent:ye,getDocumentIcon:fe,kebabCase:_e,snakeCase:Se,updateItem:$e,updateItems:ke}),Ce=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

:host [data-tag-name=bbva-expandable-step] {
  --bbva-expandable-step-current-step-color: var(--colorsSecondary500, ${e(n.secondary500)});
  --bbva-expandable-step-content-max-height: auto;
  --bbva-expandable-step-disabled-opacity: 0.2;
}
:host [data-tag-name=bbva-expandable-step][completed]:last-of-type {
  padding-bottom: 16vh;
}
:host [data-tag-name=bbva-card-banner] {
  padding: 1.5rem 1rem;
  --gridSpacerVariant: {
    margin: 0;
  } ;
}
:host [data-tag-name=bbva-expandable-step][active] [data-select=offer-step-complete-button].normal {
  position: inherit;
  padding: 1.5rem 0;
  margin: 0;
}
:host [data-tag-name=bbva-expandable-step][active] [data-select=offer-step-complete-button].fixed {
  position: fixed;
  bottom: 0;
  left: 0;
  background: white;
  padding: 1.5rem 0;
  margin: 0;
  width: 100vw;
  z-index: 1;
}
:host [data-tag-name=bbva-expandable-step][active] [data-select=loan-step-sticky].normal {
  position: inherit;
  padding: 1rem;
  margin: 0;
}
:host [data-tag-name=bbva-expandable-step][active] [data-select=loan-step-sticky].fixed {
  position: fixed;
  bottom: 0;
  left: 0;
  background: white;
  padding: 1rem;
  margin: 0;
  width: 100vw;
  z-index: 1;
}
:host .blue-content {
  background-color: var(--colorsPrimaryCore, #083a5a);
  margin: -3.75rem -1rem 0rem -1rem;
}
:host .complete-button {
  display: flex;
  flex-direction: column;
  flex-wrap: nowrap;
  align-items: center;
  padding: 1.5rem 0;
}
:host .cat-info {
  margin: 1rem 0 1rem 0;
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  line-height: var(--lineHeightTypeXLarge, ${e(a.typeXLarge)});
  color: var(--colorsSecondary500, ${e(n.secondary500)});
  text-align: center;
}
:host .text {
  color: var(--colorsSecondary500, ${e(n.secondary500)});
}
:host .text--small {
  color: var(--colorsSecondary600, ${e(n.secondary600)});
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
}
:host .text--small-gray {
  color: var(--colorsSecondary500, ${e(n.secondary500)});
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
}
:host .text--large-bold {
  color: var(--colorsSecondary600, ${e(n.secondary600)});
  font-size: var(--typographyTypeLarge, ${e(i.typeLarge)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(E.medium.fontWeight)});
}
:host .text--small-bold {
  color: var(--colorsSecondary600, ${e(n.secondary600)});
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(E.medium.fontWeight)});
}
:host .text--title-bold {
  color: var(--colorsSecondary600, ${e(n.secondary600)});
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(E.medium.fontWeight)});
  margin: 1.5rem 0 1rem 0;
}
:host .text--small-italic {
  color: var(--colorsSecondary500, ${e(n.secondary500)});
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${e(E.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${e(E.bookItalic.fontStyle)});
}
:host .text--small-bold-gray {
  color: var(--colorsSecondary500, ${e(n.secondary500)});
  font-size: var(--typographyTypeSmall, ${e(i.typeSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${e(E.medium.fontWeight)});
}
:host .space--top-xs {
  margin-top: 0.5rem;
}
:host .space--top-s {
  margin-top: 1rem;
}
:host .space--top-sm {
  margin-top: 1.5rem;
}
:host .space--bottom-xs {
  margin-bottom: 0.5rem;
}
:host .space--bottom-s {
  margin-bottom: 1rem;
}
:host .space--xs {
  margin: 0.5rem 0;
}
:host .space--s {
  margin: 1rem 0;
}
:host .space--sm {
  margin: 1.5rem 0;
}
:host .space--zero {
  margin: 0;
}
:host .under-space--zero {
  padding: 0;
}
:host [data-tag-name=bbva-date] {
  font-weight: var(--fontWeightOptionsFontWeight20, ${e(U.fontWeight20)});
  --bbva-date-color: var(--colorsSecondary500, ${e(n.secondary500)});
}
:host [data-tag-name=bbva-list-card] {
  margin: -1rem -1rem 0;
  padding-top: 0.5rem;
}
:host [data-tag-name=bbva-list-simple] {
  padding: 0 0 1rem;
}
:host [data-tag-name=bbva-list-multistep-account] {
  margin: 0 0 1.5rem;
  padding: 0;
}
:host [data-tag-name=bbva-list-bullet] {
  margin: 1rem 0rem;
  padding: 0;
}
:host [data-tag-name=bbva-expandable-step][completed] [data-tag-name=bbva-list-simple]:last-of-type {
  margin: 0 0 1.5rem;
  padding: unset;
}
:host .address-information {
  margin: 0 0 1rem 2.5rem;
}
:host .radio-button {
  padding: 0rem;
  color: var(--colorsSecondary500, ${e(n.secondary500)});
}
:host .radio-button--content-label {
  display: contents;
}
:host .radio-button--icon-color {
  color: var(--colorsPrimaryMedium, ${e(n.primaryMedium)});
}
`;const{EVENTS:Ae,OPTIONS:Te}=xe,{STEP_NAME:Le,CHECKBOXES:Pe}=Te;class Ee extends(l(s(H(c)))){static get is(){return"bbva-multistep-mix-loan-and-credit-card"}static get scopedElements(){const t=[W,X,ot,K,G,Y,J,Z,bt,Q,nt,wt,vt,Rt,f,tt,te,ut,ge,mt,pt,yt,et,h];return Ee.scopedElementsFromClasses(t)}static get properties(){return{_allSteps:{type:Object,attribute:!1},_offerStep:{type:Object,attribute:!1},_loanStep:{type:Object,attribute:!1},_creditCardStep:{type:Object,attribute:!1},_paymentStep:{type:Object,attribute:!1},_addressStep:{type:Object,attribute:!1},_accountStep:{type:Object,attribute:!1},_termsAndConditionsStep:{type:Object,attribute:!1},_togglePayment:{type:Boolean,attribute:!1},_optionPayment:{type:Number,attribute:!1},_selectedPayment:{type:String,attribute:!1},_paymentCatalog:{type:Object,attribute:!1},_optionAddress:{type:Number,attribute:!1},_selectedAddress:{type:String,attribute:!1},_addressCatalog:{type:Object,attribute:!1},showAddress:{type:Boolean},addressMask:{type:String},addressUnmask:{type:String},linkButton:{type:String,attribute:"link-button"},_stepsOfComponent:{type:Array,attribute:!1},_isAllStepsComplete:{type:Boolean,attribute:!1},_lastStepHeight:{type:String,attribute:!1},_optionsSteps:{type:Object,attribute:!1}}}static get styles(){return[Ce,at.dark,ct.dark,gt.dark,b("bbva-multistep-mix-loan-and-credit-card-shared-styles")]}constructor(){super(),this.allSteps={},this.offerStep={},this.loanStep={},this.creditCardStep={},this.paymentStep={},this.addressStep={},this.accountStep={},this.termsAndConditionsStep={},this.togglePayment=!0,this.optionPayment=0,this.selectedPayment="MINIMUM_AMOUNT_PAYMENT",this._paymentCatalog={TOTAL_AMOUNT_PAYMENT:"payment-step-total-amount",MINIMUM_AMOUNT_PAYMENT:"payment-step-minimum-amount",MINIMUM_AMOUNT_TO_AVOID_INTEREST_PAYMENT:"payment-step-minimum-amount-avoid-interest"},this.optionAddress=0,this.selectedAddress="HOME",this._addressCatalog={HOME:"address-step-home",BRANCH:"address-step-branch"},this.showAddress=!1,this.addressMask="",this.addressUnmask="",this.linkButton="",this._stepsOfComponent=["offerStep","loanStep","creditCardStep","paymentStep","addressStep","accountStep","termsAndConditionsStep"],this.isAllStepsComplete=!1,this.lastStepHeight="0px",this._optionsSteps={icon:"24",amount:{currency:"MXN",language:"es-mx"}}}get allSteps(){return this._allSteps}set allSteps(t){this._allSteps=t}get offerStep(){return this._offerStep}set offerStep(t){this._offerStep=t}get loanStep(){return this._loanStep}set loanStep(t){this._loanStep=t}get creditCardStep(){return this._creditCardStep}set creditCardStep(t){this._creditCardStep=t}get paymentStep(){return this._paymentStep}set paymentStep(t){this._paymentStep=t}get addressStep(){return this._addressStep}set addressStep(t){this._addressStep=t}get accountStep(){return this._accountStep}set accountStep(t){this._accountStep=t}get termsAndConditionsStep(){return this._termsAndConditionsStep}set termsAndConditionsStep(t){this._termsAndConditionsStep=t}get togglePayment(){return this._togglePayment}set togglePayment(t){this._togglePayment=t}get optionPayment(){return this._optionPayment}set optionPayment(t){this._optionPayment=t}get selectedPayment(){return this._selectedPayment}set selectedPayment(t){this._selectedPayment=t}get optionAddress(){return this._optionAddress}set optionAddress(t){this._optionAddress=t}get selectedAddress(){return this._selectedAddress}set selectedAddress(t){this._selectedAddress=t}get isAllStepsComplete(){return this._isAllStepsComplete}set isAllStepsComplete(t){this._isAllStepsComplete=t}get lastStepHeight(){return this._lastStepHeight}set lastStepHeight(t){this._lastStepHeight=t}connectedCallback(){super.connectedCallback(),this.addEventListener("expandable-multistep-all-complete",this._handlerAllStepsCollapsed.bind(this))}disconnectedCallback(){super.disconnectedCallback(),this.removeEventListener("expandable-multistep-all-complete",this._handlerAllStepsCollapsed.bind(this))}_handlerAllStepsCollapsed(t){this._isAllStepsComplete=!!this._isAllStepsComplete||(null==t?void 0:t.detail),this._isAllStepsComplete&&(this._lastStep.style.height="0px"),ye(this,Ae.STEPS.ALL_STEPS_COMPLETE,null==t?void 0:t.detail)}updated(t){super.updated(t),t.has("_offerStep")&&Object.keys(this._offerStep).length&&this._init(),t.has("_loanStep")&&Object.keys(this._loanStep).length&&this._handlerChangeAdditionalProductCheckbox(),t.has("_termsAndConditionsStep")&&Object.keys(this._termsAndConditionsStep).length&&(this._lastStep.style.height=this._lastStepHeight)}async _getLastStepHeight(){var t,e;await this.updateComplete;const i=this._lastStep,a=null==i||null===(t=i.shadowRoot)||void 0===t?void 0:t.querySelector(".header").getBoundingClientRect().height,o=null==i||null===(e=i.shadowRoot)||void 0===e?void 0:e.querySelector(".default-content").getBoundingClientRect().height;null!=i&&i.completed||(this._lastStepHeight=`${a+o+24}px`,i.style.height=this._lastStepHeight)}_init(){this._observeOfferSticky(),this._observeLoanSticky(),this._changeInputReadonly("inputLoanAmount",!0),this._changeInputReadonly("inputCreditCardAmount",!0)}_observeOfferSticky(){const t=this._findComponent('[data-select="offer-step-sticky-intersection"]'),e=this.linkButton?136:96;new IntersectionObserver((t=>{t.forEach((t=>{this._validateObserverEntry(t,e,"offer-step-complete-button")}))}),{rootMargin:`-${e}px 0px -${e}px 0px`}).observe(t)}_observeLoanSticky(){const t=this._findComponent('[data-select="loan-step-sticky-intersection"]');new IntersectionObserver((t=>{t.forEach((t=>{this._validateObserverEntry(t,130,"loan-step-sticky")}))}),{rootMargin:"-130px 0px -130px 0px"}).observe(t)}_validateObserverEntry(t,e,i){(null==t||!t.isIntersecting)&&0===(null==t?void 0:t.intersectionRatio)&&(null==t?void 0:t.boundingClientRect.top)>e?this._changeStickyClass("fixed",i):this._changeStickyClass("normal",i)}_changeStickyClass(t,e){const i=this._findComponent(`[data-select="${e}"]`);var a,o,r,n;"fixed"!==t?(null==i||null===(a=i.classList)||void 0===a||a.remove("fixed"),null==i||null===(o=i.classList)||void 0===o||o.add("normal")):(null==i||null===(r=i.classList)||void 0===r||r.remove("normal"),null==i||null===(n=i.classList)||void 0===n||n.add("fixed"))}_changeInputReadonly(t,e){this._findComponent(`#${t}`).readonly=e}buildMultistep(t){this._allSteps={...t},this._stepsOfComponent.forEach((e=>{const i=t[e].reduce(((t,e)=>Object.assign(t,{[null==e?void 0:e.id]:e})),{});this[e]={...i}}))}_changeStep(t){return this._allSteps[t].reduce(((t,e)=>Object.assign(t,{[null==e?void 0:e.id]:e})),{})}updateStep({step:t,items:e}){const i=Array.isArray(e)?ke(e):$e(e);this._allSteps[t]=this._allSteps[t].map(i),this[t]={...this._changeStep(t)}}_buildOfferStep(){var t,e,i,a,o,r,n,l,s,d,c,p,h,b,u,m,g,y,f,_,S,$,k,x,C,A,T,L,P,E,w,I,O,M,N,z,B,F,R,D,V,j,q,U,H,W,X,K,G,Y,J,Z,Q,tt,et,it,at,ot,rt,nt,lt,st,dt,ct,pt,ht,bt,vt,ut,mt,gt,yt,ft,_t,St,$t;return v`
      <div data-select="offer-step-description" class="blue-content">
        <bbva-card-banner
          ambient="dark"
          description="${null===(t=this._offerStep)||void 0===t||null===(e=t.header)||void 0===e?void 0:e.description}">
          <div slot="image">
            <img
              src="${null===(i=this._offerStep)||void 0===i||null===(a=i.header)||void 0===a||null===(o=a.image)||void 0===o?void 0:o.src}"
              alt=""
              width="${null===(r=this._offerStep)||void 0===r||null===(n=r.header)||void 0===n||null===(l=n.image)||void 0===l?void 0:l.width}"
              height="${null===(s=this._offerStep)||void 0===s||null===(d=s.header)||void 0===d||null===(c=d.image)||void 0===c?void 0:c.height}">
          </div>
        </bbva-card-banner>
      </div>
      <div data-select="offer-step-products">
        <bbva-text
          tag="span"
          class="text--title-bold"
          text="${null===(p=this._offerStep)||void 0===p||null===(h=p.products)||void 0===h?void 0:h.title}">
        </bbva-text>
        <bbva-text
          tag="span"
          class="text--small"
          text="${null===(b=this._offerStep)||void 0===b||null===(u=b.products)||void 0===u||null===(m=u.loan)||void 0===m?void 0:m.description}">
        </bbva-text>
        <bbva-amount
          class="${null===(g=this._offerStep)||void 0===g||null===(y=g.products)||void 0===y||null===(f=y.loan)||void 0===f?void 0:f.class}"
          decimal-digits="${null===(_=this._offerStep)||void 0===_||null===(S=_.products)||void 0===S||null===($=S.loan)||void 0===$?void 0:$.decimalDigits}"
          variant="${null===(k=this._offerStep)||void 0===k||null===(x=k.products)||void 0===x||null===(C=x.loan)||void 0===C?void 0:C.variant}"
          amount="${null===(A=this._offerStep)||void 0===A||null===(T=A.products)||void 0===T||null===(L=T.loan)||void 0===L?void 0:L.amount}"
          language="${null===(P=this._offerStep)||void 0===P||null===(E=P.products)||void 0===E||null===(w=E.loan)||void 0===w?void 0:w.language}"
          currency-code="${null===(I=this._offerStep)||void 0===I||null===(O=I.products)||void 0===O||null===(M=O.loan)||void 0===M?void 0:M.currency}"
          local-currency="${null===(N=this._offerStep)||void 0===N||null===(z=N.products)||void 0===z||null===(B=z.loan)||void 0===B?void 0:B.currency}">
        </bbva-amount>
        <bbva-text
          tag="span"
          class="text--small"
          text="${null===(F=this._offerStep)||void 0===F||null===(R=F.products)||void 0===R||null===(D=R.card)||void 0===D?void 0:D.description}">
        </bbva-text>
        <bbva-amount
          class="${null===(V=this._offerStep)||void 0===V||null===(j=V.products)||void 0===j||null===(q=j.card)||void 0===q?void 0:q.class}"
          decimal-digits="${null===(U=this._offerStep)||void 0===U||null===(H=U.products)||void 0===H||null===(W=H.card)||void 0===W?void 0:W.decimalDigits}"
          variant="${null===(X=this._offerStep)||void 0===X||null===(K=X.products)||void 0===K||null===(G=K.card)||void 0===G?void 0:G.variant}"
          amount="${null===(Y=this._offerStep)||void 0===Y||null===(J=Y.products)||void 0===J||null===(Z=J.card)||void 0===Z?void 0:Z.amount}"
          language="${null===(Q=this._offerStep)||void 0===Q||null===(tt=Q.products)||void 0===tt||null===(et=tt.card)||void 0===et?void 0:et.language}"
          currency-code="${null===(it=this._offerStep)||void 0===it||null===(at=it.products)||void 0===at||null===(ot=at.card)||void 0===ot?void 0:ot.currency}"
          local-currency="${null===(rt=this._offerStep)||void 0===rt||null===(nt=rt.products)||void 0===nt||null===(lt=nt.card)||void 0===lt?void 0:lt.currency}">
        </bbva-amount>
      </div>
      <div data-select="offer-step-benefits">
        <bbva-text
          tag="span"
          class="text--title-bold"
          text="${null===(st=this._offerStep)||void 0===st||null===(dt=st.benefits)||void 0===dt?void 0:dt.title}">
        </bbva-text>
        ${null===(ct=this._offerStep)||void 0===ct||null===(pt=ct.benefits)||void 0===pt||null===(ht=pt.list)||void 0===ht?void 0:ht.map((t=>v`
          <bbva-list-bullet>
            ${t}
          </bbva-list-bullet>
        `))}
      </div>
      <div data-select="offer-step-designed-for-you">
        <bbva-text
          tag="span"
          class="text--title-bold"
          text="${null===(bt=this._offerStep)||void 0===bt||null===(vt=bt.designedForYou)||void 0===vt?void 0:vt.title}">
        </bbva-text>
        ${null===(ut=this._offerStep)||void 0===ut||null===(mt=ut.designedForYou)||void 0===mt||null===(gt=mt.list)||void 0===gt?void 0:gt.map((t=>v`
          <bbva-text
            tag="span"
            class="text--small ${null==t?void 0:t.class}"
            text="${null==t?void 0:t.text}">
          </bbva-text>
        `))}
      </div>
      <div data-select="offer-step-configure-your-package">
        <bbva-text
          tag="span"
          class="text--title-bold"
          text="${null===(yt=this._offerStep)||void 0===yt||null===(ft=yt.configureYourPackage)||void 0===ft?void 0:ft.title}">
        </bbva-text>
        ${null===(_t=this._offerStep)||void 0===_t||null===(St=_t.configureYourPackage)||void 0===St||null===($t=St.list)||void 0===$t?void 0:$t.map((t=>v`
          <bbva-text
            tag="span"
            class="${null==t?void 0:t.class}"
            text="${null==t?void 0:t.text}">
          </bbva-text>
        `))}
      </div>
      <div data-select="offer-step-sticky-intersection"></div>
    `}_buildOfferStepFilled(){var t,e;return v`
      <div data-select="offer-step-filled">
        <bbva-list-simple
          ambient="dark"
          label="${null===(t=this._offerStep)||void 0===t||null===(e=t.filled)||void 0===e?void 0:e.title}">
        </bbva-list-simple>
      </div>
    `}_buildLoanStep(){var t,e,i,a,o,r,n,l,s,d,c,p,h,b,u,m,g,y,f,_,S,$,x,C,A,T,L,P,E,w,I,O,M,N,z,B,F,R,D,V,j,q,U,H,W,X,K,G,Y,J,Z,Q,tt,et,it,at,ot,rt,nt,lt,st,dt,ct,pt,ht,bt,vt,ut,mt,gt,yt,ft,_t,St,$t,kt,xt,Ct,At,Tt,Lt,Pt,Et,wt,It,Ot,Mt,Nt,zt,Bt,Ft,Rt,Dt,Vt,jt,qt,Ut,Ht,Wt,Xt,Kt,Gt,Yt,Jt,Zt,Qt,te,ee;return v`
      <div data-select="loan-step-input-amount">
        <bbva-text
          tag="span"
          class="space--bottom-s"
          text="${null===(t=this._loanStep)||void 0===t||null===(e=t.header)||void 0===e?void 0:e.description}"
          size="S">
        </bbva-text>
        <bbva-form-amount
          id="inputLoanAmount"
          class="space--bottom-s"
          label="${null===(i=this._loanStep)||void 0===i||null===(a=i.inputAmount)||void 0===a?void 0:a.label}"
          decimal-digits="${null===(o=this._loanStep)||void 0===o||null===(r=o.inputAmount)||void 0===r?void 0:r.decimalDigits}"
          currency-code="${null===(n=this._loanStep)||void 0===n||null===(l=n.inputAmount)||void 0===l?void 0:l.currency}"
          local-currency="${null===(s=this._loanStep)||void 0===s||null===(d=s.inputAmount)||void 0===d?void 0:d.currency}"
          language="${null===(c=this._loanStep)||void 0===c||null===(p=c.inputAmount)||void 0===p?void 0:p.language}"
          info-message="${null===(h=this._loanStep)||void 0===h||null===(b=h.inputAmount)||void 0===b||null===(u=b.messages)||void 0===u?void 0:u.info}"
          maxlength="${null===(m=this._loanStep)||void 0===m||null===(g=m.inputAmount)||void 0===g?void 0:g.maxLength}"
          inputmode="${null===(y=this._loanStep)||void 0===y||null===(f=y.inputAmount)||void 0===f?void 0:f.inputMode}"
          amount="${null===(_=this._loanStep)||void 0===_||null===(S=_.inputAmount)||void 0===S?void 0:S.amount}"
          min="${null===($=this._loanStep)||void 0===$||null===(x=$.inputAmount)||void 0===x?void 0:x.min}"
          max="${null===(C=this._loanStep)||void 0===C||null===(A=C.inputAmount)||void 0===A?void 0:A.max}"
          @form-amount-input-change="${this._handlerChangeInputLoanAmount}"
          @form-field-input-focus="${this._handlerFocusInputLoanAmount}"
          @form-field-input-blur="${this._handlerBlurInputLoanAmount}">
        </bbva-form-amount>
      </div>
      <div data-select="loan-step-terms">
        <bbva-list-simple
          label="${null===(T=this._loanStep)||void 0===T||null===(L=T.terms)||void 0===L?void 0:L.label}"
          description="${null===(P=this._loanStep)||void 0===P||null===(E=P.terms)||void 0===E?void 0:E.description}"
          description-medium>
        </bbva-list-simple>
        <bbva-form-range
          id="termsSlider"
          class="under-space--zero"
          min="${null===(w=this._loanStep)||void 0===w||null===(I=w.terms)||void 0===I||null===(O=I.range)||void 0===O?void 0:O.min}"
          max="${null===(M=this._loanStep)||void 0===M||null===(N=M.terms)||void 0===N||null===(z=N.range)||void 0===z?void 0:z.max}"
          value="${null===(B=this._loanStep)||void 0===B||null===(F=B.terms)||void 0===F||null===(R=F.range)||void 0===R?void 0:R.value}"
          .items="${null===(D=this._loanStep)||void 0===D||null===(V=D.terms)||void 0===V||null===(j=V.range)||void 0===j?void 0:j.items}"
          ?hidden="${null===(q=this._loanStep)||void 0===q||null===(U=q.terms)||void 0===U?void 0:U.hidden}"
          show-labels
          @change="${this._handlerChangeRange}">
        </bbva-form-range>
      </div>
      <div data-select="loan-step-benefits">
        <bbva-text
          tag="span"
          class="text--title-bold"
          text="${null===(H=this._loanStep)||void 0===H||null===(W=H.benefits)||void 0===W?void 0:W.title}">
        </bbva-text>
        ${null===(X=this._loanStep)||void 0===X||null===(K=X.benefits)||void 0===K||null===(G=K.list)||void 0===G?void 0:G.map((t=>v`
          <bbva-list-bullet>
          ${t}
          </bbva-list-bullet>
        `))}
      </div>
      <div data-select="loan-step-interest-rates">
        <bbva-text
          tag="span"
          class="text--title-bold"
          text="${null===(Y=this._loanStep)||void 0===Y||null===(J=Y.interestRates)||void 0===J?void 0:J.title}">
        </bbva-text>
        ${null===(Z=this._loanStep)||void 0===Z||null===(Q=Z.interestRates)||void 0===Q||null===(tt=Q.list)||void 0===tt?void 0:tt.map((t=>v`
          <bbva-list-simple
            id="${null==t?void 0:t.id}"
            description-medium
            action-icon="${k()}"
            action-accessibility-text="help"
            label="${null==t?void 0:t.label}"
            description="${null==t?void 0:t.percentage}"
            data-custom-event="${null==t?void 0:t.eventName}"
            @list-simple-icon-click="${this._handlerShowTooltip}">
          </bbva-list-simple>
        `))}
      </div>
      <div data-select="loan-step-costs">
        <bbva-text
          tag="span"
          class="text--title-bold"
          text="${null===(et=this._loanStep)||void 0===et||null===(it=et.costs)||void 0===it?void 0:it.title}"
          label-medium>
        </bbva-text>
        ${null!==(at=this._loanStep)&&void 0!==at&&null!==(ot=at.costs)&&void 0!==ot&&ot.additionalProduct?v`
          <bbva-list-simple
            id="${null===(rt=this._loanStep)||void 0===rt||null===(nt=rt.costs)||void 0===nt||null===(lt=nt.additionalProduct)||void 0===lt?void 0:lt.id}"
            action-icon="${k()}"
            action-accessibility-text="help"
            label="${null===(st=this._loanStep)||void 0===st||null===(dt=st.costs)||void 0===dt||null===(ct=dt.additionalProduct)||void 0===ct?void 0:ct.label}"
            description="${null===(pt=this._loanStep)||void 0===pt||null===(ht=pt.costs)||void 0===ht||null===(bt=ht.additionalProduct)||void 0===bt?void 0:bt.value}"
            data-custom-event="${null===(vt=this._loanStep)||void 0===vt||null===(ut=vt.costs)||void 0===ut||null===(mt=ut.additionalProduct)||void 0===mt?void 0:mt.eventName}"
            @list-simple-icon-click="${this._handlerShowTooltip}">
          </bbva-list-simple>
        `:""}
        <bbva-list-simple
          id="${null===(gt=this._loanStep)||void 0===gt||null===(yt=gt.costs)||void 0===yt||null===(ft=yt.cat)||void 0===ft?void 0:ft.id}"
          description-medium
          action-icon="${k()}"
          action-accessibility-text="help"
          label="${null===(_t=this._loanStep)||void 0===_t||null===(St=_t.costs)||void 0===St||null===($t=St.cat)||void 0===$t?void 0:$t.label}"
          description="${null===(kt=this._loanStep)||void 0===kt||null===(xt=kt.costs)||void 0===xt||null===(Ct=xt.cat)||void 0===Ct?void 0:Ct.value}"
          data-custom-event="CAT"
          @list-simple-icon-click="${this._handlerShowTooltip}">
        </bbva-list-simple>
        ${null!==(At=this._loanStep)&&void 0!==At&&null!==(Tt=At.costs)&&void 0!==Tt&&Tt.additionalProduct?v`
          <bbva-notification-message
            class="space--s"
            variant="default"
            ?hidden="${!(null!==(Lt=this._loanStep)&&void 0!==Lt&&null!==(Pt=Lt.costs)&&void 0!==Pt&&null!==(Et=Pt.additionalProduct)&&void 0!==Et&&Et.infoMessage)}">
              ${null===(wt=this._loanStep)||void 0===wt||null===(It=wt.costs)||void 0===It||null===(Ot=It.additionalProduct)||void 0===Ot?void 0:Ot.infoMessage}
          </bbva-notification-message>
        `:""}
      </div>
      <bbva-divider size="small center"></bbva-divider>
      <div data-select="loan-step-cat-info">
        <div class="cat-info">
          <span>${null===(Mt=this._loanStep)||void 0===Mt||null===(Nt=Mt.catInfo)||void 0===Nt?void 0:Nt.title}</span>
          <div class="text--small-gray">
            <span class="text--large-bold">${null===(zt=this._loanStep)||void 0===zt||null===(Bt=zt.catInfo)||void 0===Bt?void 0:Bt.percentage}</span>
            ${this._getLocale("loan-step-cat-info-text-1")}
            <bbva-date date="${null===(Ft=this._loanStep)||void 0===Ft||null===(Rt=Ft.catInfo)||void 0===Rt?void 0:Rt.date}"></bbva-date>
            ${this._getLocale("loan-step-cat-info-text-2")}
            <span class="text--small-bold">${null===(Dt=this._loanStep)||void 0===Dt||null===(Vt=Dt.catInfo)||void 0===Vt?void 0:Vt.annualInterest}</span>
          </div>
          <span>${this._getLocale("loan-step-cat-info-text-3")}</span>
        </div>
      </div>
      <div data-select="loan-step-sticky-intersection"></div>
      <div data-select="loan-step-sticky" class="normal">
        <bbva-text
          tag="span"
          class="text--small-gray"
          text="${null===(jt=this._loanStep)||void 0===jt||null===(qt=jt.sticky)||void 0===qt?void 0:qt.title}"
          alignment="center">
        </bbva-text>
        <bbva-list-definition-amount
          amount="${null===(Ut=this._loanStep)||void 0===Ut||null===(Ht=Ut.sticky)||void 0===Ht?void 0:Ht.amount}"
          center
          language="${null===(Wt=this._loanStep)||void 0===Wt||null===(Xt=Wt.sticky)||void 0===Xt?void 0:Xt.language}"
          currency-code="${null===(Kt=this._loanStep)||void 0===Kt||null===(Gt=Kt.sticky)||void 0===Gt?void 0:Gt.currency}"
          local-currency="${null===(Yt=this._loanStep)||void 0===Yt||null===(Jt=Yt.sticky)||void 0===Jt?void 0:Jt.currency}"
          variant-amount="${null===(Zt=this._loanStep)||void 0===Zt||null===(Qt=Zt.sticky)||void 0===Qt?void 0:Qt.variant}">
        </bbva-list-definition-amount>
        <bbva-text
          tag="span"
          class="text--small-italic"
          text="${null===(te=this._loanStep)||void 0===te||null===(ee=te.sticky)||void 0===ee?void 0:ee.iva}"
          alignment="center">
        </bbva-text>
      </div>
    `}_handlerChangeInputLoanAmount(t){var e,i,a,o,r,n,l,s,d;const c=null==t?void 0:t.target,{amount:p,max:h,min:b}=c,v=null===(e=this._loanStep)||void 0===e||null===(i=e.inputAmount)||void 0===i||null===(a=i.messages)||void 0===a?void 0:a.info,u=null===(o=this._loanStep)||void 0===o||null===(r=o.inputAmount)||void 0===r||null===(n=r.messages)||void 0===n?void 0:n.maximum,m=null===(l=this._loanStep)||void 0===l||null===(s=l.inputAmount)||void 0===s||null===(d=s.messages)||void 0===d?void 0:d.minimum,g=this._findComponent("#loanStep"),y=this._findComponent("#termsSlider"),f=this._findComponent("#loanStepCompleteButton");g.disabled||((p>h||p<b)&&(c.infoMessage="",c.invalid=!0,c.errorMessage=p>h?u:m,y.hidden||(y.disabled=!0),f.disabled=!0),0===p&&(c.infoMessage=v,c.errorMessage="",c.invalid=!1,y.hidden||(y.disabled=!0),f.disabled=!0),p>=b&&p<=h&&(c.infoMessage=v,c.errorMessage="",c.invalid=!1,y.hidden||(y.disabled=!1),f.disabled=!1,g.disableOnPreviousStepEdit=!1)),null==t||t.preventDefault()}_handlerFocusInputLoanAmount(t){this._changeStickyClass("normal","loan-step-sticky"),null==t||t.preventDefault()}_handlerBlurInputLoanAmount(t){const e=null==t?void 0:t.target;this._changeStickyClass("fixed","loan-step-sticky"),e.focused=!1,e.readonly=!1;const{amount:i,max:a,min:o}=e,{inputAmount:{amount:r,currency:n}}=this._loanStep;if(i!==r&&i>=o&&i<=a){this._loanStep.inputAmount.amount=Number(i);const t={amount:Number(i),currency:n};ye(this,Ae.ACTIONS.CHANGE_LOAN_INPUT_AMOUNT,t)}null==t||t.preventDefault()}_handlerChangeRange(t){var e,i,a,o;const r=Number(null==t||null===(e=t.target)||void 0===e?void 0:e.getAttribute("aria-valuenow")),n=null===(i=this._loanStep)||void 0===i||null===(a=i.terms)||void 0===a||null===(o=a.range)||void 0===o?void 0:o.items[r-1];this._loanStep.terms.range.value=r,this._loanStep.terms.description=this._getLocale("loan-step-terms-description",{term:n});const l={number:n};ye(this,Ae.ACTIONS.CHANGE_LOAN_TERM,l)}_buildLoanStepFilled(){var t,e,i,a,o,r,n,l,s,d,c,p,h,b,u,m,g,y,f,_,S,$,k;return v`
      <div data-select="loan-step-filled">
        ${null===(t=this._loanStep)||void 0===t||null===(e=t.filled)||void 0===e||null===(i=e.list)||void 0===i?void 0:i.map((t=>v`
          <bbva-list-simple
            id="${null==t?void 0:t.id}"
            ambient= "dark"
            label="${null==t?void 0:t.label}"
            language="${null==t?void 0:t.language}"
            currency-code="${null==t?void 0:t.currency}"
            local-currency="${null==t?void 0:t.currency}"
            amount="${null==t?void 0:t.value}">
          </bbva-list-simple>
        `))}
        <bbva-list-simple
          id="${null===(a=this._loanStep)||void 0===a||null===(o=a.filled)||void 0===o||null===(r=o.terms)||void 0===r?void 0:r.id}"
          ambient="dark"
          label="${null===(n=this._loanStep)||void 0===n||null===(l=n.filled)||void 0===l||null===(s=l.terms)||void 0===s?void 0:s.label}"
          description="${null===(d=this._loanStep)||void 0===d||null===(c=d.filled)||void 0===c||null===(p=c.terms)||void 0===p?void 0:p.description}">
        </bbva-list-simple>
        ${null!==(h=this._loanStep)&&void 0!==h&&null!==(b=h.filled)&&void 0!==b&&b.additionalProduct?v`
          <bbva-list-simple
            id="${null===(u=this._loanStep)||void 0===u||null===(m=u.filled)||void 0===m||null===(g=m.additionalProduct)||void 0===g?void 0:g.id}"
            ambient="dark"
            label="${null===(y=this._loanStep)||void 0===y||null===(f=y.filled)||void 0===f||null===(_=f.additionalProduct)||void 0===_?void 0:_.label}"
            description="${null===(S=this._loanStep)||void 0===S||null===($=S.filled)||void 0===$||null===(k=$.additionalProduct)||void 0===k?void 0:k.description}">
          </bbva-list-simple>
        `:""}
      </div>
    `}_buildCreditCardStep(){var t,e,i,a,o,r,n,l,s,d,c,p,h,b,u,m,g,y,f,_,S,$,x,C,A,T,L,P,E,w,I,O,M,N,z,B,F,R,D,V,j,q,U,H,W,X,K,G,Y,J,Z;return v`
      <div data-select="credit-card-step-input-amount">
        <bbva-text
        tag="span"
        class="space--bottom-s"
        text="${null===(t=this._creditCardStep)||void 0===t||null===(e=t.header)||void 0===e?void 0:e.description}"
        size="S">
        </bbva-text>
        <bbva-form-amount
          id="inputCreditCardAmount"
          class="space--bottom-s"
          label="${null===(i=this._creditCardStep)||void 0===i||null===(a=i.inputAmount)||void 0===a?void 0:a.label}"
          decimal-digits="${null===(o=this._creditCardStep)||void 0===o||null===(r=o.inputAmount)||void 0===r?void 0:r.decimalDigits}"
          currency-code="${null===(n=this._creditCardStep)||void 0===n||null===(l=n.inputAmount)||void 0===l?void 0:l.currency}"
          local-currency="${null===(s=this._creditCardStep)||void 0===s||null===(d=s.inputAmount)||void 0===d?void 0:d.currency}"
          language="${null===(c=this._creditCardStep)||void 0===c||null===(p=c.inputAmount)||void 0===p?void 0:p.language}"
          info-message="${null===(h=this._creditCardStep)||void 0===h||null===(b=h.inputAmount)||void 0===b||null===(u=b.messages)||void 0===u?void 0:u.info}"
          maxlength="${null===(m=this._creditCardStep)||void 0===m||null===(g=m.inputAmount)||void 0===g?void 0:g.maxLength}"
          inputmode="${null===(y=this._creditCardStep)||void 0===y||null===(f=y.inputAmount)||void 0===f?void 0:f.inputMode}"
          amount="${null===(_=this._creditCardStep)||void 0===_||null===(S=_.inputAmount)||void 0===S?void 0:S.amount}"
          min="${null===($=this._creditCardStep)||void 0===$||null===(x=$.inputAmount)||void 0===x?void 0:x.min}"
          max="${null===(C=this._creditCardStep)||void 0===C||null===(A=C.inputAmount)||void 0===A?void 0:A.max}"
          @form-amount-input-change="${this._handlerChangeInputCreditCardAmount}"
          @form-field-input-blur="${this._handlerBlurInputCreditCardAmount}">
        </bbva-form-amount>
      </div>
      <div data-select="credit-card-step-benefits">
        <bbva-text
          tag="span"
          class="text--title-bold"
          text="${null===(T=this._creditCardStep)||void 0===T||null===(L=T.benefits)||void 0===L?void 0:L.title}"
          label-medium>
        </bbva-text>
        ${null===(P=this._creditCardStep)||void 0===P||null===(E=P.benefits)||void 0===E||null===(w=E.list)||void 0===w?void 0:w.map((t=>v`
          <bbva-list-bullet>
            ${t}
          </bbva-list-bullet>
        `))}
      </div>
      <div data-select="credit-card-step-costs">
        <bbva-text
          tag="span"
          class="text--title-bold"
          text="${null===(I=this._creditCardStep)||void 0===I||null===(O=I.costs)||void 0===O?void 0:O.title}"
          label-medium>
        </bbva-text>
        <bbva-list-simple
          id="${null===(M=this._creditCardStep)||void 0===M||null===(N=M.costs)||void 0===N||null===(z=N.cat)||void 0===z?void 0:z.id}"
          description-medium
          action-icon="${k()}"
          action-accessibility-text="help"
          label="${null===(B=this._creditCardStep)||void 0===B||null===(F=B.costs)||void 0===F||null===(R=F.cat)||void 0===R?void 0:R.label}"
          description="${null===(D=this._creditCardStep)||void 0===D||null===(V=D.costs)||void 0===V||null===(j=V.cat)||void 0===j?void 0:j.value}"
          data-custom-event="CAT"
          @list-simple-icon-click="${this._handlerShowTooltip}">
        </bbva-list-simple>
      </div>
      <div data-select="credit-card-step-cat-info">
        <div class="cat-info">
          <span class="text--small-gray">
            <span class="text--large-bold">${null===(q=this._creditCardStep)||void 0===q||null===(U=q.catInfo)||void 0===U?void 0:U.percentage}</span>
            ${this._getLocale("credit-card-step-cat-info-text-1")}
            <span class="text--small-bold">${null===(H=this._creditCardStep)||void 0===H||null===(W=H.catInfo)||void 0===W?void 0:W.annualInterest}</span>
            ${this._getLocale("credit-card-step-cat-info-text-2")}
            <span>${null===(X=this._creditCardStep)||void 0===X||null===(K=X.catInfo)||void 0===K?void 0:K.annualCommission}</span>
            ${this._getLocale("credit-card-step-cat-info-text-3")}
            <bbva-date date="${null===(G=this._creditCardStep)||void 0===G||null===(Y=G.catInfo)||void 0===Y?void 0:Y.date}"></bbva-date>
            ${this._getLocale("credit-card-step-cat-info-text-4")}
            <span class="text--small-bold">${null===(J=this._creditCardStep)||void 0===J||null===(Z=J.catInfo)||void 0===Z?void 0:Z.annualInterest}</span><br>
          </span>
        </div>
      </div>
    `}_handlerChangeInputCreditCardAmount(t){var e,i,a,o,r,n,l,s,d;const c=null==t?void 0:t.target,{amount:p,max:h,min:b}=c,v=null===(e=this._creditCardStep)||void 0===e||null===(i=e.inputAmount)||void 0===i||null===(a=i.messages)||void 0===a?void 0:a.info,u=null===(o=this._creditCardStep)||void 0===o||null===(r=o.inputAmount)||void 0===r||null===(n=r.messages)||void 0===n?void 0:n.maximum,m=null===(l=this._creditCardStep)||void 0===l||null===(s=l.inputAmount)||void 0===s||null===(d=s.messages)||void 0===d?void 0:d.minimum,g=this._findComponent("#creditCardStep"),y=this._findComponent("#creditCardStepCompleteButton");g.disabled||((p>h||p<b)&&(c.infoMessage="",c.invalid=!0,c.errorMessage=p>h?u:m,y.disabled=!0),0===p&&(c.infoMessage=v,c.errorMessage="",c.invalid=!1,y.disabled=!0),p>=b&&p<=h&&(c.infoMessage=v,c.errorMessage="",c.invalid=!1,y.disabled=!1,g.disableOnPreviousStepEdit=!1)),null==t||t.preventDefault()}_handlerBlurInputCreditCardAmount(t){const e=null==t?void 0:t.target;e.focused=!1,e.readonly=!1;const{amount:i,max:a,min:o}=e,{inputAmount:{amount:r,currency:n}}=this._creditCardStep;if(i!==r&&i>=o&&i<=a){this._creditCardStep.inputAmount.amount=Number(i);const t={amount:Number(i),currency:n};ye(this,Ae.ACTIONS.CHANGE_CREDIT_CARD_INPUT_AMOUNT,t)}null==t||t.preventDefault()}_buildCreditCardStepFilled(){var t,e,i,a,o,r,n,l,s,d,c,p,h,b,u,m,g;return v`
      <div data-select="credit-card-step-filled">
        <bbva-list-simple
          ambient="dark"
          label="${null===(t=this._creditCardStep)||void 0===t||null===(e=t.filled)||void 0===e||null===(i=e.credit)||void 0===i?void 0:i.label}"
          language="${null===(a=this._creditCardStep)||void 0===a||null===(o=a.filled)||void 0===o||null===(r=o.credit)||void 0===r?void 0:r.language}"
          currency-code="${null===(n=this._creditCardStep)||void 0===n||null===(l=n.filled)||void 0===l||null===(s=l.credit)||void 0===s?void 0:s.currency}"
          local-currency="${null===(d=this._creditCardStep)||void 0===d||null===(c=d.filled)||void 0===c||null===(p=c.credit)||void 0===p?void 0:p.currency}"
          amount="${null===(h=this._creditCardStep)||void 0===h||null===(b=h.filled)||void 0===b||null===(u=b.credit)||void 0===u?void 0:u.value}">
        </bbva-list-simple>
        ${null===(m=this._creditCardStep)||void 0===m||null===(g=m.filled.list)||void 0===g?void 0:g.map((t=>v`
          <bbva-list-simple
            id="${null==t?void 0:t.id}"
            ambient= "dark"
            label="${null==t?void 0:t.label}"
            description="${null==t?void 0:t.description}">
          </bbva-list-simple>
        `))}
      </div>
    `}_buildPaymentStep(){var t,e,i,a;return v`
      <div data-select="payment-step-description">
        <bbva-text
          tag="span"
          text="${null===(t=this._paymentStep)||void 0===t||null===(e=t.header)||void 0===e?void 0:e.description}"
          size="S">
        </bbva-text>
      </div>
      <div data-select="payment-step-options">
        <bbva-form-toggle
          id="TOTAL_AMOUNT_PAYMENT"
          variant="section"
          value="TOTAL_AMOUNT_PAYMENT"
          ?checked="${this._togglePayment}"
          @form-toggle-switch-change="${this._handlerPaymentStepToggleChange}">
            ${null===(i=this._paymentStep)||void 0===i||null===(a=i.toggle)||void 0===a?void 0:a.description}
        </bbva-form-toggle>
        ${this._togglePayment?this._buildPaymentStepOptions():""}
      </div>
      <div data-select="payment-step-notification">
        <bbva-notification-message
          class="space--s"
          variant="default">
            ${this._getLocale(this._togglePayment?"payment-step-message-toggle-on":"payment-step-message-toggle-off")}
        </bbva-notification-message>
      </div>
    `}_handlerPaymentStepToggleChange(t){const e=null==t?void 0:t.detail;this._togglePayment=null==e?void 0:e.checked,this._selectedPayment=this._togglePayment?"MINIMUM_AMOUNT_PAYMENT":null==e?void 0:e.value,this._optionPayment=0,ye(this,Ae.ACTIONS.CHANGE_PAYMENT_TOGGLE,this._selectedPayment),this._handlerHiddenCheckbox(),this._handlerChangeCheckbox("payment"),this._handlerTermsAndConditionsStepUncollapse()}_buildPaymentStepOptions(){var t,e,i;return v`
      <bbva-form-radio-group
        id="paymentStepRadio"
        name="paymentStepRadio"
        selected="${this._optionPayment}"
        @form-radio-group-item-change="${this._handlerPaymentStepOptionChange}">
          ${null===(t=this._paymentStep)||void 0===t||null===(e=t.options)||void 0===e||null===(i=e.list)||void 0===i?void 0:i.map((t=>{var e;return v`
            <bbva-form-radio-button
              id="${null==t?void 0:t.id}"
              variant="help"
              value="${null==t?void 0:t.id}"
              name="paymentStepRadioOption">
              <div class="radio-button--content-label">
                ${null==t?void 0:t.label}
                <bbva-core-icon
                  class="radio-button--icon-color"
                  icon="${k()}"
                  size="${null===(e=this._optionsStep)||void 0===e?void 0:e.icon}"
                  data-custom-event="${null==t?void 0:t.eventName}"
                  @click="${this._handlerShowTooltip}">
                </bbva-core-icon>
              </div>
            </bbva-form-radio-button>
          `}))}
      </bbva-form-radio-group>
    `}_handlerPaymentStepOptionChange(t){const e=null==t?void 0:t.detail;this._optionPayment=null==e?void 0:e.selected,this._selectedPayment=null==e?void 0:e.value,ye(this,Ae.ACTIONS.CHANGE_PAYMENT_OPTION,this._selectedPayment),this._handlerChangeCheckbox("payment"),this._handlerTermsAndConditionsStepUncollapse(),null==t||t.preventDefault()}_buildPaymentStepFilled(){const t=this._paymentCatalog[this._selectedPayment],e="TOTAL_AMOUNT_PAYMENT"!==this._selectedPayment?this._getLocale("payment-step-payment-type",{paymentType:this._getLocale(t).toLowerCase()}):this._getLocale(t);return v`
      <div data-select="payment-step-filled">
        <bbva-list-simple
          ambient="dark"
          label="${e}">
        </bbva-list-simple>
      </div>
    `}_buildAddressStep(){var t,e,i,a,o,r,n,l,s,d,c,p,h,b,u,m;return v`
      <div data-select="address-step-description">
        <bbva-text
          tag="span"
          class="space--bottom-s"
          text="${null===(t=this._addressStep)||void 0===t||null===(e=t.header)||void 0===e?void 0:e.description}"
          size="S">
        </bbva-text>
      </div>
      <div data-select="address-step-options">
        <bbva-form-radio-group
          id="addressStepRadio"
          name="addressStepRadio"
          selected="${this._optionAddress}"
          @form-radio-group-item-change="${this._handlerAddressStepOptionChange}" >
          <bbva-form-radio-button
            id="HOME"
            variant="help"
            value="HOME"
            name="addressStepRadioOption"
            info-message="${null===(i=this._addressStep)||void 0===i||null===(a=i.options)||void 0===a||null===(o=a.home)||void 0===o?void 0:o.message}">
            <div class="radio-button--content-label">
              <span class="text--small-bold">${null===(r=this._addressStep)||void 0===r||null===(n=r.options)||void 0===n||null===(l=n.home)||void 0===l?void 0:l.label}</span>
              <bbva-core-icon
                class="radio-button--icon-color"
                icon="${k()}"
                size="${null===(s=this._optionsStep)||void 0===s?void 0:s.icon}"
                data-custom-event="HOME"
                @click="${this._handlerShowTooltip}">
              </bbva-core-icon>
            </div>
          </bbva-form-radio-button>
          <div class="address-information">
            <bbva-text
              tag="span"
              class="text--small-italic"
              text="${this.showAddress?this.addressUnmask:this.addressMask}"
              size="XS">
            </bbva-text>
            <bbva-link
              @click="${this._handlerAddressStepMaskOptionChange}">
                ${this._getLocale(this.showAddress?"address-step-hide-data":"address-step-show-data")}
            </bbva-link>
          </div>
          <bbva-divider size="fit"></bbva-divider>
          <bbva-form-radio-button
            id="BRANCH"
            class="space--top-s"
            variant="help"
            value="BRANCH"
            name="addressStepRadioOption"
            info-message="${null===(d=this._addressStep)||void 0===d||null===(c=d.options)||void 0===c||null===(p=c.branch)||void 0===p?void 0:p.message}">
            <div class="radio-button--content-label">
              <span class="text--small-bold">${null===(h=this._addressStep)||void 0===h||null===(b=h.options)||void 0===b||null===(u=b.branch)||void 0===u?void 0:u.label}</span>
              <bbva-core-icon
                class="radio-button--icon-color"
                icon="${k()}"
                size="${null===(m=this._optionsStep)||void 0===m?void 0:m.icon}"
                data-custom-event="BRANCH"
                @click="${this._handlerShowTooltip}">
              </bbva-core-icon>
            </div>
          </bbva-form-radio-button>
        </bbva-form-radio-group>
      </div>
      ${"HOME"===this._selectedAddress?v`
          <div data-select="address-step-notification">
            <bbva-notification-message
              class="space--s"
              variant="default">
                ${this._getLocale("address-step-home-info-message")}
            </bbva-notification-message>
          </div>
      `:""}
    `}_handlerAddressStepOptionChange(t){const e=null==t?void 0:t.detail;this._optionAddress=null==e?void 0:e.selected,this._selectedAddress=null==e?void 0:e.value,ye(this,Ae.ACTIONS.CHANGE_ADDRESS_OPTION,e),this._handlerChangeCheckbox("address"),this._handlerTermsAndConditionsStepUncollapse(),null==t||t.preventDefault()}_handlerAddressStepMaskOptionChange(){ye(this,Ae.ACTIONS.CHANGE_ADDRESS_MASK_OPTION,!this.showAddress)}_buildAddressStepFilled(){return v`
      <div data-select="address-step-filled">
        <bbva-list-simple
          ambient="dark"
          label="${this._getLocale(this._addressCatalog[this._selectedAddress])}"
          description="${"HOME"===this._selectedAddress?this.addressMask:""}">
        </bbva-list-simple>
      </div>
    `}_buildAccountStep(){var t,e,i,a,o,r,n,l,s,d,c,p,h,b,u,m;return v`
      <div data-select="account-step-description">
        <bbva-text
          tag="span"
          text="${null===(t=this._accountStep)||void 0===t||null===(e=t.header)||void 0===e?void 0:e.description}"
          size="S">
        </bbva-text>
      </div>
      <div data-select="account-step-selected-account">
        <bbva-text
          tag="span"
          class="text--small-bold-gray space--top-sm space--bottom-s"
          text="${null===(i=this._accountStep)||void 0===i||null===(a=i.selectedAccount)||void 0===a?void 0:a.title}"
          size="S">
        </bbva-text>
        <bbva-list-card
          language="${null===(o=this._optionsSteps)||void 0===o||null===(r=o.amount)||void 0===r?void 0:r.language}"
          currency-code="${null===(n=this._optionsSteps)||void 0===n||null===(l=n.amount)||void 0===l?void 0:l.currency}"
          local-currency="${null===(s=this._optionsSteps)||void 0===s||null===(d=s.amount)||void 0===d?void 0:d.currency}"
          content-text="${this._getLocale("account-step-selected-account-description")}"
          card-title="${null===(c=this._accountStep)||void 0===c||null===(p=c.selectedAccount)||void 0===p?void 0:p.name}"
          amount="${null===(h=this._accountStep)||void 0===h||null===(b=h.selectedAccount)||void 0===b?void 0:b.amount}"
          num-product="${null===(u=this._accountStep)||void 0===u||null===(m=u.selectedAccount)||void 0===m?void 0:m.number}">
        </bbva-list-card>
      </div>
    `}_buildAccountStepFilled(){var t,e,i,a,o,r,n,l,s,d,c,p;return v`
      <div data-select="account-step-filled">
        <bbva-list-multistep-account
          secondary-language="${null===(t=this._optionsSteps)||void 0===t||null===(e=t.amount)||void 0===e?void 0:e.language}"
          currency-code="${null===(i=this._optionsSteps)||void 0===i||null===(a=i.amount)||void 0===a?void 0:a.currency}"
          local-currency="${null===(o=this._optionsSteps)||void 0===o||null===(r=o.amount)||void 0===r?void 0:r.currency}"
          description="${this._getLocale("account-step-selected-account-description")}"
          name="${null===(n=this._accountStep)||void 0===n||null===(l=n.selectedAccount)||void 0===l?void 0:l.name}"
          amount="${null===(s=this._accountStep)||void 0===s||null===(d=s.selectedAccount)||void 0===d?void 0:d.amount}"
          number="${null===(c=this._accountStep)||void 0===c||null===(p=c.selectedAccount)||void 0===p?void 0:p.number}">
        </bbva-list-multistep-account>
      </div>
    `}_buildTermsAndConditionsStep(){var t,e,i,a,o,r,n,l;return v`
      <div data-select="terms-and-conditions-step-description">
        <bbva-text
          tag="span"
          class="space--bottom-s"
          text="${null===(t=this._termsAndConditionsStep)||void 0===t||null===(e=t.header)||void 0===e?void 0:e.description}"
          size="S">
        </bbva-text>
      </div>
      <div data-select="terms-and-conditions-step-documents">
        ${null===(i=this._termsAndConditionsStep)||void 0===i||null===(a=i.documents)||void 0===a||null===(o=a.list)||void 0===o?void 0:o.map(((t,e)=>v`
          <bbva-list-file
            id="${t.id}"
            data-type="${t.type}"
            class="under-space--zero space--sm"
            icon="${fe(e)}"
            file-name="${t.name}"
            @list-file-link-click="${this._handlerTermsAndConditionsStepDocumentClick}">
          </bbva-list-file>
        `))}
      </div>
      <div data-select="terms-and-conditions-step-checkboxes">
        ${null===(r=this._termsAndConditionsStep)||void 0===r||null===(n=r.checkboxes)||void 0===n||null===(l=n.list)||void 0===l?void 0:l.map((t=>v`
          <bbva-form-checkbox
            id="${t.id}"
            label="${t.description}"
            optional-label=" "
            info-message="${t.message?t.message:""}"
            @change="${this._handlerTermsAndConditionsStepCheckboxClick}">
          </bbva-form-checkbox>
        `))}
      </div>
    `}_handlerTermsAndConditionsStepDocumentClick(t){var e,i,a;ye(this,Ae.ACTIONS.CLICK_DOCUMENT,{id:Se(null==t||null===(e=t.target)||void 0===e?void 0:e.id),type:null==t||null===(i=t.target)||void 0===i||null===(a=i.dataset)||void 0===a?void 0:a.type})}_handlerTermsAndConditionsStepCheckboxClick(t){var e,i,a;const o=null===(e=this._termsAndConditionsStep)||void 0===e||null===(i=e.checkboxes)||void 0===i||null===(a=i.list)||void 0===a?void 0:a.some((t=>{const e=this._findComponent(`#${null==t?void 0:t.id}`);return!e.checked&&!e.hidden}));this._findComponent("#termsAndConditionsStepCompleteButton").disabled=o,null==t||t.preventDefault()}_handlerHiddenCheckbox(){var t,e,i;const a=this._allCheckboxes,o=(null===(t=this._termsAndConditionsStep)||void 0===t||null===(e=t.checkboxes)||void 0===e||null===(i=e.list)||void 0===i?void 0:i.length)===Pe.TOTAL?Pe.POSITON.FOUR:Pe.POSITON.THREE;a.forEach(((t,e)=>{if(e===o){t.hidden=!this._togglePayment,this._getLastStepHeight()}}))}_handlerChangeCheckbox(t){var e,i,a;const o=this._allCheckboxes,r=(null===(e=this._termsAndConditionsStep)||void 0===e||null===(i=e.checkboxes)||void 0===i||null===(a=i.list)||void 0===a?void 0:a.length)===Pe.TOTAL,n=r?Pe.POSITON.FOUR:Pe.POSITON.THREE,l=r?Pe.POSITON.FIVE:Pe.POSITON.FOUR,s=this._getLocale(this._paymentCatalog[this._selectedPayment]).toLowerCase(),d=this._getLocale(this._addressCatalog[this._selectedAddress]).toLowerCase();o.forEach(((e,i)=>{const a="payment"===t?n:l,o="payment"===t?this._getLocale("terms-and-conditions-step-paymet-type-checkbox",{paymentType:s}):this._getLocale("terms-and-conditions-step-address-type-checkbox",{addressType:d});if(i===a){e.label=o}}))}_handlerChangeAdditionalProductCheckbox(){var t,e,i,a,o,r,n,l,s;const d=this._allCheckboxes,c=(null===(t=this._termsAndConditionsStep)||void 0===t||null===(e=t.checkboxes)||void 0===e||null===(i=e.list)||void 0===i?void 0:i.length)===Pe.TOTAL?2:-1,p=null===(a=this.loanStep)||void 0===a||null===(o=a.costs)||void 0===o||null===(r=o.additionalProduct)||void 0===r?void 0:r.eventName,h=null===(n=this.loanStep)||void 0===n||null===(l=n.costs)||void 0===l||null===(s=l.additionalProduct)||void 0===s?void 0:s.value;d.forEach(((t,e)=>{const i="INSURANCE"===p?this._getLocale("terms-and-conditions-step-insurance-checkbox",{amount:h}):this._getLocale("terms-and-conditions-step-commission-checkbox",{amount:h});if(e===c){t.label=i}}))}_handlerTermsAndConditionsStepUncollapse(){const t=this._lastStep,e=this._findComponent("#termsAndConditionsStepCompleteButton");this._isAllStepsComplete?(t.completed=!1,t.disabled=!0,e.disabled=!0):t.disabled&&(e.disabled=!0),this._handlerUncheckCheckboxes()}_handlerUncheckCheckboxes(){this._allCheckboxes.forEach((t=>{t.checked=!1}))}_buildTermsAndConditionsStepFilled(){return v`
      <div data-select="terms-and-conditions-step-filled">
        <bbva-list-multistep-check
          class="under-space--zero"
          ambient="dark"
          icon="coronita:correct">
          <span>${this._getLocale("terms-and-conditions-step-accepted")}</span>
        </bbva-list-multistep-check>
      </div>
    `}_handlerShowTooltip(t){var e,i;ye(this,Ae.ACTIONS.CLICK_TOOLTIP,null==t||null===(e=t.target)||void 0===e||null===(i=e.dataset)||void 0===i?void 0:i.customEvent)}_buildExpandableStep(t,e,i,a,o){return v`
      <bbva-expandable-step
        id="${t}"
        header="${i}"
        disabled-target=".action"
        edit-label="${t===Le.OFFER?this._getLocale("change-button-offer"):this._getLocale("change-button")}"
        step="${e}"
        total-steps="7"
        hide-padding-top
        hide-padding-bottom
        @expandable-step-edit-step="${this._handlerChangeStep}"
        @expandable-step-complete-change="${this._handlerCompleteStep}"
        @expandable-step-disable-change="${this._handlerDisableStep}">
        <div class="content">
          ${a}
          ${this._buildContinueButton(t)}
        </div>
        <div class="summary" slot="summary">
          ${o}
        </div>
      </bbva-expandable-step>
    `}_handlerChangeStep(t){const e=null==t?void 0:t.target,i=null==e?void 0:e.id;if(i===Le.OFFER){this._findComponent('[data-select="offer-step-description"]').hidden=!1,e.header="",this._changeStickyClass("normal","offer-step-complete-button")}if(i===Le.LOAN&&this._changeStickyClass("normal","loan-step-sticky"),i!==Le.LOAN&&this._disablePreviousStepEdit("#loanStep","#inputLoanAmount"),i!==Le.CARD&&this._disablePreviousStepEdit("#creditCardStep","#inputCreditCardAmount"),i!==Le.TERMS_AND_CONDITIONS){const t=this._lastStep,e=this._findComponent("#termsAndConditionsStepCompleteButton");null!=t&&t.completed||(this._lastStep.style.height=null!=e&&e.disabled?this._lastStepHeight:"",t.disableOnPreviousStepEdit=null==e?void 0:e.disabled)}}_disablePreviousStepEdit(t,e){const i=this._findComponent(t),a=this._findComponent(e);0===(null==a?void 0:a.amount)&&(i.disableOnPreviousStepEdit=!0)}_handlerCompleteStep(t){const e=null==t?void 0:t.detail,i=null==t?void 0:t.target,a=null==i?void 0:i.id;if(e&&a===Le.OFFER){this._findComponent('[data-select="offer-step-description"]').hidden=!0,i.header=this._offerStep.header.title,this._changeInputReadonly("inputLoanAmount",!1)}e&&a===Le.LOAN&&this._changeInputReadonly("inputCreditCardAmount",!1),e&&a===Le.TERMS&&(i.style.paddingBottom=this.linkButton?"20vh":"16vh"),e&&ye(this,Ae.STEPS.STEP_COMPLETE,a)}_handlerDisableStep(t){const e=null==t?void 0:t.detail,i=null==t?void 0:t.target,a=null==i?void 0:i.id;if(e||a!==Le.OFFER||(this.requestUpdate(),this._getLastStepHeight()),!e&&a===Le.LOAN){const t=this._findComponent("#inputLoanAmount"),e=this._findComponent("#termsSlider"),i=this._findComponent("#loanStepCompleteButton");0===(null==t?void 0:t.amount)&&(null!=e&&e.hidden||(e.disabled=!0),i.disabled=!0)}if(!e&&a===Le.CARD){const t=this._findComponent("#inputCreditCardAmount"),e=this._findComponent("#creditCardStepCompleteButton");0===(null==t?void 0:t.amount)&&(e.disabled=!0)}e||ye(this,Ae.STEPS.STEP_ENABLE,a)}_buildContinueButton(t){const e=t===Le.OFFER;return v`
      <div data-select="${_e(t)}-complete-button" class="complete-button">
        <bbva-button-default
          id="${`${t}CompleteButton`}"
          text="${e?this._getLocale("complete-button-offer"):this._getLocale("complete-button")}"
          ?disabled="${!e}"
          variant="default"
          @click="${this._handlerContinueButton}">
        </bbva-button-default>
        ${e&&this.linkButton?this._buildLinkButton():""}
      </div>
    `}_handlerContinueButton(t){const e=null==t?void 0:t.target,i=null==e?void 0:e.id,a=t=>this._findComponent(t);let o;"accountStepCompleteButton"!==i&&"termsAndConditionsStepCompleteButton"!==i&&{offerStepCompleteButton:()=>{o=a("#loanStepCompleteButton"),o.disabled=!1,ye(this,Ae.STEPS.FIRST_STEP_COMPLETE,!0)},loanStepCompleteButton:()=>{o=a("#creditCardStepCompleteButton"),o.disabled=!1},creditCardStepCompleteButton:()=>{o=a("#paymentStepCompleteButton"),o.disabled=!1},paymentStepCompleteButton:()=>{o=a("#addressStepCompleteButton"),o.disabled=!1},addressStepCompleteButton:()=>{o=a("#accountStepCompleteButton"),o.disabled=!1}}[i](),ye(e,Ae.STEPS.COMPLETE)}_buildLinkButton(){return v`
      <bbva-button-default
        id="offerStepLink"
        class="space--top-s"
        text="${this.linkButton}"
        variant="link"
        @click="${this._handlerLinkButton}">
      </bbva-button-default>
    `}_handlerLinkButton(){ye(this,Ae.ACTIONS.CLICK_LINK,!1)}_renderOfferStep(){const t=this._buildOfferStep(),e=this._buildOfferStepFilled();return this._buildExpandableStep(Le.OFFER,1,"",t,e)}_renderLoanStep(){var t;const e=this._buildLoanStep(),i=this._buildLoanStepFilled(),{title:a}=null===(t=this._loanStep)||void 0===t?void 0:t.header;return this._buildExpandableStep(Le.LOAN,2,a,e,i)}_renderCreditCardStep(){var t;const e=this._buildCreditCardStep(),i=this._buildCreditCardStepFilled(),{title:a}=null===(t=this._creditCardStep)||void 0===t?void 0:t.header;return this._buildExpandableStep(Le.CARD,3,a,e,i)}_renderPaymentStep(){var t;const e=this._buildPaymentStep(),i=this._buildPaymentStepFilled(),{title:a}=null===(t=this._paymentStep)||void 0===t?void 0:t.header;return this._buildExpandableStep(Le.PAYMENT,4,a,e,i)}_renderAddressStep(){var t;const e=this._buildAddressStep(),i=this._buildAddressStepFilled(),{title:a}=null===(t=this._addressStep)||void 0===t?void 0:t.header;return this._buildExpandableStep(Le.ADDRESS,5,a,e,i)}_renderAccountStep(){var t;const e=this._buildAccountStep(),i=this._buildAccountStepFilled(),{title:a}=null===(t=this._accountStep)||void 0===t?void 0:t.header;return this._buildExpandableStep(Le.ACCOUNT,6,a,e,i)}_renderTermsAndConditionsStep(){var t;const e=this._buildTermsAndConditionsStep(),i=this._buildTermsAndConditionsStepFilled(),{title:a}=null===(t=this._termsAndConditionsStep)||void 0===t?void 0:t.header;return this._buildExpandableStep(Le.TERMS,7,a,e,i)}_findComponent(t){var e;return null===(e=this.shadowRoot)||void 0===e?void 0:e.querySelector(t)}_getLocale(t,e={}){return this.t(`mix-credit-card-and-loan-${t}`,e)}get _allCheckboxes(){var t;return null===(t=this.shadowRoot)||void 0===t?void 0:t.querySelectorAll('#termsAndConditionsStep [data-tag-name="bbva-form-checkbox"]')}get _lastStep(){return this._findComponent("#termsAndConditionsStep")}get _multistep(){return this._findComponent("#mixLoanAndCrediCardMultistep")}resetMultistep(){const t=[...this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]')],e=[];t.length&&(t.forEach(((t,i)=>{const a=t.id,o=this._findComponent(`#${a}`),r=this._findComponent(`#${a}CompleteButton`);o.completed=!1,0===i?(this._findComponent('[data-select="offer-step-description"]').hidden=!1,o.header="",o.disabled=!1,o.active=!0,r.disabled=!1):(o.active=!1,o.disabled=!0,r.disabled=!0),e.push(i)})),this._multistep.stepsToReset=e,this._multistep._scrollToTop(.5,0,0),this._handlerUncheckCheckboxes(),this._resetProperties())}_resetProperties(){this._togglePayment=!0,this._optionPayment=0,this._selectedPayment="MINIMUM_AMOUNT_PAYMENT",this._optionAddress=0,this._selectedAddress="HOME",this.showAddress=!1,this.addressMask="",this.addressUnmask="",this._isAllStepsComplete=!1,this._lastStep.style.height=this._lastStepHeight}render(){return Object.keys(this._allSteps).length?v`
      <bbva-expandable-multistep
        id="mixLoanAndCrediCardMultistep"
        hide-step-numbers
        class="scrollable"
        step-selector="[data-tag-name='bbva-expandable-step']">
        ${this._renderOfferStep()}
        ${this._renderLoanStep()}
        ${this._renderCreditCardStep()}
        ${this._renderPaymentStep()}
        ${this._renderAddressStep()}
        ${this._renderAccountStep()}
        ${this._renderTermsAndConditionsStep()}
      </bbva-expandable-multistep>
    `:""}}customElements.define(Ee.is,Ee);class we extends ht{constructor(t=null){super(Object.assign({requiresTsec:!0},t||{})),this._setPath(`offers/v${this.version}/package-offers/{package-offer-id}`)}toString(){return super.toString("BGADPMxOffersPackageOffersPackageOfferGetV0")}}class Ie extends(it(c)){static get is(){return"bbva-dataprovider-offers"}static get properties(){return{host:{type:String},apiVersion:{type:String,attribute:"api-version"},requiredToken:{type:String,attribute:"required-token"},native:{type:Boolean,attribute:"native"},headers:{type:Object,attribute:"headers"},timeout:{type:Number,attribute:"timeout"}}}constructor(){super(),this.apiVersion="0",this.requiredToken="tsec",this.native=!1,this.headers={},this.timeout=120}getOffersPackageOffers(t){const e={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,params:{"package-offer-id":t}},i=Ie._serviceOffersPackageOffersPackageV0(e);this._generateGetService(i,{customEvent:"get-offers-package-offers-package-v0-success",errorFireEventHandler:"get-offers-package-offers-package-v0-error"})}static _serviceOffersPackageOffersPackageV0(t){return new we(t)}}customElements.define(Ie.is,Ie);
