import{bI as e,bJ as t,ao as i,a0 as a,bK as o,bL as r}from"./7f3d7ca9.js";import{z as n,a8 as s,ar as l,a9 as c,cs as d,b0 as p,ac as b,ad as m,ab as h,aa as u,a as v,an as y,ct as f,aH as g,ag as k,af as S,b6 as _,bF as $,aN as C,ah as x,h as E,i as T,ak as L,cu as P,f as w,o as I,g as D,aG as V,L as A,bj as M,av as q,bS as B,bU as z,b5 as N,dA as O,dB as R,cM as F,cD as j,J as G}from"./952f98a9.js";import{b as H,B as Y}from"./bee1f904.js";import"./3990b0e0.js";import"./b24c6aae.js";import{b as W,B as Q}from"./055a082b.js";import{B as U}from"./4adf0da4.js";import"./216055dc.js";import"./c0a2f832.js";import"./cae0f1de.js";class X extends e{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`payrolls/v${this.version}/businesses/{business-id}`)}toString(){return super.toString("BGADPMxPayrollsBusinessesBusinessGetV0")}}class J extends t{constructor(e=null){super(Object.assign({requiresTsec:!0},e||{})),this._setPath(`payrolls/v${this.version}/businesses/{business-id}/payroll-vinculation-requests`)}toString(){return super.toString("BGADPMxPayrollsBusinessesBusinessPayrollVinculationRequestsPostV0")}}const K=new l;var Z=n`[ambient^=light] {
  --bbva-form-field-bg-color: initial;
  --bbva-form-field-input-color: initial;
  --bbva-form-field-readonly-input-color: initial;
  --bbva-form-field-placeholder-color: initial;
  --bbva-form-field-label-color: initial;
  --bbva-form-field-focused-label-color: initial;
  --bbva-form-field-readonly-label-color: initial;
  --bbva-form-field-border-color: initial;
  --bbva-form-field-focused-border-color: initial;
  --bbva-form-field-readonly-clear-color: initial;
  --bbva-form-field-message-color: initial;
  --bbva-form-field-message-icon-color: initial;
  --bbva-form-field-info-message-color: initial;
  --bbva-form-field-info-message-icon-color: initial;
  --bbva-form-field-invalid-field-bg-color: initial;
  --bbva-form-field-invalid-input-color: initial;
  --bbva-form-field-invalid-field-border-color: initial;
  --bbva-form-field-invalid-label-color: initial;
  --bbva-form-field-invalid-clear-color: initial;
  --bbva-form-field-label-out-color: initial;
  --bbva-form-field-help-icon-color: initial;
  --bbva-form-field-action-icon-color: initial;
  --bbva-form-field-readonly-icon-color: initial;
  --bbva-form-field-icon-color-variant: initial;
  --bbva-form-field-icon-color-focus-variant: initial;
  --bbva-form-field-icon-color-disabled-variant: initial;
}

[ambient^=light100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
}
${K.mediaRules()}`;const ee=new l;const te={dark:n`
    ${n`[ambient^=dark] {
  --bbva-form-field-bg-color: #0A5393;
  --bbva-form-field-input-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-field-readonly-input-color: var(--colorsSecondary300, ${s(c.secondary300)});
  --bbva-form-field-placeholder-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-field-label-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-field-focused-label-color: var(--colorsSecondary100, ${s(c.secondary100)});
  --bbva-form-field-readonly-label-color: var(--colorsSecondary300, ${s(c.secondary300)});
  --bbva-form-field-border-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-field-focused-border-color: var(--colorsSecondary100, ${s(c.secondary100)});
  --bbva-form-field-readonly-clear-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-field-message-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-field-message-icon-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-field-info-message-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-field-info-message-icon-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-field-invalid-field-bg-color: var(--colorsTertiaryType5Lightened, ${s(c.tertiaryType5Lightened)});
  --bbva-form-field-invalid-input-color: var(--colorsSecondary600, ${s(c.secondary600)});
  --bbva-form-field-invalid-field-border-color: var(--colorsTertiaryType5Medium, ${s(c.tertiaryType5Medium)});
  --bbva-form-field-invalid-label-color: var(--colorsTertiaryType1Dark, ${s(c.tertiaryType1Dark)});
  --bbva-form-field-invalid-clear-color: var(--colorsTertiaryType1Dark, ${s(c.tertiaryType1Dark)});
  --bbva-form-field-label-out-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-field-help-icon-color: var(--colorsPrimarySubdued, ${s(c.primarySubdued)});
  --bbva-form-field-action-icon-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-field-readonly-icon-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-field-icon-color-variant: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-form-field-icon-color-focus-variant: var(--colorsPrimarySubduedLight, ${s(c.primarySubduedLight)});
  --bbva-form-field-icon-color-disabled-variant: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
}

[ambient^=dark400] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreDark, ${s(c.primaryCoreDark)});
}

[ambient^=dark100] {
  --bbva-form-field-bg-color: var(--colorsPrimaryCoreLight, ${s(c.primaryCoreLight)});
  --bbva-form-field-help-icon-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
}
${ee.mediaRules()}`}
    ${d.dark}
    ${p.dark}
  `,light:n`
    ${Z}
    ${d.light}
    ${p.light}
  `};var ie=n`:host {
  --_field-bg-color: var(--bbva-form-field-bg-dark-mode-color, var(--bbva-form-field-bg-color,var(--colorsSecondary100, ${s(c.secondary100)})));
  --_field-input-color: var(--bbva-form-field-input-dark-mode-color, var(--bbva-form-field-input-color,var(--colorsSecondary600, ${s(c.secondary600)})));
  --_field-input-placeholder-color: var(--bbva-form-field-placeholder-dark-mode-color, var(--bbva-form-field-placeholder-color,var(--colorsSecondary500, ${s(c.secondary500)})));
  --_field-readonly-input-color: var(--bbva-form-field-readonly-input-dark-mode-color, var(--bbva-form-field-readonly-input-color,var(--colorsSecondary500, ${s(c.secondary500)})));
  --_field-readonly-clear-color: var(--bbva-form-field-readonly-clear-dark-mode-color, var(--bbva-form-field-readonly-clear-color,var(--colorsSecondary500, ${s(c.secondary500)})));
  --_field-readonly-icon-color: var(--bbva-form-field-readonly-icon-dark-mode-color, var(--bbva-form-field-readonly-icon-color,var(--colorsSecondary500, ${s(c.secondary500)})));
  --_field-label-out-color: var(--bbva-form-field-label-out-dark-mode-color, var(--bbva-form-field-label-out-color, var(--colorsSecondary600, ${s(c.secondary600)})));
  --_field-label-color: var(--bbva-form-field-label-dark-mode-color, var(--bbva-form-field-label-color,var(--colorsSecondary500, ${s(c.secondary500)})));
  --_field-focused-label-color: var(--bbva-form-field-focused-label-dark-mode-color, var(--bbva-form-field-focused-label-color,var(--colorsSecondary500, ${s(c.secondary500)})));
  --_field-readonly-label-color: var(--bbva-form-field-readonly-label-dark-mode-color, var(--bbva-form-field-readonly-label-color,var(--colorsSecondary500, ${s(c.secondary500)})));
  --_field-border-color: var(--bbva-form-field-border-dark-mode-color, var(--bbva-form-field-border-color,var(--colorsSecondary500, ${s(c.secondary500)})));
  --_field-focused-border-color: var(--bbva-form-field-focused-border-dark-mode-color, var(--bbva-form-field-focused-border-color,var(--colorsSecondary600, ${s(c.secondary600)})));
  --_message-color: var(--bbva-form-field-message-dark-mode-color, var(--bbva-form-field-message-color,var(--colorsSecondary600, ${s(c.secondary600)})));
  --_message-icon-color: var(--bbva-form-field-message-icon-dark-mode-color, var(--bbva-form-field-message-icon-color,var(--colorsTertiaryType1Dark, ${s(c.tertiaryType1Dark)})));
  --_info-message-color: var(--bbva-form-field-info-message-dark-mode-color, var(--bbva-form-field-info-message-color,var(--colorsSecondary500, ${s(c.secondary500)})));
  --_info-message-icon-color: var(--bbva-form-field-info-message-icon-dark-mode-color, var(--bbva-form-field-info-message-icon-color,var(--colorsPrimaryCoreDark, ${s(c.primaryCoreDark)})));
  --_invalid-field-bg-color: var(--bbva-form-field-invalid-field-bg-dark-mode-color, var(--bbva-form-field-invalid-field-bg-color,var(--colorsTertiaryType5Lightened, ${s(c.tertiaryType5Lightened)})));
  --_invalid-field-input-color: var(--bbva-form-field-invalid-input-dark-mode-color, var(--bbva-form-field-invalid-input-color,var(--colorsSecondary600, ${s(c.secondary600)})));
  --_invalid-field-border-color: var(--bbva-form-field-invalid-field-border-dark-mode-color, var(--bbva-form-field-invalid-field-border-color,var(--colorsTertiaryType5Medium, ${s(c.tertiaryType5Medium)})));
  --_invalid-field-label-color: var(--bbva-form-field-invalid-label-dark-mode-color, var(--bbva-form-field-invalid-label-color,var(--colorsTertiaryType1Dark, ${s(c.tertiaryType1Dark)})));
  --_invalid-field-clear-color: var(--bbva-form-field-invalid-clear-dark-mode-color, var(--bbva-form-field-invalid-clear-color,var(--colorsTertiaryType1Dark, ${s(c.tertiaryType1Dark)})));
  --_help-icon-color: var(--bbva-form-field-help-icon-dark-mode-color, var(--bbva-form-field-help-icon-color,var(--colorsPrimaryMedium, ${s(c.primaryMedium)})));
  --_action-icon-color: var(--bbva-form-field-action-icon-dark-mode-color, var(--bbva-form-field-action-icon-color,var(--colorsPrimaryMedium, ${s(c.primaryMedium)})));
  --_invalid-action-icon-color: var(--bbva-form-field-invalid-action-icon-dark-mode-color, var(--bbva-form-field-invalid-action-icon-color,var(--colorsTertiaryType1Dark, ${s(c.tertiaryType1Dark)})));
  --bbva-button-icon-color-variant: var(--bbva-form-field-icon-dark-mode-color-variant, var(--bbva-form-field-icon-color-variant, var(--colorsPrimaryMedium, ${s(c.primaryMedium)})));
  --bbva-button-icon-color-focus-variant: var(--bbva-form-field-icon-dark-mode-color-focus-variant, var(--bbva-form-field-icon-color-focus-variant, var(--colorsPrimaryCore, ${s(c.primaryCore)})));
  --bbva-button-icon-color-disabled-variant: var(--bbva-form-field-icon-dark-mode-color-disabled-variant, var(--bbva-form-field-icon-color-disabled-variant, var(--colorsPrimaryMedium, ${s(c.primaryMedium)})));
  display: block;
  box-sizing: border-box;
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

.field {
  position: relative;
  height: calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem);
  flex: auto;
  border-bottom: 1px solid var(--_field-border-color);
  background-color: var(--_field-bg-color);
}
:host([focused]) .field {
  border-bottom-color: var(--_field-focused-border-color);
}
:host([invalid]:not([action-into-form])) .field {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}

.slot-input ::slotted(input) {
  width: 100%;
  height: 100%;
  font-family: inherit;
  font-size: var(--bbva-form-field-input-font-size, var(--typographyTypeSmall, ${s(b.typeSmall)}));
  color: var(--_field-input-color);
  background-color: transparent;
  border: none;
  margin: 0;
  padding: calc(((2.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 15) * 1em) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 15) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 15) * 1em);
  position: relative;
  outline: none;
  appearance: none;
  box-shadow: none;
  box-sizing: border-box;
}
:host([focused]) .slot-input ::slotted(input), :host([invalid][filled]) .slot-input ::slotted(input) {
  max-width: calc(100% - calc(((6 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem));
}
:host([readonly]) .slot-input ::slotted(input) {
  color: var(--_field-readonly-input-color);
}
.slot-input ::slotted(input)::-ms-clear {
  display: none;
}

.slot-input ::slotted(input)::placeholder {
  padding-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem);
  color: var(--_field-input-placeholder-color);
}

.slot-input ::slotted(input:not(:focus):placeholder-shown) {
  opacity: 0;
}

:host([type=number]) .slot-input ::slotted(input) {
  -moz-appearance: textfield;
}

:host([type=search]) .slot-input ::slotted(input) {
  -webkit-appearance: textfield;
}

.label {
  position: absolute;
  top: 0;
  left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem);
  right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem);
  color: var(--_field-label-color);
  font-size: var(--bbva-form-field-label-font-size, var(--typographyTypeSmall, ${s(b.typeSmall)}));
  line-height: var(--bbva-form-field-label-line-height, var(--lineHeightTypeSmall, ${s(m.typeSmall)}));
  font-weight: var(--bbva-form-field-label-font-weight, var(--fontFacePrimaryBookFontWeight, ${s(h.book.fontWeight)}));
  will-change: transform;
  transform: translateY(calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem));
  transform-origin: top left;
  transition: transform 0.2s ease-in-out;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
:host([focused]) .label, :host([filled]) .label {
  color: var(--_field-focused-label-color);
  transform: translateY(calc(((0.3 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem)) scale(0.8);
}
:host([readonly]) .label {
  color: var(--_field-readonly-label-color);
}

.label-out {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem);
  margin-top: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem);
  display: flex;
  align-items: center;
}

.label-out-text {
  font-family: inherit;
  font-size: var(--bbva-form-field-label-out-font-size, var(--typographyTypeSmall, ${s(b.typeSmall)}));
  line-height: var(--bbva-form-field-label-out-line-height, var(--lineHeightTypeSmall, ${s(m.typeSmall)}));
  color: var(--_field-label-out-color);
}

[data-tag-name=bbva-link] {
  --bbva-link-with-icon-icon-color: var(--_help-icon-color);
  margin-left: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem);
}

.clear {
  display: none;
  position: absolute;
  top: 0;
  right: 0;
}
:host([focused]) .clear, :host([invalid][filled]) .clear {
  display: flex;
}
:host([readonly]) .clear {
  color: var(--_field-readonly-clear-color);
}

:host([invalid]) {
  /* Remove Firefox invalid inputs red border */
}
:host([invalid]) .slot-input ::slotted(input),
:host([invalid]) .slot-input ::slotted(input:invalid) {
  box-shadow: none;
  color: var(--_invalid-field-input-color);
}
:host([invalid]) .label {
  color: var(--_invalid-field-label-color);
}
:host([invalid]) .clear, :host([invalid]):host([action-into-form][action-variant]) .action {
  color: var(--_invalid-field-clear-color);
}

:host([action-into-form]) .action {
  flex: 0 0 auto;
}
:host([action-into-form]) .wrapper {
  display: flex;
  align-items: center;
  background-color: var(--_field-bg-color);
  border-bottom: 1px solid var(--_field-border-color);
}
:host([action-into-form]):host([invalid]) .field, :host([action-into-form]) .field {
  background-color: transparent;
  border-bottom: none;
}
:host([action-into-form]) .wrapper-action {
  display: flex;
  padding: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1em) calc(((1.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1em) calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1em) calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1em);
}
:host([action-into-form]) .wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_action-icon-color);
}
:host([action-into-form]):host([readonly]).wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_field-readonly-icon-color);
}
:host([action-into-form]):host([invalid]) .wrapper {
  background-color: var(--_invalid-field-bg-color);
  border-bottom-color: var(--_invalid-field-border-color);
}
:host([action-into-form]):host([invalid]) .wrapper-action [data-tag-name=bbva-core-icon] {
  color: var(--_invalid-action-icon-color);
  --bbva-button-icon-color: var(--_invalid-action-icon-color);
}

:host(:not([action-into-form])) .wrapper .field {
  border-bottom: none;
  background-color: transparent;
}

:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .wrapper {
  border-bottom: none;
}
:host([action-into-form][action-type]:not([action-variant]):not([readonly])) .field {
  border-bottom: 1px solid var(--_field-border-color);
}

.message {
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem) calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem) 0;
  display: flex;
  justify-content: flex-start;
  align-items: flex-start;
  font-size: var(--bbva-form-field-message-font-size, var(--typographyType3XSmall, ${s(b.type3XSmall)}));
  line-height: var(--bbva-form-field-message-line-height, var(--lineHeightType3XSmall, ${s(m.type3XSmall)}));
  color: var(--_message-color);
}
.message.info {
  color: var(--_info-message-color);
}
.message-icon {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem);
  color: var(--_message-icon-color);
  min-width: 1rem;
  min-height: 1rem;
}
.info .message-icon {
  color: var(--_info-message-icon-color);
}

:host(:not([action-into-form])[disabled]) .field, :host([disabled]) [data-tag-name=bbva-core-icon], :host([disabled]) .wrapper {
  opacity: 0.4;
}
`;class ae extends(v(y(f))){static get is(){return"bbva-form-field"}static get scopedElements(){return{"bbva-button-icon":g,"bbva-text":k,"bbva-core-icon":S,"bbva-link":_}}static get properties(){return{actionType:{type:String,reflect:!0,attribute:"action-type"},actionIcon:{type:String,attribute:"action-icon"},actionIconSize:{type:Number,attribute:"action-icon-size"},actionIconSecondary:{type:String,attribute:"action-icon-secondary"},actionIconSecondarySize:{type:Number,attribute:"action-icon-secondary-size"},helpIconSize:{type:Number,attribute:"help-icon-size"},actionAccessibleText:{type:String,attribute:"action-accessible-text"},actionSecondaryAccessibleText:{type:String,attribute:"action-secondary-accessible-text"},actionVariant:{type:String,reflect:!0,attribute:"action-variant"},actionIntoForm:{type:Boolean,reflect:!0,attribute:"action-into-form"},validateOnBlur:{type:Boolean,attribute:"validate-on-blur"},clearIcon:{type:String,attribute:"clear-icon"},clearIconSize:{type:Number,attribute:"clear-icon-size"},clearAccessibleText:{type:String,attribute:"clear-accessible-text"},errorIcon:{type:String,attribute:"error-icon"},errorIconSize:{type:Number,attribute:"error-icon-size"},errorMessage:{type:String,attribute:"error-message"},helpIcon:{type:String,attribute:"help-icon"},linkHref:{type:String,attribute:"link-href"},infoIcon:{type:String,attribute:"info-icon"},infoIconSize:{type:Number,attribute:"info-icon-size"},infoMessage:{type:String,attribute:"info-message"},labelOut:{type:String,attribute:"label-out"},optionalLabel:{type:String,attribute:"optional-label"}}}constructor(){super(),this.actionIconSize=24,this.actionIconSecondarySize=24,this.helpIconSize=24,this.actionAccessibleText="bbva-form-field-submit",this.actionIntoForm=!1,this.clearIcon=$(),this.clearIconSize=24,this.clearAccessibleText="bbva-form-field-clear",this.optionalLabel="bbva-form-field-optional-label",this.errorIcon=C(),this.errorIconSize=16,this.errorMessage="",this.infoIcon=x(),this.infoIconSize=16,this.infoMessage="",this._secondary=!1}firstUpdated(e){super.firstUpdated(e),this._rootNode=this.getRootNode?this.getRootNode():document,this._field=this.shadowRoot.querySelector(".field");const t=document.createElement("style");this._action=this.actionIntoForm?this.shadowRoot.querySelector(".action"):"",t.style.display="none",t.innerHTML=this.inputInnerStyles,this.appendChild(t)}updated(e){super.updated(e),e.has("value")&&(this.autoValidate||void 0===e.get("value")||(this.invalid=!!this.required&&this._isEmpty),this._isEmpty?this.removeAttribute("filled"):this.setAttribute("filled",""))}get _errorVisible(){return this.errorMessage&&this.invalid}get accessibleDescription(){const e=this.invalid?this.errorMessage:"";return e&&this.infoMessage?`${e}. ${this.infoMessage}`:e||this.infoMessage}get _isEmpty(){return""===this.value||void 0===this.value||null===this.value}get inputLabel(){return this.labelOut&&!this.label&&(this.label=this.labelOut),this.labelOut||this.required?`${this.label}`:`${this.label} ${this.t(this.optionalLabel)}`}get _helpIcon(){return this.helpIcon?E`
          <bbva-link
            @click="${this._helpClicked}"
            .icon="${this.helpIcon}"
            .iconSize="${this.helpIconSize}"
            href="${T(this.linkHref)}"
            aria-label="${this.t("bbva-form-field-help-text")}"
          >
          </bbva-link>
        `:""}get _labelOut(){return this.labelOut?E`
        <div class="label-out">
          <bbva-text
            id="labelOutText"
            unset
            class="label-out-text"
            text=${this.required?`${this.labelOut}`:`${this.labelOut} ${this.t(this.optionalLabel)}`}
            size="S"
          >
          </bbva-text>
          ${this._helpIcon}
        </div>
      `:""}static get styles(){return[super.styles,ie,te.light,te.dark,L("bbva-form-field-shared-styles")]}get inputInnerStyles(){return`\n      input#${this._formElementId}::-webkit-inner-spin-button,\n      input#${this._formElementId}::-webkit-outer-spin-button {\n        -webkit-appearance: none;\n        margin: 0;\n      }\n      input#${this._formElementId}::-webkit-clear-button,\n      input#${this._formElementId}::-webkit-search-decoration,\n      input#${this._formElementId}::-webkit-search-cancel-button,\n      input#${this._formElementId}::-webkit-search-results-button,\n      input#${this._formElementId}::-webkit-search-results-decoration {\n        appearance: none;\n        display: none;\n      }\n    `}get field(){return E`
      <div class="field" @focusin="${this._onFocusin}" @focusout="${this._onFocusout}">
        ${this.labelledInput} ${this.clearButton}
      </div>
    `}get fieldAction(){return E`
      <div
        class="wrapper"
        @keydown="${e=>13===e.keyCode&&!this.readonly&&!this.actionIconSecondary&&this.submitInput()}"
      >
        ${this.field} ${!this.readonly&&this.actionType?this.actionButton:this.rightIcon}
      </div>
    `}get clearButton(){return E`
      <bbva-button-icon
        tabindex="-1"
        class="clear"
        .icon="${this.clearIcon}"
        .size="${this.clearIconSize}"
        @click="${this.clearInput}"
        variant="no-background"
        aria-label="${this.t(this.clearAccessibleText)}"
      >
      </bbva-button-icon>
    `}get isSecondary(){return this.actionIconSecondary&&this._secondary}get actionButton(){return E` <bbva-button-icon
      class="action"
      type="${this.actionType}"
      ?disabled="${this.disabled||this.disabledButton||this.readonly}"
      .icon="${this.isSecondary?this.actionIconSecondary:this.actionIcon}"
      .size="${this.isSecondary?this.actionIconSecondarySize:this.actionIconSize}"
      @click="${this.isSecondary?this.switchIcon:this._actionEvent}"
      aria-label="${this.isSecondary?this.t(this.actionSecondaryAccessibleText):this.t(this.actionAccessibleText)}"
      .variant="${this.actionVariant}"
    >
    </bbva-button-icon>`}get rightIcon(){return this.actionIcon?E`
          <div class="wrapper-action">
            <bbva-core-icon
              .icon="${this.actionIcon}"
              .size="${this.actionIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
          </div>
        `:""}get _actionEvent(){return this.actionIconSecondary?this.switchIcon:this.submitInput}switchIcon(){this._secondary=!this._secondary,this.requestUpdate(),this.dispatchEvent(new CustomEvent("form-field-button-switch",{detail:this._secondary,bubbles:!0,composed:!0}))}get messageError(){return this._errorVisible?E`
          <div class="message error" role="alert">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.errorIcon}"
              .size="${this.errorIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.errorMessage)}</span>
          </div>
        `:""}get messageInfo(){return this.infoMessage?E`
          <div class="message info">
            <bbva-core-icon
              class="message-icon"
              .icon="${this.infoIcon}"
              .size="${this.infoIconSize}"
              aria-hidden="true"
            ></bbva-core-icon>
            <span>${this.t(this.infoMessage)}</span>
          </div>
        `:""}_onFocusin(){this.readonly||setTimeout((()=>{this._focus()}),1)}_onFocusout(){this.readonly||setTimeout((()=>{const e=this._rootNode.activeElement,t=this.shadowRoot.activeElement||e;this._field.contains(t)||e===this._formElement||(this._blur(),this.validateOnBlur&&this.validate())}),1)}_focus(){this.setAttribute("focused",""),this.dispatchEvent(new CustomEvent("form-field-input-focus"))}_blur(){this.removeAttribute("focused"),this.dispatchEvent(new CustomEvent("form-field-input-blur"))}clearInput(){this._formElement&&(this._formElement.value="",this._formElement.dispatchEvent(new CustomEvent("input",{detail:!0,bubbles:!0})),this.dispatchEvent(new CustomEvent("form-field-input-clear",{detail:!0,bubbles:!0,composed:!0})),this.focus())}_helpClicked(){this.dispatchEvent(new CustomEvent("form-field-help-click",{detail:!0,bubbles:!0,composed:!0}))}submitInput(){this.dispatchEvent(new CustomEvent("form-field-button-submit",{detail:this.value,bubbles:!0,composed:!0}))}render(){return E`
      ${this._labelOut} ${this.actionIntoForm?this.fieldAction:this.field} ${this.messageError}
      ${this.messageInfo}
    `}}D("colors.cool70"),D("colors.primaryCoreLightened"),D("colors.cool20"),D("colors.primaryCoreLightened"),D("colors.primaryCoreLightened"),D("colors.primaryCoreLightened"),D("colors.primaryCoreLightened"),D("colors.cool20"),D("colors.cool20"),D("colors.cool20"),D("colors.cool20"),D("colors.primaryCoreLightened"),D("colors.primaryCoreLightened"),D("colors.tertiaryType1Light"),D("colors.cool20"),D("colors.cool20"),D("colors.cool70"),D("colors.primaryCoreLightened"),D("colors.tertiaryType1Light"),D("colors.tertiaryType1Light"),D("colors.tertiaryType1Light"),D("colors.primarySubdued"),D("colors.primaryCoreLightened"),D("colors.tertiaryType1Light"),D("colors.primaryCoreLightened"),D("colors.primaryCoreLightened"),D("colors.primaryCoreLightened");const oe=new l;var re=n`:host {
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

.with-flag .slot-input ::slotted(input) {
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem);
}
${oe.mediaRules()}`;const ne={dark:n`
    ${te.dark}
  `,light:n`
    ${te.light}
  `};class se extends(v(ae)){static get is(){return"bbva-form-text"}static get scopedElements(){return{"bbva-clip-flag":V,"bbva-button-icon":g,"bbva-core-icon":S,"bbva-text":k}}static get properties(){return{flagSize:{type:String,attribute:"flag-size"},flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="text",this.flagSize="small",this.flagText=""}static get styles(){return[super.styles,re,ne.light,ne.dark,L("bbva-form-text-shared-styles")]}get field(){return E`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return E`
      ${this.flag?E`
            <span class="flag">
              <bbva-clip-flag
                icon="${T(this.flag)}"
                .size="${this.flagSize}"
                iconset="${T(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get labelBlock(){return E`
      <span class="label" aria-hidden="true" @click="${this.focus}">${this.inputLabel}</span>
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}customElements.define(se.is,se);const le=new l;var ce=n`:host {
  --bbva-link-font-size: var(--typographyTypeMedium, ${s(b.typeMedium)});
  --bbva-link-line-height: var(--lineHeightTypeMedium, ${s(m.typeMedium)});
  display: flex;
  box-sizing: border-box;
  align-items: flex-start;
  width: 100%;
  padding: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1rem);
  --_list-link-description-heading-color: var(--bbva-list-link-description-heading-dark-mode-color, var(--bbva-list-link-description-heading-color, var(--colorsSecondary600, ${s(c.secondary600)})));
  --_list-link-description-tick-color: var(--bbva-list-link-description-tick-dark-mode-color, var(--bbva-list-link-description-tick-color, var(--colorsTertiaryType6Medium, ${s(c.tertiaryType6Medium)})));
  --_list-link-description-close-color: var(--bbva-list-link-description-close-dark-mode-color, var(--bbva-list-link-description-close-color, var(--colorsTertiaryType1Dark, ${s(c.tertiaryType1Dark)})));
  --_list-link-description-text-color: var(--bbva-list-link-description-text-dark-mode-color, var(--bbva-list-link-description-text, var(--colorsSecondary600, ${s(c.secondary600)})));
  --_list-link-description-icon-color: var(--bbva-list-link-description-icon-dark-mode-color, var(--bbva-list-link-description-icon-color, var(--colorsSecondary600, ${s(c.secondary600)})));
  --_list-link-description-link-icon-color: var(--bbva-list-link-description-link-icon-dark-mode-color, var(--bbva-list-link-description-link-icon-color, var(--colorsPrimaryMedium, ${s(c.primaryMedium)})));
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

.heading {
  font-size: var(--typographyTypeMedium, ${s(b.typeMedium)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${s(h.medium.fontWeight)});
  font-style: var(--fontFacePrimaryMediumFontStyle, ${s(h.medium.fontStyle)});
  line-height: var(--lineHeightTypeMedium, ${s(m.typeMedium)});
  color: var(--_list-link-description-heading-color);
}

.tick {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1em);
  flex-shrink: 0;
  color: var(--_list-link-description-tick-color);
}

.close {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1em);
  flex-shrink: 0;
  color: var(--_list-link-description-close-color);
}

.content {
  max-height: 4.5rem;
  overflow: hidden;
  display: inline-block;
  display: -webkit-box;
  -webkit-line-clamp: 3;
  -webkit-box-orient: vertical;
  text-overflow: ellipsis;
  font-size: var(--typographyTypeSmall, ${s(b.typeSmall)});
  font-weight: var(--fontFacePrimaryBookFontWeight, ${s(h.book.fontWeight)});
  font-style: var(--fontFacePrimaryBookFontStyle, ${s(h.book.fontStyle)});
  line-height: var(--lineHeightTypeSmall, ${s(m.typeSmall)});
  color: var(--_list-link-description-text-color);
}

.icon {
  flex-shrink: 0;
  margin-right: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${s(u.spacer)}))) / 16) * 1em);
  color: var(--_list-link-description-icon-color);
}
.icon.link {
  color: var(--_list-link-description-link-icon-color);
}
${le.mediaRules()}`;var de=n`[ambient^=light] {
  --bbva-list-link-description-link-icon-color: initial;
  --bbva-list-link-description-tick-color: initial;
  --bbva-list-link-description-close-color: initial;
  --bbva-list-link-description-text: initial;
  --bbva-list-link-description-icon-color: initial;
  --bbva-list-link-description-heading-color: initial;
}
${(new l).mediaRules()}`;const pe=new l;const be={dark:n`
    ${n`[ambient^=dark] {
  --bbva-list-link-description-link-icon-color: var(--colorsPrimarySubdued, ${s(c.primarySubdued)});
  --bbva-list-link-description-tick-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-list-link-description-close-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-list-link-description-text: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-list-link-description-icon-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
  --bbva-list-link-description-heading-color: var(--colorsPrimaryCoreLightened, ${s(c.primaryCoreLightened)});
}
${pe.mediaRules()}`}
    ${p.dark}
  `,light:n`
    ${de}
    ${p.light}
  `};class me extends(v(A)){static get is(){return"bbva-list-link-description"}static get scopedElements(){return{"bbva-core-heading":M,"bbva-core-icon":S,"bbva-link":_}}static get properties(){return{link:{type:String},headingLevel:{type:Number,attribute:"heading-level"},heading:{type:String},icon:{type:String},iconSize:{type:Number,attribute:"icon-size"},ticked:{type:String},noLink:{type:Boolean,attribute:"no-link"}}}constructor(){super(),this.iconSize=24}static get styles(){return[ce,L("bbva-list-link-description-shared-styles"),be.dark,be.light]}_clicked(){this.dispatchEvent(new CustomEvent("list-link-description-item-click",{detail:!0,bubbles:!0,composed:!0}))}render(){return E`
      ${this.icon?E`
            <bbva-core-icon
              class="icon ${q({link:!this.noLink})}"
              .icon="${this.icon}"
              .size="${this.iconSize}"
            ></bbva-core-icon>
          `:E``}
      <div class="main-content">
        <bbva-core-heading class="heading" .level="${T(this.headingLevel)}">
          ${this.noLink?this.heading:E`
                <bbva-link .href="${T(this.link)}" @click="${this._clicked}"
                  >${this.heading}</bbva-link
                >
              `}
        </bbva-core-heading>
        <div class="content">
          <slot></slot>
        </div>
      </div>
      ${this.ticked?E`
            <bbva-core-icon
              class="${q({tick:"yes"===this.ticked,close:"no"===this.ticked})}"
              icon="${"yes"===this.ticked?B():$()}"
              .size="${this.iconSize}"
            ></bbva-core-icon>
          `:E``}
    `}}customElements.define(me.is,me);var he=n`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

[ambient^=dark] {
  --bbva-text-color: var(--colorsPrimaryCoreLightened, #ffffff);
}

bbva-expandable-multistep[all-completed=max-height] {
  max-height: 30rem;
}

.center-button {
  margin: 1rem auto;
  display: flex;
  max-width: 8.5rem;
  padding: 0.75rem 1rem;
}

.margin-up {
  margin-top: 1rem;
}

.text-center {
  text-align: center;
}

.summary {
  color: white;
}

.step-last {
  padding-bottom: 2rem;
  padding-left: 1rem;
}

.expandable-step-content {
  padding-left: 1rem;
  padding-right: 1rem;
  margin: auto;
}

.expandable-step-summary {
  padding-left: 1rem;
  padding-right: 1rem;
  margin: auto;
}
`;class ue extends(v(y(A))){static get is(){return"bbva-multistep-onboarding-payroll-account"}static get scopedElements(){const e=[Y,z,N,O,R,F,se,_,i,me,Q,U,j,k];return ue.scopedElementsFromClasses(e)}static get properties(){return{allowedPattern:{type:String},businessData:{type:Object},buttonGetCompanyData:{type:Boolean},codeCompanyLength:{type:Number},codeSize:{type:Number},companyDataFound:{type:Boolean},dataAccount:{type:Object},dataCustomer:{type:Object},hideNotification:{type:Boolean},qrConfigPayroll:{type:Object},patternFormText:{type:String},statusCheckPrivacy:{type:Boolean},statusCheckTerms:{type:Boolean},totalSteps:{type:Number},visibleChars:{type:Number}}}constructor(){super(),this.allowedPattern="[0-9]",this.codeSize=10,this.patternFormText="[0-9]{10}",this.totalSteps=2,this.visibleChars=5,this._initProperties()}_initProperties(){this.businessData={},this.buttonGetCompanyData=!0,this.codeCompanyLength=0,this.companyDataFound=!1,this.dataAccount={},this.dataCustomer={},this.hideNotification=!1,this.statusCheckTerms=!1,this.statusCheckPrivacy=!1,this.qrConfigPayroll={}}reset(){this._getExpandableMultistepElement.removeAttribute("all-completed"),this._getOfferDetailElement.completed=!1,this._getTermsConditionsElement.completed=!1,this._getTermsConditionsElement.disabled=!0;this.shadowRoot.querySelector("#checkbox-terms").checked=!1;this.shadowRoot.querySelector("#checkbox-privacy").checked=!1,this.companyDataFound||(this.codeValue.value=""),this._initProperties(),this._dispatchEvent("payroll-link-benefits-send-value-linking-button",!0)}_dispatchEvent(e="",t=null){this.dispatchEvent(new CustomEvent(e,{bubbles:!0,composed:!0,detail:t}))}static get styles(){return[he,H.dark,be.dark,W.dark,L("bbva-multistep-onboarding-payroll-account-shared-styles")]}get _accountLinkStep(){return this._renderExpandableStep({id:"stepAccountLink",index:null,header:this.t("payroll-multistep-account-link-step-title"),hideStepNumber:!0,hidePadding:!0,summary:this._renderAccountLinkStepSummary(),editLabel:"",prefilled:!0})}get _companyDataStep(){return this._renderExpandableStep({id:"stepOfferDetail",index:1,header:this.t("payroll-multistep-company-data-step-title"),hideStepNumber:!1,hidePadding:!0,content:this._renderContentCompany(),summary:this._renderCompanyDataStepSummary(),editLabel:this.t("payroll-multistep-company-data-step-edit-label"),prefilled:!1})}get _termsConditionStep(){return this._renderExpandableStep({id:"stepTermsConditions",index:2,header:this.t("payroll-multistep-terms-and-conditions-step-title"),hideStepNumber:!1,hidePadding:!0,content:this._renderStepTermsConditions(),summary:this._renderSummaryTermsConditions(),editLabel:this.t("payroll-multistep-terms-and-conditions-step-edit-label"),prefilled:!1})}get _getNameCustomer(){return`<strong>${this.t("payroll-multistep-terms-and-conditions-content-text-name",{nameCustomer:this.dataCustomer.firstName})}</strong>${this.t("payroll-multistep-company-data-content-notification-message-1")}`}get codeValue(){return this.renderRoot.querySelector("#code-company")}get _getMessageNotification(){return`${this.t("payroll-multistep-company-data-content-notification-message-1")}<br><br>${this.t("payroll-multistep-company-data-content-notification-message-2")}`}get _getStatusButtonTerms(){return!this.statusCheckPrivacy||!this.statusCheckTerms}get _getOfferDetailElement(){return this.shadowRoot.querySelector("#stepOfferDetail")}get _getTermsConditionsElement(){return this.shadowRoot.querySelector("#stepTermsConditions")}get _getExpandableMultistepElement(){return this.shadowRoot.querySelector("#expandable_multistep")}resetCodeWrong(){this.businessData={},this.companyDataFound=!1,this.buttonGetCompanyData=!0}_editStep(){this._getExpandableMultistepElement.removeAttribute("all-completed"),this._getOfferDetailElement.completed||this.resetCodeWrong(),this._dispatchEvent("payroll-link-benefits-send-value-linking-button",!0)}_getCurrentStep({step:e}){return this.t("payroll-multistep-expandable-total-step-title",{index:e,total:this.totalSteps})}_validateCode(){const{shadowRoot:e}=this;this.codeCompanyLength=e.querySelector("#code-company").value.length,this.buttonGetCompanyData=this.codeCompanyLength!==this.codeSize}_getCompanyData(){this._dispatchEvent("show-spinner");const e=this.shadowRoot.querySelector("#code-company").value;this._dispatchEvent("send-company-code",e)}setCodeCompany(e){this.shadowRoot.querySelector("#code-company").value=e,this._dispatchEvent("hide-spinner"),this.buttonGetCompanyData=!1}dataBusinessObject(e){this.businessData=e||{},(this.businessData||{}).id?this.companyDataFound=!0:this.businessData={},this._dispatchEvent("hide-spinner")}_companyDataNotFound(){this._dispatchEvent("payroll-link-benefits-show-modal-company-data-not-found")}_nextStepOfferDetail(){this._getOfferDetailElement.completed=!0,this._getTermsConditionsElement.completed&&(this._dispatchEvent("payroll-link-benefits-send-value-linking-button",!1),this._getExpandableMultistepElement.setAttribute("all-completed","max-height")),this._dispatchEvent("send-number-account",this.dataAccount.number),this._dispatchEvent("send-company-data",this.businessData)}_notificationMessageLink(){this._dispatchEvent("notification-message-link-click")}_linkQrClick(){this._dispatchEvent("payroll-link-benefits-send-qr-config",this.qrConfigPayroll),this._dispatchEvent("payroll-link-benefits-page-show-qr")}_termsClick(){this._dispatchEvent("payroll-link-benefits-page-set-text-modal-terms-and-conditions",this._setTextModalTerms()),this._dispatchEvent("payroll-link-benefits-page-modal-terms-and-conditions")}_privacyClick(){this._dispatchEvent("payroll-link-benefits-page-modal-privacy-notice")}_setTextModalTerms(){return this.t("payroll-benefits-page-modal-terms-text-content",{nameBusiness:this.businessData.legalName})}_onStatusChangedTerms(){this.statusCheckTerms=!this.statusCheckTerms}_onStatusChangedPrivacy(){this.statusCheckPrivacy=!this.statusCheckPrivacy}_nextStepTermsConditions(){this._getTermsConditionsElement.completed=!0,this._getExpandableMultistepElement.setAttribute("all-completed","max-height");this._dispatchEvent("payroll-link-benefits-send-value-linking-button",!1)}_renderAccountLinkStepSummary(){return E`
      <bbva-list-multistep-account
        name="${this.dataAccount.name}"
        amount="${this.dataAccount.amount}"
        number="${this.dataAccount.number}"
        description="${this.dataAccount.description}"
        visible-chars="${this.visibleChars}"
        currency-code="${this.dataAccount.currentBalances}"
        language="es-MX"
        local-currency="${this.dataAccount.currentBalances}">
      </bbva-list-multistep-account>
    `}_renderContentCompany(){return this.companyDataFound?this._renderCompanyDataSuccessStep():this._renderCompanyDataStep()}_renderCompanyDataStep(){return E`
      <div class="text">
        <bbva-text text="${this.t("payroll-multistep-company-data-content-text")}">
        </bbva-text>
      </div>
      <div class="fromText">
        <bbva-form-text
          id="code-company"
          maxlength="10"
          type="tel"
          pattern="${this.patternFormText}"
          allowed-pattern="${this.allowedPattern}"
          label="${this.t("payroll-multistep-company-data-content-form-text-label")}"
          optional-label=""
          info-message="${this.t("payroll-multistep-company-data-content-form-text-info-message")}"
          error-message="${this.t("payroll-multistep-error-message-input")}"
          auto-validate
          @bbva-core-input-validate="${e=>this._validateInputCompanyCode(e)}"
          @input="${this._validateCode}">
        </bbva-form-text>
      </div>
      <div class="margin-up text-center">
        <bbva-link
          id="link-qr"
          @click="${this._linkQrClick}">
          ${this.t("payroll-multistep-company-data-content-link-text")}
        </bbva-link>
      </div>
      <div class="margin-up">
        <bbva-notification-message
          id="notification-message-link"
          message="${this._getMessageNotification}"
          link-title="${this.t("payroll-multistep-company-data-content-notification-link")}"
          ?hidden="${this.hideNotification}"
          @notification-message-link-click="${this._notificationMessageLink}">
        </bbva-notification-message>
      </div>
      <div>
        <bbva-button-default
          id="btn-get-company"
          class="center-button margin-up"
          text="${this.t("payroll-multistep-company-data-content-button-text")}"
          variant="default"
          ?disabled="${this.buttonGetCompanyData}"
          @click="${this._getCompanyData}">
        </bbva-button-default>
      </div>
    `}_validateInputCompanyCode(e){const t=e;t.target.infoMessage=t.target.invalid?"":t.target.getAttribute("info-message")}_renderCompanyDataSuccessStep(){return E`
      <div class="margin-up">
        <bbva-notification-message
          variant="success"
          message="${this.t("payroll-multistep-company-data-success-content-notification-message")}">
        </bbva-notification-message>
      </div>
      <div class="margin-up">
        <bbva-list-simple
          variant="stacked"
          label="${this.t("payroll-multistep-company-data-success-content-business-list-label")}"
          description="${this.businessData.legalName}"></bbva-list-simple>
      </div>
      <div>
        <bbva-list-simple
          variant="stacked"
          label="${this.t("payroll-multistep-company-data-success-content-code-list-label")}"
          description="${this.businessData.id}"></bbva-list-simple>
      </div>
      <div class="action">
        <bbva-button-default
          id="btn-next-step"
          class="center-button"
          text="${this.t("payroll-multistep-company-data-content-button-text")}"
          variant="default"
          @click="${this._nextStepOfferDetail}">
        </bbva-button-default>
      </div>
      <div class="action">
        <bbva-button-default
          id="btn-company-not-found"
          class="center-button"
          text="${this.t("payroll-multistep-company-data-success-content-back-button-text")}"
          variant="link"
          @click="${this._companyDataNotFound}">
        </bbva-button-default>
      </div>
    `}_renderCompanyDataStepSummary(){return E`
      <bbva-list-link-description
        heading="${this.t("payroll-multistep-company-data-success-content-business-list-label")}" 
        no-link
        ambient="dark">
        ${this.businessData.legalName}
      </bbva-list-link-description>
    `}_renderStepTermsConditions(){return E`
      <div>
        <bbva-text
          text="${this._getNameCustomer}">
        </bbva-text>
      </div>
      <div class="margin-up">
        <bbva-link
          id="link-terms" 
          @click="${this._termsClick}">
          ${this.t("payroll-multistep-terms-and-conditions-content-link-terms")}
        </bbva-link>
      </div>
      <div class="margin-up">
        <bbva-link
          id="link-privacy" 
          @click="${this._privacyClick}">
          ${this.t("payroll-multistep-terms-and-conditions-content-link-privacy")}
        </bbva-link>
      </div>
      <div class="margin-up">
        <bbva-form-checkbox
          id="checkbox-terms"
          label="${this.t("payroll-multistep-terms-and-conditions-content-checkbox-terms")}"
          required
          @change="${this._onStatusChangedTerms}">
        </bbva-form-checkbox>
      </div>
      <div>
        <bbva-form-checkbox
          id="checkbox-privacy"
          label="${this.t("payroll-multistep-terms-and-conditions-content-checkbox-privacy")}"
          required
          @change="${this._onStatusChangedPrivacy}">
        </bbva-form-checkbox>
      </div>
      <div class="margin-up">
        <bbva-text
          text="${this.t("payroll-multistep-terms-and-conditions-content-text-2")}">
        </bbva-text>
      </div>
      <div class="action">
        <bbva-button-default
          id="btn-terms-and-conditions"
          class="center-button"
          text="${this.t("payroll-multistep-company-data-content-button-text")}"
          variant="default"
          ?disabled="${this._getStatusButtonTerms}"
          @click="${this._nextStepTermsConditions}">
        </bbva-button-default>
      </div>
    `}_renderSummaryTermsConditions(){return E`
      <bbva-badge-check
        class="step-last"
        icon="correct"
        description="${this.t("payroll-multistep-terms-and-conditions-summary-badge-check")}"
        ambient="dark">
      </bbva-badge-check>
    `}_renderExpandableStep({id:e,index:t,header:i,hideStepNumber:a,hidePadding:o,content:r,summary:n,editLabel:s,prefilled:l}){return E`
      <bbva-expandable-step
        id="${e}"
        ?hide-padding-left="${o}"
        ?hide-padding-right="${o}"
        ?prefilled="${l}"
        header="${this.t(i)}"
        edit-label="${s}"
        @expandable-step-edit-step="${this._editStep}"
        view-label=""
        ?hide-step-number="${a}"
        total-steps="${this.totalSteps}"
        current-step-label="${this._getCurrentStep({step:t})}"
        step="${t}">
        <div class="expandable-step-content">
          ${r}
        </div>
        <div slot="summary" ambient="dark">
          ${n}
        </div>
      </bbva-expandable-step>
    `}render(){return E`
      <bbva-expandable-multistep id="expandable_multistep">
        ${this._accountLinkStep}
        ${this._companyDataStep}
        ${this._termsConditionStep}
      </bbva-expandable-multistep>
    `}}customElements.define(ue.is,ue);class ve extends(a(y(A))){static get is(){return"bbva-manager-payroll-link-benefits"}static get properties(){return{account:{type:Object},buttonLink:{type:Boolean},dataCompany:{type:Object},dataCustomer:{type:Object},dataVinculationRequests:{type:Object},headerTitle:{type:String},data:{type:Object},companyCode:{type:String},buttonTextModal:{type:String},qrConfigPayroll:{type:Object},configSelected:{type:String},dateFormat:{type:String}}}constructor(){super(),this.account={},this.buttonLink=!0,this.dataCompany={},this.dataCustomer={},this.dataVinculationRequests={},this.headerTitle="payroll-link-page-header-title",this.data={},this.companyCode="",this.buttonTextModal="payroll-page-default-button-text",this.qrConfigPayroll={},this.configSelected="default",this.dateFormat="DD MMMM YYYY, HH:mm [h]"}setLocales(){this._dispatchEvent("set-payroll-page-header-title",this.t(this.headerTitle)),this._dispatchEvent("set-payroll-benefits-button-text-modal",this.t(this.buttonTextModal))}requestAccount(){var e;const t=(null===(e=this.data)||void 0===e?void 0:e.magicLogAccess)||!1,{nativeAccess:i}=this.data,a=this.data.contract;let o={};if(t||i){const e={description:"Saldo Disponible"};o={...a.map((e=>({name:e.productName,amount:e.amount,number:e.number,description:"Saldo Disponible",currentBalances:e.currency})))[0],...e}}else o={name:this.account.name,amount:this.account.primaryAmount.amount,number:this.account.number,description:this.account.specificAmounts[0].name,currentBalances:this.account.primaryAmount.currency};this.setLocales(),this._dispatchEvent("response-account",o)}backButtonHeader(){this._showGenericModal("CONFIRM-EXIT-PAYROLL-LINK-BENEFITS-OPERATIVE","payroll-send-modal-config","payroll-link-page-alert-exit-header-button-accept","payroll-link-page-alert-exit-header-button-cancel",!1,"error","coronita:alert","","payroll-link-page-alert-exit-header-text")}validateLeavePayrollLinkBenefits(){const e=void 0!==this.data.magicLogAccess&&this.data.magicLogAccess?"logout-payroll-operative":"navigate-to-pda-from-payroll-link-benefits";this._dispatchEvent(e)}backCompanyDataStep(){this._showGenericModal("CONFIRM-BACK-TO-COMPANY-DATA-STEP","payroll-send-modal-config","payroll-page-default-button-text","",!1,"info","coronita:info","payroll-benefits-page-alert-back-to-company-data-title-text","payroll-benefits-page-alert-back-to-company-data-content-text")}requestCompanyCode(e){this._openControlVeil(),this.companyCode=e,this._dispatchEvent("request-info-company-payroll",this.companyCode)}retryCompanyCodeRequest(){this._openControlVeil(),this._dispatchEvent("request-info-company-payroll",this.companyCode)}companyCodeWrong(e){var t;const i=(null==e||null===(t=e.messages[0])||void 0===t?void 0:t.message.slice(0,8))||"";if(this._closeControlVeil(),"01145013"===i){const e={code:"COMPANY-CODE-WRONG",selectedConfig:this._getMediaModalConfig({title:"payroll-benefits-page-alert-company-code-wrong-title-text",text:"payroll-benefits-page-alert-company-code-wrong-content-text",btnAccept:"payroll-benefits-page-alert-company-code-wrong-button-text"})};this._dispatchEvent("payroll-send-modal-config",e),this._dispatchEvent("error-company-code-analytics")}else this._dispatchEvent("retry-error",this._getRetryMediaModal("PAYROLL-CODE-NOT-AVAILABLE"))}_assignGetDataVinculationRequests(){var e,t;return{body:{employee:{contract:{number:this.isLocal?(null===(e=this.data)||void 0===e||null===(t=e.contract[0])||void 0===t?void 0:t.number)||0:this.account.number,numberType:{id:"SIMPLE_ACCOUNT"}}}},codeCompany:this.dataCompany.id}}getNextPage(){this._openControlVeil(),this._dispatchEvent("send-data-vinculation-requests-payroll-link-success",this._assignGetDataVinculationRequests())}validateNavigation(){var e,t,i,a,o;const r=(null===(e=this.data)||void 0===e||null===(t=e.contract)||void 0===t||null===(i=t[0])||void 0===i?void 0:i.id)||"",n=(null===(a=this.data)||void 0===a||null===(o=a.contract[0])||void 0===o?void 0:o.level)||"04",s={"02":()=>{this._dispatchEvent("payroll-e2e-page-params",this.data),this._dispatchEvent("navigate-payroll-e2e-page",{page:"portability-expedient-compleated"})},"04":()=>{this._dispatchEvent("send-product-id-payroll-portability",{accountId:r}),this._dispatchEvent("navigate-payroll-portability",{page:"portability-create-page"})}};s[n]&&s[n]()}successQrPayment(e){if(this._closeControlVeil(),Number.isNaN(parseInt(e,10))||10!==e.toString().length){const e={code:"PAYROLL-QR-INVALID",primaryButtonClass:"secondary",selectedConfig:this._getCallConfig({btnAccept:"payroll-benefits-page-alert-company-code-wrong-button-text",title:"payroll-benefits-error-title-qr",subTitle:"payroll-benefits-error-subtitle-qr",text:"payroll-benefits-error-text-qr"})};this._dispatchEvent("error-qr-analytics"),this._dispatchEvent("payroll-send-modal-config",e)}else this._dispatchEvent("send-company-code-from-qr",e)}openQrScanner(){this._dispatchEvent("reopen-qr-scanner")}validateVinculationRequestsSuccess(){if(this.isLocal&&""===this.customerEmail){var e;const t=(null===(e=this.data)||void 0===e?void 0:e.customerId)||"";return this._dispatchEvent("send-customer-id",t),void this._dispatchEvent("get-customer-details",{customerId:t})}this._navigateSuccessReview()}_navigateSuccessReview(){this._closeControlVeil();const e=moment().format(this.dateFormat);this._dispatchEvent("send-customer-email",this._setCustomerEmail()),this._dispatchEvent("send-date-time",e),this._dispatchEvent("navigation-payroll-link-success")}handleCustomerDetailSuccess(e){var t;this.customerEmail=(null==e||null===(t=e.contactDetails[1])||void 0===t?void 0:t.contact)||"",this._navigateSuccessReview()}handleCustomerDetailError(){this.customerEmail="",this._navigateSuccessReview()}validateVinculationRequestsError(e){if(this._closeControlVeil(),e.messages[0].message.includes(this.errorLinkExist)){const e={code:"PAYROLL-VINCULATION-REQUESTS-EXISTING-ERROR",primaryButtonClass:"secondary",selectedConfig:this._getCallConfig({btnAccept:"payroll-link-page-alert-exit-header-button-accept",title:"payroll-link-page-header-title",subTitle:"payroll-benefits-vinculation-requests-existing-subtitle",text:"payroll-benefits-vinculation-requests-existing-text"})};this._dispatchEvent("payroll-send-modal-config",e)}else{const e={code:"PAYROLL-VINCULATION-REQUESTS-ERROR",primaryButtonClass:"secondary",selectedConfig:this._getCallConfig({text:"payroll-page-modal-body-operation-not-available"})};this._dispatchEvent("payroll-send-modal-config",e)}}handleBussinessCodeSuccess(e){this._closeControlVeil(),this._dispatchEvent("send-info-company-service",e),this._sendAppStepAnalytics(3)}handleDataCompany(e){this.dataCompany=e,this._sendAppStepAnalytics(4)}handleStatusButton(e){this.buttonLink=e,e||this._sendAppStepAnalytics(5)}_sendAppStepAnalytics(e){this._dispatchEvent("send-app-step-analytics",e)}openTermsAndConditionsModal(){const e=[{title:this.t("payroll-benefits-page-modal-terms-title"),class:"text-align-left"},{title:this.t("payroll-modal-terms-text-content-before")+this.dataCompany.legalName+this.t("payroll-modal-terms-text-content-after"),class:"text-align-left normal"},{title:this.t("payroll-benefits-page-modal-terms-bullet-list-1"),class:"tiled-title normal features-title-text margin-bottom-none"},{title:this.t("payroll-benefits-page-modal-terms-bullet-list-2"),class:"tiled-title normal features-title-text margin-bottom-none"}],t=this._getModalWithBanner({code:"PAYROLL-TERMS-AND-CONDITIONS",title:"payroll-benefits-page-modal-terms-header-text",valueList:e});this._dispatchEvent("payroll-send-modal-config",t)}openPrivacyModal(){const e=[{title:this.t("payroll-benefits-page-modal-privacy-title"),class:"text-align-left"},{title:this.t("payroll-benefits-page-modal-privacy-text-content"),class:"text-align-left spacing normal"},{title:this.t("payroll-benefits-page-modal-privacy-text-content-2"),class:"text-align-left spacing normal"}],t=this._getModalWithBanner({code:"PAYROLL-PRIVACY-NOTICE",title:"payroll-benefits-page-modal-privacy-header-text",valueList:e});this._dispatchEvent("payroll-send-modal-config",t)}managePluginParams(){this._openControlVeil(),this._dispatchEvent("glomo-qr-plugin-params",this.qrConfigPayroll[this.configSelected])}qrDataReadSuccess(e={content:"{}"}){const t=this._parseQrContent(e.content);this._dispatchEvent("qr-content-success",t)}manageCloseProcess(){this._dispatchEvent("close-control-veil")}_parseQrContent(e){try{return JSON.parse(e)}catch{return null}}}customElements.define(ve.is,ve);class ye extends(G(A)){static get is(){return"bbva-dataprovider-payrolls"}static get properties(){return{host:{type:String},apiVersion:{type:String,attribute:"api-version"},requiredToken:{type:String,attribute:"required-token"},native:{type:Boolean,attribute:"native"},headers:{type:Object,attribute:"headers"},timeout:{type:Number,attribute:"timeout"},htmlContext:{type:Object,attribute:"htmlContext"}}}constructor(){super(),this.apiVersion="0",this.requiredToken="tsec",this.native=!1,this.headers={},this.timeout=120,this.htmlContext=this}getPayrollBusinesses(e){const t={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},params:{"business-id":e},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1},i=ye._servicePayrollsBusinessesBusinessGetV0(t);this._generateGetService(i,{customEvent:"get-payroll-businesses-v0-success",errorFireEventHandler:"get-payroll-businesses-v0-error"})}postPayrollsBusinessesVinculationRequests(e){const t={host:this.host,headers:this.headers,body:e.body,params:{"business-id":e.codeCompany},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1},i=ye._servicePayrollBusinessVinculationRequestsPostV0(t);this._generateGetService(i,{customEvent:"post-payroll-business-vinculation-requests-v0-success",errorFireEventHandler:"post-business-vinculation-requests-v0-error"})}getBusinessVinculationId(e){const t={host:this.host,headers:{...this.headers,"Content-Type":"application/json"},params:{"business-vinculation-id":e},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,htmlContext:this.htmlContext},i=ye._serviceBusinessVinculationIdGetV0(t);this._generateGetService(i,{customEvent:"get-business-vinculation-id-v0-success",errorFireEventHandler:"get-business-vinculation-id-v0-error"})}postBusinessVinculationPayrollRequest(e){const t={host:this.host,headers:this.headers,body:e.body,params:{"business-vinculation-id":e.codeCompany},version:this.apiVersion,requiredToken:this.requiredToken,native:this.native,timeout:this.timeout,forceBoundary:!1,htmlContext:this.htmlContext},i=ye._serviceBusinessVinculationPayrollRequestsPostV0(t);this._generateGetService(i,{customEvent:"post-business-vinculation-payroll-requests-v0-success",errorFireEventHandler:"post-business-vinculation-payroll-requests-v0-error"})}static _servicePayrollsBusinessesBusinessGetV0(e){return new X(e)}static _servicePayrollBusinessVinculationRequestsPostV0(e){return new J(e)}static _serviceBusinessVinculationIdGetV0(e){return new o(e)}static _serviceBusinessVinculationPayrollRequestsPostV0(e){return new r(e)}}customElements.define(ye.is,ye);class fe extends(a(y(A))){static get is(){return"bbva-manager-onboarding-payroll-account-analytics"}static get properties(){return{data:{type:Object}}}constructor(){super(),this.data={}}appSearchCompanyStep(e){const t=e.name.toLowerCase().replace(/[^\w\s]/gi,"");this._persistData({name:t}),this._dispatchEvent("fire-app-search-company-step-analytics",this.data)}createNameAppStep(e){const t={3:"fire-app-company-found-step-analytics",4:"fire-app-terms-and-conditions-step-analytics",5:"fire-app-view-request-link-step-analytics"};if(!t[e])return;const i=t[e];this._dispatchEvent(i,this.data)}createAppCompleted(){this._dispatchEvent("fire-app-completed-analytics",this.data)}createFootPrintVinculationExist(e){var t,i;((null==e||null===(t=e.messages)||void 0===t||null===(i=t[0])||void 0===i?void 0:i.message)||"").includes(this.errorLinkExist)&&this._dispatchEvent("fire-app-error-vinculation-exist-analytics")}_persistData(e){Object.assign(this.data,e)}}customElements.define(fe.is,fe);
