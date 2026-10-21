import{z as r,a8 as a,ab as e,ar as o,a9 as t,aa as i,au as n,bH as b,b1 as l,aJ as c,a as s,aS as d,an as g,aw as v,ag as m,F as f,bI as h,bJ as p,bK as y,aN as u,bx as $,ak as k,h as _,bL as T,bl as x}from"./952f98a9.js";import{B as S}from"./afb1d3bc.js";const L=new o;var w=r`:host {
  --_knob-width: var(--bbva-form-range-knob-size, var(--bbva-form-range-knob-width, 2rem));
  --_knob-height: var(--bbva-form-range-knob-size, var(--bbva-form-range-knob-height, 2rem));
  --_bar-height: var(--bbva-form-range-bar-height, 0.25rem);
  --_bar-surface: var(--bbva-form-range-bar-clickable-height, var(--_knob-height, 2rem));
  --_current-width: calc(100% - var(--_knob-width));
  --_bar-color: var(--bbva-form-range-bar-dark-mode-color, var(--bbva-form-range-bar-color, var(--colorsSecondary500, ${a(t.secondary500)})));
  --_bar-color-background: var(--bbva-form-range-bar-bg-dark-mode-color, var(--bbva-form-range-bar-bg-color, var(--colorsSecondary500, ${a(t.secondary500)})));
  --_bar-opacity: var(--bbva-form-range-bar-opacity, 1);
  --_active-bar-color: var(--bbva-form-range-active-bar-dark-mode-color, var(--bbva-form-range-active-bar-color, var(--colorsPrimaryCore, ${a(t.primaryCore)})));
  --_readonly-active-bar-color: var(--bbva-form-range-readonly-active-bar-dark-mode-color, var(--bbva-form-range-readonly-active-bar-color, var(--colorsSecondary300, ${a(t.secondary300)})));
  --_knob-color: var(--bbva-form-range-knob-dark-mode-color, var(--bbva-form-range-knob-color, var(--colorsPrimaryMedium, ${a(t.primaryMedium)})));
  --_form-range-knob-border-color: var(--bbva-form-range-knob-border-dark-mode-color, var(--bbva-form-range-knob-border-color, var(--colorsPrimaryCoreLightened, ${a(t.primaryCoreLightened)})));
  --_readonly-knob-color: var(--bbva-form-range-readonly-knob-dark-mode-color, var(--bbva-form-range-readonly-knob-color, var(--colorsSecondary500, ${a(t.secondary500)})));
  --_icon-color: var(--bbva-form-range-icon-dark-mode-color, var(--bbva-form-range-icon-color, var(--colorsPrimaryMedium, ${a(t.primaryMedium)})));
  --_readonly-icon-color: var(--bbva-form-range-readonly-icon-dark-mode-color, var(--bbva-form-range-readonly-icon-color, var(--colorsSecondary500, ${a(t.secondary500)})));
  --_knob-icon-color: var(--bbva-form-range-knob-icon-dark-mode-color, var(--bbva-form-range-knob-icon-color, var(--colorsPrimaryCoreLightened, ${a(t.primaryCoreLightened)})));
  --_knob-icon-opacity: var(--bbva-form-range-knob-icon-opacity, 1);
  --_form-range-bar-filled-background: var(--bbva-form-range-bar-filled-background-dark-mode-color, var(--bbva-form-range-bar-filled-background, var(--colorsSecondary500, ${a(t.secondary500)})));
  --bbva-text-color: var(--bbva-form-range-text-dark-mode-color, var(--bbva-form-range-text-color, var(--colorsSecondary600, ${a(t.secondary600)})));
  --bbva-amount-font-weight: var(--fontFacePrimaryMediumFontWeight, ${a(e.medium.fontWeight)});
  display: block;
  padding: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem) 0;
  box-sizing: border-box;
  position: relative;
  outline: none;
  overflow: hidden;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*::before,
*::after {
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

.content {
  display: flex;
}

.icon {
  flex: none;
  display: flex;
  align-items: center;
  height: var(--_knob-height);
  color: var(--_icon-color);
}
:host([aria-readonly=true]) .icon {
  color: var(--_readonly-icon-color);
}
.icon-left {
  margin-right: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}
.icon-right {
  margin-left: calc(((0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem);
}

.control {
  flex: auto;
  position: relative;
}

.container {
  position: relative;
  display: flex;
  justify-content: center;
  overflow: hidden;
}

.informational-title {
  display: flex;
  flex-direction: column;
  align-content: center;
  margin: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem) 0 calc(((3 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem) 0;
}

.amount {
  align-self: center;
}

.bar {
  position: absolute;
  top: 50%;
  left: 0;
  height: var(--_bar-surface);
  display: flex;
  align-items: center;
  width: 100%;
  overflow: hidden;
  transform: translateY(-50%);
}
.bar-filled {
  position: absolute;
  right: calc(100%);
  width: calc(100% - 0.125rem);
  height: var(--_bar-height);
  background-color: var(--_active-bar-color);
  top: calc(50% - (var(--_bar-height)/2));
}
:host([variant=informational-section]) .bar-filled, :host([variant=informational-slider]) .bar-filled {
  width: 100%;
}
:host([aria-readonly=true]) .bar-filled {
  background-color: var(--_readonly-active-bar-color);
}
:host([variant~=no-fill-bar]) .bar-filled {
  background-color: transparent;
}
.bar-filled::before {
  content: "";
  position: absolute;
  top: 0;
  width: calc(100% - 0.125rem);
  right: 100%;
  height: 100%;
  background: var(--_bar-color-background);
}
.bar::before {
  content: "";
  flex: auto;
  height: var(--_bar-height);
  width: calc(100% - 0.125rem);
  background: var(--_bar-color-background);
  opacity: var(--_bar-opacity);
}
.bar::after {
  content: "";
  flex: none;
  height: var(--_bar-height);
  width: 0.125rem;
  background-color: transparent;
  opacity: var(--_bar-opacity);
  border-style: solid;
  border-width: var(--_bar-height) 0.125rem 0 0;
  border-color: var(--_bar-color) transparent transparent transparent;
}

.current {
  position: relative;
  width: var(--_current-width);
}

.knob {
  width: var(--_knob-width);
  height: var(--_knob-height);
  border-radius: 50%;
  position: relative;
  background-color: var(--_knob-color);
  border: 0.125rem solid var(--_form-range-knob-border-color);
  transform: translateX(-50%);
  cursor: pointer;
}
:host([aria-readonly=true]) .knob {
  cursor: default;
  background-color: var(--_readonly-knob-color);
}
.knob-icon {
  position: absolute;
  background-color: var(--_knob-icon-color);
  opacity: var(--_knob-icon-opacity);
  width: 0.125rem;
  height: 0.5rem;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
.knob-icon::before {
  content: "";
  position: absolute;
  background-color: inherit;
  width: 0.125rem;
  height: 0.5rem;
  top: 0;
  right: 0.25rem;
}
.knob-icon::after {
  content: "";
  position: absolute;
  background-color: inherit;
  width: 0.125rem;
  height: 0.5rem;
  top: 0;
  left: 0.25rem;
}

.legend {
  display: flex;
  justify-content: space-between;
  margin: calc(((1 * var(--gridSpacerVariant, var(--gridSpacer, ${a(i.spacer)}))) / 16) * 1rem) 0 0;
}
.legend-item {
  display: block;
  min-width: var(--_knob-width);
  text-align: center;
}
${L.mediaRules()}`;const M=new o;var C=r`[ambient^=light] {
  --bbva-form-range-bar-color: initial;
  --bbva-form-range-bg-ambient-color: initial;
  --bbva-form-range-bar-opacity: initial;
  --bbva-form-range-active-bar-color: initial;
  --bbva-form-range-readonly-active-bar-color: initial;
  --bbva-form-range-knob-color: initial;
  --bbva-form-range-knob-border-color: initial;
  --bbva-form-range-readonly-knob-color: initial;
  --bbva-form-range-icon-color: initial;
  --bbva-form-range-readonly-icon-color: initial;
  --bbva-form-range-knob-icon-color: initial;
  --bbva-form-range-knob-icon-opacity: initial;
  --bbva-form-range-text-color: initial;
  --bbva-form-range-bar-filled-background: initial;
  --bbva-form-range-bg-bar-filled-color-step-0: initial;
  --bbva-form-range-bg-bar-filled-color-step-1: initial;
  --bbva-form-range-bg-bar-filled-color-step-2: initial;
  --bbva-form-range-bg-bar-filled-color-step-3: initial;
  --bbva-form-range-bg-bar-filled-color-step-4: initial;
}
${M.mediaRules()}`;const P=new o;var B=r`[ambient^=dark100] {
  --bbva-form-range-bar-color: var(--colorsSecondary100, ${a(t.secondary100)});
  --bbva-form-range-bg-ambient-color: var(--colorsSecondary100, ${a(t.secondary100)});
  --bbva-form-range-active-bar-color: var(--colorsPrimarySubduedLight, ${a(t.primarySubduedLight)});
  --bbva-form-range-readonly-active-bar-color: var(--colorsSecondary200, ${a(t.secondary200)});
  --bbva-form-range-knob-color: var(--colorsPrimaryCoreDarkened, ${a(t.primaryCoreDarkened)});
  --bbva-form-range-readonly-knob-color: var(--colorsSecondary200, ${a(t.secondary200)});
  --bbva-form-range-icon-color: var(--colorsPrimaryCoreLightened, ${a(t.primaryCoreLightened)});
  --bbva-form-range-readonly-icon-color: var(--colorsSecondary200, ${a(t.secondary200)});
  --bbva-form-range-knob-border-color: var(--colorsPrimaryMedium, ${a(t.primaryMedium)});
  --bbva-form-range-knob-icon-color: var(--colorsPrimaryCoreLightened, ${a(t.primaryCoreLightened)});
  --bbva-form-range-text-color: var(--colorsPrimaryCoreLightened, ${a(t.primaryCoreLightened)});
  --bbva-form-range-bg-bar-filled-color-step-0: var(--colorsTertiaryType1Lightened, ${a(t.tertiaryType1Lightened)});
  --bbva-form-range-bg-bar-filled-color-step-1: var(--colorsTertiaryType2Lightened, ${a(t.tertiaryType2Lightened)});
  --bbva-form-range-bg-bar-filled-color-step-2: var(--colorsTertiaryType3Lightened, ${a(t.tertiaryType3Lightened)});
  --bbva-form-range-bg-bar-filled-color-step-3: var(--colorsTertiaryType6Lightened, ${a(t.tertiaryType6Lightened)});
  --bbva-form-range-bg-bar-filled-color-step-4: var(--colorsTertiaryType6Lightened, ${a(t.tertiaryType6Lightened)});
}

[ambient^=dark400] {
  --bbva-form-range-bar-color: var(--colorsSecondary100, ${a(t.secondary100)});
  --bbva-form-range-bg-ambient-color: var(--colorsSecondary100, ${a(t.secondary100)});
  --bbva-form-range-active-bar-color: var(--colorsPrimarySubduedLight, ${a(t.primarySubduedLight)});
  --bbva-form-range-readonly-active-bar-color: var(--colorsSecondary200, ${a(t.secondary200)});
  --bbva-form-range-knob-color: var(--colorsPrimaryMedium, ${a(t.primaryMedium)});
  --bbva-form-range-readonly-knob-color: var(--colorsSecondary200, ${a(t.secondary200)});
  --bbva-form-range-icon-color: var(--colorsPrimarySubdued, ${a(t.primarySubdued)});
  --bbva-form-range-readonly-icon-color: var(--colorsSecondary200, ${a(t.secondary200)});
  --bbva-form-range-knob-border-color: var(--colorsPrimaryCoreDarkened, ${a(t.primaryCoreDarkened)});
  --bbva-form-range-knob-icon-color: var(--colorsPrimaryCoreLightened, ${a(t.primaryCoreLightened)});
  --bbva-form-range-text-color: var(--colorsPrimaryCoreLightened, ${a(t.primaryCoreLightened)});
  --bbva-form-range-bg-bar-filled-color-step-0: var(--colorsTertiaryType5, ${a(t.tertiaryType5)});
  --bbva-form-range-bg-bar-filled-color-step-1: var(--colorsTertiaryType2, ${a(t.tertiaryType2)});
  --bbva-form-range-bg-bar-filled-color-step-2: var(--colorsTertiaryType3, ${a(t.tertiaryType3)});
  --bbva-form-range-bg-bar-filled-color-step-3: var(--colorsTertiaryType6Light, ${a(t.tertiaryType6Light)});
  --bbva-form-range-bg-bar-filled-color-step-4: var(--colorsTertiaryType6, ${a(t.tertiaryType6)});
}
${P.mediaRules()}`;const z={dark:r`
    ${B}
    ${n.dark}
    ${b.dark}
    ${l.dark}
  `,light:r`
    ${C}
    ${n.light}
    ${b.light}
    ${l.light}
  `},A=[t.tertiaryType5Medium,t.tertiaryType2Medium,t.tertiaryType3Dark,t.tertiaryType6Medium,t.tertiaryType6Dark],D=[{name:"*",colors:[`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-0, var(--bbva-form-range-bg-bar-filled-color-step-0, ${t.tertiaryType5Medium}))`,`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-1, var(--bbva-form-range-bg-bar-filled-color-step-1, ${t.tertiaryType2Medium}))`,`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-2, var(--bbva-form-range-bg-bar-filled-color-step-2, ${t.tertiaryType3Dark}))`,`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-3, var(--bbva-form-range-bg-bar-filled-color-step-3, ${t.tertiaryType6Medium}))`,`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-4, var(--bbva-form-range-bg-bar-filled-color-step-4, ${t.tertiaryType6Dark}))`]},{name:"dark100",colors:[`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-0, var(--bbva-form-range-bg-bar-filled-color-step-0, ${t.tertiaryType1Lightened}))`,`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-1, var(--bbva-form-range-bg-bar-filled-color-step-1, ${t.tertiaryType2Lightened}))`,`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-2, var(--bbva-form-range-bg-bar-filled-color-step-2, ${t.tertiaryType3Lightened}))`,`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-3, var(--bbva-form-range-bg-bar-filled-color-step-3, ${t.tertiaryType6Lightened}))`,`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-4, var(--bbva-form-range-bg-bar-filled-color-step-4, ${t.tertiaryType6Lightened}))`]},{name:"dark400",colors:[`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-0, var(--bbva-form-range-bg-bar-filled-color-step-0, ${t.tertiaryType5}))`,`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-1, var(--bbva-form-range-bg-bar-filled-color-step-1, ${t.tertiaryType2}))`,`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-2, var(--bbva-form-range-bg-bar-filled-color-step-2, ${t.tertiaryType3}))`,`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-3, var(--bbva-form-range-bg-bar-filled-color-step-3, ${t.tertiaryType6Light}))`,`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-4, var(--bbva-form-range-bg-bar-filled-color-step-4, ${t.tertiaryType6}))`]}],E=t.secondary500,R=A.length,V={slider:"informational-slider",section:"informational-section"};class j extends(c(s(d(g(S))))){static get is(){return"bbva-form-range"}static get scopedElements(){return{"bbva-amount":v,"bbva-text":m,"bbva-icon":f,"bbva-notification-help":h}}static get properties(){return{showLabels:{type:Boolean,attribute:"show-labels"},showIcons:{type:Boolean,attribute:"show-icons"},iconSize:{type:Number,attribute:"icon-size"},iconLeft:{type:String,attribute:"icon-left"},iconRight:{type:String,attribute:"icon-right"},items:{type:Array},itemLabels:{type:Array,attribute:"item-labels"},variant:{type:String},informationalTitle:{type:String,attribute:"informational-title"},decimalsHidden:{type:Boolean,attribute:"decimals-hidden"},hasError:{type:Boolean,attribute:"has-error",reflect:!0},errorMessage:{type:String,attribute:"error-message"}}}constructor(){super(),this.iconSize=16,this.iconLeft=p(),this.iconRight=y(),this.iconError=u(),this.variant="",this.informationalTitle="",this.decimalsHidden=!1,this.hasError=!1,this.errorMessage="Error!",this.disabledTabindex=!0}get _items(){if(this.items)return this.items;const r=Math.round((this.max-this.min)/this.step)+1;return[...Array(r)].map(((r,a)=>Math.ceil(this.min+a*this.step)))}get _percent(){return`${Math.round(100*this._ratio)}%`}update(r){if((r.has("min")||r.has("max"))&&this.variant===V.section){const r=this.max-this.min>=R;this.step=r?(this.max-this.min)/R:1;const a=[...Array(r?4:this.max-this.min-1)].map(((r,a)=>Math.round((a+1)*this.step+this.min)));this.items=[this.min,...a,this.max]}this._items.length>0&&this.setAttribute("aria-label",this._minMaxValues()),super.update(r)}updated(r){super.updated(r),(r.has("items")||r.has("value"))&&(this.showLabels||this.informationalTitle?this.setAttribute("aria-valuetext",this._valueText()):this.removeAttribute("aria-valuetext"))}_valueText(){return`\n      ${[this.informationalTitle,this._value,this.informationalTitle?this.currencyCode:""].filter((r=>!!r)).join(" ")}\n    `}_minMaxValues(){return this.t("bbva-form-range-value-min-max",{min:this._items[0],max:this._items[this._items.length-1]})}_calcStep(r){let a=super._calcStep(r);return this.variant===V.section&&(a=Math.round(a),this.items.includes(a)||(a=this.items.reduce(((r,e)=>Math.abs(e-a)<Math.abs(r-a)?e:r)))),a}_clickSlotBefore(){this.value-=this.step}_clickSlotAfter(){this.value+=this.step}static get styles(){return[$(".knob"),super.styles,w,k("bbva-form-range-shared-styles"),z.dark,z.light]}get _getTitleInformational(){return this.variant&&this.informationalTitle?_`
          <div class="informational-title">
            <bbva-text
              unset
              size="S"
              ellipsis
              lines="1"
              text="${this.informationalTitle}"
              alignment="center"
            ></bbva-text>
            <bbva-amount
              class="amount"
              ?decimals-hidden="${this.decimalsHidden}"
              variant="l"
              ellipsis
              lines="1"
              .amount="${this.value}"
              .currencyCode="${this.currencyCode}"
              .localCurrency="${this.localCurrency}"
              .language="${this.language}"
            >
            </bbva-amount>
          </div>
        `:""}getBackground(e=!0,o=!1){let i="";const{colors:n}=D[0];if(this.variant===V.slider)return{backgroundColor:n[Math.trunc(this.value/((this.max-this.min)/R))]};const b=100/(this.items?this.items.length-1:1),l=this.items?this.items.indexOf(this.value):this.value,c=Array.isArray(this.items)?this.items.length:l,s=e?l:c,d=this.items?s:0;if(d<=1)if(o)i=`${n[0]}, ${n[0]}`;else{const r=`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-0, var(--bbva-form-range-bg-bar-filled-color-step-0, ${n[0]}))`;i=`${r}, ${r}`}else{for(let r=0;r<d;r+=1){const a=b*(this.items.length-d+r-1);let t=e?n[r]:E;if(o)t=`var(--bbva-form-range-bg-ambient-dark-mode-color, var(--bbva-form-range-bg-ambient-color, ${t}))`;else{t=`var(--bbva-form-range-bg-bar-filled-dark-mode-color-step-${r}, var(${`--bbva-form-range-bg-bar-filled-color-step-${r}`}, ${t}))`}r>0&&0!==a&&(i+=`, transparent calc(${a}% - 2px) , transparent ${a}% `),r===d-1?i+=`, ${t} ${a}%`:r>0?(i+=""!==i?",":"",i+=`${t} ${a}%, ${t} calc(${a+b}% - 2px)`):a+b>0&&(i+=`${t} calc(${a+b}% - 2px)`)}T(r`
        * {
          ${a("--bbva-form-range-bg-bar-filled-color-step-0")}: ${a(t.tertiaryType5Medium)};
          ${a("--bbva-form-range-bg-bar-filled-color-step-1")}: ${a(t.tertiaryType2Medium)};
          ${a("--bbva-form-range-bg-bar-filled-color-step-2")}: ${a(t.tertiaryType3Dark)};
          ${a("--bbva-form-range-bg-bar-filled-color-step-3")}: ${a(t.tertiaryType6Medium)};
          ${a("--bbva-form-range-bg-bar-filled-color-step-4")}: ${a(t.tertiaryType6Dark)};
        }

        [ambient^='dark100'] * {
          ${a("--bbva-form-range-bg-bar-filled-color-step-0")}: ${a(t.tertiaryType1Lightened)};
          ${a("--bbva-form-range-bg-bar-filled-color-step-1")}: ${a(t.tertiaryType2Lightened)};
          ${a("--bbva-form-range-bg-bar-filled-color-step-2")}: ${a(t.tertiaryType3Lightened)};
          ${a("--bbva-form-range-bg-bar-filled-color-step-3")}: ${a(t.tertiaryType6Lightened)};
          ${a("--bbva-form-range-bg-bar-filled-color-step-4")}: ${a(t.tertiaryType6Lightened)};
        }

        [ambient^='dark400'] * {
          ${a("--bbva-form-range-bg-bar-filled-color-step-0")}: ${a(t.tertiaryType5)};
          ${a("--bbva-form-range-bg-bar-filled-color-step-1")}: ${a(t.tertiaryType2)};
          ${a("--bbva-form-range-bg-bar-filled-color-step-2")}: ${a(t.tertiaryType3)};
          ${a("--bbva-form-range-bg-bar-filled-color-step-3")}: ${a(t.tertiaryType6Light)};
          ${a("--bbva-form-range-bg-bar-filled-color-step-4")}: ${a(t.tertiaryType6)};
        }
      `)}return{background:`linear-gradient(115deg , ${i})`}}get _barBlock(){let r={transform:`translateX(calc(${this._percent} - 2px))`},a=`var(--bbva-form-range-bg-ambient-dark-mode-color, var(--bbva-form-range-bg-ambient-color, ${E}))`;if(Object.values(V).includes(this.variant)){r={...r,...this.getBackground()};const{background:e}=this.getBackground(!1,!0);a=e||a}return _`
      <div class="bar" style="--_bar-color-background: ${a}">
        <div class="bar-filled" aria-hidden="true" style=${x(r)}></div>
      </div>
    `}get _knobContent(){return _` <span class="knob-icon"></span> `}get _legendBlock(){return this.showLabels?_`
          <div class="legend">
            ${(this.itemLabels||this._items).map((r=>_`
                <bbva-text unset class="legend-item" text="${r}" size="XS"></bbva-text>
              `))}
          </div>
        `:""}get _slotBefore(){return _`
      <slot name="before">
        ${this.iconLeft&&this.showIcons?_`
              <div class="icon icon-left">
                <bbva-icon
                  .icon="${this.iconLeft}"
                  .size="${this.iconSize}"
                  @click=${this._clickSlotBefore}
                ></bbva-icon>
              </div>
            `:""}
      </slot>
    `}get _slotAfter(){return _`
      <slot name="after">
        ${this.iconRight&&this.showIcons?_`
              <div class="icon icon-right">
                <bbva-icon
                  .icon="${this.iconRight}"
                  .size="${this.iconSize}"
                  @click=${this._clickSlotAfter}
                ></bbva-icon>
              </div>
            `:""}
      </slot>
    `}get _errorMessage(){return this.hasError?_`
          <bbva-notification-help
            class="alert"
            accessibility-label-icon="Error"
            icon=${this.iconError}
            icon-size="16"
            text="${this.errorMessage}"
            hide-left-padding
          >
          </bbva-notification-help>
        `:""}render(){return _`
      ${this._getTitleInformational}
      <div class="content">
        ${this._slotBefore}
        <div class="control">${this._controlBlock} ${this._legendBlock}</div>
        ${this._slotAfter}
      </div>
      ${this._errorMessage} ${this._input}
    `}}export{j as B,z as b};
