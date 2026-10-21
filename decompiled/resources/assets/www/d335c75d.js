import{z as o,a8 as r,ac as t,ad as a,ab as e,by as i,aN as n,ah as b,aD as c,bx as l,ak as d,h as m,av as s}from"./952f98a9.js";import{R as u,S as f,u as v,D as p,E as y,A as h,T as g,v as _,w as S,W as $,x as k,F as x,I as F,G as A}from"./216055dc.js";var I=o`
:host {
  --_form-radio-button-color:
  var(--bbva-form-radio-button--_ambient--color,
    var(--bbva-form-radio-button--custom--primary-ambient--color,
      ${u("colorPrimaryText01Default",f)}));
  --_form-radio-button-readonly-color:
  var(--bbva-form-radio-button--_ambient--readonly-color,
    var(--bbva-form-radio-button--custom--primary-ambient--readonly-color,
      ${u("colorPrimaryFormSelectorCheckReadOnly",f)}));
  --_form-radio-button-border-color:
  var(--bbva-form-radio-button--_ambient--border-color,
    var(--bbva-form-radio-button--custom--primary-ambient--border-color,
      ${u("colorPrimaryFormSelectorBorderDefault",f)}));
  --_form-radio-button-bg-color:
  var(--bbva-form-radio-button--_ambient--bg-color,
    var(--bbva-form-radio-button--custom--primary-ambient--bg-color,
      ${u("colorPrimaryFormSelectorBackgroundDefault",f)}));
  --_form-radio-button-check-bg-color:
  var(--bbva-form-radio-button--_ambient--check-bg-color,
    var(--bbva-form-radio-button--custom--primary-ambient--check-bg-color,
      ${u("colorPrimaryFormSelectorCheckDefault",f)}));
  --_form-radio-button-error-color:
  var(--bbva-form-radio-button--_ambient--error-color,
    var(--bbva-form-radio-button--custom--primary-ambient--error-color,
      ${u("colorPrimaryFormSelectorBorderError",f)}));
  --_form-radio-button-error-bg-color:
  var(--bbva-form-radio-button--_ambient--error-bg-color,
    var(--bbva-form-radio-button--custom--primary-ambient--error-bg-color,
      ${u("colorPrimaryFormSelectorBackgroundError",f)}));
  --_form-radio-button-container-active-bg-color:
  var(--bbva-form-radio-button--_ambient--container-active-bg-color,
    var(--bbva-form-radio-button--custom--primary-ambient--container-active-bg-color,
      ${u("colorPrimarySurfaceAmbientPressed",f)}));
  --_form-radio-button-focus-border-color: var(--bbva-form-radio-button--_ambient--focus-border-color,
  var(--bbva-form-radio-button--custom--primary-ambient--focus-border-color,
    ${u("colorPrimarySurfaceAmbientFocus",f)}));
}
`;const P=o`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-form-radio-button--_ambient--color: initial;
    --bbva-form-radio-button--_ambient--readonly-color: initial;
    --bbva-form-radio-button--_ambient--border-color: initial;
    --bbva-form-radio-button--_ambient--bg-color: initial;
    --bbva-form-radio-button--_ambient--check-bg-color: initial;
    --bbva-form-radio-button--_ambient--error-color: initial;
    --bbva-form-radio-button--_ambient--error-bg-color: initial;
    --bbva-form-radio-button--_ambient--container-active-bg-color: initial;
    --bbva-form-radio-button--_ambient--focus-border-color: initial;

  }
`,B=o`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-form-radio-button--_ambient--color: var(
      --bbva-form-radio-button--custom--primary-alt-ambient--color,
      ${u("colorPrimaryAltText01Default",f)}
    );

    --bbva-form-radio-button--_ambient--readonly-color: var(
      --bbva-form-radio-button--custom--primary-alt-ambient--readonly-color,
      ${u("colorPrimaryAltFormSelectorCheckReadOnly",f)}
    );

    --bbva-form-radio-button--_ambient--border-color: var(
      --bbva-form-radio-button--custom--primary-alt-ambient--border-color,
      ${u("colorPrimaryAltFormSelectorBorderDefault",f)}
    );

    --bbva-form-radio-button--_ambient--bg-color: var(
      --bbva-form-radio-button--custom--primary-alt-ambient--bg-color,
      ${u("colorPrimaryAltFormSelectorBackgroundDefault",f)}
    );

    --bbva-form-radio-button--_ambient--check-bg-color: var(
      --bbva-form-radio-button--custom--primary-alt-ambient--check-bg-color,
      ${u("colorPrimaryAltFormSelectorCheckDefault",f)}
    );

    --bbva-form-radio-button--_ambient--error-color: var(
      --bbva-form-radio-button--custom--primary-alt-ambient--error-color,
      ${u("colorPrimaryAltFormSelectorBackgroundError",f)}
    );

    --bbva-form-radio-button--_ambient--error-color: var(
      --bbva-form-radio-button--custom--primary-alt-ambient--error-color,
      ${u("colorPrimaryAltFormSelectorBorderError",f)}
    );

    --bbva-form-radio-button--_ambient--error-bg-color: var(
      --bbva-form-radio-button--custom--primary-alt-ambient--error-bg-color,
      ${u("colorPrimaryAltFormSelectorBackgroundError",f)}
    );

    --bbva-form-radio-button--_ambient--container-active-bg-color: var(
      --bbva-form-radio-button--custom--primary-alt-ambient--container-active-bg-color,
      ${u("colorPrimaryAltSurfaceAmbientPressed",f)}
    );

    --bbva-form-radio-button--_ambient--focus-border-color: var(
      --bbva-form-radio-button--custom--primary-alt-ambient--focus-border-color,
      ${u("colorPrimaryAltSurfaceAmbientFocus",f)}
    );
  }
`,z=o`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-form-radio-button--_ambient--color: var(
      --bbva-form-radio-button--custom--secondary-ambient--color,
      ${u("colorSecondaryText01Default",f)}
    );

    --bbva-form-radio-button--_ambient--readonly-color: var(
      --bbva-form-radio-button--custom--secondary-ambient--readonly-color,
      ${u("colorSecondaryFormSelectorCheckReadOnly",f)}
    );

    --bbva-form-radio-button--_ambient--border-color: var(
      --bbva-form-radio-button--custom--secondary-ambient--border-color,
      ${u("colorSecondaryFormSelectorBorderDefault",f)}
    );

    --bbva-form-radio-button--_ambient--bg-color: var(
      --bbva-form-radio-button--custom--secondary-ambient--bg-color,
      ${u("colorSecondaryFormSelectorBackgroundDefault",f)}
    );

    --bbva-form-radio-button--_ambient--check-bg-color: var(
      --bbva-form-radio-button--custom--secondary-ambient--check-bg-color,
      ${u("colorSecondaryFormSelectorCheckDefault",f)}
    );

    --bbva-form-radio-button--_ambient--error-color: var(
      --bbva-form-radio-button--custom--secondary-ambient--error-color,
      ${u("colorSecondaryFormSelectorBackgroundError",f)}
    );

    --bbva-form-radio-button--_ambient--error-color: var(
      --bbva-form-radio-button--custom--secondary-ambient--error-color,
      ${u("colorSecondaryFormSelectorBorderError",f)}
    );

    --bbva-form-radio-button--_ambient--error-bg-color: var(
      --bbva-form-radio-button--custom--secondary-ambient--error-bg-color,
      ${u("colorSecondaryFormSelectorBackgroundError",f)}
    );

    --bbva-form-radio-button--_ambient--container-active-bg-color: var(
      --bbva-form-radio-button--custom--secondary-ambient--container-active-bg-color,
      ${u("colorSecondarySurfaceAmbientPressed",f)}
    );

    --bbva-form-radio-button--_ambient--focus-border-color: var(
      --bbva-form-radio-button--custom--secondary-ambient--focus-border-color,
      ${u("colorSecondarySurfaceAmbientFocus",f)}
    );
  }
`,D=o`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-form-radio-button--_ambient--color: var(
      --bbva-form-radio-button--custom--secondary-alt-ambient--color,
      ${u("colorSecondaryAltText01Default",f)}
    );

    --bbva-form-radio-button--_ambient--readonly-color: var(
      --bbva-form-radio-button--custom--secondary-alt-ambient--readonly-color,
      ${u("colorSecondaryAltFormSelectorCheckReadOnly",f)}
    );

    --bbva-form-radio-button--_ambient--border-color: var(
      --bbva-form-radio-button--custom--secondary-alt-ambient--border-color,
      ${u("colorSecondaryAltFormSelectorBorderDefault",f)}
    );

    --bbva-form-radio-button--_ambient--bg-color: var(
      --bbva-form-radio-button--custom--secondary-alt-ambient--bg-color,
      ${u("colorSecondaryAltFormSelectorBackgroundDefault",f)}
    );

    --bbva-form-radio-button--_ambient--check-bg-color: var(
      --bbva-form-radio-button--custom--secondary-alt-ambient--check-bg-color,
      ${u("colorSecondaryAltFormSelectorCheckDefault",f)}
    );

    --bbva-form-radio-button--_ambient--error-color: var(
      --bbva-form-radio-button--custom--secondary-alt-ambient--error-color,
      ${u("colorSecondaryAltFormSelectorBackgroundError",f)}
    );

    --bbva-form-radio-button--_ambient--error-color: var(
      --bbva-form-radio-button--custom--secondary-alt-ambient--error-color,
      ${u("colorSecondaryAltFormSelectorBorderError",f)}
    );

    --bbva-form-radio-button--_ambient--error-bg-color: var(
      --bbva-form-radio-button--custom--secondary-alt-ambient--error-bg-color,
      ${u("colorSecondaryAltFormSelectorBackgroundError",f)}
    );

    --bbva-form-radio-button--_ambient--container-active-bg-color: var(
      --bbva-form-radio-button--custom--secondary-alt-ambient--container-active-bg-color,
      ${u("colorSecondaryAltSurfaceAmbientPressed",f)}
    );

    --bbva-form-radio-button--_ambient--focus-border-color: var(
      --bbva-form-radio-button--custom--secondary-alt-ambient--focus-border-color,
      ${u("colorSecondaryAltSurfaceAmbientFocus",f)}
      );
  }
`;const w=v([Object.freeze({__proto__:null,primary:P,primaryAlt:B,secondary:z,secondaryAlt:D}),p,y,h,g]),E=Object.values(w);var M=o`
:host {
  position: relative;
  display: block;
  min-height: 3rem;
  box-sizing: border-box;
  color: var(--_form-radio-button-color);
  cursor: default;
  font-size: var(--typographyTypeSmall, ${r(t.typeSmall)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${r(e.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${r(e.book.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${r(a.typeSmall)});
}

:host([readonly]) {
  color: var(--_form-radio-button-readonly-color);
}
:host([readonly]) .container {
  cursor: default;
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

.container {
  display: flex;
  align-items: flex-start;
  padding: 0.5rem 1rem;
  cursor: pointer;
}
:host([active]) .container {
  background-color: var(--_form-radio-button-container-active-bg-color);
}

:host(:not(:focus-visible)) {
  outline: none;
}

:host([focus-visible]) {
  outline: none;
}

:host(:focus-visible) .container {
  outline: 0.125rem solid var(--_form-radio-button-focus-border-color);
  outline-offset: 0.25rem;
}

.box {
  display: flex;
  width: 2rem;
  height: 2rem;
  flex: none;
  align-items: center;
  justify-content: center;
  border: 0.125rem solid var(--_form-radio-button-border-color);
  border-radius: 50%;
  margin-right: 0.5rem;
  background-color: var(--_form-radio-button-bg-color);
}
:host([aria-invalid=true]) .box {
  border-color: var(--_form-radio-button-error-color);
  background-color: var(--_form-radio-button-error-bg-color);
}
.box .check {
  display: block;
  width: 1rem;
  height: 1rem;
  border-radius: 50%;
  background-color: var(--_form-radio-button-check-bg-color);
  opacity: 0;
}
:host([aria-checked=true]) .box .check {
  opacity: 1;
}
:host([aria-invalid=true]) .box .check {
  background-color: var(--_form-radio-button-error-color);
}
:host([readonly]) .box .check {
  background-color: var(--_form-radio-button-readonly-color);
}

.desktop .box {
  width: 1.5rem;
  height: 1.5rem;
}
.desktop .box .check {
  width: 0.75rem;
  height: 0.75rem;
}

.content {
  display: flex;
  min-width: 0;
  flex: auto;
  align-items: flex-start;
}

.main {
  display: block;
  min-width: 0;
  flex: auto;
  padding-top: 0.25rem;
}

.label {
  display: block;
}

.description {
  display: block;
  margin-top: 0.25rem;
  font-size: var(--typographyTypeSmall, ${r(t.typeSmall)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${r(e.book.fontStyle)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${r(e.book.fontWeight)});
  line-height: var(--lineHeightTypeSmall, ${r(a.typeSmall)});
}

.clip {
  display: flex;
  height: 2rem;
  flex: none;
  align-items: center;
}

:host([variant=amount]) .clip {
  color: var(--_form-radio-button-variant-amount-clip-color);
}

:host([variant=icon]) .clip,
:host([variant=help]) .clip {
  color: var(--_form-radio-button-variant-help-clip-color);
}

.slot-control ::slotted(input[type=radio]) {
  position: absolute;
  z-index: -1;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  margin: 0;
  opacity: 0;
  pointer-events: none;
}

.medium {
  font-style: var(--fontFacePrimaryMediumFontStyle, ${r(e.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${r(e.medium.fontWeight)});
}

:host([variant=label]) .group-label {
  display: flex;
  align-items: center;
  padding-top: 0.5rem;
  padding-bottom: 0.5rem;
  gap: 0.5rem;
}
:host([variant=label]) .container {
  padding-top: 0.5rem;
  padding-bottom: 0.5rem;
}

.group-label {
  display: flex;
  align-items: center;
  padding: 0.5rem 1rem;
  gap: 1rem;
}
.group-label .label {
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${r(e.medium.fontWeight)});
}

:host([variant=invalid]) .container {
  display: flex;
  padding-bottom: 0.5rem;
}
:host([variant=invalid]) .container .content {
  display: flex;
  flex-direction: column;
}
:host([variant=invalid]) .container .content .clip {
  height: 0;
}
:host([variant=invalid]) .container .content .alert {
  position: relative;
  top: 0.5rem;
  left: -2.5625rem;
  padding-bottom: 0.5rem;
}

.invalid-right {
  padding: 0;
}

:host([variant=right]) :not(.desktop) .container {
  display: flex;
  padding-bottom: 0.5rem;
}
:host([variant=right]) :not(.desktop) .container .box {
  order: 5;
}
:host([variant=right]) :not(.desktop) .container .content {
  display: flex;
  flex-direction: column;
}
:host([variant=right]) :not(.desktop) .container .content .alert {
  padding-top: 0.5rem;
}
:host([variant=right]) .clip {
  height: 0;
}
:host([variant=right]) .container .content {
  display: flex;
  flex-direction: column;
}
:host([variant=right]) .container .alert {
  padding-top: 0.5rem;
}

.divider-container {
  padding: 0 1rem;
}
.divider-container [data-tag-name=bbva-divider-default] {
  display: inline;
}

@media (min-width: 768px) {
  :host {
    min-width: 20rem;
    max-width: 28rem;
  }
}
`;class T extends(_(S($(i)))){static get is(){return"bbva-form-radio-button"}static get scopedElements(){return{"bbva-type-icon":k,"bbva-notification-help":x,"bbva-divider-default":F,"bbva-type-text":A}}static get properties(){return{errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},text:{type:String},textOptional:{type:String,attribute:"text-optional"},errorMessage:{type:String,attribute:"error-message"},infoIcon:{type:String,attribute:"info-icon"},helpIcon:{type:String,attribute:"help-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},invalid:{type:Boolean,reflect:!0},readonly:{type:Boolean,reflect:!0},labelMedium:{type:Boolean,attribute:"label-medium",reflect:!0},label:{type:String},accessibilityIconAlertNotification:{type:String,attribute:"accessibility-icon-alert-notification"},accessibilityIconInfoNotification:{type:String,attribute:"accessibility-icon-info-notification"},divider:{type:String},_desktop:{type:Boolean,state:!0}}}constructor(){super(),this.disabled=!1,this.errorIcon=n(),this.errorIconSize=16,this.infoIconSize=16,this.errorMessage="",this.infoMessage="",this.infoIcon=b(),this.helpIcon=c(),this.readonly=!1,this.labelMedium=!1,this.type="radio",this.label="",this.text="",this.textOptional="",this.accessibilityIconInfoNotification="",this.accessibilityIconAlertNotification="",this.divider="",this.invalid=!1}static get _mediaQueries(){return{_desktop:"(min-width: 62rem)"}}updated(o){super.updated&&super.updated(o),o.has("invalid")&&this.setAttribute("aria-invalid",this.invalid.toString())}static get styles(){return[super.styles,l(),M,E,I,d("bbva-form-radio-button-shared-styles")]}get _propsForDisabledUpdated(){return[...super._propsForDisabledUpdated,"readonly"]}get _propsForTabindexUpdated(){return[...super._propsForTabindexUpdated,"readonly"]}get _disabled(){return this.disabled||this.readonly}get _actionable(){return!this._disabled&&!this.readonly}get _labelTemplate(){return m`
      <span class="content">
        <span class="main">
          <span class="label ${s({medium:this.labelMedium})}">
            <slot> ${this.label}</slot>
          </span>
          <span class="description">
            <slot name="description"></slot>
          </span>
          ${this._notificationsInfo}
        </span>
        <span class="clip">
          <slot name="clip"></slot>
        </span>
        ${this._notificationsError}
      </span>
    `}get _notificationsInfo(){return m`
      ${this.infoMessage?m`
            <bbva-notification-help
              accessibility-label-icon="${this.accessibilityIconInfoNotification}"
              icon="${this.infoIcon}"
              icon-size="${this.infoIconSize}"
              hide-top-padding
              hide-bottom-padding
              hide-left-padding
              hide-right-padding
              text="${this.infoMessage}"
            >
            </bbva-notification-help>
          `:""}
    `}get _notificationsError(){return m`
      ${this.invalid&&this.errorMessage?m`
            <bbva-notification-help
              accessibility-label-icon="${this.accessibilityIconAlertNotification}"
              class="alert"
              icon="${this.errorIcon}"
              text="${this.errorMessage}"
              icon-size="${this.errorIconSize}"
              variant="alert"
              hide-top-padding
              hide-bottom-padding
              hide-left-padding
              hide-right-padding
            >
            </bbva-notification-help>
          `:""}
    `}render(){return m`${this.text?m`<div class="group-label ${s({desktop:this._desktop})}">
          <bbva-type-text size="S" text="${this.text}" unset class="label"></bbva-type-text> ${this.textOptional?m`<bbva-type-text size="S" unset text="${this.textOptional}"></bbva-type-text>`:m``}
            <bbva-notification-help class='help-icon'
            accessibility-label-icon="${this.accessibilityIconInfoNotification}"
            icon="${this.helpIcon}"
            icon-size="${this.infoIconSize}">
          </bbva-notification-help></div>
        </div>`:m``}
      <div class="form-container ${s({desktop:this._desktop})}">
        ${this._labelledInput} ${this._control}
      </div>
      ${this.divider?m`<div class="divider-container">
            <bbva-divider-default size="${this.divider}"></bbva-divider-default>
          </div>`:m``} `}}export{T as B,w as b};
