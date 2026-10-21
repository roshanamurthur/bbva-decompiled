import{H as e,z as t,a8 as i,ac as a,ad as o,ar as n,aa as r,a9 as s,a as l,an as c,aJ as d,L as h,F as p,ag as b,ak as m,h as g,g as u,b0 as v,b1 as f,aM as y,b6 as S,aN as _,ah as x,i as C,aD as T,aO as I,o as $,f as k,ab as A,cR as E,bU as w,bF as M,cS as N,av as D,m as O,cG as L,aX as P,dA as R,dB as B,bG as V,cD as z,G as q}from"./952f98a9.js";import{aM as F,t as H,aN as G,a$ as U,bt as j,a7 as Y}from"./7f3d7ca9.js";import{B as W}from"./bee1f904.js";import{B as X}from"./055a082b.js";import"./70c7bb8e.js";import{C as K}from"./216055dc.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./c0a2f832.js";import"./cae0f1de.js";const J=e((e=>class extends e{static get properties(){return{host:{type:String,attribute:"host"},native:{type:Boolean},requiredToken:{type:String,attribute:"required-token"},language:{type:String},headers:{type:Object},ambient:{type:String,reflect:!0},locale:{type:String},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header"},publicSettingsHost:{type:String,attribute:"public-settings-host"},publicSettingsRequiredToken:{type:String,attribute:"public-settings-required-token"},history:{type:Object}}}constructor(){super(),this.native=!1,this.iOSFixedHeader=!1,this.publicSettingsRequiredToken="none"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.addEventListener("help-modal-open",this._handleModalState),this.addEventListener("help-modal-close",this._handleModalState),this.setAttribute("data-tag-name",this.constructor.is)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("help-modal-open",this._handleModalState),this.removeEventListener("help-modal-close",this._handleModalState)}static scopedElementsFromClasses(e){return e.reduce(((e,t)=>(e[t.is]=t,e)),{})}_handleModalState(e){var t;const i=null==e||null===(t=e.detail)||void 0===t?void 0:t.modal;this.dispatchEvent(new CustomEvent("modal-state-change",{bubbles:!0,composed:!0,detail:{visible:null==i?void 0:i.visible,modal:i}}))}})),Q=new n;var Z=t`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${i(s.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${i(s.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${i(s.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${i(s.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${i(s.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${i(s.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${i(s.secondary200)})));
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
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${i(a.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${i(o.type3XSmall)}));
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
${Q.mediaRules()}`;var ee=t`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new n).mediaRules()}`;const te=new n;const ie={dark:t`
    ${t`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${i(s.primaryCoreLight)});
}
${te.mediaRules()}`}
  `,light:t`
    ${ee}
  `};class ae extends(l(c(d(h)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":p,"bbva-text":b}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,Z,ie.dark,ie.light,m("bbva-notification-help-shared-styles")]}render(){return g`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}u("colors.primarySubduedLight"),u("colors.cool20"),u("colors.tertiaryType1Light"),u("colors.primaryCoreLightened"),u("colors.tertiaryType6Light"),u("colors.cool20"),u("colors.cool50");const oe=new n;var ne=t`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${i(s.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${i(s.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${i(s.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${i(a.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${oe.mediaRules()}`;const re=new n;var se=t`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${i(s.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${i(s.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${i(s.primaryMediumLight)});
}
${re.mediaRules()}`;var le=t`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new n).mediaRules()}`;const ce={dark:t`
    ${se}
    ${F.dark}
    ${v.dark}
    ${ie.dark}
    ${f.dark}
  `,light:t`
    ${le}
    ${F.light}
    ${v.light}
    ${ie.light}
    ${f.light}
  `};class de extends(l(c(y(h)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":H,"bbva-notification-help":ae,"bbva-text":b,"bbva-link":S}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=_(),this.errorIconSize=16,this.infoIcon=x(),this.infoIconSize=16,this.name=`form-radio-group-${((e=10)=>`${Math.random().toString(36).substr(2,e)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(e=>this._setRadioName(e)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(e){(((e||{}).detail||{}).contentSlots||[]).forEach((e=>{const t=(e||{}).assignedNodes;"bbva-form-radio-button"===(t.getAttribute("data-tag-name")||(t||{}).nodeName).toLowerCase()&&(t.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(e=>this._updateItems(e)))}updated(e){if(super.updated&&super.updated(e),e.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const e=this.radioItems.find((e=>e.checked));e&&(e.checked=!1)}e.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].disabled=this.disabled}))),e.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].invalid=this.invalid}))),e.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].readonly=this.readonly}))),e.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((e,t)=>{this.radioItems[t].required=!1})),this.radioItems[0].required=!0)}_updateItems(e){const t=this.radioItems.indexOf(e.target);this.selected=t,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:e.target.value,selected:t},bubbles:!0,composed:!0}))}_helpClicked(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?g`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${C(this.linkHref)}"
          icon="${T()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const e=this.t(this.labelOut);return g`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text="${this.required?e:`${e} ${this.t(this.optionalLabel)}`}"
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `}return""}static get styles(){return[ne,m("bbva-form-radio-group-shared-styles"),ce.dark,ce.light]}render(){return g`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((e=>g`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${e.value}"
              label="${e.label}"
              divider="${C(e.divider)}"
              ?disabled="${e.disabled}"
              ?checked="${e.checked}"
              ?required="${e.required}"
              ?label-medium="${e.labelMedium}"
              .errorIcon="${this.errorIcon}"
              .errorIconSize="${this.errorIconSize}"
              .errorMessage="${e.invalid?e.errorMessage:""}"
              .infoIcon="${this.infoIcon}"
              .infoIconSize="${this.infoIconSize}"
              .infoMessage="${e.infoMessage}"
              accessibility-icon-info-notification="${C(e.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${C(e.accessibilityIconAlert)}"
              variant="${C(e.variant)}"
            >
              ${e.text?I(e.text):e.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?g`
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
    `}}u("colors.primarySubdued"),u("colors.primaryMediumLight"),u("colors.primaryCoreLightened");const he=new n;var pe=t`:host {
  display: block;
  --_veil-bg-color: var(--bbva-help-modal-dark-mode-veil-bg-color, var(--colorsPrimaryCoreDarkened, ${i(s.primaryCoreDarkened)}));
  --bbva-help-modal-safe-area-inset-top: 0;
  --bbva-help-modal-safe-area-inset-bottom: 0;
  --_modal-padding: 0;
  --_help-modal-content-bg-color: var(--bbva-help-modal-dark-mode-content-bg-color, var(--bbva-help-modal-content-bg-color, var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)})));
  --_help-modal-title-icon-color: var(--bbva-help-modal-dark-mode-title-icon-color, var(--bbva-help-modal-title-icon-color, var(--colorsPrimaryCoreDark, ${i(s.primaryCoreDark)})));
  --_help-modal-title-icon-color-warning: var(--bbva-help-modal-dark-mode-title-icon-color-warning, var(--bbva-help-modal-title-icon-color-warning, var(--colorsTertiaryType1Dark, ${i(s.tertiaryType1Dark)})));
  --_help-modal-title-icon-color-info: var(--bbva-help-modal-dark-mode-title-icon-color-info, var(--bbva-help-modal-title-icon-color-info, var(--colorsTertiaryType3Dark, ${i(s.tertiaryType3Dark)})));
  --_help-modal-title-color: var(--bbva-help-modal-dark-mode-title-color, var(--bbva-help-modal-title-color, var(--colorsSecondary600, ${i(s.secondary600)})));
  --_help-modal-content-color: var(--bbva-help-modal-dark-mode-content-color, var(--bbva-help-modal-content-color, var(--colorsSecondary500, ${i(s.secondary500)})));
  --_help-modal-footer-bg-color: var(--bbva-help-modal-dark-mode-footer-bg-color, var(--bbva-help-modal-footer-bg-color, var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)})));
  --_help-modal-ios-header-bg-color: var(--bbva-help-modal-dark-mode-ios-header-bg-color, var(--bbva-help-modal-ios-header-bg-color, var(--colorsPrimaryCore, ${i(s.primaryCore)})));
  --_help-modal-transition-duration: var(--bbva-help-modal-transition-duration, 0.3s);
  --_help-modal-veil-transition-duration: var(--bbva-help-modal-veil-transition-duration, 0.25s);
  --_help-modal-transition-easing: var(--bbva-help-modal-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-veil-transition-easing: var(--bbva-help-modal-veil-transition-easing, cubic-bezier(0.2,0,0.1,1));
  --_help-modal-full-height-bg-color: var(--bbva-help-modal-dark-mode-full-height-bg-color, var(--bbva-help-modal-full-height-bg-color, var(--colorsPrimaryCoreLightened, ${i(s.primaryCoreLightened)})));
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
  padding-bottom: calc(calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) + var(--bbva-help-modal-safe-area-inset-bottom) / 2);
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
  padding: var(--bbva-help-modal-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) 0);
  align-items: center;
  outline: 0;
}

.modal-title {
  align-items: center;
  display: flex;
  flex-direction: column;
  font-size: var(--bbva-help-modal-title-font-size, var(--typographyTypeMedium, ${i(a.typeMedium)}));
  font-weight: var(--bbva-help-modal-title-font-weight, var(--fontFacePrimaryMediumFontWeight, ${i(A.medium.fontWeight)}));
  line-height: var(--bbva-help-modal-title-line-height, var(--lineHeightTypeMedium, ${i(o.typeMedium)}));
  position: relative;
  outline: 0;
}
.modal-title .title-icon {
  fill: var(--_help-modal-title-icon-color);
  margin-bottom: var(--bbva-help-modal-title-icon-margin-bottom, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
}
.modal-title [data-tag-name=bbva-text] {
  width: 100%;
  color: var(--_help-modal-title-color);
}

.slot-footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: var(--bbva-help-modal-footer-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em) 0 0);
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
  font-size: var(--bbva-help-modal-content-font-size, var(--typographyTypeSmall, ${i(a.typeSmall)}));
  line-height: var(--bbva-help-modal-content-line-height, var(--lineHeightTypeSmall, ${i(o.typeSmall)}));
  text-align: center;
  margin: 0 auto;
}
:host(:not([hide-content-padding-top])) .modal-content-wrapper {
  padding-top: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em);
}

.footer-button:last-child {
  margin-top: var(--bbva-help-modal-footer-last-button-margin-top, calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1rem));
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
  padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em);
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
    padding-bottom: calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${i(r.spacer)}))) / 16) * 1em);
  }

  .modal-title [data-tag-name=bbva-text] {
    width: 40rem;
  }
}
${he.mediaRules()}`;class be extends(l(c(E))){static get is(){return"bbva-help-modal"}static get scopedElements(){return{"bbva-button-default":w,"bbva-icon":p,"bbva-text":b,"bbva-header-main":U,"bbva-link":S}}static get properties(){return{accessibilityTextIconLeftPrimary:{type:String,attribute:"accessibility-text-icon-left-primary"},accessibilityTextIconLeftSecondary:{type:String,attribute:"accessibility-text-icon-left-secondary"},accessibilityTextIconRightPrimary:{type:String,attribute:"accessibility-text-icon-right-primary"},accessibilityTextIconRightSecondary:{type:String,attribute:"accessibility-text-icon-right-secondary"},closeModalElements:{type:Array,attribute:"close-modal-elements"},iconLeftPrimary:{type:String,attribute:"icon-left-primary"},iconLeftSecondary:{type:String,attribute:"icon-left-secondary"},iconRightPrimary:{type:String,attribute:"icon-right-primary"},iconRightSecondary:{type:String,attribute:"icon-right-secondary"},headerText:{type:String,attribute:"header-text"},headerType:{type:String,attribute:"header-type"},titleIcon:{type:String,attribute:"title-icon"},titleText:{type:String,attribute:"title-text"},descriptionText:{type:String,attribute:"description-text"},bodyText:{type:String,attribute:"body-text"},buttonText:{type:String,attribute:"button-text"},linkText:{type:String,attribute:"link-text"},fixedFooter:{type:Boolean,attribute:"fixed-footer",reflect:!0},stickyFooter:{type:Boolean,attribute:"sticky-footer",reflect:!0},iOSFixedHeader:{type:Boolean,attribute:"i-o-s-fixed-header",reflect:!0},iOSDevices:{type:Array,attribute:"i-o-s-devices"},userAgentRegex:{type:String,attribute:"user-agent-regex"},hideContentPaddingTop:{type:Boolean,attribute:"hide-content-padding-top",reflect:!0},modalType:{type:String,reflect:!0,attribute:"modal-type"},idModal:{type:String,reflect:!0,attribute:"id-modal"},fullHeight:{type:Boolean,attribute:"full-height",reflect:!0},disabledButton:{type:Boolean,attribute:"disabled-button"},titleLines:{type:Number,attribute:"title-lines"},showTextIcon:{type:Boolean,attribute:"show-text-icon"}}}constructor(){super(),this.iconLeftPrimary="",this.iconLeftSecondary="",this.iconRightPrimary=M(),this.iconRightSecondary="",this.accessibilityTextIconLeftPrimary="",this.accessibilityTextIconLeftSecondary="",this.accessibilityTextIconRightPrimary="",this.accessibilityTextIconRightSecondary="",this.closeModalElements=["footer-button","footer-link","header-right-primary"],this.headerText="",this.headerType="modal-three-level",this.titleIcon="",this.titleText="",this.descriptionText="",this.bodyText="",this.buttonText="",this.linkText="",this.iOSFixedHeader=!1,this.iOSDevices=["iOS","iPhone"],this.userAgentRegex=/\(([^)]+)\)/,this.hideContentPaddingTop=!1,this.modalType="",this.resetScroll=!0,this.fullHeight=!1,this.disabledButton=!1,this.showTextIcon=!1}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._modal=this.shadowRoot.querySelector(".help-modal"),this._header=this.shadowRoot.querySelector(".modal-header"),this._content=this.shadowRoot.querySelector(".modal-content-wrapper"),this._footer=this.shadowRoot.querySelector(".modal-footer"),this._container=this.shadowRoot.querySelector(".modal-container"),this.removeAttribute("aria-modal"),this._checkHeight()}updated(e){if(super.updated&&super.updated(e),this.fullHeight||this.setAttribute("hide-content-padding-top",!0),e.has("visible")){let e="close";this.visible&&(e="open"),this.dispatchEvent(new CustomEvent(`help-modal-${e}`,{detail:{status:e,modal:this},bubbles:!0,composed:!0}))}this._updateAccessibility()}static get styles(){return[super.styles,pe,m("bbva-help-modal-shared-styles"),N.light,v.light]}get _fixedIOSHeader(){return g`
      <div ?hidden="${!this._shouldDisplayFixedHeader()}" class="iOS-fixed-header"></div>
    `}get helpModalHeader(){return this.headerText?g`
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
        `:""}get helpModalContent(){return g`
      <div id="helpModalContent" class="modal-content">
        <span class="slot-content-header"><slot name="slot-content-header"></slot></span>
        <div class="slot-content">
          ${this.descriptionText?g`<bbva-text
                id="description-text"
                .text=${this.descriptionText}
                ?hidden="${!this.descriptionText}"
                alignment="center"
                size="S"
                ellipsis
                lines="3"
                unset
              >
              </bbva-text>`:g`<slot name="slot-content"><div>${this.bodyText}</div></slot>`}
        </div>
      </div>
    `}get _veilTpl(){return this.fullHeight?"":g`
        <div class="veil" @keyup="${this._keyupEvent}" @click="${this._onVeilClick}"></div>
      `}get helpModalFooter(){return g`
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
            ${this.linkText?g`<bbva-link
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
    `}get helpModalTitle(){return g`
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
          ${this.titleText?g` <bbva-text
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
    `}_updateAccessibility(){!this.getAttribute("aria-label")&&this.titleText&&this.setAttribute("aria-label",this.titleText)}_checkHeight(){this._container.offsetHeight>=this._content.offsetHeight?this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_runScrollReset(){const e=this._getFirstScrollableParent(this._container);requestAnimationFrame((()=>{requestAnimationFrame((()=>{null==e||e.scrollTo(0,0)}))}))}_setFooterShadow(e){e.currentTarget.scrollTop>=this._header.offsetHeight+this._content.offsetHeight+this._footer.offsetHeight-this._modal.offsetHeight?(this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","none"),this.dispatchEvent(new CustomEvent("help-modal-content-scroll-bottom-reach",{detail:!0,bubbles:!0,composed:!0}))):this.style.setProperty("--bbva-help-modal-footer-fixed-shadow","0 0 4px 0 rgba(18, 18, 18, .3)")}_handleClick(e){this.dispatchEvent(new CustomEvent(`help-modal-${e}-click`,{detail:!0,bubbles:!0,composed:!0})),this.closeModalElements.includes(e)&&this.close()}_onVeilClick(){super._onVeilClick&&super._onVeilClick(),this._handleClick("veil")}_shouldDisplayFixedHeader(){const e=window.navigator.userAgent.match(this.userAgentRegex)[1].split(";");return this.iOSFixedHeader&&this.iOSDevices.includes(e[0])}get _modalContent(){return g`
      ${this._fixedIOSHeader}
      <section
        class="transition-container ${D({"half-height":!this.fullHeight})}"
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
    `}}u("colors.cool100"),u("colors.cool60"),u("colors.primarySubduedLight"),u("colors.tertiaryType1Light"),u("colors.tertiaryType3Light"),u("colors.primaryCoreLightened"),u("colors.cool20"),u("colors.cool60"),u("colors.cool60"),u("colors.cool100");var me=t`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-expandable-step][prefilled] {
  padding: 0.5rem 0.5rem 0rem 0.5rem;
  --gridSpacer: 5;
}

[data-tag-name=bbva-list-simple] {
  --_list-simple-label-color: var(--bbva-white, #fff);
  --_list-simple-description-color: var(--bbva-white, #fff);
}

[data-tag-name=bbva-list-bullet] {
  margin-block-start: 0;
}

[data-tag-name=bbva-link] {
  color: var(--bbva-white, #fff);
  --_link-with-icon-icon-color: var(--bbva-white, #fff);
}

[data-tag-name=bbva-badge-check] {
  color: var(--bbva-white, #fff);
  margin-left: 1rem;
  --_badge-check-color: var(--bbva-white, #fff);
  --_badge-check-success-icon-color: var(--bbva-white, #fff);
}

.action {
  margin-top: 1rem;
}

.padding {
  padding: 0 1rem;
}

.padding-message {
  padding: 0.5rem;
}

.buttons-form-container {
  margin-top: 1rem;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}
.buttons-form-container [data-tag-name=bbva-button-default] {
  margin-top: 1rem;
}

.message-content {
  margin-top: 2rem;
}

.content-list ul {
  padding: 0;
}

.lines {
  display: block;
  text-overflow: ellipsis;
  white-space: nowrap;
  overflow: hidden;
  white-space: normal;
}

.message-content-bottom {
  margin: 0rem 1rem 10rem;
}

.fixed-height {
  padding-bottom: 5vh;
  height: auto !important;
}
`;class ge extends(P(Y(J(c(h))))){static get is(){return"cancel-insurance-modal"}static get scopedElements(){const e=[b,be,w,...ge.configurationScopedElements()];return ge.scopedElementsFromClasses(e)}static get properties(){return{visible:{type:Boolean},configModal:{type:Object}}}constructor(){super(),this.configModal={},this.visible=!1}updated(e){e.has("visible")&&e.get("visible")&&!e.get("visible")&&(this.visible=!0)}static get styles(){return[me,m("bbva-multistep-cancelation-insurance-request-shared-styles")]}render(){return g`
        <bbva-help-modal
            full-height
            fixed-footer
            id="cancel-insurance-modal" 
            header-type="modal"
            ?visible="${this.visible}"
            header-text="${this.t(this.configModal.headerText)}"
            body-text="${this.t(this.configModal.bodyText)}" 
            button-text="${this.t(this.configModal.buttonText)}" 
            link-text="${this.t(this.configModal.linkText)}"
            @help-modal-footer-button-click=${this._closeModalExit}
            @help-modal-header-right-primary-click=${this._closeModalExit}
          >
          <div class="custom-header" slot="slot-title">
            <img alt="img-modal" src="${this.configModal.imgSrc}" width="100" height="100">
            <p>${this.t(this.configModal.titleText)}</p>
          </div>
        </bbva-help-modal>
    `}_closeModalExit(e){e.stopPropagation(),this.visible=!1,this._dispatchCustomEvent("bbva-multistep-keep-modal-exit")}}customElements.define(ge.is,ge);class ue extends(P(Y(J(c(h))))){static get is(){return"bbva-multistep-cancel-insurance-request"}static get scopedElements(){const e=[W,w,R,B,H,de,be,X,S,V,z,b,q,ge,...ue.configurationScopedElements()];return ue.scopedElementsFromClasses(e)}static get styles(){return[me,m("bbva-multistep-cancelation-insurance-request-shared-styles")]}static get properties(){return{_privateMethod:{type:Object},_considerBulletSelected:{type:Array},_openModal:{type:Boolean},configmodal:{type:Object},configSteps:{type:Object},imgToModal:{type:String,attribute:"img-to-modal"},showInfoMessage:{type:Boolean}}}constructor(){super(),this.configmodal={},this.showInfoMessage=!1}connectedCallback(){super.connectedCallback(),this._privateMethod=ue,this._considerBulletSelected=this._privateMethod._getDefaultStepSelected(),this.configSteps=this._privateMethod._getDefaultConfigSteps(),this._openModal=!1}render(){return g`
      <slot></slot>
      <bbva-expandable-multistep
        @expandable-multistep-all-complete="${e=>this._validateAllComplete(e)}"
        step-selector='[data-tag-name="bbva-expandable-step"]' 
        class="scrollable space-header-top fixed-height">
        ${this._renderStepHeader()}
        ${this._renderStepOne()}
        ${this._renderStepTwo()}
        ${this._renderStepThree()}
      </bbva-expandable-multistep>
      ${this._renderLastNotificationMessage()}
      <cancel-insurance-modal 
        ?visible=${this._openModal}
        .configModal=${this.configmodal}
        @bbva-multistep-keep-modal-exit=${()=>this.closeModal()}>
      </cancel-insurance-modal>
    `}_validateAllComplete(e){this.showInfoMessage=!e.detail}_renderStepHeader(){const e=this.configSteps.stepCollapsedData,t=!this._privateMethod._validProperty(e.listValues[0],"value"),i=this._privateMethod._exists(e.configMessageInfo.show,g`
      <div class="content-option padding-message">
        <bbva-link icon="${e.configMessageInfo.icon}"><span>${this.t(e.configMessageInfo.text)}</span></bbva-link>
      </div>`),a=g`
      ${e.listValues.map((e=>g`
        <bbva-list-simple ambient="dark" label="${this.t(e.key)}" description="${this.t(e.value)}" .loading="${t}"></bbva-list-simple>
      `))}
      ${i}
    `;return g`
      ${this._privateMethod._renderExpandibleStep("",this.t("bbva-cancel-insurance-header-prefilled-step"),"","","",a,!0,!0)}
    `}_renderRadioButtons(e){const t=this._privateMethod._getDefaultStepSelected(),i=this.configSteps.stepOne.reasonsCancelation,a=this._renderListBullets(t.configStepTwo.bullets,e),o=g`
    <div class="content-option">
      ${i.map((e=>g`<bbva-form-radio-button @click="${this.clickaction}" id="${e.id}" name="choice">${this.t(e.text)}</bbva-form-radio-button>`))}
    </div> `;return e?a:o}_renderStepOne(){const e=this.configSteps.stepOne,t=0===this.configSteps.stepOne.reasonsCancelation.length,i=this._privateMethod._validProperty(this._considerBulletSelected,"text"),a=this._renderNotificationMessage(e.configNotificationInfo),o=g`
    <bbva-text class="description" size="S" tag="span" text="${this.t(e.description)}" .loading="${t}"></bbva-text>
      ${this._renderRadioButtons(t)}
      <div class="buttons-form-container">
        ${a}
        <bbva-button-default class="action" hidden></bbva-button-default>
        <bbva-button-default id="firstStepButton" class="action" data-step="1" text="${this.t("bbva-cancel-insurance-continue-button")}" ?disabled="${!i}" @click="${this._firstStepContinueButton}"></bbva-button-default>
        <bbva-button-default id="openModal" variant="link" @click="${this.openCancelInsuranceModal}">${this.t("bbva-cancel-insurance-keep-insurance-link")}</bbva-button-default>
      </div>`,n=g`
      ${this._privateMethod._exists(this._considerBulletSelected,g`<span>${this.t(this._considerBulletSelected.text)}</span>`)}
    `;return g`
        ${this._privateMethod._renderExpandibleStep(1,this.t("bbva-cancel-insurance-reason-cancel-step"),this.t("bbva-expandable-step-headings"),this.t("bbva-cancel-insurance-change-button"),o,n)}
    `}_firstStepContinueButton(){this.shadowRoot.querySelector("#step-1").completed=!0}_renderStepTwo(){const e=!this._privateMethod._validProperty(this._considerBulletSelected,"text");let t=this.configSteps.stepTwo;t=e?t:this._considerBulletSelected.configStepTwo;const i=this._renderNotificationMessage(t.configNotificationInfo),a=g`
        <bbva-text class="description padding" size="S" tag="span" .loading="${e}" text="${this.t(t.description)}"></bbva-text>
        ${this._renderListBullets(this._considerBulletSelected.configStepTwo.bullets,e)}
        <div class="buttons-form-container padding">
          ${i}
            <bbva-button-default class="action button-one" data-step="2" text="${this.t("bbva-cancel-insurance-continue-button")}"></bbva-button-default>
            <bbva-button-default variant="link" @click="${this.openCancelInsuranceModal}">${this.t("bbva-cancel-insurance-keep-insurance-link")}</bbva-button-default>
        </div>
    `,o=g`<bbva-badge-check description="${this.t("bbva-cancel-insurance-summary")}"></bbva-badge-check>`;return g`
        ${this._privateMethod._renderExpandibleStep(2,this.t("bbva-cancel-insurance-keep-in-mind-step"),this.t("bbva-expandable-step-headings"),this.t("bbva-cancel-insurance-consult-button"),a,o,!1,!0)}
    `}_renderStepThree(){const e=!this._privateMethod._validProperty(this._considerBulletSelected,"text");let t=this.configSteps.stepThree;t=e?t:this._considerBulletSelected.configStepThree;const i=this._renderNotificationMessage(t.configNotificationInfo),a=g`
      <bbva-text class="description padding lines" size="S" tag="span" .loading="${e}" text="${this.t(t.description)}"></bbva-text>
      ${this._renderListBullets(this._considerBulletSelected.configStepThree.bullets,e)}
      <div class="buttons-form-container padding">
        ${i}
        <bbva-button-default class="action button-one" data-step="3" text="${this.t("bbva-cancel-insurance-continue-button")}"></bbva-button-default>
        <bbva-button-default variant="link" @click="${this.openCancelInsuranceModal}">${this.t("bbva-cancel-insurance-keep-insurance-link")}</bbva-button-default>
      </div>
    `,o=g`<bbva-badge-check description="${this.t("bbva-cancel-insurance-summary")}"></bbva-badge-check>`;return g`
      ${this._privateMethod._renderExpandibleStep(3,this.t("bbva-cancel-insurance-detail-cancel-step"),this.t("bbva-expandable-step-headings"),this.t("bbva-cancel-insurance-consult-button"),a,o,!1,!0)}
    `}_renderLastNotificationMessage(){const e="info",t="Al continuar aceptas que se cancelará este seguro.";return g`
        <bbva-notification-message
          class="message-content-bottom"
          ?hidden="${this.showInfoMessage}"
          variant="${e}">
          ${this.t(t)}
        </bbva-notification-message>
    `}_renderNotificationMessage(e){const t=`<span class='highlight'>${this.t(e.title)}</span><p>${e.description}</p>`,i=""!==e.title?t:"";return this._privateMethod._exists(e.show,g`
      <bbva-notification-message 
        variant="${e.type}"
        message-title="${i}"
        link-title="${e.linkText}"
        data-event-link-name="${e.linkEventName}"
        @notification-message-link-click="${this._onBtnPhonePressed}">
        ${this.t(e.message)}
      </bbva-notification-message>`)}static _renderExpandibleStep(e="",t,i,a,o,n,r=!1,s=!1,l=!1){return g` 
      <bbva-expandable-step 
        id="step-${e}"
        header="${t}"
        edit-label="${a}" 
        disabled-target=".action"
        step="${e}" 
        total-steps="3"
        view-label=""
        .prefilled="${r}"
        ?hide-step-number="${l}"
        ?hide-padding-left="${s}"
        ?hide-padding-right="${s}">
       <div class="content">
         ${o}
       </div>
       <div class="summary" slot="summary">
         ${n}
       </div>
     </bbva-expandable-step>`}_renderListBullets(e,t){return g`
      <div class="content-list">
        ${e.map((e=>g`<bbva-list-bullet .loading="${t}">${this.t(e)}</bbva-list-bullet>`))}
      </div>`}_stepCompleteHeadler(){const e=[...this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]').querySelectorAll('[data-tag-name="bbva-expandable-step"]')],t=function(){this.dispatchEvent(new CustomEvent("complete",{bubbles:!0}))};e.forEach((e=>{const i=e.querySelector(".action");i&&i.addEventListener("click",t)}))}resetSteps(){[...this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]').querySelectorAll('[data-tag-name="bbva-expandable-step"]')].forEach((e=>(e.querySelectorAll('[data-tag-name="bbva-form-radio-button"]').forEach((e=>{e.checked=!1})),0===e.step||e.prefilled||(e.disabled=!0),e.prefilled||(e.completed=!1),e))),this.configSteps=this._privateMethod._getDefaultConfigSteps(),this._considerBulletSelected=this._privateMethod._getDefaultStepSelected(),this._openModal=!1,this.showInfoMessage=!1,this._dispatchCustomEvent("reset-steps")}firstUpdated(){this._stepCompleteHeadler()}static _validProperty(e,t){return Object.prototype.hasOwnProperty.call(e,t)}static _exists(e,t){return g`${e?t:""}`}_onBtnPhonePressed(e){const t=e.target.dataset.eventLinkName||"btn-phone-pressed";this._dispatchCustomEvent(t)}clickaction(e){const t=e.target?e.target.id:1,i=this.configSteps.stepOne.reasonsCancelation;this._considerBulletSelected=i.find((e=>e.id===t)),this._dispatchCustomEvent("reason-cancelation-selected",this._considerBulletSelected)}static _getDefaultConfigSteps(){return{stepCollapsedData:{text:"bbva-header-step",configMessageInfo:{show:!1,icon:"bbva:info",text:"bbva-cancel-insurance-suspend-automatic"},listValues:[{key:"bbva-cancel-type-insurance"},{key:"bbva-cancel-insurance-policy-number"},{key:"bbva-cancel-insurance-end-validity"}]},stepOne:{description:"bbva-cancel-insurance-reason-cancel-description",reasonsCancelation:[],configNotificationInfo:{show:!1}},stepTwo:{description:"bbva-cancel-insurance-keep-in-mind-step-description",bullets:[],configNotificationInfo:{show:!1}},stepThree:{description:"bbva-cancel-insurance-keep-in-mind-step-description",bullets:[],configNotificationInfo:{show:!1}}}}static _getDefaultStepSelected(){const e=["personal-economy-consider-step-list-bullet-one","personal-economy-badsales-anotherinsurer-consider-step-list-bullet-two","personal-economy-consider-step-list-bullet-three"];return{configStepTwo:{bullets:e},configStepThree:{bullets:e}}}openCancelInsuranceModal(e={}){this._dispatchCustomEvent("open-modal-cancel-insurance");const t=this._privateMethod._validProperty(e||{},"titleText")?e:{headerText:"bbva-cancel-insurance-consult-header-modal",titleText:"bbva-cancel-insurance-consult-title-modal",bodyText:"bbva-cancel-insurance-consult-body-modal",buttonText:"bbva-cancel-insurance-consult-button-modal",linkText:"",imgSrc:this.imgToModal};this.configmodal=t,this._openModal=!0}closeModal(){this._openModal=!1,this._dispatchCustomEvent("close-modal-kepp-cancel-insurance")}}customElements.define(ue.is,ue);const ve={CLOSE:"bbva-manager-ic-close-veil",OPEN:"bbva-manager-ic-open-veil"},fe={GET_CANCELATION_REASONS:"bbva-manager-ic-get-cancelation-reasons",GET_CUSTOMER_DETAIL:"bbva-manager-ic-get-customer-detail",GET_FINANCIAL_OVERVIEW:"bbva-manager-ic-get-financial-overview",GET_INSURANCE_PRODUCT_SETTINGS:"bbva-manager-ic-get-insurance-product-settings",GET_CLIENT_ID:"bbva-manager-ic-get-client-id",SET_CUSTOMER_ID:"bbva-manager-ic-set-customer-id",SET_HEADERS:"bbva-manager-ic-set-headers",POST_CANCEL_INSURANCE:"bbva-manager-ic-post-cancel-insurance",GET_DOCUMENT:"bbva-manager-ic-get-document"},ye={ACTIVE_BTN_SUMMARY:"bbva-manager-ic-active-btn-summary",ACTIVE_MESSAGE:"bbva-manager-ic-active-message",APP_INIT_ANALYTICS:"bbva-manager-ic-init-analytics",APP_OTP_ANALYTICS:"bbva-manager-ic-otp-analytics",APP_RESET_DATA_ANALYTICS:"bbva-manager-ic-reset-analytics",APP_SEND_DATA_ANALYTICS:"bbva-manager-ic-send-data-analytics",APP_STARTED_ANALYTICS:"bbva-manager-ic-started-analytics",APP_STEP_ERROR_ANALYTICS:"bbva-manager-ic-error-analytics",APP_STEP_SUCCESS_ANALYTICS:"bbva-manager-ic-success-analytics",APP_VISIT_ANALYTICS:"bbva-manager-ic-visit-analytics",NAVIGATE_BACK_MAIN_PAGE:"bbva-manager-ic-navigate-to-main-page",NAVIGATE_BACK_PAGE:"bbva-manager-ic-navigate-to-back-page",NAVIGATE_RESET_PAGE:"bbva-manager-ic-reset-process",NAVIGATE_SUCCESS_PAGE:"bbva-manager-ic-navigate-to-success-page",OPEN_MODAL_CALL_BBVA:"bbva-manager-ic-call-phone",OPEN_MODAL_ERROR:"bbva-manager-ic-retry-error",SEND_CONFIG_MODAL:"bbva-manager-ic-send-analytics",SEND_IMG_SRC_MODAL:"bbva-manager-ic-send-img-src-modal-data",SEND_INSURANCE_DETAIL_REASONS:"bbva-manager-ic-send-insurance-detail-reasons",SEND_INSURANCE_DETAIL:"bbva-manager-ic-send-insurance-detail-header",SEND_LOADER_STICKY:"set-loader-sticky",SEND_OPEN_CONFIG_MODAL:"bbva-manager-ic-open-config-modal",SEND_SUCCESS_DATA:"bbva-manager-ic-send-success-data",SEND_SUMMARY_PATCH_QUOTATION:"bbva-manager-ic-send-summary-patch-quotation"},Se="bbva-manager-ic-on-click-start",_e="bbva-manager-ic-on-visit",xe="bbva-manager-ic-on-step-started",Ce="bbva-manager-ic-on-step-two",Te="bbva-manager-ic-on-step-three",Ie="bbva-manager-ic-on-step-four",$e="bbva-manager-ic-on-step-five",ke="bbva-manager-ic-on-step-complete",Ae="bbva-manager-ic-on-step-error",Ee=(e,t,i)=>{e.dispatchEvent(new CustomEvent(t,{detail:i,bubbles:!0,composed:!0}))},we=(e,t,i)=>e&&t?(t=Array.isArray(t)?t:t.split(".")).reduce(((e,a,o)=>{const n=e[a],r=o+1===t.length;return n===Object(n)||r?n||0===n||!1===n?n:void 0!==i?i:n:i||{}}),e):i;class Me extends(K(h)){static get is(){return"bbva-manager-cancel-insurance-request"}static get properties(){return{financialOverviewResponseData:{type:Object},receivedInsuranceData:{type:Object},reasonSelected:{type:Object},dataInsuranceToCancel:{type:Object},configSteps:{type:Object},formatDate:{type:String},globalCacheStorage:{type:Object},customerId:{type:String},clienteId:{type:String},emailInfo:{type:String},imgModalSrc:{type:String},configModalData:{type:Object},successData:{type:Object},imgErrorModal:{type:String},imgLifeInsurance:{type:String},imgTravelInsurance:{type:String},imgDeviceInsurance:{type:String}}}constructor(){super(),this.formatDate="DD MMM YYYY",this.imgModalSrc="",this.emailInfo="",this.imgErrorModal="images/Error.svg",this.imgLifeInsurance="images/cancelInsurance/life-insurance.svg",this.imgTravelInsurance="images/travelInsurance/travel-insurance.svg",this.imgDeviceInsurance="images/deviceInsurance/device-insurance.svg"}initProcess(e){this.receivedInsuranceData=e,this._requestClientId(),this._showActiveMessage(),Ee(this,ve.OPEN),we(this.financialOverviewResponseData,"data.contracts")?this.setFinancialOverview(this.financialOverviewResponseData):this.getFinancialOverview()}_requestClientId(){Ee(this,fe.GET_CLIENT_ID,{key:"loginData",secure:!0})}setClientId(e){this.clienteId=we(e,"grantingTicketUserId","")}sendCacelationRequest(){Ee(this,ve.OPEN);const e=this._getCustomerId();this._getCustomerEmailData(e);const t={params:{"insurance-contract-id":this.dataInsuranceToCancel.id},body:{reason:{id:"003",detail:{id:we(this.reasonSelected,"reasonid")},category:{id:we(this.reasonSelected,"categoryId")},comments:we(this.reasonSelected,"text").toUpperCase()},cancellationType:"COMPLETE",requestDate:moment(new Date).format("YYYY-MM-DD")}};Ee(this,ye.APP_OTP_ANALYTICS,t),Ee(this,fe.POST_CANCEL_INSURANCE,t)}setFinancialOverview(e){this.financialOverviewResponseData=e;const{contracts:t}=e.data,i=t.find((e=>e.id===we(this.receivedInsuranceData,"product.id")));if(i){this.dataInsuranceToCancel=i;const e=we(this.dataInsuranceToCancel,"detail.commertialProductId");this.stepCollapsedData=this._getStepCollapsedConfig(i,e);const t=this._getConfigByInsurance(e);this._setImageToModal(t),this.configSteps={...t,stepCollapsedData:this.stepCollapsedData};const a=we(this.dataInsuranceToCancel,"detail");Ee(this,ye.APP_INIT_ANALYTICS,a),this.getCancelationReasons()}else this.sendCancelInsuranceModal("cancel-insurance-error")}setCancelationReasons(e){const t=e[0].categories.map(((e,t)=>({id:e.id,order:t+1,categoryId:we(e,"details.0.id"),reasonid:e.id,reasonName:e.name,text:Me._toCapitalize(we(e,"details.0.name"),!0),configStepTwo:this._mapConfigByStep(e,"stepTwo"),configStepThree:this._mapConfigByStep(e,"stepThree")})));this.configSteps.stepOne.reasonsCancelation=t,Ee(this,ye.SEND_INSURANCE_DETAIL_REASONS,this.configSteps),Ee(this,ve.CLOSE),Ee(this,ye.APP_VISIT_ANALYTICS)}validIsFinalStep(e){let t=!1;if(e){const e={buttons:{primary:{text:"bbva-cancel-insurance-continue-button",action:"insurance-cancel-request-accept"},secondary:{text:"bbva-cancel-insurance-keep-insurance-link",class:"link",action:"keep-insurance"}}};Ee(this,ye.ACTIVE_BTN_SUMMARY,e)}else Ee(this,ye.ACTIVE_BTN_SUMMARY,{}),t=!0;this._showActiveMessage(t),Ee(this,ye.APP_SEND_DATA_ANALYTICS,e)}_showActiveMessage(e=!0){Ee(this,ye.ACTIVE_MESSAGE,e)}setReasonCancelationSelected(e){e&&(this.reasonSelected=e),Ee(this,ye.APP_STARTED_ANALYTICS,this.reasonSelected)}setCancelationRequestSuccess(e){Ee(this,ve.CLOSE);const t=this._sendSuccessData(e.operationTracking||"");Ee(this,ye.APP_STEP_SUCCESS_ANALYTICS,e.operationTracking||""),Ee(this,ye.NAVIGATE_SUCCESS_PAGE,t)}errorCancelationRequest(e){const t=((e.messages||"")[0]||"").code||"",i=Array.isArray(t.match("notCancelable"));Ee(this,ye.APP_STEP_ERROR_ANALYTICS,i),Ee(this,ve.CLOSE),this.sendCancelInsuranceModal(i?"existing-error":"cancel-insurance-error")}openCallBbva(){Ee(this,ve.CLOSE),Ee(this,ye.OPEN_MODAL_CALL_BBVA,{phoneNumber:"5511020000",showConfirmation:!0})}sendCancelInsuranceModal(e){let t={};t="cancel-insurance-error"===e?{_code:e,_titleDescription:"bbva-cancel-insurance-error-title-modal",_textDescription:"bbva-cancel-insurance-error-body-modal",_labelButtonAccept:"bbva-cancel-insurance-call-button-modal",_labelButtonCancel:"bbva-cancel-insurance-consult-link-modal",_imgSrc:this.imgErrorModal}:"existing-error"===e?{_code:e,_titleDescription:"bbva-cancel-insurance-existing-error-title-modal",_textDescription:"bbva-cancel-insurance-existing-error-body-modal",_labelButtonAccept:"bbva-cancel-insurance-call-button-modal",_labelButtonCancel:"bbva-cancel-insurance-consult-link-modal",_imgSrc:this.imgErrorModal}:{_code:"cancel-insurance-keep",_titleDescription:"bbva-cancel-insurance-consult-title-modal",_textDescription:"bbva-cancel-insurance-consult-body-modal",_labelButtonAccept:"bbva-cancel-insurance-consult-button-modal",_labelButtonCancel:"",_imgSrc:this.imgModalSrc};const i={code:t._code,selectedConfig:{className:"full-height-error",openMaximized:!0,iconOnlyFullHeight:!0,title:"bbva-cancel-insurance-consult-header-modal",message:"",heroImage:t._imgSrc,acceptBtLabel:t._labelButtonAccept,cancelBtLabel:t._labelButtonCancel,template:{type:"paragraphs",values:[{title:t._titleDescription,class:"spacing content-fs-xl"},{text:t._textDescription,class:"content-fs-ml spacing"}]}}};Ee(this,ye.SEND_OPEN_CONFIG_MODAL,i)}_launchResetEvents(){Ee(this,ye.APP_RESET_DATA_ANALYTICS),Ee(this,ye.ACTIVE_BTN_SUMMARY,{}),Ee(this,ve.CLOSE),Ee(this,ye.NAVIGATE_RESET_PAGE)}closeOperative(){this._launchResetEvents(),Ee(this,ye.NAVIGATE_BACK_PAGE)}closeOperativeComplete(){this._launchResetEvents()}successfullOnGetCustomersDetail(e){const t=we(e,"contactDetails.0.contactType"),i=t?"contactType.id":"contact.contactDetailType",a=t?"contact":"contact.address",o=e.contactDetails.find((e=>"EMAIL"===we(e,i)));o&&(this.emailInfo=we(o,a).replace(/[*]/g,""))}getFinancialOverview(){Ee(this,fe.GET_FINANCIAL_OVERVIEW,{"contracts.productType":"INSURANCE"})}errorRequestFinancial(){Ee(this,ye.OPEN_MODAL_ERROR,{retryErrorData:{errorId:"cancel-insurance-retry-error",errorType:"operative",retryConfig:{header:"bbva-cancel-insurance-header",fullModal:!1,cancelBtLabel:"Cerrar"},callConfig:{header:"bbva-cancel-insurance-header",fullModal:!0}}}),Ee(this,ve.CLOSE)}getCancelationReasons(){const e={"insurance-product-id":we(this.dataInsuranceToCancel,"detail.commertialProductId")};Ee(this,fe.GET_CANCELATION_REASONS,e)}_setImageToModal(e){this.imgModalSrc=e.imgModalSrc,Ee(this,ye.SEND_IMG_SRC_MODAL,e.imgModalSrc)}_getCustomerEmailData(e){e&&!this.emailInfo&&(Ee(this,fe.SET_CUSTOMER_ID,e),Ee(this,fe.GET_CUSTOMER_DETAIL))}_sendSuccessData(e){const t="4046"===we(this.dataInsuranceToCancel,"detail.commertialProductId"),i=we(e,"operationDate"),a=i.indexOf("."),o=this.configSteps.stepSuccess.configNotificationInfo;if(this.successData={date:i.slice(0,a),title:"bbva-cancel-insurance-header-success",topInfo:[{key:"bbva-cancel-type-insurance",value:t?"dynamic-life-insurance-main-page-header-title":we(this.dataInsuranceToCancel,"detail.productDescription"),class:"bold spacing spacing-top"},{key:"bbva-cancel-insurance-policy-number",value:we(this.dataInsuranceToCancel,"number").trim().split(" ")[0],class:"bold spacing"},{key:"bbva-cancel-insurance-type-operation",value:"bbva-cancel-insurance-type-operation-value",class:"bold spacing"},{key:"bbva-cancel-insurance-date-operation",value:i,class:"bold spacing"},{key:"bbva-cancel-insurance-operation-number",value:we(e,"operationNumber"),class:"bold"},{class:"bold spacing",value:"bbva-bank-name"},{key:"bbva-cancel-insurance-email-information",value:this.emailInfo||"",class:"bold spacing"}],buttons:{primary:{text:"bbva-cancel-insurance-consult-link-modal",action:"go-to-next"},secondary:{hidden:!0}},operations:[{label:"bbva-cancel-insurance-share-button",id:"share",icon:"coronita:share",operative:"cancelInsurance"}],templateSelected:"cancelInsurance"},o.show){const e={message:{type:o.type,header:`<strong>${this.t(o.title)}</strong>`,text:o.message,icon:"coronita:info"}};this.successData=Object.assign(this.successData,e)}return this.successData}_mapConfigByStep(e,t){const i="stepTwo"===t?"BENEFITS":"CONDITIONS";return{...this.configSteps[t],configNotificationInfo:this._validNotificationStep(t,e),description:Me._stepConsiderations(e,i,"TEXT")[0],bullets:Me._stepConsiderations(e,i,"BULLET")}}_getCustomerId(){const e=we(this.globalCacheStorage,"customer.customerId"),t=this.customerId||we(this.globalCacheStorage,"customerId");return e||t}setCustomerId(e){this.customerId=we(e,"value")}setCustomerEmail(e){this.emailInfo=e.replace(/[*]/g,"")}static _getClienteID(e){return(null==e?void 0:e.clienteId)||we(e.receivedInsuranceData,"product.clientId")}static _stepConsiderations(e,t,i){return e.details[0].considerations.filter((e=>e.considerationType.id===t&&e.format.id===i)).map((e=>e.description))}_getStepCollapsedConfig(e,t){const i="4046"===t,a=i||"3005"===t,o=we(e,"detail.dueDate"),n=we(e,"detail.nextPaymentDate"),r={text:"safe-multistep-bbva-header-step",configMessageInfo:{show:a,icon:"bbva:info",text:"bbva-cancel-insurance-suspend-automatic"},listValues:[{key:"bbva-cancel-type-insurance",value:i?"Seguro de Vida":we(e,"detail.productDescription")},{key:"bbva-cancel-insurance-policy-number",value:we(e,"number").trim().split(" ")[0]},{key:"bbva-cancel-insurance-end-validity",value:moment(o).format(this.formatDate)}]};return a&&(r.configMessageInfo.showMessageInfo=!0,r.listValues.push({key:"bbva-cancel-insurance-next-payment-date",value:moment(n).format(this.formatDate)})),r}static _getNoticationConfig(e,t="",i="",a="",o="",n="",r=""){return{show:e,type:t||"default",title:i,message:a,description:o,linkText:n,linkEventName:r}}_validNotificationStep(e,t){const i=we(this.dataInsuranceToCancel,"detail.commertialProductId"),a=we(this.dataInsuranceToCancel,"detail.startDate"),o="4046"===i,n="stepTwo"===e,r="121"===we(t,"details.0.id");let s=this.configSteps[e].configNotificationInfo;return o&&n&&r&&(s=this.configSteps[e].configNotificationWarn,Me._validDateIsAfterNinetyDays(a)&&(s.show=!1)),s}static _validDateIsAfterNinetyDays(e){const t=moment(e);return moment(new Date).diff(t,"days")>90}static _toCapitalize(e,t=!1){return e.toLowerCase().split(" ").map(((e,i)=>0===i&&t||!t?e.charAt(0).toUpperCase()+e.slice(1):e)).join(" ")}_getConfigByInsurance(e){return{4046:{stepOne:{description:"bbva-cancel-insurance-reason-cancel-description",reasonsCancelation:[],configNotificationInfo:Me._getNoticationConfig(!1)},stepTwo:{configNotificationInfo:Me._getNoticationConfig(!0,"default","bbva-cancel-insurance-notification-defatul-title","bbva-cancel-insurance-notification-defatul-body","","55 1102 0000"),configNotificationWarn:Me._getNoticationConfig(!0,"information","bbva-cancel-insurance-notification-information-title","bbva-cancel-insurance-notification-information-body","","55 1102 0000")},stepThree:{configNotificationInfo:Me._getNoticationConfig(!0,"default","","bbva-cancel-insurance-notification-defatul-body-two","","55 1102 0000")},stepSuccess:{configNotificationInfo:Me._getNoticationConfig(!0,"warning-dark","bbva-cancel-insurance-notification-warning-title","bbva-cancel-insurance-notification-warning-body","","")},imgModalSrc:this.imgLifeInsurance},4035:{stepOne:{description:"bbva-cancel-insurance-reason-cancel-description",reasonsCancelation:[],configNotificationInfo:Me._getNoticationConfig(!0,"information","bbva-cancel-insurance-notification-information-title-travel","bbva-cancel-insurance-notification-information-body-travel","","800 890 8986")},stepTwo:{configNotificationInfo:Me._getNoticationConfig(!1)},stepThree:{configNotificationInfo:Me._getNoticationConfig(!0,"default","","bbva-cancel-insurance-notification-defatul-body-three","","55 1102 0000")},stepSuccess:{configNotificationInfo:Me._getNoticationConfig(!1)},imgModalSrc:this.imgTravelInsurance},3005:{stepOne:{description:"bbva-cancel-insurance-reason-cancel-description",reasonsCancelation:[],configNotificationInfo:Me._getNoticationConfig(!1)},stepTwo:{configNotificationInfo:Me._getNoticationConfig(!1)},stepThree:{configNotificationInfo:Me._getNoticationConfig(!0,"default","","bbva-cancel-insurance-notification-defatul-body-three","","55 1102 0000")},stepSuccess:{configNotificationInfo:Me._getNoticationConfig(!0,"warning-dark","bbva-cancel-insurance-notification-warning-title","bbva-cancel-insurance-notification-warning-body","","")},imgModalSrc:this.imgDeviceInsurance}}[e]}}customElements.define(Me.is,Me);class Ne extends h{static get is(){return"bbva-analytics-manager-cancel-insurance-request"}static get properties(){return{flagAnalytic:{type:Object},dynamicsData:{type:Object},reasonSelected:{type:Object},countStepsAnalitycs:{type:Number}}}constructor(){super(),this.flagAnalytic=[],this.dynamicsData={},this.reasonSelected={},this.countStepsAnalitycs=1}initAnalitycs(e){this._resetParamsAnalitycs(),this.fireAnalitycOnClickStart(e)}_resetParamsAnalitycs(){this.countStepsAnalitycs=1,this.dynamicsData={prodAttributesName:"",step:"",typology:"",state:"",operationNumber:""},this.flagAnalytic=[{id:"AppOnclickStart",flag:!1},{id:"AppPageVisit",flag:!1},{id:"AppPageStarted",flag:!1},{id:"AppStep2",flag:!1},{id:"AppStep3",flag:!1},{id:"AppStep4",flag:!1},{id:"Confirmation",flag:!1},{id:"Otp",flag:!1},{id:"Complete",flag:!1},{id:"Error",flag:!1}]}validSendAnalitycs(){const e=this.flagAnalytic.length,t=this.countStepsAnalitycs<4;if(e&&this.flagAnalytic[0].flag&&this.flagAnalytic[1].flag&&t){const{countStepsAnalitycs:e}=this;this[`fireAnalitycStep${e+1}`](),this.countStepsAnalitycs+=1}}fireAnalitycOnClickStart(e){this.dynamicsData={...this.dynamicsData,prodAttributesName:Ne._getNameProduct(e)},this.fireOnce("AppOnclickStart",Se)}fireAnalitycVisit(){this.fireOnce("AppPageVisit",_e)}fireAnalitycStarted(e){this.dynamicsData.detail=e?`radio boton ${e.order}`:"conservar mi seguro",this.reasonSelected=e,this.fireOnce("AppPageStarted",xe)}fireVisitAndStarted(){this.fireAnalitycStarted()}fireAnalitycStep2(){const e=we(this.reasonSelected,"text","");this.dynamicsData.typology=Ne._removeAccents(e),this.fireOnce("AppStep2",Ce)}fireAnalitycStep3(){this.fireOnce("AppStep3",Te)}fireAnalitycStep4(){this.fireOnce("AppStep4",Ie)}fireAnalitycStepOtp(){this.fireOnce("Otp",$e)}fireAnalitycStepSuccess(e){this.dynamicsData.operationNumber=e.operationNumber,this.fireOnce("Complete",ke)}fireAnalitycStepError(e){const t={...this.dynamicsData};t.prodAttributesName="",t.errorName=e?"seguro cancelado o en proceso":"cancelacion fallida",this.fireOnce("Error",Ae,t)}fireOnce(e,t,i){const a=this.flagAnalytic.find((t=>t.id===e));a.flag||(Ee(this,t,i||this.dynamicsData),a.flag=!0)}static _getNameProduct(e){const t="4046"===we(e,"commertialProductId")?"Seguro Vida":we(e,"productDescription"),i=t.split(" ");return(3===i.length?`${i[0]} ${i[2]}`:t).toLowerCase()}static _removeAccents(e){return e.normalize("NFD").replace(/[\u0300-\u036f,.:]/g,"").toLowerCase()}}customElements.define(Ne.is,Ne);
