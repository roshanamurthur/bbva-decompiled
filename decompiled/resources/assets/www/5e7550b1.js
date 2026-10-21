import{z as r,a8 as a,ar as e,a9 as t,aa as i,a as o,L as n,ak as d,h as c,g as s,bf as l}from"./952f98a9.js";const p=new e;var g=r`[divider] {
  box-sizing: border-box;
}
[divider]::after {
  content: "";
  position: absolute;
  left: 0;
  right: 0;
  top: 100%;
}

hr[divider],
[divider]::after {
  margin: 0;
  border: none;
  display: block;
  height: 1px;
  background-color: var(--bbva-divider-dark-mode-color, var(--bbva-divider-color, var(--colorsSecondary300, ${a(t.secondary300)})));
  opacity: var(--bbva-divider-opacity, 1);
}

hr[divider]::after {
  display: none;
}

hr[divider=fit],
[divider=fit]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  margin-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

hr[divider=indented],
[divider=indented]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

hr[divider=small],
[divider=small]::after {
  margin-left: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

hr[divider~=center][divider~=small],
[divider~=center][divider~=small]::after {
  margin-right: auto;
  margin-left: auto;
  width: calc(((5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

hr[divider=bold] {
  margin-bottom: 0;
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

[divider=bold] {
  margin-bottom: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}
[divider=bold]::after {
  height: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}
${p.mediaRules()}`;const v=new e;var b=r`[ambient^=light] {
  --bbva-divider-color: var(--colorsSecondary300, ${a(t.secondary300)});
}
${v.mediaRules()}`;const h=new e;const m={dark:r`
    ${r`[ambient^=dark] {
  --bbva-divider-color: var(--colorsSecondary300, ${a(t.secondary300)});
}
${h.mediaRules()}`}
  `,light:r`
    ${b}
  `};class u extends(o(n)){static get is(){return"bbva-divider"}static get properties(){return{size:{type:String}}}constructor(){super(),this.size="full"}firstUpdated(){this.setAttribute("aria-hidden",!0)}static get styles(){return[g,m.light,m.dark,d("bbva-divider-shared-styles")]}render(){return c` <hr divider="${this.size}" /> `}}s("colors.cool40");var y=r`[ambient^=light] {
  --bbva-panel-container-separator-color: initial;
}
[ambient^=light]:not([panel-color]):not([url-image]) {
  --bbva-panel-container-background-color: var(--colorsPrimaryCoreLightened, ${a(t.primaryCoreLightened)});
}

:root:not([color-scheme-dark]) [ambient] > [ambient] {
  background-color: unset;
}
`;const f={dark:r`
    ${r`[ambient^=dark] {
  --bbva-panel-container-separator-color: var(--colorsPrimaryCoreLightened, ${a(t.primaryCoreLightened)});
}
[ambient^=dark]:not([panel-color]):not([url-image]) {
  --bbva-panel-container-background-color: var(--colorsPrimaryCoreDark, ${a(t.primaryCoreDark)});
}

:root:not([color-scheme-dark]) [ambient] > [ambient] {
  background-color: unset;
}
`}
    ${m.dark}
  `,light:r`
    ${y}
    ${m.light}
  `};var k=r`:host {
  box-sizing: border-box;
  position: relative;
  width: 100%;
  --_panel-container-separator-color: var(--bbva-panel-container-dark-mode-separator-color, var(--bbva-panel-container-separator-color, var(--colorsSecondary300, ${a(t.secondary300)})));
  --_panel-container-background-color: var(--bbva-panel-container-dark-mode-background-color, var(--bbva-panel-container-background-color, transparent));
}

:host([corner]) {
  display: flex;
}

:host([variant=card]) {
  display: flex;
  overflow: auto;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.container {
  display: grid;
  width: 100%;
  grid-template-columns: repeat(var(--bbva-panel-container-columns, 1), 1fr);
  grid-template-rows: 1fr;
  grid-column-gap: 0;
  grid-row-gap: 0;
  grid-auto-columns: 1fr;
}

:host([variant=card]) .container {
  grid-column-gap: 16px;
}
:host([variant=card]) .container > :nth-child(n) {
  box-shadow: var(--bbva-panel-container-box-shadow, var(--boxShadowType1, ${a(l.type1)}));
  margin: calc(((0.25 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

:host(:not([url-image])) .container > :nth-child(n) {
  background-color: var(--_panel-container-background-color);
}

:host([separator]:not([variant=card]):not([corner])) > .container :not(:first-child) {
  border-left: 0.0625rem solid var(--_panel-container-separator-color);
}

:host([url-image][variant=card]) .container :nth-child(n), :host([url-image]:not([variant=card])) .container {
  position: relative;
  inset: 0;
  background: linear-gradient(rgba(7, 37, 70, 0.3) 0%, rgba(7, 37, 70, 0.3) 100%), var(--bbva-panel-container-background-image) no-repeat;
  background-position: var(--bbva-panel-container-background-position, center);
  background-size: var(--bbva-panel-container-background-size, cover);
}

.content0 {
  grid-area: 1/1/2/2;
}

.content1 {
  grid-area: 1/2/2/3;
}

.content2 {
  grid-area: 1/3/2/4;
}

.content3 {
  grid-area: 1/4/2/5;
}

.content4 {
  grid-area: 1/5/2/6;
}

.triangle {
  display: block;
  height: 0;
  width: 0;
  position: absolute;
  border: 0.5rem solid transparent;
  border-top-color: var(--_panel-container-background-color);
}

:host([corner=bottom]) .triangle {
  bottom: -16px;
  left: calc(50% - 8px);
}

:host([corner=bottom-right]) .triangle {
  bottom: -8px;
  right: -8px;
  transform: rotate(225deg);
}

:host([corner=bottom-left]) .triangle {
  bottom: -8px;
  left: -8px;
  transform: rotate(-225deg);
}

:host([corner=top]) .triangle {
  top: -16px;
  left: calc(50% - 8px);
  transform: rotate(180deg);
}

:host([corner=top-left]) .triangle {
  top: -8px;
  left: -8px;
  transform: rotate(45deg);
}

:host([corner=top-right]) .triangle {
  top: -8px;
  right: -8px;
  transform: rotate(-45deg);
}
`;class $ extends(o(n)){static get is(){return"bbva-panel-container"}static get scopedElements(){return{"bbva-divider":u}}static get properties(){return{variant:{type:String},corner:{type:String},panelColor:{type:String,attribute:"panel-color"},urlImage:{type:String,attribute:"url-image"},dividerSize:{type:String,attribute:"divider-size"},_numItems:{type:String},_children:{state:!0,type:Object}}}constructor(){super(),this.variant="full",this._children=[],this._numItems=1,this.dividerSize="",this.corner="",this.panelColor="",this.urlImage=""}firstUpdated(){this._children=Array.from(this.children),this._numItems=this._children.length,this.style.setProperty("--bbva-panel-container-columns",this._numItems),""!==this.panelColor&&""===this.urlImage&&this.style.setProperty("--bbva-panel-container-background-color",this.panelColor),""!==this.urlImage&&this.style.setProperty("--bbva-panel-container-background-image",`url(${this.urlImage})`)}static get styles(){return[k,f.light,f.dark,d("bbva-panel-container-shared-styles")]}get content(){return c` <div class="container">
        ${this._children.map(((r,a)=>c` <div class="content${a}">${r}</div>`))}
      </div>
      ${""!==this.dividerSize?c`<bbva-divider size="${this.dividerSize}"></bbva-divider>`:""}
      ${this.corner?c`</div>`:""}`}render(){return c` ${this.corner&&"card"!==this.variant?c`<div class="triangle"></div>`:""}
    ${this.content}`}}export{$ as B,f as b};
