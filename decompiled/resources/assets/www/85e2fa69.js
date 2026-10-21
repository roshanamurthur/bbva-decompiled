import{z as a,a8 as r,ab as t,a9 as e,aI as i,aa as o,au as s,b1 as l,a as n,an as b,aJ as d,aS as c,L as v,aw as u,ag as m,ak as g,h,i as p,bl as y,aV as k,av as z}from"./952f98a9.js";var $=a`:host {
  display: block;
  box-sizing: border-box;
  position: relative;
  width: var(--bbva-data-visualization-bar-width, 100%);
  justify-content: center;
  font-weight: var(--fontFacePrimaryBookFontWeight, ${r(t.book.fontWeight)});
  z-index: var(--_data-visualization-bar-z-index);
  --_data-visualization-bar-color-color: var(--bbva-data-visualization-bar-dark-mode-color, var(--bbva-data-visualization-bar-color, var(--colorsPrimaryCoreLight, ${r(e.primaryCoreLight)})));
  --_data-visualization-bar-bg-color: var(--bbva-data-visualization-bar-dark-mode-bg-color, var(--bbva-data-visualization-bar-bg-color, var(--colorsSecondary200, ${r(e.secondary200)})));
  --_data-visualization-bar-mark-color: var(--bbva-data-visualization-bar-dark-mode-mark-color, var(--bbva-data-visualization-bar-mark-color, var(--colorsPrimaryCoreLightened, ${r(e.primaryCoreLightened)})));
  --_data-visualization-bar-mark-middle-color: var(--bbva-data-visualization-bar-dark-mode-mark-middle-color, var(--bbva-data-visualization-bar-mark-middle-color, var(--colorsPrimaryCore, ${r(e.primaryCore)})));
  --_data-visualization-bar-symbol-area-color: var(--bbva-data-visualization-bar-dark-mode-symbol-area-color, var(--bbva-data-visualization-bar-symbol-area-color, var(--colorsSecondary600, ${r(e.secondary600)})));
  --_z-index: var(--bbva-data-visualization-bar-mark-z-index, 1);
  --_skeleton-quote-color: var(--bbva-data-visualization-bar-skeleton-dark-mode-color, var(--bbva-data-visualization-bar-skeleton-color, var(--colorsSecondary200, ${r(e.secondary200)})));
  --_skeleton-quote-bg: var(--bbva-data-visualization-bar-skeleton-bg-dark-mode-color, var(--bbva-data-visualization-bar-skeleton-bg, transparent));
  --_skeleton-animated-layer-bg: var(--bbva-data-visualization-bar-dark-mode-skeleton-animated-layer-bg, var(--bbva-data-visualization-bar-skeleton-animated-layer-bg, var(--ambientsLight, ${r(i.light)})));
  --_data-visualization-bar-z-index: var(--bbva-data-visualization-bar-z-index, 0);
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

.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.header-title {
  display: flex;
  align-items: center;
  overflow: hidden;
  padding-right: calc(((2 * var(--gridSpacerVariant, var(--gridSpacer, ${r(o.spacer)}))) / 16) * 1em);
}
.header-title .header-text {
  margin: 0;
  padding: 0;
  border: none;
  overflow: hidden;
  background: none;
}
.header-title .title-medium {
  font-style: var(--fontFacePrimaryMediumFontStyle, ${r(t.medium.fontStyle)});
  font-weight: var(--fontFacePrimaryMediumFontWeight, ${r(t.medium.fontWeight)});
}

.progress-bar,
.progress-bar-any-colors {
  display: block;
  position: relative;
  overflow: hidden;
  background-color: var(--_data-visualization-bar-bg-color);
  transform: skew(-27deg);
  height: var(--bbva-data-visualization-bar-height, 0.75rem);
  z-index: var(--bbva-z-index-back-layer, 1);
}

.progress-bar-fill {
  display: block;
  width: 100%;
  height: var(--bbva-data-visualization-bar-height, 0.75rem);
  background-color: var(--_data-visualization-bar-color-color);
  will-change: transform;
  transition: transform var(--bbva-fast-transition, 0.2s) ease-in-out;
}

.progress-bar-any-colors {
  display: flex;
  align-items: center;
}
.progress-bar-any-colors > * {
  display: block;
  height: var(--bbva-data-visualization-bar-height, 0.75rem);
}

.shadow {
  display: block;
  position: relative;
  bottom: calc(var(--bbva-global-spacer, 6px) * 1);
  left: calc(var(--bbva-data-visualization-bar-height, 0.75rem) / 2 * -1);
  width: 100%;
  height: calc(var(--bbva-data-visualization-bar-height, 0.75rem/2));
  background: linear-gradient(to bottom, rgba(0, 0, 0, 0) 0%, rgba(0, 0, 0, 0.4) 100%);
  transform: skew(50deg);
}

.mark {
  display: block;
  position: absolute;
  width: 0.125rem;
  height: var(--bbva-data-visualization-bar-height, 0.75rem);
  background-color: var(--_data-visualization-bar-mark-color);
  will-change: transform;
  transform: skew(-27deg);
  top: 0;
  bottom: 0;
  z-index: var(--_z-index);
}

.middle {
  background-color: var(--_data-visualization-bar-mark-middle-color);
  width: 0.25rem;
}

:host([loading]) {
  overflow: hidden;
  pointer-events: none;
  background-repeat: no-repeat;
  opacity: 1;
  height: 2rem;
  background-image: linear-gradient(-60deg, var(--_skeleton-quote-color) 50%, transparent 50%), linear-gradient(-60deg, transparent 50%, var(--_skeleton-quote-color) 50%);
  background-color: var(--_skeleton-quote-bg);
  background-size: calc((0.5% * 2) + (16px/ 2)) 16px, calc((91% * 2) + (16px/ 2)) 16px;
  background-position: 8px 8px, 18px 8px;
}
:host([loading]) .skeleton {
  contain: strict;
  position: absolute;
  inset: 0 0.00625rem;
  background: var(--_skeleton-animated-layer-bg);
  opacity: 0.5;
  transform: translateX(200%) scaleX(1);
  transform-origin: right bottom;
  animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
}

.symbol-area {
  color: var(--_data-visualization-bar-symbol-area-color);
}

@keyframes skeletonAnimation {
  from {
    opacity: 0.5;
  }
  50% {
    opacity: 0.6;
  }
  60% {
    opacity: 0.6;
  }
  70% {
    opacity: 0.3;
  }
  90% {
    opacity: 0.1;
  }
  100% {
    transform: translateX(0%) scaleX(2);
    opacity: 0;
  }
}
`,x=a`[ambient^=light] {
  --bbva-data-visualization-bar-progress-color: initial;
  --bbva-data-visualization-bar-bg-color: initial;
  --bbva-data-visualization-bar-mark-color: initial;
  --bbva-data-visualization-bar-mark-middle-color: initial;
  --bbva-data-visualization-bar-skeleton-color: initial;
  --bbva-data-visualization-bar-skeleton-bg: initial;
  --bbva-data-visualization-bar-skeleton-animated-layer-bg: initial;
  --bbva-data-visualization-bar-symbol-area-color: initial;
}
`,f=a`[ambient^=dark400] {
  --bbva-data-visualization-bar-bg-color: var(--colorsPrimaryCoreLightened, ${r(e.primaryCoreLightened)});
  --bbva-data-visualization-bar-mark-color: var(--colorsPrimaryCoreDark, ${r(e.primaryCoreDark)});
  --bbva-data-visualization-bar-mark-middle-color: var(--colorsPrimaryCoreLightened, ${r(e.primaryCoreLightened)});
  --bbva-data-visualization-bar-skeleton-color: var(--colorsPrimaryCoreDark, ${r(e.primaryCoreDark)});
  --bbva-data-visualization-bar-skeleton-bg: transparent;
  --bbva-data-visualization-bar-skeleton-animated-layer-bg: var(--colorsPrimaryCoreDarkened, ${r(e.primaryCoreDarkened)});
  --bbva-data-visualization-bar-symbol-area-color: var(--colorsPrimaryCoreLightened, ${r(e.primaryCoreLightened)});
}
`;const _={dark:a`
    ${s.dark}
    ${l.dark}
    ${f}
  `,light:a`
    ${s.light}
    ${l.light}
    ${x}
  `};class C extends(n(b(d(c(v))))){static get is(){return"bbva-data-visualization-bar"}static get scopedElements(){return{"bbva-amount":u,"bbva-text":m}}static get properties(){return{accessibilityText:{type:String,attribute:"accessibility-text"},maxValue:{type:Number,attribute:"max-value"},currentValue:{type:Number,attribute:"current-value"},markValue:{type:Number,attribute:"mark-value"},bgColor:{type:String},barValues:{type:Array},barAnyColors:{type:Boolean,attribute:"bar-any-colors"},progressBgColor:{type:String,attribute:"progress-bg-color"},fillColor:{type:String,attribute:"fill-color"},label:{type:String},titleMedium:{type:Boolean,attribute:"title-medium",reflect:!0},loading:{type:Boolean,reflect:!0},headingLevel:{type:String},symbol:{type:String},_percentage:{type:String,state:!0}}}constructor(){super(),this.maxValue=100,this.currentValue=0,this.barAnyColors=!1,this.bgColor="",this.markValue=null,this.progressBgColor="",this.titleMedium=!1,this.loading=!1,this.headingLevel="h3",this.symbol="",this._percentage="%"}static get styles(){return[super.styles,$,_.light,_.dark,g("bbva-data-visualization-bar-shared-styles")]}get _calcPercentage(){return this.currentValue>this.maxValue?100:Math.floor(100*this.currentValue/this.maxValue)}get _symbolValue(){return this.symbol!==this._percentage?this.currentValue:this._calcPercentage}static get _shadow(){return h` <span class="shadow"></span> `}get _barAnyColors(){return h`
      ${this.barValues.length<=6?h`
            ${this.barValues.map((a=>h`
                  <span
                    aria-label="${p(this.t(a.accessibilityLabel))}"
                    class="progress-bar-any-colors-item"
                    role="progressbar"
                    style="${y({width:`${a.currentValue}%`,backgroundColor:a.bgColor})}"
                    aria-valuemin="0"
                    aria-valuemax="${this.maxValue}"
                    aria-valuenow="${p(a.currentValue)}"
                  >
                  </span>
                `))}
          `:k}
    `}get _amount(){return this.amount||0===parseInt(this.amount)?h` <bbva-amount
          variant="l"
          .localCurrency="${this.localCurrency}"
          .amount="${this.amount}"
          .currencyCode="${this.currencyCode}"
          .language="${this.language}"
        >
        </bbva-amount>`:""}get _symbol(){return h` <bbva-amount
      class="symbol-area"
      variant="l"
      .amount="${this._symbolValue}"
      .symbol="${this.symbol}"
      decimals-hidden
    >
    </bbva-amount>`}get _value(){return this.symbol?this._symbol:this._amount}static _textHeader({type:a,ellipsis:r,tag:t,text:e}){return h`
      <bbva-text
        unset
        ?ellipsis="${r}"
        class="header-text ${a}"
        .tag="${t}"
        size="S"
        .text="${e}"
      >
      </bbva-text>
    `}get _heading(){return this.label?h` <div class="header-title">
          ${h`
            ${C._textHeader({type:z({"title-medium":this.titleMedium}),ellipsis:!0,tag:this.headingLevel,text:this.t(this.label)})}
          `}
        </div>`:""}get _mark(){return h`
      <span class="mark" style="${y({left:`calc(${this.markValue} * 1%)`})}"></span>
      <span
        class="mark middle"
        style="${y({left:`calc((${this.markValue} * 1%) + 2px`})}"
      ></span>
      <span
        class="mark"
        style="${y({left:`calc((${this.markValue} * 1%) + 5px`})}"
      ></span>
    `}get _dataViualitationBar(){return h`
      ${this.barAnyColors?h`
            <span
              role="progressbar"
              class="progress-bar-any-colors"
              aria-label="${p(this.t(this.accessibilityText))}"
            >
              ${this._barAnyColors}
            </span>
          `:h`
            <span
              class="progress-bar"
              role="progressbar"
              aria-valuemin="0"
              aria-valuemax="${this.maxValue}"
              aria-valuenow="${p(Math.floor(this.currentValue))}"
              aria-label="${p(this.accessibilityText)}"
            >
              <span
                class="progress-bar-fill"
                aria-hidden="true"
                style="${y({transform:`translateX(calc((100 - ${this._calcPercentage}) * -1%)) translateZ(0.01px)`,backgroundColor:null==this?void 0:this.fillColor})}"
              >
              </span>
            </span>
          `}
      ${this.markValue?this._mark:""} ${this.constructor._shadow}
    `}updated(a){super.updated(a),a.has("progressBgColor")&&this.style.setProperty("--bbva-data-visualization-bar-bg-color",`${this.progressBgColor}`)}render(){return this.loading?h`<div class="skeleton"></div>`:h`
          <div class="header">${this._heading}${this._value}</div>
          <div>${this._dataViualitationBar}</div>
        `}}export{C as B,_ as b};
