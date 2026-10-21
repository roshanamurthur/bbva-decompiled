import{z as e,ar as t,a as r,an as o,L as a,bj as i,ak as s,h as c,a8 as l,a9 as n,aa as d,b4 as p,bV as h,b8 as b,g as m,ao as v,ap as g,ax as u,i as y,ac as f,ad as k,ab as x,al as _,ae as S,ag as $,bS as C,aN as L,bx as T,aV as w,aD as P,av as E,n as A,f as I}from"./952f98a9.js";import{e as z}from"./b42a85fd.js";var B=e`:host {
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
${(new t).mediaRules()}`;class D extends(r(o(a))){static get is(){return"bbva-expandable-multistep"}static get scopedElements(){return{"bbva-core-heading":i}}static get properties(){return{stepSelector:{type:String,attribute:"step-selector"},scrollingDelay:{type:Number,attribute:"scrolling-delay"},hideStepNumbers:{type:Boolean,attribute:"hide-step-numbers"},scrollAnimation:{type:Number,attribute:"scroll-animation"},scrollAnimationCompleted:{type:Number,attribute:"scroll-animation-completed"},startAnimationStep:{type:Number},finishAnimationStep:{type:Number},stepHeight:{type:String},minStepHeight:{type:String},hasAnimation:{type:Boolean,attribute:"has-animation"},_allCompleted:{type:Boolean,attribute:"all-completed",reflect:!0},stepsToReset:{type:Array}}}constructor(){super(),this._allCompleted=!1,this.stepSelector="bbva-expandable-step",this.scrollingDelay=1e3,this.scrollAnimation=600,this.startAnimationStep=100,this.finishAnimationStep=500,this.stepHeight="600px",this.minStepHeight="0px",this.scrollAnimationCompleted=900,this.hasAnimation=!1,this.hideStepNumbers=!1,this.stepsToReset=[],this._completedSteps=[]}static get styles(){return[B,s("bbva-expandable-multistep-shared-styles")]}render(){return c` <slot id="content"></slot> `}firstUpdated(){setTimeout((()=>{this._setupSteps(),this._bindListeners()}),20)}updated(e){e.has("stepsToReset")&&this.stepsToReset.length&&this.stepsToReset.forEach((e=>this._resetCompletedStep(e)))}_bindListeners(){this.addEventListener("expandable-step-edit-step",this._onEditStep),this.addEventListener("expandable-step-complete-change",this._onStepCompletedChanged)}get allCompleted(){return this._allCompleted}get _firstStep(){return this._steps[0]}get _lastStep(){return this._steps[this._totalSteps-1]}get _firstIncompletedStep(){return this._steps.filter((e=>!e.completed))[0]}_setupSteps(){this._steps=[...this.querySelectorAll(this.stepSelector)],this._totalSteps=this._steps.length;let e=0;this._steps.forEach(((t,r)=>{t.step=r-e,e+=t.hasAttribute("prefilled")?1:0,t.totalSteps=this._totalSteps-this._counterPrefilledSteps(),t.disabled=!0,t.hideStepNumber=this.hideStepNumbers||t.hideStepNumber,this._enableFirstIncompletedStep(t,r)})),this._setLastStepHeight()}_counterPrefilledSteps(){return this._steps.filter((e=>e.hasAttribute("prefilled"))).length}_enableFirstIncompletedStep(e,t){const r=t-1,o=this._steps[r],a=()=>{e.active=!0,e.disabled=!1};o?o.completed&&(a(),this._completedSteps.push(r),e.classList.toggle("after-prefilled",o.prefilled)):a()}_setLastStepHeight(){this._offsetHeight||(this._offsetHeight=document.body.offsetHeight),this._lastStep.style.height=`${this._offsetHeight}px`}_removeLastStepHeight(){this._lastStep.style.height=""}_onStepCompletedChanged(e){const t=e.detail,r=e.target.step;if(this._computeAllCompleted(),t){const e=this._steps[r];e.active=!1,this._scrollToStep(e,0),this._completedSteps.includes(r)||this._completedSteps.push(r)}}_scrollToStep(e,t=this.scrollingDelay,r=!1){this.classList.remove("scrollable");const o=null===t?this.scrollingDelay:t;setTimeout((()=>{this.hasAnimation&&r?this._scrollToTop(this.scrollAnimation,e.offsetTop,this.scrollTop):e.scrollIntoView({block:"nearest",behavior:"smooth"}),this._onScrollAnimationCompleted(e)}),o)}_scrollToTop(e,t,r){const o=t/2;let a=0,i=null;const s=c=>{if(null!==i){if(a+=Math.PI*(c-i)/e,a>=Math.PI)return void(this.scrollTop=t);const s=o-o*Math.cos(a);s>r&&(this.scrollTop=s)}i=c,window.requestAnimationFrame(s)};this.scrollTop!==t&&window.requestAnimationFrame(s)}_animationStep(e,t){const r=e;r.style.height=this.stepHeight,r.style["min-height"]=`${t}px`,r.classList.add("finished"),setTimeout((()=>{r.style.height=this.minStepHeight}),this.startAnimationStep),setTimeout((()=>{r.removeAttribute("style")}),this.finishAnimationStep)}_onScrollAnimationCompleted(e){if(!e.active){const t=this._firstIncompletedStep||this._firstStep;if(t.disabled=!0,this.hasAnimation){const t=e.offsetHeight;this._animationStep(e,t)}return setTimeout((()=>{t.active=!0}),this.scrollAnimationCompleted),void this._scrollToStep(t,null,!0)}setTimeout((()=>{e.disabled=!1}),this.scrollAnimationCompleted),this.classList.add("scrollable"),this.allCompleted&&setTimeout((()=>{this._removeLastStepHeight()}),this.scrollingDelay),this.dispatchEvent(new CustomEvent("expandable-multistep-scroll-animation-end",{detail:!0,bubbles:!0,composed:!0}))}_onEditStep(e){const t=e.detail+this._counterPrefilledSteps(),r=this._steps[t];r.active=!0,this._scrollToStep(r),this._steps.forEach(((e,r)=>{this._deactivateOtherSteps(e,r,t),this._disableNextIncompletedSteps(e,r,t),this._completeActiveStepsPreviouslyCompleted(e,r,t),this._forceDisabledStep(e,r)}))}_forceDisabledStep(e,t){e.disableOnPreviousStepEdit&&(e.completed=!1,e.disabled=!0,this._completedSteps=this._completedSteps.filter((e=>e!==t)),this._computeAllCompleted())}_deactivateOtherSteps(e,t,r){t!==r&&(e.active=!1)}_disableNextIncompletedSteps(e,t,r){!e.completed&&t>r&&(e.disabled=!0)}_completeActiveStepsPreviouslyCompleted(e,t,r){t!==r&&this._completedSteps.includes(t)&&(e.completed=!0)}_allCompletedChanged(e,t){t&&this._setLastStepHeight(),this.dispatchEvent(new CustomEvent("expandable-multistep-all-complete",{detail:e,bubbles:!0,composed:!0}))}_computeAllCompleted(){const e=this._allCompleted;this._allCompleted=this._steps.every((e=>e.completed)),this._allCompletedChanged(this._allCompleted,e)}_resetCompletedStep(e){if(this._completedSteps.includes(e)){const t=this._allCompleted;this._completedSteps=this._completedSteps.filter((t=>t!==e)),this._allCompleted=!1,this._allCompletedChanged(!1,t)}}}const V=new t;var F=e`:host {
  display: block;
  background-color: var(--bbva-expandable-step-dark-mode-background-color, var(--bbva-expandable-step-background-color, var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)})));
  color: var(--_expandable-step-default-color);
  position: relative;
  box-sizing: border-box;
  --_expandable-step-default-color: var(--bbva-expandable-step-dark-mode-default-color, var(--bbva-expandable-step-default-color, var(--colorsSecondary600, ${l(n.secondary600)})));
  --_expandable-step-current-step-color: var(--bbva-expandable-step-dark-mode-current-step-color, var(--bbva-expandable-step-current-step-color, var(--colorsSecondary500, ${l(n.secondary500)})));
  --_expandable-step-btn-edit-color: var(--bbva-expandable-step-dark-mode-button-edit-color, var(--bbva-expandable-step-button-edit-color, var(--colorsPrimarySubdued, ${l(n.primarySubdued)})));
  --_expandable-step-completed-color: var(--bbva-expandable-step-dark-mode-completed-color, var(--bbva-expandable-step-completed-color, var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)})));
  --_expandable-step-completed-step-border-color: var(--bbva-expandable-step-dark-mode-completed-step-border-color, var(--bbva-expandable-step-completed-step-border-color, var(--colorsPrimaryCoreLight, ${l(n.primaryCoreLight)})));
  --_expandable-step-prefilled-bg-color: var(--bbva-expandable-step-dark-mode-prefilled-background-color, var(--bbva-expandable-step-prefilled-background-color, var(--colorsPrimaryCoreDarkened, ${l(n.primaryCoreDarkened)})));
  --_expandable-step-prefilled-color: var(--bbva-expandable-step-dark-mode-prefilled-color, var(--bbva-expandable-step-prefilled-color, var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)})));
  --_expandable-step-completed-background-color: var(--bbva-expandable-step-dark-mode-completed-background-color, var(--bbva-expandable-step-completed-background-color, var(--colorsPrimaryCore, ${l(n.primaryCore)})));
  --_expandable-step-border-bottom-color: var(--bbva-expandable-step-dark-mode-border-bottom-color, var(--bbva-expandable-step-border-bottom-color, var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)})));
}
:host::before {
  content: "";
  display: block;
  position: absolute;
  top: -1rem;
  left: 0;
  width: 0;
  height: 0;
  border-bottom: 1rem solid var(--_expandable-step-border-bottom-color);
  border-left: 100vw solid transparent;
  visibility: hidden;
  transform: scaleY(0);
  transform-origin: bottom left;
  transition: transform 0.16s ease-in-out;
  will-change: transform;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.header {
  padding: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1em) 0;
  display: flex;
  justify-content: space-between;
  align-items: center;
  height: calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem);
  border-top: 1px solid transparent;
}

.heading {
  font-size: 0.9375rem;
}
.heading-label {
  font-weight: 500;
  text-transform: uppercase;
}

.current-step {
  font-style: italic;
  color: var(--_expandable-step-current-step-color);
}

.btn-edit {
  font-family: inherit;
  font-size: 0.9375rem;
  font-weight: 500;
  color: var(--_expandable-step-btn-edit-color);
  background-color: transparent;
  border: 0;
  margin: calc(((-1 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem);
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1em);
}

.default-content {
  opacity: 1;
  max-height: var(--bbva-expandable-step-default-content-max-height, var(--bbva-expandable-step-content-max-height, 1000px));
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1em);
}

.completed-content {
  opacity: 0;
  visibility: hidden;
  max-height: 0;
  transition: opacity var(--bbva-fast-transition, 0.2s);
}

[data-tag-name=bbva-divider] {
  --bbva-divider-color: var(--_expandable-step-completed-step-border-color);
}

:host([disabled]) > * {
  pointer-events: none;
  opacity: var(--bbva-expandable-step-disabled-opacity, 0.4);
}

:host([completed]) {
  overflow: hidden;
  background-color: var(--_expandable-step-completed-background-color);
  color: var(--_expandable-step-completed-color);
}
:host([completed]) .completed-content {
  opacity: 1;
  visibility: visible;
  max-height: var(--bbva-expandable-step-completed-content-max-height, var(--bbva-expandable-step-content-max-height, 1000px));
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1em);
}
:host([completed]) .default-content {
  opacity: 0;
  position: absolute;
  top: calc(((7 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem);
  padding-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1em);
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1em);
  left: 0;
  width: 100%;
}

:host([hide-padding-left]) .default-content {
  padding-left: 0;
}

:host([hide-padding-right]) .default-content {
  padding-right: 0;
}

:host([active]:not(:first-of-type))::before {
  visibility: visible;
  transform: scaleY(1);
}

:host([prefilled]) {
  background-color: var(--_expandable-step-prefilled-bg-color);
  color: var(--_expandable-step-prefilled-color);
}

:host([active]:not([completed])) {
  padding-bottom: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1em);
}

:host(.after-prefilled[active])::before {
  visibility: hidden;
}

:host(.after-prefilled[completed]) {
  --bbva-expandable-step-completed-step-border-color: transparent;
}

:host([completed][hide-padding-left]) .completed-content {
  padding-left: 0;
}

:host([completed][hide-padding-right]) .completed-content {
  padding-right: 0;
}

:host([completed][hide-padding-top]) .completed-content {
  padding-top: 0;
}

:host([completed][hide-padding-bottom]) .completed-content {
  padding-bottom: 0;
}

:host([completed].animation) {
  transition: all 1s linear;
  transition: color 0s linear;
}

:host([completed].animation.finished) {
  transition: all 0.5s linear;
  min-height: 7.5rem;
}
${V.mediaRules()}`;class H extends(r(o(a))){static get is(){return"bbva-expandable-step"}static get scopedElements(){return{"bbva-core-heading":i,"bbva-divider":p}}static get properties(){return{step:{type:Number},totalSteps:{type:Number,attribute:"total-steps"},completed:{type:Boolean,reflect:!0},completeOnEvent:{type:String,attribute:"expandable-step-complete-on-event"},disabled:{type:Boolean,reflect:!0},disabledTarget:{type:String,attribute:"disabled-target"},disabledTargetAttr:{type:String,attribute:"disabled-target-attr"},active:{type:Boolean,reflect:!0},prefilled:{type:Boolean,reflect:!0},header:{type:String},headingLevel:{type:Number,attribute:"heading-level"},currentStepLabel:{type:String,attribute:"current-step-label"},editLabel:{type:String,attribute:"edit-label"},hideStepNumber:{type:Boolean,attribute:"hide-step-number"},disableOnPreviousStepEdit:{type:Boolean,attribute:"disable-on-previous-step-edit"},hideDivider:{type:Boolean,attribute:"hide-divider"},hidePaddingTop:{type:Boolean,attribute:"hide-padding-top"},hidePaddingBottom:{type:Boolean,attribute:"hide-padding-bottom"},hidePaddingLeft:{type:Boolean,attribute:"hide-padding-left"},hidePaddingRight:{type:Boolean,attribute:"hide-padding-right"}}}constructor(){super(),this.completed=!1,this.completeOnEvent="complete",this.disabled=!1,this.active=!1,this.prefilled=!1,this.headingLevel=2,this.currentStepLabel="bbva-expandable-step-heading",this.editLabel="bbva-expandable-step-edit",this.hideStepNumber=!1,this.disabledTargetAttr="disabled",this.hideDivider=!1,this.hidePaddingTop=!1,this.hidePaddingBottom=!1,this.hidePaddingLeft=!1,this.hidePaddingRight=!1}firstUpdated(){this.addEventListener(this.completeOnEvent,this._onCompleteEventFired)}static get styles(){return[F,h,s("bbva-expandable-step-shared-styles")]}render(){return c`
      ${this.step>0&&this.completed&&!this.hideDivider?c`<bbva-divider data-tag-name="bbva-divider" size="fit"></bbva-divider>`:""}
      <div class="header">
        <bbva-core-heading
          data-tag-name="bbva-core-heading"
          .level="${this.headingLevel}"
          class="heading"
          id="heading"
        >
          <span class="heading-label" id="headingLabel">${this.header}</span>
          <span class="current-step" id="currentStep" ?hidden="${this._computeHiddenStep}">
            (${this.t(this.currentStepLabel,this._stepHeadingInterpolation)})
          </span>
        </bbva-core-heading>

        <button
          id="editButton"
          @click="${this.edit}"
          ?hidden="${this._computeHiddenEditButton}"
          class="btn-edit"
        >
          ${this.t(this.editLabel)}
        </button>
      </div>

      <div class="default-content" ?hidden="${this.completed}">
        <slot></slot>
      </div>

      <div class="completed-content">
        <slot name="summary"></slot>
      </div>
    `}updated(e){e.has("completed")&&(this._completedChanged(this.completed),this._onDisabledChanged(this.disabled,this.completed)),e.has("disabled")&&(this._disabledChanged(this.disabled),this._onDisabledChanged(this.disabled,this.completed)),e.has("prefilled")&&this._prefilledChanged(this.prefilled)}get _stepHeadingInterpolation(){return{step:this.step+1,total:this.totalSteps}}get _computeHiddenStep(){return!!this.hideStepNumber||this.completed}get _computeHiddenEditButton(){return this.prefilled||!this.completed||!this.editLabel}_completedChanged(e){this.dispatchEvent(new CustomEvent("expandable-step-complete-change",{detail:e,bubbles:!0,composed:!0}))}_disabledChanged(e){const t=this.querySelector(this.disabledTarget);if(t){t[(e?"set":"remove")+"Attribute"](this.disabledTargetAttr,e)}this.dispatchEvent(new CustomEvent("expandable-step-disable-change",{detail:e,bubbles:!0,composed:!0}))}_prefilledChanged(e){e&&(this.completed=!0)}_onDisabledChanged(e,t){e&&t&&(this.disabled=!1)}_onCompleteEventFired(e){e.stopPropagation(),this.completed=!0}edit(){this.prefilled||(this.completed=!1,this.active=!0,this.dispatchEvent(new CustomEvent("expandable-step-edit-step",{detail:this.step,bubbles:!0,composed:!0})))}}m("colors.cool100"),m("colors.secondary400"),m("colors.primarySubdued"),m("colors.primaryCoreLightened"),m("colors.primaryCoreLight"),m("colors.cool70"),m("colors.primaryCoreLightened"),m("colors.cool70"),m("colors.cool90"),m("colors.primaryCoreLightened");var N=e`
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
`;class O extends(v(g(a))){static get properties(){return{disabled:{type:Boolean},value:{type:String},checked:{type:Boolean},indeterminate:{type:Boolean},required:{type:Boolean},name:{type:String}}}constructor(){super(),this.checked=!1,this.value="on",this.__active=!1,this._onClick=this.onClick.bind(this),this.addEventListener("click",this._onClick),this._onKeyUp=this.onKeyUp.bind(this),this._onKeyDown=this.onKeyDown.bind(this),this.addEventListener("keyup",this._onKeyUp),this.addEventListener("keydown",this._onKeyDown),u(this,"down",(()=>{!this.disabled&&(this.active=!0)})),u(this,"up",(()=>{this.active=!1})),this.addEventListener("blur",(()=>{this.active=!1}))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.active&&(this.active=!1)}firstUpdated(e){super.firstUpdated&&super.firstUpdated(e),this._setInitialAttribute("role","checkbox"),this.disabled||(this._setInitialAttribute("tabindex","0"),this._setInitialAttribute("aria-disabled","false")),this.hasAttribute("autofocus")&&this.focus()}updated(e){super.updated&&super.updated(e),(e.has("checked")||e.has("indeterminate"))&&(this.indeterminate?this.setAttribute("aria-checked","mixed"):this.setAttribute("aria-checked",this.checked.toString())),e.has("disabled")&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.setAttribute("tabindex",this.disabled?"-1":"0"))}get checked(){return this._checked}set checked(e){const t=this.checked;e!==t&&(this._checked=e,e&&this.indeterminate&&(this.indeterminate=!1),this.requestUpdate("checked",t))}get indeterminate(){return this._indeterminate}set indeterminate(e){const t=this.indeterminate;e!==t&&(this._indeterminate=e,e&&(this.checked=!1),this.requestUpdate("indeterminate",t))}get active(){return this.__active}set active(e){e!==this.__active&&(this.__active=e,e?this.setAttribute("active",""):this.removeAttribute("active"),this.dispatchEvent(new CustomEvent("active-change",{bubbles:!0,detail:{value:this.__active}})))}static get styles(){return[N,s("bbva-core-checkbox-shared-styles")]}render(){return c` ${this._labelledInput} ${this._checkbox} `}get _labelledInput(){return c` <div class="container">${this._inputTemplate} ${this._labelTemplate}</div> `}get _inputTemplate(){return c`
      <slot name="input-template">
        <span class="box">
          <span class="check"></span>
        </span>
      </slot>
    `}get _labelTemplate(){return c`
      <span class="label">
        <slot></slot>
      </span>
    `}get _checkbox(){return this._formAssociated?c`
          <span class="slot-control">
            <slot name="_checkbox"></slot>
          </span>

          <input
            aria-hidden="true"
            ?checked="${this.checked}"
            ?disabled="${this.disabled}"
            form="${y(this.form)}"
            style="position: absolute; opacity: 0; pointer-events: none; z-index: -1;"
            id="${this._formElementId}"
            .indeterminate="${this.indeterminate}"
            name="${y(this.name)}"
            ?required="${this.required}"
            slot="_checkbox"
            tabindex="-1"
            type="checkbox"
            .value="${this.value}"
            @change="${this._onChange}"
            @input="${this._onInput}"
          />
        `:""}_setInitialAttribute(e,t){this.hasAttribute(e)||this.setAttribute(e,t)}_dispatchEvent(e){this.dispatchEvent(new CustomEvent(e,{bubbles:!0}))}_onInput(e){e.preventDefault(),e.stopPropagation()}_onChange(e){e.preventDefault(),e.stopPropagation(),this.onClick(e)}_toggle(){this.checked=!this.checked,this.dispatchEvent(new CustomEvent("change",{bubbles:!0})),this.dispatchEvent(new CustomEvent("input",{bubbles:!0}))}onClick(e){if(this.disabled)return e.preventDefault(),e.stopPropagation(),void e.stopImmediatePropagation();this._toggle()}onKeyUp(e){"Enter"!==e.key&&" "!==e.key||!this.active||(this.active=!1,this._toggle(),e.preventDefault(),e.stopPropagation())}onKeyDown(e){const{key:t}=e;"Enter"!==t&&" "!==t||(this.active=!0,e.preventDefault(),e.stopPropagation())}}const M=new t;var q=e`:host {
  --_form-checkbox-readonly-color: var(--bbva-form-checkbox-dark-mode-readonly-color, var(--bbva-form-checkbox-readonly-color, var(--colorsSecondary500, ${l(n.secondary500)})));
  --_form-checkbox-border-color: var(--bbva-form-checkbox-dark-mode-checkbox-border-color, var(--bbva-form-checkbox-checkbox-border-color, var(--colorsSecondary500, ${l(n.secondary500)})));
  --_form-checkbox-bg-color: var(--bbva-form-checkbox-dark-mode-checkbox-bg-color, var(--bbva-form-checkbox-checkbox-bg-color, var(--colorsSecondary100, ${l(n.secondary100)})));
  --_form-checkbox-check-color: var(--bbva-form-checkbox-dark-mode-check-color, var(--bbva-form-checkbox-check-color, var(--colorsPrimaryCore, ${l(n.primaryCore)})));
  --_form-checkbox-error-color: var(--bbva-form-checkbox-dark-mode-error-color, var(--bbva-form-checkbox-error-color, var(--colorsTertiaryType1Dark, ${l(n.tertiaryType1Dark)})));
  --_form-checkbox-error-bg-color: var(--bbva-form-checkbox-dark-mode-error-bg-color, var(--bbva-form-checkbox-error-bg-color, var(--colorsTertiaryType5Lightened, ${l(n.tertiaryType5Lightened)})));
  --_form-checkbox-error-icon-color: var(--bbva-form-checkbox-dark-mode-error-icon-color, var(--bbva-form-checkbox-error-icon-color, var(--colorsTertiaryType1Dark, ${l(n.tertiaryType1Dark)})));
  --_form-checkbox-variant-amount-clip-color: var(--bbva-form-checkbox-dark-mode-variant-amount-clip-color, var(--bbva-form-checkbox-variant-amount-clip-color, var(--colorsSecondary500, ${l(n.secondary500)})));
  --_form-checkbox-variant-icon-clip-color: var(--bbva-form-checkbox-dark-mode-variant-icon-clip-color, var(--bbva-form-checkbox-variant-icon-clip-color, var(--colorsSecondary400, ${l(n.secondary400)})));
  --_form-checkbox-variant-card-description-color: var(--bbva-form-checkbox-dark-mode-variant-card-description-color, var(--bbva-form-checkbox-variant-card-description-color, var(--colorsSecondary600, ${l(n.secondary600)})));
  --_form-checkbox-label-gap: var(--bbva-form-checkbox-label-gap, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem));
  --_form-checkbox-help-icon-color: var(--bbva-form-checkbox-dark-mode-help-icon-color, var(--bbva-form-checkbox-help-icon-color, var(--colorsPrimaryMedium, ${l(n.primaryMedium)})));
  --_form-checkbox-label-out-color: var(--bbva-form-checkbox-dark-mode-label-out-color, var(--bbva-form-checkbox-label-out-color, var(--colorsSecondary600, ${l(n.secondary600)})));
  display: block;
  position: relative;
  box-sizing: border-box;
  cursor: default;
  font-size: var(--typographyTypeSmall, ${l(f.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${l(k.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${l(x.book.fontWeight)});
  color: var(--bbva-form-checkbox-dark-mode-color, var(--bbva-form-checkbox-color, var(--colorsSecondary600, ${l(n.secondary600)})));
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
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem) 0;
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
  padding-top: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem);
}

.label-out-text {
  font-weight: var(--bbva-form-checkbox-label-out-weight, var(--fontFacePrimaryMediumFontWeight, ${l(x.medium.fontWeight)}));
  color: var(--_form-checkbox-label-out-color);
}

.label-out {
  display: flex;
  align-items: center;
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem);
}

.label {
  display: block;
}

.description {
  display: block;
  margin-top: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem);
  font-size: var(--typographyTypeSmall, ${l(f.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${l(k.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${l(x.book.fontWeight)});
}
.description [data-tag-name=bbva-clip-entities] {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem);
}

.error {
  display: flex;
  align-items: center;
}
.error-icon {
  width: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem);
  height: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem);
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem);
  color: var(--_form-checkbox-error-icon-color);
}
.error-message {
  font-size: var(--typographyType3XSmall, ${l(f.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${l(k.type3XSmall)});
}

.help-icon {
  color: var(--_form-checkbox-help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem);
}

.clip {
  flex: none;
  display: flex;
  align-items: center;
  height: calc(((4 * var(--gridSpacerVariant, var(--gridSpacer, ${l(d.spacer)}))) / 16) * 1rem);
}

:host([variant=amount]) .clip {
  color: var(--_form-checkbox-variant-amount-clip-color);
}

:host([variant=icon]) .clip,
:host([variant=icon-bold]) .clip {
  color: var(--_form-checkbox-variant-icon-clip-color);
}

:host([variant=icon-bold]) {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${l(x.medium.fontWeight)});
}

:host([variant=card]) .description {
  font-weight: var(--fontFacePrimaryBookItalicFontWeight, ${l(x.bookItalic.fontWeight)});
  font-style: var(--fontFacePrimaryBookItalicFontStyle, ${l(x.bookItalic.fontStyle)});
  color: var(--_form-checkbox-variant-card-description-color);
  display: flex;
}
:host([variant=card]) .description ::slotted([data-tag-name=bbva-badge-default]) {
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
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${l(x.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${l(x.medium.fontStyle)});
}
${M.mediaRules()}`;const R=new t;var W=e`[ambient^=light] {
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
  --bbva-form-checkbox-checkbox-bg-color: var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)});
}
${R.mediaRules()}`;const U=new t;var K=e`[ambient^=dark] {
  --bbva-form-checkbox-color: var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)});
  --bbva-form-checkbox-readonly-color: var(--colorsSecondary300, ${l(n.secondary300)});
  --bbva-form-checkbox-checkbox-border-color: var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)});
  --bbva-form-checkbox-checkbox-bg-color: #0a5393;
  --bbva-form-checkbox-check-color: var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)});
  --bbva-form-checkbox-error-color: var(--colorsTertiaryType1Dark, ${l(n.tertiaryType1Dark)});
  --bbva-form-checkbox-error-bg-color: var(--colorsTertiaryType5Lightened, ${l(n.tertiaryType5Lightened)});
  --bbva-form-checkbox-error-icon-color: var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)});
  --bbva-form-checkbox-variant-amount-clip-color: var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)});
  --bbva-form-checkbox-variant-icon-clip-color: var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)});
  --bbva-form-checkbox-variant-card-description-color: var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)});
  --bbva-form-checkbox-label-out-color: var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)});
  --bbva-form-checkbox-help-icon-color: var(--colorsPrimaryCoreLightened, ${l(n.primaryCoreLightened)});
}

[ambient^=dark100] {
  --bbva-form-checkbox-checkbox-bg-color: var(--colorsPrimaryCoreLight, ${l(n.primaryCoreLight)});
}

[ambient^=dark400] {
  --bbva-form-checkbox-checkbox-bg-color: var(--colorsPrimaryCoreLight, ${l(n.primaryCoreLight)});
}
${U.mediaRules()}`;const j={dark:e`
    ${_.dark}
    ${K}
  `,light:e`
    ${_.light}
    ${W}
  `};class X extends(r(o(O))){static get is(){return"bbva-form-checkbox"}static get scopedElements(){return{"bbva-clip-entities":S,"bbva-core-icon":z,"bbva-text":$}}static get properties(){return{checkIcon:{type:String,attribute:"check-icon"},checkIconSize:{type:String,attribute:"check-icon-size"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},invalid:{type:Boolean},readonly:{type:Boolean},checked:{type:Boolean,reflect:!0},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"},notForm:{type:Boolean,attribute:"not-form"},help:{type:Boolean},label:{type:String},hideLabel:{type:Boolean,attribute:"hide-label"},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},entity:{type:String},entityText:{type:String,attribute:"entity-text"},entitySize:{type:String,attribute:"entity-size"}}}constructor(){super(),this.checkIcon=C(),this.checkIconSize=24,this.errorIcon=L(),this.errorIconSize=16,this.optionalLabel="",this.notForm=!1,this.labelMedium=!1}updated(e){super.updated&&super.updated(e),e.has("readonly")&&this.setAttribute("aria-readonly",this.readonly.toString()),e.has("required")&&this.setAttribute("aria-required",this.required.toString()),e.has("invalid")&&this.setAttribute("aria-invalid",this.invalid.toString()),e.has("checked")&&!e.has("invalid")&&(this.invalid=!1),e.has("checked")&&void 0!==e.get("checked")&&this._dispatchEvent("change")}static get styles(){return[T(),q,s("bbva-form-checkbox-shared-styles"),j.dark,j.light]}static renderIf(e,t){return e?c` ${t} `:w}get _inputTemplate(){return c`
      <span class="checkbox">
        <bbva-core-icon
          class="checkbox-check"
          .icon="${this.checkIcon}"
          .size="${this.checkIconSize}"
        ></bbva-core-icon>
      </span>
    `}get _labelOut(){return X.renderIf(this.labelOut,c`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text="${this.required?`${this.labelOut}`:`${this.labelOut} ${this._optional}`}"
            size="S"
          >
          </bbva-text>
          ${X.renderIf(this.help,c`
              <bbva-core-icon
                id="help"
                @click="${this._helpClicked}"
                class="help-icon"
                icon="${P()}"
              >
              </bbva-core-icon>
            `)}
        </div>
      `)}get _checkOptional(){return this.labelOut||this.required||this.notForm?"":this._optional}get _optional(){return this.optionalLabel||this.t("bbva-form-checkbox-optional-label")}get _labelTemplate(){return c`
      <span class="content">
        <span class="main">
          <span
            class=${E({label:!0,medium:this.labelMedium,"sr-only":this.hideLabel})}
          >
            ${this.label} ${this._checkOptional}
          </span>
          <span class="description">
            ${this.entity&&"small"===this.entitySize?c`
                  <bbva-clip-entities size="${this.entitySize}" entity="${this.entity}">
                    ${this.entityText}
                  </bbva-clip-entities>
                `:w}
            <slot name="description"></slot>
          </span>
          ${X.renderIf(this.invalid&&this.errorMessage,c`
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
          ${this.entity&&"medium"===this.entitySize?c`
                <bbva-clip-entities size="${this.entitySize}" entity="${this.entity}">
                  ${this.entityText}
                </bbva-clip-entities>
              `:c` <slot name="clip"></slot> `}
        </span>
      </span>
    `}_toggle(){this.readonly||(this.checked=!this.checked,this._dispatchEvent("input"))}_helpClicked(e){e.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-checkbox-help-click",{bubbles:!0,composed:!0}))}render(){return c` ${this._labelOut} ${this._labelledInput} ${this._checkbox} `}}m("colors.cool20"),m("colors.cool20"),m("colors.cool70"),m("colors.primaryMediumLight"),m("colors.tertiaryType1Light"),m("colors.cool60"),m("colors.tertiaryType1Light"),m("colors.secondary500"),m("colors.secondary400"),m("colors.secondary600"),m("colors.primarySubdued"),m("colors.primaryCoreLightened"),m("colors.primaryCoreLightened");export{D as B,H as a,j as b,X as c};
