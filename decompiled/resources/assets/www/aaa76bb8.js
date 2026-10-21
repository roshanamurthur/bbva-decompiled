import{z as a,a8 as t,ar as e,aa as i,aE as s,a as l,aF as r,aG as n,aH as g,af as c,ag as o,ak as f,h as b,i as p}from"./952f98a9.js";const h=new e;var d=a`:host {
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
  padding-left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${t(i.spacer)}))) / 16) * 1rem);
}
.with-flag .label {
  left: calc(((10 * var(--gridSpacerVariant, var(--gridSpacer, ${t(i.spacer)}))) / 16) * 1rem);
}

.flag {
  display: inline-flex;
  align-items: center;
  position: absolute;
  height: 100%;
  margin: 0 calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(i.spacer)}))) / 16) * 1rem);
}
${h.mediaRules()}`;const u={dark:a`
    ${s.dark}
  `,light:a`
    ${s.light}
  `};class $ extends(l(r)){static get is(){return"bbva-form-text"}static get scopedElements(){return{"bbva-clip-flag":n,"bbva-button-icon":g,"bbva-core-icon":c,"bbva-text":o}}static get properties(){return{flagSize:{type:String,attribute:"flag-size"},flag:{type:String},flagIconset:{type:String,attribute:"flag-iconset"},flagLabel:{type:String,attribute:"flag-label"}}}constructor(){super(),this.type="text",this.flagSize="small",this.flagText=""}static get styles(){return[super.styles,d,u.light,u.dark,f("bbva-form-text-shared-styles")]}get field(){return b`
      <div
        class="field ${this.flag?"with-flag":""}"
        @focusin="${this._onFocusin}"
        @focusout="${this._onFocusout}"
      >
        ${this.flagBlock} ${this.labelledInput} ${this.clearButton}
      </div>
    `}get flagBlock(){return b`
      ${this.flag?b`
            <span class="flag">
              <bbva-clip-flag
                icon="${p(this.flag)}"
                .size="${this.flagSize}"
                iconset="${p(this.flagIconset)}"
              ></bbva-clip-flag>
            </span>
          `:""}
    `}get labelBlock(){return b`
      <span class="label" aria-hidden="true" @click="${this.focus}">${this.inputLabel}</span>
    `}get ariaInputLabel(){return`${this.label}${this.flagLabel?` - ${this.flagLabel}`:""}`}}export{$ as B,u as b};
