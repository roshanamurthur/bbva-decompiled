import{z as t,ap as e,L as i,cl as a,ax as o,ak as r,h as n,i as s,ar as l,a8 as c,a9 as d,ac as h,ad as b,ab as g,aa as p,a as v,bx as m,av as k}from"./952f98a9.js";var u=t`
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
`;class f extends(e(i)){static get is(){return"bbva-core-switch"}static get properties(){return{checked:{type:Boolean,reflect:!0},disabled:{type:Boolean,reflect:!0},form:{type:String},label:{type:String},name:{type:String,reflect:!0},radio:{type:Boolean},required:{type:Boolean,reflect:!0},tagOff:{type:String,attribute:"tag-off"},tagOn:{type:String,attribute:"tag-on"},value:{type:String},valueOff:{type:String,attribute:"value-off"},_formElementId:{type:String,attribute:!1}}}constructor(){super(),this._active=!1,this._formElementId=a(),this.checked=!1,this.name=`switch-${this._formElementId}`,this.radio=!1,this.value="",this.valueOff="",this._onClick=this.onClick.bind(this),this._onKeyUp=this.onKeyUp.bind(this),this._onKeyDown=this.onKeyDown.bind(this),this.addEventListener("click",this._onClick),this.addEventListener("keyup",this._onKeyUp),this.addEventListener("keydown",this._onKeyDown),o(this,"down",(()=>{this.disabled||(this.active=!0)})),o(this,"up",(()=>{this.active=!1})),this.addEventListener("blur",(()=>{this.active=!1}))}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.active&&(this.active=!1)}firstUpdated(t){super.firstUpdated&&super.firstUpdated(t),this._setInitialAttribute("role",this.radio?"button":"switch"),this.disabled||(this._setInitialAttribute("tabindex","0"),this._setInitialAttribute("aria-disabled","false")),this._formElements=this.shadowRoot.querySelector(".controls"),this._formElements&&this.appendChild(this._formElements),this.hasAttribute("autofocus")&&this.focus()}updated(t){super.updated&&super.updated(t),(t.has("checked")||t.has("radio"))&&(this.radio?this.removeAttribute("aria-checked"):this.setAttribute("aria-checked",this.checked.toString())),t.has("radio")&&this.setAttribute("role",this.radio?"button":"switch"),t.has("disabled")&&(this.setAttribute("aria-disabled",this.disabled.toString()),this.setAttribute("tabindex",this.disabled?"-1":"0"))}static get styles(){return[u,r("bbva-core-switch-shared-styles")]}get _labelledInput(){return n` <div class="container">${this._inputTemplate} ${this._labelTemplate}</div> `}get _inputTemplate(){return n`
      <span class="bg" aria-hidden="true">
        <span class="knob">
          <span class="knob-tie"></span>
        </span>

        ${this.tagOff?n` <span class="knob-tag">${this.tagOff}</span> `:""}
        ${this.tagOn?n` <span class="knob-tag">${this.tagOn}</span> `:""}
      </span>
    `}get _labelTemplate(){return n`
      <span class="label">
        <span class="sr-only" aria-live="${s(this.radio?"assertive":void 0)}">
          ${this.label} ${this._labelState}
        </span>
        <span class="slot-label"><slot></slot></span>
      </span>
    `}render(){return n` ${this._labelledInput} ${this._control} `}get value(){return this.radio&&!this.checked?this.valueOff:this._value}set value(t){const e=this._value;e!==t&&(this._value=t,this.requestUpdate("value",e))}get active(){return this._active}set active(t){t!==this._active&&(this._active=t,t?this.setAttribute("active",""):this.removeAttribute("active"))}get _labelState(){return this.checked?this.tagOn:this.tagOff}get _control(){return n`
      <span class="slot-control">
        <slot name="_control"></slot>
      </span>

      <div class="controls" slot="_control">
        ${this.radio?n`
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
                form="${s(this.form)}"
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
                form="${s(this.form)}"
              />
            `:n`
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
                form="${s(this.form)}"
              />
            `}
      </div>
    `}onClick(t){if(this.disabled)return t.preventDefault(),t.stopPropagation(),void t.stopImmediatePropagation();this._toggle()}onKeyUp(t){"Enter"!==t.key&&" "!==t.key||!this.active||(this.active=!1,this._toggle(),t.preventDefault(),t.stopPropagation())}onKeyDown(t){"Enter"!==t.key&&" "!==t.key||(this.active=!0,t.preventDefault(),t.stopPropagation())}_setInitialAttribute(t,e){this.hasAttribute(t)||this.setAttribute(t,e)}_onInput(t){t.preventDefault(),t.stopPropagation()}_onChange(t){t.preventDefault(),t.stopPropagation(),this.onClick(t)}_toggle(){this.checked=!this.checked,this._dispatchEvent("change"),this._dispatchEvent("input")}_dispatchEvent(t){this.dispatchEvent(new CustomEvent(t,{bubbles:!0}))}}var y=t`[ambient^=light] {
  --bbva-form-toggle-control-color: initial;
  --bbva-form-toggle-control-checked-color: initial;
  --bbva-form-toggle-knob-tie-color: initial;
  --bbva-form-toggle-knob-tie-checked-color: initial;
  --bbva-form-toggle-knob-tag-checked-color: initial;
  --bbva-form-toggle-knob-tag-unchecked-color: initial;
  --bbva-form-toggle-label-color: initial;
  --bbva-form-toggle-label-description-list-color: initial;
}
${(new l).mediaRules()}`;const _=new l;const $={dark:t`
    ${t`[ambient^=dark] {
  --bbva-form-toggle-control-color: var(--colorsPrimaryCoreLightened, ${c(d.primaryCoreLightened)});
  --bbva-form-toggle-control-checked-color: var(--colorsPrimaryCoreLightened, ${c(d.primaryCoreLightened)});
  --bbva-form-toggle-knob-tie-color: var(--colorsSecondary500, ${c(d.secondary500)});
  --bbva-form-toggle-knob-tie-checked-color: var(--colorsPrimaryMedium, ${c(d.primaryMedium)});
  --bbva-form-toggle-knob-tag-checked-color: var(--colorsPrimaryCoreLightened, ${c(d.primaryCoreLightened)});
  --bbva-form-toggle-knob-tag-unchecked-color: var(--colorsSecondary500, ${c(d.secondary500)});
  --bbva-form-toggle-label-color: var(--colorsPrimaryCoreLightened, ${c(d.primaryCoreLightened)});
  --bbva-form-toggle-label-description-list-color: var(--colorsPrimaryCoreLightened, ${c(d.primaryCoreLightened)});
}
${_.mediaRules()}`}
  `,light:t`
    ${y}
  `},w=new l;var x=t`:host {
  --_control-color: var(--bbva-form-toggle-control-color,var(--colorsSecondary500, ${c(d.secondary500)}));
  --_control-checked-color: var(--bbva-form-toggle-control-checked-color,var(--colorsPrimaryMedium, ${c(d.primaryMedium)}));
  --_knob-tie-color: var(--bbva-form-toggle-knob-tie-color,var(--colorsPrimaryCoreLightened, ${c(d.primaryCoreLightened)}));
  --_knob-tie-checked-color: var(--bbva-form-toggle-knob-tie-checked-color,var(--colorsPrimaryCoreLightened, ${c(d.primaryCoreLightened)}));
  --_knob-tag-checked: var(--bbva-form-toggle-knob-tag-checked-color,var(--colorsPrimaryMedium, ${c(d.primaryMedium)}));
  --_knob-tag-unchecked: var(--bbva-form-toggle-knob-tag-unchecked-color,var(--colorsPrimaryCoreLightened, ${c(d.primaryCoreLightened)}));
  --_knob-width: var(--bbva-form-toggle-control-width, 2.5rem);
  --_knob-height: var(--bbva-form-toggle-control-height, 1.5rem);
  --_knob-margin: var(--bbva-form-toggle-control-border, 1px);
  --_knob-tie-width: var(--bbva-form-toggle-control-tie-width, 1.375rem);
  --_label-description-list-color: var(--bbva-form-toggle-label-description-list-color, var(--colorsSecondary500, ${c(d.secondary500)}));
  display: inline-block;
  position: relative;
  font: inherit;
  box-sizing: border-box;
  cursor: pointer;
  font-size: var(--typographyTypeSmall, ${c(h.typeSmall)});
  line-height: var(--lineHeightTypeSmall, ${c(b.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${c(g.book.fontWeight)});
  color: var(--bbva-form-toggle-label-color, var(--colorsSecondary600, ${c(d.secondary600)}));
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
  padding: var(--bbva-form-toggle-container-padding, calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${c(p.spacer)}))) / 16) * 1rem) 0);
}
:host([variant^=list]) .container {
  padding: var(--bbva-form-toggle-list-container-padding, calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${c(p.spacer)}))) / 16) * 1rem) 0);
}
:host([variant=section]) .container {
  padding: var(--bbva-form-toggle-section-container-padding, calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${c(p.spacer)}))) / 16) * 1rem) 0);
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
:host([disabled-ellipsis]) .bg {
  align-self: flex-start;
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
  font-size: var(--typographyType2XSmall, ${c(h.type2XSmall)});
  line-height: var(--lineHeightType2XSmall, ${c(b.type2XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${c(g.medium.fontWeight)});
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
}
:host([variant=list]) .label {
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${c(p.spacer)}))) / 16) * 1rem);
}
:host([variant=list-right]) .label {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${c(p.spacer)}))) / 16) * 1rem);
}
:host([variant=section]) .label {
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${c(p.spacer)}))) / 16) * 1rem);
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${c(g.medium.fontWeight)});
}
.label-text {
  flex: auto;
  display: block;
}
.label-text:not(.no-ellipsis) {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.label-description {
  flex: none;
  font-size: var(--typographyType3XSmall, ${c(h.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${c(b.type3XSmall)});
  display: block;
  margin-left: auto;
}
:host([variant=list]) .label-description, :host([variant=list-right]) .label-description {
  color: var(--_label-description-list-color);
  font-size: var(--typographyTypeSmall, ${c(h.typeSmall)});
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
${w.mediaRules()}`;class S extends(v(f)){static get is(){return"bbva-form-toggle"}static get properties(){return{radio:{type:Boolean,reflect:!0},description:{type:String},disabledEllipsis:{type:Boolean,attribute:"disabled-ellipsis"}}}constructor(){super(),this.disabledEllipsis=!1}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._onChange=this._onChange.bind(this),this.addEventListener("change",this._onChange)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("change",this._onChange)}static get styles(){return[m(),x,$.light,$.dark,r("bbva-form-toggle-shared-styles")]}get _labelTemplate(){return n`
      <span class="label">
        <span class="sr-only" aria-live="${s(this.radio?"assertive":void 0)}">
          ${this.label} ${this._labelState}
        </span>
        <span class="label-text ${k({"no-ellipsis":this.disabledEllipsis})}">
          <slot></slot>
        </span>
        ${this.description?n` <span class="label-description">${this.description}</span> `:n``}
      </span>
    `}_onChange(){this.dispatchEvent(new CustomEvent("form-toggle-switch-change",{detail:{checked:this.checked,value:this.radio&&!this.checked?this.valueOff:this.value},bubbles:!0,composed:!0}))}}export{S as B,$ as b};
