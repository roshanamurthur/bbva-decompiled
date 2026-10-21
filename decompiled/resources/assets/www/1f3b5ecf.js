import{z as o,a8 as t,ac as e,ad as r,ab as a,bp as i,an as n,aS as c,cr as l,ak as b,h as m,i as s,L as g}from"./952f98a9.js";import{R as d,S as h,u as v,E as f,T as k,z as p,D as u,a1 as y,v as _,x as S,H as w,G as $,a2 as x,I as F,w as O}from"./216055dc.js";var A=o`
:host {
  --_form-toggle-control-color:
    var(--bbva-form-toggle--_ambient--control-color,
      var(--bbva-form-toggle--custom--primary-ambient--control-color,
        ${d("colorPrimaryFormSwitchBackgroundOff",h)}));
  --_form-toggle-control-checked-color:
    var(--bbva-form-toggle--_ambient--control-checked-color,
      var(--bbva-form-toggle--custom--primary-ambient--control-checked-color,
        ${d("colorPrimaryFormSwitchBackgroundOn",h)}));
  --_form-toggle-knob-tie-color:
    var(--bbva-form-toggle--_ambient--knob-tie-color,
      var(--bbva-form-toggle--custom--primary-ambient--knob-tie-color,
        ${d("colorPrimaryFormSwitchHandleOff",h)}));
  --_form-toggle-knob-tie-checked-color:
    var(--bbva-form-toggle--_ambient--knob-tie-checked-color,
      var(--bbva-form-toggle--custom--primary-ambient--knob-tie-checked-color,
        ${d("colorPrimaryFormSwitchHandleOn",h)}));
  --_form-toggle-knob-container-pressed-color:
    var(--bbva-form-toggle--_ambient--knob-container-pressed-color,
      var(--bbva-form-toggle--custom--primary-ambient--knob-container-pressed-color,
        ${d("colorPrimarySurfaceAmbientPressed",h)}));
  --_form-toggle-knob-tie-icon-color:
    var(--bbva-form-toggle--_ambient--knob-tie-icon-color,
      var(--bbva-form-toggle--custom--primary-ambient--knob-tie-icon-color,
        ${d("colorPrimaryFormSwitchBackgroundOff",h)}));
  --_form-toggle-knob-tie-icon-checked-color:
    var(--bbva-form-toggle--_ambient--knob-tie-icon-checked-color,
      var(--bbva-form-toggle--custom--primary-ambient--knob-tie-icon-checked-color,
        ${d("colorPrimaryFormSwitchBackgroundOn",h)}));
  --_form-toggle-focus-border-color: var(--bbva-form-toggle--_ambient--focus-border-color,
    var(--bbva-form-toggle--custom--primary-ambient--focus-border-color,
      ${d("colorPrimarySurfaceAmbientFocus",h)}));
}
`;const B=o`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-toggle--_ambient--control-color: initial;
    --bbva-form-toggle--_ambient--control-checked-color: initial;
    --bbva-form-toggle--_ambient--knob-tie-color: initial;
    --bbva-form-toggle--_ambient--knob-tie-checked-color: initial;
    --bbva-form-toggle--_ambient--knob-container-pressed-color: initial;
    --bbva-form-toggle--_ambient--knob-tie-icon-color: initial;
    --bbva-form-toggle--_ambient--knob-tie-icon-checked-color: initial;
    --bbva-form-toggle--_ambient--focus-border-color: initial;
  }
`,P=o`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-toggle--_ambient--control-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--control-color,
      ${d("colorPrimaryAltFormSwitchBackgroundOff",h)}
    );

    --bbva-form-toggle--_ambient--control-checked-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--control-checked-color,
      ${d("colorPrimaryAltFormSwitchBackgroundOn",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--knob-tie-color,
      ${d("colorPrimaryAltFormSwitchHandleOff",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-checked-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--knob-tie-checked-color,
      ${d("colorPrimaryAltFormSwitchHandleOn",h)}
    );

    --bbva-form-toggle--_ambient--knob-container-pressed-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--knob-container-pressed-color,
      ${d("colorPrimaryAltSurfaceAmbientPressed",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-icon-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--knob-tie-icon-color,
      ${d("colorPrimaryAltFormSwitchBackgroundOff",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-icon-checked-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--knob-tie-icon-checked-color,
      ${d("colorPrimaryAltFormSwitchBackgroundOn",h)}
    );

    --bbva-form-toggle--_ambient--focus-border-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--focus-border-color,
      ${d("colorPrimaryAltSurfaceAmbientFocus",h)}
    );
  }
`,C=o`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-toggle--_ambient--control-color: var(
      --bbva-form-toggle--custom--secondary-ambient--control-color,
      ${d("colorSecondaryFormSwitchBackgroundOff",h)}
    );

    --bbva-form-toggle--_ambient--control-checked-color: var(
      --bbva-form-toggle--custom--secondary-ambient--control-checked-color,
      ${d("colorSecondaryFormSwitchBackgroundOn",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-color: var(
      --bbva-form-toggle--custom--secondary-ambient--knob-tie-color,
      ${d("colorSecondaryFormSwitchHandleOff",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-checked-color: var(
      --bbva-form-toggle--custom--secondary-ambient--knob-tie-checked-color,
      ${d("colorSecondaryFormSwitchHandleOn",h)}
    );

    --bbva-form-toggle--_ambient--knob-container-pressed-color: var(
      --bbva-form-toggle--custom--secondary-ambient--knob-container-pressed-color,
      ${d("colorSecondarySurfaceAmbientPressed",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-icon-color: var(
      --bbva-form-toggle--custom--secondary-ambient--knob-tie-icon-color,
      ${d("colorSecondaryFormSwitchBackgroundOff",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-icon-checked-color: var(
      --bbva-form-toggle--custom--secondary-ambient--knob-tie-icon-checked-color,
      ${d("colorSecondaryFormSwitchBackgroundOn",h)}
    );

    --bbva-form-toggle--_ambient--focus-border-color: var(
      --bbva-form-toggle--custom--secondary-ambient--focus-border-color,
      ${d("colorSecondarySurfaceAmbientFocus",h)}
    );
  }
`,E=o`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-toggle--_ambient--control-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--control-color,
      ${d("colorSecondaryAltFormSwitchBackgroundOff",h)}
    );

    --bbva-form-toggle--_ambient--control-checked-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--control-checked-color,
      ${d("colorSecondaryAltFormSwitchBackgroundOn",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--knob-tie-color,
      ${d("colorSecondaryAltFormSwitchHandleOff",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-checked-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--knob-tie-checked-color,
      ${d("colorSecondaryAltFormSwitchHandleOn",h)}
    );

    --bbva-form-toggle--_ambient--knob-container-pressed-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--knob-container-pressed-color,
      ${d("colorSecondaryAltSurfaceAmbientPressed",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-icon-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--knob-tie-icon-color,
      ${d("colorSecondaryAltFormSwitchBackgroundOff",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-icon-checked-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--knob-tie-icon-checked-color,
      ${d("colorSecondaryAltFormSwitchBackgroundOn",h)}
    );

    --bbva-form-toggle--_ambient--focus-border-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--focus-border-color,
      ${d("colorSecondaryAltSurfaceAmbientFocus",h)}
    );
  }
`;const H=v([Object.freeze({__proto__:null,primary:B,primaryAlt:P,secondary:C,secondaryAlt:E}),f,k,p,u,y]),T=Object.values(H);var z=o`
:host {
  --_form-toggle-knob-width: var(--bbva-form-toggle-control-width, 2.5rem);
  --_form-toggle-knob-height: var(--bbva-form-toggle-control-height, 1.5rem);
  --_form-toggle-knob-margin: var(--bbva-form-toggle-control-border, 0.0625rem);
  --_form-toggle-knob-tie-width: var(--bbva-form-toggle-control-tie-width, 1.25rem);
  --_form-toggle-knob-tie-height: var(--bbva-form-toggle-control-tie-height, 1.25rem);
  --_form-toggle-knob-icon-width: var(--bbva-form-toggle-icon-control-width, 3.75rem);
  --_form-toggle-knob-icon-height: var(--bbva-form-toggle-icon-control-height, 2.5rem);
  --_form-toggle-knob-icon-margin: var(--bbva-form-toggle-icon-control-border, 0.125rem);
  --_form-toggle-knob-icon-radius: var(--bbva-form-toggle-icon-control-radius, 1.25rem);
  --_form-toggle-knob-tie-icon-width: var(--bbva-form-toggle-icon-control-tie-width, 2.25rem);
  position: relative;
  display: inline-block;
  width: 100%;
  box-sizing: border-box;
  align-items: center;
  cursor: pointer;
  font: inherit;
  font-size: var(--typographyTypeSmall, ${t(e.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${t(a.book.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${t(r.typeSmall)});
}
:host [data-tag-name=bbva-type-icon] {
  --bbva-type-icon--_ambient--color: var(--_form-toggle-knob-tie-icon-color);
}

:host([focus-visible]) {
  outline: none;
}

:host(:focus-visible) .container {
  outline: 0.125rem solid var(--_form-toggle-focus-border-color);
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

:host([radio]) {
  --_form-toggle-knob-width: var(--bbva-form-toggle-radio-control-width, 4.6875rem);
  --_form-toggle-knob-tie-width: var(--bbva-form-toggle-radio-control-tie-width, 2.25rem);
}

:host([radio][variant=long]) {
  --_form-toggle-knob-width: var(--bbva-form-toggle-radio-long-control-width, 5.5rem);
  --_form-toggle-knob-tie-width: var(--bbva-form-toggle-radio-long-control-tie-width, 2.6875rem);
}

:host([data-tag-name=bbva-type-icon]) {
  --bbva-type-icon--_ambient--color: var(--_form-toggle-knob-tie-icon-checked-color);
}

:host([variant=list-icon]),
:host([variant=right-icon]) {
  display: block;
}

:host([aria-disabled=true]) {
  opacity: 1;
}

.container {
  display: flex;
  min-height: 2.5rem;
  align-items: center;
  padding-top: var(--bbva-form-toggle-list-container-padding, 0.5rem);
  padding-bottom: var(--bbva-form-toggle-list-container-padding, 0.5rem);
}
.container[variant=icon] {
  min-height: 3.5rem;
}

.container:active, .container:hover {
  background-color: var(--_form-toggle-knob-container-pressed-color);
}

.bg {
  position: relative;
  display: flex;
  overflow: hidden;
  width: var(--_form-toggle-knob-width);
  height: var(--_form-toggle-knob-height);
  flex: none;
  flex-wrap: nowrap;
  justify-content: space-between;
  border-radius: 0.8125rem;
  background-color: var(--_form-toggle-control-color);
}
:host([radio]) .bg {
  background-color: var(--_form-toggle-control-checked-color);
}
:host([checked]) .bg {
  background-color: var(--_form-toggle-control-checked-color);
}
:host([checked]) .bg [data-tag-name=bbva-type-icon] {
  fill: var(--_form-toggle-knob-tie-icon-checked-color);
}
:host([disabled-ellipsis]) .bg {
  align-self: flex-start;
}

.knob {
  position: absolute;
  top: var(--_form-toggle-knob-margin);
  right: var(--_form-toggle-knob-margin);
  bottom: var(--_form-toggle-knob-margin);
  left: var(--_form-toggle-knob-margin);
  display: flex;
  align-items: center;
  transition: transform 0.2s;
}
:host([checked]) .knob {
  transform: translateX(calc(100% - var(--_form-toggle-knob-tie-width)));
}
.knob-tie {
  display: flex;
  width: var(--_form-toggle-knob-tie-width);
  height: var(--_form-toggle-knob-tie-height);
  align-items: center;
  justify-content: center;
  border-radius: 0.8125rem;
  background-color: var(--_form-toggle-knob-tie-color);
}
:host([radio]) .knob-tie {
  background-color: var(--_form-toggle-knob-tie-checked-color);
}
:host([checked]) .knob-tie {
  background-color: var(--_form-toggle-knob-tie-checked-color);
}
.knob-tag {
  position: relative;
  display: flex;
  width: 50%;
  align-items: center;
  justify-content: center;
  margin-top: 0.0625rem;
  font-size: var(--typographyType2XSmall, ${t(e.type2XSmall)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(a.medium.fontWeight)});
  line-height: var(--lineHeightType2XSmall, ${t(r.type2XSmall)});
}
.knob-tag, :host([checked]) .knob-tag ~ .knob-tag {
  color: var(--_form-toggle-knob-tag-checked);
}
:host([checked]) .knob-tag, .knob-tag ~ .knob-tag {
  color: var(--_form-toggle-knob-tag-unchecked);
}

:host([variant=icon]) .bg,
:host([variant=list-icon]) .bg,
:host([variant=right-icon]) .bg {
  width: var(--_form-toggle-knob-icon-width);
  height: var(--_form-toggle-knob-icon-height);
  border-radius: 1.25rem;
}
:host([variant=icon]) .bg .knob,
:host([variant=list-icon]) .bg .knob,
:host([variant=right-icon]) .bg .knob {
  top: var(--_form-toggle-knob-icon-margin);
  right: var(--_form-toggle-knob-icon-margin);
  bottom: var(--_form-toggle-knob-icon-margin);
  left: var(--_form-toggle-knob-icon-margin);
}
:host([variant=icon]) .bg .knob-tie,
:host([variant=list-icon]) .bg .knob-tie,
:host([variant=right-icon]) .bg .knob-tie {
  display: flex;
  width: var(--_form-toggle-knob-tie-icon-width);
  height: 100%;
  align-items: center;
  justify-content: center;
  border-radius: 1.25rem;
}

:host([variant=icon][checked]) .bg .knob,
:host([variant=list-icon][checked]) .bg .knob,
:host([variant=right-icon][checked]) .bg .knob {
  transform: translateX(calc(100% - var(--_form-toggle-knob-tie-icon-width)));
}
:host([variant=icon][checked]) .bg .knob-tie,
:host([variant=list-icon][checked]) .bg .knob-tie,
:host([variant=right-icon][checked]) .bg .knob-tie {
  background-color: var(--_form-toggle-knob-tie-checked-color);
  color: var(--_form-toggle-control-checked-color);
}

.label {
  display: flex;
  min-width: 0;
  flex: auto;
  align-items: center;
}
.label [data-tag-name=bbva-type-amount] {
  width: 100%;
  padding-left: 0.5rem;
}
.label [data-tag-name=bbva-type-text] {
  width: 100%;
  padding-left: 0.5rem;
}
.label :host([variant=list-icon]) {
  display: block;
  padding-left: 0.5rem;
}
.label-text {
  display: block;
  flex: auto;
}
.label-text:not(.no-ellipsis) {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.label-description {
  display: block;
  flex: none;
  margin-left: auto;
  font-size: var(--typographyType3XSmall, ${t(e.type3XSmall)});
  line-height: var(--lineHeightType3XSmall, ${t(r.type3XSmall)});
}
.label-description :host([variant=list-icon]) {
  font-size: var(--typographyTypeSmall, ${t(e.typeSmall)});
}

[data-tag-name=bbva-type-text] {
  padding-right: 0.5rem;
}

:host([variant=right]) .bg,
:host([variant=right-icon]) .bg {
  order: 2;
}

:host([divider]) [data-tag-name=bbva-divider-default] {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100%;
}
`;const L=i();class j extends(_(n(c(l)))){static get is(){return"bbva-form-toggle-switch"}static get scopedElements(){const o=[S,w,$,x,F];return j.scopedElementsFromClasses(o)}static get properties(){return{labelIcon:{type:String,attribute:"label-icon"},text:{type:String},textOptional:{type:String,attribute:"text-optional"},linkHref:{type:String},radio:{type:Boolean,reflect:!0},noChangeState:{type:Boolean,attribute:"no-change-state"},description:{type:String},disabledEllipsis:{type:Boolean,attribute:"disabled-ellipsis"},variant:{type:String},amount:{type:String},divider:{type:String,reflect:!0}}}constructor(){super(),this.labelIcon="",this.text="",this.textOptional="",this.radio=!1,this.description="",this.disabledEllipsis=!1,this.noChangeState=!1,this.linkHref="",this.variant="",this.ammount="",this.divider="",this.removeEventListener("click",this._onClick)}connectedCallback(){super.connectedCallback&&super.connectedCallback(),this._onChange=this._onChange.bind(this),this.addEventListener("change",this._onChange),!this.hasAttribute("tabindex")&&this.disabled&&this.setAttribute("tabindex",-1)}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback(),this.removeEventListener("change",this._onChange)}firstUpdated(){const o=this;void 0!==o&&o.addEventListener("click",this._onClick)}updated(o){super.updated(o),this.description||this.amount||this.setAttribute("aria-label",this.t("bbva-form-toggle-switch-aria-label"))}static get styles(){return[super.styles,A,z,T,b("bbva-form-toggle-switch-shared-styles")]}get _inputTemplate(){return m`
      ${"icon"===this.variant||"list-icon"===this.variant||"right-icon"===this.variant?m` <span class="bg" aria-hidden="true">
            <span class="knob">
              <span class="knob-tie">
                <bbva-type-icon .icon="${L}" size="24"></bbva-type-icon>
              </span>
            </span>
          </span>`:super._inputTemplate}
    `}get _labelTemplate(){return m`
      <span class="label">
        <span class="sr-only" aria-live="${s(this.radio?"assertive":void 0)}">
          ${this.label} ${this._labelState}
        </span>
        ${this.description&&!this.amount&&m` <bbva-type-text
          unset
          size="S"
          text="${this.t(this.description)}"
          ?ellipsis="${!this.disabledEllipsis}"
        ></bbva-type-text>`}
        ${this.amount&&m` <bbva-type-amount
          variant="M"
          amount="${this.amount}"
          currency-code="${this.currencyCode}"
          local-currency="${this.localCurrency}"
          language="${this.language}"
        ></bbva-type-amount>`}
      </span>
    `}get _renderDivider(){return m`
      ${""!==this.divider?m`<bbva-divider-default .size="${this.divider}"></bbva-divider-default>`:m``}
    `}_onChange(){this.dispatchEvent(new CustomEvent("switch-change",{detail:{checked:this.checked,value:this.radio&&!this.checked?this.valueOff:this.value},bubbles:!0,composed:!0}))}_toggle(){this.noChangeState?(this._dispatchEvent("change"),this._dispatchEvent("input")):super._toggle()}render(){return m`${super.render()}${this._renderDivider}`}}const I=o`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-toggle--_ambient--control-color: initial;
    --bbva-form-toggle--_ambient--control-checked-color: initial;
    --bbva-form-toggle--_ambient--knob-tie-color: initial;
    --bbva-form-toggle--_ambient--knob-tie-checked-color: initial;
    --bbva-form-toggle--_ambient--knob-container-pressed-color: initial;
    --bbva-form-toggle--_ambient--knob-tie-icon-color: initial;
    --bbva-form-toggle--_ambient--knob-tie-icon-checked-color: initial;
    --bbva-form-toggle--_ambient--focus-border-color: initial;
  }
`,X=o`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-toggle--_ambient--control-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--control-color,
      ${d("colorPrimaryAltFormSwitchBackgroundOff",h)}
    );

    --bbva-form-toggle--_ambient--control-checked-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--control-checked-color,
      ${d("colorPrimaryAltFormSwitchBackgroundOn",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--knob-tie-color,
      ${d("colorPrimaryAltFormSwitchHandleOff",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-checked-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--knob-tie-checked-color,
      ${d("colorPrimaryAltFormSwitchHandleOn",h)}
    );

    --bbva-form-toggle--_ambient--knob-container-pressed-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--knob-container-pressed-color,
      ${d("colorPrimaryAltSurfaceAmbientPressed",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-icon-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--knob-tie-icon-color,
      ${d("colorPrimaryAltFormSwitchBackgroundOff",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-icon-checked-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--knob-tie-icon-checked-color,
      ${d("colorPrimaryAltFormSwitchBackgroundOn",h)}
    );

    --bbva-form-toggle--_ambient--focus-border-color: var(
      --bbva-form-toggle--custom--primary-alt-ambient--focus-border-color,
      ${d("colorPrimaryAltSurfaceAmbientFocus",h)}
    );
  }
`,W=o`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-toggle--_ambient--control-color: var(
      --bbva-form-toggle--custom--secondary-ambient--control-color,
      ${d("colorSecondaryFormSwitchBackgroundOff",h)}
    );

    --bbva-form-toggle--_ambient--control-checked-color: var(
      --bbva-form-toggle--custom--secondary-ambient--control-checked-color,
      ${d("colorSecondaryFormSwitchBackgroundOn",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-color: var(
      --bbva-form-toggle--custom--secondary-ambient--knob-tie-color,
      ${d("colorSecondaryFormSwitchHandleOff",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-checked-color: var(
      --bbva-form-toggle--custom--secondary-ambient--knob-tie-checked-color,
      ${d("colorSecondaryFormSwitchHandleOn",h)}
    );

    --bbva-form-toggle--_ambient--knob-container-pressed-color: var(
      --bbva-form-toggle--custom--secondary-ambient--knob-container-pressed-color,
      ${d("colorSecondarySurfaceAmbientPressed",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-icon-color: var(
      --bbva-form-toggle--custom--secondary-ambient--knob-tie-icon-color,
      ${d("colorSecondaryFormSwitchBackgroundOff",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-icon-checked-color: var(
      --bbva-form-toggle--custom--secondary-ambient--knob-tie-icon-checked-color,
      ${d("colorSecondaryFormSwitchBackgroundOn",h)}
    );

    --bbva-form-toggle--_ambient--focus-border-color: var(
      --bbva-form-toggle--custom--secondary-ambient--focus-border-color,
      ${d("colorSecondarySurfaceAmbientFocus",h)}
    );
  }
`,U=o`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-toggle--_ambient--control-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--control-color,
      ${d("colorSecondaryAltFormSwitchBackgroundOff",h)}
    );

    --bbva-form-toggle--_ambient--control-checked-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--control-checked-color,
      ${d("colorSecondaryAltFormSwitchBackgroundOn",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--knob-tie-color,
      ${d("colorSecondaryAltFormSwitchHandleOff",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-checked-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--knob-tie-checked-color,
      ${d("colorSecondaryAltFormSwitchHandleOn",h)}
    );

    --bbva-form-toggle--_ambient--knob-container-pressed-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--knob-container-pressed-color,
      ${d("colorSecondaryAltSurfaceAmbientPressed",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-icon-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--knob-tie-icon-color,
      ${d("colorSecondaryAltFormSwitchBackgroundOff",h)}
    );

    --bbva-form-toggle--_ambient--knob-tie-icon-checked-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--knob-tie-icon-checked-color,
      ${d("colorSecondaryAltFormSwitchBackgroundOn",h)}
    );

    --bbva-form-toggle--_ambient--focus-border-color: var(
      --bbva-form-toggle--custom--secondary-alt-ambient--focus-border-color,
      ${d("colorSecondaryAltSurfaceAmbientFocus",h)}
    );
  }
`;const D=v([Object.freeze({__proto__:null,primary:I,primaryAlt:X,secondary:W,secondaryAlt:U}),f,k,p,u,y]),M=Object.values(D);var R=o`
:host {
  display: block;
  box-sizing: border-box;
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

:host([focus-visible]) {
  outline: none;
}

:host(:focus-visible) .container {
  outline: 0.125rem solid var(--_form-toggle-focus-border-color);
}

:host([hidden]),
[hidden] {
  display: none !important;
}

.row-label {
  display: flex;
  min-width: 0;
  flex-direction: row;
  align-items: center;
  padding-bottom: 0.5rem;
}
.row-label .title {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${t(a.medium.fontWeight)});
}
.row-label [data-tag-name=bbva-type-link] {
  padding: 0;
}

[data-tag-name=bbva-type-text] {
  padding-right: 0.5rem;
}

:host([variant=optionLabel]) .rowLabel [data-tag-name=bbva-type-text] {
  padding-right: 0.5rem;
  margin: 0;
}
`;class q extends(O(n(_(g)))){static get is(){return"bbva-form-toggle"}static get scopedElements(){const o=[w,$,j,F];return q.scopedElementsFromClasses(o)}static get properties(){return{labelIcon:{type:String,attribute:"label-icon"},text:{type:String},textOptional:{type:String,attribute:"text-optional"},linkHref:{type:String},radio:{type:Boolean,reflect:!0},noChangeState:{type:Boolean,attribute:"no-change-state"},description:{type:String},disabledEllipsis:{type:Boolean,attribute:"disabled-ellipsis"},variant:{type:String},amount:{type:String},divider:{type:String,reflect:!0},checked:{type:Boolean,reflect:!0},disabled:{type:Boolean},value:{type:String},valueOff:{type:String,attribute:"value-off"}}}constructor(){super(),this.labelIcon="",this.text="",this.textOptional="",this.radio=!1,this.description="",this.disabledEllipsis=!1,this.noChangeState=!1,this.linkHref="",this.variant="",this.ammount="",this.divider="",this.divider="",this.value="",this.checked=!1,this.disabled=!1,this.iconLabel="bbva-form-toggle-icon-aria-label"}static get styles(){return[super.styles,R,M,b("bbva-form-toggle-shared-styles")]}async firstUpdated(o){if(super.firstUpdated&&await super.firstUpdated(o),o.has("disabled")&&this.labelIcon&&this.disabled){const o=this.shadowRoot.querySelector('[data-tag-name="bbva-type-link"]');null==o||o.setAttribute("tabIndex",-1)}}get _groupLabelTemplate(){return m`
      ${this.labelIcon||this.text||this.textOptional?m`<div class="row-label">
            ${this.text?m`<bbva-type-text
                  unset
                  size="S"
                  class="title"
                  text="${this.t(this.text)}"
                ></bbva-type-text>`:m``}
            ${this.textOptional?m`<bbva-type-text
                  unset
                  size="S"
                  class="optional"
                  text="${this.textOptional}"
                ></bbva-type-text>`:m``}
            ${this.labelIcon?m`<bbva-type-link
                  href="${s(this.linkHref)}"
                  @click="${this._helpClicked}"
                  target="_blank"
                  aria-label="${this.t(this.iconLabel)}"
                  icon-size="16"
                  .icon=${this.labelIcon}
                ></bbva-type-link>`:m``}
          </div>`:m``}
    `}_formToggleSwitchChange(o){this.checked=o.detail.checked,this.dispatchEvent(new CustomEvent("form-toggle-switch-change",{detail:{checked:this.checked,value:o.detail.value},bubbles:!0,composed:!0}))}get _formToggleSwitchTemplate(){return m` <bbva-form-toggle-switch
      .radio=${this.radio}
      .description=${this.description}
      .value=${this.value}
      value-off=${s(this.valueOff)}
      ?disabled-ellipsis=${this.disabledEllipsis}
      ?no-change-state=${this.noChangeState}
      variant=${s(this.variant)}
      .amount=${this.amount}
      .divider=${this.divider}
      ?checked=${this.checked}
      ?disabled=${this.disabled}
      role="switch"
      aria-checked=${this.checked}
      @switch-change="${this._formToggleSwitchChange}"
    ></bbva-form-toggle-switch>`}_helpClicked(o){o.stopPropagation(),this.dispatchEvent(new CustomEvent("bbva-form-toggle-help-click",{bubbles:!0,composed:!0}))}render(){return m`${this._groupLabelTemplate}${this._formToggleSwitchTemplate}`}}export{q as B,D as b};
