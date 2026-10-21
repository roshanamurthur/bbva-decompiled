import{aM as t,t as e,aN as i,aL as a}from"./7f3d7ca9.js";import{z as r,ar as o,a as s,an as n,L as l,bj as c,ak as d,h as p,a8 as b,ac as h,ad as m,aa as g,a9 as v,aJ as u,F as y,ag as f,g as k,b0 as $,b1 as S,aM as x,b6 as _,aN as C,ah as L,i as I,aD as T,aO as w,o as A,f as E,au as P,bd as B,ab as D,ap as z,as as M,at as q,bx as H,V as N,av as V,aw as R,S as j,af as F,j as W,r as O,dt as U,aU as X,ai as G,bU as J,aK as K,dB as Z,cM as Q,b5 as Y,bG as tt,R as et,cD as it}from"./952f98a9.js";import{B as at}from"./29a2800d.js";import"./84af4f94.js";import{B as rt}from"./c1760245.js";import{B as ot}from"./aaa76bb8.js";import{B as st}from"./cc301dbe.js";import{B as nt}from"./d8ff1503.js";import"./253d153d.js";import"./111ad2c6.js";import"./85b2133f.js";import"./9ff8f72c.js";import"./216055dc.js";import"./de3f0801.js";import"./90ffd92f.js";import"./e9f2144a.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./ca1bc295.js";import"./17741512.js";import"./5aa1c2be.js";import"./e4099866.js";import"./a6969bf4.js";var lt=r`:host {
  display: block;
  box-sizing: border-box;
  height: 100%;
  overflow: hidden;
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

:host(.scrollable) {
  overflow-y: auto;
  touch-action: pan-y;
  -webkit-overflow-scrolling: touch;
}
${(new o).mediaRules()}`;class ct extends(s(n(l))){static get is(){return"bbva-expandable-multistep"}static get scopedElements(){return{"bbva-core-heading":c}}static get properties(){return{stepSelector:{type:String,attribute:"step-selector"},scrollingDelay:{type:Number,attribute:"scrolling-delay"},hideStepNumbers:{type:Boolean,attribute:"hide-step-numbers"},scrollAnimation:{type:Number,attribute:"scroll-animation"},scrollAnimationCompleted:{type:Number,attribute:"scroll-animation-completed"},startAnimationStep:{type:Number},finishAnimationStep:{type:Number},stepHeight:{type:String},minStepHeight:{type:String},hasAnimation:{type:Boolean,attribute:"has-animation"},_allCompleted:{type:Boolean,attribute:"all-completed",reflect:!0},stepsToReset:{type:Array}}}constructor(){super(),this._allCompleted=!1,this.stepSelector="bbva-expandable-step",this.scrollingDelay=1e3,this.scrollAnimation=600,this.startAnimationStep=100,this.finishAnimationStep=500,this.stepHeight="600px",this.minStepHeight="0px",this.scrollAnimationCompleted=900,this.hasAnimation=!1,this.hideStepNumbers=!1,this.stepsToReset=[],this._completedSteps=[]}static get styles(){return[lt,d("bbva-expandable-multistep-shared-styles")]}render(){return p` <slot id="content"></slot> `}firstUpdated(){setTimeout((()=>{this._setupSteps(),this._bindListeners()}),20)}updated(t){t.has("stepsToReset")&&this.stepsToReset.length&&this.stepsToReset.forEach((t=>this._resetCompletedStep(t)))}_bindListeners(){this.addEventListener("expandable-step-edit-step",this._onEditStep),this.addEventListener("expandable-step-complete-change",this._onStepCompletedChanged)}get allCompleted(){return this._allCompleted}get _firstStep(){return this._steps[0]}get _lastStep(){return this._steps[this._totalSteps-1]}get _firstIncompletedStep(){return this._steps.filter((t=>!t.completed))[0]}_setupSteps(){this._steps=[...this.querySelectorAll(this.stepSelector)],this._totalSteps=this._steps.length;let t=0;this._steps.forEach(((e,i)=>{e.step=i-t,t+=e.hasAttribute("prefilled")?1:0,e.totalSteps=this._totalSteps-this._counterPrefilledSteps(),e.disabled=!0,e.hideStepNumber=this.hideStepNumbers||e.hideStepNumber,this._enableFirstIncompletedStep(e,i)})),this._setLastStepHeight()}_counterPrefilledSteps(){return this._steps.filter((t=>t.hasAttribute("prefilled"))).length}_enableFirstIncompletedStep(t,e){const i=e-1,a=this._steps[i],r=()=>{t.active=!0,t.disabled=!1};a?a.completed&&(r(),this._completedSteps.push(i),t.classList.toggle("after-prefilled",a.prefilled)):r()}_setLastStepHeight(){this._offsetHeight||(this._offsetHeight=document.body.offsetHeight),this._lastStep.style.height=`${this._offsetHeight}px`}_removeLastStepHeight(){this._lastStep.style.height=""}_onStepCompletedChanged(t){const e=t.detail,i=t.target.step;if(this._computeAllCompleted(),e){const t=this._steps[i];t.active=!1,this._scrollToStep(t,0),this._completedSteps.includes(i)||this._completedSteps.push(i)}}_scrollToStep(t,e=this.scrollingDelay,i=!1){this.classList.remove("scrollable");const a=null===e?this.scrollingDelay:e;setTimeout((()=>{this.hasAnimation&&i?this._scrollToTop(this.scrollAnimation,t.offsetTop,this.scrollTop):t.scrollIntoView({block:"nearest",behavior:"smooth"}),this._onScrollAnimationCompleted(t)}),a)}_scrollToTop(t,e,i){const a=e/2;let r=0,o=null;const s=n=>{if(null!==o){if(r+=Math.PI*(n-o)/t,r>=Math.PI)return void(this.scrollTop=e);const s=a-a*Math.cos(r);s>i&&(this.scrollTop=s)}o=n,window.requestAnimationFrame(s)};this.scrollTop!==e&&window.requestAnimationFrame(s)}_animationStep(t,e){const i=t;i.style.height=this.stepHeight,i.style["min-height"]=`${e}px`,i.classList.add("finished"),setTimeout((()=>{i.style.height=this.minStepHeight}),this.startAnimationStep),setTimeout((()=>{i.removeAttribute("style")}),this.finishAnimationStep)}_onScrollAnimationCompleted(t){if(!t.active){const e=this._firstIncompletedStep||this._firstStep;if(e.disabled=!0,this.hasAnimation){const e=t.offsetHeight;this._animationStep(t,e)}return setTimeout((()=>{e.active=!0}),this.scrollAnimationCompleted),void this._scrollToStep(e,null,!0)}setTimeout((()=>{t.disabled=!1}),this.scrollAnimationCompleted),this.classList.add("scrollable"),this.allCompleted&&setTimeout((()=>{this._removeLastStepHeight()}),this.scrollingDelay),this.dispatchEvent(new CustomEvent("expandable-multistep-scroll-animation-end",{detail:!0,bubbles:!0,composed:!0}))}_onEditStep(t){const e=t.detail+this._counterPrefilledSteps(),i=this._steps[e];i.active=!0,this._scrollToStep(i),this._steps.forEach(((t,i)=>{this._deactivateOtherSteps(t,i,e),this._disableNextIncompletedSteps(t,i,e),this._completeActiveStepsPreviouslyCompleted(t,i,e),this._forceDisabledStep(t,i)}))}_forceDisabledStep(t,e){t.disableOnPreviousStepEdit&&(t.completed=!1,t.disabled=!0,this._completedSteps=this._completedSteps.filter((t=>t!==e)),this._computeAllCompleted())}_deactivateOtherSteps(t,e,i){e!==i&&(t.active=!1)}_disableNextIncompletedSteps(t,e,i){!t.completed&&e>i&&(t.disabled=!0)}_completeActiveStepsPreviouslyCompleted(t,e,i){e!==i&&this._completedSteps.includes(e)&&(t.completed=!0)}_allCompletedChanged(t,e){e&&this._setLastStepHeight(),this.dispatchEvent(new CustomEvent("expandable-multistep-all-complete",{detail:t,bubbles:!0,composed:!0}))}_computeAllCompleted(){const t=this._allCompleted;this._allCompleted=this._steps.every((t=>t.completed)),this._allCompletedChanged(this._allCompleted,t)}_resetCompletedStep(t){if(this._completedSteps.includes(t)){const e=this._allCompleted;this._completedSteps=this._completedSteps.filter((e=>e!==t)),this._allCompleted=!1,this._allCompletedChanged(!1,e)}}}const dt=new o;var pt=r`:host {
  box-sizing: border-box;
  display: flex;
  min-height: 1rem;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
  --_notification-help-icon-color: var(--bbva-notification-help-dark-mode-icon-color, var(--bbva-notification-help-icon-color, var(--colorsPrimaryCoreDark, ${b(v.primaryCoreDark)})));
  --_notification-help-text-color: var(--bbva-notification-help-dark-mode-text-color, var(--bbva-notification-help-text-color, var(--colorsSecondary500, ${b(v.secondary500)})));
  --_notification-help-icon-color-alert: var(--bbva-notification-help-dark-mode-icon-color-alert, var(--bbva-notification-help-icon-color-alert, var(--colorsTertiaryType1Dark, ${b(v.tertiaryType1Dark)})));
  --_notification-help-text-color-alert: var(--bbva-notification-help-dark-mode-text-color-alert, var(--bbva-notification-help-text-color-alert, var(--colorsSecondary600, ${b(v.secondary600)})));
  --_notification-help-icon-color-success: var(--bbva-notification-help-dark-mode-icon-color-success, var(--bbva-notification-help-icon-color-success, var(--colorsTertiaryType6Dark, ${b(v.tertiaryType6Dark)})));
  --_notification-help-text-color-success: var(--bbva-notification-help-dark-mode-text-color-success, var(--bbva-notification-help-text-color-success, var(--colorsSecondary500, ${b(v.secondary500)})));
  --skeleton-quote-color: var(--bbva-notification-help-dark-mode-skeleton-quote-color, var(--bbva-notification-help-skeleton-color, var(--colorsSecondary200, ${b(v.secondary200)})));
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
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-text] {
  color: var(--_notification-help-text-color);
  font-size: var(--bbva-notification-help-text-font-size, var(--typographyType3XSmall, ${b(h.type3XSmall)}));
  line-height: var(--bbva-notification-help-text-line-height, var(--lineHeightType3XSmall, ${b(m.type3XSmall)}));
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
${dt.mediaRules()}`;var bt=r`[ambient^=light] {
  --bbva-notification-help-icon-color: initial;
  --bbva-notification-help-text-color: initial;
  --bbva-notification-help-icon-color-alert: initial;
  --bbva-notification-help-text-color-alert: initial;
  --bbva-notification-help-icon-color-success: initial;
  --bbva-notification-help-text-color-success: initial;
  --bbva-notification-help-skeleton-color: initial;
}
${(new o).mediaRules()}`;const ht=new o;const mt={dark:r`
    ${r`[ambient^=dark] {
  --bbva-notification-help-icon-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-notification-help-text-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-notification-help-icon-color-alert: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-notification-help-text-color-alert: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-notification-help-icon-color-success: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-notification-help-text-color-success: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-notification-help-skeleton-color: var(--colorsPrimaryCoreLight, ${b(v.primaryCoreLight)});
}
${ht.mediaRules()}`}
  `,light:r`
    ${bt}
  `};class gt extends(s(n(u(l)))){static get is(){return"bbva-notification-help"}static get scopedElements(){return{"bbva-icon":y,"bbva-text":f}}static get properties(){return{accessibilityLabelIcon:{type:String,attribute:"accessibility-label-icon"},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},text:{type:String},loading:{type:Boolean,reflect:!0},hideTopPadding:{type:Boolean,attribute:"hide-top-padding"},hideBottomPadding:{type:Boolean,attribute:"hide-bottom-padding"},hideLeftPadding:{type:Boolean,attribute:"hide-left-padding"},hideRightPadding:{type:Boolean,attribute:"hide-right-padding"}}}constructor(){super(),this.accessibilityLabelIcon="",this.icon="",this.iconSize=16,this.text="",this.loading=!1,this.hideTopPadding=!1,this.hideBottomPadding=!1,this.hideRightPadding=!1,this.hideLeftPadding=!1}static get styles(){return[super.styles,pt,mt.dark,mt.light,d("bbva-notification-help-shared-styles")]}render(){return p`
      <span class="accessible-hide" ?hidden="${!this.accessibilityLabelIcon}"
        >${this.accessibilityLabelIcon}</span
      >

      <bbva-icon aria-hidden="true" .icon="${this.icon}" .size="${this.iconSize}"> </bbva-icon>

      <bbva-text text=${this.text} unset></bbva-text>
    `}}k("colors.primarySubduedLight"),k("colors.cool20"),k("colors.tertiaryType1Light"),k("colors.primaryCoreLightened"),k("colors.tertiaryType6Light"),k("colors.cool20"),k("colors.cool50");const vt=new o;var ut=r`:host {
  --_form-radio-group-help-icon-color: var(--bbva-form-radio-group-dark-mode-help-icon-color, var(--bbva-form-radio-group-help-icon-color, var(--colorsPrimaryMedium, ${b(v.primaryMedium)})));
  --_form-radio-group-help-icon-active-color: var(--bbva-form-radio-group-dark-mode-help-icon-active-color, var(--bbva-form-radio-group-help-icon-active-color, var(--colorsPrimaryCore, ${b(v.primaryCore)})));
  --_form-radio-group-label-out-color: var(--bbva-form-radio-group-dark-mode-label-out-color, var(--bbva-form-radio-group-label-out-color, var(--colorsSecondary600, ${b(v.secondary600)})));
  display: block;
  box-sizing: border-box;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-notification-help] {
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--typographyTypeMedium, ${b(h.typeMedium)});
  color: var(--_form-radio-group-label-out-color);
}

[data-tag-name=bbva-link] {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
  --bbva-link-with-icon-icon-color: var(--_form-radio-group-help-icon-color);
  --bbva-link-active-with-icon-icon-color: var(--_form-radio-group-help-icon-active-color);
}

:host([two-option]) {
  font-size: 0;
  position: relative;
  word-spacing: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
}
:host([two-option]) .label-out {
  font-size: initial;
  margin-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
  word-spacing: initial;
}
:host([two-option]) ::slotted(*) {
  display: inline-block;
  font-size: initial;
  word-spacing: initial;
}
${vt.mediaRules()}`;const yt=new o;var ft=r`[ambient^=dark] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimarySubduedLight, ${b(v.primarySubduedLight)});
  --bbva-form-radio-group-label-out-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
}

[ambient=dark400] {
  --bbva-form-radio-group-help-icon-color: var(--colorsPrimarySubdued, ${b(v.primarySubdued)});
  --bbva-form-radio-group-help-icon-active-color: var(--colorsPrimaryMediumLight, ${b(v.primaryMediumLight)});
}
${yt.mediaRules()}`;var kt=r`[ambient^=light] {
  --bbva-form-radio-help-icon-color: initial;
  --bbva-form-radio-help-icon-active-color: initial;
  --bbva-form-radio-group-label-out-color: initial;
}
${(new o).mediaRules()}`;const $t={dark:r`
    ${ft}
    ${t.dark}
    ${$.dark}
    ${mt.dark}
    ${S.dark}
  `,light:r`
    ${kt}
    ${t.light}
    ${$.light}
    ${mt.light}
    ${S.light}
  `};class St extends(s(n(x(l)))){static get is(){return"bbva-form-radio-group"}static get scopedElements(){return{"bbva-form-radio-button":e,"bbva-notification-help":gt,"bbva-text":f,"bbva-link":_}}static get properties(){return{name:{type:String,reflect:!0},items:{type:Array},selected:{type:Number,reflect:!0},readonly:{type:Boolean},required:{type:Boolean},disabled:{type:Boolean},invalid:{type:Boolean,reflect:!0},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},twoOption:{type:String,reflect:!0,attribute:"two-option"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},labelOut:{type:String,attribute:"label-out"},helpIcon:{type:Boolean,attribute:"help-icon"},optionalLabel:{type:String,attribute:"optional-label"},linkHref:{type:String,attribute:"link-href"},linkAccessibilityText:{type:String,attribute:"link-accessibility-text"}}}constructor(){super(),this.items=[],this.selected=-1,this.errorIcon=C(),this.errorIconSize=16,this.infoIcon=L(),this.infoIconSize=16,this.name=`form-radio-group-${((t=10)=>`${Math.random().toString(36).substr(2,t)}`)()}`,this.optionalLabel="bbva-form-radio-group-optional-label",this.linkAccessibilityText="bbva-form-radio-group-link-accessibility-text"}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.getAttribute("role")||this.setAttribute("role","radiogroup"),this.addEventListener("slotschanges",(t=>this._setRadioName(t)))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("slotschanges",this._setRadioName())}_setRadioName(t){(((t||{}).detail||{}).contentSlots||[]).forEach((t=>{const e=(t||{}).assignedNodes;"bbva-form-radio-button"===(e.getAttribute("data-tag-name")||(e||{}).nodeName).toLowerCase()&&(e.name=this.name)}))}get radioItems(){return Array.from(this.querySelectorAll('[data-tag-name="bbva-form-radio-button"]'))}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._itemsContainer=this.shadowRoot.querySelector(".form-radio-group-container"),this._itemsContainer&&this.appendChild(this._itemsContainer.content),this.addEventListener("change",(t=>this._updateItems(t)))}updated(t){if(super.updated&&super.updated(t),t.has("selected")&&this.radioItems.length)if(Number.isFinite(this.selected)&&this.selected>-1&&this.selected<this.radioItems.length)this.radioItems[this.selected].checked=!0;else{const t=this.radioItems.find((t=>t.checked));t&&(t.checked=!1)}t.has("disabled")&&this.radioItems.length&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].disabled=this.disabled}))),t.has("invalid")&&this.radioItems.length&&(this.setAttribute("aria-invalid",this.invalid.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].invalid=this.invalid}))),t.has("readonly")&&this.radioItems.length&&(this.setAttribute("aria-readonly",this.readonly.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].readonly=this.readonly}))),t.has("required")&&this.radioItems.length&&(this.setAttribute("aria-required",this.required.toString()),this.radioItems.forEach(((t,e)=>{this.radioItems[e].required=!1})),this.radioItems[0].required=!0)}_updateItems(t){const e=this.radioItems.indexOf(t.target);this.selected=e,this.invalid=!1,this.dispatchEvent(new CustomEvent("form-radio-group-item-change",{detail:{value:t.target.value,selected:e},bubbles:!0,composed:!0}))}_helpClicked(t){t.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-radio-group-help-click",{detail:!0,bubbles:!0,composed:!0}))}get _helpIcon(){return this.helpIcon?p`
        <bbva-link
          aria-label="${this.t(this.linkAccessibilityText)}"
          icon-size="24"
          @click="${this._helpClicked}"
          href="${I(this.linkHref)}"
          icon="${T()}"
        >
        </bbva-link>
      `:""}get _labelOut(){if(this.labelOut){const t=this.t(this.labelOut);return p`
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
      `}return""}static get styles(){return[ut,d("bbva-form-radio-group-shared-styles"),$t.dark,$t.light]}render(){return p`
      ${this._labelOut}
      <slot></slot>
      <template class="form-radio-group-container">
        ${this.items.map((t=>p`
            <bbva-form-radio-button
              .name="${this.name}"
              .value="${t.value}"
              label="${t.label}"
              divider="${I(t.divider)}"
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
              accessibility-icon-info-notification="${I(t.accessibilityIconInfo)}"
              accessibility-icon-alert-notification="${I(t.accessibilityIconAlert)}"
              variant="${I(t.variant)}"
            >
              ${t.text?w(t.text):t.label}
            </bbva-form-radio-button>
          `))}
      </template>
      ${this.invalid&&this.errorMessage?p`
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
    `}}k("colors.primarySubdued"),k("colors.primaryMediumLight"),k("colors.primaryCoreLightened");var xt=r`[ambient^=light] {
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
${(new o).mediaRules()}`;const _t=new o;var Ct=r`[ambient^=dark] {
  --bbva-list-simple-label-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-list-simple-mask-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-list-simple-description-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-list-simple-icon-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-list-simple-active-bg-color: token("foundations.colors.primaryCoreDark");
  --bbva-list-simple-active-link-color: var(--colorsPrimarySubduedLight, ${b(v.primarySubduedLight)});
  --bbva-list-simple-link-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-list-simple-link-active-color: var(--colorsPrimarySubduedLight, ${b(v.primarySubduedLight)});
  --bbva-list-simple-skeleton-color: var(--colorsPrimaryMedium, ${b(v.primaryMedium)});
  --bbva-list-simple-stacked-label-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
}
${_t.mediaRules()}`;const Lt={dark:r`
    ${$.dark}
    ${P.dark}
    ${B.dark}
    ${Ct}
  `,light:r`
    ${$.light}
    ${P.light}
    ${B.light}
    ${xt}
  `},It=new o;var Tt=r`:host {
  --_list-simple-text-color: var(--bbva-list-simple-dark-mode-text-color,var(--bbva-list-simple-text-color, var(--colorsSecondary600, ${b(v.secondary600)})));
  --_list-simple-mask-color: var(--bbva-list-simple-dark-mode-mask-color,var(--bbva-list-simple-mask-color, var(--colorsSecondary600, ${b(v.secondary600)})));
  --_list-simple-label-color: var(--bbva-list-simple-dark-mode-label-color,var(--bbva-list-simple-label-color, var(--colorsSecondary600, ${b(v.secondary600)})));
  --_list-simple-description-color: var(--bbva-list-simple-dark-mode-description-color,var(--bbva-list-simple-description-color, var(--colorsSecondary600, ${b(v.secondary600)})));
  --_list-simple-active-bg-color: var(--bbva-list-simple-dark-mode-active-bg-color,var(--bbva-list-simple-active-bg-color, var(--colorsSecondary100, ${b(v.secondary100)})));
  --_list-simple-stacked-label-color: var(--bbva-list-simple-dark-mode-stacked-label-color,var(--bbva-list-simple-stacked-label-color, var(--colorsSecondary500, ${b(v.secondary500)})));
  --_list-simple-link-color: var(--bbva-list-simple-dark-mode-link-color,var(--bbva-list-simple-link-color, var(--colorsPrimaryMedium, ${b(v.primaryMedium)})));
  --_list-simple-link-active-color: var(--bbva-list-simple-dark-mode-link-active-color,var(--bbva-list-simple-link-active-color, var(--colorsPrimaryCoreDark, ${b(v.primaryCoreDark)})));
  --_list-simple-icon-color: var(--bbva-list-simple-dark-mode-icon-color,var(--bbva-list-simple-icon-color, var(--colorsPrimaryMedium, ${b(v.primaryMedium)})));
  --_list-simple-icon-active-color: var(--bbva-list-simple-dark-mode-icon-active-color,var(--bbva-list-simple-icon-active-color, var(--colorsPrimaryCoreDark, ${b(v.primaryCoreDark)})));
  --_list-simple-skeleton-quote-color: var(--bbva-list-simple-dark-mode-skeleton-color,var(--bbva-list-simple-skeleton-color, var(--colorsSecondary200, ${b(v.secondary200)})));
  --_list-simple-skeleton-quote-bg: var(--bbva-list-simple-dark-mode-skeleton-bg,var(--bbva-list-simple-skeleton-bg, transparent));
  display: block;
  box-sizing: border-box;
  position: relative;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
  min-height: var(--bbva-list-simple-min-height, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem));
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
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
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
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
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
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${b(D.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${b(D.medium.fontStyle)});
}

:host([description-italic]) [data-tag-name=bbva-text].description,
:host([description-italic]) [data-tag-name=bbva-amount] {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${b(D.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${b(D.bookItalic.fontStyle)});
}

:host([description-medium][description-italic]) [data-tag-name=bbva-text].description,
:host([description-medium][description-italic]) [data-tag-name=bbva-amount],
:host([description-date]) [data-tag-name=bbva-text].description {
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${b(D.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${b(D.mediumItalic.fontStyle)});
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
  padding: 0 calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
}

:host([variant=stacked-center][action-icon][action-secondary-icon]) dl {
  padding: 0 calc(((8 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
}
${It.mediaRules()}`;class wt extends(z(M(q(u(s(n(l))))))){static get is(){return"bbva-list-simple"}static get scopedElements(){const t=[R,_,j,f,F];return wt.scopedElementsFromClasses(t)}static get properties(){return{label:{type:String},labelLink:{type:Boolean,attribute:"label-link"},labelEllipsis:{type:Boolean,attribute:"label-ellipsis"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},description:{type:String},descriptionLink:{type:Boolean,attribute:"description-link"},descriptionMedium:{type:Boolean,attribute:"description-medium",reflect:!0},descriptionDate:{type:Boolean,attribute:"description-date",reflect:!0},descriptionItalic:{type:Boolean,attribute:"description-italic"},descriptionEllipsis:{type:Boolean,attribute:"description-ellipsis"},actionIcon:{type:String,attribute:"action-icon",reflect:!0},actionSecondaryIcon:{type:String,attribute:"action-secondary-icon",reflect:!0},actionAccessibilityText:{type:String,attribute:"action-accessibility-text"},actionSecondaryAccessibilityText:{type:String,attribute:"action-secondary-accessibility-text"},actionLink:{type:String,attribute:"action-link"},actionLinkEllipsis:{type:Boolean,attribute:"action-link-ellipsis"},status:{type:String},color:{type:String},mask:{type:String},loading:{type:Boolean,reflect:!0},disableLink:{type:Boolean},variant:{type:String,reflect:!0},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},maskChars:{type:String,attribute:"mask-chars"},visibleChars:{type:Number,attribute:"visible-chars"},labelAccessibilityText:{type:String,attribute:"label-accessibility-text"},labelLinkAccessibilityText:{type:String,attribute:"label-link-accessibility-text"},descriptionLinkAccessibilityText:{type:String,attribute:"description-link-accessibility-text"},actionLinkAccessibilityText:{type:String,attribute:"action-link-accessibility-text"},descriptionAccessibilityText:{type:String,attribute:"description-accessibility-text"},rolelink:{type:String,attribute:"role-link"},arialiveLink:{type:String,attribute:"aria-live-link"},labelTagText:{type:String,attribute:"label-tag-text"},descriptionTagText:{type:String,attribute:"description-tag-text"},labelRoleText:{type:String,attribute:"label-role-text"},descriptionRoleText:{type:String,attribute:"description-role-text"},labelAriaLiveText:{type:String,attribute:"label-aria-live-text"},descriptionAriaLiveText:{type:String,attribute:"description-aria-live-text"},showCurrencyCode:{type:Boolean,attribute:"show-currency-code"}}}constructor(){super(),this.stackedCenter=!1,this.labelMedium=!1,this.labelLink=!1,this.descriptionLink=!1,this.descriptionMedium=!1,this.descriptionDate=!1,this.descriptionItalic=!1,this.labelEllipsis=!1,this.descriptionEllipsis=!1,this.actionLinkEllipsis=!1,this.loading=!1,this.disableLink=!1,this.actionLink="",this.description="",this.status="",this.color="",this.variant="",this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.decimalsHidden=!1,this.actionAccessibilityText="bbva-list-simple-action-accessibility-text",this.actionSecondaryAccessibilityText="bbva-list-simple-secondary-action-accessibility-text",this.labelAccessibilityText="bbva-list-simple-label-accessibility-text",this.descriptionAccessibilityText="bbva-list-simple-description-accessibility-text",this.maskChars="••••",this.visibleChars=0,this.showCurrencyCode=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this.disabledTabindex=!0}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.disabledTabindex=!1}static get styles(){return[super.styles,Tt,Lt.light,Lt.dark,H("button:focus"),d("bbva-list-simple-shared-styles")]}get _isValidAmount(){return this.amount||0===this.amount}get _amount(){return p`
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
    `}get _icon(){return p`
      <button @click="${()=>this._iconClick("icon")}">
        <span class="sr-only">${this.t(this.actionAccessibilityText)}</span>
        <bbva-core-icon icon="${this.actionIcon}" size="24" aria-hidden="true"></bbva-core-icon>
      </button>
    `}get _secondaryIcon(){return p`
      <button @click="${()=>this._iconClick("secondary-icon")}">
        <span class="sr-only">${this.t(this.actionSecondaryAccessibilityText)}</span>
        <bbva-core-icon
          icon="${this.actionSecondaryIcon}"
          size="24"
          aria-hidden="true"
        ></bbva-core-icon>
      </button>
    `}get _actionIcons(){return p`
      <div class="action-icons">
        ${this.actionIcon?this._icon:""} ${this.actionSecondaryIcon?this._secondaryIcon:""}
      </div>
    `}get _badgeVariability(){const t="nochange"===this.status?"no-change":this.status;return p`
      <bbva-badge-variability
        disabled-tabindex
        .status=${t}
        .color=${this.color}
      ></bbva-badge-variability>
    `}get _mask(){const t=N(this.mask,this.maskChars,!0,this.visibleChars);return p`
      <div>
        <span class="mask">${this.maskChars}</span>
        <span class="number">${t.substr(this.maskChars.length)}</span>
      </div>
    `}get _actions(){let t=null;return this.actionIcon||this.actionSecondaryIcon?t=this._actionIcons:this.actionLink&&(t=this._tplLink("actionLink")),t}get _definitionDescriptionTpl(){let t=null,e="";return this.description?(t=this._tplText("description"),e="description"):this.mask?(t=this._mask,e="mask"):this._isValidAmount&&(t=this._amount,e="amount"),p`
      <dd class=${V({[`wrapper-${e}`]:!0,ellipsis:this.descriptionEllipsis})}>
        ${this.status?this._badgeVariability:""} ${t}
      </dd>
    `}_tplLink(t){const e="actionLink"===t?`${t}AccessibilityText`:`${t}LinkAccessibilityText`;return p`
      <bbva-link
        class=${V({ellipsis:this[`${t}Ellipsis`]})}
        aria-label="${I(this.t(this[e]))}"
        ?disabled=${this.disabled||this.disableLink}
        @click="${()=>this._linkClick(t)}"
      >
        <span role=${I(this.roleLink)} aria-live=${I(this.arialiveLink)}>
          ${this[t]}
        </span>
      </bbva-link>
    `}_tplNoLink(t){const e=`${t}AccessibilityText`,i=`${t}TagText`,a=`${t}RoleText`,r=`${t}AriaLiveText`;return p`
      <bbva-text
        aria-label="${this.t(this[e])}"
        role="${I(this[a])}"
        aria-live="${I(this[r])}"
        class="${t}"
        unset
        size="S"
        text="${this[t]}"
        tag="${I(this[i])}"
      >
      </bbva-text>
    `}_tplText(t){return p` ${this[`${t}Link`]?this._tplLink(t):this._tplNoLink(t)} `}_iconClick(t){this.dispatchEvent(new CustomEvent(`list-simple-${t}-click`,{detail:!0,bubbles:!0,composed:!0}))}_linkClick(t){const e=t.replace(/[A-Z]/g,(t=>`-${t.toLowerCase()}`));this.dispatchEvent(new CustomEvent(`list-simple-link-${e}-click`,{detail:!0,bubbles:!0,composed:!0}))}renderDefault(){return p`
      <dl>
        <dt class=${V({ellipsis:this.labelEllipsis})}>
          ${this._tplText("label")} ${this.actionIcon?this._actionIcons:""}
        </dt>
        ${this._definitionDescriptionTpl}
      </dl>
    `}renderStacked(){return p`
      <div class="wrapper">
        ${this.description||this._isValidAmount||this.mask?p`
              <dl>
                <dt>${this._tplText("label")}</dt>
                ${this._definitionDescriptionTpl}
              </dl>
            `:this._tplText("label")}
        ${this._actions}
      </div>
    `}render(){let t=null;const e=["stacked","stacked-center"].includes(this.variant);return t=this.label?this.description||this._isValidAmount||this.mask||e?e?this.renderStacked():this.renderDefault():this._tplText("label"):p` <div class="wrapper-description">${this._tplText("description")}</div> `,p`
      ${t}
      <div class="skeleton"></div>
    `}}k("colors.primaryCoreLightened"),k("colors.primaryCoreLightened"),k("colors.primaryCoreLightened"),k("colors.primaryCoreLightened"),k("colors.cool60"),k("colors.primaryCoreLightened"),k("colors.primarySubdued"),k("colors.primaryMediumLight"),k("colors.primarySubdued"),k("colors.primaryMediumLight"),k("colors.cool50");var At=r`
:host {
  display: flex;
  flex-direction: column;
  box-sizing: border-box;
  text-align: center;
  position: relative;
  --_panel-info-title-color: var(--bbva-panel-info-title-dark-mode-color, var(--bbva-panel-info-title-color, var(--colorsSecondary600, ${b(v.secondary600)})));
  --_panel-info-text-color: var(--bbva-panel-info-text-dark-mode-color, var(--bbva-panel-info-text-color, var(--colorsSecondary600, ${b(v.secondary600)})));
  --bbva-text-highlight-color: var(--bbva-panel-info-text-highlight-dark-mode-color, var(--bbva-panel-info-text-highlight-color, var(--colorsSecondary600, ${b(v.secondary600)})));
  --_skeleton-quote-color: var(--bbva-panel-info-skeleton-dark-mode-color, var(--bbva-panel-info-skeleton-color, var(--colorsSecondary200, ${b(v.secondary200)})));
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
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1em) auto;
}
.image img {
  width: var(--bbva-panel-info-image-width, 100%);
  height: var(--bbva-panel-info-image-height, auto);
  object-fit: cover;
  margin: 0 auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
}
.image span {
  display: block;
  width: var(--bbva-panel-info-microillustration-width, 5rem);
  height: var(--bbva-panel-info-microillustration-height, auto);
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem) auto calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
}
.image span.empty-state {
  width: 9rem;
}

.content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1em) calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1em);
}
.content ::slotted(*) {
  margin: 0;
  line-height: var(--lineHeightTypeSmall, ${b(m.typeSmall)});
}

:host([hide-padding-bottom]) .content {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1em) 0;
}

.title {
  margin: 0 0 calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
  color: var(--_panel-info-title-color);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${b(D.medium.fontWeight)});
  line-height: var(--lineHeightTypeLarge, ${b(m.typeLarge)});
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
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
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
  margin-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
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
`,Et=r`
[ambient^=light] {
  --bbva-panel-info-title-color: initial;
  --bbva-panel-info-text-color: initial;
  --bbva-panel-info-text-highlight-color: initial;
  --bbva-panel-info-skeleton-color: initial;
}
`,Pt=r`
[ambient^=dark] {
  --bbva-panel-info-title-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-panel-info-text-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-panel-info-text-highlight-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-panel-info-skeleton-color: var(--colorsPrimaryMedium, ${b(v.primaryMedium)});
}
`;const Bt={light:r`
    ${$.light}
    ${Et}
  `,dark:r`
    ${$.dark}
    ${Pt}
  `};class Dt extends(u(s(z(n(l))))){static get is(){return"bbva-panel-info"}static get scopedElements(){return{"bbva-core-heading":c,"bbva-link":_,"bbva-text":f}}static get properties(){return{image:{type:String},imageAltText:{type:String,attribute:"image-alt-text"},microillustration:{type:Object},heading:{type:String},headingLines:{type:Number,attribute:"heading-lines"},text:{type:String},textLines:{type:Number,attribute:"text-lines"},linkText:{type:String,attribute:"link-text"},loading:{type:Boolean,reflect:!0},headingLevelTitle:{type:String,attribute:"heading-level-title",reflect:!0},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom",reflect:!0},isNested:{type:Boolean,attribute:"is-nested"}}}constructor(){super(),this.imageAltText="",this.microillustration=U,this.text="",this.loading=!1,this.headingLevelTitle="h2",this.hidePaddingBottom=!1,this.isNested=!1,this.heading="",this.linkText=""}static get styles(){return[At,super.styles,d("bbva-panel-info-shared-styles"),Bt.light,Bt.dark]}get _contentImage(){return this.image?p` <img id="image" src="${this.image}" alt="${this.imageAltText}" /> `:p`
      <span
        class="${V({"empty-state":this._isEmptyState&&!this.isNested})}"
        aria-hidden="true"
        >${this.microillustration}</span
      >
    `}get _isEmptyState(){return this.microillustration===U}render(){return p`
      <div class="image">${this._contentImage}</div>
      <div class="content">
        ${this.heading&&p`
          <bbva-text
            tabindex="0"
            class="title ${V({"not-text":!this.text})}"
            text=${this.t(this.heading)}
            size="L"
            alignment="center"
            tag="${I(this.headingLevelTitle)}"
            ?ellipsis="${!!this.headingLines}"
            .lines="${this.headingLines}"
            inherit
          ></bbva-text>
        `}
        ${this.t(this.text)&&p`
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
        ${p` <slot></slot> `}
        ${this.linkText&&p`
          <bbva-link
            ?disabled=${this.disabled}
            @click="${this._buttonClickHandler}"
            .text="${this.t(this.linkText)}"
          ></bbva-link>
        `}
      </div>
    `}_buttonClickHandler(){this.disabled||this.dispatchEvent(new CustomEvent("panel-info-link-click",{detail:!0,bubbles:!0,composed:!0}))}}k("colors.primaryCoreLightened"),k("colors.primaryCoreLightened"),k("colors.primaryCoreLightened"),k("colors.cool50");var zt=r`:host {
  display: block;
  box-sizing: border-box;
  position: absolute;
  inset: 0;
  --bbva-expandable-step-content-max-height: none;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

#cardBanner {
  padding: 0 0 1rem 0;
  box-shadow: none;
  background-color: #F4F4F4;
  margin-top: calc(((-7 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
}

.firstHeader {
  display: flex;
  padding-top: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
}
.firstHeader #firstHeaderCategory {
  padding-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
  padding-top: 0;
  padding-bottom: 0;
}
.firstHeader .firstOptionalHeader {
  align-self: center;
  --bbva-text-color: var(--colorsSecondary500, ${b(v.secondary500)});
  padding: 0;
  justify-self: start;
}

#headerProviders {
  padding-top: 1rem;
}

.paddingX {
  padding: 0 1rem;
}

.sectionMargin {
  margin: 1rem 1rem 0rem;
}

.formInputs {
  margin: 1rem 1rem;
}

.sideMargin {
  margin: 0 1rem;
}

.listContactDark {
  --bbva-list-contact-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-list-contact-title-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
}

.footerButtonStep {
  display: flex;
  justify-content: center;
}

.listItem {
  --_list-simple-description-color: var(--colorsSecondaryWhite, ${b(v.SecondaryWhite)});
  --bbva-list-simple-label-color: var(--colorsSecondaryWhite, ${b(v.SecondaryWhite)});
  --_list-simple-text-color: var(--colorsSecondaryWhite, ${b(v.SecondaryWhite)});
}

.listInfo {
  --bbva-list-info-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-list-info-icon-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  font-weight: var(--fontFacePrimaryMediumItalicFontWeight, ${b(D.mediumItalic.fontWeight)});
  font-style: var(--fontFacePrimaryMediumItalicFontStyle, ${b(D.mediumItalic.fontStyle)});
  font-size: var(--typographyTypeSmall, ${b(h.typeSmall)});
  height: 100%;
}

.panel {
  display: flex;
  justify-content: center;
  align-items: center;
}

[data-tag-name=bbva-expandable-multistep][all-completed] .panel {
  display: flex;
  justify-content: center;
  align-items: center;
  bottom: 0px;
  width: 100%;
  position: fixed;
  background-color: white;
  min-height: calc(((12 * var(--gridSpacerVariant, var(--gridSpacer, ${b(g.spacer)}))) / 16) * 1rem);
}

[data-tag-name=bbva-expandable-multistep][all-completed] {
  overflow: hidden;
}

#secondStepTitle {
  --bbva-header-category-heading-color: var(--colorsPrimaryCoreLightened, ${b(v.primaryCoreLightened)});
  --bbva-link-color: var(--colorsPrimarySubdued, ${b(v.primarySubdued)});
}
`;function Mt({text:t,size:e="S",alignment:i="left",fontWeight:a="300",fontStyle:r="",tag:o="span",className:s="paddingX"}){return p`
      <bbva-text
        text=${t}
        size=${e}
        alignment=${i}
        font-weight=${a}
        font-style=${r}
        tag=${o}
        class=${s}>
      </bbva-text>
    `}function qt({title:t="",bullets:e=[],sectionText:i=""}){return p`
      <bbva-header-category
          text="${t.toLocaleUpperCase()}">
      </bbva-header-category>
      ${e.length?e.map((t=>p`
          <bbva-list-bullet text="${t}"></bbva-list-bullet>
        `)):Mt({text:i})}
    `}class Ht extends(s(n(l))){static get scopedElements(){const t=[J,at,K,ct,Z,rt,Q,St,ot,Y,tt,st,et,nt,wt,it,a,Dt,f];return Ht.scopedElementsFromClasses(t)}static get is(){return"bbva-multistep-parking-enrollment"}static get properties(){return{_allCompleted:{attribute:!1},_bannerHidden:{type:Boolean},_firstStepCompleted:{type:Boolean},_isEnable:{type:Boolean},_itemSelectedIndex:{type:Number},_linkedAccountData:{type:Array},_oldItemSelectedIndex:{type:Number},alias:{type:String},phoneNumber:{type:String,attribute:"phone-number"},providers:{type:Array},imageDark:{type:String},eventSave:{type:Object}}}constructor(){super(),this._allCompleted=!1,this._bannerHidden=!1,this._firstStepCompleted=!1,this._itemSelectedIndex=0,this._isEnable=!1,this._linkedAccountData=[],this._oldItemSelectedIndex=0,this._patternField="\\d{10}",this.alias="",this.imageSrc="",this.phoneNumber="",this.providers=[],this.imageDark="",this.eventSave={}}static get styles(){return[zt,d("bbva-multistep-parking-enrollment-shared-styles")]}updated(t){super.updated(t),t.has("providers")&&this.providers.length>1&&this._radioGroupBuilder()}get _steps(){return[...this.shadowRoot.querySelectorAll('[data-tag-name="bbva-expandable-step"]')]}firstStepContent(){return p`
       <bbva-expandable-step
        hide-padding-left
        hide-padding-right
        id="firstStepParkingEnrollment"
        class="step-one"
        header="${this._firstStepCompleted?this.t("bbva-multistep-parking-enrollment-first-step-header"):""}"
        edit-label="${this._firstStepCompleted?this.t("bbva-multistep-parking-enrollment-first-step-edit-label"):""}"
        current-step-label=""
        total-steps="3"
        step="1"
        @expandable-step-edit-step="${t=>{this._firstStepCompleted=!1,this._toggleBanner(),this._onStepEdit(t)}}">
          <bbva-card-banner 
            disabled-tabindex="" 
            microillustration="car" 
            description="${this.t("bbva-multistep-parking-enrollment-first-step-banner-description")}"
            id="cardBanner"
            ?hidden="${this._bannerHidden}">
          </bbva-card-banner>
          <div class="firstHeader">
            <bbva-header-category
              id="firstHeaderCategory"
              text="${this.t("bbva-multistep-parking-enrollment-first-step-header")}">
            </bbva-header-category>
            <div class="firstOptionalHeader">
              ${Mt({text:`${this.t("bbva-multistep-parking-enrollment-first-step-optional-header",{totalSteps:this._steps.length})}`,fontStyle:"italic",className:"",size:"M"})}
            </div>
          </div>
          ${Mt({text:this.t("bbva-multistep-parking-enrollment-first-step-description"),tag:"p"})}
          <bbva-header-category
            variant="product"
            text="${this.t("bbva-multistep-parking-enrollment-first-step-header-category")}">
          </bbva-header-category>
            ${this._listProviderBuilder()}
          ${qt({title:this.t("bbva-multistep-parking-enrollment-first-step-first-section-title"),bullets:[`${this.t("bbva-multistep-parking-enrollment-first-step-first-section-first-bullet")}`]})}
          ${qt({title:this.t("bbva-multistep-parking-enrollment-first-step-second-section-title"),bullets:[`${this.t("bbva-multistep-parking-enrollment-first-step-second-section-first-bullet")}`]})}
          ${qt({title:this.t("bbva-multistep-parking-enrollment-first-step-third-section-title"),bullets:[`${this.t("bbva-multistep-parking-enrollment-first-step-third-section-first-bullet")}`]})}
          ${qt({title:this.t("bbva-multistep-parking-enrollment-first-step-fourth-section-title"),sectionText:this.t("bbva-multistep-parking-enrollment-first-step-fourth-section-text")})}
          <bbva-notification-message 
            variant="default" 
            link-title="${this.t("bbva-multistep-parking-enrollment-first-step-notification-link")}"
            class="sectionMargin">
            ${this.t("bbva-multistep-parking-enrollment-first-step-notification-description")}
          </bbva-notification-message>
          <bbva-panel-button-fixed 
            show="" 
            sticky
            class="" 
            id="buttonFirstStep" 
            button-class="positive" 
            button-text="${this.t("bbva-multistep-parking-enrollment-first-step-button")}"
            @click="${this._completeFirstStep}">
          </bbva-panel-button-fixed>
          <div class="summary" slot="summary">
            ${this.providers&&1===this.providers.length?p`
                  <bbva-list-contact 
                    disabled-tabindex="" 
                    action-icon-primary="" 
                    action-icon-secondary="" 
                    content-title="${this.providers[0].title}"
                    initials="${this.providers[0].initials}"
                    image="${this.providers[0].image}"
                    no-action-icons=""
                    class="listContactDark"
                    .descriptions="${this.providers[0].description}">
                  </bbva-list-contact>
              `:""}
          </div>
        </bbva-expandable-step>
    `}_toggleBanner(){this._firstStepCompleted?this._bannerHidden=!0:this._bannerHidden=!1}_listProviderBuilder(){return p`
    ${this.providers&&this.providers.length>0?this.providers.map((({title:t,initials:e,description:i,image:a},r)=>p`
        <bbva-list-contact 
            id = "${`provider${r}`}"
            disabled-tabindex="" 
            action-icon-primary=""
            action-icon-secondary="" 
            content-title="${t}"
            initials="${e}"
            image="${this._firstStepCompleted?a:this.imageDark}"
            no-action-icons=""
            .descriptions="${i}">
        </bbva-list-contact>`)):""}
    `}_completeFirstStep(t){this._genericDispatchEvent("parking-enrollment-first-step-interaction"),this._genericDispatchEvent("parking-enrollment-first-step-continue",{step:"continuar"}),this._stepCompletedHandler(t),this._firstStepCompleted=!0,this._toggleBanner()}_stepCompletedHandler({target:t}){t.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0})),this._getStepsStatus()}_getStepsStatus(){const t=this._steps.map(((t,e)=>({id:e,step:t.completed})));this._genericDispatchEvent("send-steps-status",t)}_optionalStep(){return p`
      <bbva-expandable-step
        hide-padding-left
        hide-padding-right
        header="${this.t("bbva-multistep-parking-enrollment-optional-step-header")}"
        edit-label="${this.t("bbva-multistep-parking-enrollment-optional-step-edit-label")}"
        class="step-two"
        current-step-label="${`2 de ${this._steps.length}`}"
        total-steps="4"
        step=2> 
        <div class="paddingX">
          <bbva-form-radio-group 
            id="radioButtonParkingEnrollment"
            name="providerRadios"
            selected="0"
            label-out="${this.t("bbva-multistep-parking-enrollment-optional-step-radio-label")}"
            optional-label=""
            @form-radio-group-item-change="${this._changeItemSelected}">
          </bbva-form-radio-group>
        </div>
        <div class="footerButtonStep">
          <bbva-button-default 
              @click="${this._stepCompletedHandler}">
              ${this.t("bbva-multistep-parking-enrollment-optional-step-button")}
            </bbva-button-default>
        </div>
        <div class="summary" slot="summary">
          <bbva-list-contact 
            disabled-tabindex="" 
            action-icon-primary="" 
            action-icon-secondary="" 
            content-title="${this.providers[this._itemSelectedIndex].title}"
            initials="${this.providers[this._itemSelectedIndex].initials}"
            image="${this.providers[this._itemSelectedIndex].image}"
            no-action-icons=""
            class="listContactDark"
            .descriptions="${this.providers[this._itemSelectedIndex].description}">
          </bbva-list-contact>
        </div>
      </bbva-expandable-step>
    `}get providersRadioGroup(){return this.shadowRoot.querySelector("[name=providerRadios]")}_radioGroupBuilder(){const t=this.providersRadioGroup,e=this.providers.map((({title:t,image:e})=>{const i=t.split(" ").join("");return{text:`${t}<bbva-clip-box class="bitone" image=${e} text="${t}" size="medium" slot="clip"></bbva-clip-box>`,variant:"card",value:i}}));t.items=e}_changeItemSelected({detail:t}){t&&"number"==typeof t.selected&&void 0!==t.selected&&null!==t.selected&&t.selected!==this._oldItemSelectedIndex&&(this._itemSelectedIndex=t.selected,this._oldItemSelectedIndex=this._itemSelectedIndex)}secondStep(){return p`
      <bbva-expandable-step
        id='secondStepParkingEnrollment'
        hide-padding-left
        hide-padding-right
        header="${this.t("bbva-multistep-parking-enrollment-second-step-header")}"
        edit-label="${this.t("bbva-multistep-parking-enrollment-second-step-edit-label")}"
        class="step-two"
        current-step-label="${`2 de ${this._steps.length}`}"
        total-steps="${this._steps.length}"
        step="2"
        @expandable-step-edit-step="${t=>{this._onStepEdit(t)}}">
        ${Mt({text:`${this.t("bbva-multistep-parking-enrollment-second-step-description")}`})}
        <bbva-form-contact
          id="formContact"
          class="formInputs"
          label="${this.t("bbva-multistep-parking-enrollment-second-step-form-contact-label")}"
          allowed-pattern="[0-9]"
          maxlength="10"
          optional-label=""
          auto-validate
          pattern="${this._patternField}"
          inputmode="decimal"
          value="${this.phoneNumber}"
          error-message=${this.t("bbva-multistep-parking-enrollment-second-step-form-contact-error-message")}
          @input="${this._changePhoneValue}">
          <span slot="_input">
          </span>
        </bbva-form-contact>
        <bbva-form-text 
          label="${this.t("bbva-multistep-parking-enrollment-second-step-form-text-label")}"
          class="formInputs"
          optional-label=""
          maxlength="8"
          info-message="${this.t("bbva-multistep-parking-enrollment-second-step-form-text-info-message")}"
          value="${this.alias}"
          @input="${this._changeAliasValue}">
        </bbva-form-text>
        <div class="footerButtonStep">
          <bbva-button-default
            id="buttonSecondStep"
            ?disabled="${this._disabler}"
            @click="${this._secondStepCompleted}">
            ${this.t("bbva-multistep-parking-enrollment-second-step-button")}
          </bbva-button-default>
        </div>
        <div class="summary" slot="summary">
         ${this._linkedAccountBuilder()}
        </div>
      </bbva-expandable-step>`}editStep(){this.shadowRoot.querySelector("#secondStepParkingEnrollment").edit()}_changePhoneValue(t){this._updatePhoneNumber(t.target.value)}_changeAliasValue(t){this._updateAlias(t.target.value)}_updatePhoneNumber(t){this.phoneNumber=t}_updateAlias(t){this.alias=t}_secondStepCompleted(t){this.eventSave=t,this._genericDispatchEvent("send-phone-number",this.phoneNumber),this._genericDispatchEvent("send-phone-alias",this.alias),this._genericDispatchEvent("show-spinner"),this._genericDispatchEvent("get-bills-account"),this._generateLinkedAccountData()}setCompleteSecondStepData(t){const e={...t,target:this.shadowRoot.querySelector("#secondStepParkingEnrollment")};this._stepCompletedHandler(e),this._generateLinkedAccountData()}_generateLinkedAccountData(){this._linkedAccountData=[{key:"bbva-multistep-parking-enrollment-second-step-linked-accound-phone",value:`•${this.phoneNumber.toString().slice(-4)}`},{key:"bbva-multistep-parking-enrollment-second-step-linked-accound-alias",value:this.alias}]}_linkedAccountBuilder(){return p`
      ${this._linkedAccountData.map((({key:t,value:e})=>p`
        <bbva-list-simple
          label="${this.t(t)}"
          description="${e}"
          class="listItem">
        </bbva-list-simple>
        `))}
    `}get _disabler(){return 0===(this.alias.trim().length&&this.phoneNumber.trim().length)}termsandConditionsStep(){return p`
      <bbva-expandable-step
        id="thirdStep"
        hide-padding-left
        hide-padding-right
        header="${this.t("bbva-multistep-parking-enrollment-third-step-header")}"
        edit-label="${this.t("bbva-multistep-parking-enrollment-third-step-edit-label")}"
        class="step-three"
        current-step-label="${`3 de ${this._steps.length}`}"
        total-steps="${this._steps.length}"
        step="3"
        @expandable-step-edit-step="${t=>{this._onStepEdit(t)}}">
        ${Mt({text:`${this.t("bbva-multistep-parking-enrollment-third-step-description")}`})}
        <bbva-list-file 
          icon="${X()}" 
          file-name="${this.t("bbva-multistep-parking-enrollment-third-step-file-name")}">
        </bbva-list-file> 
        <bbva-form-checkbox
          id="checkboxThirdStep"
          class="sideMargin"
          label="${this.t("bbva-multistep-parking-enrollment-third-step-checkbox-label")}"
          @change="${this._validateCheck}"
          required>
        </bbva-form-checkbox>
        <div class="footerButtonStep">
          <bbva-button-default 
            id="buttonTerms"
            ?disabled="${!this._isEnable}"
            @click="${t=>{this._stepCompletedHandler(t),this._genericDispatchEvent("step-terms-and-conditions-completed")}}">
  ${this.t("bbva-multistep-parking-enrollment-third-step-button")}
          </bbva-button-default>
        </div>
        <div class="summary" slot="summary">
          <bbva-list-info
            hide-padding-top
            hide-padding-bottom
            class="listInfo"
            icon="${G()}"
            icon-size="16">
            ${this.t("bbva-multistep-parking-enrollment-third-step-list-info")}
          </bbva-list-info>
        </div>
      </bbva-expandable-step>
    `}get _conditionsChecks(){const t=this.shadowRoot.querySelectorAll('[data-tag-name="bbva-form-checkbox"]');return Array.from(t)}_validateCheck(){this._isEnable=this._conditionsChecks.every((({checked:t})=>t))}_onAllComplete({detail:t}){this._allCompleted=t}get _expandableMultistep(){return this._multistep||(this._multistep=this.shadowRoot.querySelector('[data-tag-name="bbva-expandable-multistep"]')),this._multistep}get _buttonTermsAndConditions(){return this.shadowRoot.querySelector("#buttonTerms")}_onStepEdit({target:t}){const{id:e}=t;this._genericDispatchEvent("parking-enrollment-send-step",e)}reset(){this._expandableMultistep&&this._expandableMultistep.scroll(0,0),this._conditionsChecks.length&&this._conditionsChecks.forEach((t=>{t.checked=!1})),this.alias="",this.phoneNumber="",this._firstStepCompleted=!1,this._isEnable=!1,this._buttonTermsAndConditions.disabled=!0,this._restoreStepsInitialState(),this._itemSelectedIndex=0,this._oldItemSelectedIndex=0,this._linkedAccountData=[],this._allCompleted=!1,this._bannerHidden=!1}_restoreStepsInitialState(){const t=[];this._steps.forEach(((e,i)=>{this._openStep(i),this._toggleDisableStep(i,0!==i),t.push(i)})),this._expandableMultistep.stepsToReset=t}_openStep(t){this._steps[t].completed=!1,this._steps[t].removeAttribute("completed")}_toggleDisableStep(t,e){this._steps[t].disabled=e,this._steps[t].active=!e}_genericDispatchEvent(t,e){this.dispatchEvent(new CustomEvent(t,{bubbles:!0,composed:!0,detail:e}))}render(){return p`
    <bbva-expandable-multistep
      step-selector="[data-tag-name=\'bbva-expandable-step\']"
      id="multistepParkingEnrollment" 
      class="scrollable"
      @expandable-multistep-all-complete=${this._onAllComplete}>
      ${this.firstStepContent()}
      ${this.providers&&this.providers.length>1?this._optionalStep():""}
      ${this.secondStep()}
      ${this.termsandConditionsStep()}
      <div class="panel">
        <bbva-button-default
          id="lastButton"
          variant="positive"
          ?disabled="${!this._allCompleted}"
          @click="${()=>{this._genericDispatchEvent("parking-enrollment-register-account",!0),this._genericDispatchEvent("parking-enrollment-data-sent"),this._genericDispatchEvent("sending-terms-and-conditions")}}">
        ${this.t("bbva-multistep-parking-enrollment-expandable-multistep-button")}
        </bbva-button-default>
      </div>
    </bbva-expandable-multistep>
    `}}customElements.define(Ht.is,Ht);
